package com.ss.android.ugc.aweme.sdk;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.ss.android.ugc.aweme.sdk.IWalletService;
import com.ss.android.ugc.aweme.sdk.bean.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

public final class Wallet {

    static final class DEFAULT implements IWalletService {
        public static ChangeQuickRedirect changeQuickRedirect;

        public final void auth(Context context, String str, String str2, IWalletService.a aVar) {
        }

        public final Map<String, d> buildJavaMethods(WeakReference<Context> weakReference, a aVar) {
            return null;
        }

        public final void cashOut(Context context, String str) {
        }

        public final void clearWallet() {
        }

        public final long getAvailableCurrency() {
            return 0;
        }

        public final void init(WeakReference<Context> weakReference, a aVar) {
        }

        public final void onWxIntent(Context context, Intent intent) {
        }

        public final void openWallet(Activity activity) {
        }

        public final void openWallet(Activity activity, String str) {
        }

        public final boolean pay(String str, JSONObject jSONObject, IWalletService.a aVar) {
            return false;
        }

        public final void setSetting(c cVar) {
        }

        public final i<Long> syncWallet() {
            return null;
        }

        public final void syncWallet(long j) {
        }

        private DEFAULT() {
        }
    }
}
