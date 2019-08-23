package com.vivo.push.b;

import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.vivo.push.a;

public final class n extends s {

    /* renamed from: a  reason: collision with root package name */
    private String f81511a;

    /* renamed from: b  reason: collision with root package name */
    private int f81512b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f81513c;

    public final String toString() {
        return "OnLogCommand";
    }

    public final String d() {
        return this.f81511a;
    }

    public final int e() {
        return this.f81512b;
    }

    public final boolean f() {
        return this.f81513c;
    }

    public n() {
        super(7);
    }

    public final void a(int i) {
        this.f81512b = i;
    }

    public final void b(String str) {
        this.f81511a = str;
    }

    public final void a(boolean z) {
        this.f81513c = z;
    }

    public final void c(a aVar) {
        super.c(aVar);
        aVar.a(PushConstants.CONTENT, this.f81511a);
        aVar.a("log_level", this.f81512b);
        aVar.a("is_server_log", this.f81513c);
    }

    public final void d(a aVar) {
        super.d(aVar);
        this.f81511a = aVar.a(PushConstants.CONTENT);
        this.f81512b = aVar.b("log_level", 0);
        this.f81513c = aVar.d("is_server_log");
    }
}
