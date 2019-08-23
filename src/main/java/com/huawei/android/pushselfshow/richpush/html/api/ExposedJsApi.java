package com.huawei.android.pushselfshow.richpush.html.api;

import android.app.Activity;
import android.content.Intent;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.huawei.android.pushagent.utils.a.e;

public class ExposedJsApi {
    private NativeToJsMessageQueue jsMessageQueue;
    public c pluginManager;

    public ExposedJsApi(Activity activity, WebView webView, String str, boolean z) {
        e.e("PushSelfShowLog", "init ExposedJsApi");
        this.pluginManager = new c(activity, z);
        this.jsMessageQueue = new NativeToJsMessageQueue(activity, webView, str);
    }

    @JavascriptInterface
    public void exec(String str, String str2) {
        try {
            e.a("PushSelfShowLog", "ExposedJsApi exec and serviceName is " + str + ",jsonMsgObject is " + str2);
            this.pluginManager.a(str, str2, this.jsMessageQueue);
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "ExposedJsApi exec error", (Throwable) e2);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.pluginManager.a(i, i2, intent);
    }

    public void onDestroy() {
        this.pluginManager.a();
        this.jsMessageQueue.b();
    }

    public void onPause() {
        this.pluginManager.c();
    }

    public void onResume() {
        this.pluginManager.b();
    }

    @JavascriptInterface
    public String retrieveJsMessages() {
        try {
            return this.jsMessageQueue.c();
        } catch (Exception unused) {
            e.a("PushSelfShowLog", "retrieveJsMessages error");
            return "";
        }
    }

    @JavascriptInterface
    public String synExec(String str, String str2) {
        try {
            e.a("PushSelfShowLog", "ExposedJsApi exec and serviceName is " + str + ",jsonMsgObject is " + str2);
            return this.pluginManager.a(str, str2);
        } catch (Exception e2) {
            e.a("PushSelfShowLog", "ExposedJsApi exec error", (Throwable) e2);
            return null;
        }
    }
}
