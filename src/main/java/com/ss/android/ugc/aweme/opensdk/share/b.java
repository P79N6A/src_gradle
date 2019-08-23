package com.ss.android.ugc.aweme.opensdk.share;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.ss.android.ugc.aweme.common.w;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.port.in.ac;

public final class b implements ac {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f58390a;

    public final void a(Activity activity, Object obj) {
        Activity activity2 = activity;
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{activity2, obj2}, this, f58390a, false, 63401, new Class[]{Activity.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2, obj2}, this, f58390a, false, 63401, new Class[]{Activity.class, Object.class}, Void.TYPE);
            return;
        }
        w checkShareContextWhenPublish = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).checkShareContextWhenPublish(obj2);
        if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isClientKeyValid(checkShareContextWhenPublish)) {
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).onReturnThirdPlatformFailed(activity2, checkShareContextWhenPublish, "", 20013);
        }
    }
}
