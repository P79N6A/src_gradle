package com.ss.android.ugc.aweme.web.jsbridge;

import com.bytedance.common.utility.StringUtils;
import com.bytedance.ies.f.a.d;
import com.bytedance.ies.f.a.h;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.applog.NetUtil;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class b implements d {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f76725a;

    public final void call(h hVar, JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{hVar, jSONObject2}, this, f76725a, false, 89921, new Class[]{h.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{hVar, jSONObject2}, this, f76725a, false, 89921, new Class[]{h.class, JSONObject.class}, Void.TYPE);
            return;
        }
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f76725a, true, 89922, new Class[]{JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {jSONObject2};
            PatchProxy.accessDispatch(objArr, null, f76725a, true, 89922, new Class[]{JSONObject.class}, Void.TYPE);
            return;
        }
        HashMap hashMap = new HashMap();
        NetUtil.putCommonParams(hashMap, false);
        for (Map.Entry entry : hashMap.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(str2)) {
                try {
                    jSONObject2.put(str, str2);
                } catch (JSONException unused) {
                }
            }
        }
        try {
            jSONObject2.put("code", 1);
        } catch (JSONException unused2) {
        }
    }
}
