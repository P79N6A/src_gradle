package com.ss.android.ugc.aweme.main.story;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.e.c;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54917a;

    /* renamed from: b  reason: collision with root package name */
    private final c f54918b;

    d(c cVar) {
        this.f54918b = cVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f54917a, false, 58195, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f54917a, false, 58195, new Class[]{i.class}, Object.class);
        }
        c cVar = this.f54918b;
        if (cVar != null) {
            if (iVar.d() || iVar.c()) {
                cVar.a(iVar.f());
            } else {
                cVar.a(iVar.e());
            }
        }
        return null;
    }
}
