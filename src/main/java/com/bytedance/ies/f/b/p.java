package com.bytedance.ies.f.b;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.e;
import com.bytedance.ies.f.a.h;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;

@Deprecated
public final class p implements e, m {

    /* renamed from: a  reason: collision with root package name */
    public a f20681a;

    /* renamed from: b  reason: collision with root package name */
    private e f20682b;

    /* renamed from: c  reason: collision with root package name */
    private g f20683c;

    /* renamed from: d  reason: collision with root package name */
    private r f20684d;

    /* renamed from: e  reason: collision with root package name */
    private Set<String> f20685e = new CopyOnWriteArraySet();

    public final void a() {
        this.f20681a.a();
    }

    public final p b(String str) {
        this.f20681a.a(str);
        return this;
    }

    public final p a(WebChromeClient webChromeClient) {
        this.f20681a.a(webChromeClient);
        return this;
    }

    public final p b(List<String> list) {
        this.f20681a.a(list);
        return this;
    }

    public final p a(WebViewClient webViewClient) {
        this.f20681a.a(webViewClient);
        return this;
    }

    @Deprecated
    public final p a(List<String> list) {
        this.f20681a.b(list);
        return this;
    }

    public final void a(String str) {
        this.f20685e.remove(str);
        this.f20681a.a(str, (d) this.f20684d);
    }

    public static p a(WebView webView, o oVar) {
        return new p(webView, oVar);
    }

    private p(WebView webView, o oVar) {
        this.f20682b = oVar.f20676a;
        this.f20683c = oVar.f20677b;
        this.f20681a = a.a(webView);
        this.f20684d = new r(this.f20682b, this.f20685e);
    }

    public final p a(String str, d dVar) {
        this.f20681a.a(str, (d) this.f20684d);
        this.f20683c.a(str, (b) new l(dVar));
        return this;
    }

    public final void a(List<String> list, h hVar, JSONObject jSONObject) {
        this.f20681a.a(list, hVar, jSONObject);
    }
}
