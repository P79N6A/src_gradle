package com.ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.ag.j;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0002R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/ss/android/ugc/aweme/web/jsbridge/OpenSchoolEditMethod;", "Lcom/bytedance/ies/web/jsbridge/IJavaMethod;", "mContextRef", "Ljava/lang/ref/WeakReference;", "Landroid/content/Context;", "(Ljava/lang/ref/WeakReference;)V", "call", "", "msg", "Lcom/bytedance/ies/web/jsbridge/JsMsg;", "res", "Lorg/json/JSONObject;", "jumpToSchoolEdit", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class y implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76842a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f76843b;

    public y(@NotNull WeakReference<Context> weakReference) {
        Intrinsics.checkParameterIsNotNull(weakReference, "mContextRef");
        this.f76843b = weakReference;
    }

    public final void call(@NotNull h hVar, @NotNull JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76842a, false, 90007, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76842a, false, 90007, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        Intrinsics.checkParameterIsNotNull(hVar, "msg");
        Intrinsics.checkParameterIsNotNull(jSONObject, "res");
        if (this.f76843b.get() != null) {
            if (PatchProxy.isSupport(new Object[0], this, f76842a, false, 90008, new Class[0], Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[0], this, f76842a, false, 90008, new Class[0], Void.TYPE);
                return;
            }
            com.ss.android.ugc.aweme.ag.h a2 = com.ss.android.ugc.aweme.ag.h.a();
            Object obj = this.f76843b.get();
            if (obj != null) {
                a2.a((Activity) obj, j.a("aweme://profile_edit").a("jump_school_edit", 1).a());
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
        }
    }
}
