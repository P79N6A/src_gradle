package com.xiaomi.push.service;

import com.xiaomi.push.service.al;

public final class y implements al.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82603a;

    y(XMPushService xMPushService) {
        this.f82603a = xMPushService;
    }

    public final void a(al.c cVar, al.c cVar2, int i) {
        if (cVar2 == al.c.binded) {
            o.a(this.f82603a);
            o.b(this.f82603a);
        } else if (cVar2 == al.c.unbind) {
            o.a(this.f82603a, 70000001, " the push is not connected.");
        }
    }
}
