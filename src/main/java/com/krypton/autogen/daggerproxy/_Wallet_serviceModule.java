package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.graph.e;
import dagger.Module;
import dagger.Provides;

@Module
public class _Wallet_serviceModule {
    @Provides
    public IIapWalletProxy provideIIapWalletProxy() {
        return ((Wallet_serviceService) e.a(Wallet_serviceService.class)).provideIIapWalletProxy();
    }

    @Provides
    public IWalletMainProxy provideIWalletMainProxy() {
        return ((Wallet_serviceService) e.a(Wallet_serviceService.class)).provideIWalletMainProxy();
    }

    @Provides
    public IWalletService provideIWalletService() {
        return ((Wallet_serviceService) e.a(Wallet_serviceService.class)).provideIWalletService();
    }
}
