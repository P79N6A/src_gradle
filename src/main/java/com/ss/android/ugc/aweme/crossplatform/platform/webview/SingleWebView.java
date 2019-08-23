package com.ss.android.ugc.aweme.crossplatform.platform.webview;

import android.app.Activity;
import android.arch.lifecycle.LifecycleObserver;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Build;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.JsonSyntaxException;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.newmedia.BaseAppData;
import com.ss.android.newmedia.app.g;
import com.ss.android.sdk.c.b;
import com.ss.android.ugc.aweme.crossplatform.activity.f;
import com.ss.android.ugc.aweme.crossplatform.business.AdWebStatBusiness;
import com.ss.android.ugc.aweme.crossplatform.business.j;
import com.ss.android.ugc.aweme.crossplatform.platform.webview.i;
import com.ss.android.ugc.aweme.fe.method.BroadcastMethod;
import com.ss.android.ugc.aweme.poi.e.e;
import com.ss.android.ugc.aweme.utils.bg;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.p;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlin.text.StringsKt;
import org.greenrobot.eventbus.Subscribe;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001zB%\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010W\u001a\u00020\bH\u0016J\u0006\u0010X\u001a\u00020YJ\u0006\u0010Z\u001a\u00020YJ\u0006\u0010[\u001a\u00020YJ\n\u0010\\\u001a\u0004\u0018\u00010]H\u0002J\b\u0010^\u001a\u00020\u0011H\u0016J\b\u0010_\u001a\u00020YH\u0002J\u000e\u0010`\u001a\u00020\u00112\u0006\u0010a\u001a\u00020NJ\u0012\u0010b\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010NH\u0016J(\u0010b\u001a\u00020Y2\b\u0010a\u001a\u0004\u0018\u00010N2\u0014\u0010c\u001a\u0010\u0012\u0004\u0012\u00020N\u0012\u0004\u0012\u00020N\u0018\u00010dH\u0016J\b\u0010e\u001a\u00020YH\u0014J\b\u0010f\u001a\u00020YH\u0014J\u0010\u0010g\u001a\u00020Y2\u0006\u0010h\u001a\u00020iH\u0007J\u0010\u0010j\u001a\u00020Y2\u0006\u0010a\u001a\u00020NH\u0002J(\u0010k\u001a\u00020Y2\u0006\u0010l\u001a\u00020\b2\u0006\u0010m\u001a\u00020\b2\u0006\u0010n\u001a\u00020\b2\u0006\u0010o\u001a\u00020\bH\u0014J\u0010\u0010p\u001a\u00020\u00112\u0006\u0010h\u001a\u00020qH\u0016J\u0018\u0010r\u001a\u00020Y2\u0006\u0010h\u001a\u00020N2\b\u0010s\u001a\u0004\u0018\u00010tJ\u0010\u0010u\u001a\u00020Y2\b\u0010$\u001a\u0004\u0018\u00010%J\u0010\u0010v\u001a\u00020Y2\b\u0010w\u001a\u0004\u0018\u00010PJ\u0006\u0010x\u001a\u00020YJ\u000e\u0010y\u001a\u00020Y2\u0006\u0010a\u001a\u00020NR\u001a\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0011X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018X\u000e¢\u0006\u0004\n\u0002\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020\u00118BX\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u0013R\u001b\u0010*\u001a\u00020+8BX\u0002¢\u0006\f\n\u0004\b.\u0010#\u001a\u0004\b,\u0010-R\u001e\u00101\u001a\u0002002\u0006\u0010/\u001a\u000200@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0010\u00104\u001a\u0004\u0018\u000105X\u000e¢\u0006\u0002\n\u0000R\u001c\u00106\u001a\u0004\u0018\u000107X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u0011X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0013\"\u0004\b>\u0010\u0015R(\u0010A\u001a\u0004\u0018\u00010@2\b\u0010?\u001a\u0004\u0018\u00010@@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER(\u0010G\u001a\u0004\u0018\u00010F2\b\u0010?\u001a\u0004\u0018\u00010F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u0018\u0010L\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010N\u0018\u00010MX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010O\u001a\u0004\u0018\u00010PX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010Q\u001a\u0004\u0018\u00010RX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010S\u001a\u0004\u0018\u00010TX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00020N0VX\u0004¢\u0006\u0002\n\u0000¨\u0006{"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView;", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/TryCatchWebView;", "Landroid/arch/lifecycle/LifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "baseJsMessageHandler", "Lcom/ss/android/sdk/webview/IJsMsgHandler;", "getBaseJsMessageHandler", "()Lcom/ss/android/sdk/webview/IJsMsgHandler;", "setBaseJsMessageHandler", "(Lcom/ss/android/sdk/webview/IJsMsgHandler;)V", "canScrollVertically", "", "getCanScrollVertically", "()Z", "setCanScrollVertically", "(Z)V", "disableIntercept", "disableInterceptRegionList", "", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView$DisableInterceptRegion;", "[Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView$DisableInterceptRegion;", "enableScrollControl", "getEnableScrollControl", "setEnableScrollControl", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "iCrossPlatformActivityContainer", "Lcom/ss/android/ugc/aweme/crossplatform/activity/ICrossPlatformActivityContainer;", "iesJsBridge", "Lcom/ss/android/sdk/webview/DMTJsBridge;", "inPauseList", "getInPauseList", "lastClickDetector", "Landroid/view/GestureDetector;", "getLastClickDetector", "()Landroid/view/GestureDetector;", "lastClickDetector$delegate", "<set-?>", "", "lastClickTime", "getLastClickTime", "()J", "mTTNetInterceptorWrapper", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/TTNetInterceptorWrapper;", "monitorSession", "Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "getMonitorSession", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "setMonitorSession", "(Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;)V", "monitorSessionCreatedBySelf", "getMonitorSessionCreatedBySelf", "setMonitorSessionCreatedBySelf", "value", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "onSingleWebViewStatus", "getOnSingleWebViewStatus", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;", "setOnSingleWebViewStatus", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/ISingleWebViewStatus;)V", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "onWebChromeStatus", "getOnWebChromeStatus", "()Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;", "setOnWebChromeStatus", "(Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/IWebChromeStatus;)V", "pauseList", "", "", "scrollListener", "Lcom/ss/android/ugc/aweme/crossplatform/view/IWebScrollListener;", "singleWebChromeClient", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebChromeClient;", "singleWebViewClient", "Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebViewClient;", "visitedUrls", "", "direction", "contextDestroy", "", "contextPause", "contextResume", "getActivity", "Landroid/app/Activity;", "hasClickInTimeInterval", "initConfig", "isVisited", "url", "loadUrl", "additionalHttpHeaders", "", "onAttachedToWindow", "onDetachedFromWindow", "onJsBroadcast", "event", "Lcom/ss/android/ugc/aweme/fe/method/BroadcastMethod$JsBroadCastEvent;", "onLoadUrl", "onScrollChanged", "l", "t", "oldl", "oldt", "onTouchEvent", "Landroid/view/MotionEvent;", "sendEventToWebView", "params", "Lorg/json/JSONObject;", "setCrossPlatformActivityContainer", "setWebScrollListener", "listener", "transparentBackground", "visit", "DisableInterceptRegion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class SingleWebView extends h implements LifecycleObserver {

    /* renamed from: c  reason: collision with root package name */
    public static ChangeQuickRedirect f2987c;

    /* renamed from: d  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f2988d = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SingleWebView.class), "gson", "getGson()Lcom/google/gson/Gson;")), Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(SingleWebView.class), "lastClickDetector", "getLastClickDetector()Landroid/view/GestureDetector;"))};

    /* renamed from: e  reason: collision with root package name */
    public long f2989e;

    /* renamed from: f  reason: collision with root package name */
    public final Set<String> f2990f;
    private com.ss.android.sdk.c.b h;
    private e i;
    private SingleWebChromeClient j;
    private f k;
    @NotNull
    private com.ss.android.sdk.c.f l;
    @Nullable
    private c m;
    @Nullable
    private d n;
    private a[] o;
    private final Lazy p;
    private List<String> q;
    private g r;
    @Nullable
    private com.ss.android.ugc.aweme.hybrid.monitor.f s;
    private boolean t;
    private final Lazy u;
    private boolean v;
    private boolean w;
    private boolean x;
    private com.ss.android.ugc.aweme.crossplatform.view.b y;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B-\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J1\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0019"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/platform/webview/SingleWebView$DisableInterceptRegion;", "", "x", "", "y", "width", "height", "(DDDD)V", "getHeight", "()D", "getWidth", "getX", "getY", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40953a;
        @SerializedName("x")

        /* renamed from: b  reason: collision with root package name */
        public final double f40954b;
        @SerializedName("y")

        /* renamed from: c  reason: collision with root package name */
        public final double f40955c;
        @SerializedName("width")

        /* renamed from: d  reason: collision with root package name */
        public final double f40956d;
        @SerializedName("height")

        /* renamed from: e  reason: collision with root package name */
        public final double f40957e;

        public a() {
            this(0.0d, 0.0d, 0.0d, 0.0d, 15);
        }

        public final boolean equals(@Nullable Object obj) {
            if (PatchProxy.isSupport(new Object[]{obj}, this, f40953a, false, 34473, new Class[]{Object.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj}, this, f40953a, false, 34473, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
            }
            if (this != obj) {
                if (obj instanceof a) {
                    a aVar = (a) obj;
                    if (!(Double.compare(this.f40954b, aVar.f40954b) == 0 && Double.compare(this.f40955c, aVar.f40955c) == 0 && Double.compare(this.f40956d, aVar.f40956d) == 0 && Double.compare(this.f40957e, aVar.f40957e) == 0)) {
                        return false;
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            if (PatchProxy.isSupport(new Object[0], this, f40953a, false, 34472, new Class[0], Integer.TYPE)) {
                return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f40953a, false, 34472, new Class[0], Integer.TYPE)).intValue();
            }
            long doubleToLongBits = Double.doubleToLongBits(this.f40954b);
            long doubleToLongBits2 = Double.doubleToLongBits(this.f40955c);
            long doubleToLongBits3 = Double.doubleToLongBits(this.f40956d);
            long doubleToLongBits4 = Double.doubleToLongBits(this.f40957e);
            return (((((((int) (doubleToLongBits ^ (doubleToLongBits >>> 32))) * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)))) * 31) + ((int) (doubleToLongBits3 ^ (doubleToLongBits3 >>> 32)))) * 31) + ((int) ((doubleToLongBits4 >>> 32) ^ doubleToLongBits4));
        }

        @NotNull
        public final String toString() {
            if (PatchProxy.isSupport(new Object[0], this, f40953a, false, 34471, new Class[0], String.class)) {
                return (String) PatchProxy.accessDispatch(new Object[0], this, f40953a, false, 34471, new Class[0], String.class);
            }
            return "DisableInterceptRegion(x=" + this.f40954b + ", y=" + this.f40955c + ", width=" + this.f40956d + ", height=" + this.f40957e + ")";
        }

        private a(double d2, double d3, double d4, double d5) {
            this.f40954b = d2;
            this.f40955c = d3;
            this.f40956d = d4;
            this.f40957e = d5;
        }

        private /* synthetic */ a(double d2, double d3, double d4, double d5, int i) {
            this(p.a(), p.a(), p.b(), p.b());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<Gson> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final Gson invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34474, new Class[0], Gson.class)) {
                return new Gson();
            }
            return (Gson) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34474, new Class[0], Gson.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/GestureDetector;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class c extends Lambda implements Function0<GestureDetector> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ Context $context;
        final /* synthetic */ SingleWebView this$0;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        c(SingleWebView singleWebView, Context context) {
            super(0);
            this.this$0 = singleWebView;
            this.$context = context;
        }

        @NotNull
        public final GestureDetector invoke() {
            if (PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34475, new Class[0], GestureDetector.class)) {
                return (GestureDetector) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34475, new Class[0], GestureDetector.class);
            }
            GestureDetector gestureDetector = new GestureDetector(this.$context, new GestureDetector.SimpleOnGestureListener(this) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f40958a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ c f40959b;

                {
                    this.f40959b = r1;
                }

                public final boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
                    if (PatchProxy.isSupport(new Object[]{motionEvent}, this, f40958a, false, 34476, new Class[]{MotionEvent.class}, Boolean.TYPE)) {
                        return ((Boolean) PatchProxy.accessDispatch(new Object[]{motionEvent}, this, f40958a, false, 34476, new Class[]{MotionEvent.class}, Boolean.TYPE)).booleanValue();
                    }
                    this.f40959b.this$0.f2989e = System.currentTimeMillis();
                    return super.onSingleTapUp(motionEvent);
                }
            });
            gestureDetector.setIsLongpressEnabled(true);
            return gestureDetector;
        }
    }

    @JvmOverloads
    public SingleWebView(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }

    @JvmOverloads
    public SingleWebView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final Gson getGson() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34445, new Class[0], Gson.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34445, new Class[0], Gson.class);
        } else {
            value = this.p.getValue();
        }
        return (Gson) value;
    }

    private final GestureDetector getLastClickDetector() {
        Object value;
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34451, new Class[0], GestureDetector.class)) {
            value = PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34451, new Class[0], GestureDetector.class);
        } else {
            value = this.u.getValue();
        }
        return (GestureDetector) value;
    }

    @NotNull
    public final com.ss.android.sdk.c.f getBaseJsMessageHandler() {
        return this.l;
    }

    public final boolean getCanScrollVertically() {
        return this.w;
    }

    public final boolean getEnableScrollControl() {
        return this.v;
    }

    public final long getLastClickTime() {
        return this.f2989e;
    }

    @Nullable
    public final com.ss.android.ugc.aweme.hybrid.monitor.f getMonitorSession() {
        return this.s;
    }

    public final boolean getMonitorSessionCreatedBySelf() {
        return this.t;
    }

    @Nullable
    public final c getOnSingleWebViewStatus() {
        return this.m;
    }

    @Nullable
    public final d getOnWebChromeStatus() {
        return this.n;
    }

    private final Activity getActivity() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34460, new Class[0], Activity.class)) {
            return (Activity) PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34460, new Class[0], Activity.class);
        }
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    public final boolean a() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34466, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34466, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (System.currentTimeMillis() - this.f2989e < ((long) getTimeInterval())) {
            z = true;
        }
        return z;
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34454, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34454, new Class[0], Void.TYPE);
            return;
        }
        setBackgroundColor(0);
    }

    public final void c() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34457, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34457, new Class[0], Void.TYPE);
            return;
        }
        onPause();
        g.a(getContext(), this);
        if (getInPauseList()) {
            pauseTimers();
        }
    }

    public final void d() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34458, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34458, new Class[0], Void.TYPE);
            return;
        }
        this.l.g();
        onResume();
        resumeTimers();
    }

    public final void e() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34459, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34459, new Class[0], Void.TYPE);
            return;
        }
        this.l.d();
        this.l.h();
        g.a(this);
    }

    public final void onAttachedToWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34462, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34462, new Class[0], Void.TYPE);
            return;
        }
        super.onAttachedToWindow();
        bg.c(this);
    }

    private final boolean getInPauseList() {
        boolean z;
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34452, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34452, new Class[0], Boolean.TYPE)).booleanValue();
        }
        List<String> list = this.q;
        if (list != null) {
            Sequence asSequence = CollectionsKt.asSequence(list);
            if (asSequence != null) {
                Sequence<String> filterNotNull = SequencesKt.filterNotNull(asSequence);
                if (filterNotNull != null) {
                    for (String str : filterNotNull) {
                        String url = getUrl();
                        if (url == null || !StringsKt.startsWith$default(url, str, false, 2, null)) {
                            z = false;
                            continue;
                        } else {
                            z = true;
                            continue;
                        }
                        if (z) {
                            return true;
                        }
                    }
                    return false;
                }
            }
        }
        return false;
    }

    public final void onDetachedFromWindow() {
        if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34463, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34463, new Class[0], Void.TYPE);
            return;
        }
        super.onDetachedFromWindow();
        bg.d(this);
        if (this.t) {
            com.ss.android.ugc.aweme.hybrid.monitor.f fVar = this.s;
            if (fVar != null) {
                if (!fVar.f49969c) {
                    fVar = null;
                }
                if (fVar != null) {
                    com.ss.android.ugc.aweme.crossplatform.a.f40658f.a().a(fVar.a());
                }
            }
        }
    }

    public final void setCanScrollVertically(boolean z) {
        this.w = z;
    }

    public final void setEnableScrollControl(boolean z) {
        this.v = z;
    }

    public final void setMonitorSession(@Nullable com.ss.android.ugc.aweme.hybrid.monitor.f fVar) {
        this.s = fVar;
    }

    public final void setMonitorSessionCreatedBySelf(boolean z) {
        this.t = z;
    }

    public final void setWebScrollListener(@Nullable com.ss.android.ugc.aweme.crossplatform.view.b bVar) {
        this.y = bVar;
    }

    public final void setOnSingleWebViewStatus(@Nullable c cVar) {
        this.m = cVar;
        e eVar = this.i;
        if (eVar != null) {
            eVar.f40973c = cVar;
        }
    }

    public final void setOnWebChromeStatus(@Nullable d dVar) {
        this.n = dVar;
        SingleWebChromeClient singleWebChromeClient = this.j;
        if (singleWebChromeClient != null) {
            singleWebChromeClient.f40951d = dVar;
        }
    }

    public final void setBaseJsMessageHandler(@NotNull com.ss.android.sdk.c.f fVar) {
        com.ss.android.sdk.c.f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f2987c, false, 34444, new Class[]{com.ss.android.sdk.c.f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f2987c, false, 34444, new Class[]{com.ss.android.sdk.c.f.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(fVar2, "<set-?>");
        this.l = fVar2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0057  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(java.lang.String r10) {
        /*
            r9 = this;
            r7 = 1
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r8 = 0
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2987c
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r3 = 0
            r4 = 34448(0x8690, float:4.8272E-41)
            r1 = r9
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x0032
            java.lang.Object[] r0 = new java.lang.Object[r7]
            r0[r8] = r10
            com.meituan.robust.ChangeQuickRedirect r2 = f2987c
            r3 = 0
            r4 = 34448(0x8690, float:4.8272E-41)
            java.lang.Class[] r5 = new java.lang.Class[r7]
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r5[r8] = r1
            java.lang.Class r6 = java.lang.Void.TYPE
            r1 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            return
        L_0x0032:
            com.ss.android.ugc.aweme.hybrid.monitor.f r0 = r9.s
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.hybrid.monitor.f r0 = r9.s
            if (r0 != 0) goto L_0x003d
            kotlin.jvm.internal.Intrinsics.throwNpe()
        L_0x003d:
            boolean r0 = r0.f49969c
            if (r0 != 0) goto L_0x0042
            goto L_0x0045
        L_0x0042:
            r9.t = r8
            goto L_0x0053
        L_0x0045:
            com.ss.android.ugc.aweme.crossplatform.a$a r0 = com.ss.android.ugc.aweme.crossplatform.a.f40658f
            com.ss.android.ugc.aweme.crossplatform.a r0 = r0.a()
            com.ss.android.ugc.aweme.hybrid.monitor.f r0 = r0.a()
            r9.s = r0
            r9.t = r7
        L_0x0053:
            com.ss.android.ugc.aweme.hybrid.monitor.f r0 = r9.s
            if (r0 == 0) goto L_0x006e
            boolean r1 = r0.f49969c
            if (r1 == 0) goto L_0x005c
            goto L_0x005d
        L_0x005c:
            r0 = 0
        L_0x005d:
            if (r0 == 0) goto L_0x006e
            com.ss.android.ugc.aweme.hybrid.monitor.q r1 = com.ss.android.ugc.aweme.hybrid.monitor.q.f49996b
            android.net.Uri r1 = r1.a(r10)
            r0.a((android.net.Uri) r1)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.e r1 = r9.i
            if (r1 == 0) goto L_0x006e
            r1.g = r0
        L_0x006e:
            com.ss.android.sdk.c.f r0 = r9.l
            com.ss.android.ugc.aweme.hybrid.monitor.f r1 = r9.s
            r0.a((com.ss.android.ugc.aweme.hybrid.monitor.f) r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.a(java.lang.String):void");
    }

    public final boolean canScrollVertically(int i2) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2)}, this, f2987c, false, 34461, new Class[]{Integer.TYPE}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2)}, this, f2987c, false, 34461, new Class[]{Integer.TYPE}, Boolean.TYPE)).booleanValue();
        } else if (!this.v) {
            return super.canScrollVertically(i2);
        } else {
            if (!this.w || !super.canScrollVertically(i2)) {
                return false;
            }
            return true;
        }
    }

    public final void loadUrl(@Nullable String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f2987c, false, 34449, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f2987c, false, 34449, new Class[]{String.class}, Void.TYPE);
            return;
        }
        i a2 = i.a.a();
        if (a2.a(str)) {
            this.r = new g(str);
            e eVar = this.i;
            if (eVar != null) {
                eVar.f40975f = this.r;
            }
        }
        super.loadUrl(str);
        if (str != null) {
            a(str);
        }
    }

    @Subscribe
    public final void onJsBroadcast(@NotNull BroadcastMethod.a aVar) {
        String str;
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f2987c, false, 34464, new Class[]{BroadcastMethod.a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f2987c, false, 34464, new Class[]{BroadcastMethod.a.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(aVar, "event");
        JsonElement parse = new JsonParser().parse(aVar.f44432b.toString());
        Intrinsics.checkExpressionValueIsNotNull(parse, "JsonParser().parse(event.params.toString())");
        JsonObject asJsonObject = parse.getAsJsonObject();
        JsonElement jsonElement = asJsonObject.get("eventName");
        if (jsonElement != null) {
            str = jsonElement.getAsString();
        } else {
            str = null;
        }
        if (Intrinsics.areEqual((Object) str, (Object) "disableIntercept")) {
            JsonElement jsonElement2 = asJsonObject.get("data");
            if (jsonElement2 != null) {
                try {
                    this.o = (a[]) getGson().fromJson(jsonElement2, a[].class);
                    return;
                } catch (JsonSyntaxException unused) {
                }
            }
            this.o = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a1 A[LOOP:0: B:9:0x0072->B:23:0x00a1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(@org.jetbrains.annotations.NotNull android.view.MotionEvent r18) {
        /*
            r17 = this;
            r7 = r17
            r8 = r18
            r9 = 1
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r10 = 0
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2987c
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r3 = 0
            r4 = 34465(0x86a1, float:4.8296E-41)
            r1 = r17
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x003f
            java.lang.Object[] r0 = new java.lang.Object[r9]
            r0[r10] = r8
            com.meituan.robust.ChangeQuickRedirect r2 = f2987c
            r3 = 0
            r4 = 34465(0x86a1, float:4.8296E-41)
            java.lang.Class[] r5 = new java.lang.Class[r9]
            java.lang.Class<android.view.MotionEvent> r1 = android.view.MotionEvent.class
            r5[r10] = r1
            java.lang.Class r6 = java.lang.Boolean.TYPE
            r1 = r17
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r0, r1, r2, r3, r4, r5, r6)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L_0x003f:
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkParameterIsNotNull(r8, r0)
            int r0 = r18.getActionMasked()
            r1 = 2
            if (r0 != 0) goto L_0x00a9
            r7.x = r10
            int[] r0 = new int[r1]
            r7.getLocationInWindow(r0)
            float r2 = r18.getRawX()
            r3 = r0[r10]
            float r3 = (float) r3
            float r2 = r2 - r3
            double r2 = (double) r2
            int r2 = com.ss.android.ugc.aweme.base.utils.u.b((double) r2)
            float r3 = r18.getRawY()
            r0 = r0[r9]
            float r0 = (float) r0
            float r3 = r3 - r0
            double r3 = (double) r3
            int r0 = com.ss.android.ugc.aweme.base.utils.u.b((double) r3)
            com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView$a[] r3 = r7.o
            if (r3 == 0) goto L_0x00a7
            int r4 = r3.length
            r5 = 0
        L_0x0072:
            if (r5 >= r4) goto L_0x00a7
            r6 = r3[r5]
            double r11 = (double) r2
            double r13 = r6.f40954b
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 < 0) goto L_0x009a
            double r13 = r6.f40954b
            r16 = r2
            double r1 = r6.f40956d
            double r13 = r13 + r1
            int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r1 > 0) goto L_0x009c
            double r1 = (double) r0
            double r11 = r6.f40955c
            int r13 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x009c
            double r11 = r6.f40955c
            double r13 = r6.f40957e
            double r11 = r11 + r13
            int r6 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x009c
            r1 = 1
            goto L_0x009d
        L_0x009a:
            r16 = r2
        L_0x009c:
            r1 = 0
        L_0x009d:
            if (r1 == 0) goto L_0x00a1
            r10 = 1
            goto L_0x00a7
        L_0x00a1:
            int r5 = r5 + 1
            r2 = r16
            r1 = 2
            goto L_0x0072
        L_0x00a7:
            r7.x = r10
        L_0x00a9:
            boolean r0 = r7.x
            if (r0 == 0) goto L_0x00b0
            r7.requestDisallowInterceptTouchEvent(r9)
        L_0x00b0:
            boolean r0 = r7.f2533b
            if (r0 == 0) goto L_0x00bb
            android.view.GestureDetector r0 = r17.getLastClickDetector()
            r0.onTouchEvent(r8)
        L_0x00bb:
            boolean r0 = r7.v
            if (r0 == 0) goto L_0x00d4
            boolean r0 = r7.w
            if (r0 == 0) goto L_0x00c7
            r7.requestDisallowInterceptTouchEvent(r9)
            goto L_0x00cf
        L_0x00c7:
            int r0 = r18.getAction()
            r1 = 2
            if (r0 != r1) goto L_0x00cf
            return r9
        L_0x00cf:
            boolean r0 = super.onTouchEvent(r18)
            return r0
        L_0x00d4:
            boolean r0 = super.onTouchEvent(r18)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setCrossPlatformActivityContainer(@Nullable f fVar) {
        f fVar2 = fVar;
        if (PatchProxy.isSupport(new Object[]{fVar2}, this, f2987c, false, 34456, new Class[]{f.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{fVar2}, this, f2987c, false, 34456, new Class[]{f.class}, Void.TYPE);
            return;
        }
        if (fVar2 != null) {
            this.k = fVar2;
            SingleWebChromeClient singleWebChromeClient = this.j;
            if (singleWebChromeClient != null) {
                singleWebChromeClient.f40950c = fVar2;
            }
            e eVar = this.i;
            if (eVar != null) {
                if (PatchProxy.isSupport(new Object[]{fVar2}, eVar, e.f40971a, false, 34478, new Class[]{f.class}, Void.TYPE)) {
                    e eVar2 = eVar;
                    PatchProxy.accessDispatch(new Object[]{fVar2}, eVar2, e.f40971a, false, 34478, new Class[]{f.class}, Void.TYPE);
                } else {
                    eVar.h = fVar2;
                    BaseAppData a2 = BaseAppData.a();
                    Intrinsics.checkExpressionValueIsNotNull(a2, "BaseAppData.inst()");
                    com.ss.android.sdk.c.g o2 = a2.o();
                    if (o2 != null) {
                        f fVar3 = eVar.h;
                        if (fVar3 != null) {
                            j crossPlatformBusiness = fVar3.getCrossPlatformBusiness();
                            if (crossPlatformBusiness != null) {
                                AdWebStatBusiness adWebStatBusiness = (AdWebStatBusiness) crossPlatformBusiness.a(AdWebStatBusiness.class);
                                if (adWebStatBusiness != null) {
                                    adWebStatBusiness.a(eVar.a(), o2);
                                }
                            }
                        }
                        List<Pattern> b2 = o2.b();
                        f fVar4 = eVar.h;
                        if (fVar4 != null) {
                            j crossPlatformBusiness2 = fVar4.getCrossPlatformBusiness();
                            if (crossPlatformBusiness2 != null) {
                                AdWebStatBusiness adWebStatBusiness2 = (AdWebStatBusiness) crossPlatformBusiness2.a(AdWebStatBusiness.class);
                                if (adWebStatBusiness2 != null) {
                                    adWebStatBusiness2.a(b2);
                                }
                            }
                        }
                        com.ss.android.sdk.c.c cVar = eVar.f40974e;
                        if (cVar != null) {
                            cVar.a(b2);
                        }
                    }
                }
            }
        }
        if (fVar2 != null) {
            com.ss.android.ugc.aweme.crossplatform.params.base.a crossPlatformParams = fVar.getCrossPlatformParams();
            if (crossPlatformParams != null) {
                boolean z = crossPlatformParams.f40805a.h;
                if (Build.VERSION.SDK_INT >= 17) {
                    try {
                        com.ss.android.ugc.aweme.global.config.settings.pojo.a b3 = com.ss.android.ugc.aweme.global.config.settings.g.b();
                        Intrinsics.checkExpressionValueIsNotNull(b3, "SettingsReader.get()");
                        Boolean aH = b3.aH();
                        Intrinsics.checkExpressionValueIsNotNull(aH, "SettingsReader.get().enableAudioAutoPlay");
                        if (aH.booleanValue()) {
                            WebSettings settings = getSettings();
                            Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
                            settings.setMediaPlaybackRequiresUserGesture(!z);
                        } else {
                            WebSettings settings2 = getSettings();
                            Intrinsics.checkExpressionValueIsNotNull(settings2, "settings");
                            settings2.setMediaPlaybackRequiresUserGesture(true);
                        }
                    } catch (Exception unused) {
                        WebSettings settings3 = getSettings();
                        Intrinsics.checkExpressionValueIsNotNull(settings3, "settings");
                        settings3.setMediaPlaybackRequiresUserGesture(true);
                    }
                }
                this.l.a(crossPlatformParams.f40806b.f40800b, crossPlatformParams.f40806b.f40801c, crossPlatformParams.f40806b.f40802d, crossPlatformParams.f40806b.j, crossPlatformParams.f40806b.f40804f);
                if (crossPlatformParams.f40805a.m) {
                    setLayerType(1, null);
                }
            }
        }
    }

    public final void a(@NotNull String str, @Nullable JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject2}, this, f2987c, false, 34455, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject2}, this, f2987c, false, 34455, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "event");
        this.l.a(str2, jSONObject2);
    }

    public final void loadUrl(@Nullable String str, @Nullable Map<String, String> map) {
        if (PatchProxy.isSupport(new Object[]{str, map}, this, f2987c, false, 34450, new Class[]{String.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, map}, this, f2987c, false, 34450, new Class[]{String.class, Map.class}, Void.TYPE);
            return;
        }
        i a2 = i.a.a();
        if (a2.a(str)) {
            this.r = new g(str);
            e eVar = this.i;
            if (eVar != null) {
                eVar.f40975f = this.r;
            }
        }
        super.loadUrl(str, map);
        if (str != null) {
            a(str);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SingleWebView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Intrinsics.checkParameterIsNotNull(context, "context");
        com.ss.android.sdk.c.f a2 = BaseAppData.a().a(context);
        Intrinsics.checkExpressionValueIsNotNull(a2, "BaseAppData.inst().getJsMessageHandler(context)");
        this.l = a2;
        this.p = LazyKt.lazy(b.INSTANCE);
        this.f2990f = new LinkedHashSet();
        this.u = LazyKt.lazy(new c(this, context));
        this.i = new e();
        setWebViewClient(this.i);
        WebView webView = this;
        this.j = new SingleWebChromeClient(webView);
        SingleWebChromeClient singleWebChromeClient = this.j;
        if (singleWebChromeClient == null) {
            Intrinsics.throwNpe();
        }
        singleWebChromeClient.f40949b = this.l;
        setWebChromeClient(this.j);
        com.ss.android.sdk.c.b a3 = b.a.a(webView);
        SingleWebChromeClient singleWebChromeClient2 = this.j;
        if (singleWebChromeClient2 == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.sdk.c.b a4 = a3.a((WebChromeClient) singleWebChromeClient2);
        e eVar = this.i;
        if (eVar == null) {
            Intrinsics.throwNpe();
        }
        com.ss.android.sdk.c.b a5 = a4.a((WebViewClient) eVar);
        com.ss.android.sdk.c.f fVar = this.l;
        if (fVar != null) {
            this.h = a5.a((com.ss.android.sdk.c.a) fVar).a(e.c()).b();
            this.l.a(this.h);
            e eVar2 = this.i;
            if (eVar2 == null) {
                Intrinsics.throwNpe();
            }
            eVar2.f20619d = this.h.f30719b;
            if (PatchProxy.isSupport(new Object[0], this, f2987c, false, 34453, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f2987c, false, 34453, new Class[0], Void.TYPE);
            } else {
                com.ss.android.newmedia.ui.webview.a a6 = com.ss.android.newmedia.ui.webview.a.a(getContext());
                Intrinsics.checkExpressionValueIsNotNull(BaseAppData.a(), "BaseAppData.inst()");
                a6.a(true).a(webView);
                setFocusableInTouchMode(true);
                setScrollBarStyle(0);
                CookieManager.getInstance().setAcceptCookie(true);
                WebSettings settings = getSettings();
                Intrinsics.checkExpressionValueIsNotNull(settings, "settings");
                settings.setCacheMode(2);
                com.ss.android.sdk.activity.a.a a7 = com.ss.android.ugc.aweme.commercialize.utils.f.a();
                if (a7 != null) {
                    setTimeInterval(a7.getAutoJumpInterval());
                    this.q = a7.getPauseList();
                }
            }
            this.w = true;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type com.ss.android.sdk.webview.BaseJsMessageHandler");
    }

    public final void onScrollChanged(int i2, int i3, int i4, int i5) {
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f2987c, false, 34467, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)}, this, f2987c, false, 34467, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE}, Void.TYPE);
            return;
        }
        super.onScrollChanged(i2, i3, i4, i5);
        com.ss.android.ugc.aweme.crossplatform.view.b bVar = this.y;
        if (bVar != null) {
            bVar.a(i3);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SingleWebView(Context context, AttributeSet attributeSet, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i3 & 2) != 0 ? null : attributeSet, (i3 & 4) != 0 ? 0 : i2);
    }
}
