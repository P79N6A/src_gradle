package com.ss.android.ad.splash.core.d;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f27657a;

    /* renamed from: b  reason: collision with root package name */
    private volatile ExecutorService f27658b = h.a(m.a(p.FIXED).a(2).a());

    public static a a() {
        if (f27657a == null) {
            synchronized (a.class) {
                if (f27657a == null) {
                    f27657a = new a();
                }
            }
        }
        return f27657a;
    }

    public final void a(Runnable runnable) {
        if (this.f27658b != null) {
            this.f27658b.submit(runnable);
        }
    }
}
