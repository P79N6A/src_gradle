package com.ss.android.ugc.aweme.poi.api;

import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.PoiDetail;
import com.ss.android.ugc.aweme.poi.model.i;

public final class PoiApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59711a;

    /* renamed from: b  reason: collision with root package name */
    public static final PoiService f59712b = ((PoiService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PoiService.class));

    public interface PoiService {
        @GET("/aweme/v1/poi/aweme/")
        q<i> queryPoiAwemeList(@Query(a = "poiId") String str, @Query(a = "count") int i, @Query(a = "cursor") int i2, @Query(a = "aweme_type") int i3);

        @GET("/aweme/v1/poi/detail/")
        q<PoiDetail> queryPoiDetail(@Query(a = "poi_id") String str, @Query(a = "longitude") String str2, @Query(a = "latitude") String str3, @Query(a = "extensions") String str4);
    }
}
