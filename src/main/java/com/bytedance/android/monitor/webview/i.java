package com.bytedance.android.monitor.webview;

import android.os.Build;
import android.webkit.WebChromeClient;
import android.webkit.WebView;

public class i extends WebChromeClient {
    public void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        if (h.a().a(webView) && i >= 15 && webView != null && Build.VERSION.SDK_INT >= 19) {
            if (!webView.getSettings().getJavaScriptEnabled()) {
                webView.getSettings().setJavaScriptEnabled(true);
            }
            h.c(webView);
        }
    }
}
