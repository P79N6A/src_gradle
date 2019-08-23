package com.ss.android.ugc.aweme.crossplatform;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.app.o;
import com.ss.android.ugc.aweme.hybrid.monitor.f;
import com.ss.android.ugc.aweme.hybrid.monitor.o;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0012\u001a\u00020\u000fJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0004J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0015\u001a\u00020\u0004R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;", "", "()V", "currentReactSessionId", "", "getCurrentReactSessionId", "()Ljava/lang/String;", "setCurrentReactSessionId", "(Ljava/lang/String;)V", "reportor", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;", "getReportor", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;", "sessions", "", "Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "getSessions", "()Ljava/util/Map;", "createSession", "endSession", "", "sessionId", "getSession", "Companion", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40656a;
    @NotNull

    /* renamed from: e  reason: collision with root package name */
    public static final Lazy f40657e = LazyKt.lazy(b.INSTANCE);

    /* renamed from: f  reason: collision with root package name */
    public static final C0524a f40658f = new C0524a((byte) 0);
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public String f40659b;
    @NotNull

    /* renamed from: c  reason: collision with root package name */
    public final Map<String, f> f40660c;
    @NotNull

    /* renamed from: d  reason: collision with root package name */
    public final o f40661d;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager$Companion;", "", "()V", "instance", "Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;", "getInstance", "()Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;", "instance$delegate", "Lkotlin/Lazy;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    /* renamed from: com.ss.android.ugc.aweme.crossplatform.a$a  reason: collision with other inner class name */
    public static final class C0524a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40662a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ KProperty[] f40663b = {Reflection.property1(new PropertyReference1Impl(Reflection.getOrCreateKotlinClass(C0524a.class), "instance", "getInstance()Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;"))};

        @NotNull
        public final a a() {
            Object value;
            if (PatchProxy.isSupport(new Object[0], this, f40662a, false, 34097, new Class[0], a.class)) {
                value = PatchProxy.accessDispatch(new Object[0], this, f40662a, false, 34097, new Class[0], a.class);
            } else {
                value = a.f40657e.getValue();
            }
            return (a) value;
        }

        private C0524a() {
        }

        public /* synthetic */ C0524a(byte b2) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/ss/android/ugc/aweme/crossplatform/MonitorSessionManager;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function0<a> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(0);
        }

        @NotNull
        public final a invoke() {
            if (!PatchProxy.isSupport(new Object[0], this, changeQuickRedirect, false, 34098, new Class[0], a.class)) {
                return new a((byte) 0);
            }
            return (a) PatchProxy.accessDispatch(new Object[0], this, changeQuickRedirect, false, 34098, new Class[0], a.class);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0016¨\u0006\u000b"}, d2 = {"com/ss/android/ugc/aweme/crossplatform/MonitorSessionManager$reportor$1", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;", "report", "", "logType", "", "service", "category", "Lorg/json/JSONObject;", "metrics", "extra", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class c implements o {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f40665a;

        c() {
        }

        public final void a(@NotNull String str, @NotNull String str2, @NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3) {
            String str3 = str;
            String str4 = str2;
            JSONObject jSONObject4 = jSONObject;
            JSONObject jSONObject5 = jSONObject2;
            JSONObject jSONObject6 = jSONObject3;
            if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject4, jSONObject5, jSONObject6}, this, f40665a, false, 34099, new Class[]{String.class, String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                Object[] objArr = {str3, str4, jSONObject4, jSONObject5, jSONObject6};
                Object[] objArr2 = objArr;
                PatchProxy.accessDispatch(objArr2, this, f40665a, false, 34099, new Class[]{String.class, String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "logType");
            Intrinsics.checkParameterIsNotNull(str4, "service");
            Intrinsics.checkParameterIsNotNull(jSONObject4, "category");
            Intrinsics.checkParameterIsNotNull(jSONObject5, "metrics");
            Intrinsics.checkParameterIsNotNull(jSONObject6, PushConstants.EXTRA);
            o.a aVar = com.ss.android.ugc.aweme.app.o.f34223a;
            if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject4, jSONObject5, jSONObject6}, aVar, o.a.f34224a, false, 22328, new Class[]{String.class, String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
                Object[] objArr3 = {str3, str4, jSONObject4, jSONObject5, jSONObject6};
                Object[] objArr4 = objArr3;
                o.a aVar2 = aVar;
                PatchProxy.accessDispatch(objArr4, aVar2, o.a.f34224a, false, 22328, new Class[]{String.class, String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
                return;
            }
            Intrinsics.checkParameterIsNotNull(str3, "logType");
            Intrinsics.checkParameterIsNotNull(str4, "serviceName");
            Intrinsics.checkParameterIsNotNull(jSONObject4, "category");
            Intrinsics.checkParameterIsNotNull(jSONObject5, "metric");
            Intrinsics.checkParameterIsNotNull(jSONObject6, "extraLog");
            JSONObject jSONObject7 = new JSONObject();
            jSONObject7.put("status", 0);
            jSONObject7.put("value", jSONObject6);
            jSONObject7.put("category", jSONObject4);
            jSONObject7.put("metric", jSONObject5);
            n.a(str3, str4, jSONObject7);
        }
    }

    private a() {
        this.f40660c = new LinkedHashMap();
        this.f40661d = new c();
    }

    @NotNull
    public final f a() {
        if (PatchProxy.isSupport(new Object[0], this, f40656a, false, 34094, new Class[0], f.class)) {
            return (f) PatchProxy.accessDispatch(new Object[0], this, f40656a, false, 34094, new Class[0], f.class);
        }
        f fVar = new f("ies_hybrid_monitor", this.f40661d);
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkExpressionValueIsNotNull(uuid, "UUID.randomUUID().toString()");
        fVar.a(uuid);
        this.f40660c.put(fVar.a(), fVar);
        return fVar;
    }

    public /* synthetic */ a(byte b2) {
        this();
    }

    public final boolean a(@NotNull String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f40656a, false, 34096, new Class[]{String.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{str}, this, f40656a, false, 34096, new Class[]{String.class}, Boolean.TYPE)).booleanValue();
        }
        Intrinsics.checkParameterIsNotNull(str, "sessionId");
        if (!this.f40660c.containsKey(str)) {
            return false;
        }
        f remove = this.f40660c.remove(str);
        if (remove != null) {
            remove.b();
        }
        return true;
    }
}
