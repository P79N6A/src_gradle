package com.bytedance.android.livesdk.browser.e;

import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public abstract class a implements c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9343a;

    public final String a() {
        return "json";
    }

    public abstract String a(Uri uri);

    public abstract String b();

    public final WebResourceResponse a(Uri uri, WebView webView) {
        Uri uri2 = uri;
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{uri2, webView2}, this, f9343a, false, 3781, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{uri2, webView2}, this, f9343a, false, 3781, new Class[]{Uri.class, WebView.class}, WebResourceResponse.class);
        }
        String queryParameter = uri2.getQueryParameter("type");
        String queryParameter2 = uri2.getQueryParameter("cb");
        if (!TextUtils.equals(queryParameter, b()) || TextUtils.isEmpty(queryParameter2)) {
            return null;
        }
        String a2 = a(uri);
        if (Build.VERSION.SDK_INT >= 19) {
            webView2.evaluateJavascript(queryParameter2 + "('" + a2 + "')", null);
        }
        return null;
    }
}
