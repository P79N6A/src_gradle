package com.ss.android.ugc.aweme.promote;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public final class PromoteProgramRequestApiManager {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63232a;

    /* renamed from: b  reason: collision with root package name */
    static PromoteProgramRequestApi f63233b = ((PromoteProgramRequestApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(PromoteProgramRequestApi.class));

    interface PromoteProgramRequestApi {
        @GET(a = "/aweme/v1/creatorlicense/cancel/")
        q<BaseResponse> cancelPromoteProgram();

        @GET(a = "/aweme/v1/creatorlicense/confirm/")
        q<PromoteProgramResponse> confirmPromoteProgram(@Query(a = "license_version") String str);
    }
}
