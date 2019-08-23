package com.bytedance.im.core.b.e;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static int f21188a = 2;

    public static boolean a() {
        if (f21188a <= 3) {
            return true;
        }
        return false;
    }

    public static void a(String str) {
        a("imsdk", str);
    }

    public static void b(String str) {
        b("imsdk", str);
    }

    public static void c(String str) {
        d("imsdk", str);
    }

    public static void d(String str) {
        c("imsdk", str);
    }

    private static void e(String str, String str2) {
        com.bytedance.im.core.c.d.a(str, str2, (Throwable) null);
    }

    public static void a(String str, String str2) {
        if (str2 != null) {
            e(str, str2);
        }
    }

    public static void b(String str, String str2) {
        if (str2 != null) {
            e(str, str2);
        }
    }

    public static void c(String str, String str2) {
        if (str2 != null) {
            e(str, str2);
        }
    }

    private static void d(String str, String str2) {
        if (str2 != null) {
            e(str, str2);
        }
    }

    public static void a(String str, Throwable th) {
        if (str != null || th != null) {
            a("", str, th);
        }
    }

    private static void a(String str, String str2, Throwable th) {
        com.bytedance.im.core.c.d.a(str, str2, th);
    }
}
