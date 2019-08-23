package com.bytedance.ies.net.cronet.ttregion;

import a.i;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;

public final class TTRegionTestApi {

    /* renamed from: a  reason: collision with root package name */
    private static final RetrofitApi f20869a = ((RetrofitApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetrofitApi.class));

    interface RetrofitApi {
        @GET(a = "/aweme/v1/ttregion/test/")
        i<BaseResponse> ttRegionTest();
    }
}
