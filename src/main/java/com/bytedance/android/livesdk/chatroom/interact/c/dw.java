package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dw implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10588a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10589b;

    dw(cy cyVar) {
        this.f10589b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10588a, false, 4847, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10588a, false, 4847, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10589b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.g = false;
        if (cyVar.i) {
            ((cy.b) cyVar.b()).h();
            e.a().b();
            cyVar.a();
            ((cy.b) cyVar.b()).h();
            return;
        }
        ((cy.b) cyVar.b()).d(th);
    }
}
