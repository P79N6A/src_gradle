package com.ss.android.ugc.aweme.discover.api;

import a.i;
import android.annotation.SuppressLint;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.discover.base.f;
import com.ss.android.ugc.aweme.discover.base.g;
import com.ss.android.ugc.aweme.discover.model.SearchApiResult;
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
import io.reactivex.functions.Function;
import java.util.concurrent.ExecutionException;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001GB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J\u0016\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020#2\u0006\u0010$\u001a\u00020\u0004J>\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004JT\u0010.\u001a\b\u0012\u0004\u0012\u0002000/2\u0006\u0010)\u001a\u00020\n2\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004JF\u00103\u001a\u0002042\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u00105\u001a\u00020\n2\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004J$\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u00109\u001a\u00020:2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u0004J`\u00106\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00042\b\b\u0002\u0010<\u001a\u00020=2\b\b\u0002\u0010>\u001a\u00020=2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004JN\u0010?\u001a\u0002042\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004J\\\u0010@\u001a\b\u0012\u0004\u0012\u0002080/2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004JN\u0010A\u001a\b\u0012\u0004\u0012\u00020!072\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u00042\u0006\u0010B\u001a\u00020\u0004H\u0007JF\u0010C\u001a\u00020D2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020=2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004JF\u0010E\u001a\u00020F2\u0006\u0010)\u001a\u00020\n2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\u00042\u0006\u0010+\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\n2\u0006\u0010,\u001a\u00020\n2\u0006\u0010-\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\u00020\nXD¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u000e\u0010\u0019\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nXT¢\u0006\u0002\n\u0000R\u001c\u0010\u001b\u001a\n \u001d*\u0004\u0018\u00010\u001c0\u001cX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006H"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SearchApiNew;", "", "()V", "CORRECT_TYPE_NEED_CORRECT", "", "getCORRECT_TYPE_NEED_CORRECT", "()I", "CORRECT_TYPE_NOT_NEED_CORRECT", "getCORRECT_TYPE_NOT_NEED_CORRECT", "RANK_MUSIC_LIST", "", "RECOMMEND_CHALLENGE_API", "SEARCH_CHALLENGE_API", "SEARCH_COMMODITY_API", "SEARCH_FEED_API", "SEARCH_HOST", "getSEARCH_HOST", "()Ljava/lang/String;", "SEARCH_MIX_API", "SEARCH_MIX_FEED_API", "SEARCH_MUSIC_API", "SEARCH_MUSIC_AUTHOR", "getSEARCH_MUSIC_AUTHOR", "SEARCH_MUSIC_NOT_AUTHOR", "getSEARCH_MUSIC_NOT_AUTHOR", "SEARCH_POI_API", "SEARCH_USER_API", "sRetrofit", "Lcom/ss/android/ugc/aweme/framework/services/IRetrofit;", "kotlin.jvm.PlatformType", "getSRetrofit$main_douyinCnRelease", "()Lcom/ss/android/ugc/aweme/framework/services/IRetrofit;", "rankMusicList", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusicList;", "cursor", "", "count", "recommendChallengeList", "Lcom/ss/android/ugc/aweme/discover/model/SearchChallengeList;", "maxCursor", "searchChallengeList", "keyword", "pullRefresh", "hotSearch", "searchId", "correctType", "searchCommodityList", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodityList;", "type", "sort", "searchFeedList", "Lcom/ss/android/ugc/aweme/discover/model/SearchMix;", "source", "searchMTMixFeed", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeedList;", "param", "Lcom/ss/android/ugc/aweme/discover/jedi/viewmodel/SearchRequestParam;", "searchSource", "latitude", "", "longitude", "searchMix", "searchMixFeed", "searchMusicList", "isAuthorSearch", "searchPoiList", "Lcom/ss/android/ugc/aweme/discover/model/SearchPoiList;", "searchUserList", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "RealApi", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SearchApiNew {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f42083a = null;

    /* renamed from: b  reason: collision with root package name */
    public static final int f42084b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static final SearchApiNew f42085c = new SearchApiNew();
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    private static final String f42086d = f42086d;

    /* renamed from: e  reason: collision with root package name */
    private static final IRetrofit f42087e = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit(f42086d);

    /* renamed from: f  reason: collision with root package name */
    private static final int f42088f = 1;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\"\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u000b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J^\u0010\f\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'Jh\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0018\u001a\u00020\b2\b\b\u0001\u0010\u0005\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'J^\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'Jv\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020!2\n\b\u0001\u0010\u0012\u001a\u0004\u0018\u00010\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'Jr\u0010#\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00152\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\b2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u0011\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'Jh\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u001b\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'J^\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\b2\b\b\u0001\u0010&\u001a\u00020\bH'Jh\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010 \u001a\u00020!2\b\b\u0001\u0010\"\u001a\u00020!2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'Jh\u0010)\u001a\b\u0012\u0004\u0012\u00020*0\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u0017\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\b2\b\b\u0001\u0010\u000f\u001a\u00020\b2\b\b\u0001\u0010\u001c\u001a\u00020\u000e2\b\b\u0001\u0010\u0012\u001a\u00020\u000e2\b\b\u0001\u0010\u0013\u001a\u00020\bH'¨\u0006+"}, d2 = {"Lcom/ss/android/ugc/aweme/discover/api/SearchApiNew$RealApi;", "", "rankMusicList", "Lcom/google/common/util/concurrent/ListenableFuture;", "Lcom/ss/android/ugc/aweme/discover/model/SearchMusicList;", "cursor", "", "count", "", "recommendChallengeList", "Lcom/ss/android/ugc/aweme/discover/model/SearchChallengeList;", "maxCursor", "searchChallengeList", "keyword", "", "hotSearch", "pullRefresh", "searchSource", "searchId", "correctType", "searchCommodityList", "Lbolts/Task;", "Lcom/ss/android/ugc/aweme/discover/model/SearchCommodityList;", "type", "sort", "searchFeedList", "Lcom/ss/android/ugc/aweme/discover/model/SearchMix;", "offset", "source", "searchMTMixFeedList", "Lio/reactivex/Observable;", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeedList;", "latitude", "", "longitude", "searchMixFeedList", "searchMixList", "searchMusicList", "isAuthorSearch", "searchPoiList", "Lcom/ss/android/ugc/aweme/discover/model/SearchPoiList;", "searchUserList", "Lcom/ss/android/ugc/aweme/discover/model/SearchUserList;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public interface RealApi {
        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/music/rank/")
        q<SearchMusicList> rankMusicList(@Field(a = "cursor") long j, @Field(a = "count") int i);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/recommend/challenge/")
        q<SearchChallengeList> recommendChallengeList(@Field(a = "max_cursor") long j, @Field(a = "count") int i);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/challenge/search/")
        q<SearchChallengeList> searchChallengeList(@Field(a = "cursor") long j, @NotNull @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "hot_search") int i2, @Field(a = "is_pull_refresh") int i3, @NotNull @Field(a = "search_source") String str2, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v2/shop/search/vertical/")
        i<SearchCommodityList> searchCommodityList(@NotNull @Field(a = "query") String str, @Field(a = "type") int i, @Field(a = "sort") int i2, @Field(a = "cursor") int i3, @Field(a = "count") int i4, @Field(a = "is_pull_refresh") int i5, @Field(a = "hot_search") int i6, @NotNull @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i7);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/search/item/")
        q<SearchMix> searchFeedList(@NotNull @Field(a = "keyword") String str, @Field(a = "offset") long j, @Field(a = "count") int i, @NotNull @Field(a = "source") String str2, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/general/search/single/")
        Observable<com.ss.android.ugc.aweme.discover.mixfeed.b> searchMTMixFeedList(@NotNull @Field(a = "keyword") String str, @Field(a = "offset") int i, @Field(a = "count") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "search_source") @Nullable String str2, @Field(a = "hot_search") int i4, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @Field(a = "search_id") @Nullable String str3, @Field(a = "query_correct_type") int i5);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/general/search/single/")
        i<com.ss.android.ugc.aweme.discover.mixfeed.b> searchMixFeedList(@NotNull @Field(a = "keyword") String str, @Field(a = "offset") int i, @Field(a = "count") int i2, @Field(a = "is_pull_refresh") int i3, @NotNull @Field(a = "search_source") String str2, @Field(a = "hot_search") int i4, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i5);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/general/search/")
        q<SearchMix> searchMixList(@NotNull @Field(a = "keyword") String str, @Field(a = "offset") long j, @Field(a = "count") int i, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @NotNull @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i4);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/music/search/")
        Observable<SearchMusicList> searchMusicList(@Field(a = "cursor") long j, @NotNull @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "is_pull_refresh") int i2, @Field(a = "hot_search") int i3, @NotNull @Field(a = "search_id") String str2, @Field(a = "query_correct_type") int i4, @Field(a = "is_author_search") int i5);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/general/poi/search/")
        q<SearchPoiList> searchPoiList(@Field(a = "cursor") long j, @NotNull @Field(a = "keyword") String str, @Field(a = "count") int i, @NotNull @Field(a = "search_source") String str2, @Field(a = "hot_search") int i2, @Field(a = "latitude") double d2, @Field(a = "longitude") double d3, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i3);

        @FormUrlEncoded
        @NotNull
        @POST(a = "/aweme/v1/discover/search/")
        q<SearchUserList> searchUserList(@Field(a = "cursor") long j, @NotNull @Field(a = "keyword") String str, @Field(a = "count") int i, @Field(a = "type") int i2, @Field(a = "is_pull_refresh") int i3, @Field(a = "hot_search") int i4, @NotNull @Field(a = "search_source") String str2, @NotNull @Field(a = "search_id") String str3, @Field(a = "query_correct_type") int i5);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeedList;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class a<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42089a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f42090b = new a();

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/discover/api/SearchApiNew$searchMTMixFeed$1$value$1", "Lcom/ss/android/ugc/aweme/discover/base/SearchCommonRequestId;", "searchType", "", "getSearchType", "()I", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
        /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApiNew$a$a  reason: collision with other inner class name */
        public static final class C0533a implements g {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f42091a;

            public final int a() {
                return 3;
            }

            C0533a() {
            }
        }

        a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            Object obj2;
            com.ss.android.ugc.aweme.discover.mixfeed.b bVar = (com.ss.android.ugc.aweme.discover.mixfeed.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f42089a, false, 36071, new Class[]{com.ss.android.ugc.aweme.discover.mixfeed.b.class}, com.ss.android.ugc.aweme.discover.mixfeed.b.class)) {
                obj2 = PatchProxy.accessDispatch(new Object[]{bVar}, this, f42089a, false, 36071, new Class[]{com.ss.android.ugc.aweme.discover.mixfeed.b.class}, com.ss.android.ugc.aweme.discover.mixfeed.b.class);
            } else {
                Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
                C0533a aVar = new C0533a();
                SearchApiResult searchApiResult = bVar;
                if (PatchProxy.isSupport(new Object[]{searchApiResult}, aVar, C0533a.f42091a, false, 36072, new Class[]{SearchApiResult.class}, SearchApiResult.class)) {
                    C0533a aVar2 = aVar;
                    obj2 = (SearchApiResult) PatchProxy.accessDispatch(new Object[]{searchApiResult}, aVar2, C0533a.f42091a, false, 36072, new Class[]{SearchApiResult.class}, SearchApiResult.class);
                } else {
                    Intrinsics.checkParameterIsNotNull(searchApiResult, "data");
                    obj2 = g.a.a(aVar, searchApiResult);
                }
                if (obj2 == null) {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.mixfeed.SearchMixFeedList");
                }
            }
            return (com.ss.android.ugc.aweme.discover.mixfeed.b) obj2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/discover/mixfeed/SearchMixFeedList;", "it", "apply"}, k = 3, mv = {1, 1, 15})
    static final class b<T, R> implements Function<T, R> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f42092a;

        /* renamed from: b  reason: collision with root package name */
        public static final b f42093b = new b();

        b() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            com.ss.android.ugc.aweme.discover.mixfeed.b bVar = (com.ss.android.ugc.aweme.discover.mixfeed.b) obj;
            if (PatchProxy.isSupport(new Object[]{bVar}, this, f42092a, false, 36073, new Class[]{com.ss.android.ugc.aweme.discover.mixfeed.b.class}, com.ss.android.ugc.aweme.discover.mixfeed.b.class)) {
                return (com.ss.android.ugc.aweme.discover.mixfeed.b) PatchProxy.accessDispatch(new Object[]{bVar}, this, f42092a, false, 36073, new Class[]{com.ss.android.ugc.aweme.discover.mixfeed.b.class}, com.ss.android.ugc.aweme.discover.mixfeed.b.class);
            }
            Intrinsics.checkParameterIsNotNull(bVar, AdvanceSetting.NETWORK_TYPE);
            f.f42170b.a(bVar);
            return bVar;
        }
    }

    private SearchApiNew() {
    }

    @NotNull
    public final Observable<com.ss.android.ugc.aweme.discover.mixfeed.b> a(@NotNull com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar, int i, int i2) {
        com.ss.android.ugc.aweme.discover.jedi.viewmodel.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2, Integer.valueOf(i), 10}, this, f42083a, false, 36069, new Class[]{com.ss.android.ugc.aweme.discover.jedi.viewmodel.f.class, Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{fVar2, Integer.valueOf(i), 10}, this, f42083a, false, 36069, new Class[]{com.ss.android.ugc.aweme.discover.jedi.viewmodel.f.class, Integer.TYPE, Integer.TYPE}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "param");
        Observable<com.ss.android.ugc.aweme.discover.mixfeed.b> map = ((RealApi) f42087e.create(RealApi.class)).searchMTMixFeedList(fVar2.f42535b, i, 10, fVar2.f42536c, fVar2.f42537d, fVar2.f42538e, 0.0d, 0.0d, fVar2.g, fVar2.f42539f).map(a.f42090b).map(b.f42093b);
        Intrinsics.checkExpressionValueIsNotNull(map, "sRetrofit.create(RealApi…     it\n                }");
        return map;
    }

    @SuppressLint({"TooManyMethodParam"})
    @NotNull
    public final Observable<SearchMusicList> a(@NotNull String str, long j, int i, int i2, int i3, @NotNull String str2, int i4, int i5) throws Exception {
        String str3 = str;
        long j2 = j;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{str3, new Long(j2), 20, Integer.valueOf(i2), Integer.valueOf(i3), str4, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42083a, false, 36063, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{str3, new Long(j2), 20, Integer.valueOf(i2), Integer.valueOf(i3), str4, Integer.valueOf(i4), Integer.valueOf(i5)}, this, f42083a, false, 36063, new Class[]{String.class, Long.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE}, Observable.class);
        }
        Intrinsics.checkParameterIsNotNull(str3, "keyword");
        Intrinsics.checkParameterIsNotNull(str4, "searchId");
        try {
            return ((RealApi) f42087e.create(RealApi.class)).searchMusicList(j, str, 20, i2, i3, str2, i4, i5);
        } catch (ExecutionException e2) {
            RuntimeException a2 = m.a(e2);
            Intrinsics.checkExpressionValueIsNotNull(a2, "getCompatibleException(e)");
            throw a2;
        }
    }
}
