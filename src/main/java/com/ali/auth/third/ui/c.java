package com.ali.auth.third.ui;

import android.webkit.WebView;
import com.ali.auth.third.ui.webview.BridgeWebChromeClient;

public class c extends BridgeWebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ LoginWebViewActivity f5051a;

    c(LoginWebViewActivity loginWebViewActivity) {
        this.f5051a = loginWebViewActivity;
    }

    public void onReceivedTitle(WebView webView, String str) {
        if (!this.f5051a.canReceiveTitle) {
            return;
        }
        if ((str == null || !str.contains("我喜欢")) && str != null) {
            this.f5051a.titleText.setText(str);
        }
    }
}
