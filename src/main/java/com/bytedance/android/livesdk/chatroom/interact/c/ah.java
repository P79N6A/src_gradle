package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ah implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10371a;

    /* renamed from: b  reason: collision with root package name */
    private final af f10372b;

    ah(af afVar) {
        this.f10372b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10371a, false, 4674, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10371a, false, 4674, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10372b.a((Long) obj);
    }
}
