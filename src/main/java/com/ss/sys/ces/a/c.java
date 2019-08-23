package com.ss.sys.ces.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.telephony.TelephonyManager;
import java.lang.reflect.Method;
import java.util.Locale;
import java.util.TimeZone;

public final class c {
    public static String a() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    @SuppressLint({"MissingPermission"})
    public static String a(Context context) {
        String str;
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str.trim();
    }

    @SuppressLint({"MissingPermission"})
    public static String b(Context context) {
        String str;
        try {
            str = ((TelephonyManager) context.getSystemService("phone")).getSubscriberId();
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String c(Context context) {
        String str;
        try {
            Locale locale = context.getResources().getConfiguration().locale;
            String language = locale.getLanguage();
            String country = locale.getCountry();
            str = language + "_" + country;
        } catch (Throwable unused) {
            str = null;
        }
        return str == null ? "" : str.trim();
    }

    public static String d(Context context) {
        double d2;
        try {
            Class<?> cls = Class.forName("com.android.internal.os.PowerProfile");
            Object newInstance = cls.getConstructor(new Class[]{Context.class}).newInstance(new Object[]{context});
            Method declaredMethod = cls.getDeclaredMethod("getAveragePower", new Class[]{String.class});
            declaredMethod.setAccessible(true);
            d2 = ((Double) declaredMethod.invoke(newInstance, new Object[]{"battery.capacity"})).doubleValue();
        } catch (Throwable unused) {
            d2 = 0.0d;
        }
        new StringBuilder("capacity : ").append(d2);
        return Integer.toString((int) d2);
    }
}
