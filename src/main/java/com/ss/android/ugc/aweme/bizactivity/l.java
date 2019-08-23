package com.ss.android.ugc.aweme.bizactivity;

import a.g;
import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bizactivity.h;

public final /* synthetic */ class l implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f35246a;

    /* renamed from: b  reason: collision with root package name */
    private final BizActivityViewModel f35247b;

    /* renamed from: c  reason: collision with root package name */
    private final h.a f35248c;

    l(BizActivityViewModel bizActivityViewModel, h.a aVar) {
        this.f35247b = bizActivityViewModel;
        this.f35248c = aVar;
    }

    public final Object then(i iVar) {
        if (PatchProxy.isSupport(new Object[]{iVar}, this, f35246a, false, 25706, new Class[]{i.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{iVar}, this, f35246a, false, 25706, new Class[]{i.class}, Object.class);
        }
        BizActivityViewModel bizActivityViewModel = this.f35247b;
        h.a aVar = this.f35248c;
        aVar.f35235c = 0;
        bizActivityViewModel.a().postValue(new g(1, aVar));
        return null;
    }
}
