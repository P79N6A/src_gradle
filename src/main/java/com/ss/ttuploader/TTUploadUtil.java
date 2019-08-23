package com.ss.ttuploader;

import com.bytedance.common.utility.StringUtils;
import java.util.Map;
import org.json.JSONObject;

public class TTUploadUtil {
    public static JSONObject mapToJSON(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                Object obj = map.get(next);
                if (!StringUtils.isEmpty(next)) {
                    jSONObject.put(next, obj);
                }
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public static String mapToString(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String next : map.keySet()) {
                Object obj = map.get(next);
                if (!StringUtils.isEmpty(next)) {
                    jSONObject.put(next, obj);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }
}
