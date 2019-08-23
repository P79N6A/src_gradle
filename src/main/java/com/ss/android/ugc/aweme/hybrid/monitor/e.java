package com.ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0016J\u001a\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016J\"\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u001a"}, d2 = {"Lcom/ss/android/ugc/aweme/hybrid/monitor/H5MonitorSession;", "Lcom/ss/android/ugc/aweme/hybrid/monitor/UnitAbstractSession;", "uri", "Landroid/net/Uri;", "reporter", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IInternalReporter;", "preSession", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;", "(Landroid/net/Uri;Lcom/ss/android/ugc/aweme/hybrid/monitor/IInternalReporter;Lcom/ss/android/ugc/aweme/hybrid/monitor/IUnitSession;)V", "getReporter", "()Lcom/ss/android/ugc/aweme/hybrid/monitor/IInternalReporter;", "begin", "", "id", "", "onApiComplete", "request", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiRequest;", "error", "Lcom/ss/android/ugc/aweme/hybrid/monitor/ApiResultException;", "report", "service", "identifier", "Lcom/ss/android/ugc/aweme/hybrid/monitor/IJsonFormatable;", "category", "Lorg/json/JSONObject;", "aweme-hybrid-monitor_release"}, k = 1, mv = {1, 1, 15})
public final class e extends p {

    /* renamed from: e  reason: collision with root package name */
    public static ChangeQuickRedirect f49978e;
    @NotNull

    /* renamed from: f  reason: collision with root package name */
    public final g f49979f;

    public final void a(@NotNull String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, this, f49978e, false, 49912, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, this, f49978e, false, 49912, new Class[]{String.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str2, "id");
        super.a(str);
        a("hybrid_app_monitor_load_url_event", c(), null);
    }

    public final void a(@NotNull b bVar, @Nullable c cVar) {
        b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{bVar2, cVar}, this, f49978e, false, 49913, new Class[]{b.class, c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{bVar2, cVar}, this, f49978e, false, 49913, new Class[]{b.class, c.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(bVar2, "request");
        h d2 = d();
        JSONObject jSONObject = new JSONObject();
        d.a(jSONObject, bVar.getFormatData());
        if (cVar == null) {
            jSONObject.put("error_type", "success");
        } else {
            d.a(jSONObject, cVar.getFormatData());
        }
        a("hybrid_app_monitor_fetch_api_error", d2, jSONObject);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(@NotNull Uri uri, @NotNull g gVar, @Nullable k kVar) {
        super(uri, kVar);
        Intrinsics.checkParameterIsNotNull(uri, "uri");
        Intrinsics.checkParameterIsNotNull(gVar, "reporter");
        this.f49979f = gVar;
    }

    private void a(@NotNull String str, @NotNull h hVar, @Nullable JSONObject jSONObject) {
        JSONObject jSONObject2;
        String str2;
        String str3 = str;
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{str3, hVar2, jSONObject}, this, f49978e, false, 49914, new Class[]{String.class, h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, hVar2, jSONObject}, this, f49978e, false, 49914, new Class[]{String.class, h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(str, "service");
        Intrinsics.checkParameterIsNotNull(hVar2, "identifier");
        g gVar = this.f49979f;
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        jSONObject2.put("type", "h5");
        if (this.f49970d == null) {
            str2 = "origin";
        } else {
            str2 = "fallback";
        }
        jSONObject2.put("is_fallback", str2);
        d.a(jSONObject2, hVar.getFormatData());
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put(TimeDisplaySetting.TIME_DISPLAY_SETTING, System.currentTimeMillis());
        gVar.a(str, jSONObject2, jSONObject3, jSONObject4);
    }
}
