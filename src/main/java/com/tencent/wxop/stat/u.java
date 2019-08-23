package com.tencent.wxop.stat;

import java.util.List;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f79933a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f79934b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f79935c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ boolean f79936d;

    /* renamed from: e  reason: collision with root package name */
    final /* synthetic */ t f79937e;

    u(t tVar, List list, int i, boolean z, boolean z2) {
        this.f79937e = tVar;
        this.f79933a = list;
        this.f79934b = i;
        this.f79935c = z;
        this.f79936d = z2;
    }

    public final void run() {
        this.f79937e.a(this.f79933a, this.f79934b, this.f79935c);
        if (this.f79936d) {
            this.f79933a.clear();
        }
    }
}
