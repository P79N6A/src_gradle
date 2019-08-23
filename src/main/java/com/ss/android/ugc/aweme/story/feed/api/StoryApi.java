package com.ss.android.ugc.aweme.story.feed.api;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.story.feed.model.UserStoryDetail;
import com.ss.android.ugc.aweme.story.feed.model.a;
import com.ss.android.ugc.aweme.story.feed.model.b;
import com.ss.android.ugc.aweme.story.feed.view.profile.ProfileEntityList;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class StoryApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72459a;

    /* renamed from: b  reason: collision with root package name */
    public static final IRetrofit f72460b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f72461c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    public interface RealApi {
        @GET(a = "/aweme/v1/life/delete/")
        Observable<BaseResponse> deleteStory(@Query(a = "story_id") String str);

        @GET(a = "/aweme/v1/life/story/dislike/")
        Observable<BaseResponse> dislikeUserStory(@Query(a = "object_id") String str);

        @GET(a = "/aweme/v1/comment/digg/")
        Observable<ProfileEntityList> fetchCommentList();

        @GET(a = "/aweme/v1/life/feed/")
        Observable<a> fetchLifeFeed(@Query(a = "cursor") long j, @Query(a = "count") int i, @Query(a = "tab_type") int i2, @Query(a = "insert_userid") String str);

        @GET(a = "/aweme/v1/life/oneday/")
        Observable<b> fetchOneDayLife(@Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i, @Query(a = "story_id") String str, @Query(a = "time_zone") String str2);

        @GET(a = "/aweme/v1/life/user/")
        Observable<b> fetchOneUserLife(@Query(a = "user_id") String str, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i, @Query(a = "time_zone") String str2, @Query(a = "is_reverse") int i2);

        @GET(a = "/aweme/v1/life/detail/")
        Observable<b> getStories(@Query(a = "story_ids") String str);

        @GET(a = "/aweme/v1/life/detail/")
        Observable<UserStoryDetail> getStoryDetail(@Query(a = "story_id") String str);
    }

    public static Observable<BaseResponse> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f72459a, true, 83210, new Class[]{String.class}, Observable.class)) {
            return ((RealApi) f72460b.create(RealApi.class)).deleteStory(str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, null, f72459a, true, 83210, new Class[]{String.class}, Observable.class);
    }

    public static Observable<BaseResponse> b(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f72459a, true, 83211, new Class[]{String.class}, Observable.class)) {
            return ((RealApi) f72460b.create(RealApi.class)).dislikeUserStory(str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, null, f72459a, true, 83211, new Class[]{String.class}, Observable.class);
    }

    public static Observable<b> c(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f72459a, true, 83217, new Class[]{String.class}, Observable.class)) {
            return ((RealApi) f72460b.create(RealApi.class)).getStories(str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, null, f72459a, true, 83217, new Class[]{String.class}, Observable.class);
    }

    public static Observable<a> a(long j, int i, int i2, String str) {
        String str2;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, null, f72459a, true, 83213, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Observable.class)) {
            return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j2), Integer.valueOf(i), Integer.valueOf(i2), str}, null, f72459a, true, 83213, new Class[]{Long.TYPE, Integer.TYPE, Integer.TYPE, String.class}, Observable.class);
        }
        RealApi realApi = (RealApi) f72460b.create(RealApi.class);
        if (TextUtils.isEmpty(str)) {
            str2 = null;
        } else {
            str2 = str;
        }
        return realApi.fetchLifeFeed(j, i, i2, str2);
    }

    public static Observable<b> a(long j, long j2, int i, String str, String str2) {
        long j3 = j;
        long j4 = j2;
        if (!PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i), str, str2}, null, f72459a, true, 83215, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class}, Observable.class)) {
            return ((RealApi) f72460b.create(RealApi.class)).fetchOneDayLife(j, j2, i, str, str2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i), str, str2}, null, f72459a, true, 83215, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE, String.class, String.class}, Observable.class);
    }

    public static Observable<b> a(String str, long j, long j2, int i, String str2, int i2) {
        long j3 = j;
        long j4 = j2;
        if (!PatchProxy.isSupport(new Object[]{str, new Long(j3), new Long(j4), Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f72459a, true, 83214, new Class[]{String.class, Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Observable.class)) {
            return ((RealApi) f72460b.create(RealApi.class)).fetchOneUserLife(str, j, j2, i, str2, i2);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str, new Long(j3), new Long(j4), Integer.valueOf(i), str2, Integer.valueOf(i2)}, null, f72459a, true, 83214, new Class[]{String.class, Long.TYPE, Long.TYPE, Integer.TYPE, String.class, Integer.TYPE}, Observable.class);
    }
}
