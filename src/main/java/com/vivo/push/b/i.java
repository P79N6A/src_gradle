package com.vivo.push.b;

import com.vivo.push.a;
import com.vivo.push.y;

public final class i extends y {

    /* renamed from: a  reason: collision with root package name */
    private String f81504a;

    public i() {
        super(2013);
    }

    public final void c(a aVar) {
        aVar.a("MsgArriveCommand.MSG_TAG", this.f81504a);
    }

    public i(String str) {
        this();
        this.f81504a = str;
    }

    public final void d(a aVar) {
        this.f81504a = aVar.a("MsgArriveCommand.MSG_TAG");
    }
}
