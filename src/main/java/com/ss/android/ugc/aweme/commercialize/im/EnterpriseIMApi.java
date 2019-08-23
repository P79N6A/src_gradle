package com.ss.android.ugc.aweme.commercialize.im;

import com.google.common.util.concurrent.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.im.model.b;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import retrofit2.http.GET;
import retrofit2.http.Query;

public class EnterpriseIMApi {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38879a;

    /* renamed from: b  reason: collision with root package name */
    private static RetroApi f38880b;

    public interface RetroApi {
        @GET(a = "/aweme/v1/bluev/get/im/msg/settings")
        q<b> getIMSettings(@Query(a = "bluev_uid") String str, @Query(a = "sec_bluev_uid") String str2);
    }

    static RetroApi a() {
        if (PatchProxy.isSupport(new Object[0], null, f38879a, true, 30808, new Class[0], RetroApi.class)) {
            return (RetroApi) PatchProxy.accessDispatch(new Object[0], null, f38879a, true, 30808, new Class[0], RetroApi.class);
        }
        if (f38880b == null) {
            synchronized (EnterpriseIMApi.class) {
                if (f38880b == null) {
                    f38880b = (RetroApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(RetroApi.class);
                }
            }
        }
        return f38880b;
    }
}
