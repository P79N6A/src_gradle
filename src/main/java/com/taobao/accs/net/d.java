package com.taobao.accs.net;

import com.taobao.accs.utl.ALog;

public class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f78998a;

    public void run() {
        if (this.f78998a.f78993e.c()) {
            ALog.e(this.f78998a.d(), "receive ping time out! ", new Object[0]);
            f.a(this.f78998a.f78992d).c();
            this.f78998a.a("", false, "receive ping timeout");
            this.f78998a.f78993e.a(-12);
        }
    }

    d(b bVar) {
        this.f78998a = bVar;
    }
}
