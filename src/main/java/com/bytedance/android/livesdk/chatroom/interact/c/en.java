package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class en implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10628a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10629b;

    en(ec ecVar) {
        this.f10629b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10628a, false, 4884, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10628a, false, 4884, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10629b;
        ecVar.f10604c = false;
        if (ecVar.p != null) {
            ecVar.p.a(ecVar.n);
            ecVar.n = 0;
        }
    }
}
