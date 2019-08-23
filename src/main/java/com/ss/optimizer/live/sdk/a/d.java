package com.ss.optimizer.live.sdk.a;

import com.ss.optimizer.live.sdk.a.c;

public class d {

    /* renamed from: d  reason: collision with root package name */
    private static volatile d f78403d;

    /* renamed from: a  reason: collision with root package name */
    public final f f78404a = new f();

    /* renamed from: b  reason: collision with root package name */
    public a f78405b;

    /* renamed from: c  reason: collision with root package name */
    public e f78406c;

    /* renamed from: e  reason: collision with root package name */
    private c f78407e;

    public d() {
        a(new c.a().a());
    }

    public static d a() {
        if (f78403d == null) {
            synchronized (d.class) {
                if (f78403d == null) {
                    f78403d = new d();
                }
            }
        }
        return f78403d;
    }

    public final void a(c cVar) {
        if (cVar != null) {
            this.f78407e = cVar;
            this.f78405b = new a(this.f78407e);
            this.f78406c = new e(this.f78404a, this.f78405b);
        }
    }
}
