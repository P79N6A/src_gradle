package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONObject;

public final class d extends com.bytedance.ies.f.b.d<Object, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9577a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj, fVar}, this, f9577a, false, 3663, new Class[]{Object.class, f.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{obj, fVar}, this, f9577a, false, 3663, new Class[]{Object.class, f.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        Map<String, String> a2 = TTLiveSDKContext.getHostService().h().a();
        for (String next : a2.keySet()) {
            String str = a2.get(next);
            if (!StringUtils.isEmpty(next) && !StringUtils.isEmpty(str)) {
                jSONObject.put(next, str);
            }
        }
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b2 = TTLiveSDKContext.getHostService().l().b("https://hotsoon.snssdk.com");
        if (b2 != null) {
            for (Map.Entry next2 : b2.entrySet()) {
                jSONObject2.put((String) next2.getKey(), next2.getValue());
            }
        }
        jSONObject.put("tt_token", jSONObject2);
        return jSONObject;
    }
}
