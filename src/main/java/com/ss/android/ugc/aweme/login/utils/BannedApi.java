package com.ss.android.ugc.aweme.login.utils;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.BannedToastModel;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class BannedApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f53836a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f53837b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://rc.snssdk.com");

    interface RealApi {
        @GET(a = "https://rc.snssdk.com/punish/toast_info")
        q<BannedToastModel> getBannedToastInfo(@Query(a = "uid") String str);
    }

    public static q<BannedToastModel> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f53836a, true, 56487, new Class[]{String.class}, q.class)) {
            return ((RealApi) f53837b.create(RealApi.class)).getBannedToastInfo(str2);
        }
        return (q) PatchProxy.accessDispatch(new Object[]{str2}, null, f53836a, true, 56487, new Class[]{String.class}, q.class);
    }
}
