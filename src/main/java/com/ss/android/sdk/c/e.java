package com.ss.android.sdk.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.f.a.c;
import com.ss.android.newmedia.BaseAppData;

public class e extends c {

    /* renamed from: a  reason: collision with root package name */
    private WebViewClient f30736a = null;

    public e() {
        BaseAppData.a();
    }

    public void onPageFinished(WebView webView, String str) {
        if (this.f30736a != null) {
            this.f30736a.onPageFinished(webView, str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (this.f30736a != null) {
            this.f30736a.onPageStarted(webView, str, bitmap);
        }
    }

    @TargetApi(23)
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        if (this.f30736a != null) {
            this.f30736a.onReceivedError(webView, webResourceRequest, webResourceError);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        if (this.f30736a != null) {
            this.f30736a.onReceivedError(webView, i, str, str2);
        }
    }
}
