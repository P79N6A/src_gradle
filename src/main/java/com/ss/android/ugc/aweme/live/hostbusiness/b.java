package com.ss.android.ugc.aweme.live.hostbusiness;

import android.annotation.TargetApi;
import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.UIUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.base.utils.d;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.g.a;
import com.ss.android.ugc.aweme.utils.bg;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

public class b extends Dialog {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3430a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f3431b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f3432c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f3433d;

    /* renamed from: e  reason: collision with root package name */
    public a f3434e;

    /* renamed from: f  reason: collision with root package name */
    private String f3435f;
    private CrossPlatformWebView g;
    private View h;
    private View i;
    private FragmentActivity j;
    private WeakReference<b> k;

    public void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f3430a, false, 55680, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3430a, false, 55680, new Class[0], Void.TYPE);
            return;
        }
        if (!this.g.c()) {
            super.onBackPressed();
        }
    }

    public void show() {
        if (PatchProxy.isSupport(new Object[0], this, f3430a, false, 55681, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3430a, false, 55681, new Class[0], Void.TYPE);
            return;
        }
        super.show();
        this.g.c(this.f3435f);
        bg.c(this);
    }

    public void dismiss() {
        if (PatchProxy.isSupport(new Object[0], this, f3430a, false, 55682, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3430a, false, 55682, new Class[0], Void.TYPE);
            return;
        }
        if (this.g != null) {
            this.g.c("about:blank");
        }
        if (this.i instanceof ViewGroup) {
            ((ViewGroup) this.i).removeView(this.g);
        }
        if (PatchProxy.isSupport(new Object[]{this}, null, d.f53418a, true, 55693, new Class[]{Dialog.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{this}, null, d.f53418a, true, 55693, new Class[]{Dialog.class}, Void.TYPE);
        } else if (!a.a() || Thread.currentThread() == Looper.getMainLooper().getThread()) {
            super.dismiss();
        } else {
            throw new IllegalStateException("debug check! this method should be called from main thread!");
        }
        this.f3431b = false;
        if (this.k != null) {
            this.k.clear();
        }
        this.g = null;
        bg.d(this);
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.live.a.b bVar) {
        int i2 = 0;
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f3430a, false, 55685, new Class[]{com.ss.android.ugc.aweme.live.a.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f3430a, false, 55685, new Class[]{com.ss.android.ugc.aweme.live.a.b.class}, Void.TYPE);
        } else if (bVar != null) {
            View view = this.h;
            if (bVar.f53190a == 1) {
                i2 = 8;
            }
            UIUtils.setViewVisibility(view, i2);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("disable_gesture", bVar.f53190a);
                jSONObject.put(PushConstants.WEB_URL, this.f3435f);
            } catch (Exception unused) {
            }
            n.a("aweme_dp_disable_gesture_close", 1, jSONObject);
        }
    }

    public void onCreate(Bundle bundle) {
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f3430a, false, 55679, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f3430a, false, 55679, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.addFlags(67108864);
            window.requestFeature(1);
            window.setSoftInputMode(16);
            setContentView(C0906R.layout.jg);
            window.setBackgroundDrawable(new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setDimAmount(0.0f);
        }
        setCancelable(true);
        this.i = findViewById(C0906R.id.ci4);
        this.i.setBackgroundResource(C0906R.color.a7l);
        if (this.f3433d) {
            new com.ss.android.sdk.activity.b(this.i, UIUtils.getStatusBarHeight(this.j));
        }
        this.g = (CrossPlatformWebView) findViewById(C0906R.id.dx5);
        this.h = findViewById(C0906R.id.blz);
        this.g.setCrossPlatformActivityContainer(CommercializeWebViewHelper.a(this.g, new c() {

            /* renamed from: a  reason: collision with root package name */
            public static ChangeQuickRedirect f53414a;

            public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            }

            public final void b(@Nullable WebView webView, @Nullable String str) {
            }

            public final void a(@Nullable WebView webView, @Nullable String str) {
                if (PatchProxy.isSupport(new Object[]{webView, str}, this, f53414a, false, 55688, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, str}, this, f53414a, false, 55688, new Class[]{WebView.class, String.class}, Void.TYPE);
                    return;
                }
                a aVar = b.this.f3434e;
                if (PatchProxy.isSupport(new Object[]{str}, aVar, a.f53409a, false, 55676, new Class[]{String.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str}, aVar2, a.f53409a, false, 55676, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                if (TextUtils.equals(aVar.f53412d, str)) {
                    aVar.f53410b = false;
                }
            }

            @TargetApi(23)
            public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
                String str;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceError}, this, f53414a, false, 55689, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceError}, this, f53414a, false, 55689, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                    return;
                }
                if (webView == null) {
                    str = "";
                } else {
                    str = webView.getUrl();
                }
                if (webResourceError != null) {
                    i = webResourceError.getErrorCode();
                }
                b.this.f3434e.a(i, str);
            }

            public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
                String str;
                int i = 0;
                if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f53414a, false, 55690, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f53414a, false, 55690, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
                    return;
                }
                if (webView == null) {
                    str = "";
                } else {
                    str = webView.getUrl();
                }
                if (webResourceResponse != null) {
                    i = webResourceResponse.getStatusCode();
                }
                b.this.f3434e.a(i, str);
            }

            public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
                if (PatchProxy.isSupport(new Object[]{webView, str, bitmap}, this, f53414a, false, 55691, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, str, bitmap}, this, f53414a, false, 55691, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                    return;
                }
                a aVar = b.this.f3434e;
                if (PatchProxy.isSupport(new Object[]{str}, aVar, a.f53409a, false, 55675, new Class[]{String.class}, Void.TYPE)) {
                    a aVar2 = aVar;
                    PatchProxy.accessDispatch(new Object[]{str}, aVar2, a.f53409a, false, 55675, new Class[]{String.class}, Void.TYPE);
                    return;
                }
                CharSequence charSequence = str;
                if (!TextUtils.isEmpty(charSequence)) {
                    if (TextUtils.equals(aVar.f53412d, charSequence)) {
                        aVar.f53410b = true;
                        aVar.f53411c = System.currentTimeMillis();
                        return;
                    }
                    aVar.f53410b = false;
                }
            }

            public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
                String str3 = str2;
                if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str3}, this, f53414a, false, 55692, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                    PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str3}, this, f53414a, false, 55692, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                    return;
                }
                b.this.f3434e.a(i, str3);
            }
        }, this.j, this.j, new Bundle()));
        this.h.setOnClickListener(new c(this));
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.live.a.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f3430a, false, 55684, new Class[]{com.ss.android.ugc.aweme.live.a.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f3430a, false, 55684, new Class[]{com.ss.android.ugc.aweme.live.a.a.class}, Void.TYPE);
        } else if ((com.ss.android.ugc.aweme.live.a.a.f53188d.equals(aVar.f53189e) || com.ss.android.ugc.aweme.live.a.a.f53185a.equals(aVar.f53189e)) && isShowing()) {
            if (com.ss.android.ugc.aweme.live.a.a.f53188d.equals(aVar.f53189e) && this.f3432c) {
                com.bytedance.ies.dmt.ui.d.a.c(d.a(), (int) C0906R.string.a6m).a();
            }
            this.f3434e.a(aVar.f53189e);
            dismiss();
        } else {
            if (isShowing() && !this.f3431b) {
                if (this.k != null) {
                    b bVar = (b) this.k.get();
                    if (bVar != null) {
                        bVar.f3431b = false;
                    }
                }
                this.f3434e.a(aVar.f53189e);
                dismiss();
            }
        }
    }

    @Subscribe
    public void onEvent(com.ss.android.ugc.aweme.live.a.c cVar) {
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f3430a, false, 55686, new Class[]{com.ss.android.ugc.aweme.live.a.c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f3430a, false, 55686, new Class[]{com.ss.android.ugc.aweme.live.a.c.class}, Void.TYPE);
        } else if (cVar != null && !TextUtils.isEmpty(cVar.f53191a)) {
            b bVar = new b(this.j, cVar.f53191a, new WeakReference(this));
            this.f3431b = true;
            try {
                bVar.show();
            } catch (Exception e2) {
                Exception exc = e2;
                this.f3431b = false;
                String message = exc.getMessage();
                if (Logger.debug()) {
                    Logger.throwException(exc);
                    return;
                }
                ExceptionMonitor.ensureNotReachHere("LiveDouPlusDialog" + message);
            }
        }
    }

    b(Context context, String str) {
        super(context);
        String str2;
        this.f3435f = str;
        if (PatchProxy.isSupport(new Object[0], this, f3430a, false, 55683, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f3430a, false, 55683, new Class[0], Void.TYPE);
        } else {
            Uri parse = Uri.parse(this.f3435f);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("entrance_type", parse.getQueryParameter("entrance_type"));
                String queryParameter = parse.getQueryParameter("room_id");
                if (!TextUtils.isEmpty(queryParameter)) {
                    if (queryParameter != null) {
                        str2 = queryParameter;
                    } else {
                        str2 = "0L";
                    }
                    if (Long.parseLong(str2) > 0) {
                        jSONObject.put("room_id", queryParameter);
                    }
                }
            } catch (Exception unused) {
            }
            this.f3434e = new a(this.f3435f, jSONObject);
        }
        if (context instanceof FragmentActivity) {
            this.j = (FragmentActivity) context;
        } else if (com.ss.android.ugc.aweme.commerce.live.a.f36962b.a(context) instanceof FragmentActivity) {
            this.j = (FragmentActivity) com.ss.android.ugc.aweme.commerce.live.a.f36962b.a(context);
        } else if (Logger.debug()) {
            Logger.throwException(new NullPointerException("LiveDouPlusDialog: context is not fragment activity!"));
        } else {
            ExceptionMonitor.ensureNotReachHere("LiveDouPlusDialog: context is not fragment activity!");
        }
    }

    private b(Context context, String str, WeakReference<b> weakReference) {
        this(context, str);
        this.k = weakReference;
    }
}
