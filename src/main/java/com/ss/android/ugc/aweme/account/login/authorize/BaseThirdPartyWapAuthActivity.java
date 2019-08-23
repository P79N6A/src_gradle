package com.ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.sdk.b.c;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.account.login.BaseActivity;
import com.ss.android.ugc.aweme.app.e;
import com.ss.android.ugc.aweme.main.h.b;
import com.ss.android.ugc.aweme.main.h.w;

public abstract class BaseThirdPartyWapAuthActivity extends BaseActivity {
    public static ChangeQuickRedirect l;
    WebView m;
    ProgressBar n;
    Handler o;
    Runnable p;
    View q;
    CheckBox r;
    c s;
    private TextView t;
    private boolean u;

    class a extends WebChromeClient {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f32110a;

        a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            int i2 = i;
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i)}, this, f32110a, false, 20150, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i)}, this, f32110a, false, 20150, new Class[]{WebView.class, Integer.TYPE}, Void.TYPE);
                return;
            }
            BaseThirdPartyWapAuthActivity baseThirdPartyWapAuthActivity = BaseThirdPartyWapAuthActivity.this;
            if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i)}, baseThirdPartyWapAuthActivity, BaseThirdPartyWapAuthActivity.l, false, 20144, new Class[]{Integer.TYPE}, Void.TYPE)) {
                Object[] objArr = {Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect = BaseThirdPartyWapAuthActivity.l;
                BaseThirdPartyWapAuthActivity baseThirdPartyWapAuthActivity2 = baseThirdPartyWapAuthActivity;
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                PatchProxy.accessDispatch(objArr, baseThirdPartyWapAuthActivity2, changeQuickRedirect2, false, 20144, new Class[]{Integer.TYPE}, Void.TYPE);
            } else {
                baseThirdPartyWapAuthActivity.n.setProgress(i2);
                baseThirdPartyWapAuthActivity.o.removeCallbacks(baseThirdPartyWapAuthActivity.p);
                if (baseThirdPartyWapAuthActivity.n.getVisibility() != 0) {
                    baseThirdPartyWapAuthActivity.n.startAnimation(AnimationUtils.loadAnimation(baseThirdPartyWapAuthActivity, 17432576));
                    baseThirdPartyWapAuthActivity.n.setVisibility(0);
                }
            }
            if (i2 >= 100) {
                BaseThirdPartyWapAuthActivity.this.c();
            }
        }
    }

    public final int a() {
        return C0906R.layout.add;
    }

    public abstract void a(WebView webView);

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 20146, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 20146, new Class[0], Void.TYPE);
            return;
        }
        this.o.removeCallbacks(this.p);
        this.o.postDelayed(this.p, 500);
    }

    public void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 20148, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 20148, new Class[0], Void.TYPE);
            return;
        }
        ((w) com.ss.android.ugc.aweme.w.a(w.class)).a(this.m);
        super.onDestroy();
    }

    public void onPause() {
        if (PatchProxy.isSupport(new Object[0], this, l, false, 20147, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 20147, new Class[0], Void.TYPE);
            return;
        }
        super.onPause();
        ((w) com.ss.android.ugc.aweme.w.a(w.class)).a(this, this.m);
    }

    public final void b() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, l, false, 20141, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, l, false, 20141, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        this.o = new Handler();
        this.p = new Runnable() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f32108a;

            public final void run() {
                if (PatchProxy.isSupport(new Object[0], this, f32108a, false, 20149, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], this, f32108a, false, 20149, new Class[0], Void.TYPE);
                    return;
                }
                BaseThirdPartyWapAuthActivity baseThirdPartyWapAuthActivity = BaseThirdPartyWapAuthActivity.this;
                if (PatchProxy.isSupport(new Object[0], baseThirdPartyWapAuthActivity, BaseThirdPartyWapAuthActivity.l, false, 20145, new Class[0], Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[0], baseThirdPartyWapAuthActivity, BaseThirdPartyWapAuthActivity.l, false, 20145, new Class[0], Void.TYPE);
                    return;
                }
                if (baseThirdPartyWapAuthActivity.n.getVisibility() == 0) {
                    baseThirdPartyWapAuthActivity.n.startAnimation(AnimationUtils.loadAnimation(baseThirdPartyWapAuthActivity, 17432577));
                    baseThirdPartyWapAuthActivity.n.setVisibility(8);
                }
            }
        };
        Intent intent = getIntent();
        String dataString = intent.getDataString();
        this.u = intent.getBooleanExtra("KEY_EXTRA_IS_AUTH_ONLY", false);
        if (dataString == null || !dataString.startsWith("http")) {
            finish();
            return;
        }
        this.h.setText(C0906R.string.ca6);
        try {
            str = Uri.parse(dataString).getQueryParameter("platform");
            if (str != null) {
                try {
                    c a2 = c.a(str);
                    if (a2 != null) {
                        this.h.setText(a2.n);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (str != null) {
            c[] cVarArr = c.j;
            int length = cVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                c cVar = cVarArr[i];
                if (cVar.l.equals(str)) {
                    this.s = cVar;
                    break;
                }
                i++;
            }
        }
        this.t = (TextView) findViewById(C0906R.id.cu2);
        this.q = findViewById(C0906R.id.cty);
        this.r = (CheckBox) findViewById(C0906R.id.ctz);
        this.n = (ProgressBar) findViewById(C0906R.id.cu1);
        CookieManager.getInstance().setAcceptCookie(true);
        this.m = (WebView) findViewById(C0906R.id.cu3);
        WebSettings settings = this.m.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setSupportMultipleWindows(false);
        settings.setBuiltInZoomControls(true);
        a(this.m);
        this.m.setWebChromeClient(new a());
        ((b) com.ss.android.ugc.aweme.w.a(b.class)).a(dataString, this.m);
    }

    /* access modifiers changed from: package-private */
    public final boolean a(String str) {
        boolean z;
        if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 20143, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 20143, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        if (this.u) {
            if (PatchProxy.isSupport(new Object[]{str}, this, l, false, 20142, new Class[]{String.class}, Boolean.TYPE)) {
                z = ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, l, false, 20142, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
            } else if (TextUtils.isEmpty(str) || !str.contains("auth/login_success") || !str.contains("code=") || !str.contains("state=")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                try {
                    Uri parse = Uri.parse(str);
                    String queryParameter = parse.getQueryParameter("code");
                    String queryParameter2 = parse.getQueryParameter("state");
                    Intent intent = new Intent();
                    intent.putExtra("h5_auth_code", queryParameter);
                    intent.putExtra("h5_auth_state", queryParameter2);
                    if (this.s != null) {
                        intent.putExtra("platform", this.s.l);
                    }
                    setResult(-1, intent);
                    finish();
                } catch (Exception unused) {
                    setResult(0);
                    finish();
                }
                return true;
            }
        }
        if (!str.startsWith(e.f34153c)) {
            return false;
        }
        Intent intent2 = new Intent();
        intent2.putExtra("callback", str);
        if (this.s != null) {
            intent2.putExtra("platform", this.s.l);
        }
        setResult(-1, intent2);
        finish();
        return true;
    }
}
