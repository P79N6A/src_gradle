package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dv implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10586a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10587b;

    dv(cy cyVar) {
        this.f10587b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10586a, false, 4846, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10586a, false, 4846, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10587b;
        cyVar.g = false;
        ((cy.b) cyVar.b()).h();
        e.a().b();
        cyVar.a();
        ((cy.b) cyVar.b()).h();
    }
}
