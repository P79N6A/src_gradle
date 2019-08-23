package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.b;
import com.tencent.wxop.stat.b.c;

public final class ap implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79857a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f79858b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ c f79859c;

    ap(Context context, h hVar, c cVar) {
        this.f79857a = context;
        this.f79858b = hVar;
        this.f79859c = cVar;
    }

    public final void run() {
        try {
            b bVar = new b(this.f79857a, g.a(this.f79857a, false, this.f79858b), this.f79859c.f79865a, this.f79858b);
            bVar.f79863a.f79867c = this.f79859c.f79867c;
            new p(bVar).a();
        } catch (Throwable th) {
            g.a(this.f79857a, th);
        }
    }
}
