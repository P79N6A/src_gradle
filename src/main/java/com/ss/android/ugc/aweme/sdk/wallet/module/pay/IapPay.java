package com.ss.android.ugc.aweme.sdk.wallet.module.pay;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONObject;

public class IapPay implements IPay {
    public static ChangeQuickRedirect changeQuickRedirect;

    public void checkOrderStatus() {
    }

    public void createOrder() {
    }

    public boolean pay(@NonNull JSONObject jSONObject, IWalletService.a aVar) throws Exception {
        return false;
    }
}
