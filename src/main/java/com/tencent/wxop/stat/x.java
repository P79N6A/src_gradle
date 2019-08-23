package com.tencent.wxop.stat;

import com.tencent.wxop.stat.b.e;

public final class x implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ e f79943a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ ai f79944b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f79945c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f79946d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f79947e;

    x(t tVar, e eVar, ai aiVar, boolean z, boolean z2) {
        this.f79947e = tVar;
        this.f79943a = eVar;
        this.f79944b = aiVar;
        this.f79945c = z;
        this.f79946d = z2;
    }

    public final void run() {
        this.f79947e.a(this.f79943a, this.f79944b, this.f79945c, this.f79946d);
    }
}
