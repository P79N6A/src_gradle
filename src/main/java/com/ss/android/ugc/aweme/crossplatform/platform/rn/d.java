package com.ss.android.ugc.aweme.crossplatform.platform.rn;

import android.support.annotation.Nullable;
import android.util.Log;
import com.bytedance.article.common.monitor.stack.ExceptionMonitor;
import com.bytedance.ies.geckoclient.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.d.c;
import com.ss.android.ugc.aweme.app.n;
import com.ss.android.ugc.aweme.fe.b.e;
import com.ss.android.ugc.aweme.framework.a.a;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.lancet.h;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

public final class d implements com.ss.android.ugc.aweme.framework.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f40842a;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x004c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004d A[RETURN] */
    @android.support.annotation.Nullable
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f40842a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r4 = 0
            r5 = 34343(0x8627, float:4.8125E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f40842a
            r5 = 0
            r6 = 34343(0x8627, float:4.8125E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class<java.lang.String> r8 = java.lang.String.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L_0x0028:
            com.ss.android.ugc.aweme.framework.services.ServiceManager r0 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()
            java.lang.Class<com.bytedance.ies.geckoclient.f> r1 = com.bytedance.ies.geckoclient.f.class
            java.lang.Object r0 = r0.getService(r1)
            com.bytedance.ies.geckoclient.f r0 = (com.bytedance.ies.geckoclient.f) r0
            r1 = 0
            if (r0 == 0) goto L_0x0045
            java.lang.String r2 = "rn_base_android"
            com.bytedance.ies.geckoclient.model.d r0 = r0.a((java.lang.String) r2)
            if (r0 != 0) goto L_0x0040
            goto L_0x0045
        L_0x0040:
            java.lang.String r0 = com.ss.android.ugc.aweme.crossplatform.platform.rn.b.c(r0)
            goto L_0x0046
        L_0x0045:
            r0 = r1
        L_0x0046:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L_0x004d
            return r1
        L_0x004d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.crossplatform.platform.rn.d.a():java.lang.String");
    }

    @Nullable
    public final String b() {
        if (PatchProxy.isSupport(new Object[0], this, f40842a, false, 34344, new Class[0], String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[0], this, f40842a, false, 34344, new Class[0], String.class);
        }
        f fVar = (f) ServiceManager.get().getService(f.class);
        String str = null;
        if (fVar != null) {
            com.bytedance.ies.geckoclient.model.d a2 = fVar.a("rn_snapshot");
            if (a2 != null) {
                str = b.a(a2, "blobdata");
            }
        }
        return str;
    }

    public final void a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, this, f40842a, false, 34345, new Class[]{Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j2)}, this, f40842a, false, 34345, new Class[]{Long.TYPE}, Void.TYPE);
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("load_time", j2);
        } catch (JSONException unused) {
        }
        n.a("react_page_load_time", jSONObject);
    }

    public final void a(Exception exc, Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{exc, map}, this, f40842a, false, 34346, new Class[]{Exception.class, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{exc, map}, this, f40842a, false, 34346, new Class[]{Exception.class, Map.class}, Void.TYPE);
            return;
        }
        e eVar = e.f44417b;
        if (PatchProxy.isSupport(new Object[]{exc, map}, eVar, e.f44416a, false, 39904, new Class[]{Exception.class, Map.class}, Void.TYPE)) {
            Object[] objArr = {exc, map};
            e eVar2 = eVar;
            ChangeQuickRedirect changeQuickRedirect = e.f44416a;
            PatchProxy.accessDispatch(objArr, eVar2, changeQuickRedirect, false, 39904, new Class[]{Exception.class, Map.class}, Void.TYPE);
            return;
        }
        c a2 = c.a();
        if (map != null) {
            for (Map.Entry next : map.entrySet()) {
                a2.a((String) next.getKey(), next.getValue().toString());
            }
        }
        if (exc != null) {
            a2.a("msg_type", "error").a("error_desc", Log.getStackTraceString(exc));
        }
        Intrinsics.checkExpressionValueIsNotNull(a2, "build");
        HashMap<String, Object> hashMap = a2.f34112b;
        Intrinsics.checkExpressionValueIsNotNull(hashMap, "build.hasMap");
        if (!hashMap.isEmpty()) {
            n.a("aweme_rn_log", a2.b());
            Throwable th = exc;
            a.a((Throwable) new h(th));
            ExceptionMonitor.ensureNotReachHere(th, "aweme_rn_log");
        }
    }
}
