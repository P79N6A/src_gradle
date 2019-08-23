package com.ss.android.ugc.aweme.miniapp.f;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final class d implements com.ss.android.ugc.aweme.miniapp_api.a.d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3585a;

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f3585a, false, 59421, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f3585a, false, 59421, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, jSONObject);
    }
}
