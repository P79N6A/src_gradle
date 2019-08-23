package com.bytedance.android.monitor.webview;

import android.support.annotation.Keep;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Keep
public class TTLiveWebViewMonitorJsBridge {
    private WeakReference<WebView> mWebViewRef;

    @JavascriptInterface
    public String getConfiguration() {
        JSONObject jSONObject = new JSONObject();
        long j = h.a().f18860b;
        boolean z = h.a().j;
        boolean z2 = h.a().i;
        boolean z3 = h.a().k;
        String[] strArr = h.a().f18861c;
        String[] strArr2 = h.a().f18862d;
        try {
            jSONObject.put("reportResourceThreshold", j);
            jSONObject.put("jsError", z);
            jSONObject.put("resourceError", z2);
            jSONObject.put("httpError", z3);
            JSONArray jSONArray = new JSONArray();
            for (String put : strArr) {
                jSONArray.put(put);
            }
            jSONObject.put("reportResourceWhiteList", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (String put2 : strArr2) {
                jSONArray2.put(put2);
            }
            jSONObject.put("reportBlackList", jSONArray2);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public TTLiveWebViewMonitorJsBridge(WebView webView) {
        this.mWebViewRef = new WeakReference<>(webView);
    }

    @JavascriptInterface
    public void sendErrorInfo(String str, String str2) {
        if (h.a().a((WebView) this.mWebViewRef.get())) {
            h a2 = h.a();
            WebView webView = (WebView) this.mWebViewRef.get();
            if (a2.f18859a != null) {
                a2.f18859a.c(webView, str, str2);
            }
        }
    }

    @JavascriptInterface
    public void sendInitTimeInfo(String str, String str2) {
        if (h.a().a((WebView) this.mWebViewRef.get())) {
            h a2 = h.a();
            WebView webView = (WebView) this.mWebViewRef.get();
            if (a2.f18859a != null) {
                a2.f18859a.d(webView, str, str2);
            }
        }
    }

    @JavascriptInterface
    public void sendNavigationInfo(String str, String str2) {
        if (h.a().a((WebView) this.mWebViewRef.get())) {
            h a2 = h.a();
            WebView webView = (WebView) this.mWebViewRef.get();
            if (a2.f18859a != null) {
                a2.f18859a.a(webView, str, str2);
            }
        }
    }

    @JavascriptInterface
    public void sendResourceInfo(String str, String str2) {
        if (h.a().a((WebView) this.mWebViewRef.get())) {
            h a2 = h.a();
            WebView webView = (WebView) this.mWebViewRef.get();
            if (a2.f18859a != null) {
                a2.f18859a.b(webView, str, str2);
            }
        }
    }
}
