package com.ss.android.ugc.aweme.poi.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.poi.model.ay;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class POIApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59704a;

    /* renamed from: b  reason: collision with root package name */
    public static POIApi f59705b = ((POIApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(POIApi.class));

    public interface POIApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/poi/search/")
        q<ay> searchPoi(@Query(a = "keywords") String str, @Query(a = "longitude") String str2, @Query(a = "latitude") String str3, @Query(a = "search_type") int i, @Query(a = "page") int i2, @Query(a = "count") int i3, @Query(a = "get_current_loc") int i4, @Query(a = "candidate_loc") String str4);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/poi/recommend/")
        q<ay> speedRecommendPoi(@Query(a = "longitude") String str, @Query(a = "latitude") String str2, @Query(a = "city_code") int i, @Query(a = "top_ids") String str3);
    }

    public static ay a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) throws Exception {
        if (PatchProxy.isSupport(new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4}, null, f59704a, true, 64914, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, ay.class)) {
            return (ay) PatchProxy.accessDispatch(new Object[]{str, str2, str3, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), str4}, null, f59704a, true, 64914, new Class[]{String.class, String.class, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class}, ay.class);
        }
        try {
            return (ay) f59705b.searchPoi(str, str2, str3, i, i2, i3, i4, str4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }
}
