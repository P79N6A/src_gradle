package com.vivo.push.b;

import com.vivo.push.a;
import com.vivo.push.y;

public final class aa extends y {

    /* renamed from: a  reason: collision with root package name */
    private String f81491a;

    public final String toString() {
        return "StopServiceCommand";
    }

    public aa() {
        super(2008);
    }

    public final void c(a aVar) {
        aVar.a("package_name", this.f81491a);
    }

    public aa(String str) {
        super(2008);
        this.f81491a = str;
    }

    public final void d(a aVar) {
        this.f81491a = aVar.a("package_name");
    }
}
