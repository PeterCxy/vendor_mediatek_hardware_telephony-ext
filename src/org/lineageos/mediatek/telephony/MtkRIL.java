package org.lineageos.mediatek.telephony;

import android.content.Context;
import android.net.LinkProperties;
import android.os.Handler;
import android.os.HwBinder;
import android.os.Message;
import android.os.RemoteException;
import android.os.WorkSource;
import android.telephony.Rlog;
import android.telephony.data.DataProfile;

import android.hardware.radio.V1_0.IRadio;

import com.android.internal.telephony.RadioIndication;
import com.android.internal.telephony.RadioResponse;
import com.android.internal.telephony.RIL;
import com.android.internal.telephony.RILRequest;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicLong;

public class MtkRIL extends RIL {
    private static final String LOG_TAG = "MtkRIL";
    static final String[] HIDL_SERVICE_NAME = {"slot1", "slot2", "slot3"};

    vendor.mediatek.hardware.radio.V3_0.IRadioIndication mMtkRadioIndication3;
    vendor.mediatek.hardware.radio.V3_0.IRadioResponse mMtkRadioResponse3;
    volatile vendor.mediatek.hardware.radio.V3_0.IRadio mMtkRadioProxy3 = null;
    final AtomicLong mMtkRadioProxyCookie = new AtomicLong(0);
    final Handler mMtkRilHandler = new MtkRilHandler();
    final MtkRadioProxyDeathRecipient mMtkRadioProxyDeathRecipient = new MtkRadioProxyDeathRecipient();

    private Integer mMtkPhoneId;

    public MtkRIL(Context context, int preferredNetworkType, int cdmaSubscription) {
        this(context, preferredNetworkType, cdmaSubscription, null);
    }

    public MtkRIL(Context context, int preferredNetworkType,
            int cdmaSubscription, Integer instanceId) {
        super(context, preferredNetworkType, cdmaSubscription, instanceId);
        mMtkPhoneId = instanceId == null ? 0 : instanceId;
        getRadioProxyMtk3(); // Make sure our MTK RadioProxy is loaded
        riljLogMtk("MTK RIL extension loaded");
    }

    @Override
    public synchronized IRadio getRadioProxy(Message result) {
        IRadio radioProxy = super.getRadioProxy(result);
        if (radioProxy != null) {
            // Make sure we always connect to Mtk RadioProxy
            // The first call to this function is made in super(),
            // during which we haven't initialized yet. Corresponding
            // checks are placed in getRadioProxyMtk()
            getRadioProxyMtk3();
        }
        return radioProxy;
    }

    public synchronized vendor.mediatek.hardware.radio.V3_0.IRadio getRadioProxyMtk3() {
        if (mMtkRadioProxy3 == null && mMtkPhoneId != null && mMtkRadioProxyCookie != null) {
            try {
                mMtkRadioProxy3 =
                    vendor.mediatek.hardware.radio.V3_0.IRadio.getService(
                        HIDL_SERVICE_NAME[mMtkPhoneId]);
                if (mMtkRadioProxy3 != null) {
                    mMtkRadioProxy3.linkToDeath(mMtkRadioProxyDeathRecipient,
                        mMtkRadioProxyCookie.incrementAndGet());
                    if (mMtkRadioResponse3 == null && mMtkRadioIndication3 == null) {
                        mMtkRadioResponse3 = new MtkRadioResponse3(this, getRadioResponse());
                        mMtkRadioIndication3 = new MtkRadioIndication3(this, getRadioIndication());
                    }
                    mMtkRadioProxy3.setResponseFunctionsMtk(mMtkRadioResponse3, mMtkRadioIndication3);
                    return mMtkRadioProxy3;
                }
            } catch (RemoteException e) {
                riljLogMtk("MTK RadioProxy 3.0 is not available");
                return null;
            }
        }
        return mMtkRadioProxy3;
    }

    @Override
    public void setupDataCall(int accessNetworkType, DataProfile dataProfile, boolean isRoaming,
                              boolean allowRoaming, int reason, LinkProperties linkProperties,
                              Message result) {
        riljLogMtk("Forcing setDataAllowed() before setupDataCall()");
        setDataAllowed(true, null);
        super.setupDataCall(accessNetworkType, dataProfile, isRoaming, allowRoaming, reason,
            linkProperties, result);
    }

    void resetRadioProxyMtk() {
        riljLogMtk("MTK RadioProxy died; retrying");
        mMtkRadioProxy3 = null;
        mMtkRadioProxyCookie.incrementAndGet();
        getRadioProxyMtk3();
    }

    void riljLogMtk(String msg) {
        Rlog.d(LOG_TAG, msg + (" [SUB" + mMtkPhoneId + "]"));
    }

    void setCallIndication(int callId, int seqNo) {
        // Ensure that mMtkRadioProxy is updated.
        vendor.mediatek.hardware.radio.V3_0.IRadio radioProxy3 = getRadioProxyMtk3();
        if (radioProxy3 != null) {
            RILRequest rr = obtainRequestMtk(2016 /* RIL_REQUEST_SET_CALL_INDICATION */, null, mRILDefaultWorkSource);
            riljLogMtk(rr.getSerial() + "> " + "setCallIndication");

            try {
                radioProxy3.setCallIndication(
                    rr.getSerial(), 0 /* 0: allowed, 1: disallowed */, callId, seqNo);
            } catch (RemoteException | RuntimeException e) {
                riljLogMtk("failed to call setCallIndication");
            }
        }
    }

    // WARNING: VERY DIRTY CODE AHEAD
    private RadioIndication getRadioIndication() {
        try {
            Field f = RIL.class.getDeclaredField("mRadioIndication");
            f.setAccessible(true);
            return (RadioIndication) f.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private RadioResponse getRadioResponse() {
        try {
            Field f = RIL.class.getDeclaredField("mRadioResponse");
            f.setAccessible(true);
            return (RadioResponse) f.get(this);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private RILRequest obtainRequestMtk(int request, Message result, WorkSource workSource) {
        try {
            Method m = RIL.class.getDeclaredMethod("obtainRequest", int.class, Message.class, WorkSource.class);
            m.setAccessible(true);
            return (RILRequest) m.invoke(this, request, result, workSource);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public void processIndicationMtk(int indicationType) {
        try {
            Method m = RIL.class.getDeclaredMethod("processIndication", int.class);
            m.setAccessible(true);
            m.invoke(this, indicationType);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    final class MtkRadioProxyDeathRecipient implements HwBinder.DeathRecipient {
        @Override
        public void serviceDied(long cookie) {
            // Deal with service going away
            riljLogMtk("serviceDied");
            mMtkRilHandler.sendMessage(mMtkRilHandler.obtainMessage(0, cookie));
        }
    }

    final class MtkRilHandler extends Handler {
        @Override
        public void handleMessage(Message msg) {
            switch (msg.what) {
                case 0:
                    // Mtk RadioProxy died
                    if ((long) msg.obj == mMtkRadioProxyCookie.get()) {
                        resetRadioProxyMtk();
                    }
            }
        }
    }
}
