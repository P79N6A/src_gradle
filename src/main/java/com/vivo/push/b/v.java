package com.vivo.push.b;

import com.vivo.push.a;

public abstract class v extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f81526a;

    /* renamed from: b  reason: collision with root package name */
    private long f81527b;

    public final long f() {
        return this.f81527b;
    }

    public final String i() {
        return this.f81526a;
    }

    public v(int i) {
        super(i);
    }

    public void c(a aVar) {
        super.c(aVar);
        aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT", this.f81526a);
        aVar.a("notify_id", this.f81527b);
    }

    public void d(a aVar) {
        super.d(aVar);
        this.f81526a = aVar.a("OnVerifyCallBackCommand.EXTRA_SECURITY_CONTENT");
        this.f81527b = aVar.b("notify_id", -1);
    }
}
