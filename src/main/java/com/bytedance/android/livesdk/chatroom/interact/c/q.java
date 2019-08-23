package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class q implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10804a;

    /* renamed from: b  reason: collision with root package name */
    private final n f10805b;

    q(n nVar) {
        this.f10805b = nVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10804a, false, 4649, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10804a, false, 4649, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10805b.c((Throwable) obj);
    }
}
