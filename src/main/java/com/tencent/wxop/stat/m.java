package com.tencent.wxop.stat;

import android.content.Context;

public final class m implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79913a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ h f79914b;

    m(Context context, h hVar) {
        this.f79913a = context;
        this.f79914b = hVar;
    }

    public final void run() {
        try {
            g.a(this.f79913a, false, this.f79914b);
        } catch (Throwable unused) {
        }
    }
}
