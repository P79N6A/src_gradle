package com.cmic.sso.sdk.d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import java.lang.reflect.Method;

public class r {
    public static String a() {
        return Build.BRAND;
    }

    public static String b() {
        return Build.MODEL;
    }

    public static String c() {
        return "android" + Build.VERSION.RELEASE;
    }

    public static int a(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getApplicationContext().getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                if (activeNetworkInfo.isAvailable()) {
                    int type = activeNetworkInfo.getType();
                    if (type == 1) {
                        f.b("TelephonyUtils", "WIFI");
                        boolean a2 = j.a(context, "android.permission.CHANGE_NETWORK_STATE");
                        f.a("TelephonyUtils", "CHANGE_NETWORK_STATE=" + a2);
                        if (!a2 || !a(context, connectivityManager)) {
                            return 2;
                        }
                        f.b("TelephonyUtils", "流量数据 WIFI 同开");
                        return 3;
                    }
                    if (type == 0) {
                        f.b("TelephonyUtils", "流量");
                        return 1;
                    }
                    return 0;
                }
            }
            return 0;
        } catch (Exception unused) {
        }
    }

    private static boolean a(Context context, ConnectivityManager connectivityManager) {
        try {
            if (!j.a(context, "android.permission.READ_PHONE_STATE") && TextUtils.isEmpty(m.a(context).b())) {
                return false;
            }
            Method declaredMethod = ConnectivityManager.class.getDeclaredMethod("getMobileDataEnabled", new Class[0]);
            declaredMethod.setAccessible(true);
            boolean booleanValue = ((Boolean) declaredMethod.invoke(connectivityManager, new Object[0])).booleanValue();
            f.b("TelephonyUtils", "data is on ---------" + booleanValue);
            return booleanValue;
        } catch (Exception unused) {
            f.a("TelephonyUtils", "data is on ----反射出错-----");
            return false;
        }
    }
}
