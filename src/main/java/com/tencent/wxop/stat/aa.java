package com.tencent.wxop.stat;

public final class aa implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ int f79827a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ t f79828b;

    aa(t tVar, int i) {
        this.f79828b = tVar;
        this.f79827a = i;
    }

    public final void run() {
        t.a(this.f79828b, this.f79827a, true);
        t.a(this.f79828b, this.f79827a, false);
    }
}
