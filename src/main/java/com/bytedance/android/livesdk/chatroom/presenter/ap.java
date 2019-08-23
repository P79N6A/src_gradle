package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ap implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11231a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11232b;

    public ap(af afVar) {
        this.f11232b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11231a, false, 5241, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11231a, false, 5241, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11232b;
        a aVar = (a) obj;
        afVar.h = false;
        if (afVar.f11208b != null) {
            afVar.f11208b.a(aVar);
        }
    }
}
