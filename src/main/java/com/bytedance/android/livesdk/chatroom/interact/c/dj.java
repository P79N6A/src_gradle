package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.n;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dj implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10562a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10563b;

    dj(cy cyVar) {
        this.f10563b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10562a, false, 4834, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10562a, false, 4834, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10563b;
        cyVar.b((Throwable) obj);
        cyVar.l = false;
        if (cyVar.i) {
            if (cyVar.t != null) {
                cyVar.t.d();
            }
            e.a().a((Integer) 0);
            cyVar.v.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
            a.a().a((Object) new n(1));
        } else if (cyVar.t != null) {
            cyVar.t.e();
        }
    }
}
