package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class bd implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11276a;

    /* renamed from: b  reason: collision with root package name */
    private final au f11277b;

    bd(au auVar) {
        this.f11277b = auVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11276a, false, 5273, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11276a, false, 5273, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        au auVar = this.f11277b;
        auVar.f11245e = false;
        auVar.e().a((a) obj);
    }
}
