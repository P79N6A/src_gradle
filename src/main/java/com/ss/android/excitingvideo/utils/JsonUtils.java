package com.ss.android.excitingvideo.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class JsonUtils {
    public static List<String> jsonArrayToList(JSONArray jSONArray) {
        if (jSONArray == null) {
            return Collections.emptyList();
        }
        int length = jSONArray.length();
        ArrayList arrayList = new ArrayList(length);
        int i = 0;
        while (i < length) {
            try {
                arrayList.add(jSONArray.optString(i));
                i++;
            } catch (Exception unused) {
            }
        }
        return arrayList;
    }

    public static String mapToJSONString(Map map) {
        if (map == null) {
            return null;
        }
        try {
            return new JSONObject(map).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String toJSONString(String str, int i) {
        try {
            new JSONObject().put(str, i);
        } catch (JSONException unused) {
        }
        return "";
    }

    public static String toJSONString(String str, String str2) {
        try {
            new JSONObject().put(str, str2);
        } catch (JSONException unused) {
        }
        return "";
    }
}
