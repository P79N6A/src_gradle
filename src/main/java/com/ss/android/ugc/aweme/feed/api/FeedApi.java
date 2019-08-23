package com.ss.android.ugc.aweme.feed.api;

import a.i;
import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import beancopy.ConvertHelp;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.retrofit2.http.Priority;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.applog.GlobalContext;
import com.ss.android.common.applog.z;
import com.ss.android.ugc.aweme.ak.a;
import com.ss.android.ugc.aweme.antiaddic.c;
import com.ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.ss.android.ugc.aweme.app.AwemeAppData;
import com.ss.android.ugc.aweme.app.ab;
import com.ss.android.ugc.aweme.app.af;
import com.ss.android.ugc.aweme.app.api.b.b;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.app.constants.Constants;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.base.utils.r;
import com.ss.android.ugc.aweme.commercialize.api.LinkDataApi;
import com.ss.android.ugc.aweme.commercialize.splash.AwesomeSplashPreloadTask;
import com.ss.android.ugc.aweme.feed.ai;
import com.ss.android.ugc.aweme.feed.h.g;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.FeedTimeLineItemList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.t;
import com.ss.android.ugc.aweme.poi.e.o;
import com.ss.android.ugc.aweme.setting.AbTestManager;
import com.ss.android.ugc.aweme.utils.cn;
import com.ss.android.ugc.aweme.utils.permission.e;
import com.ss.ugc.aweme.proto.aweme_v2_feed_response;
import io.reactivex.functions.Function;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.Nullable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class FeedApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45052a;

    /* renamed from: b  reason: collision with root package name */
    public static AtomicBoolean f45053b = new AtomicBoolean(true);

    /* renamed from: c  reason: collision with root package name */
    public static final RetrofitApi f45054c = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    public interface RetrofitApi {
        @GET(a = "/aweme/v1/aweme/delete/")
        q<BaseResponse> deleteItem(@Query(a = "aweme_id") String str);

        @GET(a = "/aweme/v1/commit/item/digg/")
        q<BaseResponse> diggItem(@Query(a = "aweme_id") String str, @Query(a = "type") int i, @Query(a = "channel_id") int i2);

        @GET(a = "/aweme/v1/commit/item/digg/")
        q<BaseResponse> diggItem(@Query(a = "aweme_id") String str, @Query(a = "origin_aweme_id") String str2, @Query(a = "type") int i, @Query(a = "channel_id") int i2);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/nearby/feed/")
        q<FeedItemList> fetchNearbyFeed(@Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i, @Query(a = "feed_style") Integer num, @Query(a = "aweme_id") String str, @Query(a = "filter_warn") int i2, @Query(a = "city") String str2, @Query(a = "latitude") String str3, @Query(a = "longitude") String str4, @Query(a = "poi_class_code") int i3, @Query(a = "pull_type") int i4, @Query(a = "location_permission") int i5);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/nearby/feed/")
        q<FeedItemList> fetchNearbyMockFeed(@Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i, @Query(a = "feed_style") Integer num, @Query(a = "aweme_id") String str, @Query(a = "filter_warn") int i2, @Query(a = "city") String str2, @Query(a = "location_permission") int i3);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/poi/vertical/aweme/")
        q<FeedItemList> fetchPoiTypeFeeds(@Query(a = "count") int i, @Query(a = "feed_style") Integer num, @Query(a = "filter_warn") int i2, @Query(a = "city_code") String str, @Query(a = "latitude") String str2, @Query(a = "longitude") String str3, @Query(a = "poi_class_code") int i3, @Query(a = "cursor") long j);

        @GET(a = "/aweme/v1/feed/")
        i<FeedItemList> fetchRecommendFeed(@Query(a = "type") int i, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i2, @Query(a = "feed_style") Integer num, @Query(a = "aweme_id") String str, @Query(a = "volume") double d2, @Query(a = "pull_type") int i3, @Query(a = "need_relieve_aweme") int i4, @Query(a = "filter_warn") int i5, @Query(a = "req_from") String str2, @Query(a = "aweme_ids") String str3, @Query(a = "push_params") String str4, @Query(a = "is_cold_start") int i6, @Query(a = "longitude") String str5, @Query(a = "latitude") String str6, @Query(a = "address_book_access") Integer num2, @Query(a = "gps_access") Integer num3, @Query(a = "top_view_cid") String str7, @Query(a = "top_view_aid") Long l);

        @Priority(a = 3)
        @SuppressLint({"RetrofitImportPackage"})
        @GET(a = "/aweme/v1/feed/")
        i<FeedItemList> fetchRecommendFeedImmediate(@Query(a = "type") int i, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i2, @Query(a = "feed_style") Integer num, @Query(a = "aweme_id") String str, @Query(a = "volume") double d2, @Query(a = "pull_type") int i3, @Query(a = "need_relieve_aweme") int i4, @Query(a = "filter_warn") int i5, @Query(a = "req_from") String str2, @Query(a = "aweme_ids") String str3, @Query(a = "push_params") String str4, @Query(a = "is_cold_start") int i6, @Query(a = "longitude") String str5, @Query(a = "latitude") String str6, @Query(a = "address_book_access") Integer num2, @Query(a = "gps_access") Integer num3, @Query(a = "top_view_cid") String str7, @Query(a = "top_view_aid") Long l);

        @GET(a = "/aweme/v2/feed/")
        i<b<aweme_v2_feed_response, FeedItemList>> fetchRecommendFeedV2(@Query(a = "type") int i, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i2, @Query(a = "feed_style") Integer num, @Query(a = "aweme_id") String str, @Query(a = "volume") double d2, @Query(a = "pull_type") int i3, @Query(a = "need_relieve_aweme") int i4, @Query(a = "filter_warn") int i5, @Query(a = "req_from") String str2, @Query(a = "aweme_ids") String str3, @Query(a = "push_params") String str4, @Query(a = "is_cold_start") int i6, @Query(a = "longitude") String str5, @Query(a = "latitude") String str6, @Query(a = "address_book_access") Integer num2, @Query(a = "gps_access") Integer num3, @Query(a = "top_view_cid") String str7, @Query(a = "top_view_aid") Long l);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/fresh/feed/")
        q<FeedTimeLineItemList> fetchTimelineFeed(@Query(a = "type") int i, @Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "count") int i2, @Query(a = "aweme_id") String str, @Query(a = "aweme_ids") String str2, @Query(a = "push_params") String str3, @Query(a = "filter_warn") int i3);
    }

    @Nullable
    @SuppressLint({"TooManyMethodParam", "ApplySharedPref"})
    private static FeedItemList a(int i, long j, long j2, int i2, Integer num, String str, @Constants.FeedPullType int i3, String str2, String str3) throws Exception {
        boolean z;
        int i4;
        int i5;
        boolean z2;
        int i6;
        int i7;
        i<FeedItemList> iVar;
        FeedItemList feedItemList;
        String str4;
        String str5;
        String str6;
        String str7;
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), Integer.valueOf(i2), num, str, Integer.valueOf(i3), str2, str3}, null, f45052a, true, 40877, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, String.class, String.class}, FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j3), new Long(j4), Integer.valueOf(i2), num, str, Integer.valueOf(i3), str2, str3}, null, f45052a, true, 40877, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, String.class, String.class}, FeedItemList.class);
        }
        int d2 = c.a().d();
        if (a.a() == 1) {
            i4 = i3;
            z = true;
        } else {
            i4 = i3;
            z = false;
        }
        if (i4 != 2 || !AwemeAppData.p().ap) {
            i5 = i4;
        } else if (AwemeAppData.p().aq) {
            i5 = 5;
        } else {
            i5 = 7;
        }
        String str8 = PushConstants.PUSH_TYPE_NOTIFY;
        String str9 = PushConstants.PUSH_TYPE_NOTIFY;
        com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
        if (f2 != null) {
            str8 = String.valueOf(f2.latitude);
            str9 = String.valueOf(f2.longitude);
        }
        String str10 = str8;
        String str11 = str9;
        String str12 = com.ss.android.ugc.aweme.commercialize.splash.a.a().h;
        Long b2 = com.ss.android.ugc.aweme.commercialize.splash.a.a().b(str12);
        if (i5 == 4 || i5 == 0) {
            t.f57014c.a();
        }
        if (!com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "pb_convert_flag", 0).getBoolean("pb_convert_flag", false)) {
            z2 = AbTestManager.a().ca();
        } else {
            z2 = false;
        }
        if (com.ss.android.ugc.aweme.framework.core.a.b().f3306d) {
            z2 = false;
        }
        i<b<aweme_v2_feed_response, FeedItemList>> iVar2 = null;
        if (z2) {
            RetrofitApi retrofitApi = f45054c;
            double a2 = r.a();
            int contentFilterFlag = TimeLockRuler.getContentFilterFlag();
            if (z) {
                str7 = "enter_auto";
            } else {
                str7 = "";
            }
            String str13 = str7;
            i7 = i5;
            i6 = d2;
            iVar2 = retrofitApi.fetchRecommendFeedV2(i, j, j2, i2, num, str, a2, i7, i6, contentFilterFlag, str13, str2, str3, f45053b.get() ? 1 : 0, str11, str10, Integer.valueOf(e.a()), Integer.valueOf(e.b()), str12, b2);
            iVar = null;
        } else {
            String str14 = str12;
            i7 = i5;
            i6 = d2;
            if (AbTestManager.a().s()) {
                RetrofitApi retrofitApi2 = f45054c;
                double a3 = r.a();
                int contentFilterFlag2 = TimeLockRuler.getContentFilterFlag();
                if (z) {
                    str6 = "enter_auto";
                } else {
                    str6 = "";
                }
                String str15 = str6;
                boolean z3 = f45053b.get();
                iVar = retrofitApi2.fetchRecommendFeedImmediate(i, j, j2, i2, num, str, a3, i7, i6, contentFilterFlag2, str15, str2, str3, z3 ? 1 : 0, str11, str10, Integer.valueOf(e.a()), Integer.valueOf(e.b()), str14, b2);
            } else {
                RetrofitApi retrofitApi3 = f45054c;
                double a4 = r.a();
                int contentFilterFlag3 = TimeLockRuler.getContentFilterFlag();
                if (z) {
                    str5 = "enter_auto";
                } else {
                    str5 = "";
                }
                String str16 = str5;
                boolean z4 = f45053b.get();
                iVar = retrofitApi3.fetchRecommendFeed(i, j, j2, i2, num, str, a4, i7, i6, contentFilterFlag3, str16, str2, str3, z4 ? 1 : 0, str11, str10, Integer.valueOf(e.a()), Integer.valueOf(e.b()), str14, b2);
            }
        }
        com.ss.android.ugc.aweme.commercialize.splash.a.a().c();
        f45053b.getAndSet(false);
        if (i6 == 1) {
            com.ss.android.ugc.aweme.comment.a.a.a("RELIEVE:" + c.a().b(System.currentTimeMillis()));
        }
        if (iVar != null) {
            iVar.g();
            if (iVar.d()) {
                throw iVar.f();
            }
        } else if (iVar2 != null) {
            iVar2.g();
            if (iVar2.d()) {
                throw iVar2.f();
            }
        } else {
            throw new IllegalStateException("what else task?");
        }
        int i8 = i7;
        if (i8 == 4 || i8 == 0) {
            t tVar = t.f57014c;
            if (AbTestManager.a().s()) {
                str4 = "immediate";
            } else {
                str4 = "normal";
            }
            tVar.a(str4);
        }
        if (iVar != null) {
            feedItemList = (FeedItemList) iVar.e();
        } else {
            b bVar = new b(i, j, j2, i2, num, str, i8, str2, str3);
            feedItemList = (FeedItemList) ((b) iVar2.e()).a((Function<P, J>) bVar);
        }
        ab.a().a(feedItemList);
        if (!(feedItemList == null || feedItemList.preloadAds == null)) {
            com.ss.android.ugc.aweme.lego.a.i.a().a(new AwesomeSplashPreloadTask(feedItemList.preloadAds)).a();
        }
        return feedItemList;
    }

    static final /* synthetic */ FeedItemList a(int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, aweme_v2_feed_response aweme_v2_feed_response) throws Exception {
        FeedItemList feedItemList;
        aweme_v2_feed_response aweme_v2_feed_response2 = aweme_v2_feed_response;
        if (PatchProxy.isSupport(new Object[]{"V2 copy start"}, null, cn.f75692a, true, 88395, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{"V2 copy start"}, null, cn.f75692a, true, 88395, new Class[]{String.class}, Void.TYPE);
        } else {
            cn.f75693b.put("V2 copy start", Long.valueOf(System.currentTimeMillis()));
        }
        try {
            if (PatchProxy.isSupport(new Object[]{aweme_v2_feed_response2, null}, null, d.f45066a, true, 40886, new Class[]{aweme_v2_feed_response.class, FeedItemList.class}, FeedItemList.class)) {
                feedItemList = (FeedItemList) PatchProxy.accessDispatch(new Object[]{aweme_v2_feed_response2, null}, null, d.f45066a, true, 40886, new Class[]{aweme_v2_feed_response.class, FeedItemList.class}, FeedItemList.class);
            } else {
                feedItemList = ConvertHelp.com$ss$ugc$aweme$proto$aweme_v2_feed_response$$com$ss$android$ugc$aweme$feed$model$FeedItemList(aweme_v2_feed_response2, null);
            }
            n.a("log_bean_copy_convert", "", com.ss.android.ugc.aweme.app.d.c.a().a("spendTime", Long.valueOf(cn.a("V2 copy start"))).b());
            return feedItemList;
        } catch (Throwable th) {
            n.a("log_bean_copy_convert_error", null, com.ss.android.ugc.aweme.app.d.c.a().a("errMsg", Log.getStackTraceString(th)).b());
            if (!com.ss.android.ugc.aweme.g.a.a()) {
                com.ss.android.ugc.aweme.framework.a.a.a((Throwable) new a(th));
                ExceptionMonitor.ensureNotReachHere(th);
                com.ss.android.ugc.aweme.q.c.a(com.ss.android.ugc.aweme.framework.e.a.a(), "pb_convert_flag", 0).edit().putBoolean("pb_convert_flag", true).commit();
                return a(i, j, j2, i2, num, str, i3, str2, str3);
            }
            Context context = GlobalContext.getContext();
            com.bytedance.ies.dmt.ui.d.a.b(context, "feedApi pb convert error:\n" + th).a();
            throw th;
        }
    }

    @SuppressLint({"TooManyMethodParam"})
    public static FeedItemList a(int i, long j, long j2, int i2, Integer num, String str, @Constants.FeedPullType int i3, int i4, String str2, String str3, String str4, long j3) throws Exception {
        FeedItemList feedItemList;
        String str5;
        String str6;
        int i5 = i;
        long j4 = j;
        long j5 = j2;
        long j6 = j3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), Integer.valueOf(i2), num, str, Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, new Long(j6)}, null, f45052a, true, 40876, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Long.TYPE}, FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i), new Long(j4), new Long(j5), Integer.valueOf(i2), num, str, Integer.valueOf(i3), Integer.valueOf(i4), str2, str3, str4, new Long(j6)}, null, f45052a, true, 40876, new Class[]{Integer.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE, Integer.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, String.class, Long.TYPE}, FeedItemList.class);
        }
        g.f45484f = z.a();
        if (i5 == 2) {
            try {
                feedItemList = (FeedItemList) f45054c.fetchTimelineFeed(i, j, j2, i2, str, str3, str4, TimeLockRuler.getContentFilterFlag()).get();
            } catch (ExecutionException e2) {
                throw m.a(e2);
            }
        } else if (i5 == 7) {
            String str7 = "";
            String str8 = "";
            try {
                com.ss.android.ugc.aweme.poi.a f2 = af.a(d.a()).f();
                if (f2 != null) {
                    str7 = String.valueOf(f2.latitude);
                    str8 = String.valueOf(f2.longitude);
                }
                String str9 = str7;
                String str10 = str8;
                boolean z = !af.b(d.a());
                if (TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a())) {
                    str6 = com.ss.android.ugc.aweme.feed.c.d();
                } else {
                    str6 = com.ss.android.ugc.aweme.feed.c.a();
                }
                feedItemList = (FeedItemList) f45054c.fetchNearbyFeed(j, j2, i2, num, str, TimeLockRuler.getContentFilterFlag(), str6, str9, str10, i4, i3, z ? 1 : 0).get();
            } catch (ExecutionException e3) {
                throw m.a(e3);
            }
        } else if (i5 == 11) {
            String str11 = "";
            String str12 = "";
            try {
                com.ss.android.ugc.aweme.poi.a f3 = af.a(d.a()).f();
                if (f3 != null) {
                    str11 = String.valueOf(f3.latitude);
                    str12 = String.valueOf(f3.longitude);
                }
                String str13 = str11;
                String str14 = str12;
                if (TextUtils.isEmpty(com.ss.android.ugc.aweme.feed.c.a())) {
                    str5 = com.ss.android.ugc.aweme.feed.c.d();
                } else {
                    str5 = com.ss.android.ugc.aweme.feed.c.a();
                }
                String str15 = str5;
                com.ss.android.ugc.aweme.app.d.c a2 = com.ss.android.ugc.aweme.app.d.c.a();
                a2.a("poi_class_code", Integer.valueOf(i4));
                a2.a("city_code", str15);
                o.a(a2.b());
                feedItemList = (FeedItemList) f45054c.fetchPoiTypeFeeds(i2, num, TimeLockRuler.getContentFilterFlag(), str15, str13, str14, i4, j3).get();
            } catch (ExecutionException e4) {
                throw m.a(e4);
            }
        } else {
            feedItemList = a(i, j, j2, i2, num, str, i3, str3, str4);
        }
        if (feedItemList != null) {
            ai.a().a(feedItemList.getRequestId(), feedItemList.logPb);
        }
        LinkDataApi.a("feed", feedItemList.items);
        com.ss.android.ugc.aweme.commercialize.feed.b.a.f38813e.a(feedItemList.items);
        return feedItemList;
    }
}
