package com.ss.android.ugc.aweme.commercialize.views.form;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.k;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.commercialize.feed.j;
import com.ss.android.ugc.aweme.commercialize.log.g;
import com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.c;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.utils.bg;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\b\u0010\u0014\u001a\u00020\u0011H\u0016J\b\u0010\u0015\u001a\u00020\u0011H\u0002J\b\u0010\u0016\u001a\u00020\u0011H\u0002J\b\u0010\u0017\u001a\u00020\u0011H\u0002J\u0012\u0010\u0018\u001a\u00020\u00112\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0016J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001eH\u0007J\f\u0010\u001f\u001a\u00020 *\u00020\rH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/views/form/BottomFormDialogV2;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "()V", "aweme", "Lcom/ss/android/ugc/aweme/feed/model/Aweme;", "clickFrom", "", "formSuccessClose", "", "isPageError", "mCloseBtn", "Landroid/widget/ImageView;", "mWebView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "url", "", "dismiss", "", "view", "Landroid/view/View;", "finish", "initParams", "initView", "load", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onEvent", "event", "Lcom/ss/android/ugc/aweme/commercialize/event/CloseAdFormDialogEvent;", "getRawWebView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class BottomFormDialogV2 extends AmeSSActivity {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2970a;

    /* renamed from: b  reason: collision with root package name */
    public Aweme f2971b;

    /* renamed from: c  reason: collision with root package name */
    public int f2972c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f2973d;

    /* renamed from: e  reason: collision with root package name */
    private CrossPlatformWebView f2974e;

    /* renamed from: f  reason: collision with root package name */
    private ImageView f2975f;
    private String g = "";
    private boolean h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class a implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40089a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BottomFormDialogV2 f40090b;

        a(BottomFormDialogV2 bottomFormDialogV2) {
            this.f40090b = bottomFormDialogV2;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f40089a, false, 33189, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f40089a, false, 33189, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            this.f40090b.finish();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/ugc/aweme/commercialize/views/form/BottomFormDialogV2$load$webViewStatus$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40091a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ BottomFormDialogV2 f40092b;

        public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        }

        public final void a(@Nullable WebView webView, @Nullable String str) {
        }

        public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        }

        public final void b(@Nullable WebView webView, @Nullable String str) {
        }

        b(BottomFormDialogV2 bottomFormDialogV2) {
            this.f40092b = bottomFormDialogV2;
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceError}, this, f40091a, false, 33190, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceError}, this, f40091a, false, 33190, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
            } else if (this.f40092b.f2972c == 8) {
                g.H(this.f40092b, this.f40092b.f2971b);
            } else {
                if (this.f40092b.f2972c == 2 || this.f40092b.f2972c == 10) {
                    g.L(this.f40092b, this.f40092b.f2971b);
                }
            }
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
            if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f40091a, false, 33192, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceResponse}, this, f40091a, false, 33192, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
            } else if (!this.f40092b.f2973d) {
                if (this.f40092b.f2972c == 8) {
                    g.H(this.f40092b, this.f40092b.f2971b);
                    this.f40092b.f2973d = true;
                    return;
                }
                if (this.f40092b.f2972c == 2 || this.f40092b.f2972c == 10) {
                    g.L(this.f40092b, this.f40092b.f2971b);
                    this.f40092b.f2973d = true;
                }
            }
        }

        public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f40091a, false, 33191, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f40091a, false, 33191, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            } else if (this.f40092b.f2972c == 8) {
                g.H(this.f40092b, this.f40092b.f2971b);
            } else {
                if (this.f40092b.f2972c == 2 || this.f40092b.f2972c == 10) {
                    g.L(this.f40092b, this.f40092b.f2971b);
                }
            }
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33187, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33187, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2970a, false, 33188, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2970a, false, 33188, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33183, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33183, new Class[0], Void.TYPE);
            return;
        }
        View currentFocus = getCurrentFocus();
        com.ss.android.ugc.aweme.common.ui.b.a((Activity) this, currentFocus);
        if (currentFocus != null) {
            currentFocus.clearFocus();
        }
        super.finish();
        overridePendingTransition(C0906R.anim.bo, C0906R.anim.bp);
    }

    public final void onDestroy() {
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33179, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33179, new Class[0], Void.TYPE);
            return;
        }
        super.onDestroy();
        if (!this.h) {
            if (this.f2972c == 8) {
                g.G(this, this.f2971b);
            } else if (this.f2972c == 2 || this.f2972c == 10) {
                g.K(this, this.f2971b);
            }
        }
        bg.d(this);
    }

    public final void dismiss(@NotNull View view) {
        View view2 = view;
        if (PatchProxy.isSupport(new Object[]{view2}, this, f2970a, false, 33181, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view2}, this, f2970a, false, 33181, new Class[]{View.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(view2, "view");
        finish();
    }

    @Subscribe
    public final void onEvent(@NotNull com.ss.android.ugc.aweme.commercialize.b.b bVar) {
        if (PatchProxy.isSupport(new Object[]{bVar}, this, f2970a, false, 33184, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar}, this, f2970a, false, 33184, new Class[]{com.ss.android.ugc.aweme.commercialize.b.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar, "event");
        com.bytedance.ies.dmt.ui.d.a.a((Context) k.a(), getString(C0906R.string.cgc)).a();
        this.h = true;
        finish();
    }

    public final void onCreate(@Nullable Bundle bundle) {
        SingleWebView singleWebView;
        Aweme aweme;
        if (PatchProxy.isSupport(new Object[]{bundle}, this, f2970a, false, 33176, new Class[]{Bundle.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bundle}, this, f2970a, false, 33176, new Class[]{Bundle.class}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) C0906R.layout.ak);
        getWindow().setSoftInputMode(19);
        bg.c(this);
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33180, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33180, new Class[0], Void.TYPE);
        } else {
            Intent intent = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent, "intent");
            Bundle extras = intent.getExtras();
            if (extras != null) {
                String string = extras.getString(PushConstants.WEB_URL, "");
                Intrinsics.checkExpressionValueIsNotNull(string, "getString(CrossPlatformParams.BUNDLE_URL, \"\")");
                if (string != null) {
                    this.g = StringsKt.trim((CharSequence) string).toString();
                    this.f2972c = extras.getInt("click_from");
                    String string2 = extras.getString("aweme_id", "");
                    if (j.a().a(string2) != null) {
                        aweme = j.a().a(string2);
                    } else {
                        aweme = com.ss.android.ugc.aweme.feed.a.a().b(string2);
                    }
                    this.f2971b = aweme;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33177, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33177, new Class[0], Void.TYPE);
        } else {
            View findViewById = findViewById(C0906R.id.dx6);
            Intrinsics.checkExpressionValueIsNotNull(findViewById, "findViewById(R.id.webview)");
            this.f2974e = (CrossPlatformWebView) findViewById;
            View findViewById2 = findViewById(C0906R.id.ti);
            Intrinsics.checkExpressionValueIsNotNull(findViewById2, "findViewById(R.id.close)");
            this.f2975f = (ImageView) findViewById2;
            ImageView imageView = this.f2975f;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCloseBtn");
            }
            imageView.setOnClickListener(new a(this));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2970a, false, 33178, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2970a, false, 33178, new Class[0], Void.TYPE);
        } else {
            b bVar = new b(this);
            CrossPlatformWebView crossPlatformWebView = this.f2974e;
            if (crossPlatformWebView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            Intent intent2 = getIntent();
            Intrinsics.checkExpressionValueIsNotNull(intent2, "intent");
            CommercializeWebViewHelper.a(crossPlatformWebView, bVar, this, this, intent2.getExtras());
            CrossPlatformWebView crossPlatformWebView2 = this.f2974e;
            if (crossPlatformWebView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            if (PatchProxy.isSupport(new Object[]{crossPlatformWebView2}, this, f2970a, false, 33182, new Class[]{CrossPlatformWebView.class}, SingleWebView.class)) {
                singleWebView = (SingleWebView) PatchProxy.accessDispatch(new Object[]{crossPlatformWebView2}, this, f2970a, false, 33182, new Class[]{CrossPlatformWebView.class}, SingleWebView.class);
            } else {
                singleWebView = ((h) crossPlatformWebView2.a(h.class)).b();
                Intrinsics.checkExpressionValueIsNotNull(singleWebView, "getViewWrap(WebViewWrap::class.java).webView");
            }
            WebSettings settings = singleWebView.getSettings();
            Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
            String userAgentString = settings.getUserAgentString();
            settings.setUserAgentString(userAgentString + "/RevealType/Dialog");
            singleWebView.setLayerType(1, null);
            CrossPlatformWebView crossPlatformWebView3 = this.f2974e;
            if (crossPlatformWebView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mWebView");
            }
            crossPlatformWebView3.b(this.g, false);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.views.form.BottomFormDialogV2", "onCreate", false);
    }
}
