package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ek implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10622a;

    /* renamed from: b  reason: collision with root package name */
    private final ec f10623b;

    ek(ec ecVar) {
        this.f10623b = ecVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10622a, false, 4881, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10622a, false, 4881, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10623b.b((Throwable) obj);
    }
}
