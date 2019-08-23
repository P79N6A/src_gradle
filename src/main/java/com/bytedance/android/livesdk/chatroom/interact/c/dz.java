package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.live.core.network.response.c;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dz implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10594a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10595b;

    dz(cy cyVar) {
        this.f10595b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10594a, false, 4850, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10594a, false, 4850, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10595b;
        cyVar.f10531b = false;
        ((cy.b) cyVar.b()).a(((c) obj).f7867b);
    }
}
