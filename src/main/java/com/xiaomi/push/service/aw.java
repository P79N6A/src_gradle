package com.xiaomi.push.service;

import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.gj;
import com.xiaomi.push.hb;
import com.xiaomi.push.service.XMPushService;

public class aw extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    private gj f82531a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f954a;

    public aw(XMPushService xMPushService, gj gjVar) {
        super(4);
        this.f954a = xMPushService;
        this.f82531a = gjVar;
    }

    public String a() {
        return "send a message.";
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m616a() {
        try {
            if (this.f82531a != null) {
                this.f954a.a(this.f82531a);
            }
        } catch (hb e2) {
            b.a((Throwable) e2);
            this.f954a.a(10, (Exception) e2);
        }
    }
}
