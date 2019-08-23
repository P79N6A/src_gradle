package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class q extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82591a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1002a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    q(int i, XMPushService xMPushService, jg jgVar) {
        super(i);
        this.f1002a = xMPushService;
        this.f82591a = jgVar;
    }

    public final String a() {
        return "send app absent message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m645a() {
        try {
            w.a(this.f1002a, w.a(this.f82591a.b(), this.f82591a.a()));
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1002a.a(10, (Exception) e2);
        }
    }
}
