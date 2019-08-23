package com.bytedance.android.livesdk.chatroom.presenter;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class be implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11278a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11279b;

    be(au auVar) {
        this.f11279b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11278a, false, 5274, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11278a, false, 5274, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11279b;
        auVar.f11245e = false;
        auVar.e().a((Throwable) obj);
    }
}
