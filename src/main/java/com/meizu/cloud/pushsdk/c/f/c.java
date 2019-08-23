package com.meizu.cloud.pushsdk.c.f;

import com.meizu.cloud.pushinternal.DebugLogger;

public class c {

    /* renamed from: a  reason: collision with root package name */
    private static int f27190a;

    private static String a() {
        return Thread.currentThread().getName();
    }

    private static String a(String str) {
        return "PushTracker->" + str;
    }

    private static String a(String str, Object... objArr) {
        return a() + "|" + String.format(str, objArr);
    }

    public static void a(b bVar) {
        f27190a = bVar.a();
    }

    public static void a(String str, String str2, Object... objArr) {
        if (f27190a > 0) {
            DebugLogger.e(a(str), a(str2, objArr));
        }
    }

    public static void b(String str, String str2, Object... objArr) {
        if (f27190a >= 2) {
            DebugLogger.d(a(str), a(str2, objArr));
        }
    }

    public static void c(String str, String str2, Object... objArr) {
        if (f27190a >= 3) {
            DebugLogger.i(a(str), a(str2, objArr));
        }
    }
}
