package com.monitor.cloudmessage.b.a.a;

import com.monitor.cloudmessage.e.f;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("used_memory", ((Runtime.getRuntime().totalMemory() / 1024) / 1024) + "MB");
            jSONObject.put("total_memory", ((Runtime.getRuntime().maxMemory() / 1024) / 1024) + "MB");
            jSONObject.put("sd_all_size", f.a()[0] + "MB");
            jSONObject.put("sd_avail_size", f.a()[1] + "MB");
            String[] c2 = f.c();
            String str = "";
            for (int i = 0; i < 2; i++) {
                String str2 = c2[i];
                str = str + str2 + "  ";
            }
            jSONObject.put("cpu_info", str);
            jSONObject.put("kernel_version", f.b()[0]);
            jSONObject.put("firmware_version", f.b()[1]);
            jSONObject.put("model", f.b()[2]);
            jSONObject.put("system_version", f.b()[3]);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}
