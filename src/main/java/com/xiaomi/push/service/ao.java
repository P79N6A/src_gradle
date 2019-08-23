package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;

public class ao extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ al.b.c f82514a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ao(al.b.c cVar, int i) {
        super(i);
        this.f82514a = cVar;
    }

    public String a() {
        return "check peer job";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m611a() {
        if (al.a().a(this.f82514a.f946a.g, this.f82514a.f946a.f942b).f933a == null) {
            al.b.a(al.b.this).a(this.f82514a.f946a.g, this.f82514a.f946a.f942b, 2, null, null);
        }
    }
}
