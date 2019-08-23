package com.ss.android.ugc.aweme.discover.api;

import com.ss.android.ugc.aweme.discover.model.HotSearchListResponse;
import com.ss.android.ugc.aweme.discover.model.HotVideoListResponse;
import com.ss.android.ugc.aweme.discover.model.RankingListCover;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\bf\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dJB\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\b2\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0001\u0010\u000b\u001a\u00020\bH'J5\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00032\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\b2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\b2\b\b\u0003\u0010\u000f\u001a\u00020\u0006H'¢\u0006\u0002\u0010\u0010J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120\u0003H'J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0003H'J^\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u00032\b\b\u0001\u0010\u0017\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u00182\b\b\u0001\u0010\t\u001a\u00020\b2\b\b\u0001\u0010\n\u001a\u00020\u00062\b\b\u0001\u0010\u0019\u001a\u00020\b2\b\b\u0001\u0010\u001a\u001a\u00020\b2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\bH'¨\u0006\u001e"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/HotSearchApi;", "", "getAwemesByHotWord", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/hotspot/data/HotSpotAwemes;", "hotword", "", "offset", "", "count", "source", "isAd", "getHotSearchList", "Lcom/ss/android/ugc/aweme/discover/model/HotSearchListResponse;", "detailListType", "current_word", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lio/reactivex/Observable;", "getHotVideoList", "Lcom/ss/android/ugc/aweme/discover/model/HotVideoListResponse;", "getRankingListCover", "Lcom/ss/android/ugc/aweme/discover/model/RankingListCover;", "searchFeedList", "Lcom/ss/android/ugc/aweme/discover/model/SearchMix;", "keyword", "", "pullRefresh", "hotSearch", "searchId", "correctType", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public interface HotSearchApi {

    /* renamed from: a  reason: collision with root package name */
    public static final a f42075a = a.f42076a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rXT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/HotSearchApi$Companion;", "", "()V", "GET_AWEMES_BY_HOTWORD", "", "GET_HOT_SEARCH_LIST", "GET_HOT_VIDEO_LIST", "GET_RANKING_LIST_COVER", "INSTANCE", "Lcom/ss/android/ugc/aweme/discover/api/HotSearchApi;", "getINSTANCE", "()Lcom/ss/android/ugc/aweme/discover/api/HotSearchApi;", "SOURCE_HOT_SPOT", "", "SOURCE_RACE_LAMP", "TYPE_HOT_SEARCH_BILLBOARD", "TYPE_HOT_SEARCH_WORD", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ a f42076a = new a();
        @NotNull

        /* renamed from: b  reason: collision with root package name */
        private static final HotSearchApi f42077b;

        private a() {
        }

        @NotNull
        public static HotSearchApi a() {
            return f42077b;
        }

        static {
            Object create = com.ss.android.ugc.aweme.discover.api.a.b.f42105a.create(HotSearchApi.class);
            Intrinsics.checkExpressionValueIsNotNull(create, "RetrofitProvider.COMMON_…HotSearchApi::class.java)");
            f42077b = (HotSearchApi) create;
        }
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 15})
    public static final class b {
    }

    @NotNull
    @GET(a = "/aweme/v1/hot/search/video/list/")
    Observable<com.ss.android.ugc.aweme.discover.hotspot.a.a> getAwemesByHotWord(@NotNull @Query(a = "hotword") String str, @Query(a = "offset") int i, @Query(a = "count") int i2, @Nullable @Query(a = "source") String str2, @Query(a = "is_ad") int i3);

    @NotNull
    @GET(a = "/aweme/v1/hot/search/list/")
    Observable<HotSearchListResponse> getHotSearchList(@Nullable @Query(a = "detail_list") Integer num, @Nullable @Query(a = "source") Integer num2, @NotNull @Query(a = "current_word") String str);

    @NotNull
    @GET(a = "/aweme/v1/hotsearch/aweme/billboard/")
    Observable<HotVideoListResponse> getHotVideoList();

    @NotNull
    @GET(a = "/aweme/v1/branch/billboard/entrance/")
    Observable<RankingListCover> getRankingListCover();

    @FormUrlEncoded
    @NotNull
    @POST(a = "/aweme/v1/search/item/")
    Observable<SearchMix> searchFeedList(@NotNull @Field(a = "keyword") String str, @Field(a = "offset") long j, @Field(a = "count") int i, @NotNull @Field(a = "source") String str2, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i4);
}
