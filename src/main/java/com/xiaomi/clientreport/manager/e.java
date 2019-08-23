package com.xiaomi.clientreport.manager;

import com.xiaomi.push.bc;

public class e implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f81725a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ bc f69a;

    e(a aVar, bc bcVar) {
        this.f81725a = aVar;
        this.f69a = bcVar;
    }

    public void run() {
        this.f69a.run();
    }
}
