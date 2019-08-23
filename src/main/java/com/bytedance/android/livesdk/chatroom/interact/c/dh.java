package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dh implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10558a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10559b;

    dh(cy cyVar) {
        this.f10559b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10558a, false, 4832, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10558a, false, 4832, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10559b;
        cyVar.b((Throwable) obj);
        cyVar.g = false;
        if (cyVar.t != null) {
            cyVar.t.e();
        }
    }
}
