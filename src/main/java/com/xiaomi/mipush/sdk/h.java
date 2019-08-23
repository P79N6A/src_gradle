package com.xiaomi.mipush.sdk;

import com.xiaomi.push.ip;
import com.xiaomi.push.service.ag;

public class h extends ag.a {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ g f81795a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    h(g gVar, int i, String str) {
        super(i, str);
        this.f81795a = gVar;
    }

    public void a() {
        boolean a2 = ag.a(g.a(this.f81795a)).a(ip.AggregatePushSwitch.a(), true);
        if (g.a(this.f81795a) != a2) {
            boolean unused = this.f81795a.f129a = a2;
            j.b(g.a(this.f81795a));
        }
    }
}
