package com.ss.android.ugc.aweme.shortvideo.mvtemplate;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.b.a.b;
import com.ss.android.ugc.aweme.shortvideo.c;

public final /* synthetic */ class f implements b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f68715a;

    /* renamed from: b  reason: collision with root package name */
    private final a f68716b;

    f(a aVar) {
        this.f68716b = aVar;
    }

    public final void accept(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f68715a, false, 77861, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f68715a, false, 77861, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        this.f68716b.j = (c) obj;
    }
}
