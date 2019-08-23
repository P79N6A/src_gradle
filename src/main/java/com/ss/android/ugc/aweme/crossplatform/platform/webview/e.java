package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.graphics.Bitmap;
import android.net.http.SslError;
import android.webkit.SslErrorHandler;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.d;
import com.ss.android.sdk.c.c;
import com.ss.android.sdk.c.g;
import com.ss.android.ugc.aweme.crossplatform.business.DouPlusMonitorBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.PlayableBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.i;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.hybrid.monitor.f;
import com.ss.android.ugc.aweme.hybrid.monitor.q;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0002J\u001a\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002J\n\u0010*\u001a\u0004\u0018\u00010+H\u0002J\u001a\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010$H\u0002J\u001a\u00100\u001a\u00020'2\u0006\u0010(\u001a\u00020)2\b\u0010/\u001a\u0004\u0018\u00010$H\u0002J\b\u00101\u001a\u000202H\u0002J\u001c\u00103\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J&\u00105\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\b\u0010%\u001a\u0004\u0018\u00010$2\b\u00106\u001a\u0004\u0018\u000107H\u0016J&\u00108\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J.\u00108\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\u0006\u0010=\u001a\u00020>2\b\u0010?\u001a\u0004\u0018\u00010$2\b\u0010@\u001a\u0004\u0018\u00010$H\u0016J&\u0010A\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\b\u00109\u001a\u0004\u0018\u00010:2\b\u0010B\u001a\u0004\u0018\u00010CH\u0016J&\u0010D\u001a\u0002022\b\u00104\u001a\u0004\u0018\u00010)2\b\u0010E\u001a\u0004\u0018\u00010F2\b\u0010;\u001a\u0004\u0018\u00010GH\u0016J\u0010\u0010H\u001a\u0002022\b\u0010I\u001a\u0004\u0018\u00010\u0016J\u001e\u0010J\u001a\u0004\u0018\u00010C2\b\u00104\u001a\u0004\u0018\u00010)2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0018\u0010K\u001a\u00020'2\u0006\u00104\u001a\u00020)2\u0006\u0010%\u001a\u00020$H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R(\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR#\u0010\f\u001a\n \u000e*\u0004\u0018\u00010\r0\r8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006L"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebViewClient;", "Lcom/ss/android/sdk/webview/IESWebViewClientDelegate;", "()V", "aliPayHelper", "Lcom/ss/android/newmedia/AliPayHelper;", "value", "Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "iCrossPlatformActivityContainer", "getICrossPlatformActivityContainer", "()Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "setICrossPlatformActivityContainer", "(Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;)V", "intercept", "Lcom/ss/android/sdk/webview/IESUrlIntercept;", "kotlin.jvm.PlatformType", "getIntercept", "()Lcom/ss/android/sdk/webview/IESUrlIntercept;", "intercept$delegate", "Lkotlin/Lazy;", "mOfflineCache", "Lcom/ss/android/sdk/webview/IESOfflineCacheWrapper;", "mTTNetInterceptorWrapper", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/TTNetInterceptorWrapper;", "monitorSession", "Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "getMonitorSession", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "setMonitorSession", "(Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;)V", "onSingleWebViewStatus", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "getOnSingleWebViewStatus", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "setOnSingleWebViewStatus", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;)V", "commerceUrlFilter", "", "url", "filterUrl", "", "webView", "Landroid/webkit/WebView;", "getPlayAbleBusiness", "Lcom/ss/android/ugc/aweme/crossplatform/business/PlayableBusiness;", "handleAliPay", "context", "Landroid/content/Context;", "rawUrl", "handleJsBridge", "initOffline", "", "onPageFinished", "view", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "setTTNetWebViewInterceptor", "interceptorWrapper", "shouldInterceptRequest", "shouldOverrideUrlLoading", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class e extends com.ss.android.sdk.c.e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40971a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f40972b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(e.class), "intercept", "getIntercept()Lcom/ss/android/sdk/webview/IESUrlIntercept;"))};
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public c f40973c;

    /* renamed from: e  reason: collision with root package name */
    com.ss.android.sdk.c.c f40974e;

    /* renamed from: f  reason: collision with root package name */
    public g f40975f;
    @Nullable
    public f g;
    @Nullable
    public com.ss.android.ugc.aweme.crossplatform.activity.f h;
    private final d i = new d();
    private final Lazy j = LazyKt.lazy(c.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "", "kotlin.jvm.PlatformType", "isSourceReady"}, k = 3, mv = {1, 1, 15})
    static final class a implements com.bytedance.ies.g.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40976a;

        /* renamed from: b  reason: collision with root package name */
        public static final a f40977b = new a();

        a() {
        }

        public final boolean a(String str) {
            if (!PatchProxy.isSupport(new Object[]{str}, this, f40976a, false, 34493, new Class[]{String.class}, Boolean.TYPE)) {
                return com.bytedance.ies.geckoclient.f.c(str);
            }
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f40976a, false, 34493, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/webkit/WebResourceResponse;", "kotlin.jvm.PlatformType", "url", "", "intercept"}, k = 3, mv = {1, 1, 15})
    static final class b implements c.a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40978a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ e f40979b;

        b(e eVar) {
            this.f40979b = eVar;
        }

        public final WebResourceResponse a(String str) {
            String str2 = str;
            if (!PatchProxy.isSupport(new Object[]{str2}, this, f40978a, false, 34494, new Class[]{String.class}, WebResourceResponse.class)) {
                return this.f40979b.a().a(str2);
            }
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str2}, this, f40978a, false, 34494, new Class[]{String.class}, WebResourceResponse.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/ss/android/sdk/webview/IESUrlIntercept;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<com.ss.android.sdk.c.d> {
        public static final c INSTANCE = new c();
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
            super(0);
        }

        public final com.ss.android.sdk.c.d invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34495, new Class[0], com.ss.android.sdk.c.d.class)) {
                return com.ss.android.sdk.c.d.a();
            }
            return (com.ss.android.sdk.c.d) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34495, new Class[0], com.ss.android.sdk.c.d.class);
        }
    }

    public final com.ss.android.sdk.c.d a() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f40971a, false, 34477, new Class[0], com.ss.android.sdk.c.d.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f40971a, false, 34477, new Class[0], com.ss.android.sdk.c.d.class);
        } else {
            value = this.j.getValue();
        }
        return (com.ss.android.sdk.c.d) value;
    }

    public e() {
        if (PatchProxy.isSupport(new Object[0], this, f40971a, false, 34479, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f40971a, false, 34479, new Class[0], Void.TYPE);
            return;
        }
        ServiceManager.get().getService(com.bytedance.ies.geckoclient.f.class);
        BaseAppData a2 = BaseAppData.a();
        Intrinsics.checkExpressionValueIsNotNull(a2, "BaseAppData.inst()");
        g o = a2.o();
        if (o != null) {
            List<Pattern> b2 = o.b();
            com.ss.android.sdk.c.c a3 = new com.ss.android.sdk.c.c(o.a()).a((com.bytedance.ies.g.b) a.f40977b);
            BaseAppData a4 = BaseAppData.a();
            Intrinsics.checkExpressionValueIsNotNull(a4, "BaseAppData.inst()");
            this.f40974e = a3.a(a4.f2499b).a(b2).a((c.a) new b(this));
        }
    }

    public final void onPageFinished(@Nullable WebView webView, @Nullable String str) {
        PlayableBusiness playableBusiness;
        if (PatchProxy.isSupport(new Object[]{webView, str}, this, f40971a, false, 34480, new Class[]{WebView.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView, str}, this, f40971a, false, 34480, new Class[]{WebView.class, String.class}, Void.TYPE);
            return;
        }
        super.onPageFinished(webView, str);
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView, str);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.h;
        if (fVar != null) {
            j crossPlatformBusiness = fVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.b(str);
                }
            }
        }
        if (PatchProxy.isSupport(new Object[0], this, f40971a, false, 34492, new Class[0], PlayableBusiness.class)) {
            playableBusiness = (PlayableBusiness) PatchProxy.accessDispatch(new Object[0], this, f40971a, false, 34492, new Class[0], PlayableBusiness.class);
        } else {
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar2 = this.h;
            if (fVar2 != null) {
                j crossPlatformBusiness2 = fVar2.getCrossPlatformBusiness();
                if (crossPlatformBusiness2 != null) {
                    playableBusiness = (PlayableBusiness) crossPlatformBusiness2.a(PlayableBusiness.class);
                }
            }
            playableBusiness = null;
        }
        if (playableBusiness != null) {
            playableBusiness.a(webView, str, this.f20619d);
        }
    }

    @Nullable
    public final WebResourceResponse shouldInterceptRequest(@Nullable WebView webView, @Nullable String str) {
        WebResourceResponse webResourceResponse;
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{webView, str2}, this, f40971a, false, 34486, new Class[]{WebView.class, String.class}, WebResourceResponse.class)) {
            return (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{webView, str2}, this, f40971a, false, 34486, new Class[]{WebView.class, String.class}, WebResourceResponse.class);
        }
        com.ss.android.ugc.aweme.login.b.a.a(str);
        com.ss.android.sdk.c.c cVar = this.f40974e;
        if (cVar != null) {
            WebResourceResponse a2 = cVar.a(str2);
            if (a2 != null) {
                return a2;
            }
        }
        com.ss.android.ugc.traffic.a aVar = com.ss.android.ugc.traffic.a.y;
        com.ss.android.ugc.traffic.a.a(com.ss.android.ugc.traffic.a.g, 1);
        new StringBuilder("originall:").append(str2);
        g gVar = this.f40975f;
        if (gVar != null) {
            String str3 = str2;
            if (PatchProxy.isSupport(new Object[]{str3}, gVar, g.f40983a, false, 34501, new Class[]{String.class}, WebResourceResponse.class)) {
                webResourceResponse = (WebResourceResponse) PatchProxy.accessDispatch(new Object[]{str3}, gVar, g.f40983a, false, 34501, new Class[]{String.class}, WebResourceResponse.class);
            } else {
                Intrinsics.checkParameterIsNotNull(str3, PushConstants.WEB_URL);
                webResourceResponse = i.a.a().a(gVar.f40984b, str3);
            }
            if (webResourceResponse != null) {
                new StringBuilder("return:").append(str2);
                return webResourceResponse;
            }
        }
        new StringBuilder("no intercept:").append(str2);
        return super.shouldInterceptRequest(webView, str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0078 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0079  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldOverrideUrlLoading(@org.jetbrains.annotations.NotNull android.webkit.WebView r11, @org.jetbrains.annotations.NotNull java.lang.String r12) {
        /*
            r10 = this;
            r7 = 2
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r11
            r9 = 1
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 34487(0x86b7, float:4.8327E-41)
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0046
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r11
            r0[r9] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34487(0x86b7, float:4.8327E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r9] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x0046:
            java.lang.String r0 = "view"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r11, r0)
            java.lang.String r0 = "url"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r12, r0)
            com.ss.android.ugc.aweme.crossplatform.activity.f r0 = r10.h
            if (r0 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r0.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0064
            com.ss.android.ugc.aweme.crossplatform.params.b r0 = r0.f40806b
            if (r0 == 0) goto L_0x0064
            boolean r0 = r0.x
            if (r0 != r9) goto L_0x0064
            r0 = 1
            goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean r0 = com.ss.android.newmedia.eplatform.a.a(r11, r12, r0)
            java.lang.String r1 = "BlockPolicy.ePlatformFil…terceptEPlatform == true)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0079
            return r9
        L_0x0079:
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34488(0x86b8, float:4.8328E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00ac
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r8] = r12
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34488(0x86b8, float:4.8328E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r1 = r10
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.String r0 = (java.lang.String) r0
            goto L_0x00d7
        L_0x00ac:
            r0 = r12
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = "__back_url__"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r2 = 0
            boolean r0 = kotlin.text.StringsKt.contains$default((java.lang.CharSequence) r0, (java.lang.CharSequence) r1, (boolean) r8, (int) r7, (java.lang.Object) r2)
            if (r0 == 0) goto L_0x00d6
            java.lang.String r1 = "__back_url__"
            java.lang.String r0 = "snssdk1128://adx"
            java.lang.String r2 = android.net.Uri.encode(r0)
            java.lang.String r0 = "Uri.encode(AbsConstants.…Constants.AID + \"://adx\")"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r2, r0)
            r3 = 0
            r4 = 4
            r5 = 0
            r0 = r12
            java.lang.String r0 = kotlin.text.StringsKt.replace$default((java.lang.String) r0, (java.lang.String) r1, (java.lang.String) r2, (boolean) r3, (int) r4, (java.lang.Object) r5)
            goto L_0x00d7
        L_0x00d6:
            r0 = r12
        L_0x00d7:
            boolean r0 = r10.a(r11, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.e.shouldOverrideUrlLoading(android.webkit.WebView, java.lang.String):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:120:0x022d A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0261 A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x026c A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x027d  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0154 A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0159 A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0160 A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x018c A[ADDED_TO_REGION, Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x019e A[Catch:{ Exception -> 0x0293 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01cc A[Catch:{ Exception -> 0x0293 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean a(android.webkit.WebView r16, java.lang.String r17) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = r17
            r10 = 2
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r11 = 0
            r0[r11] = r8
            r12 = 1
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 34489(0x86b9, float:4.833E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x004b
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34489(0x86b9, float:4.833E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x004b:
            android.content.Context r13 = r16.getContext()
            java.lang.String r0 = "webView.context"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r13, r0)
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r13
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34490(0x86ba, float:4.8331E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0097
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r13
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34490(0x86ba, float:4.8331E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x009d
        L_0x0097:
            com.ss.android.newmedia.d r0 = r7.i
            boolean r0 = r0.a(r13, r9)
        L_0x009d:
            if (r0 == 0) goto L_0x00a0
            return r12
        L_0x00a0:
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34491(0x86bb, float:4.8332E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x00e3
            java.lang.Object[] r0 = new java.lang.Object[r10]
            r0[r11] = r8
            r0[r12] = r9
            com.meituan.robust.ChangeQuickRedirect r2 = f40971a
            r3 = 0
            r4 = 34491(0x86bb, float:4.8332E-41)
            java.lang.Class[] r5 = new java.lang.Class[r10]
            java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
            r5[r11] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r12] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r15
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            goto L_0x00e7
        L_0x00e3:
            boolean r0 = super.shouldOverrideUrlLoading(r16, r17)
        L_0x00e7:
            if (r0 == 0) goto L_0x00ea
            return r12
        L_0x00ea:
            android.net.Uri r0 = android.net.Uri.parse(r17)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r1 = "uri"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r1 = r0.getScheme()     // Catch:{ Exception -> 0x0293 }
            r2 = 0
            if (r1 == 0) goto L_0x0117
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0293 }
            java.lang.String r4 = "Locale.getDefault()"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r3, r4)     // Catch:{ Exception -> 0x0293 }
            if (r1 == 0) goto L_0x010f
            java.lang.String r1 = r1.toLowerCase(r3)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r3 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)     // Catch:{ Exception -> 0x0293 }
            goto L_0x0118
        L_0x010f:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException     // Catch:{ Exception -> 0x0293 }
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0293 }
            throw r0     // Catch:{ Exception -> 0x0293 }
        L_0x0117:
            r1 = r2
        L_0x0118:
            r3 = r1
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3     // Catch:{ Exception -> 0x0293 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x0293 }
            if (r3 == 0) goto L_0x0122
            return r11
        L_0x0122:
            java.lang.String r3 = "about"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r3 == 0) goto L_0x012b
            return r11
        L_0x012b:
            com.ss.android.sdk.activity.a.a r3 = com.ss.android.ugc.aweme.commercialize.utils.f.a()     // Catch:{ Exception -> 0x0293 }
            boolean r4 = r8 instanceof com.ss.android.ugc.aweme.crossplatform.platform.webview.h     // Catch:{ Exception -> 0x0293 }
            if (r4 != 0) goto L_0x0135
            r4 = r2
            goto L_0x0136
        L_0x0135:
            r4 = r8
        L_0x0136:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.h r4 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.h) r4     // Catch:{ Exception -> 0x0293 }
            if (r4 == 0) goto L_0x013f
            boolean r4 = r4.a()     // Catch:{ Exception -> 0x0293 }
            goto L_0x0140
        L_0x013f:
            r4 = 1
        L_0x0140:
            com.ss.android.ugc.aweme.crossplatform.activity.f r5 = r7.h     // Catch:{ Exception -> 0x0293 }
            if (r5 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.crossplatform.params.base.a r5 = r5.getCrossPlatformParams()     // Catch:{ Exception -> 0x0293 }
            if (r5 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.crossplatform.params.b r5 = r5.f40806b     // Catch:{ Exception -> 0x0293 }
            if (r5 == 0) goto L_0x0151
            boolean r5 = r5.p     // Catch:{ Exception -> 0x0293 }
            goto L_0x0152
        L_0x0151:
            r5 = 0
        L_0x0152:
            if (r3 == 0) goto L_0x0159
            java.util.List r6 = r3.getClickJumpAllowList()     // Catch:{ Exception -> 0x0293 }
            goto L_0x015a
        L_0x0159:
            r6 = r2
        L_0x015a:
            boolean r6 = com.ss.android.newmedia.q.a((java.lang.String) r9, (java.lang.String) r1, (java.util.List<java.lang.String>) r6)     // Catch:{ Exception -> 0x0293 }
            if (r6 != 0) goto L_0x0171
            if (r3 == 0) goto L_0x0167
            java.util.List r6 = r3.getAutoJumpAllowList()     // Catch:{ Exception -> 0x0293 }
            goto L_0x0168
        L_0x0167:
            r6 = r2
        L_0x0168:
            boolean r6 = com.ss.android.newmedia.q.a((java.lang.String) r9, (java.lang.String) r1, (java.util.List<java.lang.String>) r6)     // Catch:{ Exception -> 0x0293 }
            if (r6 == 0) goto L_0x016f
            goto L_0x0171
        L_0x016f:
            r6 = 0
            goto L_0x0172
        L_0x0171:
            r6 = 1
        L_0x0172:
            com.ss.android.newmedia.BaseAppData r13 = com.ss.android.newmedia.BaseAppData.a()     // Catch:{ Exception -> 0x0293 }
            boolean r13 = r13.a((java.lang.String) r9)     // Catch:{ Exception -> 0x0293 }
            if (r13 != 0) goto L_0x0195
            if (r3 == 0) goto L_0x018a
            if (r5 == 0) goto L_0x018a
            boolean r13 = r3.isJumpControlEnabled()     // Catch:{ Exception -> 0x0293 }
            if (r13 == 0) goto L_0x018a
            if (r6 != 0) goto L_0x018a
            if (r4 == 0) goto L_0x0195
        L_0x018a:
            if (r3 != 0) goto L_0x0193
            if (r5 == 0) goto L_0x0193
            if (r6 != 0) goto L_0x0193
            if (r4 != 0) goto L_0x0193
            goto L_0x0195
        L_0x0193:
            r5 = 0
            goto L_0x0196
        L_0x0195:
            r5 = 1
        L_0x0196:
            com.ss.android.ugc.aweme.commercialize.feed.j r6 = com.ss.android.ugc.aweme.commercialize.feed.j.a()     // Catch:{ Exception -> 0x0293 }
            com.ss.android.ugc.aweme.crossplatform.activity.f r13 = r7.h     // Catch:{ Exception -> 0x0293 }
            if (r13 == 0) goto L_0x01af
            com.ss.android.ugc.aweme.crossplatform.params.base.a r13 = r13.getCrossPlatformParams()     // Catch:{ Exception -> 0x0293 }
            if (r13 == 0) goto L_0x01af
            com.ss.android.ugc.aweme.crossplatform.params.b r13 = r13.f40806b     // Catch:{ Exception -> 0x0293 }
            if (r13 == 0) goto L_0x01af
            long r13 = r13.f40800b     // Catch:{ Exception -> 0x0293 }
            java.lang.String r13 = java.lang.String.valueOf(r13)     // Catch:{ Exception -> 0x0293 }
            goto L_0x01b0
        L_0x01af:
            r13 = r2
        L_0x01b0:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r6.b(r13)     // Catch:{ Exception -> 0x0293 }
            if (r5 == 0) goto L_0x01c2
            boolean r13 = com.ss.android.ugc.aweme.commercialize.utils.am.e(r6)     // Catch:{ Exception -> 0x0293 }
            if (r13 != 0) goto L_0x01c2
            boolean r6 = com.ss.android.ugc.aweme.commercialize.utils.am.f(r6)     // Catch:{ Exception -> 0x0293 }
            if (r6 == 0) goto L_0x01d8
        L_0x01c2:
            android.content.Context r6 = r16.getContext()     // Catch:{ Exception -> 0x0293 }
            boolean r6 = com.ss.android.ugc.aweme.commercialize.utils.a.b.a((android.content.Context) r6, (android.net.Uri) r0)     // Catch:{ Exception -> 0x0293 }
            if (r6 != 0) goto L_0x0292
            android.content.Context r6 = r16.getContext()     // Catch:{ Exception -> 0x0293 }
            boolean r6 = com.ss.android.ugc.aweme.commercialize.utils.a.b.b(r6, r0)     // Catch:{ Exception -> 0x0293 }
            if (r6 == 0) goto L_0x01d8
            goto L_0x0292
        L_0x01d8:
            java.lang.String r6 = "http"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x028a
            java.lang.String r6 = "https"
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            r6 = r6 ^ r12
            if (r6 == 0) goto L_0x028a
            if (r5 == 0) goto L_0x01f0
            com.ss.android.ugc.aweme.crossplatform.platform.a.a(r9, r4)     // Catch:{ Exception -> 0x0293 }
            return r12
        L_0x01f0:
            if (r3 == 0) goto L_0x01f8
            boolean r3 = r3.isClickControlEnabled()     // Catch:{ Exception -> 0x0293 }
            if (r3 == 0) goto L_0x020b
        L_0x01f8:
            if (r4 != 0) goto L_0x020b
            if (r9 != 0) goto L_0x01ff
            kotlin.jvm.internal.Intrinsics.throwNpe()     // Catch:{ Exception -> 0x0293 }
        L_0x01ff:
            java.lang.String r3 = ".apk"
            boolean r3 = kotlin.text.StringsKt.endsWith$default(r9, r3, r11, r10, r2)     // Catch:{ Exception -> 0x0293 }
            if (r3 == 0) goto L_0x020b
            com.ss.android.ugc.aweme.crossplatform.platform.a.b(r9, r4)     // Catch:{ Exception -> 0x0293 }
            return r12
        L_0x020b:
            com.ss.android.ugc.aweme.crossplatform.platform.a.c(r9, r4)     // Catch:{ Exception -> 0x0293 }
            java.lang.String r3 = "sslocal"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r3 != 0) goto L_0x0221
            java.lang.String r3 = "localsdk"
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r3, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r3 == 0) goto L_0x021f
            goto L_0x0221
        L_0x021f:
            r3 = r9
            goto L_0x0225
        L_0x0221:
            java.lang.String r3 = com.ss.android.newmedia.a.b.a(r17)     // Catch:{ Exception -> 0x0293 }
        L_0x0225:
            java.lang.String r4 = "market"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r4 != 0) goto L_0x0259
            java.lang.String r4 = "intent"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r4 == 0) goto L_0x0236
            goto L_0x0259
        L_0x0236:
            android.content.Context r0 = r16.getContext()     // Catch:{ Exception -> 0x0293 }
            android.content.Intent r1 = new android.content.Intent     // Catch:{ Exception -> 0x0293 }
            java.lang.String r2 = "android.intent.action.VIEW"
            android.net.Uri r4 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x0293 }
            r1.<init>(r2, r4)     // Catch:{ Exception -> 0x0293 }
            boolean r0 = com.ss.android.common.util.ToolUtils.isInstalledApp((android.content.Context) r0, (android.content.Intent) r1)     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x0251
            com.ss.android.ugc.aweme.commercialize.utils.y.b()     // Catch:{ Exception -> 0x0293 }
            com.ss.android.ugc.aweme.commercialize.utils.y.a()     // Catch:{ Exception -> 0x0293 }
        L_0x0251:
            android.content.Context r0 = r16.getContext()     // Catch:{ Exception -> 0x0258 }
            com.ss.android.newmedia.e.b(r0, r3)     // Catch:{ Exception -> 0x0258 }
        L_0x0258:
            return r12
        L_0x0259:
            java.lang.String r4 = "market"
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r4 == 0) goto L_0x026c
            android.content.Intent r2 = new android.content.Intent     // Catch:{ Exception -> 0x0293 }
            java.lang.String r1 = "android.intent.action.VIEW"
            r2.<init>(r1)     // Catch:{ Exception -> 0x0293 }
            r2.setData(r0)     // Catch:{ Exception -> 0x0293 }
            goto L_0x027b
        L_0x026c:
            java.lang.String r0 = "intent"
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r1)     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x027b
            android.content.Intent r0 = android.content.Intent.parseUri(r3, r12)     // Catch:{ URISyntaxException -> 0x027a }
            r2 = r0
            goto L_0x027b
        L_0x027a:
        L_0x027b:
            if (r2 == 0) goto L_0x0289
            r0 = 268435456(0x10000000, float:2.5243549E-29)
            r2.addFlags(r0)     // Catch:{ Exception -> 0x0293 }
            android.content.Context r0 = r16.getContext()     // Catch:{ Exception -> 0x0293 }
            r0.startActivity(r2)     // Catch:{ Exception -> 0x0293 }
        L_0x0289:
            return r12
        L_0x028a:
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r7.f40973c     // Catch:{ Exception -> 0x0293 }
            if (r0 == 0) goto L_0x0293
            r0.b(r8, r9)     // Catch:{ Exception -> 0x0293 }
            goto L_0x0293
        L_0x0292:
            return r12
        L_0x0293:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.e.a(android.webkit.WebView, java.lang.String):boolean");
    }

    public final void onReceivedError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceError webResourceError) {
        WebView webView2 = webView;
        WebResourceRequest webResourceRequest2 = webResourceRequest;
        WebResourceError webResourceError2 = webResourceError;
        if (PatchProxy.isSupport(new Object[]{webView2, webResourceRequest2, webResourceError2}, this, f40971a, false, 34481, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, webResourceRequest2, webResourceError2}, this, f40971a, false, 34481, new Class[]{WebView.class, WebResourceRequest.class, WebResourceError.class}, Void.TYPE);
            return;
        }
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView2, webResourceRequest2, webResourceError2);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.h;
        if (fVar != null) {
            j crossPlatformBusiness = fVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.a(webResourceRequest2, webResourceError2);
                }
            }
        }
    }

    public final void onReceivedHttpError(@Nullable WebView webView, @Nullable WebResourceRequest webResourceRequest, @Nullable WebResourceResponse webResourceResponse) {
        WebView webView2 = webView;
        WebResourceRequest webResourceRequest2 = webResourceRequest;
        WebResourceResponse webResourceResponse2 = webResourceResponse;
        if (PatchProxy.isSupport(new Object[]{webView2, webResourceRequest2, webResourceResponse2}, this, f40971a, false, 34482, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, webResourceRequest2, webResourceResponse2}, this, f40971a, false, 34482, new Class[]{WebView.class, WebResourceRequest.class, WebResourceResponse.class}, Void.TYPE);
            return;
        }
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView2, webResourceRequest2, webResourceResponse2);
        }
    }

    public final void onReceivedSslError(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
        WebView webView2 = webView;
        SslErrorHandler sslErrorHandler2 = sslErrorHandler;
        SslError sslError2 = sslError;
        if (PatchProxy.isSupport(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f40971a, false, 34483, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f40971a, false, 34483, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
            return;
        }
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView2, sslErrorHandler2, sslError2);
        }
    }

    public final void onPageStarted(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
        WebView webView2 = webView;
        String str2 = str;
        Bitmap bitmap2 = bitmap;
        if (PatchProxy.isSupport(new Object[]{webView2, str2, bitmap2}, this, f40971a, false, 34485, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, str2, bitmap2}, this, f40971a, false, 34485, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
            return;
        }
        super.onPageStarted(webView, str, bitmap);
        if (str2 != null) {
            f fVar = this.g;
            if (fVar != null) {
                fVar.b(q.f49996b.a(str2));
            }
        }
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView2, str2, bitmap2);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar2 = this.h;
        if (fVar2 != null) {
            j crossPlatformBusiness = fVar2.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.a(str2);
                }
            }
        }
    }

    public final void onReceivedError(@Nullable WebView webView, int i2, @Nullable String str, @Nullable String str2) {
        WebView webView2 = webView;
        int i3 = i2;
        String str3 = str;
        String str4 = str2;
        if (PatchProxy.isSupport(new Object[]{webView2, Integer.valueOf(i2), str3, str4}, this, f40971a, false, 34484, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{webView2, Integer.valueOf(i2), str3, str4}, this, f40971a, false, 34484, new Class[]{WebView.class, Integer.TYPE, String.class, String.class}, Void.TYPE);
            return;
        }
        super.onReceivedError(webView, i2, str, str2);
        c cVar = this.f40973c;
        if (cVar != null) {
            cVar.a(webView2, i3, str3, str4);
        }
        com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.h;
        if (fVar != null) {
            j crossPlatformBusiness = fVar.getCrossPlatformBusiness();
            if (crossPlatformBusiness != null) {
                DouPlusMonitorBusiness douPlusMonitorBusiness = (DouPlusMonitorBusiness) crossPlatformBusiness.a(DouPlusMonitorBusiness.class);
                if (douPlusMonitorBusiness != null) {
                    douPlusMonitorBusiness.a(i3, str4);
                }
            }
        }
    }
}
