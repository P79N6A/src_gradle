package com.vivo.push.b;

import com.vivo.push.a;

public final class j extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f81505a;

    /* renamed from: b  reason: collision with root package name */
    private String f81506b;

    /* renamed from: c  reason: collision with root package name */
    private String f81507c;

    public final String toString() {
        return "OnBindCommand";
    }

    public final String d() {
        return this.f81505a;
    }

    public final String e() {
        return this.f81507c;
    }

    public j(int i) {
        super(i);
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a("app_id", this.f81505a);
        aVar.a("client_id", this.f81506b);
        aVar.a("client_token", this.f81507c);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81505a = aVar.a("app_id");
        this.f81506b = aVar.a("client_id");
        this.f81507c = aVar.a("client_token");
    }
}
