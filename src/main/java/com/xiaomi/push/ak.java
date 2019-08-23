package com.xiaomi.push;

import com.xiaomi.push.aj;

public class ak extends aj.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ aj f81828a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ String f151a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ak(aj ajVar, aj.a aVar, String str) {
        super(aVar);
        this.f81828a = ajVar;
        this.f151a = str;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        super.a();
    }

    /* access modifiers changed from: package-private */
    public void b() {
        aj.a(this.f81828a).edit().putLong(this.f151a, System.currentTimeMillis()).commit();
    }
}
