package com.ss.android.ugc.aweme.crossplatform.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.SslErrorHandler;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.dmt.ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.ui.widget.c;
import com.facebook.react.ReactInstanceManager;
import com.facebook.react.ReactRootView;
import com.facebook.react.modules.core.DefaultHardwareBackBtnHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.ugc.aweme.C0906R;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.XpathBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.params.base.a;
import com.ss.android.ugc.aweme.crossplatform.platform.rn.e;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.ss.android.ugc.aweme.crossplatform.view.e;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.framework.ReactInstance;
import com.ss.android.ugc.aweme.hybrid.monitor.q;
import com.ss.android.ugc.aweme.utils.bg;
import com.ss.android.ugc.aweme.utils.bh;
import java.util.HashMap;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B%\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010K\u001a\u00020L2\u0006\u0010M\u001a\u00020&H\u0016J\b\u0010N\u001a\u00020LH\u0016J\n\u0010O\u001a\u0004\u0018\u00010PH\u0016J\b\u0010Q\u001a\u00020(H\u0016J\n\u0010R\u001a\u0004\u0018\u00010EH\u0016J\n\u0010S\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010T\u001a\u0004\u0018\u00010\fH\u0016J\n\u0010U\u001a\u0004\u0018\u00010\fH\u0016J\b\u0010V\u001a\u000209H\u0016J%\u0010W\u001a\u0002HX\"\b\b\u0000\u0010X*\u00020Y2\f\u0010Z\u001a\b\u0012\u0004\u0012\u0002HX0[H\u0016¢\u0006\u0002\u0010\\J\b\u0010]\u001a\u00020&H\u0016J\u0012\u0010^\u001a\u00020L2\b\u0010_\u001a\u0004\u0018\u00010\fH\u0002J \u0010`\u001a\u00020L2\u0006\u0010a\u001a\u00020-2\u0006\u0010b\u001a\u00020\f2\u0006\u0010c\u001a\u00020\fH\u0002J\b\u0010d\u001a\u00020LH\u0002J\b\u0010e\u001a\u00020LH\u0002J\b\u0010f\u001a\u00020&H\u0016J\u000e\u0010g\u001a\u00020L2\u0006\u0010h\u001a\u00020EJ\u0016\u0010g\u001a\u00020L2\u0006\u0010_\u001a\u00020\f2\u0006\u0010i\u001a\u00020&J\u001e\u0010j\u001a\u00020L2\u0006\u0010_\u001a\u00020\f2\u0006\u0010i\u001a\u00020&2\u0006\u0010k\u001a\u00020&J\u001a\u0010l\u001a\u00020L2\u0006\u0010_\u001a\u00020\f2\b\b\u0002\u0010k\u001a\u00020&H\u0007J\u0010\u0010m\u001a\u00020L2\u0006\u0010n\u001a\u00020EH\u0002J\u0012\u0010o\u001a\u00020&2\b\u0010p\u001a\u0004\u0018\u00010\fH\u0016J3\u0010q\u001a\u00020L2\b\u0010r\u001a\u0004\u0018\u00010\t2\b\u0010s\u001a\u0004\u0018\u00010\f2\b\u0010t\u001a\u0004\u0018\u00010\f2\u0006\u0010u\u001a\u00020&H\u0002¢\u0006\u0002\u0010vJ\u0010\u0010w\u001a\u00020L2\u0006\u0010x\u001a\u00020PH\u0016J\u0010\u0010y\u001a\u00020L2\u0006\u0010x\u001a\u00020PH\u0016J\b\u0010z\u001a\u00020LH\u0014J\u0010\u0010{\u001a\u00020L2\u0006\u0010|\u001a\u00020}H\u0007J\u0010\u0010~\u001a\u00020L2\u0006\u0010x\u001a\u00020PH\u0016J\u0010\u0010\u001a\u00020L2\u0006\u0010x\u001a\u00020PH\u0016J\t\u0010\u0001\u001a\u00020LH\u0016J\u0012\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\fH\u0002J\u0011\u0010\u0001\u001a\u00020L2\u0006\u0010_\u001a\u00020\fH\u0002J*\u0010\u0001\u001a\u00020L2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\u0007\u0010\u0001\u001a\u00020\f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J(\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u00012\n\b\u0002\u0010p\u001a\u0004\u0018\u00010\fJ\u001e\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u001e\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\f2\n\u0010\u0001\u001a\u0005\u0018\u00010\u0001H\u0002J\u0011\u0010\u0001\u001a\u00020L2\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\u0011\u0010\u0001\u001a\u00020L2\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0011\u0010\u0001\u001a\u00020L2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J<\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\t2\t\b\u0002\u0010\u0001\u001a\u00020\tJ\t\u0010\u0001\u001a\u00020LH\u0002J\t\u0010\u0001\u001a\u00020LH\u0016J\u001c\u0010\u0001\u001a\u00020L2\u0007\u0010\u0001\u001a\u00020\t2\b\u0010\u0001\u001a\u00030\u0001H\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020#X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020&X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010'\u001a\u0004\u0018\u00010(X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u0010\u0010*\u001a\u0004\u0018\u00010+X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010,\u001a\u0004\u0018\u00010-X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0011\u00108\u001a\u000209¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010>\u001a\u00020?8BX\u0002¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b@\u0010AR\u0010\u0010D\u001a\u0004\u0018\u00010EX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020GX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020#X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0001"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView;", "Landroid/widget/FrameLayout;", "Lcom/ss/android/ugc/aweme/framework/activity/IReactView;", "Lcom/ss/android/ugc/aweme/crossplatform/view/ICrossPlatformViewContainer;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "curUrl", "", "currentMode", "getCurrentMode", "()I", "setCurrentMode", "(I)V", "customWebViewStatus", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "getCustomWebViewStatus", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "setCustomWebViewStatus", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;)V", "defaultBackButtonImpl", "Lcom/facebook/react/modules/core/DefaultHardwareBackBtnHandler;", "iCrossPlatformActivityContainer", "Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "iFullScreen", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IFullScreen;", "getIFullScreen", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IFullScreen;", "setIFullScreen", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IFullScreen;)V", "initJsTimeStart", "", "initTimeStart", "isWebViewLoadFinish", "", "localCrossPlatformBusiness", "Lcom/ss/android/ugc/aweme/crossplatform/business/ICrossPlatformBusiness;", "logTag", "monitorSession", "Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "reactInstanceManager", "Lcom/facebook/react/ReactInstanceManager;", "getReactInstanceManager", "()Lcom/facebook/react/ReactInstanceManager;", "setReactInstanceManager", "(Lcom/facebook/react/ReactInstanceManager;)V", "reactRootView", "Lcom/facebook/react/ReactRootView;", "getReactRootView", "()Lcom/facebook/react/ReactRootView;", "setReactRootView", "(Lcom/facebook/react/ReactRootView;)V", "registry", "Lcom/ss/android/ugc/aweme/crossplatform/view/ViewStatusRegistry;", "getRegistry", "()Lcom/ss/android/ugc/aweme/crossplatform/view/ViewStatusRegistry;", "rnBridgeRegistry", "Lcom/ss/android/ugc/aweme/fe/registry/rn/RNBridgeRegistry;", "rnContextBuildHelper", "Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper;", "getRnContextBuildHelper", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper;", "rnContextBuildHelper$delegate", "Lkotlin/Lazy;", "rnCrossPlatformParams", "Lcom/ss/android/ugc/aweme/crossplatform/params/base/CrossPlatformParams;", "rnViewWrap", "Lcom/ss/android/ugc/aweme/crossplatform/view/RnViewWrap;", "startLoadUrlTimeStamp", "webViewWrap", "Lcom/ss/android/ugc/aweme/crossplatform/view/WebViewWrap;", "changeStatusBarColor", "", "useDarkMode", "componentDidMount", "getActivity", "Landroid/app/Activity;", "getCrossPlatformBusiness", "getCrossPlatformParams", "getCurrentUrl", "getModuleName", "getReactId", "getViewStatusRegistry", "getViewWrap", "T", "Lcom/ss/android/ugc/aweme/crossplatform/view/ViewWrap;", "_cls", "Ljava/lang/Class;", "(Ljava/lang/Class;)Lcom/ss/android/ugc/aweme/crossplatform/view/ViewWrap;", "goBack", "goFallback", "url", "initReactRootView", "manager", "moduleName", "rnSchema", "initStatusView", "initWebView", "isLoadFinished", "loadRn", "crossPlatformParams", "isLoadSameUrl", "loadRnOrH5", "appendReactIdToFallback", "loadWeb", "loadWithSchemaInfo", "schemaInfo", "match", "reactId", "monitorOpenWebUrlRate", "errorCode", "description", "failingUrl", "success", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Z)V", "onCreate", "activity", "onDestroy", "onDetachedFromWindow", "onJsBroadcastEvent", "broadCastEvent", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onPause", "onResume", "refresh", "reportPageStatus", "status", "reportPoiServiceFailState", "safePutJsonKV", "jsonObject", "Lorg/json/JSONObject;", "key", "value", "", "sendEventToFe", "event", "params", "sendEventToReactNative", "sendEventToWebView", "setCrossPlatformActivityContainer", "setDefaultHardwareBackBtnHandler", "setFullScreen", "setLoadingLocation", "gravity", "marginLeft", "marginTop", "marginRight", "marginBottom", "showErrorStatus", "viewFinish", "viewFinishWithResult", "result", "intent", "Landroid/content/Intent;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class CrossPlatformWebView extends FrameLayout implements a, com.ss.android.ugc.aweme.framework.activity.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2991a;

    /* renamed from: b  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2992b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(CrossPlatformWebView.class), "rnContextBuildHelper", "getRnContextBuildHelper()Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper;"))};

    /* renamed from: c  reason: collision with root package name */
    public boolean f2993c;

    /* renamed from: d  reason: collision with root package name */
    public final String f2994d;

    /* renamed from: e  reason: collision with root package name */
    public com.ss.android.ugc.aweme.crossplatform.activity.f f2995e;

    /* renamed from: f  reason: collision with root package name */
    public final long f2996f;
    public com.ss.android.ugc.aweme.crossplatform.params.base.a g;
    @NotNull
    private final e h;
    private final c i;
    private final h j;
    @Nullable
    private com.ss.android.ugc.aweme.crossplatform.platform.webview.b k;
    private int l;
    @Nullable
    private com.ss.android.ugc.aweme.crossplatform.platform.webview.c m;
    @Nullable
    private ReactInstanceManager n;
    @Nullable
    private ReactRootView o;
    private long p;
    private com.ss.android.ugc.aweme.hybrid.monitor.f q;
    private j r;
    private String s;
    private final Lazy t;
    private DefaultHardwareBackBtnHandler u;
    private com.ss.android.ugc.aweme.fe.registry.rn.b v;
    private long w;
    private HashMap x;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$getViewWrap$1", "Lcom/ss/android/ugc/aweme/crossplatform/view/ViewWrap;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a implements g {
        a() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 1, 15})
    static final class b implements View.OnClickListener {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41004a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41005b;

        b(CrossPlatformWebView crossPlatformWebView) {
            this.f41005b = crossPlatformWebView;
        }

        public final void onClick(View view) {
            if (PatchProxy.isSupport(new Object[]{view}, this, f41004a, false, 34589, new Class[]{View.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view}, this, f41004a, false, 34589, new Class[]{View.class}, Void.TYPE);
                return;
            }
            ClickInstrumentation.onClick(view);
            ((SingleWebView) this.f41005b.a((int) C0906R.id.eo)).reload();
            com.ss.android.ugc.aweme.crossplatform.params.base.a crossPlatformParams = this.f41005b.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                com.ss.android.ugc.aweme.crossplatform.params.d dVar = crossPlatformParams.f40808d;
                if (dVar != null && dVar.p) {
                    com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f41005b.f2995e;
                    if (fVar != null) {
                        fVar.e();
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000Y\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0002J\u001c\u0010\f\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\r\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J.\u0010\u0010\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0019\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0017J&\u0010\u001c\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\b\u0010\u0013\u001a\u0004\u0018\u00010\u001fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$initWebView$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "isWrong", "", "beforeNormalUrlLoading", "", "view", "Landroid/webkit/WebView;", "url", "", "getWebStatBusiness", "Lcom/ss/android/ugc/aweme/crossplatform/business/AdWebStatBusiness;", "onPageFinished", "onPageStarted", "favicon", "Landroid/graphics/Bitmap;", "onReceivedError", "request", "Landroid/webkit/WebResourceRequest;", "error", "Landroid/webkit/WebResourceError;", "errorCode", "", "description", "failingUrl", "onReceivedHttpError", "errorResponse", "Landroid/webkit/WebResourceResponse;", "onReceivedSslError", "handler", "Landroid/webkit/SslErrorHandler;", "Landroid/net/http/SslError;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements com.ss.android.ugc.aweme.crossplatform.platform.webview.c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41006a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41007b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f41008c;

        public final void a(@Nullable WebView webView, @Nullable String str, @Nullable Bitmap bitmap) {
            WebView webView2 = webView;
            String str2 = str;
            Bitmap bitmap2 = bitmap;
            if (PatchProxy.isSupport(new Object[]{webView2, str2, bitmap2}, this, f41006a, false, 34590, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView2, str2, bitmap2}, this, f41006a, false, 34590, new Class[]{WebView.class, String.class, Bitmap.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f41007b.f2995e;
            if (fVar != null) {
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c d2 = fVar.d();
                if (d2 != null) {
                    d2.a(webView2, str2, bitmap2);
                }
            }
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c customWebViewStatus = this.f41007b.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.a(webView2, str2, bitmap2);
            }
            this.f41008c = false;
            this.f41007b.f2993c = false;
            this.f41007b.getRegistry().a(e.a.LOAD_START);
            AdWebStatBusiness a2 = a();
            if (a2 != null) {
                a2.a(webView2, str2);
            }
        }

        private final AdWebStatBusiness a() {
            if (PatchProxy.isSupport(new Object[0], this, f41006a, false, 34597, new Class[0], AdWebStatBusiness.class)) {
                return (AdWebStatBusiness) PatchProxy.accessDispatch(new Object[0], this, f41006a, false, 34597, new Class[0], AdWebStatBusiness.class);
            }
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f41007b.f2995e;
            if (fVar != null) {
                j crossPlatformBusiness = fVar.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    return (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class);
                }
            }
            return null;
        }

        c(CrossPlatformWebView crossPlatformWebView) {
            this.f41007b = crossPlatformWebView;
        }

        public final void b(@Nullable WebView webView, @Nullable String str) {
            WebView webView2 = webView;
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{webView2, str2}, this, f41006a, false, 34596, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView2, str2}, this, f41006a, false, 34596, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            AdWebStatBusiness a2 = a();
            if (a2 != null) {
                a2.c(webView2, str2);
            }
        }

        public final void a(@Nullable WebView webView, @Nullable String str) {
            if (PatchProxy.isSupport(new Object[]{webView, str}, this, f41006a, false, 34595, new Class[]{WebView.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView, str}, this, f41006a, false, 34595, new Class[]{WebView.class, String.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f41007b.f2995e;
            if (fVar != null) {
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c d2 = fVar.d();
                if (d2 != null) {
                    d2.a(webView, str);
                }
            }
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c customWebViewStatus = this.f41007b.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.a(webView, str);
            }
            ((DmtStatusView) this.f41007b.a((int) C0906R.id.bjl)).b(false);
            if (!this.f41008c) {
                DmtStatusView dmtStatusView = (DmtStatusView) this.f41007b.a((int) C0906R.id.a_w);
                Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "error_view");
                dmtStatusView.setVisibility(8);
                this.f41007b.a((Integer) 0, "", str, true);
            }
            this.f41007b.f2993c = true;
            this.f41007b.getRegistry().a(e.a.LOAD_FINISH);
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar2 = this.f41007b.f2995e;
            if (fVar2 != null) {
                j crossPlatformBusiness = fVar2.getCrossPlatformBusiness();
                if (crossPlatformBusiness != null) {
                    XpathBusiness xpathBusiness = (XpathBusiness) crossPlatformBusiness.a(XpathBusiness.class);
                    if (xpathBusiness != null) {
                        xpathBusiness.a(this.f41007b.getCrossPlatformParams(), webView);
                    }
                }
            }
            AdWebStatBusiness a2 = a();
            if (a2 != null) {
                a2.b(webView, str);
            }
        }

        public final void a(@Nullable WebView webView, @Nullable SslErrorHandler sslErrorHandler, @Nullable SslError sslError) {
            WebView webView2 = webView;
            SslErrorHandler sslErrorHandler2 = sslErrorHandler;
            SslError sslError2 = sslError;
            if (PatchProxy.isSupport(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f41006a, false, 34592, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{webView2, sslErrorHandler2, sslError2}, this, f41006a, false, 34592, new Class[]{WebView.class, SslErrorHandler.class, SslError.class}, Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f41007b.f2995e;
            if (fVar != null) {
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c d2 = fVar.d();
                if (d2 != null) {
                    d2.a(webView2, sslErrorHandler2, sslError2);
                }
            }
            com.ss.android.ugc.aweme.crossplatform.platform.webview.c customWebViewStatus = this.f41007b.getCustomWebViewStatus();
            if (customWebViewStatus != null) {
                customWebViewStatus.a(webView2, sslErrorHandler2, sslError2);
            }
        }

        /* JADX WARNING: Code restructure failed: missing block: B:36:0x00c6, code lost:
            if (r2 == null) goto L_0x00c8;
         */
        /* JADX WARNING: Removed duplicated region for block: B:48:0x00eb  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00f0  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00fe  */
        /* JADX WARNING: Removed duplicated region for block: B:58:0x010e A[RETURN] */
        @android.annotation.TargetApi(23)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable android.webkit.WebView r16, @org.jetbrains.annotations.Nullable android.webkit.WebResourceRequest r17, @org.jetbrains.annotations.Nullable android.webkit.WebResourceError r18) {
            /*
                r15 = this;
                r7 = r15
                r8 = r16
                r9 = r17
                r10 = r18
                r11 = 3
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r12 = 0
                r0[r12] = r8
                r13 = 1
                r0[r13] = r9
                r14 = 2
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r12] = r1
                java.lang.Class<android.webkit.WebResourceRequest> r1 = android.webkit.WebResourceRequest.class
                r5[r13] = r1
                java.lang.Class<android.webkit.WebResourceError> r1 = android.webkit.WebResourceError.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 34593(0x8721, float:4.8475E-41)
                r1 = r15
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0053
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r12] = r8
                r0[r13] = r9
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                r3 = 0
                r4 = 34593(0x8721, float:4.8475E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r12] = r1
                java.lang.Class<android.webkit.WebResourceRequest> r1 = android.webkit.WebResourceRequest.class
                r5[r13] = r1
                java.lang.Class<android.webkit.WebResourceError> r1 = android.webkit.WebResourceError.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r15
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0053:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.activity.f r0 = r0.f2995e
                if (r0 == 0) goto L_0x0062
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.d()
                if (r0 == 0) goto L_0x0062
                r0.a((android.webkit.WebView) r8, (android.webkit.WebResourceRequest) r9, (android.webkit.WebResourceError) r10)
            L_0x0062:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x006d
                r0.a((android.webkit.WebView) r8, (android.webkit.WebResourceRequest) r9, (android.webkit.WebResourceError) r10)
            L_0x006d:
                r0 = 0
                if (r9 == 0) goto L_0x0079
                boolean r1 = r17.isForMainFrame()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                goto L_0x007a
            L_0x0079:
                r1 = r0
            L_0x007a:
                java.lang.Boolean r2 = java.lang.Boolean.TRUE
                boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                if (r2 == 0) goto L_0x008a
                r7.f41008c = r13
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r7.f41007b
                r1.f()
                goto L_0x00be
            L_0x008a:
                java.lang.Boolean r2 = java.lang.Boolean.FALSE
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
                if (r1 == 0) goto L_0x00be
                android.net.Uri r1 = r17.getUrl()
                if (r1 == 0) goto L_0x009d
                java.lang.String r1 = r1.getPath()
                goto L_0x009e
            L_0x009d:
                r1 = r0
            L_0x009e:
                if (r1 == 0) goto L_0x00bb
                android.net.Uri r1 = r17.getUrl()
                java.lang.String r2 = "request.url"
                kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
                java.lang.String r1 = r1.getPath()
                if (r1 != 0) goto L_0x00b2
                kotlin.jvm.internal.Intrinsics.throwNpe()
            L_0x00b2:
                java.lang.String r2 = "favicon.ico"
                boolean r1 = kotlin.text.StringsKt.endsWith$default(r1, r2, r12, r14, r0)
                if (r1 == 0) goto L_0x00bb
                return
            L_0x00bb:
                com.ss.android.sdk.activity.f.a((android.webkit.WebResourceRequest) r17, (android.webkit.WebResourceError) r18)
            L_0x00be:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r7.f41007b
                if (r8 == 0) goto L_0x00c8
                java.lang.String r2 = r16.getUrl()
                if (r2 != 0) goto L_0x00ca
            L_0x00c8:
                java.lang.String r2 = "null"
            L_0x00ca:
                r1.b((java.lang.String) r2)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r1 = r7.f41007b
                if (r10 == 0) goto L_0x00da
                int r2 = r18.getErrorCode()
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                goto L_0x00db
            L_0x00da:
                r2 = r0
            L_0x00db:
                if (r10 == 0) goto L_0x00e8
                java.lang.CharSequence r3 = r18.getDescription()
                if (r3 == 0) goto L_0x00e8
                java.lang.String r3 = r3.toString()
                goto L_0x00e9
            L_0x00e8:
                r3 = r0
            L_0x00e9:
                if (r9 == 0) goto L_0x00f0
                android.net.Uri r4 = r17.getUrl()
                goto L_0x00f1
            L_0x00f0:
                r4 = r0
            L_0x00f1:
                java.lang.String r4 = java.lang.String.valueOf(r4)
                r1.a((java.lang.Integer) r2, (java.lang.String) r3, (java.lang.String) r4, (boolean) r12)
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r1 = r15.a()
                if (r1 == 0) goto L_0x010e
                if (r10 == 0) goto L_0x010a
                java.lang.CharSequence r2 = r18.getDescription()
                if (r2 == 0) goto L_0x010a
                java.lang.String r0 = r2.toString()
            L_0x010a:
                r1.a((android.webkit.WebView) r8, (android.webkit.WebResourceRequest) r9, (java.lang.String) r0)
                return
            L_0x010e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.c.a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceError):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:21:0x0087  */
        @android.annotation.TargetApi(23)
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable android.webkit.WebView r16, @org.jetbrains.annotations.Nullable android.webkit.WebResourceRequest r17, @org.jetbrains.annotations.Nullable android.webkit.WebResourceResponse r18) {
            /*
                r15 = this;
                r7 = r15
                r8 = r16
                r9 = r17
                r10 = r18
                r11 = 3
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r12 = 0
                r0[r12] = r8
                r13 = 1
                r0[r13] = r9
                r14 = 2
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r12] = r1
                java.lang.Class<android.webkit.WebResourceRequest> r1 = android.webkit.WebResourceRequest.class
                r5[r13] = r1
                java.lang.Class<android.webkit.WebResourceResponse> r1 = android.webkit.WebResourceResponse.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 34591(0x871f, float:4.8472E-41)
                r1 = r15
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x0053
                java.lang.Object[] r0 = new java.lang.Object[r11]
                r0[r12] = r8
                r0[r13] = r9
                r0[r14] = r10
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                r3 = 0
                r4 = 34591(0x871f, float:4.8472E-41)
                java.lang.Class[] r5 = new java.lang.Class[r11]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r12] = r1
                java.lang.Class<android.webkit.WebResourceRequest> r1 = android.webkit.WebResourceRequest.class
                r5[r13] = r1
                java.lang.Class<android.webkit.WebResourceResponse> r1 = android.webkit.WebResourceResponse.class
                r5[r14] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r15
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x0053:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.activity.f r0 = r0.f2995e
                if (r0 == 0) goto L_0x0062
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.d()
                if (r0 == 0) goto L_0x0062
                r0.a((android.webkit.WebView) r8, (android.webkit.WebResourceRequest) r9, (android.webkit.WebResourceResponse) r10)
            L_0x0062:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x006d
                r0.a((android.webkit.WebView) r8, (android.webkit.WebResourceRequest) r9, (android.webkit.WebResourceResponse) r10)
            L_0x006d:
                com.ss.android.sdk.activity.f.a((android.webkit.WebResourceRequest) r17, (android.webkit.WebResourceResponse) r18)
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r15.a()
                if (r0 == 0) goto L_0x008f
                r1 = 0
                if (r9 == 0) goto L_0x0084
                android.net.Uri r2 = r17.getUrl()
                if (r2 == 0) goto L_0x0084
                java.lang.String r2 = r2.toString()
                goto L_0x0085
            L_0x0084:
                r2 = r1
            L_0x0085:
                if (r10 == 0) goto L_0x008b
                java.lang.String r1 = r18.getReasonPhrase()
            L_0x008b:
                r0.a((android.webkit.WebView) r8, (java.lang.String) r2, (java.lang.String) r1)
                return
            L_0x008f:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.c.a(android.webkit.WebView, android.webkit.WebResourceRequest, android.webkit.WebResourceResponse):void");
        }

        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00a7, code lost:
            if (r1 == null) goto L_0x00a9;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void a(@org.jetbrains.annotations.Nullable android.webkit.WebView r18, int r19, @org.jetbrains.annotations.Nullable java.lang.String r20, @org.jetbrains.annotations.Nullable java.lang.String r21) {
            /*
                r17 = this;
                r7 = r17
                r8 = r18
                r9 = r19
                r10 = r20
                r11 = r21
                r12 = 4
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r13 = 0
                r0[r13] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r14 = 1
                r0[r14] = r1
                r15 = 2
                r0[r15] = r10
                r16 = 3
                r0[r16] = r11
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r13] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r14] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r16] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r3 = 0
                r4 = 34594(0x8722, float:4.8477E-41)
                r1 = r17
                boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
                if (r0 == 0) goto L_0x006e
                java.lang.Object[] r0 = new java.lang.Object[r12]
                r0[r13] = r8
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r0[r14] = r1
                r0[r15] = r10
                r0[r16] = r11
                com.meituan.robust.ChangeQuickRedirect r2 = f41006a
                r3 = 0
                r4 = 34594(0x8722, float:4.8477E-41)
                java.lang.Class[] r5 = new java.lang.Class[r12]
                java.lang.Class<android.webkit.WebView> r1 = android.webkit.WebView.class
                r5[r13] = r1
                java.lang.Class r1 = java.lang.Integer.TYPE
                r5[r14] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r15] = r1
                java.lang.Class<java.lang.String> r1 = java.lang.String.class
                r5[r16] = r1
                java.lang.Class r6 = java.lang.Void.TYPE
                r1 = r17
                com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
                return
            L_0x006e:
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 23
                if (r0 < r1) goto L_0x0075
                return
            L_0x0075:
                com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness r0 = r17.a()
                if (r0 == 0) goto L_0x007e
                r0.a((android.webkit.WebView) r8, (java.lang.String) r11, (java.lang.String) r10)
            L_0x007e:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.activity.f r0 = r0.f2995e
                if (r0 == 0) goto L_0x008d
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.d()
                if (r0 == 0) goto L_0x008d
                r0.a(r8, r9, r10, r11)
            L_0x008d:
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                com.ss.android.ugc.aweme.crossplatform.platform.webview.c r0 = r0.getCustomWebViewStatus()
                if (r0 == 0) goto L_0x0098
                r0.a(r8, r9, r10, r11)
            L_0x0098:
                r7.f41008c = r14
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                r0.f()
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                if (r8 == 0) goto L_0x00a9
                java.lang.String r1 = r18.getUrl()
                if (r1 != 0) goto L_0x00ab
            L_0x00a9:
                java.lang.String r1 = "null"
            L_0x00ab:
                r0.b((java.lang.String) r1)
                com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView r0 = r7.f41007b
                java.lang.Integer r1 = java.lang.Integer.valueOf(r19)
                r0.a((java.lang.Integer) r1, (java.lang.String) r10, (java.lang.String) r11, (boolean) r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.c.a(android.webkit.WebView, int, java.lang.String, java.lang.String):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001c\u0010\u0006\u001a\u00020\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$initWebView$2", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "videoFrame", "Landroid/view/View;", "onHideCustomView", "", "onShowCustomView", "view", "callback", "Landroid/webkit/WebChromeClient$CustomViewCallback;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class d implements com.ss.android.ugc.aweme.crossplatform.platform.webview.d {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41009a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41010b;

        /* renamed from: c  reason: collision with root package name */
        private View f41011c;

        public final void a() {
            if (PatchProxy.isSupport(new Object[0], this, f41009a, false, 34599, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f41009a, false, 34599, new Class[0], Void.TYPE);
                return;
            }
            this.f41011c = null;
            this.f41010b.removeView(this.f41011c);
            com.ss.android.ugc.aweme.crossplatform.platform.webview.b iFullScreen = this.f41010b.getIFullScreen();
            if (iFullScreen != null) {
                iFullScreen.b();
            }
        }

        d(CrossPlatformWebView crossPlatformWebView) {
            this.f41010b = crossPlatformWebView;
        }

        public final void a(@Nullable View view, @Nullable WebChromeClient.CustomViewCallback customViewCallback) {
            if (PatchProxy.isSupport(new Object[]{view, customViewCallback}, this, f41009a, false, 34598, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{view, customViewCallback}, this, f41009a, false, 34598, new Class[]{View.class, WebChromeClient.CustomViewCallback.class}, Void.TYPE);
                return;
            }
            BaseAppData a2 = BaseAppData.a();
            Intrinsics.checkExpressionValueIsNotNull(a2, "BaseAppData.inst()");
            if (a2.l) {
                this.f41011c = view;
                this.f41010b.addView(this.f41011c);
                com.ss.android.ugc.aweme.crossplatform.platform.webview.b iFullScreen = this.f41010b.getIFullScreen();
                if (iFullScreen != null) {
                    iFullScreen.a();
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u00020\u00032\n\u0010\u0004\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$loadWithSchemaInfo$1", "Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper$PrepareContextCallback;", "onFail", "", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "onSuccess", "manager", "Lcom/facebook/react/ReactInstanceManager;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class e implements e.b {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41012a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41013b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ com.ss.android.ugc.aweme.crossplatform.params.base.a f41014c;

        public final void a(@NotNull Exception exc) {
            String str;
            if (PatchProxy.isSupport(new Object[]{exc}, this, f41012a, false, 34601, new Class[]{Exception.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc}, this, f41012a, false, 34601, new Class[]{Exception.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(exc, "e");
            com.ss.android.ugc.aweme.fe.b.e.f44417b.a("warning", exc);
            CrossPlatformWebView crossPlatformWebView = this.f41013b;
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.f41013b.g;
            if (aVar != null) {
                com.ss.android.ugc.aweme.crossplatform.params.c cVar = aVar.f40807c;
                if (cVar != null) {
                    str = cVar.h;
                    crossPlatformWebView.d(str);
                }
            }
            str = null;
            crossPlatformWebView.d(str);
        }

        public final void a(@NotNull ReactInstanceManager reactInstanceManager) {
            com.ss.android.ugc.aweme.crossplatform.params.c cVar;
            String str;
            String str2;
            if (PatchProxy.isSupport(new Object[]{reactInstanceManager}, this, f41012a, false, 34600, new Class[]{ReactInstanceManager.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{reactInstanceManager}, this, f41012a, false, 34600, new Class[]{ReactInstanceManager.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(reactInstanceManager, "manager");
            String str3 = null;
            if (com.ss.android.ugc.aweme.g.a.a()) {
                StringBuilder sb = new StringBuilder("rn_schema:");
                com.ss.android.ugc.aweme.crossplatform.params.c cVar2 = this.f41014c.f40807c;
                if (cVar2 != null) {
                    str2 = cVar2.k;
                } else {
                    str2 = null;
                }
                sb.append(str2);
            }
            this.f41013b.setReactInstanceManager(reactInstanceManager);
            com.ss.android.ugc.aweme.fe.b.e eVar = com.ss.android.ugc.aweme.fe.b.e.f44417b;
            long elapsedRealtime = SystemClock.elapsedRealtime() - this.f41013b.f2996f;
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.f41013b.g;
            if (aVar != null) {
                cVar = aVar.f40807c;
            } else {
                cVar = null;
            }
            eVar.a("time_prepare_context", elapsedRealtime, cVar);
            Activity activity = this.f41013b.getActivity();
            if (activity != null) {
                this.f41013b.b(activity);
            }
            CrossPlatformWebView crossPlatformWebView = this.f41013b;
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2 = this.f41013b.g;
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.crossplatform.params.c cVar3 = aVar2.f40807c;
            if (cVar3 != null) {
                str = cVar3.f40821f;
            } else {
                str = null;
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            com.ss.android.ugc.aweme.crossplatform.params.c cVar4 = this.f41014c.f40807c;
            if (cVar4 != null) {
                str3 = cVar4.k;
            }
            if (str3 == null) {
                Intrinsics.throwNpe();
            }
            crossPlatformWebView.a(reactInstanceManager, str, str3);
            if (!ReactInstance.isDev) {
                ReactInstance.rePrepareReactContext();
            }
        }

        e(CrossPlatformWebView crossPlatformWebView, com.ss.android.ugc.aweme.crossplatform.params.base.a aVar) {
            this.f41013b = crossPlatformWebView;
            this.f41014c = aVar;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/crossplatform/platform/rn/RnContextBuildHelper;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class f extends Lambda implements Function0<com.ss.android.ugc.aweme.crossplatform.platform.rn.e> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        f(Context context) {
            super(0);
            this.$context = context;
        }

        @NotNull
        public final com.ss.android.ugc.aweme.crossplatform.platform.rn.e invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34602, new Class[0], com.ss.android.ugc.aweme.crossplatform.platform.rn.e.class)) {
                return new com.ss.android.ugc.aweme.crossplatform.platform.rn.e(this.$context);
            }
            return (com.ss.android.ugc.aweme.crossplatform.platform.rn.e) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34602, new Class[0], com.ss.android.ugc.aweme.crossplatform.platform.rn.e.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0016J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$rnViewWrap$1", "Lcom/ss/android/ugc/aweme/crossplatform/view/RnViewWrap;", "getModuleName", "", "getReactRootView", "Lcom/facebook/react/ReactRootView;", "loadRn", "", "crossPlatformParams", "Lcom/ss/android/ugc/aweme/crossplatform/params/base/CrossPlatformParams;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class g implements c {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41015a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41016b;

        @Nullable
        public final ReactRootView a() {
            if (!PatchProxy.isSupport(new Object[0], this, f41015a, false, 34603, new Class[0], ReactRootView.class)) {
                return this.f41016b.getReactRootView();
            }
            return (ReactRootView) PatchProxy.accessDispatch(new Object[0], this, f41015a, false, 34603, new Class[0], ReactRootView.class);
        }

        g(CrossPlatformWebView crossPlatformWebView) {
            this.f41016b = crossPlatformWebView;
        }

        public final void a(@Nullable com.ss.android.ugc.aweme.crossplatform.params.base.a aVar) {
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2 = aVar;
            if (PatchProxy.isSupport(new Object[]{aVar2}, this, f41015a, false, 34604, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{aVar2}, this, f41015a, false, 34604, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE);
                return;
            }
            if (aVar2 != null) {
                this.f41016b.a(aVar2);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/view/CrossPlatformWebView$webViewWrap$1", "Lcom/ss/android/ugc/aweme/crossplatform/view/WebViewWrap;", "getBaseJsMessageHandler", "Lcom/ss/android/sdk/webview/IJsMsgHandler;", "getWebView", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "loadWeb", "", "url", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class h implements h {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f41017a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ CrossPlatformWebView f41018b;

        @NotNull
        public final com.ss.android.sdk.c.f a() {
            if (!PatchProxy.isSupport(new Object[0], this, f41017a, false, 34606, new Class[0], com.ss.android.sdk.c.f.class)) {
                return ((SingleWebView) this.f41018b.a((int) C0906R.id.eo)).getBaseJsMessageHandler();
            }
            return (com.ss.android.sdk.c.f) PatchProxy.accessDispatch(new Object[0], this, f41017a, false, 34606, new Class[0], com.ss.android.sdk.c.f.class);
        }

        @NotNull
        public final SingleWebView b() {
            if (PatchProxy.isSupport(new Object[0], this, f41017a, false, 34607, new Class[0], SingleWebView.class)) {
                return (SingleWebView) PatchProxy.accessDispatch(new Object[0], this, f41017a, false, 34607, new Class[0], SingleWebView.class);
            }
            SingleWebView singleWebView = (SingleWebView) this.f41018b.a((int) C0906R.id.eo);
            Intrinsics.checkExpressionValueIsNotNull(singleWebView, "this@CrossPlatformWebView.ame_rn_web_container");
            return singleWebView;
        }

        h(CrossPlatformWebView crossPlatformWebView) {
            this.f41018b = crossPlatformWebView;
        }

        public final void a(@Nullable String str) {
            String str2 = str;
            if (PatchProxy.isSupport(new Object[]{str2}, this, f41017a, false, 34605, new Class[]{String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{str2}, this, f41017a, false, 34605, new Class[]{String.class}, Void.TYPE);
                return;
            }
            if (str2 != null) {
                this.f41018b.b(str2, false);
            }
        }
    }

    @JvmOverloads
    public CrossPlatformWebView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public CrossPlatformWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final com.ss.android.ugc.aweme.crossplatform.platform.rn.e getRnContextBuildHelper() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34560, new Class[0], com.ss.android.ugc.aweme.crossplatform.platform.rn.e.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34560, new Class[0], com.ss.android.ugc.aweme.crossplatform.platform.rn.e.class);
        } else {
            value = this.t.getValue();
        }
        return (com.ss.android.ugc.aweme.crossplatform.platform.rn.e) value;
    }

    public final View a(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2991a, false, 34587, new Class[]{Integer.TYPE}, View.class)) {
            return (View) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2991a, false, 34587, new Class[]{Integer.TYPE}, View.class);
        }
        if (this.x == null) {
            this.x = new HashMap();
        }
        View view = (View) this.x.get(Integer.valueOf(i2));
        if (view == null) {
            view = findViewById(i2);
            this.x.put(Integer.valueOf(i2), view);
        }
        return view;
    }

    @JvmOverloads
    public final void c(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f2991a, false, 34580, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f2991a, false, 34580, new Class[]{String.class}, Void.TYPE);
            return;
        }
        b(str2, false);
    }

    public final int getCurrentMode() {
        return this.l;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.crossplatform.platform.webview.c getCustomWebViewStatus() {
        return this.m;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.crossplatform.platform.webview.b getIFullScreen() {
        return this.k;
    }

    @Nullable
    public final ReactInstanceManager getReactInstanceManager() {
        return this.n;
    }

    @Nullable
    public final ReactRootView getReactRootView() {
        return this.o;
    }

    @NotNull
    public final e getRegistry() {
        return this.h;
    }

    @NotNull
    public final e getViewStatusRegistry() {
        return this.h;
    }

    public final boolean a(@Nullable String str) {
        String str2 = str;
        if (!PatchProxy.isSupport(new Object[]{str2}, this, f2991a, false, 34556, new Class[]{String.class}, Boolean.TYPE)) {
            return Intrinsics.areEqual((Object) getReactId(), (Object) str2);
        }
        return ((Boolean) PatchProxy.accessDispatch(new Object[]{str2}, this, f2991a, false, 34556, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
    }

    public final void a(boolean z) {
        if (PatchProxy.isSupport(new Object[]{Byte.valueOf(z ? (byte) 1 : 0)}, this, f2991a, false, 34558, new Class[]{Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Byte.valueOf(z)}, this, f2991a, false, 34558, new Class[]{Boolean.TYPE}, Void.TYPE);
            return;
        }
        Context activity = getActivity();
        Activity activity2 = getActivity();
        com.ss.android.ugc.aweme.framework.f.a.a(activity, activity2 != null ? activity2.getWindow() : null, z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00f3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Integer r18, java.lang.String r19, java.lang.String r20, boolean r21) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            r11 = r21
            r12 = 4
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r13 = 0
            r0[r13] = r8
            r14 = 1
            r0[r14] = r9
            r15 = 2
            r0[r15] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r16 = 3
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34563(0x8703, float:4.8433E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x006e
            java.lang.Object[] r0 = new java.lang.Object[r12]
            r0[r13] = r8
            r0[r14] = r9
            r0[r15] = r10
            java.lang.Byte r1 = java.lang.Byte.valueOf(r21)
            r0[r16] = r1
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            r3 = 0
            r4 = 34563(0x8703, float:4.8433E-41)
            java.lang.Class[] r5 = new java.lang.Class[r12]
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            r5[r13] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r14] = r1
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r15] = r1
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r5[r16] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x006e:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "errorCode"
            r7.a((org.json.JSONObject) r0, (java.lang.String) r1, (java.lang.Object) r8)
            r1 = r9
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x0086
            java.lang.String r1 = "errorDesc"
            r7.a((org.json.JSONObject) r0, (java.lang.String) r1, (java.lang.Object) r9)
        L_0x0086:
            r1 = r10
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00af
            android.net.Uri r1 = android.net.Uri.parse(r20)
            java.lang.String r2 = "url"
            r7.a((org.json.JSONObject) r0, (java.lang.String) r2, (java.lang.Object) r10)
            java.lang.String r2 = "host"
            java.lang.String r3 = "url"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r3)
            java.lang.String r3 = r1.getHost()
            r7.a((org.json.JSONObject) r0, (java.lang.String) r2, (java.lang.Object) r3)
            java.lang.String r2 = "path"
            java.lang.String r1 = r1.getPath()
            r7.a((org.json.JSONObject) r0, (java.lang.String) r2, (java.lang.Object) r1)
        L_0x00af:
            com.ss.android.ugc.aweme.crossplatform.params.base.a r1 = r17.getCrossPlatformParams()
            r2 = 0
            if (r1 == 0) goto L_0x00be
            com.ss.android.ugc.aweme.crossplatform.params.b r1 = r1.f40806b
            if (r1 == 0) goto L_0x00be
            long r4 = r1.f40800b
            goto L_0x00bf
        L_0x00be:
            r4 = r2
        L_0x00bf:
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00ff
            java.lang.String r1 = "creativeId"
            com.ss.android.ugc.aweme.crossplatform.params.base.a r4 = r17.getCrossPlatformParams()
            if (r4 == 0) goto L_0x00d6
            com.ss.android.ugc.aweme.crossplatform.params.b r4 = r4.f40806b
            if (r4 == 0) goto L_0x00d6
            long r4 = r4.f40800b
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            goto L_0x00d7
        L_0x00d6:
            r4 = 0
        L_0x00d7:
            r7.a((org.json.JSONObject) r0, (java.lang.String) r1, (java.lang.Object) r4)
            if (r11 == 0) goto L_0x00f3
            long r4 = r7.w
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x00f8
            java.lang.String r1 = "duration"
            long r2 = android.os.SystemClock.elapsedRealtime()
            long r4 = r7.w
            long r2 = r2 - r4
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r7.a((org.json.JSONObject) r0, (java.lang.String) r1, (java.lang.Object) r2)
            goto L_0x00f8
        L_0x00f3:
            java.lang.String r1 = "aweme_ad_landingpage_open_error"
            com.ss.android.ugc.aweme.base.n.a((java.lang.String) r1, (int) r14, (org.json.JSONObject) r0)
        L_0x00f8:
            java.lang.String r1 = "aweme_ad_landingpage_open_error_rate"
            r2 = r11 ^ 1
            com.ss.android.ugc.aweme.base.n.a((java.lang.String) r1, (int) r2, (org.json.JSONObject) r0)
        L_0x00ff:
            com.ss.android.sdk.activity.f.a((org.json.JSONObject) r0, (boolean) r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.a(java.lang.Integer, java.lang.String, java.lang.String, boolean):void");
    }

    public final void a(@NotNull String str, @Nullable JSONObject jSONObject, @Nullable String str2) {
        String str3 = str;
        JSONObject jSONObject2 = jSONObject;
        String str4 = str2;
        boolean z = false;
        if (PatchProxy.isSupport(new Object[]{str3, jSONObject2, str4}, this, f2991a, false, 34573, new Class[]{String.class, JSONObject.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, jSONObject2, str4}, this, f2991a, false, 34573, new Class[]{String.class, JSONObject.class, String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str3, "event");
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("eventName", str3);
        CharSequence charSequence = str4;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        }
        if (!z) {
            jSONObject3.put("reactId", str4);
        }
        jSONObject3.put("data", jSONObject2);
        a("notification", jSONObject3);
        b("notification", jSONObject3);
    }

    public final void a(@NotNull com.ss.android.ugc.aweme.crossplatform.params.base.a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2991a, false, 34576, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2991a, false, 34576, new Class[]{com.ss.android.ugc.aweme.crossplatform.params.base.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "crossPlatformParams");
        this.q = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a();
        com.ss.android.ugc.aweme.crossplatform.a a2 = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a();
        com.ss.android.ugc.aweme.hybrid.monitor.f fVar = this.q;
        a2.f40659b = fVar != null ? fVar.a() : null;
        com.ss.android.ugc.aweme.crossplatform.params.c cVar = aVar.f40807c;
        if (cVar != null) {
            String reactId = getReactId();
            if (reactId == null) {
                Intrinsics.throwNpe();
            }
            cVar.b(reactId);
            q qVar = q.f49996b;
            String a3 = cVar.a();
            if (a3 == null) {
                a3 = "";
            }
            String str = cVar.f40821f;
            if (str == null) {
                str = "";
            }
            Uri a4 = qVar.a(a3, str);
            com.ss.android.ugc.aweme.hybrid.monitor.f fVar2 = this.q;
            if (fVar2 != null) {
                if (!fVar2.f49969c) {
                    fVar2 = null;
                }
                if (fVar2 != null) {
                    fVar2.a(a4);
                }
            }
        }
        b(aVar);
    }

    public final void a(@NotNull String str, boolean z, boolean z2) {
        String str2 = str;
        boolean z3 = false;
        if (PatchProxy.isSupport(new Object[]{str2, (byte) 0, (byte) 1}, this, f2991a, false, 34577, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, (byte) 0, (byte) 1}, this, f2991a, false, 34577, new Class[]{String.class, Boolean.TYPE, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        Uri parse = Uri.parse(str);
        CharSequence queryParameter = parse.getQueryParameter("rn_schema");
        if (!(queryParameter == null || queryParameter.length() == 0)) {
            a(str, false);
            return;
        }
        Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
        if (Intrinsics.areEqual((Object) parse.getScheme(), (Object) "http") || Intrinsics.areEqual((Object) parse.getScheme(), (Object) "https")) {
            b(str, true);
            return;
        }
        CharSequence queryParameter2 = parse.getQueryParameter(PushConstants.WEB_URL);
        if (queryParameter2 == null || queryParameter2.length() == 0) {
            z3 = true;
        }
        if (!z3) {
            String queryParameter3 = parse.getQueryParameter(PushConstants.WEB_URL);
            if (queryParameter3 == null) {
                Intrinsics.throwNpe();
            }
            b(queryParameter3, true);
        } else if (com.ss.android.ugc.aweme.g.a.a()) {
            throw new IllegalArgumentException(str + " is invalid");
        }
    }

    public final void a(@NotNull String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2991a, false, 34578, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f2991a, false, 34578, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        if (z || !Intrinsics.areEqual((Object) this.s, (Object) str)) {
            this.s = str;
            this.q = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a();
            com.ss.android.ugc.aweme.crossplatform.a a2 = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a();
            com.ss.android.ugc.aweme.hybrid.monitor.f fVar = this.q;
            com.ss.android.ugc.aweme.hybrid.monitor.f fVar2 = null;
            a2.f40659b = fVar != null ? fVar.a() : null;
            com.ss.android.ugc.aweme.crossplatform.params.base.a a3 = a.C0525a.a(str, getReactId());
            Intrinsics.checkExpressionValueIsNotNull(a3, "CrossPlatformParams.Fact…eByUrlForRn(url, reactId)");
            com.ss.android.ugc.aweme.crossplatform.params.c cVar = a3.f40807c;
            if (cVar != null) {
                q qVar = q.f49996b;
                String a4 = cVar.a();
                if (a4 == null) {
                    a4 = "";
                }
                String str2 = cVar.f40821f;
                if (str2 == null) {
                    str2 = "";
                }
                Uri a5 = qVar.a(a4, str2);
                com.ss.android.ugc.aweme.hybrid.monitor.f fVar3 = this.q;
                if (fVar3 != null) {
                    if (fVar3.f49969c) {
                        fVar2 = fVar3;
                    }
                    if (fVar2 != null) {
                        fVar2.a(a5);
                    }
                }
            }
            b(a3);
        }
    }

    public final void a(ReactInstanceManager reactInstanceManager, String str, String str2) {
        ReactInstanceManager reactInstanceManager2 = reactInstanceManager;
        String str3 = str;
        if (PatchProxy.isSupport(new Object[]{reactInstanceManager2, str3, str2}, this, f2991a, false, 34582, new Class[]{ReactInstanceManager.class, String.class, String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{reactInstanceManager2, str3, str2}, this, f2991a, false, 34582, new Class[]{ReactInstanceManager.class, String.class, String.class}, Void.TYPE);
            return;
        }
        this.p = SystemClock.elapsedRealtime();
        ReactRootView reactRootView = this.o;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
        }
        ((FrameLayout) a((int) C0906R.id.cad)).removeAllViews();
        this.o = new ReactRootView(getContext());
        if (reactInstanceManager.getCurrentReactContext() != null) {
            com.ss.android.ugc.aweme.fe.registry.rn.b bVar = this.v;
            if (bVar != null) {
                bVar.a();
            }
            this.v = new com.ss.android.ugc.aweme.fe.registry.rn.b(reactInstanceManager.getCurrentReactContext());
            com.ss.android.ugc.aweme.fe.registry.rn.b bVar2 = this.v;
            if (bVar2 != null) {
                bVar2.a(getContext());
            }
        } else {
            com.ss.android.ugc.aweme.fe.b.e eVar = com.ss.android.ugc.aweme.fe.b.e.f44417b;
            Exception exc = new Exception("RNBridgeRegistry addMethod error due to reactContext is null");
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.g;
            com.ss.android.ugc.aweme.crossplatform.params.c cVar = null;
            com.ss.android.ugc.aweme.crossplatform.params.c cVar2 = aVar != null ? aVar.f40807c : null;
            if (cVar2 == null) {
                Intrinsics.throwNpe();
            }
            String a2 = cVar2.a();
            com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2 = this.g;
            if (aVar2 != null) {
                cVar = aVar2.f40807c;
            }
            if (cVar == null) {
                Intrinsics.throwNpe();
            }
            String str4 = cVar.f40821f;
            if (PatchProxy.isSupport(new Object[]{exc, a2, str4}, eVar, com.ss.android.ugc.aweme.fe.b.e.f44416a, false, 39907, new Class[]{Exception.class, String.class, String.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{exc, a2, str4}, eVar, com.ss.android.ugc.aweme.fe.b.e.f44416a, false, 39907, new Class[]{Exception.class, String.class, String.class}, Void.TYPE);
            } else {
                eVar.a("error", exc, null, a2, str4);
            }
        }
        ((FrameLayout) a((int) C0906R.id.cad)).addView(this.o, -1, -1);
        FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.cad);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "react_root_view");
        frameLayout.setVisibility(0);
        ReactRootView reactRootView2 = this.o;
        if (reactRootView2 != null) {
            Bundle bundle = new Bundle();
            Uri parse = Uri.parse(str2);
            Intrinsics.checkExpressionValueIsNotNull(parse, "uri");
            Set<String> queryParameterNames = parse.getQueryParameterNames();
            Intrinsics.checkExpressionValueIsNotNull(queryParameterNames, "uri.queryParameterNames");
            for (String str5 : queryParameterNames) {
                bundle.putString(str5, parse.getQueryParameter(str5));
            }
            bundle.putString("reactId", getReactId());
            reactRootView2.startReactApplication(reactInstanceManager2, str3, bundle);
        }
    }

    @Nullable
    public final String getModuleName() {
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.g;
        if (aVar != null) {
            com.ss.android.ugc.aweme.crossplatform.params.c cVar = aVar.f40807c;
            if (cVar != null) {
                return cVar.f40821f;
            }
        }
        return null;
    }

    public final boolean a() {
        if (this.l == 2) {
            return true;
        }
        return this.f2993c;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.crossplatform.params.base.a getCrossPlatformParams() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34547, new Class[0], com.ss.android.ugc.aweme.crossplatform.params.base.a.class)) {
            return (com.ss.android.ugc.aweme.crossplatform.params.base.a) PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34547, new Class[0], com.ss.android.ugc.aweme.crossplatform.params.base.a.class);
        } else if (this.f2995e == null) {
            return this.g;
        } else {
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f2995e;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            return fVar.getCrossPlatformParams();
        }
    }

    @Nullable
    public final String getReactId() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34557, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34557, new Class[0], String.class);
        }
        com.ss.android.ugc.aweme.hybrid.monitor.f fVar = this.q;
        if (fVar != null) {
            return fVar.a();
        }
        return null;
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34554, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34554, new Class[0], Void.TYPE);
            return;
        }
        Context context = getContext();
        if (!(context instanceof Activity)) {
            context = null;
        }
        if (context == null) {
            return;
        }
        if (context != null) {
            ((Activity) context).finish();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }

    public final void f() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34585, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34585, new Class[0], Void.TYPE);
            return;
        }
        ((DmtStatusView) a((int) C0906R.id.bjl)).b(false);
        ((DmtStatusView) a((int) C0906R.id.a_w)).a(false);
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.a_w);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "error_view");
        dmtStatusView.setVisibility(0);
    }

    @Nullable
    public final Activity getActivity() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34553, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34553, new Class[0], Activity.class);
        }
        Context context = getContext();
        Intrinsics.checkExpressionValueIsNotNull(context, "context");
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
            Intrinsics.checkExpressionValueIsNotNull(context, "context.baseContext");
        }
        return null;
    }

    @NotNull
    public final j getCrossPlatformBusiness() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34546, new Class[0], j.class)) {
            return (j) PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34546, new Class[0], j.class);
        } else if (this.f2995e != null) {
            com.ss.android.ugc.aweme.crossplatform.activity.f fVar = this.f2995e;
            if (fVar == null) {
                Intrinsics.throwNpe();
            }
            j crossPlatformBusiness = fVar.getCrossPlatformBusiness();
            Intrinsics.checkExpressionValueIsNotNull(crossPlatformBusiness, "iCrossPlatformActivityCo…r!!.crossPlatformBusiness");
            return crossPlatformBusiness;
        } else {
            if (this.r == null) {
                this.r = j.a.a(this);
            }
            j jVar = this.r;
            if (jVar == null) {
                Intrinsics.throwNpe();
            }
            return jVar;
        }
    }

    @Nullable
    public final String getCurrentUrl() {
        String str;
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34550, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34550, new Class[0], String.class);
        }
        String str2 = this.s;
        if (str2 == null) {
            str2 = "";
        }
        if (StringsKt.contains((CharSequence) str2, (CharSequence) "wallet/home", false)) {
            return this.s;
        }
        if (this.l == 2) {
            str = this.s;
            if (str == null) {
                com.ss.android.ugc.aweme.crossplatform.params.base.a crossPlatformParams = getCrossPlatformParams();
                if (crossPlatformParams != null) {
                    com.ss.android.ugc.aweme.crossplatform.params.c cVar = crossPlatformParams.f40807c;
                    if (cVar != null) {
                        str = cVar.k;
                    }
                }
                str = null;
            }
            if (str == null) {
                return "";
            }
        } else {
            SingleWebView singleWebView = (SingleWebView) a((int) C0906R.id.eo);
            Intrinsics.checkExpressionValueIsNotNull(singleWebView, "ame_rn_web_container");
            str = singleWebView.getUrl();
            if (str == null) {
                str = "";
            }
        }
        return str;
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34586, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34586, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        e eVar = this.h;
        if (PatchProxy.isSupport(new Object[0], eVar, e.f41028a, false, 34617, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], eVar, e.f41028a, false, 34617, new Class[0], Void.TYPE);
            return;
        }
        eVar.f41029b.clear();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0051  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean c() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f2991a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Boolean.TYPE
            r4 = 0
            r5 = 34549(0x86f5, float:4.8413E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x002c
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f2991a
            r5 = 0
            r6 = 34549(0x86f5, float:4.8413E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Boolean.TYPE
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x002c:
            int r1 = r9.l
            r2 = 2
            r3 = 1
            if (r1 != r2) goto L_0x006c
            com.facebook.react.ReactRootView r1 = r9.o
            r2 = 0
            if (r1 == 0) goto L_0x003c
            com.facebook.react.ReactInstanceManager r1 = r1.getReactInstanceManager()
            goto L_0x003d
        L_0x003c:
            r1 = r2
        L_0x003d:
            if (r1 == 0) goto L_0x0055
            com.facebook.react.ReactRootView r1 = r9.o
            if (r1 == 0) goto L_0x004e
            com.facebook.react.ReactInstanceManager r1 = r1.getReactInstanceManager()
            if (r1 == 0) goto L_0x004e
            com.facebook.react.bridge.ReactContext r1 = r1.getCurrentReactContext()
            goto L_0x004f
        L_0x004e:
            r1 = r2
        L_0x004f:
            if (r1 == 0) goto L_0x0055
            com.facebook.react.bridge.CatalystInstance r2 = r1.getCatalystInstance()
        L_0x0055:
            if (r2 == 0) goto L_0x006b
            boolean r1 = r2.isDestroyed()
            if (r1 != 0) goto L_0x006b
            com.facebook.react.ReactRootView r0 = r9.o
            if (r0 == 0) goto L_0x006a
            com.facebook.react.ReactInstanceManager r0 = r0.getReactInstanceManager()
            if (r0 == 0) goto L_0x006a
            r0.onBackPressed()
        L_0x006a:
            return r3
        L_0x006b:
            return r0
        L_0x006c:
            r1 = 2131165382(0x7f0700c6, float:1.794498E38)
            android.view.View r2 = r9.a((int) r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r2 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r2
            boolean r2 = r2.canGoBack()
            if (r2 == 0) goto L_0x0085
            android.view.View r0 = r9.a((int) r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r0
            r0.goBack()
            return r3
        L_0x0085:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.c():boolean");
    }

    public final void e() {
        com.ss.android.ugc.aweme.crossplatform.params.c cVar;
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34559, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34559, new Class[0], Void.TYPE);
            return;
        }
        FrameLayout frameLayout = (FrameLayout) a((int) C0906R.id.cad);
        Intrinsics.checkExpressionValueIsNotNull(frameLayout, "react_root_view");
        frameLayout.setVisibility(0);
        SingleWebView singleWebView = (SingleWebView) a((int) C0906R.id.eo);
        Intrinsics.checkExpressionValueIsNotNull(singleWebView, "ame_rn_web_container");
        singleWebView.setVisibility(8);
        ((DmtStatusView) a((int) C0906R.id.bjl)).b(false);
        com.ss.android.ugc.aweme.fe.b.e eVar = com.ss.android.ugc.aweme.fe.b.e.f44417b;
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.p;
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.g;
        com.ss.android.ugc.aweme.crossplatform.params.c cVar2 = null;
        if (aVar != null) {
            cVar = aVar.f40807c;
        } else {
            cVar = null;
        }
        eVar.a("time_js_loading", elapsedRealtime, cVar);
        com.ss.android.ugc.aweme.fe.b.e eVar2 = com.ss.android.ugc.aweme.fe.b.e.f44417b;
        long elapsedRealtime2 = SystemClock.elapsedRealtime() - this.f2996f;
        com.ss.android.ugc.aweme.crossplatform.params.base.a aVar2 = this.g;
        if (aVar2 != null) {
            cVar2 = aVar2.f40807c;
        }
        eVar2.a("time_all", elapsedRealtime2, cVar2);
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34551, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34551, new Class[0], Void.TYPE);
        } else if (this.l == 2) {
            String str = this.s;
            if (str == null) {
                com.ss.android.ugc.aweme.crossplatform.params.base.a aVar = this.g;
                if (aVar == null) {
                    Intrinsics.throwNpe();
                }
                a(aVar);
            }
            if (str == null) {
                Intrinsics.throwNpe();
            }
            a(str, true);
        } else {
            ((SingleWebView) a((int) C0906R.id.eo)).reload();
        }
    }

    public final void setCurrentMode(int i2) {
        this.l = i2;
    }

    public final void setCustomWebViewStatus(@Nullable com.ss.android.ugc.aweme.crossplatform.platform.webview.c cVar) {
        this.m = cVar;
    }

    public final void setIFullScreen(@Nullable com.ss.android.ugc.aweme.crossplatform.platform.webview.b bVar) {
        this.k = bVar;
    }

    public final void setReactInstanceManager(@Nullable ReactInstanceManager reactInstanceManager) {
        this.n = reactInstanceManager;
    }

    public final void setReactRootView(@Nullable ReactRootView reactRootView) {
        this.o = reactRootView;
    }

    public final void setDefaultHardwareBackBtnHandler(@NotNull DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler) {
        DefaultHardwareBackBtnHandler defaultHardwareBackBtnHandler2 = defaultHardwareBackBtnHandler;
        if (PatchProxy.isSupport(new Object[]{defaultHardwareBackBtnHandler2}, this, f2991a, false, 34566, new Class[]{DefaultHardwareBackBtnHandler.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{defaultHardwareBackBtnHandler2}, this, f2991a, false, 34566, new Class[]{DefaultHardwareBackBtnHandler.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(defaultHardwareBackBtnHandler2, "defaultBackButtonImpl");
        this.u = defaultHardwareBackBtnHandler2;
    }

    public final void setFullScreen(@NotNull com.ss.android.ugc.aweme.crossplatform.platform.webview.b bVar) {
        com.ss.android.ugc.aweme.crossplatform.platform.webview.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2}, this, f2991a, false, 34548, new Class[]{com.ss.android.ugc.aweme.crossplatform.platform.webview.b.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2}, this, f2991a, false, 34548, new Class[]{com.ss.android.ugc.aweme.crossplatform.platform.webview.b.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "iFullScreen");
        this.k = bVar2;
    }

    public final void c(@NotNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f2991a, false, 34569, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f2991a, false, 34569, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        ReactInstanceManager reactInstanceManager = this.n;
        if (reactInstanceManager != null) {
            reactInstanceManager.onHostPause(activity);
        }
        a("viewDisappeared", (JSONObject) null);
        ((SingleWebView) a((int) C0906R.id.eo)).c();
        e("onPause");
    }

    @Subscribe(a = ThreadMode.MAIN)
    public final void onJsBroadcastEvent(@NotNull BroadcastMethod.a aVar) {
        BroadcastMethod.a aVar2 = aVar;
        if (PatchProxy.isSupport(new Object[]{aVar2}, this, f2991a, false, 34570, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar2}, this, f2991a, false, 34570, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar2, "broadCastEvent");
        String str = aVar2.f44431a;
        JSONObject jSONObject = aVar2.f44432b;
        Intrinsics.checkExpressionValueIsNotNull(str, "event");
        a(str, jSONObject);
    }

    public final void setCrossPlatformActivityContainer(@NotNull com.ss.android.ugc.aweme.crossplatform.activity.f fVar) {
        if (PatchProxy.isSupport(new Object[]{fVar}, this, f2991a, false, 34552, new Class[]{com.ss.android.ugc.aweme.crossplatform.activity.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar}, this, f2991a, false, 34552, new Class[]{com.ss.android.ugc.aweme.crossplatform.activity.f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar, "iCrossPlatformActivityContainer");
        this.f2995e = fVar;
        ((SingleWebView) a((int) C0906R.id.eo)).setCrossPlatformActivityContainer(fVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34584(0x8718, float:4.8463E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            r3 = 0
            r4 = 34584(0x8718, float:4.8463E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            java.lang.String r0 = "crossplatform_view"
            com.ss.android.ugc.aweme.app.d.d r1 = com.ss.android.ugc.aweme.app.d.d.a()
            java.lang.String r2 = "platform"
            com.ss.android.ugc.aweme.crossplatform.params.base.a r3 = r9.getCrossPlatformParams()
            r4 = 0
            if (r3 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.crossplatform.params.a r3 = r3.f40805a
            if (r3 == 0) goto L_0x0054
            java.lang.Integer r3 = r3.f40794b
            if (r3 == 0) goto L_0x0054
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            java.lang.String r3 = com.ss.android.ugc.aweme.crossplatform.base.b.a((int) r3)
            goto L_0x0055
        L_0x0054:
            r3 = r4
        L_0x0055:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "status"
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r10)
            java.lang.String r2 = "module_name"
            com.ss.android.ugc.aweme.crossplatform.params.base.a r3 = r9.getCrossPlatformParams()
            if (r3 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.crossplatform.params.c r3 = r3.f40807c
            if (r3 == 0) goto L_0x006e
            java.lang.String r3 = r3.f40821f
            goto L_0x006f
        L_0x006e:
            r3 = r4
        L_0x006f:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r3)
            java.lang.String r2 = "url"
            java.lang.String r3 = r9.s
            if (r3 == 0) goto L_0x007c
            java.lang.String r4 = r9.s
            goto L_0x0088
        L_0x007c:
            com.ss.android.ugc.aweme.crossplatform.params.base.a r3 = r9.getCrossPlatformParams()
            if (r3 == 0) goto L_0x0088
            com.ss.android.ugc.aweme.crossplatform.params.a r3 = r3.f40805a
            if (r3 == 0) goto L_0x0088
            java.lang.String r4 = r3.f40796d
        L_0x0088:
            com.ss.android.ugc.aweme.app.d.d r1 = r1.a((java.lang.String) r2, (java.lang.String) r4)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f34114b
            com.ss.android.ugc.aweme.common.r.a((java.lang.String) r0, (java.util.Map) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.e(java.lang.String):void");
    }

    public final void d(@NotNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f2991a, false, 34574, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f2991a, false, 34574, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        com.ss.android.ugc.aweme.fe.registry.rn.b bVar = this.v;
        if (bVar != null) {
            bVar.a();
        }
        if (this.n != null) {
            ReactInstanceManager reactInstanceManager = this.n;
            if (reactInstanceManager != null) {
                reactInstanceManager.onHostDestroy(activity);
            }
            ReactInstanceManager reactInstanceManager2 = this.n;
            if (reactInstanceManager2 != null) {
                reactInstanceManager2.deleteJSBundleFile();
            }
            ReactInstanceManager reactInstanceManager3 = this.n;
            if (reactInstanceManager3 != null) {
                reactInstanceManager3.detachRootView(this.o);
            }
        }
        getRnContextBuildHelper().a();
        ReactRootView reactRootView = this.o;
        if (reactRootView != null) {
            reactRootView.unmountReactApplication();
        }
        ReactInstance.detachReactView(this, getReactId());
        bg.d(this);
        ((SingleWebView) a((int) C0906R.id.eo)).e();
        e("onDestroy");
        com.ss.android.ugc.aweme.hybrid.monitor.f fVar = this.q;
        if (fVar != null) {
            if (!fVar.f49969c) {
                fVar = null;
            }
            if (fVar != null) {
                com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a(fVar.a());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x008a, code lost:
        if (r0.y == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void b(com.ss.android.ugc.aweme.crossplatform.params.base.a r16) {
        /*
            r15 = this;
            r7 = r15
            r8 = r16
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.base.a> r1 = com.ss.android.ugc.aweme.crossplatform.params.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34581(0x8715, float:4.8458E-41)
            r1 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0035
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            r3 = 0
            r4 = 34581(0x8715, float:4.8458E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<com.ss.android.ugc.aweme.crossplatform.params.base.a> r1 = com.ss.android.ugc.aweme.crossplatform.params.base.a.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r15
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0035:
            com.ss.android.ugc.aweme.g.a.a()
            r0 = 2
            r7.l = r0
            r7.g = r8
            boolean r0 = com.ss.android.ugc.aweme.g.a.a()
            if (r0 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r7.g
            if (r0 != 0) goto L_0x004a
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x004a:
            com.ss.android.ugc.aweme.crossplatform.params.c r0 = r0.f40807c
            if (r0 != 0) goto L_0x0051
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x0051:
            boolean r0 = r0.d()
            com.ss.android.ugc.aweme.framework.ReactInstance.isDev = r0
            goto L_0x005a
        L_0x0058:
            com.ss.android.ugc.aweme.framework.ReactInstance.isDev = r10
        L_0x005a:
            r0 = 2131169335(0x7f071037, float:1.7952997E38)
            android.view.View r0 = r15.a((int) r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.String r1 = "react_root_view"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131165382(0x7f0700c6, float:1.794498E38)
            android.view.View r0 = r15.a((int) r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r0
            java.lang.String r2 = "ame_rn_web_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r2)
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r15.getCrossPlatformParams()
            if (r0 == 0) goto L_0x008c
            com.ss.android.ugc.aweme.crossplatform.params.d r0 = r0.f40808d
            if (r0 == 0) goto L_0x008c
            boolean r0 = r0.y
            if (r0 == 0) goto L_0x0098
        L_0x008c:
            r0 = 2131168307(0x7f070c33, float:1.7950912E38)
            android.view.View r0 = r15.a((int) r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
            r0.d()
        L_0x0098:
            boolean r0 = com.ss.android.ugc.aweme.framework.ReactInstance.isDev
            r1 = 0
            if (r0 == 0) goto L_0x00dd
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r7.g
            if (r0 != 0) goto L_0x00a4
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00a4:
            com.ss.android.ugc.aweme.crossplatform.params.c r0 = r0.f40807c
            if (r0 == 0) goto L_0x00ab
            java.lang.String r0 = r0.j
            goto L_0x00ac
        L_0x00ab:
            r0 = r1
        L_0x00ac:
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x00dd
            android.content.Context r0 = r15.getContext()
            android.content.SharedPreferences r0 = android.preference.PreferenceManager.getDefaultSharedPreferences(r0)
            android.content.SharedPreferences$Editor r0 = r0.edit()
            java.lang.String r2 = "debug_http_host"
            com.ss.android.ugc.aweme.crossplatform.params.base.a r3 = r7.g
            if (r3 != 0) goto L_0x00c9
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00c9:
            com.ss.android.ugc.aweme.crossplatform.params.c r3 = r3.f40807c
            if (r3 != 0) goto L_0x00d0
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00d0:
            java.lang.String r3 = r3.j
            java.lang.String r3 = android.net.Uri.decode(r3)
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)
            r0.apply()
        L_0x00dd:
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r7.g
            if (r0 != 0) goto L_0x00e4
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00e4:
            com.ss.android.ugc.aweme.crossplatform.params.c r0 = r0.f40807c
            if (r0 != 0) goto L_0x00eb
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x00eb:
            boolean r0 = r0.c()
            if (r0 == 0) goto L_0x00ff
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r7.g
            if (r0 == 0) goto L_0x00fb
            com.ss.android.ugc.aweme.crossplatform.params.c r0 = r0.f40807c
            if (r0 == 0) goto L_0x00fb
            java.lang.String r1 = r0.h
        L_0x00fb:
            r15.d((java.lang.String) r1)
            return
        L_0x00ff:
            com.ss.android.ugc.aweme.crossplatform.platform.rn.e r0 = r15.getRnContextBuildHelper()
            java.lang.String r1 = r15.getReactId()
            com.ss.android.ugc.aweme.crossplatform.params.base.a r10 = r7.g
            com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$e r2 = new com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView$e
            r2.<init>(r15, r8)
            r11 = r2
            com.ss.android.ugc.aweme.crossplatform.platform.rn.e$b r11 = (com.ss.android.ugc.aweme.crossplatform.platform.rn.e.b) r11
            boolean r2 = com.ss.android.ugc.aweme.framework.ReactInstance.isDev
            r12 = r2 ^ 1
            r13 = 0
            r8 = r0
            r9 = r1
            r8.a(r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.b(com.ss.android.ugc.aweme.crossplatform.params.base.a):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        if (r0.y == false) goto L_0x0054;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34583(0x8717, float:4.8461E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2991a
            r3 = 0
            r4 = 34583(0x8717, float:4.8461E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            r9.l = r7
            boolean r0 = com.ss.android.newmedia.e.a((java.lang.String) r10)
            if (r0 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r9.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0048
            com.ss.android.ugc.aweme.crossplatform.params.d r0 = r0.f40808d
            if (r0 == 0) goto L_0x0048
            boolean r0 = r0.y
            if (r0 == 0) goto L_0x0054
        L_0x0048:
            r0 = 2131168307(0x7f070c33, float:1.7950912E38)
            android.view.View r0 = r9.a((int) r0)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r0 = (com.bytedance.ies.dmt.ui.widget.DmtStatusView) r0
            r0.d()
        L_0x0054:
            com.ss.android.ugc.aweme.g.a.a()
            com.ss.android.ugc.aweme.crossplatform.params.base.a r0 = r9.getCrossPlatformParams()
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.crossplatform.params.a r0 = r0.f40805a
            if (r0 == 0) goto L_0x0067
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r0.f40794b = r1
        L_0x0067:
            android.app.Activity r0 = r9.getActivity()
            boolean r0 = r0 instanceof com.ss.android.ugc.aweme.main.MainActivity
            if (r0 != 0) goto L_0x0076
            com.ss.android.ugc.aweme.crossplatform.activity.f r0 = r9.f2995e
            if (r0 == 0) goto L_0x0076
            r0.f()
        L_0x0076:
            r0 = 2131169335(0x7f071037, float:1.7952997E38)
            android.view.View r0 = r9.a((int) r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            java.lang.String r1 = "react_root_view"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r0, r1)
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131165382(0x7f0700c6, float:1.794498E38)
            android.view.View r1 = r9.a((int) r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            java.lang.String r2 = "ame_rn_web_container"
            kotlin.jvm.internal.Intrinsics.checkExpressionValueIsNotNull(r1, r2)
            r1.setVisibility(r8)
            android.view.View r1 = r9.a((int) r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r1 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r1
            r1.b()
            long r1 = android.os.SystemClock.elapsedRealtime()
            r9.w = r1
            if (r10 == 0) goto L_0x00ca
            com.ss.android.ugc.aweme.hybrid.monitor.f r1 = r9.q
            if (r1 == 0) goto L_0x00c0
            boolean r2 = r1.f49969c
            if (r2 == 0) goto L_0x00b4
            goto L_0x00b5
        L_0x00b4:
            r1 = 0
        L_0x00b5:
            if (r1 == 0) goto L_0x00c0
            android.view.View r2 = r9.a((int) r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r2 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r2
            r2.setMonitorSession(r1)
        L_0x00c0:
            android.view.View r0 = r9.a((int) r0)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView r0 = (com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView) r0
            r0.loadUrl(r10)
            return
        L_0x00ca:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView.d(java.lang.String):void");
    }

    @NotNull
    public final <T extends g> T a(@NotNull Class<T> cls) {
        if (PatchProxy.isSupport(new Object[]{cls}, this, f2991a, false, 34545, new Class[]{Class.class}, g.class)) {
            return (g) PatchProxy.accessDispatch(new Object[]{cls}, this, f2991a, false, 34545, new Class[]{Class.class}, g.class);
        }
        Intrinsics.checkParameterIsNotNull(cls, "_cls");
        if (Intrinsics.areEqual((Object) cls, (Object) c.class)) {
            T t2 = this.i;
            if (t2 != null) {
                return (g) t2;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (Intrinsics.areEqual((Object) cls, (Object) h.class)) {
            T t3 = this.j;
            if (t3 != null) {
                return (g) t3;
            }
            throw new TypeCastException("null cannot be cast to non-null type T");
        } else if (!com.ss.android.ugc.aweme.g.a.a()) {
            return (g) new a();
        } else {
            throw new IllegalStateException(cls.getSimpleName() + " is not match any type for ViewWrap!");
        }
    }

    public final void b(@NotNull Activity activity) {
        if (PatchProxy.isSupport(new Object[]{activity}, this, f2991a, false, 34568, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity}, this, f2991a, false, 34568, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity, PushConstants.INTENT_ACTIVITY_NAME);
        ReactInstanceManager reactInstanceManager = this.n;
        if (reactInstanceManager != null) {
            reactInstanceManager.onHostResume(activity, this.u);
        }
        a("viewAppeared", (JSONObject) null);
        ((SingleWebView) a((int) C0906R.id.eo)).d();
        e("onResume");
    }

    public final void a(@NotNull Activity activity) {
        Activity activity2 = activity;
        if (PatchProxy.isSupport(new Object[]{activity2}, this, f2991a, false, 34567, new Class[]{Activity.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{activity2}, this, f2991a, false, 34567, new Class[]{Activity.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(activity2, PushConstants.INTENT_ACTIVITY_NAME);
        e("onCreate");
    }

    public final void b(String str) {
        String str2;
        if (PatchProxy.isSupport(new Object[]{str}, this, f2991a, false, 34562, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2991a, false, 34562, new Class[]{String.class}, Void.TYPE);
        } else if (!com.ss.android.g.a.a()) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence) && StringsKt.contains$default(charSequence, (CharSequence) "m.mwee.cn", false, 2, (Object) null)) {
                boolean contains$default = StringsKt.contains$default(charSequence, (CharSequence) "dyBook", false, 2, (Object) null);
                boolean contains$default2 = StringsKt.contains$default(charSequence, (CharSequence) "dyQueue", false, 2, (Object) null);
                bh a2 = bh.a().a("service", "poi_service").a("provider_name", "meiwei");
                if (contains$default) {
                    str2 = "reserve";
                } else if (contains$default2) {
                    str2 = "queue";
                } else {
                    str2 = "";
                }
                n.a("service_monitor", a2.a("page_type", str2).b());
            }
        }
    }

    private final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f2991a, false, 34571, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f2991a, false, 34571, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        SingleWebView singleWebView = (SingleWebView) a((int) C0906R.id.eo);
        Intrinsics.checkExpressionValueIsNotNull(singleWebView, "ame_rn_web_container");
        if (singleWebView.getVisibility() == 0) {
            ((SingleWebView) a((int) C0906R.id.eo)).a(str, jSONObject);
        }
    }

    private final void b(String str, JSONObject jSONObject) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject}, this, f2991a, false, 34572, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject}, this, f2991a, false, 34572, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        com.ss.android.ugc.aweme.framework.e.a(str2, com.ss.android.ugc.aweme.fe.b.c.a(jSONObject));
    }

    /* access modifiers changed from: private */
    @JvmOverloads
    public void b(@NotNull String str, boolean z) {
        if (PatchProxy.isSupport(new Object[]{str, Byte.valueOf(z ? (byte) 1 : 0)}, this, f2991a, false, 34579, new Class[]{String.class, Boolean.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Byte.valueOf(z)}, this, f2991a, false, 34579, new Class[]{String.class, Boolean.TYPE}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, PushConstants.WEB_URL);
        this.s = str;
        this.q = com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a();
        if (z) {
            d(Uri.parse(str).buildUpon().appendQueryParameter("reactId", getReactId()).toString());
        } else {
            d(str);
        }
    }

    private final void a(JSONObject jSONObject, String str, Object obj) {
        if (PatchProxy.isSupport(new Object[]{jSONObject, str, obj}, this, f2991a, false, 34564, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{jSONObject, str, obj}, this, f2991a, false, 34564, new Class[]{JSONObject.class, String.class, Object.class}, Void.TYPE);
        } else if (!StringUtils.isEmpty(str) && obj != null) {
            try {
                jSONObject.put(str, obj);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CrossPlatformWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        this.h = new e();
        this.i = new g(this);
        this.j = new h(this);
        this.l = 1;
        this.f2994d = "RN_VIEW";
        this.f2996f = SystemClock.elapsedRealtime();
        this.t = LazyKt.lazy(LazyThreadSafetyMode.NONE, (Function0<? extends T>) new f<Object>(context));
        com.ss.android.ugc.aweme.crossplatform.base.e.a().b();
        LayoutInflater.from(context).inflate(C0906R.layout.acj, this, true);
        ReactInstance.attachReactView(this);
        bg.c(this);
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34561, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34561, new Class[0], Void.TYPE);
        } else {
            ((DmtStatusView) a((int) C0906R.id.bjl)).setBuilder(DmtStatusView.a.a(getContext()));
            com.bytedance.ies.dmt.ui.widget.c cVar = new c.a(getContext()).a(2130840142).b((int) C0906R.string.dmm).c(C0906R.string.dml).a(com.bytedance.ies.dmt.ui.widget.a.BORDER, C0906R.string.dms, new b(this)).f20493a;
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(cVar);
            if (com.bytedance.ies.dmt.ui.common.b.b()) {
                Context context2 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context2, "context");
                dmtDefaultView.setBackgroundColor(context2.getResources().getColor(C0906R.color.als));
            } else {
                Context context3 = getContext();
                Intrinsics.checkExpressionValueIsNotNull(context3, "context");
                dmtDefaultView.setBackgroundColor(context3.getResources().getColor(C0906R.color.alt));
            }
            ((DmtStatusView) a((int) C0906R.id.a_w)).setBuilder(DmtStatusView.a.a(getContext()).c((View) dmtDefaultView));
        }
        if (PatchProxy.isSupport(new Object[0], this, f2991a, false, 34565, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2991a, false, 34565, new Class[0], Void.TYPE);
        } else {
            ((SingleWebView) a((int) C0906R.id.eo)).setOnSingleWebViewStatus(new c(this));
            ((SingleWebView) a((int) C0906R.id.eo)).setOnWebChromeStatus(new d(this));
        }
        this.w = -1;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CrossPlatformWebView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }

    public final void a(int i2, int i3, int i4, int i5, int i6) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f2991a, false, 34575, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)}, this, f2991a, false, 34575, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        DmtStatusView dmtStatusView = (DmtStatusView) a((int) C0906R.id.bjl);
        Intrinsics.checkExpressionValueIsNotNull(dmtStatusView, "loading_view");
        ViewGroup.LayoutParams layoutParams = dmtStatusView.getLayoutParams();
        if (layoutParams != null) {
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.leftMargin = i3;
            layoutParams2.rightMargin = i5;
            layoutParams2.topMargin = i4;
            layoutParams2.bottomMargin = i6;
            layoutParams2.gravity = i2;
            DmtStatusView dmtStatusView2 = (DmtStatusView) a((int) C0906R.id.bjl);
            Intrinsics.checkExpressionValueIsNotNull(dmtStatusView2, "loading_view");
            dmtStatusView2.setLayoutParams(layoutParams2);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }
}
