package com.ss.android.ugc.aweme.profile.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.ss.android.ugc.aweme.profile.model.ActivityLinkResponse;
import java.util.concurrent.Callable;

public final /* synthetic */ class a implements Callable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f61326a;

    /* renamed from: b  reason: collision with root package name */
    private final ActivityLinkManager.ActivityLinkApi f61327b;

    a(ActivityLinkManager.ActivityLinkApi activityLinkApi) {
        this.f61327b = activityLinkApi;
    }

    public final Object call() {
        if (!PatchProxy.isSupport(new Object[0], this, f61326a, false, 67429, new Class[0], Object.class)) {
            return (ActivityLinkResponse) this.f61327b.getLinkInfo().get();
        }
        return PatchProxy.accessDispatch(new Object[0], this, f61326a, false, 67429, new Class[0], Object.class);
    }
}
