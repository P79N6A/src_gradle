package com.amap.api.services.a;

import java.net.Proxy;

public class dd {

    /* renamed from: a  reason: collision with root package name */
    private de f6801a;

    /* renamed from: b  reason: collision with root package name */
    private dg f6802b;

    public interface a {
        void a(Throwable th);

        void a(byte[] bArr, long j);

        void d();

        void e();
    }

    public dd(dg dgVar) {
        this(dgVar, 0, -1);
    }

    public void a(a aVar) {
        this.f6801a.a(this.f6802b.i(), this.f6802b.e(), this.f6802b.d(), aVar);
    }

    public dd(dg dgVar, long j, long j2) {
        Proxy proxy;
        this.f6802b = dgVar;
        if (dgVar.h == null) {
            proxy = null;
        } else {
            proxy = dgVar.h;
        }
        this.f6801a = new de(this.f6802b.f6816f, this.f6802b.g, proxy);
        this.f6801a.b(j2);
        this.f6801a.a(j);
    }
}
