package com.bytedance.apm.agent.a;

import com.bytedance.apm.agent.b.a;
import com.bytedance.apm.internal.ApmDelegate;
import org.json.JSONObject;

public final class b {
    public static void a(Object obj, boolean z) {
        String str;
        String str2;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = obj.getClass().getName();
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (obj instanceof a) {
                jSONObject.put("label", ((a) obj).a());
            }
        } catch (Exception unused) {
        }
        if (z) {
            str2 = "page_show";
        } else {
            str2 = "page_hide";
        }
        if (ApmDelegate.getInstance().getTraceListener() != null && z) {
            ApmDelegate.getInstance().getTraceListener();
        }
        a.a(str2, str, jSONObject);
    }
}
