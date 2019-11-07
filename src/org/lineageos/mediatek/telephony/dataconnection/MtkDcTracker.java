package org.lineageos.mediatek.telephony.dataconnection;

import android.os.SystemProperties;
import android.telephony.Rlog;
import android.telephony.AccessNetworkConstants.TransportType;
import android.telephony.data.ApnSetting;

import com.android.internal.telephony.Phone;
import com.android.internal.telephony.dataconnection.DcTracker;

import org.lineageos.mediatek.telephony.MtkUtility;

import java.lang.reflect.Field;
import java.util.ArrayList;

public class MtkDcTracker extends DcTracker {
    private static final String LOG_TAG = "MtkDcTracker";

    private class ApnSettingList extends ArrayList<ApnSetting> {
        ApnSettingList() {
            super();
        }

        @Override
        public boolean add(ApnSetting setting) {
            if (SystemProperties.getBoolean("ro.radio.apn_force_cognitive", false)) {
                Rlog.d(LOG_TAG, "Forcing new APN to be persistent");
                setApnPersistent(setting);
            }
            return super.add(setting);
        }
    }

    public MtkDcTracker(Phone phone, @TransportType int transportType) {
        super(phone, transportType);
        Rlog.d(LOG_TAG, "MtkDcTracker loaded");

        try {
            Field f = DcTracker.class.getDeclaredField("mAllApnSettings");
            f.setAccessible(true);
            // Override mAllApnSettings so that we can modify ApnSetting
            f.set(this, new ApnSettingList());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    private void setApnPersistent(ApnSetting setting) {
        try {
            Field f = ApnSetting.class.getDeclaredField("mPersistent");
            f.setAccessible(true);
            MtkUtility.definalize(f);
            f.setBoolean(setting, true);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
