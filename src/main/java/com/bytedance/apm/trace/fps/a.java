package com.bytedance.apm.trace.fps;

import com.bytedance.apm.d.b.c;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.frameworks.apm.trace.MethodTracer;
import com.bytedance.frameworks.apm.trace.g;
import com.bytedance.frameworks.apm.trace.i;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final g.a f19076a = new g.a() {
        public final void a(g gVar) {
            try {
                if (gVar.f19664a == i.NORMAL && ApmDelegate.getInstance().getTraceConfig().f2087d) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("stack", gVar.f19666c);
                    jSONObject.put("stack_key", gVar.f19665b);
                    jSONObject.put("scene", gVar.f19667d);
                    jSONObject.put("cost_time", gVar.f19669f);
                    jSONObject.put("method_time", gVar.h);
                    jSONObject.put("timestamp", gVar.f19668e);
                    jSONObject.put("event_type", "lag_drop_frame");
                    com.bytedance.apm.d.a.a.b().a(new c("drop_frame_stack", jSONObject));
                }
            } catch (Exception unused) {
            }
        }
    };

    public static void a(boolean z, String str, long j) {
        if (z) {
            MethodTracer.getInstance().doFrame(z, str, j, f19076a);
            return;
        }
        MethodTracer.getInstance().doFrame(false, null, 0, null);
    }
}
