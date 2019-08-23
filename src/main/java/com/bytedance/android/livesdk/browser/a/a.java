package com.bytedance.android.livesdk.browser.a;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.f.a.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a extends c {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9284a;

    /* renamed from: b  reason: collision with root package name */
    private WebViewClient f9285b;

    public a(WebViewClient webViewClient) {
        this.f9285b = webViewClient;
    }

    public void onPageFinished(WebView webView, String str) {
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f9284a, false, 3393, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f9284a, false, 3393, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f9285b != null) {
            this.f9285b.onPageFinished(webView, str);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        WebView webView2 = webView;
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{webView2, str2, bitmap2}, this, f9284a, false, 3392, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str2, bitmap2}, this, f9284a, false, 3392, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        if (this.f9285b != null) {
            this.f9285b.onPageStarted(webView2, str2, bitmap2);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        WebView webView2 = webView;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{webView2, Integer.valueOf(i), str3, str4}, this, f9284a, false, 3394, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, Integer.valueOf(i), str3, str4}, this, f9284a, false, 3394, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        if (this.f9285b != null) {
            this.f9285b.onReceivedError(webView2, i, str3, str4);
        }
    }
}
