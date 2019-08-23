package com.vivo.push;

import com.vivo.push.p;
import com.vivo.push.util.o;

public final class q implements IPushActionListener {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ p.a f81628a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f81629b;

    public final void onStateChanged(int i) {
        if (i == 0) {
            Object[] b2 = this.f81628a.b();
            if (b2 == null || b2.length == 0) {
                o.a("PushClientManager", "bind app result is null");
            } else {
                this.f81629b.a((String) this.f81628a.b()[0]);
            }
        } else {
            String unused = this.f81629b.l = null;
            this.f81629b.k.c("APP_TOKEN");
        }
    }

    q(p pVar, p.a aVar) {
        this.f81629b = pVar;
        this.f81628a = aVar;
    }
}
