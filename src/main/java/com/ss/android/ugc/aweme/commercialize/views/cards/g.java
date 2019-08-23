package com.ss.android.ugc.aweme.commercialize.views.cards;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40061a;

    @TargetClass
    @Proxy
    static void a(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, null, f40061a, true, 33070, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, null, f40061a, true, 33070, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        c.a(str);
        webView.loadUrl(str);
    }
}
