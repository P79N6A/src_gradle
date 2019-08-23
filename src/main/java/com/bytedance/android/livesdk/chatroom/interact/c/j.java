package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class j implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10791a;

    /* renamed from: b  reason: collision with root package name */
    private final h f10792b;

    j(h hVar) {
        this.f10792b = hVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10791a, false, 4637, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10791a, false, 4637, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10792b.a((Throwable) obj);
    }
}
