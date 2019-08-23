package com.ss.android.ugc.aweme.flow.manager.impl;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class UpdateMobilePassCodeApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f47675a;

    /* renamed from: b  reason: collision with root package name */
    public static UpdateMobilePassCodeApi f47676b = ((UpdateMobilePassCodeApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(UpdateMobilePassCodeApi.class));

    interface UpdateMobilePassCodeApi {
        @GET(a = "aweme/v1/carrier_flow/mobile/pcid/upload/")
        q<BaseResponse> upload(@Query(a = "mobile_pcid") String str);
    }
}
