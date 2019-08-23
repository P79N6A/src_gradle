package com.ss.android.ugc.aweme.discover.api;

import a.i;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.discover.mixfeed.b;
import com.ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.ss.android.ugc.aweme.discover.model.SearchCommodityList;
import com.ss.android.ugc.aweme.discover.model.SearchMix;
import com.ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.ss.android.ugc.aweme.discover.model.SearchPoiList;
import com.ss.android.ugc.aweme.discover.model.SearchUserList;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import java.util.concurrent.ExecutionException;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class SearchApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42081a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f42082b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/music/rank/")
        q<SearchMusicList> rankMusicList(@Field(a = "cursor") long j, @Field(a = "count") int i);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/recommend/challenge/")
        q<SearchChallengeList> recommendChallengeList(@Field(a = "max_cursor") long j, @Field(a = "count") int i);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/challenge/search/")
        q<SearchChallengeList> searchChallengeList(@Field(a = "cursor") long j, @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "hot_search") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "search_source") String str2, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v2/shop/search/vertical/")
        i<SearchCommodityList> searchCommodityList(@Field(a = "query") String str, @Field(a = "type") int i, @Field(a = "sort") int i2, @Field(a = "cursor") int i3, @Field(a = "count") int i4, @Field(a = "is_pull_refresh") int i5, @Field(a = "hot_search") int i6, @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i7);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/search/item/")
        q<SearchMix> searchFeedList(@Field(a = "keyword") String str, @Field(a = "offset") long j, @Field(a = "count") int i, @Field(a = "source") String str2, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/general/search/single/")
        Observable<b> searchMTMixFeedList(@Field(a = "keyword") String str, @Field(a = "offset") int i, @Field(a = "count") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "search_source") String str2, @Field(a = "hot_search") int i4, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i5);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/general/search/single/")
        i<b> searchMixFeedList(@Field(a = "keyword") String str, @Field(a = "offset") int i, @Field(a = "count") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "search_source") String str2, @Field(a = "hot_search") int i4, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i5);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/general/search/")
        q<SearchMix> searchMixList(@Field(a = "keyword") String str, @Field(a = "offset") long j, @Field(a = "count") int i, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/music/search/")
        q<SearchMusicList> searchMusicList(@Field(a = "cursor") long j, @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/general/poi/search/")
        q<SearchPoiList> searchPoiList(@Field(a = "cursor") long j, @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "search_source") String str2, @Field(a = "hot_search") int i2, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i3);

        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/discover/search/")
        q<SearchUserList> searchUserList(@Field(a = "cursor") long j, @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "type") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "hot_search") int i4, @Field(a = "search_source") String str2, @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i5);
    }

    public static SearchPoiList a(String str, long j, int i, int i2, double d2, double d3, String str2, int i3) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i3)}, null, f42081a, true, 36048, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, SearchPoiList.class)) {
            return (SearchPoiList) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i3)}, null, f42081a, true, 36048, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, SearchPoiList.class);
        }
        try {
            return (SearchPoiList) ((RealApi) f42082b.create(RealApi.class)).searchPoiList(j, str, i, "poi", i2, d2, d3, str2, i3).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchUserList a(String str, long j, int i, int i2, int i3, String str2, String str3, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, str3, Integer.valueOf(i4)}, null, f42081a, true, 36049, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE}, SearchUserList.class)) {
            return (SearchUserList) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, str3, Integer.valueOf(i4)}, null, f42081a, true, 36049, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, String.class, Integer.TYPE}, SearchUserList.class);
        }
        try {
            return (SearchUserList) ((RealApi) f42082b.create(RealApi.class)).searchUserList(j, str, i, 1, i2, i3, str2, str3, i4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchMix a(String str, long j, int i, String str2, int i2, int i3, String str3, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(i4)}, null, f42081a, true, 36055, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchMix.class)) {
            return (SearchMix) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), str2, Integer.valueOf(i2), Integer.valueOf(i3), str3, Integer.valueOf(i4)}, null, f42081a, true, 36055, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchMix.class);
        }
        try {
            return (SearchMix) ((RealApi) f42082b.create(RealApi.class)).searchFeedList(str, j, i, str2, i2, i3, str3, i4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchChallengeList a(long j, int i) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f42081a, true, 36051, new Class[]{Long.TYPE, Integer.TYPE}, SearchChallengeList.class)) {
            return (SearchChallengeList) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f42081a, true, 36051, new Class[]{Long.TYPE, Integer.TYPE}, SearchChallengeList.class);
        }
        try {
            return (SearchChallengeList) ((RealApi) f42082b.create(RealApi.class)).recommendChallengeList(j2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchMusicList b(long j, int i) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f42081a, true, 36053, new Class[]{Long.TYPE, Integer.TYPE}, SearchMusicList.class)) {
            return (SearchMusicList) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i)}, null, f42081a, true, 36053, new Class[]{Long.TYPE, Integer.TYPE}, SearchMusicList.class);
        }
        try {
            return (SearchMusicList) ((RealApi) f42082b.create(RealApi.class)).rankMusicList(j2, i).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchChallengeList a(String str, long j, int i, int i2, int i3, String str2, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36050, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchChallengeList.class)) {
            return (SearchChallengeList) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36050, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchChallengeList.class);
        }
        try {
            return (SearchChallengeList) ((RealApi) f42082b.create(RealApi.class)).searchChallengeList(j, str, i, i3, i2, "challenge", str2, i4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static SearchMusicList b(String str, long j, int i, int i2, int i3, String str2, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36052, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchMusicList.class)) {
            return (SearchMusicList) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36052, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, SearchMusicList.class);
        }
        try {
            return (SearchMusicList) ((RealApi) f42082b.create(RealApi.class)).searchMusicList(j, str, i, i2, i3, str2, i4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static i<SearchCommodityList> a(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
        if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)}, null, f42081a, true, 36058, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class)) {
            return ((RealApi) f42082b.create(RealApi.class)).searchCommodityList(str, i, i2, i3, i4, i5, i6, str2, i7);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), str2, Integer.valueOf(i7)}, null, f42081a, true, 36058, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE}, i.class);
    }

    public static SearchMix a(String str, long j, int i, int i2, int i3, double d2, double d3, String str2, int i4) throws Exception {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36054, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, SearchMix.class)) {
            return (SearchMix) PatchProxy.accessDispatch(new Object[]{str, new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Double.valueOf(d2), Double.valueOf(d3), str2, Integer.valueOf(i4)}, null, f42081a, true, 36054, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, SearchMix.class);
        }
        try {
            return (SearchMix) ((RealApi) f42082b.create(RealApi.class)).searchMixList(str, j, i, i2, i3, d2, d3, str2, i4).get();
        } catch (ExecutionException e2) {
            throw m.a(e2);
        }
    }

    public static i<b> a(String str, int i, int i2, int i3, String str2, int i4, double d2, double d3, String str3, int i5) {
        if (!PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4), Double.valueOf(d2), Double.valueOf(d3), str3, Integer.valueOf(i5)}, null, f42081a, true, 36056, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, i.class)) {
            return ((RealApi) f42082b.create(RealApi.class)).searchMixFeedList(str, i, i2, i3, str2, i4, d2, d3, str3, i5);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), str2, Integer.valueOf(i4), Double.valueOf(d2), Double.valueOf(d3), str3, Integer.valueOf(i5)}, null, f42081a, true, 36056, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Double.TYPE, Double.TYPE, String.class, Integer.TYPE}, i.class);
    }
}
