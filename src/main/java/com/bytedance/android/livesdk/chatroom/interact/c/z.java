package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class z implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10824a;

    /* renamed from: b  reason: collision with root package name */
    private final x f10825b;

    z(x xVar) {
        this.f10825b = xVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10824a, false, 4661, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10824a, false, 4661, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10825b.a((Long) obj);
    }
}
