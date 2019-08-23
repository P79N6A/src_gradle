package com.xiaomi.push;

import com.xiaomi.push.aj;

public class al extends aj.b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ aj f81829a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    al(aj ajVar, aj.a aVar) {
        super(aVar);
        this.f81829a = ajVar;
    }

    /* access modifiers changed from: package-private */
    public void b() {
        synchronized (aj.a(this.f81829a)) {
            aj.a(this.f81829a).remove(this.f81827a.a());
        }
    }
}
