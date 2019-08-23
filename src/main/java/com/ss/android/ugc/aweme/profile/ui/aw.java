package com.ss.android.ugc.aweme.profile.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.ss.android.ugc.aweme.u.ao;

public final /* synthetic */ class aw implements AnalysisStayTimeFragmentComponent.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62491a;

    /* renamed from: b  reason: collision with root package name */
    private final MusUserProfileFragment f62492b;

    aw(MusUserProfileFragment musUserProfileFragment) {
        this.f62492b = musUserProfileFragment;
    }

    public final ao a(ao aoVar) {
        ao aoVar2 = aoVar;
        if (PatchProxy.isSupport(new Object[]{aoVar2}, this, f62491a, false, 68439, new Class[]{ao.class}, ao.class)) {
            return (ao) PatchProxy.accessDispatch(new Object[]{aoVar2}, this, f62491a, false, 68439, new Class[]{ao.class}, ao.class);
        }
        MusUserProfileFragment musUserProfileFragment = this.f62492b;
        return aoVar2.c(musUserProfileFragment.ao).k(musUserProfileFragment.ah).i(musUserProfileFragment.al);
    }
}
