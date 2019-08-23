package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.n;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class di implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10560a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10561b;

    di(cy cyVar) {
        this.f10561b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10560a, false, 4833, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10560a, false, 4833, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10561b;
        cyVar.l = false;
        if (cyVar.t != null) {
            cyVar.t.d();
        }
        e.a().a((Integer) 0);
        cyVar.v.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
        a.a().a((Object) new n(1));
    }
}
