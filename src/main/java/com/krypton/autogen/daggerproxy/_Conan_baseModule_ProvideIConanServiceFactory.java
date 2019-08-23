package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.conan.IConanService;
import dagger.internal.c;
import dagger.internal.e;

public final class _Conan_baseModule_ProvideIConanServiceFactory implements c<IConanService> {

    /* renamed from: a  reason: collision with root package name */
    private final _Conan_baseModule f25385a;

    public final IConanService get() {
        return provideInstance(this.f25385a);
    }

    public _Conan_baseModule_ProvideIConanServiceFactory(_Conan_baseModule _conan_basemodule) {
        this.f25385a = _conan_basemodule;
    }

    public static _Conan_baseModule_ProvideIConanServiceFactory create(_Conan_baseModule _conan_basemodule) {
        return new _Conan_baseModule_ProvideIConanServiceFactory(_conan_basemodule);
    }

    public static IConanService provideInstance(_Conan_baseModule _conan_basemodule) {
        return proxyProvideIConanService(_conan_basemodule);
    }

    public static IConanService proxyProvideIConanService(_Conan_baseModule _conan_basemodule) {
        return (IConanService) e.a(_conan_basemodule.provideIConanService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
