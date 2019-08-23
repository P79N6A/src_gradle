package com.bytedance.common.wschannel.log;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.message.log.c;
import org.json.JSONException;
import org.json.JSONObject;

public class WsChannelLog {
    public static void onEventV3(String str, JSONObject jSONObject) {
        if (!StringUtils.isEmpty(str)) {
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            JSONObject jSONObject2 = jSONObject;
            try {
                jSONObject2.put("_event_v3", 1);
            } catch (JSONException unused) {
            }
            c.a(null, "event_v3", str, null, 0, 0, jSONObject2);
        }
    }

    public static void onEventV3Bundle(String str, Bundle bundle) {
        if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, bundle.get(str2));
                    }
                }
            } catch (Throwable unused) {
            }
            c.a(null, "event_v3", str, null, 0, 0, jSONObject);
        }
    }

    public static void onEventV3Bundle(Context context, String str, Bundle bundle) {
        if (!StringUtils.isEmpty(str)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("_event_v3", 1);
                if (bundle != null) {
                    for (String str2 : bundle.keySet()) {
                        jSONObject.put(str2, bundle.get(str2));
                    }
                }
            } catch (Throwable unused) {
            }
            c.a(context, "event_v3", str, null, 0, 0, jSONObject);
        }
    }
}
