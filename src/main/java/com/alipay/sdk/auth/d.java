package com.alipay.sdk.auth;

import android.webkit.WebView;

public final class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ String f5461a;

    /* renamed from: b  reason: collision with root package name */
    final /* synthetic */ AuthActivity f5462b;

    public final void run() {
        try {
            WebView webView = this.f5462b.f5451a;
            e.a(webView, "javascript:" + this.f5461a);
        } catch (Exception unused) {
        }
    }

    d(AuthActivity authActivity, String str) {
        this.f5462b = authActivity;
        this.f5461a = str;
    }
}
