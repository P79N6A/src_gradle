package com.bytedance.sdk.account.a.b;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.sdk.account.b.c.c;
import com.ss.android.ugc.aweme.C0906R;

public abstract class d extends Activity implements com.bytedance.sdk.account.b.a.a {

    /* renamed from: a  reason: collision with root package name */
    public WebView f22234a;

    /* renamed from: b  reason: collision with root package name */
    protected c.a f22235b;

    public final class a extends WebChromeClient {
        public final void onProgressChanged(WebView webView, int i) {
        }

        public a() {
        }
    }

    public final class b extends WebViewClient {
        public b() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (d.this.a(str)) {
                return true;
            }
            WebView webView2 = d.this.f22234a;
            com.ss.android.ugc.aweme.lancet.c.a(str);
            webView2.loadUrl(str);
            return true;
        }
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public abstract void a(c.a aVar, com.bytedance.sdk.account.b.c.b bVar);

    /* access modifiers changed from: protected */
    public abstract boolean a(Intent intent, com.bytedance.sdk.account.b.a.a aVar);

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract String c();

    public void onErrorIntent(@Nullable Intent intent) {
    }

    public void onResp(com.bytedance.sdk.account.b.c.b bVar) {
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
    }

    public void onBackPressed() {
        a("", -2);
    }

    public void onReq(com.bytedance.sdk.account.b.c.a aVar) {
        if (aVar instanceof c.a) {
            this.f22235b = (c.a) aVar;
            c.a aVar2 = this.f22235b;
            aVar2.f22260b = "https://" + c() + "/oauth/authorize/callback/";
        }
    }

    public final boolean a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        c.a aVar = this.f22235b;
        if (aVar == null || aVar.f22260b == null || !str.startsWith(aVar.f22260b)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("code");
        String queryParameter2 = parse.getQueryParameter("state");
        if (TextUtils.isEmpty(queryParameter)) {
            try {
                i = Integer.parseInt(parse.getQueryParameter("error_code"));
            } catch (Exception unused) {
                i = -1;
            }
            a("", i);
            return false;
        }
        a(queryParameter, queryParameter2, 0);
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C0906R.layout.ah);
        a(getIntent(), (com.bytedance.sdk.account.b.a.a) this);
        c.a aVar = this.f22235b;
        if (aVar == null) {
            finish();
            return;
        }
        if (this.f22235b != null) {
            this.f22234a = (WebView) findViewById(C0906R.id.dx8);
            this.f22234a.getSettings().setJavaScriptEnabled(true);
            this.f22234a.getSettings().setDomStorageEnabled(true);
            this.f22234a.setWebViewClient(new b());
            this.f22234a.setWebChromeClient(new a());
        }
        Uri.Builder appendQueryParameter = new Uri.Builder().scheme("https").authority(a()).path(b()).appendQueryParameter("response_type", "code").appendQueryParameter("redirect_uri", aVar.f22260b).appendQueryParameter("client_key", aVar.f22261c).appendQueryParameter("state", aVar.f22259a).appendQueryParameter("from", "opensdk").appendQueryParameter("scope", aVar.f22263e).appendQueryParameter("signature", com.bytedance.sdk.account.b.d.c.a(com.bytedance.sdk.account.b.d.c.a(this, aVar.getCallerPackage())));
        WebView webView = this.f22234a;
        String uri = appendQueryParameter.build().toString();
        com.ss.android.ugc.aweme.lancet.c.a(uri);
        webView.loadUrl(uri);
    }

    private void a(String str, int i) {
        a(str, null, i);
    }

    private void a(String str, String str2, int i) {
        c.b bVar = new c.b();
        bVar.f22265a = str;
        bVar.errorCode = i;
        bVar.f22266b = str2;
        a(this.f22235b, (com.bytedance.sdk.account.b.c.b) bVar);
        finish();
    }
}
