package com.ss.android.agilelogger.b.b.a;

import org.json.JSONArray;
import org.json.JSONObject;

public final class a implements b {
    public final /* bridge */ /* synthetic */ String a(Object obj) {
        return a((String) obj);
    }

    private static String a(String str) {
        if (str == null || str.trim().length() == 0) {
            throw new com.ss.android.agilelogger.b.a("JSON empty.");
        }
        try {
            if (str.startsWith("{")) {
                return new JSONObject(str).toString(4);
            }
            if (str.startsWith("[")) {
                return new JSONArray(str).toString(4);
            }
            throw new com.ss.android.agilelogger.b.a("JSON should start with { or [, but found " + str);
        } catch (Exception e2) {
            throw new com.ss.android.agilelogger.b.a("Parse JSON error. JSON string:" + str, e2);
        }
    }
}
