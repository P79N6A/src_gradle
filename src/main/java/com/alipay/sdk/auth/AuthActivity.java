package com.alipay.sdk.auth;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Handler;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.alipay.sdk.j.i;

@SuppressLint({"SetJavaScriptEnabled", "DefaultLocale"})
public class AuthActivity extends Activity {

    /* renamed from: a  reason: collision with root package name */
    WebView f5451a;

    /* renamed from: b  reason: collision with root package name */
    String f5452b;

    /* renamed from: c  reason: collision with root package name */
    com.alipay.sdk.k.a f5453c;
    /* access modifiers changed from: package-private */

    /* renamed from: d  reason: collision with root package name */
    public boolean f5454d;

    /* renamed from: e  reason: collision with root package name */
    boolean f5455e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public Handler f5456f;
    /* access modifiers changed from: private */
    public Runnable g = new f(this);

    class a extends WebChromeClient {
        private a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:37:0x00b3 A[SYNTHETIC, Splitter:B:37:0x00b3] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onConsoleMessage(android.webkit.ConsoleMessage r8) {
            /*
                r7 = this;
                java.lang.String r0 = r8.message()
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x000f
                boolean r8 = super.onConsoleMessage(r8)
                return r8
            L_0x000f:
                java.lang.String r1 = "h5container.message: "
                boolean r1 = r0.startsWith(r1)
                r2 = 0
                if (r1 == 0) goto L_0x0021
                java.lang.String r1 = "h5container.message: "
                java.lang.String r3 = ""
                java.lang.String r0 = r0.replaceFirst(r1, r3)
                goto L_0x0022
            L_0x0021:
                r0 = r2
            L_0x0022:
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 == 0) goto L_0x002d
                boolean r8 = super.onConsoleMessage(r8)
                return r8
            L_0x002d:
                com.alipay.sdk.auth.AuthActivity r1 = com.alipay.sdk.auth.AuthActivity.this
                com.alipay.sdk.a.c r3 = new com.alipay.sdk.a.c
                android.content.Context r4 = r1.getApplicationContext()
                com.alipay.sdk.auth.c r5 = new com.alipay.sdk.auth.c
                r5.<init>(r1)
                r3.<init>(r4, r5)
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Exception -> 0x00ac }
                r1.<init>(r0)     // Catch:{ Exception -> 0x00ac }
                java.lang.String r0 = "clientId"
                java.lang.String r0 = r1.getString(r0)     // Catch:{ Exception -> 0x00ac }
                boolean r4 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x00ad }
                if (r4 == 0) goto L_0x004f
                goto L_0x00b8
            L_0x004f:
                java.lang.String r4 = "param"
                org.json.JSONObject r4 = r1.getJSONObject(r4)     // Catch:{ Exception -> 0x00ad }
                boolean r5 = r4 instanceof org.json.JSONObject     // Catch:{ Exception -> 0x00ad }
                if (r5 == 0) goto L_0x005c
                r2 = r4
                org.json.JSONObject r2 = (org.json.JSONObject) r2     // Catch:{ Exception -> 0x00ad }
            L_0x005c:
                java.lang.String r4 = "func"
                java.lang.String r4 = r1.getString(r4)     // Catch:{ Exception -> 0x00ad }
                java.lang.String r5 = "bundleName"
                java.lang.String r1 = r1.getString(r5)     // Catch:{ Exception -> 0x00ad }
                com.alipay.sdk.a.a r5 = new com.alipay.sdk.a.a     // Catch:{ Exception -> 0x00ad }
                java.lang.String r6 = "call"
                r5.<init>(r6)     // Catch:{ Exception -> 0x00ad }
                r5.f5395b = r1     // Catch:{ Exception -> 0x00ad }
                r5.f5396c = r4     // Catch:{ Exception -> 0x00ad }
                r5.f5398e = r2     // Catch:{ Exception -> 0x00ad }
                r5.f5394a = r0     // Catch:{ Exception -> 0x00ad }
                java.lang.String r1 = r5.f5396c     // Catch:{ Exception -> 0x00ad }
                boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00ad }
                if (r1 == 0) goto L_0x0087
                java.lang.String r1 = r5.f5394a     // Catch:{ Exception -> 0x00ad }
                int r2 = com.alipay.sdk.a.a.C0041a.f5401c     // Catch:{ Exception -> 0x00ad }
                r3.a(r1, r2)     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b8
            L_0x0087:
                com.alipay.sdk.a.d r1 = new com.alipay.sdk.a.d     // Catch:{ Exception -> 0x00ad }
                r1.<init>(r3, r5)     // Catch:{ Exception -> 0x00ad }
                android.os.Looper r2 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00ad }
                android.os.Looper r4 = android.os.Looper.myLooper()     // Catch:{ Exception -> 0x00ad }
                if (r2 != r4) goto L_0x0098
                r2 = 1
                goto L_0x0099
            L_0x0098:
                r2 = 0
            L_0x0099:
                if (r2 == 0) goto L_0x009f
                r1.run()     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b8
            L_0x009f:
                android.os.Handler r2 = new android.os.Handler     // Catch:{ Exception -> 0x00ad }
                android.os.Looper r4 = android.os.Looper.getMainLooper()     // Catch:{ Exception -> 0x00ad }
                r2.<init>(r4)     // Catch:{ Exception -> 0x00ad }
                r2.post(r1)     // Catch:{ Exception -> 0x00ad }
                goto L_0x00b8
            L_0x00ac:
                r0 = r2
            L_0x00ad:
                boolean r1 = android.text.TextUtils.isEmpty(r0)
                if (r1 != 0) goto L_0x00b8
                int r1 = com.alipay.sdk.a.a.C0041a.f5402d     // Catch:{ JSONException -> 0x00b8 }
                r3.a(r0, r1)     // Catch:{ JSONException -> 0x00b8 }
            L_0x00b8:
                boolean r8 = super.onConsoleMessage(r8)
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.auth.AuthActivity.a.onConsoleMessage(android.webkit.ConsoleMessage):boolean");
        }

        /* synthetic */ a(AuthActivity authActivity, byte b2) {
            this();
        }
    }

