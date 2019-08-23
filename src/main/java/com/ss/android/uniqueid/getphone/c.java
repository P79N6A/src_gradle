package com.ss.android.uniqueid.getphone;

import java.io.Serializable;
import org.json.JSONObject;

public final class c implements Serializable {
    public a data = new a();

    public static class a implements Serializable {
        public String mobile;
        public int result = 1;
    }

    public static c formJson(JSONObject jSONObject) {
        c cVar = new c();
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return null;
        }
        cVar.data.mobile = optJSONObject.optString("mobile", "");
        cVar.data.result = optJSONObject.optInt("result", 1);
        return cVar;
    }
}
