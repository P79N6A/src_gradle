package com.benchmark;

import android.os.RemoteException;
import android.os.SystemClock;

public final class f implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public Benchmark f7500a;

    /* renamed from: b  reason: collision with root package name */
    public j f7501b;

    /* renamed from: c  reason: collision with root package name */
    public g f7502c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f7503d;

    public final void run() {
        try {
            this.f7502c.a(this.f7500a);
        } catch (RemoteException e2) {
            a.a((Throwable) e2);
        }
        try {
            long[] jArr = new long[this.f7500a.times];
            int i = 0;
            int i2 = 0;
            while (true) {
                if (i >= this.f7500a.times) {
                    break;
                }
                long uptimeMillis = SystemClock.uptimeMillis();
                int a2 = this.f7501b.a();
                if (a2 != 0) {
                    i2 = a2;
                    break;
                }
                jArr[i] = SystemClock.uptimeMillis() - uptimeMillis;
                i++;
                i2 = a2;
            }
            if (i2 == 0) {
                this.f7502c.a(this.f7500a, jArr);
                return;
            }
            g gVar = this.f7502c;
            Benchmark benchmark = this.f7500a;
            gVar.a(benchmark, "return failed with code " + i2);
        } catch (Exception e3) {
            try {
                this.f7502c.a(this.f7500a, e3.getMessage());
            } catch (RemoteException unused) {
                a.a((Throwable) e3);
            }
        }
    }

    public f(Benchmark benchmark, j jVar, g gVar) {
        this.f7500a = benchmark;
        this.f7501b = jVar;
        this.f7502c = gVar;
    }
}
