package com.ss.android.ugc.aweme.m;

import com.bytedance.usergrowth.data.a.a.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

public final class a implements e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f54104a = null;

    /* renamed from: b  reason: collision with root package name */
    private static final String f54105b = "a";

    a() {
    }

    public final void a(String str, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, jSONObject}, this, f54104a, false, 49489, new Class[]{String.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, jSONObject}, this, f54104a, false, 49489, new Class[]{String.class, JSONObject.class}, Void.TYPE);
            return;
        }
        AppLogNewUtils.onEventV3(str, jSONObject);
    }
}
