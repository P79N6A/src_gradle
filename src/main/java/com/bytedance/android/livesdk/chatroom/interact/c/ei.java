package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.n;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ei implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10618a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10619b;

    ei(ec ecVar) {
        this.f10619b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10618a, false, 4879, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10618a, false, 4879, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10619b;
        ecVar.f10606e = false;
        if (ecVar.p != null) {
            ecVar.p.d();
        }
        e.a().a((Integer) 0);
        ecVar.q.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
        a.a().a((Object) new n(1));
    }
}
