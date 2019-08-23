package com.bytedance.apm.a.b;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    public static boolean a(String str, String str2, String str3, List<String> list, String str4, JSONObject jSONObject) {
        try {
            b bVar = new b("http://mon.snssdk.com/monitor/collect/c/logcollect", "UTF-8", false);
            bVar.a("aid", str);
            bVar.a("device_id", str2);
            bVar.a("os", "Android");
            bVar.a("process_name", str3);
            for (String file : list) {
                File file2 = new File(file);
                if (file2.exists()) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("logtype", "alog");
                    hashMap.put("scene", str4);
                    hashMap.put("env", "params.txt");
                    bVar.a(file2.getName(), file2, hashMap);
                }
            }
            bVar.a(jSONObject);
            try {
                if (new JSONObject(bVar.a()).optInt("errno", -1) == 200) {
                    return true;
                }
            } catch (JSONException unused) {
            }
            return false;
        } catch (IOException unused2) {
            return false;
        }
    }
}
