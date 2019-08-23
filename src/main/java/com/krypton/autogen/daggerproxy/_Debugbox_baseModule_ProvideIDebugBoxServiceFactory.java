package com.krypton.autogen.daggerproxy;

import com.bytedance.debugbox.base.IDebugBoxService;
import dagger.internal.c;
import dagger.internal.e;

public final class _Debugbox_baseModule_ProvideIDebugBoxServiceFactory implements c<IDebugBoxService> {

    /* renamed from: a  reason: collision with root package name */
    private final _Debugbox_baseModule f25386a;

    public final IDebugBoxService get() {
        return provideInstance(this.f25386a);
    }

    public _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_Debugbox_baseModule _debugbox_basemodule) {
        this.f25386a = _debugbox_basemodule;
    }

    public static _Debugbox_baseModule_ProvideIDebugBoxServiceFactory create(_Debugbox_baseModule _debugbox_basemodule) {
        return new _Debugbox_baseModule_ProvideIDebugBoxServiceFactory(_debugbox_basemodule);
    }

    public static IDebugBoxService provideInstance(_Debugbox_baseModule _debugbox_basemodule) {
        return proxyProvideIDebugBoxService(_debugbox_basemodule);
    }

    public static IDebugBoxService proxyProvideIDebugBoxService(_Debugbox_baseModule _debugbox_basemodule) {
        return (IDebugBoxService) e.a(_debugbox_basemodule.provideIDebugBoxService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
