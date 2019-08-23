package com.ss.android.ttplatformsdk.d;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.lancet.c;

public abstract class a extends Activity {

    /* renamed from: a  reason: collision with root package name */
    public WebView f2568a;

    /* renamed from: b  reason: collision with root package name */
    ProgressBar f2569b;

    /* renamed from: c  reason: collision with root package name */
    private View f2570c;

    /* renamed from: d  reason: collision with root package name */
    private TextView f2571d;

    /* renamed from: e  reason: collision with root package name */
    private TextView f2572e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2573f;
    private boolean g;

    /* renamed from: com.ss.android.ttplatformsdk.d.a$a  reason: collision with other inner class name */
    public final class C0394a extends WebChromeClient {
        public C0394a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            a aVar = a.this;
            if (aVar.f2569b != null) {
                aVar.f2569b.setProgress(i);
                aVar.f2569b.setVisibility(0);
            }
            if (i >= 100) {
                a.this.f();
            }
        }
    }

    public final class b extends WebViewClient {
        public b() {
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean a2 = a.this.a(str);
            if (!a.this.c()) {
                a.this.g();
            } else if (a.this.b(str) || a2) {
                return true;
            } else {
                WebView webView2 = a.this.f2568a;
                c.a(str);
                webView2.loadUrl(str);
            }
            return true;
        }
    }

    public abstract com.ss.android.ttplatformsdk.b.a a();

    public abstract void a(int i, String str);

    public abstract boolean b();

    public abstract boolean c();

    public abstract void d();

    public abstract void e();

    public void onBackPressed() {
        a("", 9999);
        finish();
    }

    public final void f() {
        if (this.f2569b != null && this.f2569b.getVisibility() == 0) {
            this.f2569b.setVisibility(8);
        }
    }

    public final void g() {
        if (!this.g) {
            this.g = true;
            f();
            View inflate = LayoutInflater.from(this).inflate(C0906R.layout.aar, null, false);
            inflate.findViewById(C0906R.id.d_u).setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    a.this.finish();
                }
            });
            new AlertDialog.Builder(this).setCancelable(false).setView(inflate).create().show();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        String str;
        String str2;
        super.onResume();
        if (!b()) {
            if (!this.f2573f) {
                onBackPressed();
            }
            this.f2573f = false;
            return;
        }
        setContentView(C0906R.layout.af);
        this.f2570c = findViewById(C0906R.id.bad);
        this.f2571d = (TextView) findViewById(C0906R.id.dkl);
        this.f2572e = (TextView) findViewById(C0906R.id.dkm);
        this.f2568a = (WebView) findViewById(C0906R.id.dx8);
        this.f2569b = (ProgressBar) findViewById(C0906R.id.c7n);
        com.ss.android.ttplatformsdk.b.a a2 = a();
        if (a2 != null) {
            if (!TextUtils.isEmpty(a2.f31129e)) {
                this.f2570c.setBackgroundColor(Color.parseColor(a2.f31129e));
            }
            if (!TextUtils.isEmpty(a2.f31125a)) {
                this.f2571d.setText(a2.f31125a);
            }
            if (!TextUtils.isEmpty(a2.f31127c)) {
                this.f2571d.setTextColor(Color.parseColor(a2.f31127c));
            }
            if (!TextUtils.isEmpty(a2.f31126b)) {
                this.f2572e.setText(a2.f31126b);
            }
            if (!TextUtils.isEmpty(a2.f31128d)) {
                this.f2572e.setTextColor(Color.parseColor(a2.f31128d));
            }
            this.f2568a.getSettings().setJavaScriptEnabled(true);
            this.f2568a.setWebViewClient(new b());
            this.f2568a.setWebChromeClient(new C0394a());
            this.f2571d.setOnClickListener(new View.OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    a.this.onBackPressed();
                }
            });
            if (a() != null) {
                CookieManager instance = CookieManager.getInstance();
                instance.setCookie("http://open.snssdk.com/", "bytedance_oauth_session_id=" + r0.f31130f);
                instance.setCookie("http://open.snssdk.com/", "bytedance_oauth_user_name=" + r0.h);
                instance.setCookie("http://open.snssdk.com/", "bytedance_oauth_user_avatar=" + r0.i);
                instance.setCookie("http://open.snssdk.com/", "bytedance_oauth_user_id=" + r0.g);
                if (getIntent() != null) {
                    str = getIntent().getStringExtra("_tt_params_client_key");
                } else {
                    str = "";
                }
                if (getIntent() != null) {
                    str2 = getIntent().getStringExtra("_tt_params_state");
                } else {
                    str2 = "";
                }
                if (!c()) {
                    g();
                    return;
                }
                WebView webView = this.f2568a;
                String str3 = "http://open.snssdk.com/auth/auth_page/" + "?response_type=code" + "&client_key=" + str + "&auth_only=1" + "&from_sdk=1" + "&state=" + str2 + "&redirect_uri=http://api.snssdk.com";
                c.a(str3);
                webView.loadUrl(str3);
                return;
            }
            throw new IllegalArgumentException("init view fail, configuration is null");
        }
        throw new IllegalArgumentException("init view fail, configuration is null");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    private String a(int i) {
        if (i != 0) {
            if (i == 9) {
                return getString(C0906R.string.abk);
            }
            if (i != 9999) {
                return getString(C0906R.string.abj);
            }
        }
        return "";
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f2573f = bundle.getBoolean("key_is_start_login");
            return;
        }
        if (!b()) {
            this.f2573f = true;
            d();
        }
    }

    public final boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme.equals("bdauth-jsbridge")) {
                if (host.equals("login")) {
                    return true;
                }
                if (host.equals("login_fail")) {
                    e();
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final boolean b(String str) {
        int i;
        if (TextUtils.isEmpty(str) || !str.startsWith("http://api.snssdk.com")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("code");
        if (TextUtils.isEmpty(queryParameter)) {
            try {
                i = Integer.parseInt(parse.getQueryParameter("errorCode"));
            } catch (Exception unused) {
                i = 9999;
            }
            a(i, a(i));
            return false;
        }
        a(queryParameter, 0);
        finish();
        return true;
    }

    private void a(String str, int i) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString("_tt_params_token", str);
        bundle.putInt("_tt_params_error_code", i);
        bundle.putString("_tt_params_error_msg", a(i));
        if (getIntent() != null) {
            str2 = getIntent().getStringExtra("_tt_params_package_name");
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(str2, str2 + ".ttopenapi.TtEntryActivity"));
            intent.putExtras(bundle);
            intent.putExtra("start_only_for_android", true);
            startActivity(intent);
        }
    }
}
