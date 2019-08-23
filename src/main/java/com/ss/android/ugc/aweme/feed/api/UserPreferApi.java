package com.ss.android.ugc.aweme.feed.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.m;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.feed.model.UserPreferVideoModel;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class UserPreferApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f45057a;

    /* renamed from: b  reason: collision with root package name */
    static final RetrofitApi f45058b = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    interface RetrofitApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v1/ug/user/prefer/feed/")
        i<FeedItemList> fetchUserPreferFeed(@Query(a = "aweme_id") String str, @Query(a = "page_id") int i);

        @GET(a = "https://aweme.snssdk.com/aweme/v1/ug/user/prefer/category/")
        i<UserPreferVideoModel> fetchUserPreferVideo(@Query(a = "page_id") int i);
    }

    public static i<UserPreferVideoModel> a(int i) {
        if (!PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, null, f45057a, true, 40889, new Class[]{Integer.TYPE}, i.class)) {
            return f45058b.fetchUserPreferVideo(i);
        }
        return (i) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i)}, null, f45057a, true, 40889, new Class[]{Integer.TYPE}, i.class);
    }

    public static FeedItemList a(String str, int i) throws Exception {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i)}, null, f45057a, true, 40887, new Class[]{String.class, Integer.TYPE}, FeedItemList.class)) {
            return (FeedItemList) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i)}, null, f45057a, true, 40887, new Class[]{String.class, Integer.TYPE}, FeedItemList.class);
        }
        i<FeedItemList> fetchUserPreferFeed = f45058b.fetchUserPreferFeed(str2, i);
        fetchUserPreferFeed.g();
        if ((!fetchUserPreferFeed.c() && !fetchUserPreferFeed.d()) || !(fetchUserPreferFeed.f() instanceof ExecutionException)) {
            return (FeedItemList) fetchUserPreferFeed.e();
        }
        throw m.a((ExecutionException) fetchUserPreferFeed.f());
    }
}
