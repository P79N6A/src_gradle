package com.ss.android.ugc.aweme.profile.ui;

import a.g;
import a.i;
import android.arch.lifecycle.Observer;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.api.RemarkApi;

public final /* synthetic */ class db implements Observer {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f62625a;

    /* renamed from: b  reason: collision with root package name */
    private final ProfileMoreFragment f62626b;

    db(ProfileMoreFragment profileMoreFragment) {
        this.f62626b = profileMoreFragment;
    }

    public final void onChanged(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f62625a, false, 68869, new Class[]{Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{obj}, this, f62625a, false, 68869, new Class[]{Object.class}, Void.TYPE);
            return;
        }
        ProfileMoreFragment profileMoreFragment = this.f62626b;
        String str = (String) obj;
        if (profileMoreFragment.f3805c == null) {
            profileMoreFragment.f3805c = (RemarkApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RemarkApi.class);
        }
        profileMoreFragment.f3805c.commitRemarkName(str, profileMoreFragment.f3804b.getUid(), profileMoreFragment.f3804b.getSecUid()).a((g<TResult, TContinuationResult>) new dg<TResult,TContinuationResult>(profileMoreFragment), i.f1052b);
    }
}
