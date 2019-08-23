package com.xiaomi.push.service;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class s extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82597a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1009a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    s(int i, XMPushService xMPushService, jg jgVar) {
        super(i);
        this.f1009a = xMPushService;
        this.f82597a = jgVar;
    }

    public final String a() {
        return "send ack message for obsleted message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m647a() {
        try {
            jg a2 = p.a((Context) this.f1009a, this.f82597a);
            a2.a().a("message_obsleted", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            w.a(this.f1009a, a2);
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1009a.a(10, (Exception) e2);
        }
    }
}
