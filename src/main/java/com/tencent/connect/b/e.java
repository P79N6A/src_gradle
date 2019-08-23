package com.tencent.connect.b;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.connect.b.g;
import com.tencent.open.a.f;
import com.tencent.open.b.g;
import com.tencent.open.d;
import com.tencent.open.d.h;
import com.tencent.open.web.security.JniInterface;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class e extends Dialog {
    /* access modifiers changed from: package-private */

    /* renamed from: a  reason: collision with root package name */
    public String f79595a;
    /* access modifiers changed from: package-private */

    /* renamed from: b  reason: collision with root package name */
    public com.tencent.open.c.b f79596b;

    /* renamed from: c  reason: collision with root package name */
    com.tencent.open.web.security.c f79597c;

    /* renamed from: d  reason: collision with root package name */
    boolean f79598d;

    /* renamed from: e  reason: collision with root package name */
    int f79599e;
    /* access modifiers changed from: package-private */

    /* renamed from: f  reason: collision with root package name */
    public String f79600f;
    String g;
    long h;
    long i = 30000;
    /* access modifiers changed from: private */
    public b j;
    private com.tencent.tauth.b k;
    /* access modifiers changed from: private */
    public Handler l;
    private FrameLayout m;
    private LinearLayout n;
    /* access modifiers changed from: private */
    public FrameLayout o;
    private ProgressBar p;
    private String q;
    /* access modifiers changed from: private */
    public Context r;
    /* access modifiers changed from: private */
    public HashMap<String, Runnable> s;

    class a extends WebViewClient {
        private a() {
        }

        /* synthetic */ a(e eVar, byte b2) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            f.a("openSDK_LOG.AuthDialog", "-->onPageFinished, url: " + str);
            e.this.o.setVisibility(8);
            if (e.this.f79596b != null) {
                e.this.f79596b.setVisibility(0);
            }
            if (!TextUtils.isEmpty(str)) {
                e.this.l.removeCallbacks((Runnable) e.this.s.remove(str));
            }
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            String str2;
            f.a("openSDK_LOG.AuthDialog", "-->Redirect URL: " + str);
            if (str.startsWith("auth://browser")) {
                JSONObject c2 = h.c(str);
                e.this.f79598d = e.b(e.this);
                if (!e.this.f79598d) {
                    if (c2.optString("fail_cb", null) != null) {
                        e eVar = e.this;
                        String optString = c2.optString("fail_cb");
                        eVar.f79596b.loadUrl("javascript:" + optString + "(" + "" + ");void(" + System.currentTimeMillis() + ");");
                    } else if (c2.optInt("fall_to_wv") == 1) {
                        e eVar2 = e.this;
                        if (e.this.f79595a.indexOf("?") >= 0) {
                            str2 = "&";
                        } else {
                            str2 = "?";
                        }
                        e.a(eVar2, (Object) str2);
                        e.a(e.this, (Object) "browser_error=1");
                        e.this.f79596b.loadUrl(e.this.f79595a);
                    } else {
                        String optString2 = c2.optString("redir", null);
                        if (optString2 != null) {
                            e.this.f79596b.loadUrl(optString2);
                        }
                    }
                }
                return true;
            } else if (str.startsWith("auth://tauth.qq.com/")) {
                e.this.j.a((Object) h.c(str));
                e.this.dismiss();
                return true;
            } else if (str.startsWith("auth://cancel")) {
                e.this.j.h();
                e.this.dismiss();
                return true;
            } else if (str.startsWith("auth://close")) {
                e.this.dismiss();
                return true;
            } else if (str.startsWith("download://")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring(11))));
                    intent.addFlags(268435456);
                    e.this.r.startActivity(intent);
                } catch (Exception e2) {
                    f.b("openSDK_LOG.AuthDialog", "-->start download activity exception, e: ", e2);
                }
                return true;
            } else if (str.startsWith("auth://progress")) {
                try {
                    List<String> pathSegments = Uri.parse(str).getPathSegments();
                    if (pathSegments.isEmpty()) {
                        return true;
                    }
                    int intValue = Integer.valueOf(pathSegments.get(0)).intValue();
                    if (intValue == 0) {
                        e.this.o.setVisibility(8);
                        e.this.f79596b.setVisibility(0);
                    } else if (intValue == 1) {
                        e.this.o.setVisibility(0);
                    }
                    return true;
                } catch (Exception unused) {
                    return true;
                }
            } else if (str.startsWith("auth://onLoginSubmit")) {
                try {
                    List<String> pathSegments2 = Uri.parse(str).getPathSegments();
                    if (!pathSegments2.isEmpty()) {
                        e.this.g = pathSegments2.get(0);
                    }
                } catch (Exception unused2) {
                }
                return true;
            } else if (e.this.f79597c.a(e.this.f79596b, str)) {
                return true;
            } else {
                f.c("openSDK_LOG.AuthDialog", "-->Redirect URL: return false");
                return false;
            }
        }

        @TargetApi(8)
        public final void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
            f.e("openSDK_LOG.AuthDialog", "-->onReceivedSslError " + sslError.getPrimaryError() + "请求不合法，请检查手机安全设置，如系统时间、代理等");
            sslErrorHandler.cancel();
            e.this.j.a(new com.tencent.tauth.d(sslError.getPrimaryError(), "请求不合法，请检查手机安全设置，如系统时间、代理等。", "ssl error"));
            e.this.dismiss();
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            f.a("openSDK_LOG.AuthDialog", "-->onPageStarted, url: " + str);
            super.onPageStarted(webView, str, bitmap);
            e.this.o.setVisibility(0);
            e.this.h = SystemClock.elapsedRealtime();
            if (!TextUtils.isEmpty(e.this.f79600f)) {
                e.this.l.removeCallbacks((Runnable) e.this.s.remove(e.this.f79600f));
            }
            e.this.f79600f = str;
            d dVar = new d(e.this.f79600f);
            e.this.s.put(str, dVar);
            e.this.l.postDelayed(dVar, 120000);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            f.c("openSDK_LOG.AuthDialog", "-->onReceivedError, errorCode: " + i + " | description: " + str);
            if (!h.a(e.this.r)) {
                e.this.j.a(new com.tencent.tauth.d(9001, "当前网络不可用，请稍后重试！", str2));
                e.this.dismiss();
            } else if (!e.this.f79600f.startsWith("http://qzs.qq.com/open/mobile/login/qzsjump.html?")) {
                long elapsedRealtime = SystemClock.elapsedRealtime() - e.this.h;
                if (e.this.f79599e > 0 || elapsedRealtime >= e.this.i) {
                    com.tencent.open.c.b d2 = e.this.f79596b;
                    e eVar = e.this;
                    String substring = eVar.f79595a.substring(eVar.f79595a.indexOf("?") + 1);
                    f.c("openSDK_LOG.AuthDialog", "-->generateDownloadUrl, url: http://qzs.qq.com/open/mobile/login/qzsjump.html?");
                    d2.loadUrl("http://qzs.qq.com/open/mobile/login/qzsjump.html?" + substring);
                    return;
                }
                e.this.f79599e++;
                e.this.l.postDelayed(new Runnable() {
                    public final void run() {
                        e.this.f79596b.loadUrl(e.this.f79600f);
                    }
                }, 500);
            } else {
                e.this.j.a(new com.tencent.tauth.d(i, str, str2));
                e.this.dismiss();
            }
        }
    }

    class b implements com.tencent.tauth.b {

        /* renamed from: a  reason: collision with root package name */
        String f79606a;

        /* renamed from: b  reason: collision with root package name */
        String f79607b;

        /* renamed from: d  reason: collision with root package name */
        private String f79609d;

        /* renamed from: e  reason: collision with root package name */
        private com.tencent.tauth.b f79610e;

        public final void h() {
            if (this.f79610e != null) {
                this.f79610e.h();
                this.f79610e = null;
            }
        }

        public final void a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            g a2 = g.a();
            a2.a(this.f79609d + "_H5", SystemClock.elapsedRealtime(), 0, 0, jSONObject.optInt("ret", -6), this.f79606a, false);
            if (this.f79610e != null) {
                this.f79610e.a((Object) jSONObject);
                this.f79610e = null;
            }
        }

        public final void a(com.tencent.tauth.d dVar) {
            String str;
            if (dVar.f79777b != null) {
                str = dVar.f79777b + this.f79606a;
            } else {
                str = this.f79606a;
            }
            g.a().a(this.f79609d + "_H5", SystemClock.elapsedRealtime(), 0, 0, dVar.f79776a, str, false);
            e.a(e.this, str);
            if (this.f79610e != null) {
                this.f79610e.a(dVar);
                this.f79610e = null;
            }
        }

        public b(String str, String str2, String str3, com.tencent.tauth.b bVar) {
            this.f79609d = str;
            this.f79606a = str2;
            this.f79607b = str3;
            this.f79610e = bVar;
        }
    }

    class c extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private b f79612b;

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    b bVar = this.f79612b;
                    String str = (String) message.obj;
                    try {
                        bVar.a((Object) h.d(str));
                        break;
                    } catch (JSONException unused) {
                        bVar.a(new com.tencent.tauth.d(-4, "服务器返回数据格式有误!", str));
                        return;
                    }
                case 2:
                    this.f79612b.h();
                    return;
                case 3:
                    Context a2 = e.this.r;
                    try {
                        JSONObject d2 = h.d((String) message.obj);
                        int i = d2.getInt("type");
                        f.a(Toast.makeText(a2.getApplicationContext(), d2.getString("msg"), i));
                        return;
                    } catch (JSONException unused2) {
                        break;
                    }
            }
        }

        public c(b bVar, Looper looper) {
            super(looper);
            this.f79612b = bVar;
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        String f79613a = "";

        public final void run() {
            f.a("openSDK_LOG.AuthDialog", "-->timeoutUrl: " + this.f79613a + " | mRetryUrl: " + e.this.f79600f);
            if (this.f79613a.equals(e.this.f79600f)) {
                e.this.j.a(new com.tencent.tauth.d(9002, "请求页面超时，请稍后重试！", e.this.f79600f));
                e.this.dismiss();
            }
        }

        public d(String str) {
            this.f79613a = str;
        }
    }

    /* access modifiers changed from: protected */
    public final void onStop() {
        super.onStop();
    }

    public final void onBackPressed() {
        if (!this.f79598d) {
            this.j.h();
        }
        super.onBackPressed();
    }

    public final void dismiss() {
        this.s.clear();
        this.l.removeCallbacksAndMessages(null);
        if (isShowing()) {
            f.a((Dialog) this);
        }
        if (this.f79596b != null) {
            this.f79596b.destroy();
            this.f79596b = null;
        }
    }

    static /* synthetic */ boolean b(e eVar) {
        if (g.f79615a == null) {
            g.f79615a = new g();
        }
        g gVar = g.f79615a;
        int ceil = (int) Math.ceil((Math.random() * 20.0d) + 3.0d);
        char[] charArray = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
        int length = charArray.length;
        StringBuffer stringBuffer = new StringBuffer();
        for (int i2 = 0; i2 < ceil; i2++) {
            double random = Math.random();
            double d2 = (double) length;
            Double.isNaN(d2);
            stringBuffer.append(charArray[(int) (random * d2)]);
        }
        String stringBuffer2 = stringBuffer.toString();
        g.a aVar = new g.a();
        aVar.f79620a = eVar.k;
        aVar.f79621b = eVar;
        aVar.f79622c = stringBuffer2;
        String a2 = gVar.a(aVar);
        String substring = eVar.f79595a.substring(0, eVar.f79595a.indexOf("?"));
        Bundle b2 = h.b(eVar.f79595a);
        b2.putString("token_key", stringBuffer2);
        b2.putString("serial", a2);
        b2.putString("browser", PushConstants.PUSH_TYPE_THROUGH_MESSAGE);
        eVar.f79595a = substring + "?" + com.tencent.open.d.a.a(b2);
        return h.a(eVar.r, eVar.f79595a);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        TextView textView;
        requestWindowFeature(1);
        super.onCreate(bundle);
        this.p = new ProgressBar(this.r);
        this.p.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        this.n = new LinearLayout(this.r);
        if (this.q.equals("action_login")) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            layoutParams.leftMargin = 5;
            textView = new TextView(this.r);
            if (Locale.getDefault().getLanguage().equals("zh")) {
                textView.setText("登录中...");
            } else {
                textView.setText("Logging in...");
            }
            textView.setTextColor(Color.rgb(255, 255, 255));
            textView.setTextSize(18.0f);
            textView.setLayoutParams(layoutParams);
        } else {
            textView = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        layoutParams2.gravity = 17;
        this.n.setLayoutParams(layoutParams2);
        this.n.addView(this.p);
        if (textView != null) {
            this.n.addView(textView);
        }
        this.o = new FrameLayout(this.r);
        FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -2);
        layoutParams3.leftMargin = 80;
        layoutParams3.rightMargin = 80;
        layoutParams3.topMargin = 40;
        layoutParams3.bottomMargin = 40;
        layoutParams3.gravity = 17;
        this.o.setLayoutParams(layoutParams3);
        this.o.setBackgroundResource(17301504);
        this.o.addView(this.n);
        FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
        this.f79596b = new com.tencent.open.c.b(this.r);
        if (Build.VERSION.SDK_INT >= 11) {
            this.f79596b.setLayerType(1, null);
        }
        this.f79596b.setLayoutParams(layoutParams4);
        this.m = new FrameLayout(this.r);
        layoutParams4.gravity = 17;
        this.m.setLayoutParams(layoutParams4);
        this.m.addView(this.f79596b);
        this.m.addView(this.o);
        setContentView(this.m);
        this.f79596b.setVerticalScrollBarEnabled(false);
        this.f79596b.setHorizontalScrollBarEnabled(false);
        this.f79596b.setWebViewClient(new a(this, (byte) 0));
        this.f79596b.setWebChromeClient(new WebChromeClient());
        this.f79596b.clearFormData();
        this.f79596b.clearSslPreferences();
        this.f79596b.setOnLongClickListener(new View.OnLongClickListener() {
            public final boolean onLongClick(View view) {
                return true;
            }
        });
        this.f79596b.setOnTouchListener(new View.OnTouchListener() {
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                    case 1:
                        if (!view.hasFocus()) {
                            view.requestFocus();
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        WebSettings settings = this.f79596b.getSettings();
        settings.setSavePassword(false);
        settings.setSaveFormData(false);
        settings.setCacheMode(-1);
        settings.setNeedInitialFocus(false);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(true);
        settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
        settings.setJavaScriptEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.r.getDir("databases", 0).getPath());
        settings.setDomStorageEnabled(true);
        f.a("openSDK_LOG.AuthDialog", "-->mUrl : " + this.f79595a);
        this.f79600f = this.f79595a;
        this.f79596b.loadUrl(this.f79595a);
        this.f79596b.setVisibility(4);
        this.f79596b.getSettings().setSavePassword(false);
        this.f79597c.a((d.b) new com.tencent.open.web.security.a(), "SecureJsInterface");
        com.tencent.open.web.security.a.f79768a = false;
        super.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public final void onDismiss(DialogInterface dialogInterface) {
                try {
                    JniInterface.clearAllPWD();
                } catch (Exception unused) {
                }
            }
        });
        this.s = new HashMap<>();
    }

    static /* synthetic */ String a(e eVar, Object obj) {
        String str = eVar.f79595a + obj;
        eVar.f79595a = str;
        return str;
    }

    static /* synthetic */ String a(e eVar, String str) {
        StringBuilder sb = new StringBuilder(str);
        if (!TextUtils.isEmpty(eVar.g) && eVar.g.length() >= 4) {
            String substring = eVar.g.substring(eVar.g.length() - 4);
            sb.append("_u_");
            sb.append(substring);
        }
        return sb.toString();
    }

    public e(Context context, String str, String str2, com.tencent.tauth.b bVar, d dVar) {
        super(context, 16973840);
        this.r = context;
        this.f79595a = str2;
        b bVar2 = new b(str, str2, dVar.f79590a, bVar);
        this.j = bVar2;
        this.l = new c(this.j, context.getMainLooper());
        this.k = bVar;
        this.q = str;
        this.f79597c = new com.tencent.open.web.security.c();
        getWindow().setSoftInputMode(32);
    }
}
