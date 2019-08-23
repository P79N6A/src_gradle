package com.tencent.wxop.stat;

import android.content.Context;

public final class j implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79909a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f79910b;

    j(Context context, int i) {
        this.f79909a = context;
        this.f79910b = i;
    }

    public final void run() {
        try {
            g.b(this.f79909a);
            t.a(this.f79909a).a(this.f79910b);
        } catch (Throwable th) {
            g.a(this.f79909a, th);
        }
    }
}
