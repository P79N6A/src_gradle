package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.im.service.IIMService;
import dagger.internal.c;
import dagger.internal.e;

public final class _ImserviceModule_ProvideIIMServiceFactory implements c<IIMService> {

    /* renamed from: a  reason: collision with root package name */
    private final _ImserviceModule f25387a;

    public final IIMService get() {
        return provideInstance(this.f25387a);
    }

    public _ImserviceModule_ProvideIIMServiceFactory(_ImserviceModule _imservicemodule) {
        this.f25387a = _imservicemodule;
    }

    public static _ImserviceModule_ProvideIIMServiceFactory create(_ImserviceModule _imservicemodule) {
        return new _ImserviceModule_ProvideIIMServiceFactory(_imservicemodule);
    }

    public static IIMService provideInstance(_ImserviceModule _imservicemodule) {
        return proxyProvideIIMService(_imservicemodule);
    }

    public static IIMService proxyProvideIIMService(_ImserviceModule _imservicemodule) {
        return (IIMService) e.a(_imservicemodule.provideIIMService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
