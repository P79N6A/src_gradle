package com.ss.android.ugc.aweme.crossplatform.business;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;

public final /* synthetic */ class a implements IShareService.OnShareCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40757a;

    /* renamed from: b  reason: collision with root package name */
    private final AbsShareBusiness f40758b;

    a(AbsShareBusiness absShareBusiness) {
        this.f40758b = absShareBusiness;
    }

    public final void onShareComplete(IShareService.ShareResult shareResult) {
        IShareService.ShareResult shareResult2 = shareResult;
        if (PatchProxy.isSupport(new Object[]{shareResult2}, this, f40757a, false, 34225, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult2}, this, f40757a, false, 34225, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
            return;
        }
        this.f40758b.a(shareResult2);
    }
}
