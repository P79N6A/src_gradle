package com.bytedance.android.livesdk.browser.view;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9652a;

    @TargetClass
    @Proxy
    static void a(WebView webView, String str, Map map) {
        if (PatchProxy.isSupport(new Object[]{webView, str, map}, null, f9652a, true, 3874, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str, map}, null, f9652a, true, 3874, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.lancet.c.a(str);
        c.super.loadUrl(str, map);
    }
}
