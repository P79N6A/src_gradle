package com.ali.auth.third.ui;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.webkit.WebView;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ali.auth.third.login.task.RefreshSidTask;
import com.ali.auth.third.ui.webview.AuthWebView;
import com.ali.auth.third.ui.webview.BaseWebViewClient;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class b extends BaseWebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoginWebViewActivity f5050a;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            c.a(str);
            webView.loadUrl(str);
        }
    }

    b(LoginWebViewActivity loginWebViewActivity) {
        this.f5050a = loginWebViewActivity;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        String str2 = LoginWebViewActivity.TAG;
        SDKLogger.d(str2, "onLoadResource url=" + str);
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        String str2 = LoginWebViewActivity.TAG;
        SDKLogger.d(str2, "onPageFinished url=" + str);
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        String str2 = LoginWebViewActivity.TAG;
        SDKLogger.d(str2, "onPageStarted url=" + str);
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        String str2 = LoginWebViewActivity.TAG;
        SDKLogger.d(str2, "shouldOverrideUrlLoading url=" + str);
        Uri parse = Uri.parse(str);
        if (this.f5050a.f5048a.isLoginUrl(str)) {
            new RefreshSidTask(this.f5050a.authWebView).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new String[0]);
            return true;
        } else if (this.f5050a.checkWebviewBridge(str)) {
            return this.f5050a.a(parse);
        } else {
            if (webView instanceof AuthWebView) {
                ((AuthWebView) webView).loadUrl(str);
            } else {
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, str);
            }
            return true;
        }
    }
}
