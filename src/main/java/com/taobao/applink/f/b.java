package com.taobao.applink.f;

import android.os.Looper;
import android.webkit.WebView;
import com.taobao.applink.f.a.a;
import com.taobao.applink.f.a.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class b implements a {

    /* renamed from: a  reason: collision with root package name */
    long f79182a = 0;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public Map f79183b = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public Map f79184c = new HashMap();
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public c f79185d = new a();

    /* renamed from: e  reason: collision with root package name */
    private List f79186e = new ArrayList();

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            com.ss.android.ugc.aweme.lancet.c.a(str);
            webView.loadUrl(str);
        }
    }

    /* access modifiers changed from: private */
    public void b(WebView webView, f fVar) {
        if (this.f79186e != null) {
            this.f79186e.add(fVar);
        } else {
            a(webView, fVar);
        }
    }

    public void a(WebView webView) {
        if (this.f79186e != null) {
            for (f a2 : this.f79186e) {
                a(webView, a2);
            }
            this.f79186e = null;
        }
    }

    public void a(WebView webView, f fVar) {
        String format = String.format("javascript:TBAppLinkJsBridge._handleMessageFromNative(\"%s\");", new Object[]{fVar.f().replaceAll("(\\\\)([^utrn])", "\\\\\\\\$1$2").replaceAll("(?<=[^\\\\])(\")", "\\\\\"")});
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, format);
        }
    }

    public void a(WebView webView, String str) {
        String a2 = com.taobao.applink.util.a.a(str);
        com.taobao.applink.f.a.b bVar = (com.taobao.applink.f.a.b) this.f79183b.get(a2);
        String c2 = com.taobao.applink.util.a.c(str);
        if (bVar != null) {
            bVar.a(c2);
            this.f79183b.remove(a2);
        }
    }

    public void a(WebView webView, String str, com.taobao.applink.f.a.b bVar) {
        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(webView, str);
        this.f79183b.put(com.taobao.applink.util.a.b(str), bVar);
    }

    public void a(WebView webView, String str, c cVar) {
        if (cVar != null) {
            this.f79184c.put(str, cVar);
        }
    }

    public void b(WebView webView) {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            a(webView, "javascript:TBAppLinkJsBridge._fetchQueue();", (com.taobao.applink.f.a.b) new c(this, webView));
        }
    }
}
