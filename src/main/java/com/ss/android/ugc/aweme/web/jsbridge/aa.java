package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.poi.b.b;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public final class aa implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76675a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76675a, false, 90016, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76675a, false, 90016, new Class[]{h.class, JSONObject.class}, Void.TYPE);
        } else if (hVar2 != null && hVar2.f20623d != null) {
            try {
                bg.a(new b(hVar2.f20623d.optString("type"), hVar2.f20623d.optInt("result")));
            } catch (Exception unused) {
            }
        }
    }
}
