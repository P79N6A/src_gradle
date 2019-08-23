package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.promote.c;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public final class l implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76795a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76795a, false, 89945, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76795a, false, 89945, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        bg.a(new c());
    }
}
