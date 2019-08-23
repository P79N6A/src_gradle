package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bizactivity.h;

public final /* synthetic */ class j implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35241a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityViewModel f35242b;

    /* renamed from: c  reason: collision with root package name */
    private final int f35243c;

    j(BizActivityViewModel bizActivityViewModel, int i) {
        this.f35242b = bizActivityViewModel;
        this.f35243c = i;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35241a, false, 25704, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35241a, false, 25704, new Class[]{i.class}, Object.class);
        }
        BizActivityViewModel bizActivityViewModel = this.f35242b;
        int i = this.f35243c;
        h hVar = (h) iVar.e();
        if (hVar != null) {
            bizActivityViewModel.f2798b = hVar.f35232a;
        }
        if (iVar.c() || iVar.d()) {
            bizActivityViewModel.a().postValue(new g(-2, null));
        } else if (bizActivityViewModel.f2798b == null) {
            bizActivityViewModel.a().postValue(new g(-1, null));
        } else {
            bizActivityViewModel.a().postValue(new g(i, bizActivityViewModel.f2798b));
            h.a aVar = bizActivityViewModel.f2798b;
            if (PatchProxy.isSupport(new Object[]{aVar}, bizActivityViewModel, BizActivityViewModel.f2797a, false, 25701, new Class[]{h.a.class}, Void.TYPE)) {
                Object[] objArr = {aVar};
                BizActivityViewModel bizActivityViewModel2 = bizActivityViewModel;
                ChangeQuickRedirect changeQuickRedirect = BizActivityViewModel.f2797a;
                PatchProxy.accessDispatch(objArr, bizActivityViewModel2, changeQuickRedirect, false, 25701, new Class[]{h.a.class}, Void.TYPE);
            } else {
                if (aVar.f35236d > 0) {
                    i.a(aVar.f35236d * 1000).a((g<TResult, TContinuationResult>) new k<TResult,TContinuationResult>(bizActivityViewModel));
                }
                if (!aVar.i && aVar.h && aVar.f35235c > 0) {
                    i.a(aVar.f35235c * 1000).a((g<TResult, TContinuationResult>) new l<TResult,TContinuationResult>(bizActivityViewModel, aVar), i.f1052b);
                }
            }
        }
        return null;
    }
}
