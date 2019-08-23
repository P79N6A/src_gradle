package com.bytedance.android.livesdk.browser.jsbridge.c;

import com.bytedance.android.live.core.utils.s;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdkapi.depend.model.b.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONException;
import org.json.JSONObject;

public final class i implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9470a;

    private int a(JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{jSONObject}, this, f9470a, false, 3655, new Class[]{JSONObject.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{jSONObject}, this, f9470a, false, 3655, new Class[]{JSONObject.class}, Integer.TYPE)).intValue();
        } else if (jSONObject == null) {
            return 0;
        } else {
            try {
                a aVar = (a) s.a(jSONObject.toString(), a.class);
                if (aVar != null) {
                    aVar.f18693e = a.C0136a.FromWeb;
                    TTLiveSDKContext.getHostService().k().a(aVar);
                }
                return 1;
            } catch (Exception unused) {
                return 0;
            }
        }
    }

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        int i = 0;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f9470a, false, 3654, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f9470a, false, 3654, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if ("follow".equals(hVar2.f20623d.getString("type"))) {
            i = a(hVar2.f20623d.getJSONObject("args"));
        }
        try {
            jSONObject2.put("code", i);
        } catch (JSONException unused) {
        }
    }
}
