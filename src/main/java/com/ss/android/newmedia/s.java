package com.ss.android.newmedia;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.c;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class s {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30359a;

    @TargetClass
    @Proxy
    static void a(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, null, f30359a, true, 18480, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, null, f30359a, true, 18480, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        c.a(str);
        webView.loadUrl(str);
    }
}
