package com.ss.android.ugc.aweme.commercialize.star;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class StarAtlasOrderApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39467a;

    /* renamed from: b  reason: collision with root package name */
    private static IStarAtlasOrderApi f39468b;

    public interface IStarAtlasOrderApi {
        @GET(a = "/aweme/v1/commerce/star/atlas/orders/")
        q<b> checkStarAtlasOrder(@Query(a = "page") int i, @Query(a = "limit") int i2);
    }

    public static IStarAtlasOrderApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f39467a, true, 32027, new Class[0], IStarAtlasOrderApi.class)) {
            return (IStarAtlasOrderApi) PatchProxy.accessDispatch(new Object[0], null, f39467a, true, 32027, new Class[0], IStarAtlasOrderApi.class);
        }
        if (f39468b == null) {
            synchronized (StarAtlasOrderApi.class) {
                if (f39468b == null) {
                    f39468b = (IStarAtlasOrderApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(IStarAtlasOrderApi.class);
                }
            }
        }
        return f39468b;
    }
}
