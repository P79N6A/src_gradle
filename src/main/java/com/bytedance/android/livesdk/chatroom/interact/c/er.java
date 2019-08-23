package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class er implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10636a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10637b;

    er(ec ecVar) {
        this.f10637b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10636a, false, 4888, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10636a, false, 4888, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ec ecVar = this.f10637b;
        ecVar.f10607f = false;
        ecVar.h = true;
        ecVar.c();
    }
}
