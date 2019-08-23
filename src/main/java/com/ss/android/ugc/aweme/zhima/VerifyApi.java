package com.ss.android.ugc.aweme.zhima;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.setting.model.CommonResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.http.POST;

public final class VerifyApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76946a;

    /* renamed from: b  reason: collision with root package name */
    static final IRetrofit f76947b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    /* renamed from: c  reason: collision with root package name */
    private static IRetrofitService f76948c = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class));

    interface RealApi {
        @POST(a = "/aweme/v1/user/verify/manual/?reset=1")
        q<CommonResponse> clearVerifyUser();
    }

    public static CommonResponse a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f76946a, true, 90160, new Class[0], CommonResponse.class)) {
            return (CommonResponse) PatchProxy.accessDispatch(new Object[0], null, f76946a, true, 90160, new Class[0], CommonResponse.class);
        }
        try {
            return (CommonResponse) ((RealApi) f76947b.create(RealApi.class)).clearVerifyUser().get();
        } catch (ExecutionException e2) {
            throw f76948c.propagateCompatibleException(e2);
        }
    }
}
