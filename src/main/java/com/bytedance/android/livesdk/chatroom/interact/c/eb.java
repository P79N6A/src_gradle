package com.bytedance.android.livesdk.chatroom.interact.c;

import com.bytedance.android.livesdk.chatroom.interact.c.cy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eb implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10600a;

    /* renamed from: b  reason: collision with root package name */
    private final cy.AnonymousClass2 f10601b;

    eb(cy.AnonymousClass2 r1) {
        this.f10601b = r1;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10600a, false, 4854, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10600a, false, 4854, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy.this.b((Throwable) obj);
    }
}
