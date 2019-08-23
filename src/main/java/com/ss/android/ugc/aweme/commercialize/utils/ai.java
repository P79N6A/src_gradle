package com.ss.android.ugc.aweme.commercialize.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ad.smartphone.a.g;
import com.ss.android.ugc.aweme.app.n;
import org.json.JSONObject;

public final /* synthetic */ class ai implements g {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f39695a;

    /* renamed from: b  reason: collision with root package name */
    static final g f39696b = new ai();

    private ai() {
    }

    public final void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject, null}, this, f39695a, false, 32565, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject, null}, this, f39695a, false, 32565, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        n.a("smart_phone_sdk", str2, null);
    }
}
