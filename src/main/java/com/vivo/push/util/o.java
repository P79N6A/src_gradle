package com.vivo.push.util;

import android.content.Context;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public static final n f81680a = new m();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f81681b = y.b("persist.sys.log.ctrl", "no").equals("yes");

    /* renamed from: c  reason: collision with root package name */
    private static boolean f81682c;

    public static boolean a() {
        return f81681b;
    }

    public static String a(Throwable th) {
        return f81680a.a(th);
    }

    public static void a(boolean z) {
        f81681b = z;
        f81682c = z;
    }

    public static int a(String str, String str2) {
        return f81680a.a(str, str2);
    }

    public static int b(String str, String str2) {
        return f81680a.b(str, str2);
    }

    public static int c(String str, String str2) {
        return f81680a.c(str, str2);
    }

    public static int d(String str, String str2) {
        return f81680a.d(str, str2);
    }

    public static int e(String str, String str2) {
        return f81680a.e(str, str2);
    }

    public static void c(Context context, String str) {
        f81680a.c(context, str);
    }

    public static void b(Context context, String str) {
        f81680a.b(context, str);
    }

    public static void a(Context context, String str) {
        f81680a.a(context, str);
    }

    public static int a(String str, String str2, Throwable th) {
        return f81680a.a(str, str2, th);
    }

    public static int b(String str, String str2, Throwable th) {
        return f81680a.b(str, str2, th);
    }
}
