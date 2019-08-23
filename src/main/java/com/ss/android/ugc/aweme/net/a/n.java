package com.ss.android.ugc.aweme.net.a;

import com.bytedance.ttnet.TTNetInit;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.net.ab;
import org.json.JSONObject;

public final /* synthetic */ class n implements ab.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56861a;

    /* renamed from: b  reason: collision with root package name */
    static final ab.a f56862b = new n();

    private n() {
    }

    public final void a(String str, String str2, JSONObject jSONObject) {
        String str3 = str;
        String str4 = str2;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str3, str4, jSONObject2}, this, f56861a, false, 60902, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str3, str4, jSONObject2}, this, f56861a, false, 60902, new Class[]{String.class, String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        TTNetInit.getTTNetDepend().a(j.a().f56867b, str3, str4, jSONObject2);
    }
}
