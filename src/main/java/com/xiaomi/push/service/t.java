package com.xiaomi.push.service;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.jg;
import com.xiaomi.push.service.XMPushService;

public final class t extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ jg f82598a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ XMPushService f1010a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    t(int i, XMPushService xMPushService, jg jgVar) {
        super(i);
        this.f1010a = xMPushService;
        this.f82598a = jgVar;
    }

    public final String a() {
        return "send ack message for unrecognized new miui message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public final void m648a() {
        try {
            jg a2 = p.a((Context) this.f1010a, this.f82598a);
            a2.a().a("miui_message_unrecognized", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
            w.a(this.f1010a, a2);
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f1010a.a(10, (Exception) e2);
        }
    }
}
