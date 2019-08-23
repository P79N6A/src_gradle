package com.ss.android.ugc.aweme.sdk.b;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.base.n;
import org.json.JSONObject;

public final class b implements a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f63705a;

    public final void a(String str, int i, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), jSONObject}, this, f63705a, false, 71058, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), jSONObject}, this, f63705a, false, 71058, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a(str, i, jSONObject);
    }
}
