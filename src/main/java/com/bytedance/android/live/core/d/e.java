package com.bytedance.android.live.core.d;

import android.text.TextUtils;
import com.bytedance.android.live.core.c.a;
import com.bytedance.android.live.core.setting.CoreSettingKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f7842a;

    private static void a(String str, String str2, int i, JSONObject jSONObject) {
        if (PatchProxy.isSupport(new Object[]{str, str2, Integer.valueOf(i), jSONObject}, null, f7842a, true, 393, new Class[]{String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str, str2, Integer.valueOf(i), jSONObject}, null, f7842a, true, 393, new Class[]{String.class, String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
        }
    }

    public static void a(String str, int i, Map<String, Object> map) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), map}, null, f7842a, true, 379, new Class[]{String.class, Integer.TYPE, Map.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), map}, null, f7842a, true, 379, new Class[]{String.class, Integer.TYPE, Map.class}, Void.TYPE);
            return;
        }
        a(str2, i, a(map));
    }

    public static void a(String str, int i, JSONObject jSONObject) {
        String str2 = str;
        int i2 = i;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7842a, true, 380, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7842a, true, 380, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        JSONObject a2 = a(jSONObject);
        a("monitorStatus", str2, i2, a2);
        a().a(str2, i2, a2);
        if (b()) {
            a.b(a(str), b(str2, i2, null, jSONObject2));
        }
    }

    public static void a(String str, int i, long j) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, 0, new Long(j2)}, null, f7842a, true, 383, new Class[]{String.class, Integer.TYPE, Long.TYPE}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, 0, new Long(j2)}, null, f7842a, true, 383, new Class[]{String.class, Integer.TYPE, Long.TYPE}, Void.TYPE);
            return;
        }
        a(str2, 0, a(j), (JSONObject) null);
    }

    public static void a(String str, int i, long j, Map<String, Object> map) {
        String str2 = str;
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), new Long(j2), map}, null, f7842a, true, 385, new Class[]{String.class, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE)) {
            Object[] objArr = {str2, Integer.valueOf(i), new Long(j2), map};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f7842a, true, 385, new Class[]{String.class, Integer.TYPE, Long.TYPE, Map.class}, Void.TYPE);
            return;
        }
        a(str2, i, a(j), a(map));
    }

    public static void a(String str, int i, long j, JSONObject jSONObject) {
        String str2 = str;
        long j2 = j;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), new Long(j2), jSONObject2}, null, f7842a, true, 386, new Class[]{String.class, Integer.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE)) {
            Object[] objArr = {str2, Integer.valueOf(i), new Long(j2), jSONObject2};
            Object[] objArr2 = objArr;
            PatchProxy.accessDispatch(objArr2, null, f7842a, true, 386, new Class[]{String.class, Integer.TYPE, Long.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        a(str2, i, a(j), jSONObject2);
    }

    public static void a(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        JSONObject jSONObject3 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject2}, null, f7842a, true, 387, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject2}, null, f7842a, true, 387, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, Void.TYPE);
            return;
        }
        a().a(str2, i, jSONObject3, a(jSONObject2));
        if (b()) {
            a.b(a(str), b(str, i, jSONObject, jSONObject2));
        }
    }

    public static com.bytedance.android.live.base.b.a a() {
        if (PatchProxy.isSupport(new Object[0], null, f7842a, true, 389, new Class[0], com.bytedance.android.live.base.b.a.class)) {
            return (com.bytedance.android.live.base.b.a) PatchProxy.accessDispatch(new Object[0], null, f7842a, true, 389, new Class[0], com.bytedance.android.live.base.b.a.class);
        }
        return (com.bytedance.android.live.base.b.a) com.bytedance.android.live.base.a.a(com.bytedance.android.live.base.b.a.class);
    }

    public static boolean b() {
        boolean z = false;
        if (PatchProxy.isSupport(new Object[0], null, f7842a, true, 398, new Class[0], Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[0], null, f7842a, true, 398, new Class[0], Boolean.TYPE)).booleanValue();
        }
        if (((Integer) CoreSettingKeys.ENABLE_MONITOR_TO_ALOG.a()).intValue() == 0) {
            z = true;
        }
        return z;
    }

    public static String a(String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2}, null, f7842a, true, 396, new Class[]{String.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2}, null, f7842a, true, 396, new Class[]{String.class}, String.class);
        } else if (TextUtils.isEmpty(str)) {
            return "ttlive_monitor";
        } else {
            if (str2.startsWith("ttlive")) {
                return str2;
            }
            return "ttlive" + str2;
        }
    }

    public static JSONObject a(long j) {
        long j2 = j;
        if (PatchProxy.isSupport(new Object[]{new Long(j2)}, null, f7842a, true, 390, new Class[]{Long.TYPE}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{new Long(j2)}, null, f7842a, true, 390, new Class[]{Long.TYPE}, JSONObject.class);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", j2);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    private static JSONObject a(Map<String, Object> map) {
        if (PatchProxy.isSupport(new Object[]{map}, null, f7842a, true, 391, new Class[]{Map.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{map}, null, f7842a, true, 391, new Class[]{Map.class}, JSONObject.class);
        } else if (map == null) {
            return null;
        } else {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry next : map.entrySet()) {
                try {
                    jSONObject.put((String) next.getKey(), next.getValue());
                } catch (JSONException unused) {
                }
            }
            return jSONObject;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{jSONObject2}, null, f7842a, true, 392, new Class[]{JSONObject.class}, JSONObject.class)) {
            return (JSONObject) PatchProxy.accessDispatch(new Object[]{jSONObject2}, null, f7842a, true, 392, new Class[]{JSONObject.class}, JSONObject.class);
        }
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject3.put("tag", "ttlive_sdk");
            jSONObject3.put("ttlive_sdk_version", "1150");
            if (jSONObject2 != null) {
                jSONObject3.put(PushConstants.EXTRA, jSONObject2);
            }
        } catch (JSONException unused) {
        }
        return jSONObject3;
    }

    public static void b(String str, int i, JSONObject jSONObject) {
        String str2 = str;
        JSONObject jSONObject2 = jSONObject;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7842a, true, 384, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject2}, null, f7842a, true, 384, new Class[]{String.class, Integer.TYPE, JSONObject.class}, Void.TYPE);
            return;
        }
        a(str2, i, (JSONObject) null, jSONObject2);
    }

    public static String a(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{str2, jSONObject3, jSONObject4}, null, f7842a, true, 394, new Class[]{String.class, JSONObject.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, jSONObject3, jSONObject4}, null, f7842a, true, 394, new Class[]{String.class, JSONObject.class, JSONObject.class}, String.class);
        }
        try {
            JSONObject jSONObject5 = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject5.put("serviceName", str2);
            }
            if (jSONObject3 != null) {
                jSONObject5.put("duration", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject5.put(PushConstants.EXTRA, jSONObject4);
            }
            return jSONObject5.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    private static String b(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        String str2 = str;
        JSONObject jSONObject3 = jSONObject;
        JSONObject jSONObject4 = jSONObject2;
        if (PatchProxy.isSupport(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject4}, null, f7842a, true, 395, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, String.class)) {
            return (String) PatchProxy.accessDispatch(new Object[]{str2, Integer.valueOf(i), jSONObject3, jSONObject4}, null, f7842a, true, 395, new Class[]{String.class, Integer.TYPE, JSONObject.class, JSONObject.class}, String.class);
        }
        try {
            JSONObject jSONObject5 = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject5.put("service", str2);
            }
            jSONObject5.put("status", i);
            if (jSONObject3 != null) {
                jSONObject5.put("duration", jSONObject3);
            }
            if (jSONObject4 != null) {
                jSONObject5.put(PushConstants.EXTRA, jSONObject4);
            }
            return jSONObject5.toString();
        } catch (Throwable unused) {
            return "";
        }
    }
}
