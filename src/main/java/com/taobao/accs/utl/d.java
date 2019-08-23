package com.taobao.accs.utl;

import org.json.JSONException;
import org.json.JSONObject;

public class d {

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        JSONObject f79101a = new JSONObject();

        public JSONObject a() {
            return this.f79101a;
        }

        public a a(String str, Integer num) {
            if (num == null) {
                return this;
            }
            try {
                this.f79101a.put(str, num);
            } catch (JSONException unused) {
            }
            return this;
        }

        public a a(String str, String str2) {
            if (!(str2 == null || str == null)) {
                try {
                    this.f79101a.put(str, str2);
                } catch (JSONException unused) {
                }
            }
            return this;
        }
    }

    public static String a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (jSONObject != null && jSONObject.has(str)) {
            return jSONObject.getString(str);
        }
        return str2;
    }
}
