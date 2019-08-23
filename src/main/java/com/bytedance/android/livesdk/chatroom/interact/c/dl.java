package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dl implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10566a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10567b;

    dl(cy cyVar) {
        this.f10567b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10566a, false, 4836, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10566a, false, 4836, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10567b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.f10535f = false;
        cyVar.a();
        ((cy.b) cyVar.b()).f(th);
    }
}
