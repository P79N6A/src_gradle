package com.ali.auth.third.ui.support;

import android.webkit.WebView;
import com.ali.auth.third.core.trace.SDKLogger;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class WebViewActivitySupport {

    /* renamed from: a  reason: collision with root package name */
    private static final String f5059a = "WebViewActivitySupport";
    public String lastReloadUrl;

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

    static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final WebViewActivitySupport f5060a = new WebViewActivitySupport();
    }

    private WebViewActivitySupport() {
        this.lastReloadUrl = "";
    }

    public static WebViewActivitySupport getInstance() {
        return a.f5060a;
    }

    public void safeReload(WebView webView) {
        String url = webView.getUrl();
        String str = f5059a;
        SDKLogger.d(str, "reload url: " + url);
        if (url == null) {
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, this.lastReloadUrl);
        } else {
            webView.reload();
        }
    }
}
