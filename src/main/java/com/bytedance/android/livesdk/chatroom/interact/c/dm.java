package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class dm implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10568a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10569b;

    dm(cy cyVar) {
        this.f10569b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10568a, false, 4837, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10568a, false, 4837, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10569b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.n = false;
        if (cyVar.t != null) {
            cyVar.t.a(cyVar.r, th);
            cyVar.r = 0;
        }
    }
}
