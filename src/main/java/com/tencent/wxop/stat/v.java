package com.tencent.wxop.stat;

import java.util.List;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ List f79938a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ boolean f79939b;

    /* renamed from: c  reason: collision with root package name */
    final /* synthetic */ boolean f79940c;

    /* renamed from: d  reason: collision with root package name */
    final /* synthetic */ t f79941d;

    v(t tVar, List list, boolean z, boolean z2) {
        this.f79941d = tVar;
        this.f79938a = list;
        this.f79939b = z;
        this.f79940c = z2;
    }

    public final void run() {
        this.f79941d.a(this.f79938a, this.f79939b);
        if (this.f79940c) {
            this.f79938a.clear();
        }
    }
}
