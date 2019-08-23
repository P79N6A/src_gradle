package com.bytedance.android.livesdk.chatroom.presenter;

import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import io.reactivex.functions.Consumer;

public final /* synthetic */ class as implements Consumer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f11237a;

    /* renamed from: b  reason: collision with root package name */
    private final af f11238b;

    public as(af afVar) {
        this.f11238b = afVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f11237a, false, 5244, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f11237a, false, 5244, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        af afVar = this.f11238b;
        a aVar = (a) obj;
        if (afVar.f11208b != null) {
            afVar.f11208b.a(aVar);
        }
    }
}
