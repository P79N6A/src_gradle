package com.ss.android.ugc.aweme.poi.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.af;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class PoiCouponApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59713a;

    /* renamed from: b  reason: collision with root package name */
    public static final RealApi f59714b = ((RealApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RealApi.class));

    public interface RealApi {
        @GET(a = "/aweme/v2/coupon/join/activity")
        i<af> getJoinPoiActivity(@Query(a = "poi_id") String str, @Query(a = "activity_id") int i);
    }
}
