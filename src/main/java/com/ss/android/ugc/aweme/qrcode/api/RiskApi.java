package com.ss.android.ugc.aweme.qrcode.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.qrcode.c.c;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class RiskApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63339a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f63340b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f63341c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v2/risk/url/")
        q<c> getRiskUrlModel(@Query(a = "request_url") String str);
    }

    public static c a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f63339a, true, 70404, new Class[]{String.class}, c.class)) {
            return (c) PatchProxy.accessDispatch(new Object[]{str2}, null, f63339a, true, 70404, new Class[]{String.class}, c.class);
        }
        try {
            return (c) ((RealApi) f63340b.create(RealApi.class)).getRiskUrlModel(str2).get();
        } catch (ExecutionException e2) {
            throw f63341c.propagateCompatibleException(e2);
        }
    }
}
