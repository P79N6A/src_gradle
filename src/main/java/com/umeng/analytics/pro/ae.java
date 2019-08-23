package com.umeng.analytics.pro;

import android.content.Context;
import android.telephony.TelephonyManager;

public class ae extends y {

    /* renamed from: b  reason: collision with root package name */
    private Context f80348b;

    public String f() {
        TelephonyManager telephonyManager = (TelephonyManager) this.f80348b.getSystemService("phone");
        try {
            if (bv.a(this.f80348b, "android.permission.READ_PHONE_STATE")) {
                return telephonyManager.getDeviceId();
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    public ae(Context context) {
        super("imei");
        this.f80348b = context;
    }
}
