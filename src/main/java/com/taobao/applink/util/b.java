package com.taobao.applink.util;

import android.webkit.WebView;
import com.taobao.applink.d.a;
import com.taobao.applink.exception.TBAppLinkException;
import com.taobao.applink.f.a.c;

public final class b implements c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ WebView f79209a;

    b(WebView webView) {
        this.f79209a = webView;
    }

    public final void a(String str, com.taobao.applink.f.a.b bVar) {
        try {
            a.a(this.f79209a.getContext(), com.taobao.applink.e.a.a(str), bVar);
        } catch (TBAppLinkException unused) {
        }
    }
}
