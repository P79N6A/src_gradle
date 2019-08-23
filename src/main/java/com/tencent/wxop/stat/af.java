package com.tencent.wxop.stat;

import com.tencent.wxop.stat.a.n;
import java.util.TimerTask;

public final class af extends TimerTask {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ ae f79839a;

    af(ae aeVar) {
        this.f79839a = aeVar;
    }

    public final void run() {
        if (d.b()) {
            n.c().a("TimerTask run");
        }
        g.c(this.f79839a.f79837a);
        cancel();
        this.f79839a.a();
    }
}
