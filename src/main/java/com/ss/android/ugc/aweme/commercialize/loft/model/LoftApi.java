package com.ss.android.ugc.aweme.commercialize.loft.model;

import android.text.TextUtils;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class LoftApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39232a;

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofit f39233b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @GET(a = "/aweme/v1/commerce/find/second/floor/")
        q<g> getLoftResponse(@Query(a = "activity_id") String str);
    }

    public static q<g> a(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, null, f39232a, true, 31288, new Class[]{String.class}, q.class)) {
            return (q) PatchProxy.accessDispatch(new Object[]{str}, null, f39232a, true, 31288, new Class[]{String.class}, q.class);
        }
        RealApi realApi = (RealApi) f39233b.create(RealApi.class);
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = str;
        }
        return realApi.getLoftResponse(str2);
    }
}
