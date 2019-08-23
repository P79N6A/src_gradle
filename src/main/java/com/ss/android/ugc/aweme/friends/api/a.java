package com.ss.android.ugc.aweme.friends.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

public abstract /* synthetic */ class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48828a;

    public static FriendApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f48828a, true, 46373, new Class[0], FriendApi.class)) {
            return (FriendApi) PatchProxy.accessDispatch(new Object[0], null, f48828a, true, 46373, new Class[0], FriendApi.class);
        }
        return (FriendApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FriendApi.class);
    }
}
