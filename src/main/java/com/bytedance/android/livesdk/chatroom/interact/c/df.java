package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class df implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10554a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10555b;

    df(cy cyVar) {
        this.f10555b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10554a, false, 4830, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10554a, false, 4830, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10555b;
        cyVar.b((Throwable) obj);
        cyVar.f10535f = false;
        if (cyVar.t != null) {
            cyVar.t.c();
        }
    }
}
