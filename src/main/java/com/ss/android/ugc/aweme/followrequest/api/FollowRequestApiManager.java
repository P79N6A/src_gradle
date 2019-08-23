package com.ss.android.ugc.aweme.followrequest.api;

import com.bytedance.retrofit2.http.Field;
import com.bytedance.retrofit2.http.FormUrlEncoded;
import com.bytedance.retrofit2.http.GET;
import com.bytedance.retrofit2.http.POST;
import com.bytedance.retrofit2.http.Query;
import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.followrequest.model.ApproveResponse;
import com.ss.android.ugc.aweme.followrequest.model.FollowRequestResponse;
import com.ss.android.ugc.aweme.followrequest.model.RejectResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.ExecutionException;

public final class FollowRequestApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f48252a;

    /* renamed from: b  reason: collision with root package name */
    static FollowRequestApi f48253b = ((FollowRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(FollowRequestApi.class));

    interface FollowRequestApi {
        @FormUrlEncoded
        @POST("/aweme/v1/commit/follow/request/approve/")
        q<ApproveResponse> approveRequest(@Field(a = "from_user_id") String str);

        @GET("/aweme/v1/user/following/request/list/")
        q<FollowRequestResponse> fetchFollowRequestList(@Query(a = "max_time") long j, @Query(a = "min_time") long j2, @Query(a = "count") int i);

        @FormUrlEncoded
        @POST("/aweme/v1/commit/follow/request/reject/")
        q<RejectResponse> rejectRequest(@Field(a = "from_user_id") String str);
    }

    public static FollowRequestResponse a(long j, long j2, int i) throws Exception {
        long j3 = j;
        long j4 = j2;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), Integer.valueOf(i)}, null, f48252a, true, 45314, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, FollowRequestResponse.class)) {
            Object[] objArr = {new Long(j3), new Long(j4), Integer.valueOf(i)};
            return (FollowRequestResponse) PatchProxy.accessDispatch(objArr, null, f48252a, true, 45314, new Class[]{Long.TYPE, Long.TYPE, Integer.TYPE}, FollowRequestResponse.class);
        }
        try {
            return (FollowRequestResponse) f48253b.fetchFollowRequestList(j, j2, i).get();
        } catch (ExecutionException e2) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
        }
    }
}
