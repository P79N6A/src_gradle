package com.ss.android.uniqueid.getphone;

import java.io.Serializable;
import org.json.JSONObject;

public final class a implements Serializable {
    public C0829a data = new C0829a();

    /* renamed from: com.ss.android.uniqueid.getphone.a$a  reason: collision with other inner class name */
    public static class C0829a implements Serializable {
        public int result;
        public int retry_delay;
    }

    public static a formJson(JSONObject jSONObject) {
        a aVar = new a();
        JSONObject optJSONObject = jSONObject.optJSONObject("data");
        if (optJSONObject == null) {
            return null;
        }
        aVar.data.retry_delay = optJSONObject.optInt("retry_delay", 0);
        aVar.data.result = optJSONObject.optInt("result", -1);
        return aVar;
    }
}
