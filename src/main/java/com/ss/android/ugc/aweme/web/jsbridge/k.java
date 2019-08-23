package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.commercialize.b.b;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public final class k implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76794a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76794a, false, 89944, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76794a, false, 89944, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (hVar2.f20623d.optInt("submit_result") == 1) {
            bg.a(new b());
        }
    }
}
