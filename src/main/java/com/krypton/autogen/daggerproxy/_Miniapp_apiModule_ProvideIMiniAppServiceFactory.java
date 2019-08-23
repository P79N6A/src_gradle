package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import dagger.internal.c;
import dagger.internal.e;

public final class _Miniapp_apiModule_ProvideIMiniAppServiceFactory implements c<IMiniAppService> {

    /* renamed from: a  reason: collision with root package name */
    private final _Miniapp_apiModule f25388a;

    public final IMiniAppService get() {
        return provideInstance(this.f25388a);
    }

    public _Miniapp_apiModule_ProvideIMiniAppServiceFactory(_Miniapp_apiModule _miniapp_apimodule) {
        this.f25388a = _miniapp_apimodule;
    }

    public static _Miniapp_apiModule_ProvideIMiniAppServiceFactory create(_Miniapp_apiModule _miniapp_apimodule) {
        return new _Miniapp_apiModule_ProvideIMiniAppServiceFactory(_miniapp_apimodule);
    }

    public static IMiniAppService provideInstance(_Miniapp_apiModule _miniapp_apimodule) {
        return proxyProvideIMiniAppService(_miniapp_apimodule);
    }

    public static IMiniAppService proxyProvideIMiniAppService(_Miniapp_apiModule _miniapp_apimodule) {
        return (IMiniAppService) e.a(_miniapp_apimodule.provideIMiniAppService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
