package com.xiaomi.push;

import com.xiaomi.push.am;
import com.xiaomi.push.ec;

public class ee extends am.b {

    /* renamed from: a  reason: collision with root package name */
    am.b f81974a;

    /* renamed from: a  reason: collision with other field name */
    final /* synthetic */ ec f310a;

    ee(ec ecVar) {
        this.f310a = ecVar;
    }

    public void b() {
        ec.b bVar = (ec.b) ec.a(this.f310a).peek();
        if (bVar != null && bVar.a()) {
            if (ec.a(this.f310a).remove(bVar)) {
                this.f81974a = bVar;
            }
            if (this.f81974a != null) {
                this.f81974a.b();
            }
        }
    }

    public void c() {
        if (this.f81974a != null) {
            this.f81974a.c();
        }
    }
}
