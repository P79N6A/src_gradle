package com.ss.android.ugc.aweme.sdk.wallet.module.pay;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONObject;

public class PayFactory {
    public static ChangeQuickRedirect changeQuickRedirect;

    static class DEFAULT implements IPay {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void checkOrderStatus() {
        }

        public void createOrder() {
        }

        public boolean pay(@NonNull JSONObject jSONObject, IWalletService.a aVar) throws Exception {
            return false;
        }

        private DEFAULT() {
        }
    }

    public static IPay createIPay(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, changeQuickRedirect, true, 71066, new Class[]{String.class}, IPay.class)) {
            return (IPay) PatchProxy.accessDispatch(new Object[]{str2}, null, changeQuickRedirect, true, 71066, new Class[]{String.class}, IPay.class);
        }
        WXPay wXPay = null;
        if ("weixin".equals(str2)) {
            wXPay = new WXPay();
        }
        return wXPay;
    }
}
