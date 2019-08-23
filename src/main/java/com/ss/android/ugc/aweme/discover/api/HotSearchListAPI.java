package com.ss.android.ugc.aweme.discover.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.ss.android.ugc.aweme.discover.model.RankingListCover;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class HotSearchListAPI {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42078a;

    /* renamed from: b  reason: collision with root package name */
    private static IRetrofitService f42079b;

    /* renamed from: c  reason: collision with root package name */
    private static API f42080c;

    public interface API {
        @GET(a = "/aweme/v1/hot/search/list/")
        q<HotSearchListResponse> getHotSearchList(@Query(a = "detail_list") int i);

        @GET(a = "/aweme/v1/hot/search/list/")
        q<HotSearchListResponse> getHotSearchList(@Query(a = "detail_list") int i, @Query(a = "source") int i2);

        @GET(a = "/aweme/v1/hotsearch/music/billboard/")
        q<HotSearchMusicListResponse> getHotSearchMusicList();

        @GET(a = "/aweme/v1/hotsearch/aweme/billboard/")
        q<HotVideoListResponse> getHotSearchVideoList();

        @GET(a = "aweme/v1/hotsearch/positive_energy/billboard/")
        q<HotVideoListResponse> getPositiveEnergyList();

        @GET(a = "/aweme/v1/branch/billboard/entrance/")
        q<RankingListCover> getRankingListCover();
    }

    static {
        IRetrofitService iRetrofitService = (IRetrofitService) ServiceManager.get().getService(IRetrofitService.class);
        f42079b = iRetrofitService;
        f42080c = (API) iRetrofitService.createNewRetrofit("https://aweme.snssdk.com").create(API.class);
    }

    public static HotVideoListResponse a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f42078a, true, 36045, new Class[0], HotVideoListResponse.class)) {
            return (HotVideoListResponse) PatchProxy.accessDispatch(new Object[0], null, f42078a, true, 36045, new Class[0], HotVideoListResponse.class);
        }
        try {
            return (HotVideoListResponse) f42080c.getHotSearchVideoList().get();
        } catch (ExecutionException e2) {
            throw f42079b.propagateCompatibleException(e2);
        }
    }

    public static HotVideoListResponse b() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f42078a, true, 36046, new Class[0], HotVideoListResponse.class)) {
            return (HotVideoListResponse) PatchProxy.accessDispatch(new Object[0], null, f42078a, true, 36046, new Class[0], HotVideoListResponse.class);
        }
        try {
            return (HotVideoListResponse) f42080c.getPositiveEnergyList().get();
        } catch (ExecutionException e2) {
            throw f42079b.propagateCompatibleException(e2);
        }
    }
}
