package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.b.d;
import com.tencent.wxop.stat.b.f;

public final class an implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79855a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ Throwable f79856b;

    an(Context context, Throwable th) {
        this.f79855a = context;
        this.f79856b = th;
    }

    public final void run() {
        try {
            if (d.c()) {
                d dVar = new d(this.f79855a, g.a(this.f79855a, false, null), 99, this.f79856b, f.f79874a);
                new p(dVar).a();
            }
        } catch (Throwable th) {
            g.r.e("reportSdkSelfException error: ".concat(String.valueOf(th)));
        }
    }
}
