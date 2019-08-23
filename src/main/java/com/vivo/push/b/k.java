package com.vivo.push.b;

import com.vivo.push.a;

public final class k extends s {

    /* renamed from: a  reason: collision with root package name */
    private int f81508a = -1;

    /* renamed from: b  reason: collision with root package name */
    private int f81509b = -1;

    public final String toString() {
        return "OnChangePushStatusCommand";
    }

    public final int d() {
        return this.f81508a;
    }

    public final int e() {
        return this.f81509b;
    }

    public k() {
        super(12);
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f81508a);
        aVar.a("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f81509b);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81508a = aVar.b("OnChangePushStatus.EXTRA_REQ_SERVICE_STATUS", this.f81508a);
        this.f81509b = aVar.b("OnChangePushStatus.EXTRA_REQ_RECEIVER_STATUS", this.f81509b);
    }
}
