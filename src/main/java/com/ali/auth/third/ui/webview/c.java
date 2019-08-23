package com.ali.auth.third.ui.webview;

import android.webkit.WebView;

public class c extends BridgeWebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ BaseWebViewActivity f5074a;

    c(BaseWebViewActivity baseWebViewActivity) {
        this.f5074a = baseWebViewActivity;
    }

    public void onReceivedTitle(WebView webView, String str) {
        if (this.f5074a.canReceiveTitle) {
            this.f5074a.titleText.setText(str);
        }
    }
}
