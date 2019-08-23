package com.ss.android.ugc.aweme.web;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class j extends WebViewClient {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f76637b;

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        SslErrorHandler sslErrorHandler2 = sslErrorHandler;
        if (PatchProxy.isSupport(new Object[]{webView, sslErrorHandler2, sslError}, this, f76637b, false, 89895, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, sslErrorHandler2, sslError}, this, f76637b, false, 89895, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
            return;
        }
        new a.C0185a(webView.getContext()).b("notification error ssl cert invalid").a("continue", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76641a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76641a, false, 89897, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76641a, false, 89897, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                sslErrorHandler.proceed();
            }
        }).b("cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f76638a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76638a, false, 89896, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f76638a, false, 89896, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                sslErrorHandler.cancel();
            }
        }).a().a();
    }
}
