package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.live.authentication.model.a;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public final class v implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76838a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76838a, false, 89985, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76838a, false, 89985, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (hVar2.f20623d.has("answer") && hVar2.f20623d.getBoolean("answer")) {
            b.a().f53325b.live_answer = true;
            SharePrefCache.inst().liveAnswer().a(Boolean.TRUE);
            bg.a(new a());
        }
        hVar2.f20625f = false;
    }
}
