package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.sdk.IWalletService;
import dagger.internal.c;
import dagger.internal.e;

public final class _Wallet_serviceModule_ProvideIWalletServiceFactory implements c<IWalletService> {

    /* renamed from: a  reason: collision with root package name */
    private final _Wallet_serviceModule f25391a;

    public final IWalletService get() {
        return provideInstance(this.f25391a);
    }

    public _Wallet_serviceModule_ProvideIWalletServiceFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f25391a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletServiceFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletServiceFactory(_wallet_servicemodule);
    }

    public static IWalletService provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletService(_wallet_servicemodule);
    }

    public static IWalletService proxyProvideIWalletService(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletService) e.a(_wallet_servicemodule.provideIWalletService(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
