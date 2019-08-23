package com.bytedance.apm.perf;

import android.os.Process;
import com.bytedance.apm.d.b.e;
import com.ss.android.common.util.ToolUtils;
import java.io.File;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private com.bytedance.apm.f.c f2065a;

    /* renamed from: d  reason: collision with root package name */
    private long f2066d = 300;

    /* renamed from: e  reason: collision with root package name */
    private long f2067e = 60;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2068f = true;

    /* access modifiers changed from: protected */
    public final boolean c() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final long d() {
        return this.f2067e * 1000;
    }

    public final void e() {
        boolean z;
        if (this.f2068f) {
            File file = new File("/proc/stat");
            if (!file.exists() || !file.canRead()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                this.f2068f = false;
                g();
                h();
                return;
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        long a2 = com.bytedance.apm.k.c.a();
        long a3 = com.bytedance.apm.k.c.a(Process.myPid());
        try {
            Thread.sleep(360);
        } catch (InterruptedException unused) {
        }
        long a4 = com.bytedance.apm.k.c.a() - a2;
        if (a4 > 0) {
            double a5 = (double) (com.bytedance.apm.k.c.a(Process.myPid()) - a3);
            Double.isNaN(a5);
            double d2 = (double) a4;
            Double.isNaN(d2);
            double d3 = (a5 * 1.0d) / d2;
            if (this.f2065a == null) {
                com.bytedance.apm.f.c cVar = new com.bytedance.apm.f.c(currentTimeMillis, d3, d3, d3);
                this.f2065a = cVar;
                return;
            }
            this.f2065a.f18988b++;
            this.f2065a.f18991e += d3;
            if (this.f2065a.f18990d > d3) {
                this.f2065a.f18990d = d3;
            }
            if (this.f2065a.f18989c < d3) {
                this.f2065a.f18989c = d3;
            }
            if (currentTimeMillis - this.f2065a.f18987a > this.f2066d * 1000) {
                double d4 = this.f2065a.f18991e;
                double d5 = (double) this.f2065a.f18988b;
                Double.isNaN(d5);
                float f2 = (float) (d4 / d5);
                float f3 = (float) this.f2065a.f18989c;
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("app_usage_rate", (double) f2);
                    jSONObject.put("app_max_usage_rate", (double) f3);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("process_name", ToolUtils.getCurProcessName(com.bytedance.apm.c.a()));
                    jSONObject2.put("is_main_process", ToolUtils.isMainProcess(com.bytedance.apm.c.a()));
                    e eVar = new e();
                    eVar.f18959a = "cpu";
                    eVar.f18960b = "cpu_monitor";
                    eVar.f18962d = jSONObject;
                    eVar.f18963e = jSONObject2;
                    a(eVar);
                } catch (JSONException unused2) {
                }
                this.f2065a = null;
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(JSONObject jSONObject) {
        long optLong = jSONObject.optLong("cpu_monitor_interval", 300);
        long optLong2 = jSONObject.optLong("cpu_sample_interval", 60);
        if (optLong > 0) {
            this.f2066d = optLong;
        }
        if (optLong2 > 0) {
            this.f2067e = optLong2;
        }
    }
}
