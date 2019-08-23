package com.toutiao.proxyserver.e;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.toutiao.proxyserver.e.a;
import java.util.concurrent.atomic.AtomicInteger;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80052a = null;

    /* renamed from: c  reason: collision with root package name */
    public static long f80053c = 1000;
    private static long i = -1;
    private static final g j = new f();

    /* renamed from: b  reason: collision with root package name */
    public g f80054b;

    /* renamed from: d  reason: collision with root package name */
    private final a f80055d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicInteger f80056e;

    /* renamed from: f  reason: collision with root package name */
    private b f80057f;
    private HandlerThread g;
    private long h;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f80058a = new c(a.C0855a.f80051a, (byte) 0);
    }

    class b extends Handler {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f80059a;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f80059a, false, 91855, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f80059a, false, 91855, new Class[0], Void.TYPE);
                return;
            }
            sendEmptyMessage(1);
        }

        public final void b() {
            if (PatchProxy.isSupport(new Object[0], this, f80059a, false, 91856, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f80059a, false, 91856, new Class[0], Void.TYPE);
                return;
            }
            removeMessages(1);
        }

        public final void handleMessage(Message message) {
            if (PatchProxy.isSupport(new Object[]{message}, this, f80059a, false, 91854, new Class[]{Message.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{message}, this, f80059a, false, 91854, new Class[]{Message.class}, Void.TYPE);
            } else if (message.what == 1) {
                c.this.d();
                sendEmptyMessageDelayed(1, c.f80053c);
            } else {
                throw new IllegalArgumentException("Unknown what=" + message.what);
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    public static c a() {
        return a.f80058a;
    }

    public final void e() {
        this.f80054b = j;
    }

    private void f() {
        if (PatchProxy.isSupport(new Object[0], this, f80052a, false, 91852, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80052a, false, 91852, new Class[0], Void.TYPE);
            return;
        }
        d();
        i = -1;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f80052a, false, 91849, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80052a, false, 91849, new Class[0], Void.TYPE);
            return;
        }
        if (this.f80056e.getAndIncrement() == 0) {
            this.f80057f.a();
            this.h = SystemClock.elapsedRealtime();
        }
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f80052a, false, 91850, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80052a, false, 91850, new Class[0], Void.TYPE);
            return;
        }
        if (this.f80056e.decrementAndGet() == 0) {
            this.f80057f.b();
            f();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f80052a, false, 91851, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80052a, false, 91851, new Class[0], Void.TYPE);
        } else if (this.f80054b != null) {
            long a2 = this.f80054b.a();
            long j2 = a2 - i;
            if (i >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f80055d.a(j2, elapsedRealtime - this.h);
                    this.h = elapsedRealtime;
                }
            }
            i = a2;
        }
    }

    private c(a aVar) {
        this.f80054b = j;
        this.f80055d = aVar;
        this.f80056e = new AtomicInteger();
        this.g = new HandlerThread("ParseThread");
        this.g.start();
        this.f80057f = new b(this.g.getLooper());
    }

    /* synthetic */ c(a aVar, byte b2) {
        this(aVar);
    }
}
