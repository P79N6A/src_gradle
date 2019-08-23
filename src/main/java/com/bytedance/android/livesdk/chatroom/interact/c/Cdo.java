package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

/* renamed from: com.bytedance.android.livesdk.chatroom.interact.c.do  reason: invalid class name */
public final /* synthetic */ class Cdo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10572a;

    /* renamed from: b  reason: collision with root package name */
    private final cy f10573b;

    public Cdo(cy cyVar) {
        this.f10573b = cyVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10572a, false, 4839, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10572a, false, 4839, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        cy cyVar = this.f10573b;
        Throwable th = (Throwable) obj;
        cyVar.b(th);
        cyVar.o = false;
        if (cyVar.t != null) {
            cyVar.t.a(th);
            cyVar.s = 0;
        }
    }
}
