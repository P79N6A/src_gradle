package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.fe.a.a;
import com.ss.android.ugc.aweme.live.authentication.model.b;
import com.ss.android.ugc.aweme.utils.bg;
import org.json.JSONObject;

public final class ab implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76676a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76676a, false, 90017, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76676a, false, 90017, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (hVar2.f20623d.has("agreement") && hVar2.f20623d.getInt("agreement") == 0) {
            b.a().f53325b.live_agreement = true;
            SharePrefCache.inst().liveAgreement().a(Boolean.TRUE);
            SharePrefCache.inst().liveAnswer().a(Boolean.TRUE);
            bg.a(new a(-1));
            bg.a(new com.ss.android.ugc.aweme.live.authentication.model.a());
        }
        hVar2.f20625f = false;
    }
}
