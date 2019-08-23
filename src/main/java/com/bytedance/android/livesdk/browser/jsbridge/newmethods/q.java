package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.bytedance.android.livesdk.g.c;
import com.bytedance.android.livesdk.u.a;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONObject;

public final class q extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9610a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9610a, false, 3691, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9610a, false, 3691, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        String optString = jSONObject.optString("type");
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        char c2 = 65535;
        if (optString.hashCode() == -806191449 && optString.equals("recharge")) {
            c2 = 0;
        }
        if (c2 == 0 && TextUtils.equals(optJSONObject.optString("status"), PushConstants.PUSH_TYPE_THROUGH_MESSAGE)) {
            a.a().a((Object) new c(1, true));
        }
        return null;
    }
}
