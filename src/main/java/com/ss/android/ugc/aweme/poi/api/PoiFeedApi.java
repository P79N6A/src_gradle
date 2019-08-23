package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.an;
import com.ss.android.ugc.aweme.poi.model.s;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface PoiFeedApi {
    @GET(a = "/aweme/v1/poi/aweme/")
    i<com.ss.android.ugc.aweme.poi.model.i> getAwemeList(@Query(a = "poi_id") String str, @Query(a = "aweme_type") int i, @Query(a = "count") int i2, @Query(a = "cursor") long j, @Query(a = "poi_class_code") long j2, @Query(a = "latitude") String str2, @Query(a = "longitude") String str3, @Query(a = "display_style") long j3, @Query(a = "aweme_id") String str4);

    @GET(a = "/aweme/v1/poi/aweme/")
    i<com.ss.android.ugc.aweme.poi.model.i> getAwemeList(@Query(a = "poi_id") String str, @Query(a = "aweme_type") int i, @Query(a = "count") int i2, @Query(a = "cursor") long j, @Query(a = "aweme_id") String str2);

    @GET(a = "/aweme/v1/poi/common/banner/")
    i<s> getPoiCommonBanner(@Query(a = "city_code") long j, @Query(a = "tab_type") int i, @Query(a = "poi_id") String str);

    @GET(a = "/aweme/v1/poi/detail/")
    i<PoiDetail> getPoiDetail(@Query(a = "poi_id") String str, @Query(a = "longitude") String str2, @Query(a = "latitude") String str3, @Query(a = "extensions") String str4, @Query(a = "display_style") int i, @Query(a = "is_preview") int i2, @Query(a = "from_ads") int i3, @Query(a = "item_id") String str5);

    @GET(a = "/aweme/v1/poi/activity/scan/detail/")
    i<an> getQRDetail(@Query(a = "poi_id") String str, @Query(a = "has_coupon_activity") boolean z, @Query(a = "challenge_id") String str2);

    @GET(a = "/aweme/v1/poi/feedback/")
    i<s> poiFeedback(@Query(a = "poi_id") String str, @Query(a = "type") int i);
}
