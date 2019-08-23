package com.ss.android.ugc.aweme.detail.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.u.ao;

public final /* synthetic */ class e implements AnalysisStayTimeFragmentComponent.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f41370a;

    /* renamed from: b  reason: collision with root package name */
    private final DetailFragment f41371b;

    e(DetailFragment detailFragment) {
        this.f41371b = detailFragment;
    }

    public final ao a(ao aoVar) {
        ao aoVar2 = aoVar;
        if (!PatchProxy.isSupport(new Object[]{aoVar2}, this, f41370a, false, 35098, new Class[]{ao.class}, ao.class)) {
            return this.f41371b.a(aoVar2);
        }
        return (ao) PatchProxy.accessDispatch(new Object[]{aoVar2}, this, f41370a, false, 35098, new Class[]{ao.class}, ao.class);
    }
}
