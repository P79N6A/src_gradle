package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eq implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10634a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10635b;

    public eq(ec ecVar) {
        this.f10635b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10634a, false, 4887, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10634a, false, 4887, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10635b;
        Throwable th = (Throwable) obj;
        ecVar.b(th);
        ecVar.f10605d = false;
        if (ecVar.p != null) {
            ecVar.p.a(th);
            ecVar.o = 0;
        }
    }
}
