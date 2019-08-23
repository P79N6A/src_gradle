package com.bytedance.router.dynamic;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;
import com.bytedance.router.util.Logger;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class RouterConfig {
    private Map<String, String> mIncMapping = Collections.emptyMap();
    private Map<String, String> mRewriteMapping = Collections.emptyMap();
    private String mTag = "";

    public Map<String, String> getIncMapping() {
        return this.mIncMapping;
    }

    public Map<String, String> getRewriteMapping() {
        return this.mRewriteMapping;
    }

    public String toString() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("tag", this.mTag);
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.mIncMapping.entrySet()) {
                jSONArray.put(((String) next.getKey()) + "," + ((String) next.getValue()));
            }
            jSONObject.put("incMapping", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            for (Map.Entry next2 : this.mRewriteMapping.entrySet()) {
                jSONArray2.put(((String) next2.getKey()) + "," + ((String) next2.getValue()));
            }
            jSONObject.put("rewriteMapping", jSONArray2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }

    public static RouterConfig load(String str) {
        return parse(str);
    }

    public RouterConfig(String str) {
        this.mTag = str;
    }

    public void setIncMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mIncMapping = Collections.emptyMap();
        } else {
            this.mIncMapping = map;
        }
    }

    public void setRewriteMapping(Map<String, String> map) {
        if (map == null || map.size() == 0) {
            this.mRewriteMapping = Collections.emptyMap();
        } else {
            this.mRewriteMapping = map;
        }
    }

    private static RouterConfig parse(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            RouterConfig routerConfig = new RouterConfig(jSONObject.optString("tag"));
            routerConfig.setIncMapping(parseJsonArray(jSONObject.optJSONArray("incMapping")));
            routerConfig.setRewriteMapping(parseJsonArray(jSONObject.optJSONArray("rewriteMapping")));
            return routerConfig;
        } catch (JSONException unused) {
            Logger.e("DynamicMapping#load failed: " + str);
            return null;
        }
    }

    public static Map<String, String> parseJsonArray(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < jSONArray.length(); i++) {
            String optString = jSONArray.optString(i);
            if (!TextUtils.isEmpty(optString)) {
                String[] split = optString.split(",");
                if (split.length != 2) {
                    Logger.e("DynamicMapping#parseJsonArray illegal schema mapping: " + optString);
                } else if (split[0] == null || split[1] == null) {
                    Logger.e("DynamicMapping#parseJsonArray illegal schema mapping(null): " + optString);
                } else {
                    split[0] = split[0].trim();
                    split[1] = split[1].trim();
                    if (TextUtils.isEmpty(split[0]) || TextUtils.isEmpty(split[1])) {
                        Logger.e("DynamicMapping#parseJsonArray illegal schema mapping empty: " + optString);
                    } else {
                        hashMap.put(split[0], split[1]);
                    }
                }
            }
        }
        return hashMap;
    }

    public static boolean isExpired(Context context, RouterConfig routerConfig) {
        String str;
        if (context == null || routerConfig == null) {
            return true;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f);
            String str2 = "" + packageInfo.versionCode;
            try {
                if (context.getPackageManager().getApplicationInfo(context.getPackageName(), SearchJediMixFeedAdapter.f42517f).metaData != null) {
                    str = str2 + "_" + String.valueOf(r5.getInt("UPDATE_VERSION_CODE"));
                    if (TextUtils.isEmpty(str) && str.equals(routerConfig.mTag)) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception unused) {
            }
            str = str2;
        } catch (Exception unused2) {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return false;
    }
}
