package com.ss.android.ugc.aweme.video.api;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.services.IRetrofit;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.video.bitrate.bean.RateSettingsResponse;
import java.util.concurrent.ExecutionException;
import retrofit2.http.GET;

public final class BitRateSettingsApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76008a;

    /* renamed from: b  reason: collision with root package name */
    private static final IRetrofit f76009b = ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com");

    interface RealApi {
        @GET(a = "/aweme/v1/rate/settings/")
        q<RateSettingsResponse> fetchRateSettings();
    }

    public static RateSettingsResponse a() throws Exception {
        if (PatchProxy.isSupport(new Object[0], null, f76008a, true, 89070, new Class[0], RateSettingsResponse.class)) {
            return (RateSettingsResponse) PatchProxy.accessDispatch(new Object[0], null, f76008a, true, 89070, new Class[0], RateSettingsResponse.class);
        }
        try {
            return (RateSettingsResponse) ((RealApi) f76009b.create(RealApi.class)).fetchRateSettings().get();
        } catch (ExecutionException e2) {
            throw ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).propagateCompatibleException(e2);
        } catch (IncompatibleClassChangeError unused) {
            return null;
        }
    }
}
