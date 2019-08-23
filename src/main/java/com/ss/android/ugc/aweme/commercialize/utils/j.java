package com.ss.android.ugc.aweme.commercialize.utils;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.p;
import com.ss.android.ugc.aweme.commercialize.utils.g;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39789a;

    /* renamed from: b  reason: collision with root package name */
    private final g.a f39790b;

    j(g.a aVar) {
        this.f39790b = aVar;
    }

    public final Object then(i iVar) {
        boolean z = true;
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f39789a, false, 32379, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f39789a, false, 32379, new Class[]{i.class}, Object.class);
        }
        g.a aVar = this.f39790b;
        if (!p.a().b() && System.currentTimeMillis() - p.a().d() >= 5000) {
            z = false;
        }
        aVar.a(z);
        return null;
    }
}
