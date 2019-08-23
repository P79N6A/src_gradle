package com.ss.android.ugc.aweme.face2face.net;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.FollowStatus;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class Face2FaceApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43950a;

    /* renamed from: b  reason: collision with root package name */
    public static final IRetrofit f43951b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    public interface RealApi {
        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/invite/accept/")
        q<Object> acceptFollowUser(@Query(a = "inviter_user_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/exit/")
        q<BaseResponse> exitLocation(@Query(a = "longitude") double d2, @Query(a = "latitude") double d3);

        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/follow/")
        q<FollowStatus> followUser(@Query(a = "user_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/invite/start/")
        q<Object> inviteAndFollow(@Query(a = "invitee_user_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/invite/close/")
        q<BaseResponse> unAcceptFollowUser(@Query(a = "inviter_user_id") String str);

        @GET(a = "https://aweme.snssdk.com/aweme/v3/f2f/hbget/")
        q<d> uploadLocation(@Query(a = "longitude") double d2, @Query(a = "latitude") double d3);
    }
}
