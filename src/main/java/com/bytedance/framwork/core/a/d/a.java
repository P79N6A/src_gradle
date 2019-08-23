package com.bytedance.framwork.core.a.d;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static long f20119c = 30000;

    /* renamed from: a  reason: collision with root package name */
    public b f20120a;

    /* renamed from: b  reason: collision with root package name */
    public volatile boolean f20121b;

    /* renamed from: d  reason: collision with root package name */
    CopyOnWriteArraySet<b> f20122d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f20123e;

    /* renamed from: com.bytedance.framwork.core.a.d.a$a  reason: collision with other inner class name */
    static final class C0174a {

        /* renamed from: a  reason: collision with root package name */
        static final a f20125a = new a((byte) 0);
    }

    public interface b {
        void a(long j);
    }

    public static a a() {
        return C0174a.f20125a;
    }

    private a() {
        this.f20121b = true;
        this.f20123e = new Runnable() {
            public final void run() {
                Iterator<b> it2 = a.this.f20122d.iterator();
                while (it2.hasNext()) {
                    it2.next().a(System.currentTimeMillis());
                }
                if (a.this.f20121b) {
                    a.this.f20120a.a((Runnable) this, a.f20119c);
                }
            }
        };
        this.f20122d = new CopyOnWriteArraySet<>();
        this.f20120a = new b("AsyncEventManager-Thread");
        this.f20120a.f20127a.start();
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    public final void a(Runnable runnable) {
        b bVar = this.f20120a;
        bVar.a(bVar.a(runnable), 0);
    }

    public final void a(b bVar) {
        try {
            this.f20122d.add(bVar);
            if (this.f20121b) {
                this.f20120a.b(this.f20123e);
                this.f20120a.a(this.f20123e, f20119c);
            }
        } catch (Throwable unused) {
        }
    }
}
