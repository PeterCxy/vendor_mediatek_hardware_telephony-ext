package org.lineageos.mediatek.telephony;

import android.content.Context;
import android.telephony.AccessNetworkConstants.TransportType;

import com.android.internal.telephony.Phone;
import com.android.internal.telephony.RIL;
import com.android.internal.telephony.TelephonyComponentFactory;
import com.android.internal.telephony.dataconnection.DcTracker;

import org.lineageos.mediatek.telephony.dataconnection.MtkDcTracker;

public class MtkTelephonyComponentFactory extends TelephonyComponentFactory {
    @Override
    public RIL makeRIL(Context context, int preferredNetworkType,
            int cdmaSubscription, Integer instanceId) {
        return new MtkRIL(context, preferredNetworkType, cdmaSubscription, instanceId);
    }

    @Override
    public DcTracker makeDcTracker(Phone phone, @TransportType int transportType) {
        return new MtkDcTracker(phone, transportType);
    }
}
