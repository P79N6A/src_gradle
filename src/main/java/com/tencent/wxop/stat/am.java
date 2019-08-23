package com.tencent.wxop.stat;

import android.content.Context;
import android.content.IntentFilter;
import com.tencent.wxop.stat.a.n;

public final class am implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79854a;

    am(Context context) {
        this.f79854a = context;
    }

    public final void run() {
        i a2 = i.a(g.t);
        a2.f79908f.getApplicationContext().registerReceiver(new b(a2), new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        n.a(this.f79854a, true);
        t.a(this.f79854a);
        aj.a(this.f79854a);
        g.f79894c = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new n());
        if (d.a() == e.APP_LAUNCH) {
            g.a(this.f79854a, -1);
        }
        if (d.b()) {
            g.r.g("Init MTA StatService success.");
        }
    }
}
