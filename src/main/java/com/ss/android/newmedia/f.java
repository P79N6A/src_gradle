package com.ss.android.newmedia;

import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.lancet.c;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f30205a;

    @TargetClass
    @Proxy
    static void a(WebView webView, String str, Map map) {
        if (PatchProxy.isSupport(new Object[]{webView, str, map}, null, f30205a, true, 18300, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str, map}, null, f30205a, true, 18300, new Class[]{WebView.class, String.class, Map.class}, Void.TYPE);
            return;
        }
        c.a(str);
        webView.loadUrl(str, map);
    }
}