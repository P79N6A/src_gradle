package com.ss.android.ugc.aweme.message.api;

import a.i;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.message.model.MultiUserNoticeCountResponse;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class MultiUserNoticeApi {

    /* renamed from: a  reason: collision with root package name */
    private static final MultiUserNoticeRetrofitApi f55353a = ((MultiUserNoticeRetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(MultiUserNoticeRetrofitApi.class));

    public interface MultiUserNoticeRetrofitApi {
        @GET(a = "/aweme/v1/notice/multi_user/count/")
        i<MultiUserNoticeCountResponse> getMultiUserNoticeCount(@Query(a = "user_ids") String str);
    }
}
