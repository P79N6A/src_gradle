package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10576a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10577b;

    dq(cy cyVar) {
        this.f10577b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10576a, false, 4841, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10576a, false, 4841, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10577b;
        Throwable th = (Throwable) obj;
        cyVar.f10533d = false;
        if (cyVar.b() != null && (th instanceof Exception)) {
            ((cy.b) cyVar.b()).c(th);
        }
    }
}
