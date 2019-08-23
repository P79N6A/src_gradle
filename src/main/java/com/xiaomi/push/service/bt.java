package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

public class bt extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ XMPushService f82558a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f980a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ byte[] f981a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    bt(XMPushService xMPushService, int i, String str, byte[] bArr) {
        super(i);
        this.f82558a = xMPushService;
        this.f980a = str;
        this.f981a = bArr;
    }

    public String a() {
        return "send mi push message";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m626a() {
        try {
            w.a(this.f82558a, this.f980a, this.f981a);
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f82558a.a(10, (Exception) e2);
        }
    }
}
