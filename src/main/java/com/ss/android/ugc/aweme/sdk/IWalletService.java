package com.ss.android.ugc.aweme.sdk;

import a.i;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.Keep;
import com.bytedance.ies.f.a.d;
import com.krypton.annotation.OutService;
import com.ss.android.ugc.aweme.sdk.bean.c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

@Keep
@OutService
public interface IWalletService {

    public interface a {
        void onFail(Exception exc);

        void onSuccess(JSONObject jSONObject);
    }

    void auth(Context context, String str, String str2, a aVar);

    Map<String, d> buildJavaMethods(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar);

    void cashOut(Context context, String str);

    void clearWallet();

    long getAvailableCurrency();

    void init(WeakReference<Context> weakReference, com.bytedance.ies.f.a.a aVar);

    void onWxIntent(Context context, Intent intent);

    void openWallet(Activity activity);

    void openWallet(Activity activity, String str);

    boolean pay(String str, JSONObject jSONObject, a aVar);

    void setSetting(c cVar);

    i<Long> syncWallet();

    void syncWallet(long j);
}
