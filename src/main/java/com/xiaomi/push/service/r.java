package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class r extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82592a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1003a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    r(int i, XMPushService xMPushService, jg jgVar) {
        super(i);
        this.f1003a = xMPushService;
        this.f82592a = jgVar;
    }

    public final String a() {
        return "send ack message for message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m646a() {
        try {
            w.a(this.f1003a, p.a((Context) this.f1003a, this.f82592a));
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1003a.a(10, (Exception) e2);
        }
    }
}
