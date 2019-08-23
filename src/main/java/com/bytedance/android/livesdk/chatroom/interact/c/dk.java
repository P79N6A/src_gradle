package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dk implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10564a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10565b;

    dk(cy cyVar) {
        this.f10565b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10564a, false, 4835, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10564a, false, 4835, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10565b;
        cyVar.n = false;
        if (cyVar.t != null) {
            cyVar.t.c(cyVar.r);
            cyVar.r = 0;
        }
    }
}
