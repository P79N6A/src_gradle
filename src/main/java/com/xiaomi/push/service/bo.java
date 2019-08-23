package com.xiaomi.push.service;

import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.al;

public class bo implements al.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82552a;

    bo(XMPushService xMPushService) {
        this.f82552a = xMPushService;
    }

    public void a() {
        XMPushService.a(this.f82552a);
        if (al.a().a() <= 0) {
            this.f82552a.a((XMPushService.i) new XMPushService.f(12, null));
        }
    }
}
