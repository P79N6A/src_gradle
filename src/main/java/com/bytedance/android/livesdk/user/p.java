package com.bytedance.android.livesdk.user;

import com.bytedance.android.livesdkapi.depend.i.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class p implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f17496a;

    /* renamed from: b  reason: collision with root package name */
    private final l f17497b;

    p(l lVar) {
        this.f17497b = lVar;
    }

    public final void a(com.bytedance.android.livesdkapi.depend.model.b.a aVar) {
        com.bytedance.android.livesdkapi.depend.model.b.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f17496a, false, 13574, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f17496a, false, 13574, new Class[]{com.bytedance.android.livesdkapi.depend.model.b.a.class}, Void.TYPE);
            return;
        }
        this.f17497b.f17470f.onNext(aVar2);
        com.bytedance.android.livesdk.u.a.a().a((Object) new com.bytedance.android.livesdkapi.depend.b.a(aVar2));
    }
}
