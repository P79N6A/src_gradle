package com.alimama.tunion.utils;

import android.util.Log;
import com.taobao.android.dexposed.ClassUtils;

public final class TULog {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f5224a;

    public static void d(String str, Object... objArr) {
    }

    public static void e(String str, Object... objArr) {
    }

    public static void e(Throwable th, String str, Object... objArr) {
    }

    public static void i(String str, Object... objArr) {
    }

    public static void v(String str, Object... objArr) {
    }

    private TULog() {
    }

    public static void enable(boolean z) {
        f5224a = z;
    }

    public static void p(String str, Object... objArr) {
        if (f5224a && objArr != null && objArr.length != 0) {
            String.format(str, objArr);
        }
    }

    public static void wtf(String str, Object... objArr) {
        Log.wtf("TULog", a(str, objArr));
    }

    private static String a(String str, Object... objArr) {
        if (!(objArr == null || objArr.length == 0)) {
            str = String.format(str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        String str2 = "<unknown>";
        int i = 2;
        while (true) {
            if (i >= stackTrace.length) {
                break;
            } else if (!stackTrace[i].getClass().equals(TULog.class)) {
                String className = stackTrace[i].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                String substring2 = substring.substring(substring.lastIndexOf(36) + 1);
                str2 = substring2 + ClassUtils.PACKAGE_SEPARATOR + stackTrace[i].getMethodName();
                break;
            } else {
                i++;
            }
        }
        return String.format("[%d] %s: %s", new Object[]{Long.valueOf(Thread.currentThread().getId()), str2, str});
    }
}
