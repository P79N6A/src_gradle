package com.ss.android.ugc.aweme.discover.api;

import a.i;
import com.bytedance.retrofit2.Call;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.Query;
import com.bytedance.retrofit2.http.QueryMap;
import com.bytedance.retrofit2.http.Url;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.BannerList;
import com.ss.android.ugc.aweme.discover.model.CategoryList;
import com.ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse;
import com.ss.android.ugc.aweme.discover.model.DiscoverCellSectionListResponse;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellDetailResponse;
import com.ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse;
import com.ss.android.ugc.aweme.discover.model.WideSearchResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import java.util.Map;

public final class DiscoverApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42069a;

    /* renamed from: b  reason: collision with root package name */
    private static DiscoverService f42070b;

    /* renamed from: c  reason: collision with root package name */
    private static final DiscoverService f42071c = ((DiscoverService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(DiscoverService.class));

    public interface DiscoverService {
        @GET("/aweme/v1/discover/cell/detail/")
        i<DiscoverCellDetailResponse> cellDetail(@Query(a = "type") int i, @Query(a = "is_recommend") boolean z, @Query(a = "cell_id") String str);

        @GET("/aweme/v2/discovery/cell/detail/")
        i<DiscoveryV3CellDetailResponse> cellDetailV3(@Query(a = "cell_id") String str, @Query(a = "count") int i);

        @GET("/aweme/v2/discovery/cell/list/")
        Observable<DiscoveryV3CellListResponse> cellListV3(@Query(a = "cursor") int i, @Query(a = "count") int i2);

        @GET("/aweme/v1/discover/cell/list/")
        i<DiscoverCellSectionListResponse> cellSectionList();

        @GET("/aweme/v1/recommend/user/dislike/")
        Call<String> disLikeRecommend(@Query(a = "user_id") String str);

        @GET("/aweme/v1/find/")
        Call<BannerList> fetchBanners(@QueryMap Map<String, String> map);

        @GET
        Call<CategoryList> fetchCategoryList(@Url String str, @QueryMap Map<String, String> map);

        @GET("/aweme/v1/hot/search/")
        Call<WideSearchResponse> fetchHotSearch();
    }

    public static DiscoverService a() {
        if (PatchProxy.isSupport(new Object[0], null, f42069a, true, 36038, new Class[0], DiscoverService.class)) {
            return (DiscoverService) PatchProxy.accessDispatch(new Object[0], null, f42069a, true, 36038, new Class[0], DiscoverService.class);
        }
        if (f42070b == null) {
            f42070b = (DiscoverService) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(DiscoverService.class);
        }
        return f42070b;
    }

    public static void a(String str) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f42069a, true, 36041, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f42069a, true, 36041, new Class[]{String.class}, Void.TYPE);
            return;
        }
        f42071c.disLikeRecommend(str2).execute();
    }
}
