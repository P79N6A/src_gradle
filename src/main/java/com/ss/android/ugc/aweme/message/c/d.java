package com.ss.android.ugc.aweme.message.c;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f55372a;

    /* renamed from: b  reason: collision with root package name */
    private final c f55373b;

    /* renamed from: c  reason: collision with root package name */
    private final int f55374c;

    d(c cVar, int i) {
        this.f55373b = cVar;
        this.f55374c = i;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f55372a, false, 58770, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f55372a, false, 58770, new Class[]{i.class}, Object.class);
        }
        this.f55373b.c(this.f55374c);
        return null;
    }
}
