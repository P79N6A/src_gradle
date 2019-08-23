package com.taobao.accs.data;

import com.taobao.accs.ut.monitor.TrafficsMonitor;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ TrafficsMonitor.a f78950a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ d f78951b;

    public void run() {
        if (this.f78951b.f78946c != null) {
            this.f78951b.f78946c.a(this.f78950a);
        }
    }

    e(d dVar, TrafficsMonitor.a aVar) {
        this.f78951b = dVar;
        this.f78950a = aVar;
    }
}
