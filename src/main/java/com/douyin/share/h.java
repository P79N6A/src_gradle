package com.douyin.share;

public class h {

    /* renamed from: b  reason: collision with root package name */
    private static h f23230b;

    /* renamed from: a  reason: collision with root package name */
    public boolean f23231a;

    private h() {
    }

    public static h a() {
        if (f23230b == null) {
            synchronized (h.class) {
                if (f23230b == null) {
                    f23230b = new h();
                }
            }
        }
        return f23230b;
    }
}
