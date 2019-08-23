package com.ss.android.ugc.aweme.main;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54853a;

    /* renamed from: b  reason: collision with root package name */
    private final MainActivity f54854b;

    l(MainActivity mainActivity) {
        this.f54854b = mainActivity;
    }

    public final Object then(i iVar) {
        i iVar2 = iVar;
        if (!PatchProxy.isSupport(new Object[]{iVar2}, this, f54853a, false, 57202, new Class[]{i.class}, Object.class)) {
            return this.f54854b.lambda$recordLaunchDate$4$MainActivity(iVar2);
        }
        return PatchProxy.accessDispatch(new Object[]{iVar2}, this, f54853a, false, 57202, new Class[]{i.class}, Object.class);
    }
}
