package com.ss.android.ugc.aweme.hotsearch.api;

import a.i;
import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.discover.model.HotSearchMusicListResponse;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hotsearch.b.j;
import com.ss.android.ugc.aweme.hotsearch.b.l;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class RankingListApi {

    /* renamed from: a  reason: collision with root package name */
    public static API f49668a = ((API) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(API.class));

    public interface API {
        @GET(a = "/aweme/v1/hot/search/list/")
        i<HotSearchListResponse> getHotSearchList(@Query(a = "detail_list") int i);

        @GET(a = "/aweme/v1/hotsearch/music/billboard/")
        i<HotSearchMusicListResponse> getHotSearchMusicList(@Query(a = "type") Integer num, @Query(a = "edition_uid") String str);

        @GET(a = "/aweme/v1/hotsearch/star/billboard/")
        i<j> getHotSearchStarList(@Query(a = "type") Integer num, @Query(a = "edition_uid") String str);

        @GET(a = "/aweme/v1/hotsearch/aweme/billboard/")
        i<HotVideoListResponse> getHotSearchVideoList();

        @GET(a = "/aweme/v1/hotsearch/positive_energy/billboard/")
        i<HotVideoListResponse> getPositiveEnergyList();

        @GET(a = "/aweme/v1/hotsearch/branch_billboard/weekly/list/")
        i<l> getWeeklyList(@Query(a = "bill_type") int i);
    }
}
