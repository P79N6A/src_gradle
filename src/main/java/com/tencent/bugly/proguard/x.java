package com.tencent.bugly.proguard;

import java.util.Locale;

public final class x {

    /* renamed from: a  reason: collision with root package name */
    public static String f79539a = "CrashReport";

    /* renamed from: b  reason: collision with root package name */
    public static boolean f79540b = false;

    /* renamed from: c  reason: collision with root package name */
    private static String f79541c = "CrashReportInfo";

    public static boolean b(Throwable th) {
        if (!f79540b) {
            return false;
        }
        return a(3, z.a(th), new Object[0]);
    }

    public static boolean a(Throwable th) {
        if (!f79540b) {
            return false;
        }
        return a(2, z.a(th), new Object[0]);
    }

    public static boolean a(String str, Object... objArr) {
        return a(0, str, objArr);
    }

    public static boolean b(String str, Object... objArr) {
        return a(5, str, objArr);
    }

    public static boolean c(String str, Object... objArr) {
        return a(1, str, objArr);
    }

    public static boolean d(String str, Object... objArr) {
        return a(2, str, objArr);
    }

    public static boolean e(String str, Object... objArr) {
        return a(3, str, objArr);
    }

    public static boolean a(Class cls, String str, Object... objArr) {
        return a(0, String.format(Locale.US, "[%s] %s", new Object[]{cls.getSimpleName(), str}), objArr);
    }

    public static boolean b(Class cls, String str, Object... objArr) {
        return a(1, String.format(Locale.US, "[%s] %s", new Object[]{cls.getSimpleName(), str}), objArr);
    }

    private static boolean a(int i, String str, Object... objArr) {
        if (!f79540b) {
            return false;
        }
        if (!(str == null || objArr == null || objArr.length == 0)) {
            String.format(Locale.US, str, objArr);
        }
        if (i == 5) {
            return true;
        }
        switch (i) {
            case 0:
                return true;
            case 1:
                return true;
            case 2:
                return true;
            case 3:
                return true;
            default:
                return false;
        }
    }
}
