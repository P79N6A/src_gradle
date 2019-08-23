package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J(\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020!H\u0016R(\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006%"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/AbstractSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IInternalReporter;", "logType", "", "reportor", "Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;", "(Ljava/lang/String;Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;)V", "value", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "currentSession", "getCurrentSession", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "setCurrentSession", "(Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;)V", "getLogType", "()Ljava/lang/String;", "getReportor", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/Reportor;", "end", "", "loadUri", "uri", "Landroid/net/Uri;", "navigateToUri", "onApiComplete", "request", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiRequest;", "error", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiResultException;", "report", "service", "category", "Lorg/json/JSONObject;", "metrics", "extra", "Companion", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class f extends a implements g {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f49980e;
    public static final List<Function1<Uri, Boolean>> i = CollectionsKt.listOf(b.INSTANCE);
    public static final a j = new a((byte) 0);
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public k f49981f;
    @NotNull
    public final String g;
    @NotNull
    public final o h;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\b\u001a\u0004\u0018\u00010\u0006*\u00020\u0006R \u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00050\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/HybridMonitorSession$Companion;", "", "()V", "uriIgnorance", "", "Lkotlin/Function1;", "Landroid/net/Uri;", "", "takeIfNotIgnored", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f49982a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        @Nullable
        public final Uri a(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, f49982a, false, 49921, new Class[]{Uri.class}, Uri.class)) {
                return (Uri) PatchProxy.accessDispatch(new Object[]{uri2}, this, f49982a, false, 49921, new Class[]{Uri.class}, Uri.class);
            }
            Intrinsics.checkParameterIsNotNull(uri2, "$this$takeIfNotIgnored");
            for (Function1<Uri, Boolean> invoke : f.i) {
                if (((Boolean) invoke.invoke(uri2)).booleanValue()) {
                    return null;
                }
            }
            return uri2;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "uri", "Landroid/net/Uri;", "invoke"}, k = 3, mv = {1, 1, 15})
    static final class b extends Lambda implements Function1<Uri, Boolean> {
        public static final b INSTANCE = new b();
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(invoke((Uri) obj));
        }

        public final boolean invoke(@NotNull Uri uri) {
            Uri uri2 = uri;
            if (PatchProxy.isSupport(new Object[]{uri2}, this, changeQuickRedirect, false, 49922, new Class[]{Uri.class}, Boolean.TYPE)) {
                return ((Boolean) PatchProxy.accessDispatch(new Object[]{uri2}, this, changeQuickRedirect, false, 49922, new Class[]{Uri.class}, Boolean.TYPE)).booleanValue();
            }
            Intrinsics.checkParameterIsNotNull(uri2, "uri");
            return Intrinsics.areEqual((Object) uri.toString(), (Object) "about:blank");
        }
    }

    public final void b() {
        if (PatchProxy.isSupport(new Object[0], this, f49980e, false, 49916, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f49980e, false, 49916, new Class[0], Void.TYPE);
            return;
        }
        super.b();
        a((k) null);
    }

    private void a(@Nullable k kVar) {
        if (PatchProxy.isSupport(new Object[]{kVar}, this, f49980e, false, 49915, new Class[]{k.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{kVar}, this, f49980e, false, 49915, new Class[]{k.class}, Void.TYPE);
            return;
        }
        k kVar2 = this.f49981f;
        if (kVar2 != null) {
            kVar2.b();
        }
        if (kVar != null) {
            kVar.a(a());
        }
        this.f49981f = kVar;
    }

    public final void b(@NotNull Uri uri) {
        Uri uri2 = uri;
        if (PatchProxy.isSupport(new Object[]{uri2}, this, f49980e, false, 49918, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri2}, this, f49980e, false, 49918, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(uri2, "uri");
        Uri a2 = j.a(uri2);
        if (a2 != null) {
            k kVar = this.f49981f;
            if (kVar != null) {
                kVar.b(a2);
            }
        }
    }

    public final void a(@NotNull Uri uri) {
        if (PatchProxy.isSupport(new Object[]{uri}, this, f49980e, false, 49917, new Class[]{Uri.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{uri}, this, f49980e, false, 49917, new Class[]{Uri.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Uri a2 = j.a(uri);
        if (a2 != null) {
            if ("react-native".equals(uri.getScheme())) {
                a((k) new n(a2, this, this.f49981f));
            } else {
                a((k) new e(a2, this, this.f49981f));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public f(@NotNull String str, @NotNull o oVar) {
        super(null, 1);
        Intrinsics.checkParameterIsNotNull(str, "logType");
        Intrinsics.checkParameterIsNotNull(oVar, "reportor");
        this.g = str;
        this.h = oVar;
    }

    public final void a(@NotNull b bVar, @Nullable c cVar) {
        b bVar2 = bVar;
        c cVar2 = cVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, cVar2}, this, f49980e, false, 49919, new Class[]{b.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, cVar2}, this, f49980e, false, 49919, new Class[]{b.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "request");
        k kVar = this.f49981f;
        if (kVar != null) {
            kVar.a(bVar2, cVar2);
        }
    }

    public final void a(@NotNull String str, @NotNull JSONObject jSONObject, @NotNull JSONObject jSONObject2, @NotNull JSONObject jSONObject3) {
        String str2 = str;
        JSONObject jSONObject4 = jSONObject;
        JSONObject jSONObject5 = jSONObject2;
        JSONObject jSONObject6 = jSONObject3;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject4, jSONObject5, jSONObject6}, this, f49980e, false, 49920, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, jSONObject4, jSONObject5, jSONObject6}, this, f49980e, false, 49920, new Class[]{String.class, JSONObject.class, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "service");
        Intrinsics.checkParameterIsNotNull(jSONObject4, "category");
        Intrinsics.checkParameterIsNotNull(jSONObject5, "metrics");
        Intrinsics.checkParameterIsNotNull(jSONObject6, PushConstants.EXTRA);
        try {
            jSONObject4.put("session_id", a());
            this.h.a(this.g, str, jSONObject, jSONObject2, jSONObject3);
        } catch (JSONException unused) {
        }
    }
}
