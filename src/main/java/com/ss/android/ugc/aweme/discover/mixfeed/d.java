package com.ss.android.ugc.aweme.discover.mixfeed;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class d implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42553a;

    /* renamed from: b  reason: collision with root package name */
    static final g f42554b = new d();

    private d() {
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f42553a, false, 36795, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f42553a, false, 36795, new Class[]{i.class}, Object.class);
        } else if (iVar.c()) {
            return null;
        } else {
            if (!iVar.d()) {
                return (b) iVar.e();
            }
            throw iVar.f();
        }
    }
}
