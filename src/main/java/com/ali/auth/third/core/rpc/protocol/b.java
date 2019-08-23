package com.ali.auth.third.core.rpc.protocol;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static ThreadLocal<String> f4948a = new ThreadLocal<>();

    public static String a() {
        return f4948a.get();
    }

    public static void a(String str) {
        f4948a.set(str);
    }
}
