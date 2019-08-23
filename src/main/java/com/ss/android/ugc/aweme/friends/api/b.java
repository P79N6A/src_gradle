package com.ss.android.ugc.aweme.friends.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public abstract /* synthetic */ class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48829a;

    public static RecommendApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f48829a, true, 46374, new Class[0], RecommendApi.class)) {
            return (RecommendApi) PatchProxy.accessDispatch(new Object[0], null, f48829a, true, 46374, new Class[0], RecommendApi.class);
        }
        return (RecommendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RecommendApi.class);
    }
}
