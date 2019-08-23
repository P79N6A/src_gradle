package com.unicom.xiaowo.login.c;

import android.net.Network;
import com.unicom.xiaowo.login.d.a;
import com.unicom.xiaowo.login.d.f;

public final class i implements f {

    /* renamed from: a  reason: collision with root package name */
    private /* synthetic */ h f81446a;

    i(h hVar) {
        this.f81446a = hVar;
    }

    public final void a(boolean z, Network network) {
        "ForceMobileNet result:".concat(String.valueOf(z));
        if (z) {
            this.f81446a.f81445d.a(this.f81446a.f81443b, network, this.f81446a.f81444c);
            return;
        }
        this.f81446a.f81444c.a(2, "获取鉴权信息失败");
        a.a().b();
    }
}
