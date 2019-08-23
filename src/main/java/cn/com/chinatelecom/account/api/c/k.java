package cn.com.chinatelecom.account.api.c;

import org.json.JSONException;
import org.json.JSONObject;

public class k {
    public static String a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("result", i);
            jSONObject.put("msg", str);
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }
}
