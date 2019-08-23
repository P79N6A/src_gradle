package com.ss.android.ugc.aweme.net.a;

import android.content.Context;
import com.bytedance.ies.net.cronet.a;
import com.bytedance.ies.net.cronet.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends a {

    /* renamed from: b  reason: collision with root package name */
    public static ChangeQuickRedirect f56836b;

    public b(Context context) {
        super(context);
    }

    public final void a(long j, long j2, String str, String str2, String str3, com.bytedance.ttnet.b.b bVar, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j3 = j;
        long j4 = j2;
        com.bytedance.ttnet.b.b bVar2 = bVar;
        if (PatchProxy.isSupport(new Object[]{new Long(j3), new Long(j4), str, str2, str3, bVar2, jSONObject}, this, f56836b, false, 60859, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, com.bytedance.ttnet.b.b.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, bVar2, jSONObject}, this, f56836b, false, 60859, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, com.bytedance.ttnet.b.b.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        try {
            if (com.bytedance.ttnet.b.a()) {
                jSONObject2.put("netClientType", "CronetClient");
            } else {
                jSONObject2.put("netClientType", "TTOkhttp3Client");
            }
            jSONObject2.put("networkQuality", com.facebook.d.a.b.a().b().toString());
            jSONObject2.put("downloadSpeed", (int) com.facebook.d.a.b.a().c());
            jSONObject2.put("useTTNetExecutor", j.a().q);
            if (bVar2 != null) {
                jSONObject2.put("addExecutorToAllInterceptors", bVar2.f19733d - bVar2.f19732c);
                jSONObject2.put("addExecutorTime", bVar2.f19732c);
                jSONObject2.put("allInterceptorsTime", bVar2.f19733d);
            }
        } catch (JSONException unused) {
        }
        n.a(j, j2, str, str3, str2, 200, jSONObject2);
    }

    public final void a(long j, long j2, String str, String str2, String str3, com.bytedance.ttnet.b.b bVar, Throwable th, JSONObject jSONObject) {
        JSONObject jSONObject2;
        long j3 = j;
        long j4 = j2;
        com.bytedance.ttnet.b.b bVar2 = bVar;
        Throwable th2 = th;
        Object[] objArr = {new Long(j3), new Long(j4), str, str2, str3, bVar2, th2, jSONObject};
        if (PatchProxy.isSupport(objArr, this, f56836b, false, 60860, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, com.bytedance.ttnet.b.b.class, Throwable.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{new Long(j3), new Long(j4), str, str2, str3, bVar2, th2, jSONObject}, this, f56836b, false, 60860, new Class[]{Long.TYPE, Long.TYPE, String.class, String.class, String.class, com.bytedance.ttnet.b.b.class, Throwable.class, JSONObject.class}, Void.TYPE);
            return;
        }
        int a2 = c.a(th2, new String[]{str3});
        if (jSONObject == null) {
            jSONObject2 = new JSONObject();
        } else {
            jSONObject2 = jSONObject;
        }
        if (th2 != null) {
            try {
                jSONObject2.put("errorDesc", th.toString());
                jSONObject2.put("networkQuality", com.facebook.d.a.b.a().b().toString());
                jSONObject2.put("downloadSpeed", (int) com.facebook.d.a.b.a().c());
                if (com.bytedance.ttnet.b.a()) {
                    jSONObject2.put("netClientType", "CronetClient");
                } else {
                    jSONObject2.put("netClientType", "TTOkhttp3Client");
                }
                jSONObject2.put("useTTNetExecutor", j.a().q);
                if (bVar2 != null) {
                    jSONObject2.put("addExecutorToAllInterceptors", bVar2.f19733d - bVar2.f19732c);
                    jSONObject2.put("addExecutorTime", bVar2.f19732c);
                    jSONObject2.put("allInterceptorsTime", bVar2.f19733d);
                }
            } catch (JSONException unused) {
            }
        }
        long j5 = j;
        long j6 = j2;
        String str4 = str;
        String str5 = str3;
        String str6 = str2;
        int i = a2;
        JSONObject jSONObject3 = jSONObject2;
        n.b(j5, j6, str4, str5, str6, i, jSONObject2);
        n.a(j5, j6, str4, str5, str6, i, jSONObject2);
    }
}
