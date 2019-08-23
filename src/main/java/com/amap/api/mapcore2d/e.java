package com.amap.api.mapcore2d;

import android.os.Handler;
import android.os.Looper;

public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    protected int f5994a;

    /* renamed from: b  reason: collision with root package name */
    protected int f5995b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Handler f5996c;

    /* renamed from: d  reason: collision with root package name */
    private int f5997d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f5998e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f5999f = true;
    private Runnable g = new Runnable() {
        public void run() {
            e.this.h();
            if (!e.this.f()) {
                if (e.this.f5996c != null) {
                    e.this.f5996c.removeCallbacks(this);
                }
                Handler unused = e.this.f5996c = null;
                if (e.this.f5999f) {
                    e.this.c();
                } else {
                    e.this.b();
                }
            } else {
                long currentTimeMillis = System.currentTimeMillis();
                e.this.a();
                e.this.i();
                long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                if (currentTimeMillis2 < ((long) e.this.f5995b)) {
                    try {
                        Thread.sleep(((long) e.this.f5995b) - currentTimeMillis2);
                    } catch (InterruptedException e2) {
                        cm.a(e2, "AnimBase", "run");
                    }
                }
            }
        }
    };

    private void g() {
        this.f5998e = false;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    /* access modifiers changed from: protected */
    public abstract void c();

    public boolean f() {
        return this.f5998e;
    }

    /* access modifiers changed from: private */
    public void i() {
        if (this.f5996c != null) {
            this.f5996c.post(this.g);
        }
    }

    public void e() {
        n.a().b();
        g();
        this.g.run();
    }

    /* access modifiers changed from: private */
    public void h() {
        this.f5997d += this.f5995b;
        if (this.f5994a != -1 && this.f5997d > this.f5994a) {
            g();
            b(true);
        }
    }

    public void d() {
        if (!f()) {
            this.f5996c = new Handler(Looper.getMainLooper());
            this.f5998e = true;
            this.f5999f = false;
            this.f5997d = 0;
        }
        i();
    }

    public void b(boolean z) {
        this.f5999f = z;
    }

    public void a(int i) {
        this.f5994a = i;
    }

    public void a(boolean z) {
        this.f5998e = z;
    }

    public e(int i, int i2) {
        this.f5994a = i;
        this.f5995b = i2;
    }
}
