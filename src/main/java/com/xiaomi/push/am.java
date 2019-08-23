package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

public class am {

    /* renamed from: a  reason: collision with root package name */
    private int f81830a;

    /* renamed from: a  reason: collision with other field name */
    private Handler f152a;

    /* renamed from: a  reason: collision with other field name */
    private a f153a;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with other field name */
    public volatile b f154a;

    /* renamed from: a  reason: collision with other field name */
    private volatile boolean f155a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f81831b;

    class a extends Thread {

        /* renamed from: a  reason: collision with other field name */
        private final LinkedBlockingQueue<b> f156a = new LinkedBlockingQueue<>();

        public a() {
            super("PackageProcessor");
        }

        private void a(int i, b bVar) {
            am.a(am.this).sendMessage(am.a(am.this).obtainMessage(i, bVar));
        }

        public void a(b bVar) {
            try {
                this.f156a.add(bVar);
            } catch (Exception unused) {
            }
        }

        public void run() {
            long a2 = am.a(am.this) > 0 ? (long) am.a(am.this) : Long.MAX_VALUE;
            while (!am.a(am.this)) {
                try {
                    b poll = this.f156a.poll(a2, TimeUnit.SECONDS);
                    b unused = am.this.f154a = poll;
                    if (poll != null) {
                        a(0, poll);
                        poll.b();
                        a(1, poll);
                    } else if (am.a(am.this) > 0) {
                        am.a(am.this);
                    }
                } catch (InterruptedException e2) {
                    com.xiaomi.channel.commonutils.logger.b.a((Throwable) e2);
                }
            }
        }
    }

    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        public void c() {
        }
    }

    public am() {
        this(false);
    }

    public am(boolean z) {
        this(z, 0);
    }

    public am(boolean z, int i) {
        this.f152a = new an(this, Looper.getMainLooper());
        this.f81831b = z;
        this.f81830a = i;
    }

    private void a() {
        synchronized (this) {
            this.f153a = null;
            this.f155a = true;
        }
    }

    public void a(b bVar) {
        synchronized (this) {
            if (this.f153a == null) {
                this.f153a = new a();
                this.f153a.setDaemon(this.f81831b);
                this.f155a = false;
                this.f153a.start();
            }
            this.f153a.a(bVar);
        }
    }

    public void a(b bVar, long j) {
        this.f152a.postDelayed(new ao(this, bVar), j);
    }
}
