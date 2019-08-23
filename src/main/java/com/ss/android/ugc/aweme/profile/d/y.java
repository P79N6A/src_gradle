package com.ss.android.ugc.aweme.profile.d;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IShareService;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.u.z;
import com.ss.android.ugc.aweme.utils.ex;

public final /* synthetic */ class y implements IShareService.OnShareCallback {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61529a;

    /* renamed from: b  reason: collision with root package name */
    private final User f61530b;

    y(User user) {
        this.f61530b = user;
    }

    public final void onShareComplete(IShareService.ShareResult shareResult) {
        IShareService.ShareResult shareResult2 = shareResult;
        if (PatchProxy.isSupport(new Object[]{shareResult2}, this, f61529a, false, 70029, new Class[]{IShareService.ShareResult.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{shareResult2}, this, f61529a, false, 70029, new Class[]{IShareService.ShareResult.class}, Void.TYPE);
            return;
        }
        User user = this.f61530b;
        z.a("share_person").a("platform", shareResult2.type).a("target_id", user.getUid()).a("enter_from", ex.g(user) ? "personal_homepage" : "others_homepage").e();
    }
}
