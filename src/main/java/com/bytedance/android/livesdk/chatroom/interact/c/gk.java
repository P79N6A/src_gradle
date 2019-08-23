package com.bytedance.android.livesdk.chatroom.interact.c;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class gk implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f10750a;

    /* renamed from: b  reason: collision with root package name */
    private final gc f10751b;

    gk(gc gcVar) {
        this.f10751b = gcVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f10750a, false, 4994, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f10750a, false, 4994, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f10751b.a((Throwable) obj);
    }
}
