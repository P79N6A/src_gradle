package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.event.n;
import com.bytedance.android.livesdk.chatroom.event.q;
import com.bytedance.android.livesdk.u.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ej implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10620a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10621b;

    ej(ec ecVar) {
        this.f10621b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10620a, false, 4880, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10620a, false, 4880, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10621b;
        ecVar.b((Throwable) obj);
        ecVar.f10606e = false;
        if (ecVar.l) {
            if (ecVar.p != null) {
                ecVar.p.d();
            }
            e.a().a((Integer) 0);
            ecVar.q.lambda$put$1$DataCenter("cmd_interact_state_change", new q(8));
            a.a().a((Object) new n(1));
        } else if (ecVar.p != null) {
            ecVar.p.e();
        }
    }
}