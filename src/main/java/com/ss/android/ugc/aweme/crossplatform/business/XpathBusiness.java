package com.ss.android.ugc.aweme.crossplatform.business;

import android.support.annotation.Keep;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.crossplatform.business.BusinessService;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.lancet.c;

public class XpathBusiness extends BusinessService.Business {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40756a;

    @Keep
    XpathBusiness(@NonNull d dVar) {
        super(dVar);
    }

    public final void a(a aVar, WebView webView) {
        a aVar2 = aVar;
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{aVar2, webView2}, this, f40756a, false, 34283, new Class[]{a.class, WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2, webView2}, this, f40756a, false, 34283, new Class[]{a.class, WebView.class}, Void.TYPE);
            return;
        }
        if (aVar2 != null && aVar2.f40806b.f40800b > 0 && !TextUtils.isEmpty(aVar2.f40806b.r)) {
            String a2 = com.ss.android.newmedia.ui.webview.a.a(aVar2.f40806b.r, aVar2.f40806b.f40800b);
            if (!TextUtils.isEmpty(a2) && webView2 != null) {
                if (PatchProxy.isSupport(new Object[]{webView2, a2}, null, l.f40792a, true, 34284, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView2, a2}, null, l.f40792a, true, 34284, new Class[]{WebView.class, String.class}, Void.TYPE);
                    return;
                }
                c.a(a2);
                webView2.loadUrl(a2);
            }
        }
    }
}
