package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.chatroom.model.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dp implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10574a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10575b;

    dp(cy cyVar) {
        this.f10575b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10574a, false, 4840, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10574a, false, 4840, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10575b;
        b bVar = (b) ((d) obj).f7871b;
        cyVar.f10533d = false;
        if (cyVar.b() != null) {
            com.bytedance.android.livesdk.app.dataholder.d.a().h = bVar.f11100a;
            com.bytedance.android.livesdk.app.dataholder.d.a().i = bVar.f11101b;
            e.a().a((Integer) 1);
            e.a().o = 1;
            ((cy.b) cyVar.b()).g();
        }
    }
}
