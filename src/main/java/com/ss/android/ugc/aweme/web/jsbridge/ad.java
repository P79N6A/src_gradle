package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.feed.y;
import org.json.JSONObject;

public final class ad implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76682a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76682a, false, 90022, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76682a, false, 90022, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        y.a(true);
    }
}
