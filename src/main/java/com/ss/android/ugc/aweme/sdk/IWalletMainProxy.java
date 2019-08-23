package com.ss.android.ugc.aweme.sdk;

import android.content.Context;
import android.support.annotation.Keep;
import com.krypton.annotation.OutService;

@Keep
@OutService
public interface IWalletMainProxy {
    boolean enableShoppingTotal();

    int getDiamondType();

    String getHost();

    String getIapKey();

    String getSchema(String str);

    void openSchema(Context context, String str);
}
