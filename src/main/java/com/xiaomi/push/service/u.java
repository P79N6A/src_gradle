package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class u extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82599a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1011a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1012a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    u(int i, XMPushService xMPushService, jg jgVar, String str) {
        super(i);
        this.f1011a = xMPushService;
        this.f82599a = jgVar;
        this.f1012a = str;
    }

    public final String a() {
        return "send app absent ack message for message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m649a() {
        try {
            jg a2 = p.a((Context) this.f1011a, this.f82599a);
            a2.a().a("absent_target_package", this.f1012a);
            w.a(this.f1011a, a2);
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1011a.a(10, (Exception) e2);
        }
    }
}
