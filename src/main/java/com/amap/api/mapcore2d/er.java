package com.amap.api.mapcore2d;

import java.net.Proxy;

public class er {

    /* renamed from: a  reason: collision with root package name */
    private es f6076a;

    /* renamed from: b  reason: collision with root package name */
    private ev f6077b;

    public interface a {
        void a(Throwable th);

        void a(byte[] bArr, long j);

        void b();

        void c();
    }

    public er(ev evVar) {
        this(evVar, 0, -1);
    }

    public void a(a aVar) {
        this.f6076a.a(this.f6077b.g(), this.f6077b.e(), this.f6077b.f(), aVar);
    }

    public er(ev evVar, long j, long j2) {
        Proxy proxy;
        this.f6077b = evVar;
        if (evVar.f6093e == null) {
            proxy = null;
        } else {
            proxy = evVar.f6093e;
        }
        this.f6076a = new es(this.f6077b.f6091c, this.f6077b.f6092d, proxy);
        this.f6076a.b(j2);
        this.f6076a.a(j);
    }
}
