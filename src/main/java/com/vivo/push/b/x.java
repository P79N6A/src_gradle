package com.vivo.push.b;

import com.vivo.push.a;
import com.vivo.push.y;

public final class x extends y {

    /* renamed from: a  reason: collision with root package name */
    private int f81528a;

    public final boolean c() {
        return true;
    }

    public final String toString() {
        return "PushModeCommand";
    }

    public final int d() {
        return this.f81528a;
    }

    public x() {
        super(2011);
    }

    public final void a(int i) {
        this.f81528a = i;
    }

    public final void c(a aVar) {
        aVar.a("com.bbk.push.ikey.MODE_TYPE", this.f81528a);
    }

    public final void d(a aVar) {
        this.f81528a = aVar.b("com.bbk.push.ikey.MODE_TYPE", 0);
    }
}
