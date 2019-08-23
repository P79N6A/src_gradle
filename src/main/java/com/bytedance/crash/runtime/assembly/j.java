package com.bytedance.crash.runtime.assembly;

import android.content.Context;
import com.bytedance.crash.d;
import com.bytedance.crash.e.a;
import com.bytedance.crash.e.c;
import com.bytedance.crash.i.k;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class j extends c {
    public final a a(a aVar) {
        a a2 = super.a(aVar);
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(a2.f19417a);
        try {
            jSONObject.put("data", jSONArray);
            c a3 = c.a(this.f19523b);
            a3.a((Map) com.bytedance.crash.j.a().a());
            a3.a(com.bytedance.crash.j.c().a()).put("launch_did", com.bytedance.crash.g.a.a(this.f19523b));
            a3.a(this.f19524c.c());
            k.a(a2, null, this.f19522a);
            jSONObject.put("header", a3.f19421a);
        } catch (Throwable unused) {
        }
        return new a(jSONObject);
    }

    j(Context context, b bVar, BatteryWatcher batteryWatcher) {
        super(d.LAUNCH, context, bVar, batteryWatcher);
    }
}
