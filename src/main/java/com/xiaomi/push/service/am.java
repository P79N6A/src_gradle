package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;

public class am implements al.b.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ al.b f82512a;

    am(al.b bVar) {
        this.f82512a = bVar;
    }

    public void a(al.c cVar, al.c cVar2, int i) {
        if (cVar2 == al.c.binding) {
            al.b.a(this.f82512a).a((XMPushService.i) al.b.a(this.f82512a), 60000);
        } else {
            al.b.a(this.f82512a).b((XMPushService.i) al.b.a(this.f82512a));
        }
    }
}
