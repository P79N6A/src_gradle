package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.sdk.IIapWalletProxy;
import dagger.internal.c;
import dagger.internal.e;

public final class _Wallet_serviceModule_ProvideIIapWalletProxyFactory implements c<IIapWalletProxy> {

    /* renamed from: a  reason: collision with root package name */
    private final _Wallet_serviceModule f25389a;

    public final IIapWalletProxy get() {
        return provideInstance(this.f25389a);
    }

    public _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_Wallet_serviceModule _wallet_servicemodule) {
        this.f25389a = _wallet_servicemodule;
    }

    public static _Wallet_serviceModule_ProvideIIapWalletProxyFactory create(_Wallet_serviceModule _wallet_servicemodule) {
        return new _Wallet_serviceModule_ProvideIIapWalletProxyFactory(_wallet_servicemodule);
    }

    public static IIapWalletProxy provideInstance(_Wallet_serviceModule _wallet_servicemodule) {
        return proxyProvideIIapWalletProxy(_wallet_servicemodule);
    }

    public static IIapWalletProxy proxyProvideIIapWalletProxy(_Wallet_serviceModule _wallet_servicemodule) {
        return (IIapWalletProxy) e.a(_wallet_servicemodule.provideIIapWalletProxy(), "Cannot return null from a non-@Nullable @Provides method");
    }
}
