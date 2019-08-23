package com.ss.android.ugc.aweme.miniapp.views;

import android.content.DialogInterface;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.dmt.ui.b.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class d extends WebViewClient {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f55966c;

    public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
        SslErrorHandler sslErrorHandler2 = sslErrorHandler;
        if (PatchProxy.isSupport(new Object[]{webView, sslErrorHandler2, sslError}, this, f55966c, false, 59629, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, sslErrorHandler2, sslError}, this, f55966c, false, 59629, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
            return;
        }
        new a.C0185a(webView.getContext()).b("notification error ssl cert invalid").a("continue", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55970a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55970a, false, 59631, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55970a, false, 59631, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                sslErrorHandler.proceed();
            }
        }).b("cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f55967a;

            public final void onClick(DialogInterface dialogInterface, int i) {
                if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55967a, false, 59630, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f55967a, false, 59630, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                    return;
                }
                sslErrorHandler.cancel();
            }
        }).a().a();
    }
}
