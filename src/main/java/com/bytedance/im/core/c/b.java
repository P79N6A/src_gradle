package com.bytedance.im.core.c;

import java.util.Map;
import org.json.JSONObject;

public interface b {
    void a(Object obj);

    void a(String str, String str2, Throwable th);

    void a(String str, String str2, Map<String, Object> map, Map<String, Object> map2);

    void a(String str, String str2, JSONObject jSONObject);

    void a(String str, JSONObject jSONObject, JSONObject jSONObject2);
}
