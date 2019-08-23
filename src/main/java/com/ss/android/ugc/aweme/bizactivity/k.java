package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class k implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35244a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityViewModel f35245b;

    k(BizActivityViewModel bizActivityViewModel) {
        this.f35245b = bizActivityViewModel;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35244a, false, 25705, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35244a, false, 25705, new Class[]{i.class}, Object.class);
        }
        this.f35245b.a(1);
        return null;
    }
}
