package com.ss.android.sdk.c;

import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.f;
import com.bytedance.ies.f.b.j;
import com.bytedance.ies.f.b.k;
import com.bytedance.ies.f.b.o;
import com.bytedance.ies.f.b.p;
import com.google.gson.Gson;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 72\u00020\u0001:\u00017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0018J\u000e\u0010\u001f\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u001cJ\u0016\u0010 \u001a\u00020\u00162\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\"J\u001a\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010(J+\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020&2\u0016\u0010+\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010&0,\"\u0004\u0018\u00010&¢\u0006\u0002\u0010-J\u0010\u0010.\u001a\u00020\u00162\b\u0010/\u001a\u0004\u0018\u00010&J\u0006\u00100\u001a\u00020$J\u001a\u00101\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010&2\b\u00102\u001a\u0004\u0018\u000103J\u001a\u00104\u001a\u00020$2\b\u00105\u001a\u0004\u0018\u00010&2\b\u0010+\u001a\u0004\u0018\u00010(J\u0006\u00106\u001a\u00020\u0000J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0015\u001a\u00020\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u000e¢\u0006\u0002\n\u0000¨\u00068"}, d2 = {"Lcom/ss/android/sdk/webview/DMTJsBridge;", "", "webView", "Landroid/webkit/WebView;", "(Landroid/webkit/WebView;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "gson$delegate", "Lkotlin/Lazy;", "iesJsBridge", "Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "getIesJsBridge", "()Lcom/bytedance/ies/web/jsbridge/IESJsBridge;", "setIesJsBridge", "(Lcom/bytedance/ies/web/jsbridge/IESJsBridge;)V", "jsBridge2Support", "Lcom/bytedance/ies/web/jsbridge2/JsBridge2IESSupport;", "jsMessageHandler", "Lcom/ss/android/sdk/webview/BaseJsMessageHandler;", "useInjection", "", "webChromeClient", "Landroid/webkit/WebChromeClient;", "getWebView", "()Landroid/webkit/WebView;", "webViewClient", "Landroid/webkit/WebViewClient;", "bindJsMessageHandler", "bindWebChromeClient", "bindWebViewClient", "checkJsEventEnable", "valueCallback", "Landroid/webkit/ValueCallback;", "invokeJsCallback", "", "callBackId", "", "result", "Lorg/json/JSONObject;", "invokeJsMethod", "method", "params", "", "(Ljava/lang/String;[Ljava/lang/String;)V", "isSafeHost", "url", "onDestroy", "registerJavaMethod", "func", "Lcom/bytedance/ies/web/jsbridge/IJavaMethod;", "sendJsEvent", "event", "setup", "Companion", "aweme-jsbridge_release"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final /* synthetic */ KProperty[] f30717a = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(b.class), "gson", "getGson()Lcom/google/gson/Gson;"))};

    /* renamed from: d  reason: collision with root package name */
    public static final a f30718d = new a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public com.bytedance.ies.f.a.a f30719b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final WebView f30720c;

    /* renamed from: e  reason: collision with root package name */
    private WebViewClient f30721e;

    /* renamed from: f  reason: collision with root package name */
    private WebChromeClient f30722f;
    private a g;
    private boolean h;
    private p i;
    private final Lazy j = LazyKt.lazy(C0371b.INSTANCE);

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, d2 = {"Lcom/ss/android/sdk/webview/DMTJsBridge$Companion;", "", "()V", "create", "Lcom/ss/android/sdk/webview/DMTJsBridge;", "webView", "Landroid/webkit/WebView;", "aweme-jsbridge_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @JvmStatic
        @NotNull
        public static b a(@NotNull WebView webView) {
            Intrinsics.checkParameterIsNotNull(webView, "webView");
            return new b(webView);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/google/gson/Gson;", "invoke"}, k = 3, mv = {1, 1, 15})
    /* renamed from: com.ss.android.sdk.c.b$b  reason: collision with other inner class name */
    static final class C0371b extends Lambda implements Function0<Gson> {
        public static final C0371b INSTANCE = new C0371b();

        C0371b() {
            super(0);
        }

        @NotNull
        public final Gson invoke() {
            return new Gson();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J#\u0010\u0002\u001a\u0002H\u0003\"\u0004\b\u0000\u0010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u00032\u0006\u0010\n\u001a\u0002H\u0003H\u0016¢\u0006\u0002\u0010\u000b¨\u0006\f"}, d2 = {"com/ss/android/sdk/webview/DMTJsBridge$setup$jsBridge2$1", "Lcom/bytedance/ies/web/jsbridge2/IDataConverter;", "fromRawData", "T", "data", "", "type", "Ljava/lang/reflect/Type;", "(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;", "toRawData", "value", "(Ljava/lang/Object;)Ljava/lang/String;", "aweme-jsbridge_release"}, k = 1, mv = {1, 1, 15})
    public static final class c implements k {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ b f30725a;

        c(b bVar) {
            this.f30725a = bVar;
        }

        @NotNull
        public final <T> String a(T t) {
            String json = this.f30725a.a().toJson((Object) t);
            Intrinsics.checkExpressionValueIsNotNull(json, "gson.toJson(value)");
            return json;
        }

        public final <T> T a(@NotNull String str, @NotNull Type type) {
            Intrinsics.checkParameterIsNotNull(str, "data");
            Intrinsics.checkParameterIsNotNull(type, "type");
            return this.f30725a.a().fromJson(str, type);
        }
    }

    public final Gson a() {
        return (Gson) this.j.getValue();
    }

    @NotNull
    public final b b() {
        a aVar = this.g;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        List<String> b2 = aVar.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "jsMessageHandler!!.addPublicFunc()");
        if (this.h) {
            j a2 = o.a(this.f30720c).a("ToutiaoJSBridge").a((k) new c(this));
            a aVar2 = this.g;
            if (aVar2 == null) {
                Intrinsics.throwNpe();
            }
            this.i = p.a(this.f30720c, a2.a((Collection<String>) aVar2.c()).b((Collection<String>) b2).a(false).b(true).a());
            p pVar = this.i;
            if (pVar == null) {
                Intrinsics.throwNpe();
            }
            this.f30719b = pVar.f20681a;
        } else {
            this.f30719b = com.bytedance.ies.f.a.a.a(this.f30720c);
        }
        com.bytedance.ies.f.a.a aVar3 = this.f30719b;
        if (aVar3 == null) {
            Intrinsics.throwNpe();
        }
        if (this.g == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.ies.f.a.a a3 = aVar3.a(a.a()).a(this.f30722f).a(this.f30721e);
        a aVar4 = this.g;
        if (aVar4 == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.ies.f.a.a a4 = a3.a((f) aVar4);
        a aVar5 = this.g;
        if (aVar5 == null) {
            Intrinsics.throwNpe();
        }
        com.bytedance.ies.f.a.a a5 = a4.a(aVar5.c());
        Intrinsics.checkExpressionValueIsNotNull(a5, "iesJsBridge!!.setBridgeS…essageHandler!!.safeHost)");
        a5.b(b2);
        return this;
    }

    @NotNull
    public final b a(boolean z) {
        this.h = z;
        return this;
    }

    @NotNull
    public final b a(@NotNull WebChromeClient webChromeClient) {
        Intrinsics.checkParameterIsNotNull(webChromeClient, "webChromeClient");
        this.f30722f = webChromeClient;
        return this;
    }

    public b(@NotNull WebView webView) {
        Intrinsics.checkParameterIsNotNull(webView, "webView");
        this.f30720c = webView;
    }

    @NotNull
    public final b a(@NotNull WebViewClient webViewClient) {
        Intrinsics.checkParameterIsNotNull(webViewClient, "webViewClient");
        this.f30721e = webViewClient;
        return this;
    }

    @NotNull
    public final b a(@NotNull a aVar) {
        Intrinsics.checkParameterIsNotNull(aVar, "jsMessageHandler");
        this.g = aVar;
        return this;
    }

    public final boolean a(@Nullable String str) {
        if (this.f30719b == null) {
            return false;
        }
        com.bytedance.ies.f.a.a aVar = this.f30719b;
        if (aVar == null) {
            Intrinsics.throwNpe();
        }
        return aVar.d(str);
    }

    @NotNull
    public final b a(@Nullable String str, @Nullable d dVar) {
        if (this.i != null) {
            p pVar = this.i;
            if (pVar == null) {
                Intrinsics.throwNpe();
            }
            pVar.a(str, dVar);
        } else {
            com.bytedance.ies.f.a.a aVar = this.f30719b;
            if (aVar != null) {
                aVar.a(str, dVar);
            }
        }
        return this;
    }

    public final void a(@NotNull String str, @NotNull String... strArr) {
        Intrinsics.checkParameterIsNotNull(str, PushConstants.MZ_PUSH_MESSAGE_METHOD);
        Intrinsics.checkParameterIsNotNull(strArr, "params");
        com.bytedance.ies.f.a.a aVar = this.f30719b;
        if (aVar != null) {
            aVar.a(str, (String[]) Arrays.copyOf(strArr, strArr.length));
        }
    }
}
