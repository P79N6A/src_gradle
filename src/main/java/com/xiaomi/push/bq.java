package com.xiaomi.push;

import android.content.Context;
import android.telephony.TelephonyManager;

public class bq {

    /* renamed from: a  reason: collision with root package name */
    private static Context f81871a;

    /* renamed from: a  reason: collision with other field name */
    private static TelephonyManager f196a;

    public static String a() {
        if (f196a != null) {
            return f196a.getNetworkOperator();
        }
        return null;
    }

    public static void a(Context context) {
        f81871a = context;
        f196a = (TelephonyManager) context.getSystemService("phone");
    }

    public static String b() {
        String str = null;
        try {
            if (!(f81871a == null || f81871a.getPackageManager().checkPermission("android.permission.READ_PHONE_STATE", f81871a.getPackageName()) != 0 || f196a == null)) {
                str = f196a.getDeviceId();
            }
        } catch (Exception unused) {
        }
        return str != null ? str : "UNKNOWN";
    }
}
