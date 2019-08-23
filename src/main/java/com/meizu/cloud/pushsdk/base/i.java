package com.meizu.cloud.pushsdk.base;

import android.content.Context;
import android.telephony.TelephonyManager;
import com.meizu.cloud.pushsdk.base.a.a;
import com.meizu.cloud.pushsdk.base.a.d;

public class i {
    public static String a(Context context) {
        d a2 = a.a("android.telephony.MzTelephonyManager").a("getDeviceId", new Class[0]).a(new Object[0]);
        return a2.f27048a ? (String) a2.f27049b : ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
    }
}
