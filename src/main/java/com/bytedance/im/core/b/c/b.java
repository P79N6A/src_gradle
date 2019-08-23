package com.bytedance.im.core.b.c;

import java.util.List;

public class b {

    /* renamed from: c  reason: collision with root package name */
    private static b f21150c;

    /* renamed from: a  reason: collision with root package name */
    public c f21151a = new h();

    /* renamed from: b  reason: collision with root package name */
    public c f21152b = new d();

    private b() {
    }

    public static b a() {
        if (f21150c == null) {
            synchronized (b.class) {
                if (f21150c == null) {
                    f21150c = new b();
                }
            }
        }
        return f21150c;
    }

    public final void a(List<Long> list) {
        this.f21151a.a(list);
        this.f21152b.a(list);
    }
}
