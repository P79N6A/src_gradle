package com.tencent.wxop.stat;

import com.tencent.wxop.stat.b.d;
import java.lang.Thread;

public final class n implements Thread.UncaughtExceptionHandler {
    n() {
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        if (d.c() && g.t != null) {
            if (d.r) {
                t a2 = t.a(g.t);
                d dVar = new d(g.t, g.a(g.t, false, null), 2, th, thread, null);
                a2.b(dVar, null, false, true);
                g.r.f("MTA has caught the following uncaught exception:");
            }
            g.b(g.t);
            if (g.f79894c != null) {
                g.r.g("Call the original uncaught exception handler.");
                if (!(g.f79894c instanceof n)) {
                    g.f79894c.uncaughtException(thread, th);
                }
            }
        }
    }
}
