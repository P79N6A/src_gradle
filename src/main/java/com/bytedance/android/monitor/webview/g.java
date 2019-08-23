package com.bytedance.android.monitor.webview;

import android.webkit.WebView;

public class g implements a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile g f18858a;

    public final void a(WebView webView) {
    }

    public final void a(WebView webView, String str) {
    }

    public final void d(WebView webView, String str, String str2) {
    }

    private g() {
    }

    public static g a() {
        if (f18858a == null) {
            synchronized (g.class) {
                if (f18858a == null) {
                    f18858a = new g();
                }
            }
        }
        return f18858a;
    }

    public final void a(WebView webView, String str, String str2) {
        h.a();
        new StringBuilder("navigation info: ").append(str2);
    }

    public final void b(WebView webView, String str, String str2) {
        h.a();
        new StringBuilder("resource info: ").append(str2);
    }

    public final void c(WebView webView, String str, String str2) {
        h.a();
        new StringBuilder("other error: ").append(str2);
    }
}
