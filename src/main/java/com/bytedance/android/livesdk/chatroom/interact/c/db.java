package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class db implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10546a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10547b;

    db(cy cyVar) {
        this.f10547b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10546a, false, 4826, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10546a, false, 4826, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10547b;
        cyVar.b((Throwable) obj);
        cyVar.f10531b = false;
        ((cy.b) cyVar.b()).d();
    }
}
