package com.ss.android.ugc.aweme.discover.hitrank;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final /* synthetic */ class h implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42402a;

    /* renamed from: b  reason: collision with root package name */
    private final RankViewModel f42403b;

    h(RankViewModel rankViewModel) {
        this.f42403b = rankViewModel;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f42402a, false, 36414, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f42402a, false, 36414, new Class[]{i.class}, Object.class);
        }
        RankViewModel rankViewModel = this.f42403b;
        HitNotice hitNotice = (HitNotice) iVar.e();
        if (hitNotice != null) {
            rankViewModel.f42379b = hitNotice;
        }
        if (iVar.c() || iVar.d()) {
            rankViewModel.a().postValue(new d(-2, null));
        } else if (rankViewModel.f42379b == null) {
            rankViewModel.a().postValue(new d(-1, null));
        } else {
            rankViewModel.a().postValue(new d(1, rankViewModel.f42379b));
        }
        return null;
    }
}
