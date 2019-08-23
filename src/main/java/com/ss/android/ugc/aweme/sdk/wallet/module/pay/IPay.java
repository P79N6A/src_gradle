package com.ss.android.ugc.aweme.sdk.wallet.module.pay;

import android.support.annotation.NonNull;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONObject;

public interface IPay {
    void checkOrderStatus();

    void createOrder();

    boolean pay(@NonNull JSONObject jSONObject, IWalletService.a aVar) throws Exception;
}
