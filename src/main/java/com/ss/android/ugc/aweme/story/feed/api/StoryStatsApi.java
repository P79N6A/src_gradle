package com.ss.android.ugc.aweme.story.feed.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public final class StoryStatsApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72462a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f72463b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @FormUrlEncoded
        @POST(a = "https://aweme.snssdk.com/aweme/v1/story/stats/")
        Observable<BaseResponse> awemeStatsReport(@Field(a = "item_id") String str, @Field(a = "share_delta") int i, @Field(a = "play_delta") int i2, @Field(a = "source") int i3, @Field(a = "r_type") int i4);
    }

    public static Observable<BaseResponse> a(String str, int i, int i2, int i3) {
        if (!PatchProxy.isSupport(new Object[]{str, 0, 1, Integer.valueOf(i3)}, null, f72462a, true, 83218, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Observable.class)) {
            return ((RealApi) f72463b.create(RealApi.class)).awemeStatsReport(str, 0, 1, 0, i3);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str, 0, 1, Integer.valueOf(i3)}, null, f72462a, true, 83218, new Class[]{String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Observable.class);
    }
}
