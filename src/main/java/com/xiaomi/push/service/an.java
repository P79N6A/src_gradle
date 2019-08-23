package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;

public class an extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ al.b.c f82513a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    an(al.b.c cVar, int i) {
        super(i);
        this.f82513a = cVar;
    }

    public String a() {
        return "clear peer job";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m610a() {
        if (this.f82513a.f82507a == this.f82513a.f946a.f933a) {
            b.b("clean peer, chid = " + this.f82513a.f946a.g);
            this.f82513a.f946a.f933a = null;
        }
    }
}
