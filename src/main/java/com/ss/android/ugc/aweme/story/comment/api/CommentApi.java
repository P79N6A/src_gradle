package com.ss.android.ugc.aweme.story.comment.api;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class CommentApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72145a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f72146b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @GET(a = "/aweme/v1/comment/delete/")
        Observable<BaseResponse> deleteComment(@Query(a = "cid") String str, @Query(a = "type") int i);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/comment/publish/")
        Observable<Object> publishComment(@Field(a = "aweme_id") String str, @Field(a = "text") String str2, @Field(a = "reply_id") String str3, @Field(a = "type") int i);
    }

    public static Observable<BaseResponse> a(String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, null, f72145a, true, 82703, new Class[]{String.class}, Observable.class)) {
            return ((RealApi) f72146b.create(RealApi.class)).deleteComment(str2, 1);
        }
        return (Observable) PatchProxy.accessDispatch(new Object[]{str2}, null, f72145a, true, 82703, new Class[]{String.class}, Observable.class);
    }
}
