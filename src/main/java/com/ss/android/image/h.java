package com.ss.android.image;

import android.os.Looper;
import android.os.Message;
import com.bytedance.common.utility.collection.WeakContainer;
import com.bytedance.common.utility.collection.WeakHandler;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicLong;

public final class h implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static h f29255a = new h();

    /* renamed from: c  reason: collision with root package name */
    public static final AtomicLong f29256c = new AtomicLong();

    /* renamed from: b  reason: collision with root package name */
    public long f29257b;

    /* renamed from: d  reason: collision with root package name */
    final Object f29258d = new Object();

    /* renamed from: e  reason: collision with root package name */
    int f29259e = 0;

    /* renamed from: f  reason: collision with root package name */
    int f29260f = 0;
    WeakReference<b> g;
    public final AtomicLong h = new AtomicLong(0);
    public boolean i = false;
    public WeakHandler j = new WeakHandler(Looper.getMainLooper(), this);
    final WeakContainer<Object> k = new WeakContainer<>();
    public final Runnable l = new Runnable() {
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x0043, code lost:
            return;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void run() {
            /*
                r4 = this;
                com.ss.android.image.h r0 = com.ss.android.image.h.this
                java.util.concurrent.atomic.AtomicLong r1 = r0.h
                r1.get()
                java.util.concurrent.atomic.AtomicLong r1 = com.ss.android.image.h.f29256c
                r1.get()
                com.bytedance.common.utility.collection.WeakContainer<java.lang.Object> r1 = r0.k
                java.util.Iterator r1 = r1.iterator()
            L_0x0012:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L_0x001c
                r1.next()
                goto L_0x0012
            L_0x001c:
                java.lang.Object r1 = r0.f29258d
                monitor-enter(r1)
                int r2 = r0.f29259e     // Catch:{ all -> 0x0044 }
                int r3 = r0.f29260f     // Catch:{ all -> 0x0044 }
                if (r2 == r3) goto L_0x0042
                int r2 = r0.f29259e     // Catch:{ all -> 0x0044 }
                r0.f29260f = r2     // Catch:{ all -> 0x0044 }
                r2 = 0
                java.lang.ref.WeakReference<com.ss.android.image.b> r3 = r0.g     // Catch:{ all -> 0x0044 }
                if (r3 == 0) goto L_0x0036
                java.lang.ref.WeakReference<com.ss.android.image.b> r2 = r0.g     // Catch:{ all -> 0x0044 }
                java.lang.Object r2 = r2.get()     // Catch:{ all -> 0x0044 }
                com.ss.android.image.b r2 = (com.ss.android.image.b) r2     // Catch:{ all -> 0x0044 }
            L_0x0036:
                if (r2 != 0) goto L_0x003a
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                return
            L_0x003a:
                com.ss.android.image.h$a r3 = new com.ss.android.image.h$a     // Catch:{ all -> 0x0044 }
                r3.<init>(r2)     // Catch:{ all -> 0x0044 }
                r3.start()     // Catch:{ all -> 0x0044 }
            L_0x0042:
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                return
            L_0x0044:
                r0 = move-exception
                monitor-exit(r1)     // Catch:{ all -> 0x0044 }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.image.h.AnonymousClass1.run():void");
        }
    };

    class a extends Thread {

        /* renamed from: a  reason: collision with root package name */
        final b f29262a;

        public final void run() {
            System.currentTimeMillis();
            long d2 = b.d();
            System.currentTimeMillis();
            h.this.i = true;
            h.this.h.set(d2);
            h.f29256c.set(0);
            h.this.j.post(h.this.l);
        }

        public a(b bVar) {
            super("CacheSizeThread");
            this.f29262a = bVar;
        }
    }

    public final void handleMsg(Message message) {
    }

    private h() {
    }

    public final int a(b bVar) {
        int i2;
        boolean z = false;
        if (bVar == null) {
            return 0;
        }
        synchronized (this.f29258d) {
            if (this.f29259e > this.f29260f) {
                z = true;
            }
            this.f29259e++;
            this.g = new WeakReference<>(bVar);
            if (!z) {
                this.f29260f = this.f29259e;
                new a(bVar).start();
            }
            i2 = this.f29259e;
        }
        return i2;
    }
}
