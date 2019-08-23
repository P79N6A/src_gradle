package com.facebook.cache.common;

public final class d implements a {

    /* renamed from: a  reason: collision with root package name */
    private static d f23427a;

    private d() {
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            if (f23427a == null) {
                f23427a = new d();
            }
            dVar = f23427a;
        }
        return dVar;
    }
}
