package com.ss.android.ugc.aweme.effectplatform;

import com.google.common.a.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.ugc.aweme.base.n;
import com.ss.android.ugc.aweme.shortvideo.bi;
import com.ss.android.ugc.effectmanager.common.e.c;
import com.ss.android.ugc.effectmanager.effect.b.k;
import com.ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\u0002\u0010\u0005J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016J\u0012\u0010\u0013\u001a\u00020\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchPanelInfoListener;", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchPanelInfoListener;", "panel", "", "delegate", "(Ljava/lang/String;Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchPanelInfoListener;)V", "getDelegate", "()Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchPanelInfoListener;", "getPanel", "()Ljava/lang/String;", "stopwatch", "Lcom/google/common/base/Stopwatch;", "generateFinalExtra", "Lorg/json/JSONObject;", "extra", "onFail", "", "e", "Lcom/ss/android/ugc/effectmanager/common/task/ExceptionResult;", "onSuccess", "response", "Lcom/ss/android/ugc/effectmanager/effect/model/PanelInfoModel;", "Companion", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public class l implements k {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f43865a;

    /* renamed from: d  reason: collision with root package name */
    public static final a f43866d = new a((byte) 0);
    @NotNull

    /* renamed from: b  reason: collision with root package name */
    public final String f43867b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final k f43868c;

    /* renamed from: e  reason: collision with root package name */
    private final q f43869e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, d2 = {"Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchPanelInfoListener$Companion;", "", "()V", "wrap", "Lcom/ss/android/ugc/aweme/effectplatform/MonitoredFetchPanelInfoListener;", "panel", "", "listener", "Lcom/ss/android/ugc/effectmanager/effect/listener/IFetchPanelInfoListener;", "tools.dmt-av-impl_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f43870a;

        private a() {
        }

        public /* synthetic */ a(byte b2) {
            this();
        }
    }

    private final JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, this, f43865a, false, 39008, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, this, f43865a, false, 39008, new Class[]{JSONObject.class}, JSONObject.class);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", "ttlive_sdk");
            if (jSONObject2 != null) {
                jSONObject3.put(PushConstants.EXTRA, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    public final void a(@Nullable c cVar) {
        String str;
        int i;
        if (PatchProxy.isSupport(new Object[]{cVar}, this, f43865a, false, 39010, new Class[]{c.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{cVar}, this, f43865a, false, 39010, new Class[]{c.class}, Void.TYPE);
            return;
        }
        if (cVar == null) {
            i = -2;
            str = "unknown error";
        } else {
            i = cVar.f77315a;
            str = cVar.f77316b;
            Intrinsics.checkExpressionValueIsNotNull(str, "e.msg");
        }
        n.a("sticker_list_error_rate", 1, new bi().a("errorCode", Integer.valueOf(i)).a("errorDesc", str).a("panel", this.f43867b).b());
        JSONObject b2 = new bi().a("error_code", Integer.valueOf(i)).a("error_msg", str).a("panel_type", this.f43867b).b();
        n.a("ttlive_load_sticker_list_all", 1, null, a(b2));
        n.a("ttlive_load_sticker_list_error", 1, b2);
        k kVar = this.f43868c;
        if (kVar != null) {
            kVar.a(cVar);
        }
    }

    public final void a(@Nullable PanelInfoModel panelInfoModel) {
        if (PatchProxy.isSupport(new Object[]{panelInfoModel}, this, f43865a, false, 39009, new Class[]{PanelInfoModel.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{panelInfoModel}, this, f43865a, false, 39009, new Class[]{PanelInfoModel.class}, Void.TYPE);
            return;
        }
        long a2 = this.f43869e.a(TimeUnit.MILLISECONDS);
        k kVar = this.f43868c;
        if (kVar != null) {
            kVar.a(panelInfoModel);
        }
        JSONObject b2 = new bi().a("duration", Long.valueOf(a2)).a("panel", this.f43867b).b();
        n.a("sticker_list_error_rate", 0, b2);
        n.a("ttlive_load_sticker_list_all", 0, b2, a(new bi().a("panel_type", this.f43867b).b()));
    }

    private l(String str, k kVar) {
        this.f43867b = str;
        this.f43868c = kVar;
        q b2 = q.b();
        Intrinsics.checkExpressionValueIsNotNull(b2, "Stopwatch.createStarted()");
        this.f43869e = b2;
    }

    public /* synthetic */ l(String str, k kVar, byte b2) {
        this(str, kVar);
    }
}
