package com.ss.android.ugc.aweme.commercialize;

import a.g;
import a.i;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.net.http.SslError;
import android.view.View;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.imagepipeline.image.ImageInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.AdvanceSetting;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.ss.android.ugc.aweme.base.ui.AnimatedImageView;
import com.ss.android.ugc.aweme.base.ui.RemoteImageView;
import com.ss.android.ugc.aweme.common.MobClick;
import com.ss.android.ugc.aweme.common.r;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.ss.android.ugc.aweme.crossplatform.view.h;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0018H\u0002J\u0016\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u001bH\u0002J\b\u0010\u001d\u001a\u00020\u0018H\u0002J\b\u0010\u001e\u001a\u00020\u0018H\u0002J\b\u0010\u001f\u001a\u00020\u0018H\u0002J\b\u0010 \u001a\u00020\u0018H\u0002J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001cH\u0002J\b\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0018H\u0002J\b\u0010%\u001a\u00020\u0018H\u0016J\u0012\u0010&\u001a\u00020\u00182\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0012\u0010)\u001a\u00020\u00182\b\u0010*\u001a\u0004\u0018\u00010+H\u0014J\f\u0010,\u001a\u00020-*\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/EasterEggActivityV2;", "Lcom/ss/android/ugc/aweme/base/activity/AmeSSActivity;", "Landroid/view/View$OnClickListener;", "()V", "gifViewLoadListener", "Lcom/ss/android/ugc/aweme/commercialize/utils/AdBaseControllerListener;", "hasLogFail", "", "loadSuccessInLimitTime", "mCloseBtn", "Landroid/widget/ImageView;", "mGifView", "Lcom/ss/android/ugc/aweme/base/ui/AnimatedImageView;", "mRootView", "Landroid/widget/FrameLayout;", "mWebView", "Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "pageParams", "Lcom/ss/android/ugc/aweme/commercialize/EasterEggPageParams;", "startLoadMilliSeconds", "", "webViewLoadListener", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "finish", "", "finishAfterSeconds", "getMobParamsMap", "Ljava/util/HashMap;", "", "initListener", "initParams", "initView", "load", "logFail", "failType", "logLoadFailAndFinish", "logLoadSuccessAndFinish", "onBackPressed", "onClick", "v", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "getRawWebView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class EasterEggActivityV2 extends AmeSSActivity implements View.OnClickListener {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38399a;

    /* renamed from: e  reason: collision with root package name */
    public static final a f38400e = new a((byte) 0);

    /* renamed from: b  reason: collision with root package name */
    public long f38401b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38402c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f38403d;

    /* renamed from: f  reason: collision with root package name */
    private FrameLayout f38404f;
    private CrossPlatformWebView g;
    private AnimatedImageView h;
    private ImageView i;
    private k j;
    private com.ss.android.ugc.aweme.crossplatform.platform.webview.c k;
    private com.ss.android.ugc.aweme.commercialize.utils.a l;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\fH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/commercialize/EasterEggActivityV2$Companion;", "", "()V", "EASTER_EGG_DISPLAY_DURATION", "", "PAGE_PARAMS", "", "launchActivity", "", "activity", "Landroid/app/Activity;", "pageParams", "Lcom/ss/android/ugc/aweme/commercialize/EasterEggPageParams;", "requestCode", "", "context", "Landroid/content/Context;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38405a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001J\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/ss/android/ugc/aweme/commercialize/EasterEggActivityV2$finishAfterSeconds$1", "Lbolts/Continuation;", "Ljava/lang/Void;", "then", "it", "Lbolts/Task;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class b implements g<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38406a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EasterEggActivityV2 f38407b;

        b(EasterEggActivityV2 easterEggActivityV2) {
            this.f38407b = easterEggActivityV2;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f38406a, false, 30303, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f38406a, false, 30303, new Class[]{i.class}, Void.class);
            }
            Intrinsics.checkParameterIsNotNull(iVar, AdvanceSetting.NETWORK_TYPE);
            Map c2 = this.f38407b.c();
            c2.put("disappear_method", "auto_disappear");
            c2.put("duration", String.valueOf(System.currentTimeMillis() - this.f38407b.f38401b));
            r.a("egg_ad_disappear", c2);
            this.f38407b.finish();
            return null;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000M\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u001c\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J&\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J.\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0007H\u0016J&\u0010\u0015\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J&\u0010\u0018\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u000f\u001a\u0004\u0018\u00010\u001bH\u0016¨\u0006\u001c"}, d2 = {"com/ss/android/ugc/aweme/commercialize/EasterEggActivityV2$initListener$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.aweme.crossplatform.platform.webview.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38408a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EasterEggActivityV2 f38409b;

        public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        }

        public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        }

        public final void b(@Nullable WebView webView, @Nullable String str) {
        }

        c(EasterEggActivityV2 easterEggActivityV2) {
            this.f38409b = easterEggActivityV2;
        }

        public final void a(@Nullable WebView webView, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f38408a, false, 30304, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f38408a, false, 30304, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            if (!this.f38409b.f38402c && !this.f38409b.f38403d) {
                this.f38409b.f38402c = true;
                this.f38409b.a();
            }
        }

        public final void a(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
            if (PatchProxy.isSupport(new Object[]{webView, webResourceRequest, webResourceError}, this, f38408a, false, 30305, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, webResourceRequest, webResourceError}, this, f38408a, false, 30305, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
                return;
            }
            this.f38409b.b();
        }

        public final void a(@Nullable WebView webView, int i, @Nullable String str, @Nullable String str2) {
            if (PatchProxy.isSupport(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f38408a, false, 30306, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, Integer.valueOf(i), str, str2}, this, f38408a, false, 30306, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
                return;
            }
            this.f38409b.b();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000+\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016¨\u0006\r"}, d2 = {"com/ss/android/ugc/aweme/commercialize/EasterEggActivityV2$initListener$2", "Lcom/ss/android/ugc/aweme/commercialize/utils/AdBaseControllerListener;", "onFailure", "", "id", "", "throwable", "", "onFinalImageSet", "imageInfo", "Lcom/facebook/imagepipeline/image/ImageInfo;", "animatable", "Landroid/graphics/drawable/Animatable;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d extends com.ss.android.ugc.aweme.commercialize.utils.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38410a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EasterEggActivityV2 f38411b;

        public final void onFailure(@NotNull String str, @NotNull Throwable th) {
            String str2 = str;
            Throwable th2 = th;
            if (PatchProxy.isSupport(new Object[]{str2, th2}, this, f38410a, false, 30308, new Class[]{String.class, Throwable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, th2}, this, f38410a, false, 30308, new Class[]{String.class, Throwable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str2, "id");
            Intrinsics.checkParameterIsNotNull(th2, "throwable");
            super.onFailure(str, th);
            this.f38411b.b();
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        d(EasterEggActivityV2 easterEggActivityV2, boolean z, RemoteImageView remoteImageView) {
            super(true, remoteImageView);
            this.f38411b = easterEggActivityV2;
        }

        /* renamed from: a */
        public final void onFinalImageSet(@NotNull String str, @Nullable ImageInfo imageInfo, @Nullable Animatable animatable) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2, imageInfo, animatable}, this, f38410a, false, 30307, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2, imageInfo, animatable}, this, f38410a, false, 30307, new Class[]{String.class, ImageInfo.class, Animatable.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str, "id");
            super.onFinalImageSet(str, imageInfo, animatable);
            if (!this.f38411b.f38402c && !this.f38411b.f38403d) {
                this.f38411b.f38402c = true;
                this.f38411b.a();
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Lbolts/Task;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "then"}, k = 3, mv = {1, 1, 15})
    static final class e<TTaskResult, TContinuationResult> implements g<Void, Void> {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f38412a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ EasterEggActivityV2 f38413b;

        e(EasterEggActivityV2 easterEggActivityV2) {
            this.f38413b = easterEggActivityV2;
        }

        public final /* synthetic */ Object then(i iVar) {
            if (PatchProxy.isSupport(new Object[]{iVar}, this, f38412a, false, 30309, new Class[]{i.class}, Void.class)) {
                return (Void) PatchProxy.accessDispatch(new Object[]{iVar}, this, f38412a, false, 30309, new Class[]{i.class}, Void.class);
            }
            if (!this.f38413b.f38402c) {
                this.f38413b.a("overtime");
                this.f38413b.finish();
            }
            return null;
        }
    }

    public final void onResume() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30299, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30299, new Class[0], Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f38399a, false, 30300, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f38399a, false, 30300, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30291, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30291, new Class[0], Void.TYPE);
            return;
        }
        a("load_fail");
        finish();
    }

    public final void finish() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30287, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30287, new Class[0], Void.TYPE);
            return;
        }
        setResult(PushConstants.PUSHSERVICE_INFO_SENDMESSAGE_BY_NOTIFICATIONSERVICE_ERROR);
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final HashMap<String, String> c() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30293, new Class[0], HashMap.class)) {
            return (HashMap) PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30293, new Class[0], HashMap.class);
        }
        HashMap<String, String> hashMap = new HashMap<>();
        Map map = hashMap;
        k kVar = this.j;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageParams");
        }
        map.put("enter_from", kVar.getEnterFrom());
        k kVar2 = this.j;
        if (kVar2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageParams");
        }
        map.put("search_keyword", kVar2.getKeyWords());
        k kVar3 = this.j;
        if (kVar3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageParams");
        }
        map.put("egg_ad_id", com.ss.android.ugc.aweme.commercialize.utils.c.c(kVar3.getEasterEggInfo()));
        return hashMap;
    }

    public final void onBackPressed() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30288, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30288, new Class[0], Void.TYPE);
            return;
        }
        super.onBackPressed();
        finish();
        r.onEvent(MobClick.obtain().setEventName("result_ad").setLabelName("close").setJsonObject(com.ss.android.ugc.aweme.app.d.c.a().a("refer", "egg").b()));
    }

    public final void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30289, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30289, new Class[0], Void.TYPE);
            return;
        }
        r.a("show_egg_ad", (Map) c());
        if (PatchProxy.isSupport(new Object[0], this, f38399a, false, 30290, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38399a, false, 30290, new Class[0], Void.TYPE);
            return;
        }
        i.a(7000).a((g<TResult, TContinuationResult>) new b<TResult,TContinuationResult>(this), i.f1052b);
    }

    private final SingleWebView a(@NotNull CrossPlatformWebView crossPlatformWebView) {
        CrossPlatformWebView crossPlatformWebView2 = crossPlatformWebView;
        if (PatchProxy.isSupport(new Object[]{crossPlatformWebView2}, this, f38399a, false, 30294, new Class[]{CrossPlatformWebView.class}, SingleWebView.class)) {
            return (SingleWebView) PatchProxy.accessDispatch(new Object[]{crossPlatformWebView2}, this, f38399a, false, 30294, new Class[]{CrossPlatformWebView.class}, SingleWebView.class);
        }
        SingleWebView b2 = ((h) crossPlatformWebView2.a(h.class)).b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "getViewWrap(WebViewWrap::class.java).webView");
        return b2;
    }

    public final void onClick(@Nullable View view) {
        Integer num;
        if (PatchProxy.isSupport(new Object[]{view}, this, f38399a, false, 30286, new Class[]{View.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{view}, this, f38399a, false, 30286, new Class[]{View.class}, Void.TYPE);
            return;
        }
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == C0906R.id.ti) {
            Map c2 = c();
            c2.put("disappear_method", "click_close_button");
            c2.put("duration", String.valueOf(System.currentTimeMillis() - this.f38401b));
            r.a("egg_ad_disappear", c2);
            finish();
            return;
        }
        k kVar = this.j;
        if (kVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("pageParams");
        }
        com.ss.android.ugc.aweme.commercialize.model.i easterEggInfo = kVar.getEasterEggInfo();
        com.ss.android.ugc.aweme.commercialize.utils.g.a((Context) this, com.ss.android.ugc.aweme.commercialize.utils.c.g(easterEggInfo), com.ss.android.ugc.aweme.commercialize.utils.c.f(easterEggInfo), com.ss.android.ugc.aweme.commercialize.utils.c.h(easterEggInfo));
        Map c3 = c();
        c3.put("duration", String.valueOf(System.currentTimeMillis() - this.f38401b));
        c3.put("enter_method", "click_carton");
        r.a("click_egg_ad", c3);
        finish();
    }

    public final void a(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f38399a, false, 30292, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f38399a, false, 30292, new Class[]{String.class}, Void.TYPE);
        } else if (!this.f38403d && !this.f38402c) {
            this.f38403d = true;
            Map c2 = c();
            c2.put("fail_type", str);
            r.a("show_egg_ad_fail", c2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0241, code lost:
        if (r0.equals("webp") == false) goto L_0x02e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x026b, code lost:
        if (r0 == null) goto L_0x0276;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02a5, code lost:
        if (r0.equals("gif") != false) goto L_0x02a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(@org.jetbrains.annotations.Nullable android.os.Bundle r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 30281(0x7649, float:4.2433E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0030
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30281(0x7649, float:4.2433E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.os.Bundle> r1 = android.os.Bundle.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0030:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r7)
            super.onCreate(r10)
            r9.overridePendingTransition(r8, r8)
            r0 = 2131689637(0x7f0f00a5, float:1.9008295E38)
            r9.setContentView((int) r0)
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30283(0x764b, float:4.2436E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0065
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30283(0x764b, float:4.2436E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ac
        L_0x0065:
            android.content.Intent r0 = r9.getIntent()
            java.lang.String r1 = "pageParams"
            java.io.Serializable r0 = r0.getSerializableExtra(r1)
            if (r0 == 0) goto L_0x030f
            com.ss.android.ugc.aweme.commercialize.k r0 = (com.ss.android.ugc.aweme.commercialize.k) r0
            com.ss.android.ugc.aweme.commercialize.model.i r1 = r0.getEasterEggInfo()
            if (r1 == 0) goto L_0x00a9
            r9.j = r0
            com.ss.android.ugc.aweme.commercialize.model.i r1 = r0.getEasterEggInfo()
            java.lang.String r1 = com.ss.android.ugc.aweme.commercialize.utils.c.a((com.ss.android.ugc.aweme.commercialize.model.i) r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            java.lang.String r2 = "web"
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.commercialize.model.i r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.ss.android.ugc.aweme.commercialize.utils.c.d((com.ss.android.ugc.aweme.commercialize.model.i) r0)
            java.lang.String r1 = "AdDataUtils.getSearchEas…pageParams.easterEggInfo)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            goto L_0x009f
        L_0x009d:
            java.lang.String r0 = ""
        L_0x009f:
            android.content.Intent r1 = r9.getIntent()
            java.lang.String r2 = "url"
            r1.putExtra(r2, r0)
            goto L_0x00ac
        L_0x00a9:
            r9.finish()
        L_0x00ac:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30282(0x764a, float:4.2434E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00cf
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30282(0x764a, float:4.2434E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0167
        L_0x00cf:
            r0 = 2131169621(0x7f071155, float:1.7953577E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r1 = "findViewById(R.id.root_view)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r9.f38404f = r0
            android.widget.FrameLayout r0 = r9.f38404f
            if (r0 != 0) goto L_0x00e8
            java.lang.String r1 = "mRootView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x00e8:
            r1 = r9
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
            r0 = 2131171545(0x7f0718d9, float:1.795748E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.webview)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = (com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0
            r9.g = r0
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 17
            if (r0 < r2) goto L_0x012d
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.g
            if (r0 != 0) goto L_0x010d
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x010d:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = r9.a((com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0)
            android.webkit.WebSettings r0 = r0.getSettings()
            java.lang.String r2 = "mWebView.getRawWebView().settings"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setMediaPlaybackRequiresUserGesture(r8)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.g
            if (r0 != 0) goto L_0x0126
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0126:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = r9.a((com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView) r0)
            r0.setCanTouch(r8)
        L_0x012d:
            r0 = 2131166935(0x7f0706d7, float:1.794813E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.gif_view)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r0 = (com.ss.android.ugc.aweme.base.ui.AnimatedImageView) r0
            r9.h = r0
            r0 = 2131165940(0x7f0702f4, float:1.7946111E38)
            android.view.View r0 = r9.findViewById(r0)
            java.lang.String r2 = "findViewById(R.id.close)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r9.i = r0
            android.widget.ImageView r0 = r9.i
            if (r0 != 0) goto L_0x0156
            java.lang.String r2 = "mCloseBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x0156:
            r0.setOnClickListener(r1)
            android.widget.ImageView r0 = r9.i
            if (r0 != 0) goto L_0x0162
            java.lang.String r1 = "mCloseBtn"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0162:
            android.view.View r0 = (android.view.View) r0
            com.ss.android.ugc.aweme.utils.c.a(r0)
        L_0x0167:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30284(0x764c, float:4.2437E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0189
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30284(0x764c, float:4.2437E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x01d0
        L_0x0189:
            com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c r0 = new com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$c
            r0.<init>(r9)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.c) r0
            r9.k = r0
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r9.g
            if (r0 != 0) goto L_0x019b
            java.lang.String r1 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x019b:
            com.ss.android.ugc.aweme.crossplatform.view.a r0 = (com.ss.android.ugc.aweme.crossplatform.view.a) r0
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r1 = r9.k
            if (r1 != 0) goto L_0x01a6
            java.lang.String r2 = "webViewLoadListener"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01a6:
            r2 = r9
            android.arch.lifecycle.LifecycleOwner r2 = (android.arch.lifecycle.LifecycleOwner) r2
            r3 = r9
            android.app.Activity r3 = (android.app.Activity) r3
            android.content.Intent r4 = r9.getIntent()
            java.lang.String r5 = "intent"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r4, r5)
            android.os.Bundle r4 = r4.getExtras()
            com.ss.android.ugc.aweme.commercialize.utils.CommercializeWebViewHelper.a(r0, r1, r2, r3, r4)
            com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d r0 = new com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$d
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.h
            if (r1 != 0) goto L_0x01c7
            java.lang.String r2 = "mGifView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x01c7:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            r0.<init>(r9, r7, r1)
            com.ss.android.ugc.aweme.commercialize.utils.a r0 = (com.ss.android.ugc.aweme.commercialize.utils.a) r0
            r9.l = r0
        L_0x01d0:
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30285(0x764d, float:4.2438E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x01f3
            java.lang.Object[] r0 = new java.lang.Object[r8]
            com.meituan.robust.ChangeQuickRedirect r2 = f38399a
            r3 = 0
            r4 = 30285(0x764d, float:4.2438E-41)
            java.lang.Class[] r5 = new java.lang.Class[r8]
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x0307
        L_0x01f3:
            com.ss.android.ugc.aweme.commercialize.k r0 = r9.j
            if (r0 != 0) goto L_0x01fc
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x01fc:
            com.ss.android.ugc.aweme.commercialize.model.i r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.ss.android.ugc.aweme.commercialize.utils.c.a((com.ss.android.ugc.aweme.commercialize.model.i) r0)
            com.ss.android.ugc.aweme.commercialize.k r1 = r9.j
            if (r1 != 0) goto L_0x020d
            java.lang.String r2 = "pageParams"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x020d:
            com.ss.android.ugc.aweme.commercialize.model.i r1 = r1.getEasterEggInfo()
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.c.b((com.ss.android.ugc.aweme.commercialize.model.i) r1)
            if (r1 != 0) goto L_0x021c
            r9.b()
            goto L_0x0307
        L_0x021c:
            long r1 = java.lang.System.currentTimeMillis()
            r9.f38401b = r1
            if (r0 != 0) goto L_0x0226
            goto L_0x02e7
        L_0x0226:
            int r1 = r0.hashCode()
            r2 = 102340(0x18fc4, float:1.43409E-40)
            if (r1 == r2) goto L_0x029f
            r2 = 117588(0x1cb54, float:1.64776E-40)
            if (r1 == r2) goto L_0x0244
            r2 = 3645340(0x379f9c, float:5.10821E-39)
            if (r1 == r2) goto L_0x023b
            goto L_0x02e7
        L_0x023b:
            java.lang.String r1 = "webp"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02e7
            goto L_0x02a7
        L_0x0244:
            java.lang.String r1 = "web"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02e7
            com.ss.android.ugc.aweme.commercialize.k r0 = r9.j
            if (r0 != 0) goto L_0x0255
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x0255:
            com.ss.android.ugc.aweme.commercialize.model.i r0 = r0.getEasterEggInfo()
            java.lang.String r0 = com.ss.android.ugc.aweme.commercialize.utils.c.d((com.ss.android.ugc.aweme.commercialize.model.i) r0)
            if (r0 == 0) goto L_0x0276
            if (r0 == 0) goto L_0x026e
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            java.lang.CharSequence r0 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0278
            goto L_0x0276
        L_0x026e:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0276:
            java.lang.String r0 = ""
        L_0x0278:
            r1 = r0
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x0285
            r9.b()
            goto L_0x02e7
        L_0x0285:
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r9.g
            if (r1 != 0) goto L_0x028e
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x028e:
            r1.setVisibility(r8)
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r9.g
            if (r1 != 0) goto L_0x029a
            java.lang.String r2 = "mWebView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x029a:
            r2 = 2
            r1.b((java.lang.String) r0, false)
            goto L_0x02e7
        L_0x029f:
            java.lang.String r1 = "gif"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x02e7
        L_0x02a7:
            com.ss.android.ugc.aweme.commercialize.k r0 = r9.j
            if (r0 != 0) goto L_0x02b0
            java.lang.String r1 = "pageParams"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r1)
        L_0x02b0:
            com.ss.android.ugc.aweme.commercialize.model.i r0 = r0.getEasterEggInfo()
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = com.ss.android.ugc.aweme.commercialize.utils.c.e((com.ss.android.ugc.aweme.commercialize.model.i) r0)
            boolean r1 = com.ss.android.ugc.aweme.commercialize.utils.c.a((com.ss.android.ugc.aweme.base.model.UrlModel) r0)
            if (r1 != 0) goto L_0x02c2
            r9.b()
            goto L_0x02e7
        L_0x02c2:
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.h
            if (r1 != 0) goto L_0x02cb
            java.lang.String r2 = "mGifView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02cb:
            r1.setVisibility(r8)
            com.ss.android.ugc.aweme.base.ui.AnimatedImageView r1 = r9.h
            if (r1 != 0) goto L_0x02d7
            java.lang.String r2 = "mGifView"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L_0x02d7:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = (com.ss.android.ugc.aweme.base.ui.RemoteImageView) r1
            com.ss.android.ugc.aweme.commercialize.utils.a r2 = r9.l
            if (r2 != 0) goto L_0x02e2
            java.lang.String r3 = "gifViewLoadListener"
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
        L_0x02e2:
            com.facebook.drawee.controller.ControllerListener r2 = (com.facebook.drawee.controller.ControllerListener) r2
            com.ss.android.ugc.aweme.commercialize.utils.e.a(r1, r0, r7, r2)
        L_0x02e7:
            com.ss.android.ugc.aweme.setting.AbTestManager r0 = com.ss.android.ugc.aweme.setting.AbTestManager.a()
            java.lang.String r1 = "AbTestManager.getInstance()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            int r0 = r0.ba()
            int r0 = r0 * 1000
            long r0 = (long) r0
            a.i r0 = a.i.a((long) r0)
            com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$e r1 = new com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2$e
            r1.<init>(r9)
            a.g r1 = (a.g) r1
            java.util.concurrent.Executor r2 = a.i.f1052b
            r0.a((a.g<TResult, TContinuationResult>) r1, (java.util.concurrent.Executor) r2)
        L_0x0307:
            java.lang.String r0 = "com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2"
            java.lang.String r1 = "onCreate"
            com.bytedance.apm.agent.instrumentation.ActivityInstrumentation.onTrace(r0, r1, r8)
            return
        L_0x030f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.commercialize.EasterEggPageParams"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commercialize.EasterEggActivityV2.onCreate(android.os.Bundle):void");
    }
}
