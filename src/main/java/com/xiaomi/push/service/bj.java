package com.xiaomi.push.service;

import com.xiaomi.push.gq;
import com.xiaomi.push.service.XMPushService;

public class bj extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82547a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bj(XMPushService xMPushService, int i) {
        super(i);
        this.f82547a = xMPushService;
    }

    public String a() {
        return "disconnect for service destroy.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m623a() {
        if (XMPushService.a(this.f82547a) != null) {
            XMPushService.a(this.f82547a).b(15, (Exception) null);
            gq unused = this.f82547a.f892a = null;
        }
    }
}
