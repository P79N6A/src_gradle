package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.u.ao;

public final /* synthetic */ class ee implements AnalysisStayTimeFragmentComponent.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62728a;

    /* renamed from: b  reason: collision with root package name */
    private final UserProfileFragment f62729b;

    ee(UserProfileFragment userProfileFragment) {
        this.f62729b = userProfileFragment;
    }

    public final ao a(ao aoVar) {
        ao aoVar2 = aoVar;
        if (!PatchProxy.isSupport(new Object[]{aoVar2}, this, f62728a, false, 69246, new Class[]{ao.class}, ao.class)) {
            return this.f62729b.a(aoVar2);
        }
        return (ao) PatchProxy.accessDispatch(new Object[]{aoVar2}, this, f62728a, false, 69246, new Class[]{ao.class}, ao.class);
    }
}
