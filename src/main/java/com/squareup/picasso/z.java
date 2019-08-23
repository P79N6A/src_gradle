package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

public final class z {

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f27484a = new HandlerThread("Picasso-Stats", 10);

    /* renamed from: b  reason: collision with root package name */
    final d f27485b;

    /* renamed from: c  reason: collision with root package name */
    final Handler f27486c;

    /* renamed from: d  reason: collision with root package name */
    long f27487d;

    /* renamed from: e  reason: collision with root package name */
    long f27488e;

    /* renamed from: f  reason: collision with root package name */
    long f27489f;
    long g;
    long h;
    long i;
    long j;
    long k;
    int l;
    int m;
    int n;

    static class a extends Handler {

        /* renamed from: a  reason: collision with root package name */
        private final z f27490a;

        public final void handleMessage(final Message message) {
            switch (message.what) {
                case 0:
                    this.f27490a.f27487d++;
                    return;
                case 1:
                    this.f27490a.f27488e++;
                    return;
                case 2:
                    z zVar = this.f27490a;
                    long j = (long) message.arg1;
                    zVar.m++;
                    zVar.g += j;
                    zVar.j = z.a(zVar.m, zVar.g);
                    return;
                case 3:
                    z zVar2 = this.f27490a;
                    long j2 = (long) message.arg1;
                    zVar2.n++;
                    zVar2.h += j2;
                    zVar2.k = z.a(zVar2.m, zVar2.h);
                    return;
                case 4:
                    z zVar3 = this.f27490a;
                    zVar3.l++;
                    zVar3.f27489f += ((Long) message.obj).longValue();
                    zVar3.i = z.a(zVar3.l, zVar3.f27489f);
                    return;
                default:
                    s.f27437a.post(new Runnable() {
                        public final void run() {
                            throw new AssertionError("Unhandled stats message." + message.what);
                        }
                    });
                    return;
            }
        }

        public a(Looper looper, z zVar) {
            super(looper);
            this.f27490a = zVar;
        }
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.f27486c.sendEmptyMessage(0);
    }

    public z(d dVar) {
        this.f27485b = dVar;
        this.f27484a.start();
        ad.a(this.f27484a.getLooper());
        this.f27486c = new a(this.f27484a.getLooper(), this);
    }

    static long a(int i2, long j2) {
        return j2 / ((long) i2);
    }

    /* access modifiers changed from: package-private */
    public void a(Bitmap bitmap, int i2) {
        this.f27486c.sendMessage(this.f27486c.obtainMessage(i2, ad.a(bitmap), 0));
    }
}
