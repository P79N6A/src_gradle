package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;
import dagger.internal.c;
import dagger.internal.e;

public final class _Wallet_serviceModule_ProvideIWalletMainProxyFactory implements c<IWalletMainProxy> {

    /* renamed from: a  reason: collision with root package name */
    private final _Wallet_serviceModule f25390a;

    public final IWalletMainProxy get() {
        return provideInstance(this.f25390a);
    }

    public _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f25390a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIWalletMainProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIWalletMainProxyFactory(_wallet_servicemodule);
    }

    public static IWalletMainProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIWalletMainProxy(_wallet_servicemodule);
    }

    public static IWalletMainProxy proxyProvideIWalletMainProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IWalletMainProxy) e.a(_wallet_servicemodule.provideIWalletMainProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
