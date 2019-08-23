package com.ss.c.a.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a extends Error {
    public int code;
    public Map info;
    public long timeStamp = System.currentTimeMillis();

    public final String getInfoJSON() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("timestamp", this.timeStamp);
            jSONObject.put("message", super.toString());
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final String toString() {
        if (this.info == null) {
            this.info = new HashMap();
        }
        JSONObject jSONObject = new JSONObject(this.info);
        try {
            jSONObject.put("message", super.toString());
            jSONObject.put("code", this.code);
            jSONObject.put("timestamp", this.timeStamp);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public a(int i, String str, Map<String, String> map) {
        super(str);
        this.code = i;
        this.info = map;
    }
}
