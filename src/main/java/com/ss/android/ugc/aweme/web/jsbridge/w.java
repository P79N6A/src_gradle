package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.account.c;
import org.json.JSONObject;

public final class w implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76839a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject}, this, f76839a, false, 89996, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject}, this, f76839a, false, 89996, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        c.b().logout("h5");
    }
}
