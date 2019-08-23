package com.krypton.autogen.daggerproxy;

import com.ss.android.ugc.aweme.sdk.IIapWalletProxy;
import com.ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;

public interface Wallet_serviceService {
    IIapWalletProxy provideIIapWalletProxy();

    IWalletMainProxy provideIWalletMainProxy();

    IWalletService provideIWalletService();
}
