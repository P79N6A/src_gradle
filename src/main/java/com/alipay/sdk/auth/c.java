package com.alipay.sdk.auth;

import com.alipay.sdk.a.a;
import com.alipay.sdk.a.b;
import org.json.JSONException;
import org.json.JSONObject;

public final class c implements b {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ AuthActivity f5460a;

    c(AuthActivity authActivity) {
        this.f5460a = authActivity;
    }

    public final void a(a aVar) {
        AuthActivity authActivity = this.f5460a;
        if (authActivity.f5451a != null && aVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("clientId", aVar.f5394a);
                jSONObject.put("func", aVar.f5396c);
                jSONObject.put("param", aVar.f5398e);
                jSONObject.put("msgType", aVar.f5397d);
                authActivity.runOnUiThread(new d(authActivity, String.format("AlipayJSBridge._invokeJS(%s)", new Object[]{jSONObject.toString()})));
            } catch (JSONException unused) {
            }
        }
    }
}
