package com.ss.android.ttve.common;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static volatile h f31182b;

    /* renamed from: a  reason: collision with root package name */
    public TESpdLogInvoker f31183a = new TESpdLogInvoker();

    public enum a {
        LEVEL0,
        LEVEL1,
        LEVEL2,
        LEVEL3
    }

    private h() {
    }

    public static h a() {
        if (f31182b == null) {
            synchronized (h.class) {
                if (f31182b == null) {
                    f31182b = new h();
                }
            }
        }
        return f31182b;
    }
}
