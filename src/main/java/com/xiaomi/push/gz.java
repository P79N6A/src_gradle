package com.xiaomi.push;

import com.xiaomi.push.service.XMPushService;

public class gz extends XMPushService.i {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ gx f82139a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ Exception f475a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ int f82140b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    gz(gx gxVar, int i, int i2, Exception exc) {
        super(i);
        this.f82139a = gxVar;
        this.f82140b = i2;
        this.f475a = exc;
    }

    public String a() {
        return "shutdown the connection. " + this.f82140b + ", " + this.f475a;
    }

    /* renamed from: a  reason: collision with other method in class */
    public void m358a() {
        this.f82139a.f82133b.a(this.f82140b, this.f475a);
    }
}
