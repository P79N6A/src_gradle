package com.ss.android.ugc.aweme.tools.extract;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f74699a;

    /* renamed from: b  reason: collision with root package name */
    private final a f74700b;

    c(a aVar) {
        this.f74700b = aVar;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f74699a, false, 87054, new Class[]{i.class}, Object.class)) {
            return this.f74700b.a(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f74699a, false, 87054, new Class[]{i.class}, Object.class);
    }
}
