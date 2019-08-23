package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONObject;

public final class l extends d<Object, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9602a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        if (PatchProxy.isSupport(new Object[]{obj, fVar}, this, f9602a, false, 3680, new Class[]{Object.class, f.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{obj, fVar}, this, f9602a, false, 3680, new Class[]{Object.class, f.class}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        Map<String, String> b2 = TTLiveSDKContext.getHostService().l().b("https://hotsoon.snssdk.com");
        if (b2 == null) {
            return jSONObject;
        }
        for (Map.Entry next : b2.entrySet()) {
            jSONObject2.put((String) next.getKey(), next.getValue());
        }
        jSONObject.put("token", jSONObject2);
        return jSONObject;
    }
}
