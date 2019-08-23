package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.live.core.network.response.d;
import com.bytedance.android.livesdk.chatroom.presenter.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class l implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11370a;

    /* renamed from: b  reason: collision with root package name */
    private final k f11371b;

    l(k kVar) {
        this.f11371b = kVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11370a, false, 5174, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11370a, false, 5174, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        k kVar = this.f11371b;
        if (!(((d) obj) == null || kVar.b() == null)) {
            ((k.a) kVar.b()).a();
        }
    }
}
