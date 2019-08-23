package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.app.dataholder.e;
import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10550a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10551b;

    dd(cy cyVar) {
        this.f10551b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10550a, false, 4828, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10550a, false, 4828, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10551b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.f10534e = false;
        e.a().a((Integer) 0);
        ((cy.b) cyVar.b()).e(th);
    }
}
