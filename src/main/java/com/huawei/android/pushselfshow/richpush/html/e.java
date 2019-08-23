package com.huawei.android.pushselfshow.richpush.html;

import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.android.pushselfshow.utils.d;
import com.ss.android.ugc.aweme.lancet.c;
import java.io.File;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class e extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25340a;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            c.a(str);
            webView.loadUrl(str);
        }
    }

    e(HtmlViewer htmlViewer) {
        this.f25340a = htmlViewer;
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
    }

    public void onPageFinished(WebView webView, String str) {
        StringBuilder sb;
        super.onPageFinished(webView, str);
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "onPageFinished:" + str + ",title:" + webView.getTitle());
        String title = webView.getTitle();
        if (title != null && title.endsWith(".html")) {
            this.f25340a.a(this.f25340a.f25260d.getString(d.a(this.f25340a.f25260d, "hwpush_richmedia")));
        }
        try {
            if (this.f25340a.f25261e != null) {
                if (!str.equals(this.f25340a.f25260d.getFilesDir().getPath() + File.separator + "PushService" + File.separator + "richpush" + File.separator + "error.html")) {
                    if ("text/html_local".equals(this.f25340a.g.F)) {
                        String prepareJS = this.f25340a.prepareJS(str);
                        String str2 = "var newscript = document.createElement(\"script\");" + "newscript.src=\"" + prepareJS + "\";";
                        sb = new StringBuilder();
                        sb.append(str2 + "newscript.onload=function(){ try {onDeviceReady();}catch(err){}};");
                        sb.append("document.body.appendChild(newscript);");
                    } else {
                        String str3 = "var newscript = document.createElement(\"script\");" + "newscript.src=\"http://open.hicloud.com/android/push1.0.js\";";
                        sb = new StringBuilder();
                        sb.append(str3 + "newscript.onload=function(){ try { onDeviceReady();}catch(err){}};");
                        sb.append("document.body.appendChild(newscript);");
                    }
                    String sb2 = sb.toString();
                    com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "load js " + sb2);
                    _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.f25340a.f25261e, "javascript:" + sb2);
                }
            }
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "onPageFinished load err " + e2.toString(), (Throwable) e2);
        }
    }

    public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "onPageStarted:" + str);
        this.f25340a.setProgress(5);
        this.f25340a.a(this.f25340a.f25260d.getString(d.a(this.f25340a.f25260d, "hwpush_richmedia")));
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            if (!str.startsWith("mailto:") && !str.startsWith("tel:") && !str.startsWith("smsto:") && !str.startsWith("sms:")) {
                if (!str.startsWith("geo:")) {
                    return false;
                }
            }
            this.f25340a.f25260d.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception e2) {
            com.huawei.android.pushagent.utils.a.e.a("PushSelfShowLog", "", (Throwable) e2);
        }
        return true;
    }
}
