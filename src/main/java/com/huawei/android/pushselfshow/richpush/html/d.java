package com.huawei.android.pushselfshow.richpush.html;

import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.huawei.android.pushagent.utils.a.e;

public class d extends WebChromeClient {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ HtmlViewer f25339a;

    d(HtmlViewer htmlViewer) {
        this.f25339a = htmlViewer;
    }

    public void onProgressChanged(WebView webView, int i) {
        if (this.f25339a.f25261e != null) {
            if (this.f25339a.f25261e.canGoBack()) {
                if (this.f25339a.j != null) {
                    this.f25339a.j.setEnabled(true);
                }
            } else if (this.f25339a.j != null) {
                this.f25339a.j.setEnabled(false);
            }
            if (this.f25339a.f25261e.canGoForward()) {
                if (this.f25339a.k != null) {
                    this.f25339a.k.setEnabled(true);
                }
            } else if (this.f25339a.k != null) {
                this.f25339a.k.setEnabled(false);
            }
        }
        if (i < 5) {
            i = 5;
        }
        this.f25339a.setProgress(i);
        super.onProgressChanged(webView, i);
    }

    public void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        e.a("PushSelfShowLog", "onReceivedTitle:" + str);
        if (!TextUtils.isEmpty(str)) {
            this.f25339a.a(str);
        }
    }
}
