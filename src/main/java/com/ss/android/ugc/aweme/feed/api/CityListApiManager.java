package com.ss.android.ugc.aweme.feed.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.feed.model.NearbyCities;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class CityListApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45050a;

    /* renamed from: b  reason: collision with root package name */
    private static CityListApi f45051b = ((CityListApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CityListApi.class));

    public interface CityListApi {
        @GET(a = "/aweme/v1/city/list/")
        q<NearbyCities> getCities(@Query(a = "location_permission") int i);
    }

    public static NearbyCities a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f45050a, true, 40874, new Class[0], NearbyCities.class)) {
            return (NearbyCities) PatchProxy.accessDispatch(new Object[0], null, f45050a, true, 40874, new Class[0], NearbyCities.class);
        }
        try {
            return (NearbyCities) f45051b.getCities(af.b(d.a()) ^ true ? 1 : 0).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
