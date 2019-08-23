package com.xiaomi.push.service;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class v extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82600a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1013a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f1014a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ String f82601b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    v(int i, XMPushService xMPushService, jg jgVar, String str, String str2) {
        super(i);
        this.f1013a = xMPushService;
        this.f82600a = jgVar;
        this.f1014a = str;
        this.f82601b = str2;
    }

    public final String a() {
        return "send wrong message ack for message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m650a() {
        try {
            jg a2 = p.a((Context) this.f1013a, this.f82600a);
            a2.f692a.a("error", this.f1014a);
            a2.f692a.a("reason", this.f82601b);
            w.a(this.f1013a, a2);
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1013a.a(10, (Exception) e2);
        }
    }
}
