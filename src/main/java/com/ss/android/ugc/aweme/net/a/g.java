package com.ss.android.ugc.aweme.net.a;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.application.initialization.a;

public final /* synthetic */ class g implements a.C0436a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56845a;

    /* renamed from: b  reason: collision with root package name */
    private final a f56846b;

    g(a aVar) {
        this.f56846b = aVar;
    }

    public final Object a() {
        if (!PatchProxy.isSupport(new Object[0], this, f56845a, false, 60871, new Class[0], Object.class)) {
            return this.f56846b;
        }
        return PatchProxy.accessDispatch(new Object[0], this, f56845a, false, 60871, new Class[0], Object.class);
    }
}
