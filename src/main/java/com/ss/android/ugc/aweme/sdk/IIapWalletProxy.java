package com.ss.android.ugc.aweme.sdk;

import android.content.Context;
import android.support.annotation.Keep;
import com.krypton.annotation.OutService;

@Keep
@OutService
public interface IIapWalletProxy {
    void cashOut(Context context, String str);

    void openWallet(Context context);

    void openWallet(Context context, String str);
}
