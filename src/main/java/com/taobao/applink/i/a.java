package com.taobao.applink.i;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Message;
import android.view.KeyEvent;
import android.webkit.HttpAuthHandler;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.net.URLDecoder;

public class a extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private WebViewClient f79207a;

    /* renamed from: b  reason: collision with root package name */
    private com.taobao.applink.f.a.a f79208b;

    public a(WebViewClient webViewClient) {
        this.f79207a = webViewClient;
    }

    public com.taobao.applink.f.a.a a() {
        return this.f79208b;
    }

    public void a(com.taobao.applink.f.a.a aVar) {
        if (aVar != null) {
            this.f79208b = aVar;
        }
    }

    public void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
        this.f79207a.doUpdateVisitedHistory(webView, str, z);
    }

    public void onFormResubmission(WebView webView, Message message, Message message2) {
        this.f79207a.onFormResubmission(webView, message, message2);
    }

    public void onLoadResource(WebView webView, String str) {
        this.f79207a.onLoadResource(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        this.f79207a.onPageFinished(webView, str);
        com.taobao.applink.util.a.b(webView);
        com.taobao.applink.util.a.a(webView);
        if (this.f79208b != null) {
            this.f79208b.a(webView);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.f79207a.onPageStarted(webView, str, bitmap);
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        this.f79207a.onReceivedError(webView, i, str, str2);
    }

    public void onReceivedHttpAuthRequest(WebView webView, HttpAuthHandler httpAuthHandler, String str, String str2) {
        this.f79207a.onReceivedHttpAuthRequest(webView, httpAuthHandler, str, str2);
    }

    @TargetApi(12)
    public void onReceivedLoginRequest(WebView webView, String str, String str2, String str3) {
        this.f79207a.onReceivedLoginRequest(webView, str, str2, str3);
    }

    @TargetApi(8)
    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        this.f79207a.onReceivedSslError(webView, sslErrorHandler, sslError);
    }

    public void onScaleChanged(WebView webView, float f2, float f3) {
        this.f79207a.onScaleChanged(webView, f2, f3);
    }

    public void onTooManyRedirects(WebView webView, Message message, Message message2) {
        this.f79207a.onTooManyRedirects(webView, message, message2);
    }

    public void onUnhandledKeyEvent(WebView webView, KeyEvent keyEvent) {
        this.f79207a.onUnhandledKeyEvent(webView, keyEvent);
    }

    @TargetApi(11)
    public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        return this.f79207a.shouldInterceptRequest(webView, str);
    }

    public boolean shouldOverrideKeyEvent(WebView webView, KeyEvent keyEvent) {
        return this.f79207a.shouldOverrideKeyEvent(webView, keyEvent);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.f79208b != null) {
            try {
                String decode = URLDecoder.decode(str, "UTF-8");
                if (decode.startsWith("tblink://return/")) {
                    this.f79208b.a(webView, decode);
                    return true;
                } else if (decode.startsWith("tblink://")) {
                    this.f79208b.b(webView);
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return this.f79207a.shouldOverrideUrlLoading(webView, str);
    }
}
