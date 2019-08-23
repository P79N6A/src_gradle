package com.ss.android.ugc.aweme.friends.d;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class c implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48855a;

    /* renamed from: b  reason: collision with root package name */
    private final b f48856b;

    c(b bVar) {
        this.f48856b = bVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f48855a, false, 46681, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f48855a, false, 46681, new Class[]{i.class}, Object.class);
        }
        b bVar = this.f48856b;
        if (bVar.f48852f != null) {
            if (iVar.d()) {
                bVar.f48852f.a(iVar.f());
            } else {
                bVar.f48852f.a(null, iVar.e());
            }
        }
        return null;
    }
}
