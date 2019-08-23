package com.xiaomi.push.service;

import com.xiaomi.push.at;
import com.xiaomi.push.service.XMPushService;

public class bq extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82554a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bq(XMPushService xMPushService, int i) {
        super(i);
        this.f82554a = xMPushService;
    }

    public String a() {
        return "prepare the mi push account.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m624a() {
        w.a(this.f82554a);
        if (at.b(this.f82554a)) {
            this.f82554a.a(true);
        }
    }
}
