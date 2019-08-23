package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterOptionResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankFilterResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class PoiRankApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59725a;

    /* renamed from: b  reason: collision with root package name */
    public static final PoiRankRetrofitApi f59726b = ((PoiRankRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiRankRetrofitApi.class));

    public interface PoiRankRetrofitApi {
        @GET(a = "/aweme/v1/poi/rank/filter/")
        i<PoiRankFilterResponse> getPoiRankFilter(@Query(a = "count") int i, @Query(a = "cursor") long j, @Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "business_area_option_type") String str3, @Query(a = "class_option_type") String str4, @Query(a = "city_code") String str5, @Query(a = "poi_class_code") int i2, @Query(a = "district_code") String str6);

        @GET(a = "/aweme/v1/poi/rank/filter/option/")
        i<PoiRankFilterOptionResponse> getPoiRankFilterOption(@Query(a = "city_code") String str, @Query(a = "poi_class_code") int i);
    }
}
