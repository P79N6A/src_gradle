package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.c.ec;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class el implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10624a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10625b;

    el(ec ecVar) {
        this.f10625b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10624a, false, 4882, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10624a, false, 4882, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10625b;
        ecVar.f10603b = false;
        ((ec.b) ecVar.b()).a(((c) obj).f7867b);
    }
}
