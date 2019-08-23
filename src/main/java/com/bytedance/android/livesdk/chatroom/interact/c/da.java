package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.bytedance.android.livesdk.v.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class da implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10544a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10545b;

    da(cy cyVar) {
        this.f10545b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10544a, false, 4825, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10544a, false, 4825, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10545b;
        cyVar.f10535f = false;
        j.q().n().e();
        e.a().a((Integer) 2);
        ((cy.b) cyVar.b()).b();
    }
}
