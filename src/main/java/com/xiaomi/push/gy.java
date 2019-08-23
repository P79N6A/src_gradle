package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

public class gy extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ long f82138a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ gx f474a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gy(gx gxVar, int i, long j) {
        super(i);
        this.f474a = gxVar;
        this.f82138a = j;
    }

    public String a() {
        return "check the ping-pong." + this.f82138a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m357a() {
        Thread.yield();
        if (this.f474a.c() && !this.f474a.a(this.f82138a)) {
            this.f474a.f82133b.a(22, (Exception) null);
            this.f474a.f82133b.a(true);
        }
    }
}
