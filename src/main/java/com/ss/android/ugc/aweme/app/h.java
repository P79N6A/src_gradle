package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.api.a;
import com.ss.android.ugc.aweme.base.m;
import com.ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.net.CommonApi;
import java.util.concurrent.Callable;

public final class h {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34186a;

    /* renamed from: b  reason: collision with root package name */
    public static final CommonApi f34187b = ((CommonApi) ((IRetrofitService) ServiceManager.get().getService(IRetrofitService.class)).createNewRetrofit("https://aweme.snssdk.com").create(CommonApi.class));

    public static void a() {
        if (PatchProxy.isSupport(new Object[0], null, f34186a, true, 22249, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], null, f34186a, true, 22249, new Class[0], Void.TYPE);
        } else {
            m.a().a(null, new Callable() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f34188a;

                public final Object call() throws Exception {
                    if (PatchProxy.isSupport(new Object[0], this, f34188a, false, 22251, new Class[0], Object.class)) {
                        return PatchProxy.accessDispatch(new Object[0], this, f34188a, false, 22251, new Class[0], Object.class);
                    }
                    a.b((String) h.f34187b.doGet("https://aweme.snssdk.com/aweme/v1/check/in/").execute().body(), "https://aweme.snssdk.com/aweme/v1/check/in/");
                    return null;
                }
            }, 0);
        }
    }
}
