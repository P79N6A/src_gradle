package com.xiaomi.push.service;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ic;
import com.xiaomi.push.service.XMPushService;

public class av {

    /* renamed from: c  reason: collision with root package name */
    private static int f82528c = 300000;

    /* renamed from: a  reason: collision with root package name */
    private int f82529a = 500;

    /* renamed from: a  reason: collision with other field name */
    private long f952a;

    /* renamed from: a  reason: collision with other field name */
    private XMPushService f953a;

    /* renamed from: b  reason: collision with root package name */
    private int f82530b;

    public av(XMPushService xMPushService) {
        this.f953a = xMPushService;
    }

    private int a() {
        int i;
        double d2;
        int i2 = 0;
        if (this.f82530b > 8) {
            return 300000;
        }
        double random = (Math.random() * 2.0d) + 1.0d;
        if (this.f82530b > 4) {
            d2 = 60000.0d;
        } else if (this.f82530b > 1) {
            d2 = 10000.0d;
        } else if (this.f952a == 0) {
            return 0;
        } else {
            if (System.currentTimeMillis() - this.f952a >= 300000) {
                i = PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE;
            } else if (this.f82529a >= f82528c) {
                return this.f82529a;
            } else {
                i2 = this.f82529a;
                double d3 = (double) this.f82529a;
                Double.isNaN(d3);
                i = (int) (d3 * 1.5d);
            }
            this.f82529a = i;
            return i2;
        }
        return (int) (random * d2);
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m615a() {
        this.f952a = System.currentTimeMillis();
        this.f953a.a(1);
        this.f82530b = 0;
    }

    public void a(boolean z) {
        if (this.f953a.a()) {
            if (z) {
                if (!this.f953a.a(1)) {
                    this.f82530b++;
                }
                this.f953a.a(1);
                XMPushService xMPushService = this.f953a;
                XMPushService xMPushService2 = this.f953a;
                xMPushService2.getClass();
                xMPushService.a((XMPushService.i) new XMPushService.d());
            } else if (!this.f953a.a(1)) {
                int a2 = a();
                if (!this.f953a.a(1)) {
                    this.f82530b++;
                }
                b.a("schedule reconnect in " + a2 + "ms");
                XMPushService xMPushService3 = this.f953a;
                XMPushService xMPushService4 = this.f953a;
                xMPushService4.getClass();
                xMPushService3.a((XMPushService.i) new XMPushService.d(), (long) a2);
                if (this.f82530b == 2 && ic.a().a()) {
                    ac.b();
                }
                if (this.f82530b == 3) {
                    ac.a();
                }
            }
            return;
        }
        b.c("should not reconnect as no client or network.");
    }
}
