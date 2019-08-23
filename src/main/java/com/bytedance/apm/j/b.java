package com.bytedance.apm.j;

import com.bytedance.apm.d;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class b {

    /* renamed from: c  reason: collision with root package name */
    public static long f2039c = 30000;

    /* renamed from: a  reason: collision with root package name */
    public c f2040a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f2041b;

    /* renamed from: d  reason: collision with root package name */
    CopyOnWriteArraySet<C0006b> f2042d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f2043e;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final b f2045a = new b((byte) 0);
    }

    /* renamed from: com.bytedance.apm.j.b$b  reason: collision with other inner class name */
    public interface C0006b {
        void a(long j);
    }

    public static b a() {
        return a.f2045a;
    }

    private b() {
        this.f2041b = true;
        this.f2043e = new Runnable() {
            public final void run() {
                Iterator<C0006b> it2 = b.this.f2042d.iterator();
                while (it2.hasNext()) {
                    it2.next().a(System.currentTimeMillis());
                }
                if (b.this.f2041b) {
                    b.this.f2040a.a((Runnable) this, b.f2039c);
                }
            }
        };
        this.f2042d = new CopyOnWriteArraySet<>();
        this.f2040a = new c("AsyncEventManager-Thread");
        this.f2040a.f2047a.start();
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        this.f2040a.a(runnable);
    }

    public final void b(C0006b bVar) {
        try {
            this.f2042d.remove(bVar);
        } catch (Throwable th) {
            d.a().a(th, "AsyncEventManager: removeTimeTask");
        }
    }

    public final void a(C0006b bVar) {
        if (bVar != null) {
            try {
                this.f2042d.add(bVar);
                if (this.f2041b) {
                    this.f2040a.b(this.f2043e);
                    this.f2040a.a(this.f2043e, f2039c);
                }
            } catch (Throwable th) {
                d.a().a(th, "AsyncEventManager: addTimeTask");
            }
        }
    }
}
