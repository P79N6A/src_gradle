package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eo implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10630a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10631b;

    eo(ec ecVar) {
        this.f10631b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10630a, false, 4885, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10630a, false, 4885, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10631b;
        Throwable th = (Throwable) obj;
        ecVar.b(th);
        ecVar.f10604c = false;
        if (ecVar.p != null) {
            ecVar.p.a(ecVar.n, th);
            ecVar.n = 0;
        }
    }
}
