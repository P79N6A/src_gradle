package com.alipay.sdk.auth;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class e {
    @TargetClass
    @Proxy
    static void a(WebView webView, String str) {
        c.a(str);
        webView.loadUrl(str);
    }
}
