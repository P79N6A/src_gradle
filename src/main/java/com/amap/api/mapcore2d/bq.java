package com.amap.api.mapcore2d;

public class bq {

    /* renamed from: a  reason: collision with root package name */
    private Thread[] f5775a;

    public void a() {
        try {
            for (Thread thread : this.f5775a) {
                thread.setDaemon(true);
                thread.start();
            }
        } catch (Throwable th) {
            cm.a(th, "ThreadPool", "start");
        }
    }

    public void b() {
        if (this.f5775a != null) {
            int length = this.f5775a.length;
            for (int i = 0; i < length; i++) {
                this.f5775a[i].interrupt();
                this.f5775a[i] = null;
            }
            this.f5775a = null;
        }
    }

    public bq(int i, Runnable runnable, Runnable runnable2) {
        this.f5775a = new Thread[i];
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 != 0 || i <= 1) {
                this.f5775a[i2] = new Thread(runnable2);
            } else {
                this.f5775a[i2] = new Thread(runnable);
            }
        }
    }
}
