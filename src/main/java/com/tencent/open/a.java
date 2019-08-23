package com.tencent.open;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.open.a.f;
import com.tencent.open.b.g;
import com.tencent.open.d;
import com.tencent.open.d.e;
import com.tencent.open.d.h;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    static final FrameLayout.LayoutParams f79638a = new FrameLayout.LayoutParams(-1, -1);

    /* renamed from: b  reason: collision with root package name */
    static WeakReference<ProgressDialog> f79639b;

    /* renamed from: d  reason: collision with root package name */
    static Toast f79640d = null;

    /* renamed from: c  reason: collision with root package name */
    com.tencent.open.c.a f79641c;
    /* access modifiers changed from: private */
    public WeakReference<Context> g;
    private String h;
    /* access modifiers changed from: private */
    public c i;
    private com.tencent.tauth.b j = null;
    private FrameLayout k;
    private Handler l;
    private com.tencent.connect.b.d m;

    /* renamed from: com.tencent.open.a$a  reason: collision with other inner class name */
    class C0853a extends WebViewClient {
        private C0853a() {
        }

        /* synthetic */ C0853a(a aVar, byte b2) {
            this();
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            a.this.f79641c.setVisibility(0);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            f.a("openSDK_LOG.TDialog", "Redirect URL: " + str);
            if (str.startsWith(e.a().a((Context) a.this.g.get(), "auth://tauth.qq.com/"))) {
                a.this.i.a((Object) h.c(str));
                if (a.this.isShowing()) {
                    a.this.dismiss();
                }
                return true;
            } else if (str.startsWith("auth://cancel")) {
                a.this.i.h();
                if (a.this.isShowing()) {
                    a.this.dismiss();
                }
                return true;
            } else if (str.startsWith("auth://close")) {
                if (a.this.isShowing()) {
                    a.this.dismiss();
                }
                return true;
            } else if (str.startsWith("download://")) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(Uri.decode(str.substring(11))));
                    intent.addFlags(268435456);
                    if (!(a.this.g == null || a.this.g.get() == null)) {
                        ((Context) a.this.g.get()).startActivity(intent);
                    }
                } catch (Exception unused) {
                }
                return true;
            } else if (str.startsWith("auth://progress")) {
                return true;
            } else {
                return false;
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            f.a("openSDK_LOG.TDialog", "Webview loading URL: " + str);
            super.onPageStarted(webView, str, bitmap);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            a.this.i.a(new com.tencent.tauth.d(i, str, str2));
            if (!(a.this.g == null || a.this.g.get() == null)) {
                b.a(Toast.makeText((Context) a.this.g.get(), "网络连接异常或系统错误", 0));
            }
            a.this.dismiss();
        }
    }

    class b extends d.b {
        private b() {
        }

        /* synthetic */ b(a aVar, byte b2) {
            this();
        }
    }

    static class c implements com.tencent.tauth.b {

        /* renamed from: a  reason: collision with root package name */
        String f79653a;

        /* renamed from: b  reason: collision with root package name */
        String f79654b;

        /* renamed from: c  reason: collision with root package name */
        private WeakReference<Context> f79655c;

        /* renamed from: d  reason: collision with root package name */
        private String f79656d;

        /* renamed from: e  reason: collision with root package name */
        private com.tencent.tauth.b f79657e;

        public final void h() {
            if (this.f79657e != null) {
                this.f79657e.h();
                this.f79657e = null;
            }
        }

        public final void a(Object obj) {
            JSONObject jSONObject = (JSONObject) obj;
            g a2 = g.a();
            a2.a(this.f79656d + "_H5", SystemClock.elapsedRealtime(), 0, 0, jSONObject.optInt("ret", -6), this.f79653a, false);
            if (this.f79657e != null) {
                this.f79657e.a((Object) jSONObject);
                this.f79657e = null;
            }
        }

        public final void a(com.tencent.tauth.d dVar) {
            String str;
            if (dVar.f79777b != null) {
                str = dVar.f79777b + this.f79653a;
            } else {
                str = this.f79653a;
            }
            String str2 = str;
            g.a().a(this.f79656d + "_H5", SystemClock.elapsedRealtime(), 0, 0, dVar.f79776a, str2, false);
            if (this.f79657e != null) {
                this.f79657e.a(dVar);
                this.f79657e = null;
            }
        }

        public c(Context context, String str, String str2, String str3, com.tencent.tauth.b bVar) {
            this.f79655c = new WeakReference<>(context);
            this.f79656d = str;
            this.f79653a = str2;
            this.f79654b = str3;
            this.f79657e = bVar;
        }
    }

    class d extends Handler {

        /* renamed from: b  reason: collision with root package name */
        private c f79665b;

        public final void handleMessage(Message message) {
            f.b("openSDK_LOG.TDialog", "--handleMessage--msg.WHAT = " + message.what);
            switch (message.what) {
                case 1:
                    c cVar = this.f79665b;
                    String str = (String) message.obj;
                    try {
                        cVar.a((Object) h.d(str));
                        break;
                    } catch (JSONException unused) {
                        cVar.a(new com.tencent.tauth.d(-4, "服务器返回数据格式有误!", str));
                        return;
                    }
                case 2:
                    this.f79665b.h();
                    return;
                case 3:
                    if (!(a.this.g == null || a.this.g.get() == null)) {
                        Context context = (Context) a.this.g.get();
                        try {
                            JSONObject d2 = h.d((String) message.obj);
                            int i = d2.getInt("type");
                            String string = d2.getString("msg");
                            if (i != 0) {
                                if (i == 1) {
                                    if (a.f79640d == null) {
                                        a.f79640d = Toast.makeText(context, string, 1);
                                    } else {
                                        Toast toast = a.f79640d;
                                        toast.setView(toast.getView());
                                        a.f79640d.setText(string);
                                        a.f79640d.setDuration(1);
                                    }
                                    c.a(a.f79640d);
                                    break;
                                }
                            } else {
                                if (a.f79640d == null) {
                                    a.f79640d = Toast.makeText(context, string, 0);
                                } else {
                                    Toast toast2 = a.f79640d;
                                    toast2.setView(toast2.getView());
                                    a.f79640d.setText(string);
                                    a.f79640d.setDuration(0);
                                }
                                c.a(a.f79640d);
                                return;
                            }
                        } catch (JSONException unused2) {
                        }
                    }
                    break;
                case 4:
                    return;
                case 5:
                    if (!(a.this.g == null || a.this.g.get() == null)) {
                        Context context2 = (Context) a.this.g.get();
                        String str2 = (String) message.obj;
                        if (context2 != null && str2 != null) {
                            try {
                                JSONObject d3 = h.d(str2);
                                int i2 = d3.getInt("action");
                                String string2 = d3.getString("msg");
                                if (i2 == 1) {
                                    if (a.f79639b != null) {
                                        if (a.f79639b.get() != null) {
                                            ((ProgressDialog) a.f79639b.get()).setMessage(string2);
                                            if (!((ProgressDialog) a.f79639b.get()).isShowing()) {
                                                ((ProgressDialog) a.f79639b.get()).show();
                                                break;
                                            }
                                        }
                                    }
                                    ProgressDialog progressDialog = new ProgressDialog(context2);
                                    progressDialog.setMessage(string2);
                                    a.f79639b = new WeakReference<>(progressDialog);
                                    progressDialog.show();
                                    break;
                                } else if (i2 == 0 && a.f79639b != null && a.f79639b.get() != null && ((ProgressDialog) a.f79639b.get()).isShowing()) {
                                    ((ProgressDialog) a.f79639b.get()).dismiss();
                                    a.f79639b = null;
                                }
                                return;
                            } catch (JSONException unused3) {
                                break;
                            }
                        } else {
                            return;
                        }
                    }
            }
        }

        public d(c cVar, Looper looper) {
            super(looper);
            this.f79665b = cVar;
        }
    }

    public final void onBackPressed() {
        if (this.i != null) {
            this.i.h();
        }
        super.onBackPressed();
    }

    /* access modifiers changed from: protected */
    public final void a(String str) {
        f.b("openSDK_LOG.TDialog", "--onConsoleMessage--");
        try {
            this.f79764e.a((WebView) this.f79641c, str);
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        requestWindowFeature(1);
        super.onCreate(bundle);
        new TextView((Context) this.g.get()).setText("test");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        this.f79641c = new com.tencent.open.c.a((Context) this.g.get());
        this.f79641c.setLayoutParams(layoutParams);
        this.k = new FrameLayout((Context) this.g.get());
        layoutParams.gravity = 17;
        this.k.setLayoutParams(layoutParams);
        this.k.addView(this.f79641c);
        setContentView(this.k);
        this.f79641c.setVerticalScrollBarEnabled(false);
        this.f79641c.setHorizontalScrollBarEnabled(false);
        this.f79641c.setWebViewClient(new C0853a(this, (byte) 0));
        this.f79641c.setWebChromeClient(this.f79765f);
        this.f79641c.clearFormData();
        WebSettings settings = this.f79641c.getSettings();
        if (settings != null) {
            settings.setSavePassword(false);
            settings.setSaveFormData(false);
            settings.setCacheMode(-1);
            settings.setNeedInitialFocus(false);
            settings.setBuiltInZoomControls(true);
            settings.setSupportZoom(true);
            settings.setRenderPriority(WebSettings.RenderPriority.HIGH);
            settings.setJavaScriptEnabled(true);
            if (!(this.g == null || this.g.get() == null)) {
                settings.setDatabaseEnabled(true);
                settings.setDatabasePath(((Context) this.g.get()).getApplicationContext().getDir("databases", 0).getPath());
            }
            settings.setDomStorageEnabled(true);
            this.f79764e.a((d.b) new b(this, (byte) 0), "sdk_js_if");
            this.f79641c.loadUrl(this.h);
            this.f79641c.setLayoutParams(f79638a);
            this.f79641c.setVisibility(4);
            this.f79641c.getSettings().setSavePassword(false);
        }
    }

    public a(Context context, String str, String str2, com.tencent.tauth.b bVar, com.tencent.connect.b.d dVar) {
        super(context, 16973840);
        this.g = new WeakReference<>(context);
        this.h = str2;
        c cVar = new c(context, str, str2, dVar.f79590a, null);
        this.i = cVar;
        this.l = new d(this.i, context.getMainLooper());
        this.m = dVar;
    }
}
