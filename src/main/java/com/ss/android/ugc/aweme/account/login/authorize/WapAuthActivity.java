package com.ss.android.ugc.aweme.account.login.authorize;

import android.annotation.TargetApi;
import android.content.DialogInterface;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.SslErrorHandler;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.dialog.AlertDialog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class WapAuthActivity extends BaseThirdPartyWapAuthActivity {
    public static ChangeQuickRedirect t;

    public class a extends WebViewClient {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32112a;

        public a() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{webView, str2}, this, f32112a, false, 20155, new Class[]{WebView.class, String.class}, Boolean.TYPE)) {
                return WapAuthActivity.this.a(str2);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{webView, str2}, this, f32112a, false, 20155, new Class[]{WebView.class, String.class}, Boolean.TYPE)).booleanValue();
        }

        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, SslError sslError) {
            SslErrorHandler sslErrorHandler2 = sslErrorHandler;
            if (PatchProxy.isSupport(new Object[]{webView, sslErrorHandler2, sslError}, this, f32112a, false, 20157, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, sslErrorHandler2, sslError}, this, f32112a, false, 20157, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
                return;
            }
            AlertDialog.Builder builder = new AlertDialog.Builder(webView.getContext());
            builder.setMessage((CharSequence) "notification error ssl cert invalid");
            builder.setPositiveButton((CharSequence) "continue", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32114a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32114a, false, 20158, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32114a, false, 20158, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    sslErrorHandler.proceed();
                }
            });
            builder.setNegativeButton((CharSequence) "cancel", (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f32117a;

                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (PatchProxy.isSupport(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32117a, false, 20159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[]{dialogInterface, Integer.valueOf(i)}, this, f32117a, false, 20159, new Class[]{DialogInterface.class, Integer.TYPE}, Void.TYPE);
                        return;
                    }
                    sslErrorHandler.cancel();
                }
            });
            builder.create().show();
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f32112a, false, 20156, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f32112a, false, 20156, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            super.onReceivedError(webView, i, str, str2);
            WapAuthActivity.this.c();
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, t, false, 20152, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, t, false, 20152, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onCreate", false);
    }

    public void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, t, false, 20153, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, t, false, 20153, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, t, false, 20154, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, t, false, 20154, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.WapAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void a(WebView webView) {
        WebView webView2 = webView;
        if (PatchProxy.isSupport(new Object[]{webView2}, this, t, false, 20151, new Class[]{WebView.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2}, this, t, false, 20151, new Class[]{WebView.class}, Void.TYPE);
            return;
        }
        webView2.setWebViewClient(new a());
    }
}
