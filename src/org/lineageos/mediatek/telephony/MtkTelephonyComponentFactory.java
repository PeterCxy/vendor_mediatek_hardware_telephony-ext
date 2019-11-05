package org.lineageos.mediatek.telephony;

import android.content.Context;

import com.android.internal.telephony.RIL;
import com.android.internal.telephony.TelephonyComponentFactory;

public class MtkTelephonyComponentFactory extends TelephonyComponentFactory {
    public RIL makeRIL(Context context, int preferredNetworkType,
            int cdmaSubscription, Integer instanceId) {
        return new MtkRIL(context, preferredNetworkType, cdmaSubscription, instanceId);
    }
}
