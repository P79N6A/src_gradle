package com.ss.android.sdk.c.a;

public final class b {

    /* renamed from: b  reason: collision with root package name */
    private static b f2553b;

    /* renamed from: a  reason: collision with root package name */
    private a f2554a;

    public static a a() {
        return b().f2554a;
    }

    private static b b() {
        if (f2553b != null) {
            return f2553b;
        }
        throw new IllegalStateException("请先调用holdService初始化");
    }

    private b(a aVar) {
        this.f2554a = aVar;
    }

    public static synchronized void a(a aVar) {
        synchronized (b.class) {
            if (f2553b == null) {
                f2553b = new b(aVar);
            } else {
                f2553b.f2554a = aVar;
            }
        }
    }
}
