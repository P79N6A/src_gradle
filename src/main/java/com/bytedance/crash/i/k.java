package com.bytedance.crash.i;

import android.text.TextUtils;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.event.b;
import com.bytedance.crash.j;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import org.json.JSONException;
import org.json.JSONObject;

public final class k {
    public static void a(a aVar, c cVar, d dVar) {
        if (aVar != null && aVar.f19417a != null && dVar != null) {
            JSONObject jSONObject = aVar.f19417a;
            long optLong = jSONObject.optLong("crash_time");
            int c2 = b.c(b.b("aid"));
            String a2 = j.c().a();
            if (optLong > 0 && c2 > 0 && !TextUtils.isEmpty(a2) && !PushConstants.PUSH_TYPE_NOTIFY.equals(a2) && !TextUtils.isEmpty(dVar.getName())) {
                try {
                    String str = "android_" + c2 + "_" + a2 + "_" + optLong + "_" + dVar;
                    if (cVar != null) {
                        JSONObject jSONObject2 = cVar.f19421a;
                        if (jSONObject2 != null) {
                            jSONObject2.put("unique_key", str);
                        }
                    } else {
                        jSONObject.put("unique_key", str);
                    }
                } catch (JSONException unused) {
                }
            }
        }
    }
}
