package com.loc;

import java.net.Proxy;

public final class aj {

    /* renamed from: a  reason: collision with root package name */
    private ak f25460a;

    /* renamed from: b  reason: collision with root package name */
    private al f25461b;

    public interface a {
        void a(byte[] bArr, long j);

        void c();

        void d();

        void e();
    }

    public aj(al alVar) {
        this(alVar, (byte) 0);
    }

    public final void a(a aVar) {
        this.f25460a.a(this.f25461b.c(), this.f25461b.a(), this.f25461b.b(), aVar);
    }

    private aj(al alVar, byte b2) {
        Proxy proxy;
        this.f25461b = alVar;
        if (alVar.f25471e == null) {
            proxy = null;
        } else {
            proxy = alVar.f25471e;
        }
        this.f25460a = new ak(this.f25461b.f25469c, this.f25461b.f25470d, proxy);
        this.f25460a.f25462a = -1;
        this.f25460a.f25463b = 0;
    }
}
