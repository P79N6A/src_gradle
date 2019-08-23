package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dy implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10592a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10593b;

    dy(cy cyVar) {
        this.f10593b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10592a, false, 4849, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10592a, false, 4849, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10593b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.f10532c = false;
        ((cy.b) cyVar.b()).b(th);
    }
}
