package com.bytedance.ies.f.a;

import android.annotation.TargetApi;
import android.os.Build;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.lancet.c;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    static final a f20626a;

    static class a {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public void a(WebView webView, String str) {
            if (webView != null) {
                try {
                    c.a(str);
                    webView.loadUrl(str);
                } catch (Throwable unused) {
                }
            }
        }
    }

    @TargetApi(19)
    static class b extends a {
        private b() {
            super((byte) 0);
        }

        /* synthetic */ b(byte b2) {
            this();
        }

        public final void a(WebView webView, String str) {
            if (webView != null) {
                boolean z = false;
                if (str != null && str.startsWith("javascript:")) {
                    try {
                        webView.evaluateJavascript(str, null);
                        z = true;
                    } catch (Throwable th) {
                        boolean z2 = th instanceof IllegalStateException;
                    }
                }
                if (!z) {
                    try {
                        c.a(str);
                        webView.loadUrl(str);
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 19) {
            f20626a = new b((byte) 0);
        } else {
            f20626a = new a((byte) 0);
        }
    }

    public static void a(WebView webView, String str) {
        f20626a.a(webView, str);
    }
}
