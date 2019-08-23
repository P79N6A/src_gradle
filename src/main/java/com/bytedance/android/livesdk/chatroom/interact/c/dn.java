package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dn implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10570a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10571b;

    public dn(cy cyVar) {
        this.f10571b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10570a, false, 4838, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10570a, false, 4838, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10571b;
        cyVar.o = false;
        if (cyVar.t != null) {
            cyVar.t.d(cyVar.s);
            cyVar.s = 0;
        }
    }
}
