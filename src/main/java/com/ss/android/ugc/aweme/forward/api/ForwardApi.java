package com.ss.android.ugc.aweme.forward.api;

import a.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.forward.model.ForwardDetail;
import com.ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public final class ForwardApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48265a;

    /* renamed from: b  reason: collision with root package name */
    public static final RetrofitApi f48266b = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    public interface RetrofitApi {
        @FormUrlEncoded
        @POST(a = "/aweme/v1/create/forward/")
        i<ForwardDetail> createForward(@Field(a = "forward_content") String str, @Field(a = "item_id") String str2, @Field(a = "forward_type") int i, @Field(a = "forward_id") String str3, @Field(a = "reply_id") String str4, @Field(a = "text_extra") String str5, @Field(a = "is_self_see") int i2, @Field(a = "reply_to_reply_id") String str6);

        @FormUrlEncoded
        @POST(a = "/aweme/v1/forward/delete/")
        i<BaseResponse> deleteForward(@Field(a = "forward_id") String str);

        @GET(a = "/aweme/v1/forward/detail/")
        i<ForwardDetail> getForwardDetail(@Query(a = "forward_id") String str);

        @GET(a = "/aweme/v1/forward/list/")
        i<UserDynamicList> getUserForwardList(@Query(a = "user_id") String str, @Query(a = "sec_user_id") String str2, @Query(a = "max_cursor") long j, @Query(a = "min_cursor") long j2, @Query(a = "count") int i);
    }
}
