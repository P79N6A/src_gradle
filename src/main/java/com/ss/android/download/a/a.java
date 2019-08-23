package com.ss.android.download.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakHandler;
import com.bytedance.common.utility.concurrent.SimpleThreadFactory;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.download.a.b;
import com.ss.android.ugc.aweme.thread.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class a<K, T, E, V, R, C, N extends b<K, T, E, V, R, C, N>> implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicInteger f28421a = new AtomicInteger();
    private static final ExecutorService g = h.c();

    /* renamed from: b  reason: collision with root package name */
    final String f28422b;

    /* renamed from: c  reason: collision with root package name */
    final int f28423c;

    /* renamed from: d  reason: collision with root package name */
    final int f28424d;

    /* renamed from: e  reason: collision with root package name */
    final Object f28425e;

    /* renamed from: f  reason: collision with root package name */
    public final Handler f28426f;
    private final HashMap<K, N> h;
    private N i;
    private N j;
    private volatile boolean k;
    private final AtomicBoolean l;
    private final AtomicBoolean m;
    private volatile int n;
    private final LinkedList<C0336a> o;
    private ArrayList<N> p;

    /* renamed from: com.ss.android.download.a.a$a  reason: collision with other inner class name */
    class C0336a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        N f28427a;

        /* renamed from: b  reason: collision with root package name */
        int f28428b;

        public final void run() {
            if (this.f28427a != null) {
                R r = null;
                try {
                    r = a.this.a(this.f28427a.f28432c, this.f28427a.f28433d, this.f28427a.f28434e);
                } catch (Exception unused) {
                }
                this.f28427a.f28435f = r;
                Message obtainMessage = a.this.f28426f.obtainMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
                obtainMessage.obj = this;
                obtainMessage.arg1 = this.f28428b;
                a.this.f28426f.sendMessage(obtainMessage);
                return;
            }
            Message obtainMessage2 = a.this.f28426f.obtainMessage(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
            obtainMessage2.obj = this;
            a.this.f28426f.sendMessage(obtainMessage2);
        }

        C0336a() {
        }
    }

    /* access modifiers changed from: protected */
    public abstract N a();

    /* access modifiers changed from: protected */
    public abstract R a(K k2, T t, E e2);

    /* access modifiers changed from: protected */
    public abstract void a(K k2, T t, E e2, C c2, R r);

    public void c() {
        synchronized (this.f28425e) {
            this.m.set(true);
        }
    }

    static {
        new SimpleThreadFactory("AsyncLoader-Worker", true);
    }

    private N e() {
        int size = this.p.size();
        if (size <= 0) {
            return a();
        }
        return (b) this.p.remove(size - 1);
    }

    private boolean f() {
        if (this.l.get() || this.m.get() || this.i.f28431b == this.j) {
            return false;
        }
        return true;
    }

    private N g() {
        if (this.l.get() || this.m.get() || this.i.f28431b == this.j) {
            return null;
        }
        N n2 = this.i.f28431b;
        a(n2);
        n2.f28431b = null;
        n2.f28430a = null;
        return n2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0003, code lost:
        continue;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0003 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0003 A[LOOP:0: B:2:0x0003->B:26:0x0003, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void h() {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f28425e
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r4.f()     // Catch:{ all -> 0x0030 }
            if (r1 == 0) goto L_0x002e
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r1 = r4.o     // Catch:{ Throwable -> 0x0003 }
            java.lang.Object r1 = r1.poll()     // Catch:{ Throwable -> 0x0003 }
            com.ss.android.download.a.a$a r1 = (com.ss.android.download.a.a.C0336a) r1     // Catch:{ Throwable -> 0x0003 }
            if (r1 != 0) goto L_0x0015
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0015:
            com.ss.android.download.a.b r2 = r4.g()     // Catch:{ Throwable -> 0x0003 }
            if (r2 != 0) goto L_0x0022
            java.util.LinkedList<com.ss.android.download.a.a$a<>> r2 = r4.o     // Catch:{ Throwable -> 0x0003 }
            r2.add(r1)     // Catch:{ Throwable -> 0x0003 }
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0022:
            int r3 = r4.n     // Catch:{ Throwable -> 0x0003 }
            r1.f28428b = r3     // Catch:{ Throwable -> 0x0003 }
            r1.f28427a = r2     // Catch:{ Throwable -> 0x0003 }
            java.util.concurrent.ExecutorService r2 = g     // Catch:{ Throwable -> 0x0003 }
            r2.submit(r1)     // Catch:{ Throwable -> 0x0003 }
            goto L_0x0003
        L_0x002e:
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            return
        L_0x0030:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0030 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.a.a.h():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void d() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.f28425e
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.l     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x000d
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x000d:
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.m     // Catch:{ all -> 0x0020 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0020 }
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.atomic.AtomicBoolean r1 = r3.m     // Catch:{ all -> 0x0020 }
            r2 = 0
            r1.set(r2)     // Catch:{ all -> 0x0020 }
            r3.h()     // Catch:{ all -> 0x0020 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            return
        L_0x0020:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0020 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.download.a.a.d():void");
    }

    public void b() {
        synchronized (this.f28425e) {
            if (!this.l.get()) {
                f28421a.decrementAndGet();
                this.l.set(true);
                for (N a2 : this.h.values()) {
                    a2.a();
                }
                this.h.clear();
                this.i.f28431b = this.j;
                this.j.f28430a = this.i;
            }
        }
        this.f28426f.removeMessages(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_BROADCAST);
    }

    private static void a(N n2) {
        n2.f28430a.f28431b = n2.f28431b;
        n2.f28431b.f28430a = n2.f28430a;
    }

    private void b(N n2) {
        if (n2 != null) {
            n2.f28432c = null;
            n2.f28430a = null;
            n2.f28431b = null;
            n2.f28434e = null;
            n2.f28433d = null;
            n2.f28435f = null;
            n2.a();
            if (this.p.size() < 50) {
                this.p.add(n2);
            }
        }
    }

    public void handleMsg(Message message) {
        N n2;
        if (message.what == 1001 || message.what == 1002) {
            C0336a aVar = (C0336a) message.obj;
            if (aVar != null) {
                synchronized (this.f28425e) {
                    if (message.what == 1001) {
                        n2 = aVar.f28427a;
                    } else {
                        n2 = null;
                    }
                    aVar.f28427a = null;
                    aVar.f28428b = 0;
                    this.o.add(aVar);
                    if (n2 != null) {
                        if (!this.l.get() && message.arg1 == this.n) {
                            this.h.remove(n2.f28432c);
                        }
                        a(n2.f28432c, n2.f28433d, n2.f28434e, n2.b(), n2.f28435f);
                        b(n2);
                    }
                }
                h();
            }
        }
    }

    private static void a(N n2, N n3) {
        n3.f28431b = n2.f28431b;
        n3.f28430a = n2;
        n3.f28431b.f28430a = n3;
        n2.f28431b = n3;
    }

    protected a(int i2, int i3, String str) {
        this(i2, i3, str, false);
    }

    public void a(K k2, T t, E e2, V v) {
        if (k2 != null) {
            synchronized (this.f28425e) {
                if (!this.l.get()) {
                    b bVar = (b) this.h.get(k2);
                    if (bVar != null) {
                        if (v != null) {
                            bVar.a(v);
                        }
                        if (!(bVar.f28431b == null || bVar.f28430a == null || bVar.f28430a == this.i)) {
                            a(bVar);
                            a(this.i, bVar);
                        }
                    } else {
                        b e3 = e();
                        e3.f28432c = k2;
                        e3.f28433d = t;
                        if (v != null) {
                            e3.a(v);
                        }
                        e3.f28434e = e2;
                        a(this.i, e3);
                        this.h.put(k2, e3);
                        if (this.h.size() > this.f28423c) {
                            this.h.remove(this.j.f28430a.f28432c);
                            N n2 = this.j.f28430a;
                            a(this.j.f28430a);
                            b(n2);
                        }
                    }
                    h();
                }
            }
        }
    }

    protected a(int i2, int i3, String str, boolean z) {
        this.f28425e = new Object();
        this.k = false;
        this.o = new LinkedList<>();
        this.p = new ArrayList<>();
        if (i3 > 0) {
            this.f28423c = i2 <= i3 ? i3 + 1 : i2;
            this.f28424d = i3;
            this.f28422b = str;
            this.n = 1;
            this.l = new AtomicBoolean();
            this.m = new AtomicBoolean();
            this.h = new HashMap<>();
            if (!this.k) {
                this.i = e();
                this.j = e();
                this.i.f28431b = this.j;
                this.j.f28430a = this.i;
                this.k = true;
            }
            if (z) {
                this.f28426f = new WeakHandler(Looper.getMainLooper(), this);
            } else {
                this.f28426f = new WeakHandler(this);
            }
            for (int i4 = 0; i4 < i3; i4++) {
                this.o.add(new C0336a());
            }
            return;
        }
        throw new IllegalArgumentException("maxWorker must be great than 1");
    }
}
