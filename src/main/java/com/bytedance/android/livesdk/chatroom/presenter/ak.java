package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdk.chatroom.presenter.af;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;
import java.util.List;

public final /* synthetic */ class ak implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11221a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11222b;

    ak(af afVar) {
        this.f11222b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11221a, false, 5236, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11221a, false, 5236, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11222b;
        afVar.f11211e.addAll((List) obj);
        if (afVar.b() != null) {
            ((af.b) afVar.b()).a(afVar.f11211e);
        }
    }
}
