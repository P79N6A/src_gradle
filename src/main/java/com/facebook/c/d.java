package com.facebook.c;

import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import java.lang.ref.WeakReference;

public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    boolean f23413a;

    /* renamed from: b  reason: collision with root package name */
    long f23414b;

    /* renamed from: c  reason: collision with root package name */
    private final WeakReference<b> f23415c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23416d;

    /* renamed from: e  reason: collision with root package name */
    private final int f23417e;

    /* renamed from: f  reason: collision with root package name */
    private long f23418f;
    private int g;
    private long h;

    @TargetApi(16)
    static class a extends d implements Choreographer.FrameCallback {

        /* renamed from: c  reason: collision with root package name */
        private final Choreographer f23419c;

        /* access modifiers changed from: protected */
        public final void a() {
            this.f23419c.postFrameCallback(this);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            this.f23419c.removeFrameCallback(this);
        }

        public final void doFrame(long j) {
            a(j / 1000000);
        }

        private a(b bVar, int i, int i2) {
            super(bVar, i, i2, (byte) 0);
            this.f23419c = Choreographer.getInstance();
        }

        /* synthetic */ a(b bVar, int i, int i2, byte b2) {
            this(bVar, i, i2);
        }
    }

    public interface b {
        void a(float f2);

        void d();
    }

    static class c extends d implements Runnable {

        /* renamed from: c  reason: collision with root package name */
        private final Handler f23420c;

        /* access modifiers changed from: protected */
        public final void a() {
            this.f23420c.postDelayed(this, 25);
        }

        /* access modifiers changed from: protected */
        public final void b() {
            this.f23420c.removeCallbacks(this);
        }

        public final void run() {
            a(SystemClock.uptimeMillis());
        }

        private c(b bVar, int i, int i2) {
            super(bVar, i, i2, (byte) 0);
            this.f23420c = new Handler(Looper.getMainLooper());
        }

        /* synthetic */ c(b bVar, int i, int i2, byte b2) {
            this(bVar, i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public abstract void b();

    public final void c() {
        this.f23413a = false;
        b();
        a();
    }

    public final void d() {
        b();
        this.f23418f = 0;
        this.g = -1;
        ((b) this.f23415c.get()).d();
    }

    /* access modifiers changed from: protected */
    public final void a(long j) {
        boolean z;
        if (this.f23415c.get() == null) {
            b();
            this.f23418f = 0;
            this.h = 0;
            this.g = -1;
            return;
        }
        if (this.f23418f == 0) {
            this.f23418f = j;
        }
        boolean z2 = false;
        if (((int) (j - this.f23418f)) / this.f23417e > this.g) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f23413a || !z) {
            long j2 = (j - this.f23418f) % ((long) this.f23417e);
            if (j - this.h >= this.f23414b) {
                this.h = j;
                z2 = true;
            }
            if (z2) {
                ((b) this.f23415c.get()).a((((float) j2) / ((float) this.f23417e)) * ((float) this.f23416d));
            }
            this.g = ((int) (j - this.f23418f)) / this.f23417e;
            a();
            return;
        }
        ((b) this.f23415c.get()).a((float) this.f23416d);
        d();
    }

    private d(b bVar, int i, int i2) {
        this.f23414b = -1;
        this.f23415c = new WeakReference<>(bVar);
        this.f23416d = i2;
        this.f23417e = Math.round((((float) i2) / ((float) i)) * 1000.0f);
    }

    /* synthetic */ d(b bVar, int i, int i2, byte b2) {
        this(bVar, i, i2);
    }
}
