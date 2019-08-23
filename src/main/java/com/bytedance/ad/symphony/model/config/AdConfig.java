package com.bytedance.ad.symphony.model.config;

import com.bytedance.ad.symphony.b;
import com.bytedance.ad.symphony.g.d;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AdConfig {

    /* renamed from: a  reason: collision with root package name */
    public int f7654a;

    /* renamed from: b  reason: collision with root package name */
    public long f7655b;

    /* renamed from: c  reason: collision with root package name */
    public long f7656c;

    /* renamed from: d  reason: collision with root package name */
    public String f7657d;

    /* renamed from: e  reason: collision with root package name */
    public String f7658e;

    /* renamed from: f  reason: collision with root package name */
    public HashMap<String, a> f7659f = new HashMap<>();
    public String g;
    private String h;

    @Retention(RetentionPolicy.CLASS)
    public @interface ConfigType {
    }

    public String toString() {
        if (this.h == null) {
            return "";
        }
        return this.h;
    }

    public final a a(String str) {
        return this.f7659f.get(a.a(str));
    }

    public static Map<String, List<String>> a(JSONArray jSONArray) {
        HashMap hashMap = new HashMap();
        if (jSONArray == null) {
            return hashMap;
        }
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("config_type");
                ArrayList arrayList = new ArrayList();
                JSONArray optJSONArray = optJSONObject.optJSONArray("contain_placement_types");
                if (!(optString == null || optJSONArray == null)) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        String optString2 = optJSONArray.optString(i2);
                        if (optString2 != null) {
                            arrayList.add(optString2);
                        }
                    }
                    if (!d.a(arrayList)) {
                        hashMap.put(optString, arrayList);
                    }
                }
            }
        }
        new StringBuilder("config-->").append(hashMap);
        return hashMap;
    }

    public static List<AdConfig> a(JSONArray jSONArray, @ConfigType int i) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i2);
                if (optJSONObject != null) {
                    AdConfig a2 = a(optJSONObject, i);
                    if (a2 != null) {
                        arrayList.add(a2);
                    }
                }
            }
        }
        return arrayList;
    }

    private static AdConfig a(JSONObject jSONObject, @ConfigType int i) {
        a aVar;
        if (jSONObject != null) {
            try {
                AdConfig adConfig = new AdConfig();
                adConfig.f7654a = jSONObject.getInt("provider_id");
                adConfig.f7655b = jSONObject.optLong("expire_time");
                adConfig.f7656c = jSONObject.optLong("request_timeout");
                adConfig.f7657d = jSONObject.optString("mid");
                adConfig.f7658e = jSONObject.optString("app_id");
                adConfig.h = jSONObject.toString();
                if (b.b()) {
                    adConfig.g = jSONObject.optString("test_key");
                }
                JSONArray optJSONArray = jSONObject.optJSONArray("placements");
                if (optJSONArray != null) {
                    for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                        JSONObject jSONObject2 = optJSONArray.getJSONObject(i2);
                        if (i == 2) {
                            aVar = new b(jSONObject2);
                        } else {
                            aVar = new a(jSONObject2);
                        }
                        if (aVar.a()) {
                            adConfig.f7659f.put(aVar.f7661b, aVar);
                        }
                    }
                }
                return adConfig;
            } catch (JSONException unused) {
                new StringBuilder("adconfig json is not valid,json:").append(jSONObject.toString());
            }
        }
        return null;
    }
}
