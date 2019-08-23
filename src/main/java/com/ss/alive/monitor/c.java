package com.ss.alive.monitor;

import android.content.Context;
import android.content.Intent;
import com.bytedance.common.utility.Logger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {
    public static void a(Context context, JSONObject jSONObject) {
        try {
            if (jSONObject.optInt("code", -1) == 0) {
                JSONArray optJSONArray = jSONObject.optJSONArray("actions");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                        if (optJSONObject != null && "show_messge".equals(optJSONObject.optString("action_type"))) {
                            JSONArray optJSONArray2 = optJSONObject.optJSONArray("messages");
                            if (optJSONArray2 != null) {
                                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                                    try {
                                        String optString = optJSONArray2.optString(i2);
                                        Logger.debug();
                                        JSONObject jSONObject2 = new JSONObject(optString);
                                        jSONObject2.put("is_local_push", 1);
                                        Intent intent = new Intent("com.ss.android.message");
                                        intent.putExtra("message_data", jSONObject2.toString());
                                        intent.setPackage(context.getPackageName());
                                        context.startService(intent);
                                    } catch (JSONException unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } catch (Exception unused2) {
        }
    }
}
