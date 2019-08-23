package com.amap.api.mapcore2d;

public abstract class ff implements Runnable {

    /* renamed from: d  reason: collision with root package name */
    a f6127d;

    interface a {
        void a(ff ffVar);

        void b(ff ffVar);
    }

    public abstract void a();

    public final void run() {
        try {
            if (this.f6127d != null) {
                this.f6127d.a(this);
            }
            if (!Thread.interrupted()) {
                a();
                if (!Thread.interrupted() && this.f6127d != null) {
                    this.f6127d.b(this);
                }
            }
        } catch (Throwable th) {
            dg.b(th, "ThreadTask", "run");
        }
    }
}
