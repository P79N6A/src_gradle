package com.facebook.common.a;

import javax.annotation.Nullable;

public final class b implements a {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private static b f23495a;

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f23495a == null) {
                f23495a = new b();
            }
            bVar = f23495a;
        }
        return bVar;
    }
}
