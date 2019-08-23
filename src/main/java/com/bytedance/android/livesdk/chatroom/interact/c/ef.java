package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ef implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10612a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10613b;

    ef(ec ecVar) {
        this.f10613b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10612a, false, 4876, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10612a, false, 4876, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10613b;
        ecVar.b((Throwable) obj);
        ecVar.f10607f = false;
        if (ecVar.p != null) {
            ecVar.p.c();
        }
    }
}
