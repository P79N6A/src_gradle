package com.ss.android.ugc.aweme.plugin.g;

import android.text.TextUtils;
import com.bytedance.framwork.core.monitor.MonitorUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f59347a;

    public static void a(String str, String str2, int i, int i2, String str3, String str4, long j) {
        String str5 = str;
        String str6 = str2;
        int i3 = i2;
        String str7 = str3;
        String str8 = str4;
        if (PatchProxy.isSupport(new Object[]{str5, str6, Integer.valueOf(i), Integer.valueOf(i2), str7, str8, -1L}, null, f59347a, true, 64724, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, str6, Integer.valueOf(i), Integer.valueOf(i2), str7, str8, -1L}, null, f59347a, true, 64724, new Class[]{String.class, String.class, Integer.TYPE, Integer.TYPE, String.class, String.class, Long.TYPE}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str2)) {
            JSONObject jSONObject = null;
            if (!TextUtils.isEmpty(str3)) {
                jSONObject = new JSONObject();
                try {
                    jSONObject.put("plugin_name", str6);
                    jSONObject.put("plugin_version_code", i);
                    jSONObject.put("event_name", str7);
                    jSONObject.put("status_value", i3);
                    jSONObject.put("duration_value", -1);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject.put("plugin_message", str8);
                    }
                } catch (JSONException unused) {
                }
            }
            MonitorUtils.monitorStatusRate(str5, i3, jSONObject);
        }
    }

    public static void a(String str, int i, String str2, int i2, String str3, long j, boolean z, boolean z2, int i3, Map<String, String> map) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3, new Long(j2), Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i3), map}, null, f59347a, true, 64726, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, Integer.valueOf(i), str2, Integer.valueOf(i2), str3, new Long(j2), Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i3), map}, null, f59347a, true, 64726, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Long.TYPE, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Map.class}, Void.TYPE);
            return;
        }
        a(str, i, str2, i2, str3, j, 0, null, z, z2, i3, map);
    }

    public static void a(String str, int i, String str2, int i2, String str3, long j, int i3, String str4, boolean z, boolean z2, int i4, Map<String, String> map) {
        JSONObject jSONObject;
        String str5 = str;
        String str6 = str2;
        int i5 = i2;
        String str7 = str3;
        long j2 = j;
        String str8 = str4;
        Map<String, String> map2 = map;
        if (PatchProxy.isSupport(new Object[]{str5, Integer.valueOf(i), str6, Integer.valueOf(i2), str7, new Long(j2), Integer.valueOf(i3), str8, Byte.valueOf(z ? (byte) 1 : 0), Byte.valueOf(z2 ? (byte) 1 : 0), Integer.valueOf(i4), map2}, null, f59347a, true, 64727, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str5, Integer.valueOf(i), str6, Integer.valueOf(i2), str7, new Long(j2), Integer.valueOf(i3), str8, Byte.valueOf(z), Byte.valueOf(z2), Integer.valueOf(i4), map2}, null, f59347a, true, 64727, new Class[]{String.class, Integer.TYPE, String.class, Integer.TYPE, String.class, Long.TYPE, Integer.TYPE, String.class, Boolean.TYPE, Boolean.TYPE, Integer.TYPE, Map.class}, Void.TYPE);
        } else if (!TextUtils.isEmpty(str)) {
            String replaceAll = str5.replaceAll("\\.", "_");
            if (map2 == null || map.isEmpty()) {
                jSONObject = new JSONObject();
            } else {
                jSONObject = new JSONObject(map2);
            }
            if (!TextUtils.isEmpty(str2)) {
                try {
                    jSONObject.put("plugin_name", replaceAll);
                    jSONObject.put("plugin_version_code", i);
                    jSONObject.put("event_name", str6);
                    jSONObject.put("status_value", i5);
                    jSONObject.put("duration_value", String.valueOf(j));
                    jSONObject.put("is_preload", z);
                    jSONObject.put("wifi_only", z2);
                    jSONObject.put("failed_count", String.valueOf(i4));
                    if (!TextUtils.isEmpty(str3)) {
                        jSONObject.put("plugin_message", str7);
                    }
                    jSONObject.put("plugin_status_value", i3);
                    if (!TextUtils.isEmpty(str4)) {
                        jSONObject.put("plugin_duration", str8);
                    }
                } catch (JSONException unused) {
                }
            }
            MonitorUtils.monitorStatusRate("plugin_stat", i5, jSONObject);
        }
    }
}
