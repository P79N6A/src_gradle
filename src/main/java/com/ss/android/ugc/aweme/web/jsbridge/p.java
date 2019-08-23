package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.web.jsbridge.b.a;
import com.ss.android.ugc.aweme.web.jsbridge.b.b;
import com.ss.android.ugc.aweme.web.jsbridge.b.c;
import org.json.JSONObject;

public final class p implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76810a;

    /* renamed from: b  reason: collision with root package name */
    private a f76811b;

    /* renamed from: c  reason: collision with root package name */
    private a.b f76812c;

    public p(com.bytedance.ies.f.a.a aVar, a.b bVar) {
        this.f76811b = aVar;
        this.f76812c = bVar;
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        b bVar;
        h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f76810a, false, 89963, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f76810a, false, 89963, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        try {
            hVar2.f20625f = false;
            com.bytedance.ies.f.a.a aVar = this.f76811b;
            a.b bVar2 = this.f76812c;
            if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2, aVar, bVar2}, null, com.ss.android.ugc.aweme.web.jsbridge.b.a.f76726a, true, 90054, new Class[]{h.class, JSONObject.class, com.bytedance.ies.f.a.a.class, a.b.class}, b.class)) {
                bVar = (b) PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2, aVar, bVar2}, null, com.ss.android.ugc.aweme.web.jsbridge.b.a.f76726a, true, 90054, new Class[]{h.class, JSONObject.class, com.bytedance.ies.f.a.a.class, a.b.class}, b.class);
            } else {
                String a2 = com.ss.android.ugc.aweme.web.jsbridge.b.a.a(hVar);
                char c2 = 65535;
                if (a2.hashCode() == 3708) {
                    if (a2.equals("v2")) {
                        c2 = 0;
                    }
                }
                if (c2 != 0) {
                    bVar = new c(hVar2, jSONObject2, aVar, bVar2);
                } else {
                    bVar = new com.ss.android.ugc.aweme.web.jsbridge.b.d(hVar2, jSONObject2, aVar, bVar2);
                }
            }
            bVar.a();
        } catch (Exception unused) {
        }
    }
}
