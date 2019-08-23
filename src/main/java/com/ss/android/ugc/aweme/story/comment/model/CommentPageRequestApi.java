package com.ss.android.ugc.aweme.story.comment.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.feed.model.b;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class CommentPageRequestApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72189a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f72190b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @GET(a = "/aweme/v1/life/user/")
        Observable<b> fetch72Videos(@Query(a = "user_id") String str, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i, @Query(a = "time_zone") String str2, @Query(a = "is_reverse") int i2);

        @GET(a = "/aweme/v1/life/comments/")
        Observable<b> fetchComments(@Query(a = "story_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "user_id") String str2);

        @GET(a = "/aweme/v1/life/viewers/")
        Observable<d> fetchViewers(@Query(a = "story_id") String str, @Query(a = "cursor") long j, @Query(a = "count") int i);
    }

    public static Observable<d> a(String str, long j, int i) {
        String str2 = str;
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str2, new Long(j2), 20}, null, f72189a, true, 82868, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Observable.class)) {
            return ((RealApi) f72190b.create(RealApi.class)).fetchViewers(str2, j2, 20);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2, new Long(j2), 20}, null, f72189a, true, 82868, new Class[]{String.class, Long.TYPE, Integer.TYPE}, Observable.class);
    }

    public static Observable<b> a(String str, long j, int i, String str2) {
        long j2 = j;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j2), 30, str2}, null, f72189a, true, 82867, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class}, Observable.class)) {
            return ((RealApi) f72190b.create(RealApi.class)).fetchComments(str, j, 30, str2);
        }
        Object[] objArr = {str, new Long(j2), 30, str2};
        return (Observable) PatchProxy.accessDispatch(objArr, null, f72189a, true, 82867, new Class[]{String.class, Long.TYPE, Integer.TYPE, String.class}, Observable.class);
    }
}
