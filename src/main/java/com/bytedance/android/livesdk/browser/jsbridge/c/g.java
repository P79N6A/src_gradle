package com.bytedance.android.livesdk.browser.jsbridge.c;

import android.text.TextUtils;
import com.bytedance.android.livesdk.browser.jsbridge.a.b;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;

public final class g implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9467a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject2}, this, f9467a, false, 3644, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject2}, this, f9467a, false, 3644, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        String str = "in_room_dialog";
        String str2 = "H5";
        String str3 = "H5";
        String str4 = "H5";
        if (!(hVar2 == null || hVar2.f20623d == null)) {
            if (TextUtils.equals("new_page", hVar2.f20623d.optString("type", ""))) {
                str = "new_page";
            }
            str2 = hVar2.f20623d.optString("enter_from", "H5");
            str3 = hVar2.f20623d.optString("click_type", "H5");
            JSONObject optJSONObject = hVar2.f20623d.optJSONObject("args");
            if (optJSONObject != null) {
                str4 = optJSONObject.optString("charge_reason", "H5");
            }
        }
        a.a().a((Object) new b(str, str2, str3, str4));
        jSONObject2.put("code", 1);
    }
}
