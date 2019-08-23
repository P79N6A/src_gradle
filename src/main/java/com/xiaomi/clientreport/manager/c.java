package com.xiaomi.clientreport.manager;

import com.xiaomi.push.be;

public class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f81723a;

    c(a aVar) {
        this.f81723a = aVar;
    }

    public void run() {
        a.a(this.f81723a).execute(new be(a.a(this.f81723a), a.a(this.f81723a)));
    }
}
