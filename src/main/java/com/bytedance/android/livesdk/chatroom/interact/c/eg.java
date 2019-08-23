package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class eg implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10614a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10615b;

    eg(ec ecVar) {
        this.f10615b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10614a, false, 4877, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10614a, false, 4877, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10615b;
        ecVar.g = false;
        ecVar.h = false;
        ecVar.e();
    }
}
