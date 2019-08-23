package com.bytedance.android.livesdk.browser.jsbridge.newmethods;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.ies.f.b.d;
import com.bytedance.ies.f.b.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public final class x extends d<JSONObject, Object> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f9625a;

    @Nullable
    public final /* synthetic */ Object invoke(@NonNull Object obj, @NonNull f fVar) throws Exception {
        JSONObject jSONObject = (JSONObject) obj;
        if (PatchProxy.isSupport(new Object[]{jSONObject, fVar}, this, f9625a, false, 3700, new Class[]{JSONObject.class, f.class}, Object.class)) {
            return PatchProxy.accessDispatch(new Object[]{jSONObject, fVar}, this, f9625a, false, 3700, new Class[]{JSONObject.class, f.class}, Object.class);
        }
        String optString = jSONObject.optString("eventName");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        Iterator<String> keys = optJSONObject.keys();
        HashMap hashMap = new HashMap();
        while (keys.hasNext()) {
            String next = keys.next();
            String optString2 = optJSONObject.optString(next);
            keys.remove();
            hashMap.put(next, optString2);
        }
        hashMap.put("sdk_version", "1150");
        hashMap.put("_param_live_platform", "live");
        TTLiveSDKContext.getHostService().d().a(optString, hashMap);
        return null;
    }
}
