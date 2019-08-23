package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class ah implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11215a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11216b;

    ah(af afVar) {
        this.f11216b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11215a, false, 5233, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11215a, false, 5233, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11216b;
        Throwable th = (Throwable) obj;
        if (afVar.b() != null) {
            ((af.b) afVar.b()).a(th);
        }
    }
}
