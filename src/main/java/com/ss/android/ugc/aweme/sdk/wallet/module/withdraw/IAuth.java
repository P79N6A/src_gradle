package com.ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import org.json.JSONObject;

public interface IAuth {

    public static class Params {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String mCallbackId;
        private JSONObject out;
        private JSONObject res;

        public String getCallbackId() {
            return this.mCallbackId;
        }

        public JSONObject getOut() {
            return this.out;
        }

        public JSONObject getRes() {
            return this.res;
        }

        public Params(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.out = jSONObject2;
            this.res = jSONObject;
            this.mCallbackId = str;
        }
    }

    void auth(Context context, String str, IWalletService.a aVar);
}
