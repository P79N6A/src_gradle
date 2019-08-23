package com.ss.android.ugc.aweme.q;

import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.bytedance.keva.KevaMonitor;
import com.google.a.a.a.a.a.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.PrintWriter;
import java.io.StringWriter;
import org.json.JSONObject;

public final class b extends KevaMonitor {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f3833a;

    public final void loadLibrary(String str) {
        if (PatchProxy.isSupport(new Object[]{str}, this, f3833a, false, 54887, new Class[]{String.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str}, this, f3833a, false, 54887, new Class[]{String.class}, Void.TYPE);
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary(str);
    }

    public final void reportThrowable(int i, String str, String str2, Object obj, Throwable th) {
        String str3 = str;
        String str4 = str2;
        Object obj2 = obj;
        Throwable th2 = th;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str3, str4, obj2, th2}, this, f3833a, false, 54886, new Class[]{Integer.TYPE, String.class, String.class, Object.class, Throwable.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str3, str4, obj2, th2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3833a, false, 54886, new Class[]{Integer.TYPE, String.class, String.class, Object.class, Throwable.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {Integer.valueOf(i), str3, str4, obj2, th2};
        if (PatchProxy.isSupport(objArr3, null, a.f3831a, true, 54881, new Class[]{Integer.TYPE, String.class, String.class, Object.class, Throwable.class}, Void.TYPE)) {
            Object[] objArr4 = {Integer.valueOf(i), str3, str4, obj2, th2};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, a.f3831a, true, 54881, new Class[]{Integer.TYPE, String.class, String.class, Object.class, Throwable.class}, Void.TYPE);
            return;
        }
        if (MonitorUtils.getLogTypeSwitch("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", a.f3832b);
                jSONObject.put("kv_perf_report_type", 0);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str3);
                jSONObject.put("kv_perf_key", str4);
                jSONObject.put("kv_perf_value", obj2);
                StringWriter stringWriter = new StringWriter();
                a.a(th2, new PrintWriter(stringWriter, true));
                jSONObject.put("kv_perf_msg", stringWriter.getBuffer().toString());
            } catch (Throwable unused) {
            }
            MonitorUtils.monitorCommonLog("aweme_keva_monitor_report", jSONObject);
        }
    }

    public final void reportWarning(int i, String str, String str2, Object obj, String str3) {
        String str4 = str;
        String str5 = str2;
        Object obj2 = obj;
        String str6 = str3;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i), str4, str5, obj2, str6}, this, f3833a, false, 54885, new Class[]{Integer.TYPE, String.class, String.class, Object.class, String.class}, Void.TYPE)) {
            Object[] objArr = {Integer.valueOf(i), str4, str5, obj2, str6};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, this, f3833a, false, 54885, new Class[]{Integer.TYPE, String.class, String.class, Object.class, String.class}, Void.TYPE);
            return;
        }
        Object[] objArr3 = {Integer.valueOf(i), str4, str5, obj2, str6};
        if (PatchProxy.isSupport(objArr3, null, a.f3831a, true, 54882, new Class[]{Integer.TYPE, String.class, String.class, Object.class, String.class}, Void.TYPE)) {
            Object[] objArr4 = {Integer.valueOf(i), str4, str5, obj2, str6};
            Object[] objArr5 = objArr4;
            PatchProxy.accessDispatch(objArr5, null, a.f3831a, true, 54882, new Class[]{Integer.TYPE, String.class, String.class, Object.class, String.class}, Void.TYPE);
            return;
        }
        if (MonitorUtils.getLogTypeSwitch("aweme_keva_monitor_report")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("kv_perf_global_id", a.f3832b);
                jSONObject.put("kv_perf_report_type", 1);
                jSONObject.put("kv_perf_value_type", String.valueOf(i));
                jSONObject.put("kv_perf_name", str4);
                jSONObject.put("kv_perf_key", str5);
                jSONObject.put("kv_perf_value", obj2);
                jSONObject.put("kv_perf_msg", str6);
            } catch (Throwable unused) {
            }
            MonitorUtils.monitorCommonLog("aweme_keva_monitor_report", jSONObject);
        }
    }
}
