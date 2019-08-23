package com.ss.android.ttve.monitor;

import android.text.TextUtils;
import com.meituan.robust.PatchProxy;
import com.ss.android.medialib.log.d;
import com.ss.android.vesdk.y;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static int f31254a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static int f31255b = 1;

    /* renamed from: c  reason: collision with root package name */
    public static WeakReference<IMonitor> f31256c = null;

    /* renamed from: d  reason: collision with root package name */
    private static String f31257d = "";

    public static void a() {
        TEMonitorInvoker.nativeReset();
    }

    public static boolean a(String str, String str2, long j) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Long.valueOf(j));
        return a(str, str2, (Map) hashMap);
    }

    public static boolean a(String str, String str2, float f2) {
        HashMap hashMap = new HashMap();
        hashMap.put(str2, Float.valueOf(f2));
        return a(str, str2, (Map) hashMap);
    }

    public static boolean a(String str, String str2, Map map) {
        return a(f31256c, str, str2, map);
    }

    private static boolean a(WeakReference<IMonitor> weakReference, String str, String str2, Map map) {
        JSONObject jSONObject = new JSONObject();
        try {
            if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("service", str2);
            }
            if (!str2.equals("iesve_veeditor_record_finish")) {
                if (!str2.equals("iesve_veeditor_composition_finish")) {
                    a(map, jSONObject);
                    a(weakReference, str, jSONObject);
                    return true;
                }
            }
            a(str2, map, jSONObject);
            a(weakReference, str, jSONObject);
            return true;
        } catch (JSONException unused) {
            y.b("TEMonitor", "No monitor callback, skip");
            return false;
        }
    }

    private static void a(Map map, JSONObject jSONObject) throws JSONException {
        int i;
        Map map2 = map;
        JSONObject jSONObject2 = jSONObject;
        for (String str : map.keySet()) {
            if (str.startsWith("iesve_")) {
                if (PatchProxy.isSupport(new Object[]{str}, null, d.f29692a, true, 17468, new Class[]{String.class}, Integer.TYPE)) {
                    i = ((Integer) PatchProxy.accessDispatch(new Object[]{str}, null, d.f29692a, true, 17468, new Class[]{String.class}, Integer.TYPE)).intValue();
                } else if (d.f29696e.contains(str)) {
                    i = d.f29694c;
                } else if (d.f29697f.contains(str)) {
                    i = d.f29695d;
                } else {
                    i = d.f29693b;
                }
            } else {
                i = g.a(str);
            }
            if (i == g.f31265b) {
                try {
                    jSONObject2.put(str, Integer.parseInt((String) map2.get(str)));
                } catch (Exception unused) {
                    y.b("TEMonitor", "Parse int error:" + map2.get(str));
                }
            } else if (i == g.f31266c) {
                try {
                    jSONObject2.put(str, (double) Float.parseFloat((String) map2.get(str)));
                } catch (Exception unused2) {
                    y.b("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject2.put(str, map2.get(str));
            }
        }
    }

    private static String b() {
        return d.a("device_id");
    }

    public static void b(int i) {
        TEMonitorInvoker.nativeMonitorPerfWithType(i);
    }

    public static void d(int i) {
        TEMonitorInvoker.nativeReset(i);
    }

    public static void a(int i) {
        TEMonitorInvoker.nativeMonitorPerf(i);
    }

    private static int a(JSONObject jSONObject) {
        try {
            if (jSONObject.has("completed")) {
                return jSONObject.getInt("completed");
            }
            return 0;
        } catch (JSONException unused) {
            y.d("TEMonitor", "get complete filed error!");
            return 0;
        }
    }

    public static void c(int i) {
        if (i == 0) {
            a(0, "te_record_err_code", 0);
            return;
        }
        if (i == 1) {
            a(1, "te_edit_err_code", 0);
            a(1, "te_composition_err_code", 0);
        }
    }

    public static void a(String str, double d2) {
        if (TextUtils.isEmpty(str)) {
            y.c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(str, d2);
        }
    }

    public static void a(String str, long j) {
        if (TextUtils.isEmpty(str)) {
            y.c("TEMonitor", "perfLong: key is null");
        } else {
            TEMonitorInvoker.nativePerfLong(str, j);
        }
    }

    public static void a(int i, String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            TEMonitorInvoker.nativePerfLong(i, str, j);
        }
    }

    public static void a(int i, String str, double d2) {
        if (TextUtils.isEmpty(str)) {
            y.c("TEMonitor", "perfDouble: key is null");
        } else {
            TEMonitorInvoker.nativePerfDouble(i, str, d2);
        }
    }

    public static void a(int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            y.c("TEMonitor", "perfString: key is null");
            return;
        }
        if (str2 == null) {
            str2 = "";
        }
        TEMonitorInvoker.nativePerfString(i, str, str2);
    }

    private static void a(String str, Map map, JSONObject jSONObject) throws JSONException {
        int i;
        for (String str2 : map.keySet()) {
            if (!str.equals("iesve_veeditor_record_finish") && !str.equals("iesve_veeditor_composition_finish")) {
                i = g.a(str2);
            } else if (h.f31274e.contains(str2)) {
                i = h.f31271b;
            } else if (h.f31275f.contains(str2)) {
                i = h.f31272c;
            } else if (h.g.contains(str2)) {
                i = h.f31273d;
            } else {
                i = h.f31270a;
            }
            if (i == g.f31265b) {
                try {
                    jSONObject.put(str2, Integer.parseInt((String) map.get(str2)));
                } catch (Exception unused) {
                    y.b("TEMonitor", "Parse int error:" + map.get(str2));
                }
            } else if (i == g.f31266c) {
                try {
                    jSONObject.put(str2, (double) Float.parseFloat((String) map.get(str2)));
                } catch (Exception unused2) {
                    y.b("TEMonitor", "Parse float error");
                }
            } else {
                jSONObject.put(str2, map.get(str2));
            }
        }
    }

    static void a(WeakReference<IMonitor> weakReference, String str, JSONObject jSONObject) {
        int i;
        String str2 = "sdk_video_edit_compose";
        if (jSONObject != null) {
            i = a(jSONObject);
            try {
                if (jSONObject.has("service")) {
                    str2 = jSONObject.getString("service");
                }
                if (str2.equals("iesve_veeditor_record_finish") || str2.equals("iesve_veeditor_composition_finish")) {
                    if ("".equals(f31257d)) {
                        f31257d = b() + "_" + System.currentTimeMillis();
                    }
                    jSONObject.put("te_record_compose_vid", f31257d);
                }
                if (str2.equals("iesve_veeditor_composition_finish")) {
                    f31257d = "";
                }
            } catch (JSONException unused) {
            }
        } else {
            i = 0;
        }
        d.a(str2, i, jSONObject);
        if (!(weakReference == null || weakReference.get() == null)) {
            try {
                ((IMonitor) weakReference.get()).monitorLog(str, jSONObject);
            } catch (Exception unused2) {
            }
        }
    }
}
