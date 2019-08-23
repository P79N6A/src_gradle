package com.meizu.cloud.pushsdk.b.a;

import com.meizu.cloud.pushinternal.DebugLogger;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f26855a = false;

    /* renamed from: b  reason: collision with root package name */
    private static String f26856b = "AndroidNetworking";

    public static void a() {
        f26855a = true;
    }

    public static void a(String str) {
        if (f26855a) {
            DebugLogger.d(f26856b, str);
        }
    }

    public static void b(String str) {
        if (f26855a) {
            DebugLogger.i(f26856b, str);
        }
    }
}
