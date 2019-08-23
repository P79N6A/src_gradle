package com.xiaomi.clientreport.manager;

import com.xiaomi.push.be;

public class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ a f81722a;

    b(a aVar) {
        this.f81722a = aVar;
    }

    public void run() {
        a.a(this.f81722a).execute(new be(a.a(this.f81722a), a.a(this.f81722a)));
    }
}
