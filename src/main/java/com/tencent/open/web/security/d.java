package com.tencent.open.web.security;

import android.webkit.WebView;
import com.tencent.open.a.f;
import com.tencent.open.c.b;
import com.tencent.open.d;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends d.a {

    /* renamed from: d  reason: collision with root package name */
    private String f79772d;

    public final void a() {
        f.b("openSDK_LOG.SecureJsListener", "-->onNoMatchMethod...");
    }

    public final void a(Object obj) {
        f.a("openSDK_LOG.SecureJsListener", "-->onComplete, result: " + null);
    }

    public final void a(String str) {
        int i;
        f.a("openSDK_LOG.SecureJsListener", "-->onCustomCallback, js: " + str);
        JSONObject jSONObject = new JSONObject();
        if (!b.f79713a) {
            i = -4;
        } else {
            i = 0;
        }
        try {
            jSONObject.put("result", i);
            jSONObject.put("sn", this.f79718b);
            jSONObject.put("data", str);
        } catch (JSONException unused) {
        }
        String jSONObject2 = jSONObject.toString();
        WebView webView = (WebView) this.f79717a.get();
        if (webView != null) {
            StringBuffer stringBuffer = new StringBuffer("javascript:");
            stringBuffer.append("if(!!");
            stringBuffer.append(this.f79772d);
            stringBuffer.append("){");
            stringBuffer.append(this.f79772d);
            stringBuffer.append("(");
            stringBuffer.append(jSONObject2);
            stringBuffer.append(")}");
            String stringBuffer2 = stringBuffer.toString();
            f.a("openSDK_LOG.SecureJsListener", "-->callback, callback: " + stringBuffer2);
            e.a(webView, stringBuffer2);
        }
    }

    public d(WebView webView, long j, String str, String str2) {
        super(webView, j, str);
        this.f79772d = str2;
    }
}
