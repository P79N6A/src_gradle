package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class f implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35228a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityFloatDialogHelper f35229b;

    f(BizActivityFloatDialogHelper bizActivityFloatDialogHelper) {
        this.f35229b = bizActivityFloatDialogHelper;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35228a, false, 25690, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35228a, false, 25690, new Class[]{i.class}, Object.class);
        }
        this.f35229b.a();
        return null;
    }
}
