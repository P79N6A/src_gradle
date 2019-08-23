package com.ss.android.ugc.aweme.web.jsbridge;

import android.text.TextUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.ss.android.common.lib.AppLogNewUtils;
import org.json.JSONObject;

public final class ah implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76691a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        h hVar2 = hVar;
        if (PatchProxy.isSupport(new Object[]{hVar2, jSONObject}, this, f76691a, false, 90026, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar2, jSONObject}, this, f76691a, false, 90026, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (hVar2.f20623d != null) {
            String optString = hVar2.f20623d.optString("tag");
            if (!TextUtils.isEmpty(optString)) {
                AppLogNewUtils.onEventV3(optString, hVar2.f20623d.optJSONObject(PushConstants.EXTRA));
            }
        }
    }
}
