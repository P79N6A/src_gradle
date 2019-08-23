package com.ss.android.ugc.aweme.q;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.common.util.ToolUtils;
import com.ss.android.ugc.aweme.app.k;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.UUID;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3831a;

    /* renamed from: b  reason: collision with root package name */
    static String f3832b = UUID.randomUUID().toString();

    public static void a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f3831a, true, 54884, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2}, null, f3831a, true, 54884, new Class[]{String.class}, Void.TYPE);
        } else if (MonitorUtils.getLogTypeSwitch("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", f3832b);
                jSONObject.put("kv_perf_report_type", 3);
                jSONObject.put("kv_perf_name", str2);
                jSONObject.put("kv_perf_value", ToolUtils.getCurProcessName(k.b()));
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter, true);
                com.google.a.a.a.a.a.a.a((Throwable) new RuntimeException("report " + str2), printWriter);
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            MonitorUtils.monitorCommonLog("aweme_keva_monitor_report", jSONObject);
        }
    }
}
