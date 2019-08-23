package com.feiliao.oauth.sdk.flipchat.open.impl;

import android.webkit.WebView;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class b {
    @TargetClass
    @Proxy
    static void a(WebView webView, String str) {
        c.a(str);
        webView.loadUrl(str);
    }
}
