package com.amap.api.services.a;

public abstract class ef implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    a f6871d;

    interface a {
        void a(ef efVar);

        void b(ef efVar);
    }

    public abstract void a();

    public final void run() {
        try {
            if (this.f6871d != null) {
                this.f6871d.a(this);
            }
            if (!Thread.interrupted()) {
                a();
                if (!Thread.interrupted() && this.f6871d != null) {
                    this.f6871d.b(this);
                }
            }
        } catch (Throwable th) {
            ca.c(th, "ThreadTask", "run");
        }
    }
}
