package com.vivo.push;

import com.vivo.push.p;

public final class u implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f81649a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ p f81650b;

    public final void run() {
        p.a c2 = this.f81650b.c(this.f81649a);
        if (c2 != null) {
            c2.a(1003, new Object[0]);
        }
    }

    u(p pVar, String str) {
        this.f81650b = pVar;
        this.f81649a = str;
    }
}