    class b extends WebViewClient {
        private b() {
        }

        /* synthetic */ b(AuthActivity authActivity, byte b2) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            AuthActivity.c(AuthActivity.this);
            AuthActivity.this.f5456f.removeCallbacks(AuthActivity.this.g);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) || str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
                try {
                    i.a a2 = i.a(AuthActivity.this, "com.eg.android.AlipayGphone");
                    if (a2 != null) {
                        if (!a2.a()) {
                            if (str.startsWith("intent://platformapi/startapp")) {
                                str = str.replaceFirst("intent://platformapi/startapp?", "alipays://platformapi/startApp?");
                            }
                            AuthActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                            return true;
                        }
                    }
                    return true;
                } catch (Throwable unused) {
                }
            } else if (!AuthActivity.a(AuthActivity.this, str)) {
                return super.shouldOverrideUrlLoading(webView, str);
            } else {
                webView.stopLoading();
                return true;
            }
        }

        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            if (AuthActivity.this.f5454d) {
                sslErrorHandler.proceed();
                boolean unused = AuthActivity.this.f5454d = false;
                return;
            }
            AuthActivity.this.runOnUiThread(new g(this, sslErrorHandler));
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            AuthActivity authActivity = AuthActivity.this;
            try {
                if (authActivity.f5453c == null) {
                    authActivity.f5453c = new com.alipay.sdk.k.a(authActivity, "正在加载");
                }
                authActivity.f5453c.a();
            } catch (Exception unused) {
                authActivity.f5453c = null;
            }
            AuthActivity.this.f5456f.postDelayed(AuthActivity.this.g, 30000);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            AuthActivity.this.f5455e = true;
            super.onReceivedError(webView, i, str, str2);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f5451a != null) {
            this.f5451a.removeAllViews();
            try {
                this.f5451a.destroy();
            } catch (Throwable unused) {
            }
            this.f5451a = null;
        }
    }

    public void onBackPressed() {
        if (!this.f5451a.canGoBack()) {
            j.a(this, this.f5452b + "?resultCode=150");
            finish();
        } else if (this.f5455e) {
            j.a(this, this.f5452b + "?resultCode=150");
            finish();
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    static /* synthetic */ void c(AuthActivity authActivity) {
        if (authActivity.f5453c != null) {
            authActivity.f5453c.b();
        }
        authActivity.f5453c = null;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:13|(3:15|16|(1:18))|19|20|21|22|(1:24)|26|(1:28)|29) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x00f9 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x010f */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x011f A[Catch:{ Throwable -> 0x0141 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0148  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r6) {
        /*
            r5 = this;
            super.onCreate(r6)
            android.content.Intent r6 = r5.getIntent()     // Catch:{ Exception -> 0x0156 }
            android.os.Bundle r6 = r6.getExtras()     // Catch:{ Exception -> 0x0156 }
            if (r6 != 0) goto L_0x0011
            r5.finish()
            return
        L_0x0011:
            java.lang.String r0 = "redirectUri"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Exception -> 0x0152 }
            r5.f5452b = r0     // Catch:{ Exception -> 0x0152 }
            java.lang.String r0 = "params"
            java.lang.String r6 = r6.getString(r0)     // Catch:{ Exception -> 0x0152 }
            boolean r0 = com.alipay.sdk.j.i.a((java.lang.String) r6)
            if (r0 != 0) goto L_0x0029
            r5.finish()
            return
        L_0x0029:
            r0 = 1
            super.requestWindowFeature(r0)
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r2 = r5.getMainLooper()
            r1.<init>(r2)
            r5.f5456f = r1
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r5)
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r1.setOrientation(r0)
            r5.setContentView(r1, r2)
            android.webkit.WebView r3 = new android.webkit.WebView
            r3.<init>(r5)
            r5.f5451a = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.weight = r3
            android.webkit.WebView r3 = r5.f5451a
            r4 = 0
            r3.setVisibility(r4)
            android.webkit.WebView r3 = r5.f5451a
            r1.addView(r3, r2)
            android.webkit.WebView r1 = r5.f5451a
            android.webkit.WebSettings r1 = r1.getSettings()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r1.getUserAgentString()
            r2.append(r3)
            android.content.Context r3 = r5.getApplicationContext()
            java.lang.String r3 = com.alipay.sdk.j.i.d(r3)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.setUserAgentString(r2)
            android.webkit.WebSettings$RenderPriority r2 = android.webkit.WebSettings.RenderPriority.HIGH
            r1.setRenderPriority(r2)
            r1.setSupportMultipleWindows(r0)
            r1.setJavaScriptEnabled(r0)
            r1.setSavePassword(r4)
            r1.setJavaScriptCanOpenWindowsAutomatically(r0)
            int r2 = r1.getMinimumFontSize()
            int r2 = r2 + 8
            r1.setMinimumFontSize(r2)
            r1.setAllowFileAccess(r4)
            android.webkit.WebSettings$TextSize r2 = android.webkit.WebSettings.TextSize.NORMAL
            r1.setTextSize(r2)
            android.webkit.WebView r1 = r5.f5451a
            r1.setVerticalScrollbarOverlay(r0)
            android.webkit.WebView r1 = r5.f5451a
            com.alipay.sdk.auth.AuthActivity$b r2 = new com.alipay.sdk.auth.AuthActivity$b
            r2.<init>(r5, r4)
            r1.setWebViewClient(r2)
            android.webkit.WebView r1 = r5.f5451a
            com.alipay.sdk.auth.AuthActivity$a r2 = new com.alipay.sdk.auth.AuthActivity$a
            r2.<init>(r5, r4)
            r1.setWebChromeClient(r2)
            android.webkit.WebView r1 = r5.f5451a
            com.alipay.sdk.auth.b r2 = new com.alipay.sdk.auth.b
            r2.<init>(r5)
            r1.setDownloadListener(r2)
            android.webkit.WebView r1 = r5.f5451a
            com.alipay.sdk.auth.a.a(r1, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 7
            if (r6 < r1) goto L_0x00f9
            android.webkit.WebView r6 = r5.f5451a     // Catch:{ Exception -> 0x00f9 }
            android.webkit.WebSettings r6 = r6.getSettings()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ Exception -> 0x00f9 }
            java.lang.String r1 = "setDomStorageEnabled"
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x00f9 }
            java.lang.Class r3 = java.lang.Boolean.TYPE     // Catch:{ Exception -> 0x00f9 }
            r2[r4] = r3     // Catch:{ Exception -> 0x00f9 }
            java.lang.reflect.Method r6 = r6.getMethod(r1, r2)     // Catch:{ Exception -> 0x00f9 }
            if (r6 == 0) goto L_0x00f9
            android.webkit.WebView r1 = r5.f5451a     // Catch:{ Exception -> 0x00f9 }
            android.webkit.WebSettings r1 = r1.getSettings()     // Catch:{ Exception -> 0x00f9 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00f9 }
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch:{ Exception -> 0x00f9 }
            r2[r4] = r3     // Catch:{ Exception -> 0x00f9 }
            r6.invoke(r1, r2)     // Catch:{ Exception -> 0x00f9 }
        L_0x00f9:
            android.webkit.WebView r6 = r5.f5451a     // Catch:{ Throwable -> 0x010f }
            java.lang.String r1 = "searchBoxJavaBridge_"
            r6.removeJavascriptInterface(r1)     // Catch:{ Throwable -> 0x010f }
            android.webkit.WebView r6 = r5.f5451a     // Catch:{ Throwable -> 0x010f }
            java.lang.String r1 = "accessibility"
            r6.removeJavascriptInterface(r1)     // Catch:{ Throwable -> 0x010f }
            android.webkit.WebView r6 = r5.f5451a     // Catch:{ Throwable -> 0x010f }
            java.lang.String r1 = "accessibilityTraversal"
            r6.removeJavascriptInterface(r1)     // Catch:{ Throwable -> 0x010f }
            goto L_0x0142
        L_0x010f:
            android.webkit.WebView r6 = r5.f5451a     // Catch:{ Throwable -> 0x0141 }
            java.lang.Class r6 = r6.getClass()     // Catch:{ Throwable -> 0x0141 }
            java.lang.String r1 = "removeJavascriptInterface"
            java.lang.Class[] r2 = new java.lang.Class[r4]     // Catch:{ Throwable -> 0x0141 }
            java.lang.reflect.Method r6 = r6.getMethod(r1, r2)     // Catch:{ Throwable -> 0x0141 }
            if (r6 == 0) goto L_0x0142
            android.webkit.WebView r1 = r5.f5451a     // Catch:{ Throwable -> 0x0141 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0141 }
            java.lang.String r3 = "searchBoxJavaBridge_"
            r2[r4] = r3     // Catch:{ Throwable -> 0x0141 }
            r6.invoke(r1, r2)     // Catch:{ Throwable -> 0x0141 }
            android.webkit.WebView r1 = r5.f5451a     // Catch:{ Throwable -> 0x0141 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0141 }
            java.lang.String r3 = "accessibility"
            r2[r4] = r3     // Catch:{ Throwable -> 0x0141 }
            r6.invoke(r1, r2)     // Catch:{ Throwable -> 0x0141 }
            android.webkit.WebView r1 = r5.f5451a     // Catch:{ Throwable -> 0x0141 }
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0141 }
            java.lang.String r3 = "accessibilityTraversal"
            r2[r4] = r3     // Catch:{ Throwable -> 0x0141 }
            r6.invoke(r1, r2)     // Catch:{ Throwable -> 0x0141 }
            goto L_0x0142
        L_0x0141:
        L_0x0142:
            int r6 = android.os.Build.VERSION.SDK_INT
            r1 = 19
            if (r6 < r1) goto L_0x0151
            android.webkit.WebView r6 = r5.f5451a
            android.webkit.WebSettings r6 = r6.getSettings()
            r6.setCacheMode(r0)
        L_0x0151:
            return
        L_0x0152:
            r5.finish()
            return
        L_0x0156:
            r5.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.auth.AuthActivity.onCreate(android.os.Bundle):void");
    }

    static /* synthetic */ boolean a(AuthActivity authActivity, String str) {
        if (TextUtils.isEmpty(str) || str.startsWith("http://") || str.startsWith("https://")) {
            return false;
        }
        if (!"SDKLite://h5quit".equalsIgnoreCase(str)) {
            if (TextUtils.equals(str, authActivity.f5452b)) {
                str = str + "?resultCode=150";
            }
            j.a(authActivity, str);
        }
        authActivity.finish();
        return true;
    }
}
