package com.xiaomi.push;

public class ca implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ bz f81883a;

    ca(bz bzVar) {
        this.f81883a = bzVar;
    }

    public void run() {
        if (bm.a().b()) {
            this.f81883a.c();
        } else {
            this.f81883a.d();
        }
    }
}
