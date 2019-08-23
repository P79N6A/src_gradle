package com.ss.android.downloadlib.c.a;

import com.ss.android.downloadlib.c.f;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class c implements Runnable {

    /* renamed from: b  reason: collision with root package name */
    static final ExecutorService f28876b = h.c();

    /* renamed from: c  reason: collision with root package name */
    static final ExecutorService f28877c = h.a(m.a(p.FIXED).a(5).a((ThreadFactory) new b("ThreadPlus-fixed", true)).a());

    /* renamed from: d  reason: collision with root package name */
    protected static final AtomicInteger f28878d = new AtomicInteger();

    /* renamed from: a  reason: collision with root package name */
    private Runnable f28879a;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f28880e;

    public c() {
        this(false);
    }

    public void run() {
        if (this.f28879a != null) {
            this.f28879a.run();
        }
    }

    public final void a() {
        Runnable runnable;
        if (f.a()) {
            runnable = new Runnable() {
                public final void run() {
                    new StringBuilder("thread count: ").append(c.f28878d.incrementAndGet());
                    try {
                        c.this.run();
                    } catch (Exception unused) {
                    }
                    new StringBuilder("thread count: ").append(c.f28878d.decrementAndGet());
                }
            };
        } else {
            runnable = this;
        }
        if (this.f28880e) {
            f28877c.submit(runnable);
        } else {
            f28876b.submit(runnable);
        }
    }

    static {
        new b("ThreadPlus-cached", true);
    }

    private c(boolean z) {
        this.f28880e = false;
    }
}
