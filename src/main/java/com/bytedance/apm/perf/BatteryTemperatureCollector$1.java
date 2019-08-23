package com.bytedance.apm.perf;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.apm.c;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.j.b;
import org.json.JSONObject;

class BatteryTemperatureCollector$1 extends BroadcastReceiver {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f19046a;

    BatteryTemperatureCollector$1(b bVar) {
        this.f19046a = bVar;
    }

    public void onReceive(Context context, Intent intent) {
        final float intExtra = ((float) intent.getIntExtra("temperature", 0)) / 10.0f;
        if (c.d()) {
            new String[1][0] = "BatteryTemperatureColle:  " + intExtra;
        }
        final String topActivityClassName = ActivityLifeObserver.getInstance().getTopActivityClassName();
        if (!TextUtils.isEmpty(topActivityClassName)) {
            b.a().a((Runnable) new Runnable() {
                public final void run() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("battery_temperature", (double) intExtra);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("scene", topActivityClassName);
                        com.bytedance.apm.b.b("temperature", jSONObject, jSONObject2, null);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }
}
