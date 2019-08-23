package com.bytedance.apm.perf;

import android.os.Debug;
import android.os.Process;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.apm.d.b.e;
import com.bytedance.apm.k.c;
import com.ss.android.common.util.ToolUtils;
import org.json.JSONException;
import org.json.JSONObject;

public final class d extends a {

    /* renamed from: a  reason: collision with root package name */
    private long f2069a = 30;

    /* access modifiers changed from: protected */
    public final boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.f2069a * 1000;
    }

    public final void e() {
        try {
            Debug.MemoryInfo a2 = c.a(Process.myPid(), com.bytedance.apm.c.a());
            if (a2 != null) {
                int i = a2.dalvikPss;
                if (i > 0) {
                    boolean z = !ActivityLifeObserver.getInstance().isV2Foreground();
                    int i2 = a2.nativePss;
                    int totalPss = a2.getTotalPss();
                    JSONObject jSONObject = new JSONObject();
                    if (z) {
                        jSONObject.put("dalvik_pss_background", ((long) i) * 1024);
                        jSONObject.put("native_pss_background", ((long) i2) * 1024);
                        jSONObject.put("total_pss_background", ((long) totalPss) * 1024);
                    } else {
                        jSONObject.put("dalvik_pss_foreground", ((long) i) * 1024);
                        jSONObject.put("native_pss_foreground", ((long) i2) * 1024);
                        jSONObject.put("total_pss_foreground", ((long) totalPss) * 1024);
                    }
                    long c2 = c.c();
                    if (c2 > 0) {
                        if (z) {
                            float f2 = (float) c2;
                            jSONObject.put("dalvik_pss_background_used_rate", (double) (((((float) i) * 1.0f) * 1024.0f) / f2));
                            if (i2 > 0) {
                                jSONObject.put("native_pss_background_used_rate", (double) (((((float) i2) * 1.0f) * 1024.0f) / f2));
                            }
                            if (totalPss > 0) {
                                jSONObject.put("total_pss_background_used_rate", (double) (((((float) totalPss) * 1.0f) * 1024.0f) / f2));
                            }
                        } else {
                            float f3 = (float) c2;
                            jSONObject.put("dalvik_pss_foreground_used_rate", (double) (((((float) i) * 1.0f) * 1024.0f) / f3));
                            if (i2 > 0) {
                                jSONObject.put("native_pss_foreground_used_rate", (double) (((((float) i2) * 1.0f) * 1024.0f) / f3));
                            }
                            if (totalPss > 0) {
                                jSONObject.put("total_pss_foreground_used_rate", (double) (((((float) totalPss) * 1.0f) * 1024.0f) / f3));
                            }
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("process_name", ToolUtils.getCurProcessName(com.bytedance.apm.c.a()));
                        jSONObject2.put("is_main_process", ToolUtils.isMainProcess(com.bytedance.apm.c.a()));
                        e eVar = new e("memory", "mem_monitor", false, jSONObject, jSONObject2, null);
                        a(eVar);
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("mem_monitor_interval", 30);
        if (optLong > 0) {
            this.f2069a = optLong;
        }
    }
}
