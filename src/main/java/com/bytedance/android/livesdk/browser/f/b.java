package com.bytedance.android.livesdk.browser.f;

import android.text.TextUtils;
import android.webkit.WebView;
import com.bytedance.android.livesdk.a;
import com.bytedance.android.livesdk.commerce.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9349a;

    public final boolean a(WebView webView, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{webView, str2}, this, f9349a, false, 3788, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str2}, this, f9349a, false, 3788, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
        } else if (!TextUtils.isEmpty(str) && a.f8887a.booleanValue() && (str2.startsWith("market://details?id=") || str2.startsWith("https://play.google.com"))) {
            return g.a(str);
        } else {
            return false;
        }
    }
}
