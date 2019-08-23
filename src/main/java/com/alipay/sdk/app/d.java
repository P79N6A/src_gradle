package com.alipay.sdk.app;

import android.app.Activity;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.j.i;
import com.alipay.sdk.k.a;

public final class d extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    public boolean f5432a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Activity f5433b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public boolean f5434c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f5435d;

    /* renamed from: e  reason: collision with root package name */
    private a f5436e;

    /* renamed from: f  reason: collision with root package name */
    private Runnable f5437f = new h(this);

    /* access modifiers changed from: package-private */
    public void a() {
        if (this.f5436e != null) {
            this.f5436e.b();
        }
        this.f5436e = null;
    }

    public d(Activity activity) {
        this.f5433b = activity;
        this.f5435d = new Handler(this.f5433b.getMainLooper());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return i.a(webView, str, this.f5433b);
    }

    public final void onPageFinished(WebView webView, String str) {
        a();
        this.f5435d.removeCallbacks(this.f5437f);
    }

    public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        com.alipay.sdk.app.a.a.a("net", "SSLError", "证书错误");
        if (this.f5434c) {
            sslErrorHandler.proceed();
            this.f5434c = false;
            return;
        }
        this.f5433b.runOnUiThread(new e(this, sslErrorHandler));
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f5436e == null) {
            this.f5436e = new a(this.f5433b, "正在加载");
        }
        this.f5436e.a();
        this.f5435d.postDelayed(this.f5437f, 30000);
        super.onPageStarted(webView, str, bitmap);
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f5432a = true;
        super.onReceivedError(webView, i, str, str2);
    }
}
