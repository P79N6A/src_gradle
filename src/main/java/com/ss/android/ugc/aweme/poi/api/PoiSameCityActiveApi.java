package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.a.k;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class PoiSameCityActiveApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59727a;

    /* renamed from: b  reason: collision with root package name */
    public static final PoiSameCityActiveRetrofitApi f59728b = ((PoiSameCityActiveRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiSameCityActiveRetrofitApi.class));

    public interface PoiSameCityActiveRetrofitApi {
        @GET(a = "/aweme/v1/poi/samecity/active/")
        i<k> getPoiSameCiteActive(@Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "location_permission") int i);
    }
}
