package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gj;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

public class c extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    private XMPushService f82559a;

    /* renamed from: a  reason: collision with other field name */
    private gj[] f982a;

    public c(XMPushService xMPushService, gj[] gjVarArr) {
        super(4);
        this.f82559a = xMPushService;
        this.f982a = gjVarArr;
    }

    public String a() {
        return "batch send message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m627a() {
        try {
            if (this.f982a != null) {
                this.f82559a.a(this.f982a);
            }
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f82559a.a(10, (Exception) e2);
        }
    }
}
