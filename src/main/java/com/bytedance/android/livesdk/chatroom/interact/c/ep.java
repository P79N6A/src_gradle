package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ep implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10632a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10633b;

    public ep(ec ecVar) {
        this.f10633b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10632a, false, 4886, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10632a, false, 4886, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10633b;
        ecVar.f10605d = false;
        if (ecVar.p != null) {
            ecVar.p.b(ecVar.o);
            ecVar.o = 0;
        }
    }
}
