package com.tencent.wxop.stat;

import android.content.Context;

public final class k implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ Context f79911a;

    k(Context context) {
        this.f79911a = context;
    }

    public final void run() {
        try {
            new Thread(new o(this.f79911a, null, null), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            g.a(this.f79911a, th);
        }
    }
}
