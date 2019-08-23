package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.model.poi.PoiFilterListResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiFilterOptionResponse;
import com.ss.android.ugc.aweme.feed.model.poi.PoiRankBannerResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class PoiFilterApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59715a;

    /* renamed from: b  reason: collision with root package name */
    public static final PoiFilterRetrofitApi f59716b = ((PoiFilterRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiFilterRetrofitApi.class));

    public interface PoiFilterRetrofitApi {
        @GET(a = "/aweme/v1/poi/filter/")
        i<PoiFilterListResponse> getPoiFilterList(@Query(a = "count") int i, @Query(a = "cursor") long j, @Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "business_area_option_type") String str3, @Query(a = "sort_option_type") String str4, @Query(a = "class_option_type") String str5, @Query(a = "city_code") String str6, @Query(a = "poi_class_code") int i2);

        @GET(a = "/aweme/v1/poi/filter/option/")
        i<PoiFilterOptionResponse> getPoiFilterOption(@Query(a = "city_code") String str, @Query(a = "poi_class_code") int i);

        @GET(a = "/aweme/v1/poi/vertical/banner/")
        i<PoiRankBannerResponse> getPoiRankBanner(@Query(a = "count") int i, @Query(a = "cursor") long j, @Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "business_area_option_type") String str3, @Query(a = "sort_option_type") String str4, @Query(a = "class_option_type") String str5, @Query(a = "city_code") String str6, @Query(a = "poi_class_code") int i2, @Query(a = "poi_id") String str7);

        @GET(a = "/aweme/v1/poi/recommend/filter/")
        i<PoiFilterListResponse> getPoiRecommendFilterList(@Query(a = "count") int i, @Query(a = "cursor") long j, @Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "business_area_option_type") String str3, @Query(a = "sort_option_type") String str4, @Query(a = "class_option_type") String str5, @Query(a = "city_code") String str6, @Query(a = "poi_class_code") int i2, @Query(a = "poi_id") String str7, @Query(a = "recommend_type") int i3);
    }

    public static i<PoiFilterListResponse> a(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), str, str2, str3, str4, str5, str6, Integer.valueOf(i2)}, null, f59715a, true, 64921, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE}, i.class)) {
            return f59716b.getPoiFilterList(i, j, str, str2, str3, str4, str5, str6, i2);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), str, str2, str3, str4, str5, str6, Integer.valueOf(i2)}, null, f59715a, true, 64921, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE}, i.class);
    }

    public static i<PoiFilterListResponse> a(int i, long j, String str, String str2, String str3, String str4, String str5, String str6, int i2, String str7, int i3) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j2), str, str2, str3, str4, str5, str6, Integer.valueOf(i2), str7, Integer.valueOf(i3)}, null, f59715a, true, 64922, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, i.class)) {
            return f59716b.getPoiRecommendFilterList(i, j, str, str2, str3, str4, str5, str6, i2, str7, i3);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j2), str, str2, str3, str4, str5, str6, Integer.valueOf(i2), str7, Integer.valueOf(i3)}, null, f59715a, true, 64922, new Class[]{Integer.TYPE, Long.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, String.class, Integer.TYPE}, i.class);
    }
}
