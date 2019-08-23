package com.bytedance.crash.event;

import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.crash.e.a;
import com.bytedance.crash.i.d;
import com.bytedance.crash.i.i;
import com.bytedance.crash.j;
import com.taobao.android.dexposed.ClassUtils;
import java.io.IOException;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class b {
    private static String b() {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) j.d().getSystemService("phone");
            if (telephonyManager != null) {
                return telephonyManager.getNetworkOperator();
            }
        } catch (Exception unused) {
        }
        return null;
    }

    private static String a() {
        String str = Build.VERSION.RELEASE;
        if (str.contains(ClassUtils.PACKAGE_SEPARATOR)) {
            return str;
        }
        return str + ".0";
    }

    public static int c(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    private static long d(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            return Long.parseLong(str);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    public static String b(String str) {
        if (j.a() != null) {
            Map<String, Object> a2 = j.a().a();
            if (a2 != null) {
                Object obj = a2.get(str);
                if (obj instanceof String) {
                    return (String) obj;
                }
            }
        }
        return null;
    }

    static a a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(d.b(str));
            a aVar = new a();
            aVar.crashTime = jSONObject.optLong("crash_time");
            aVar.eventTime = jSONObject.optLong("event_time");
            aVar.event = jSONObject.optString("event");
            aVar.eventType = jSONObject.optString("event_type");
            aVar.crashSummary = jSONObject.optString("crash_summary");
            aVar.crashType = jSONObject.optString("crash_type");
            aVar.state = jSONObject.optInt("state");
            aVar.errorInfo = jSONObject.optString("error_info");
            aVar.osType = jSONObject.optString("os");
            aVar.osVersion = jSONObject.optString("os_version");
            aVar.deviceModel = jSONObject.optString("device_model");
            aVar.appVersion = jSONObject.optString("app_version");
            aVar.updateVersionCode = jSONObject.optString("update_version_code");
            aVar.sdkVersion = jSONObject.optString("sdk_version");
            aVar.mccMnc = jSONObject.optString("mcc_mnc");
            aVar.access = jSONObject.optString("access");
            aVar.aid = jSONObject.optString("aid");
            aVar.deviceId = jSONObject.optString("device_id");
            aVar.uuid = jSONObject.optString("uuid");
            return aVar;
        } catch (IOException | JSONException unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x009a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00b6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.ArrayList<com.bytedance.crash.event.a> a(com.bytedance.crash.nativecrash.c r18) {
        /*
            r0 = r18
            java.lang.String r1 = ".evt"
            java.io.File r1 = r0.a((java.lang.String) r1)
            java.lang.String r2 = "\t"
            java.lang.String r3 = ":"
            java.util.ArrayList r1 = com.bytedance.crash.i.d.a((java.io.File) r1, (java.lang.String) r2, (java.lang.String) r3)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            boolean r3 = com.bytedance.crash.i.j.a(r1)
            if (r3 != 0) goto L_0x0171
            java.io.File r2 = r0.f19496a
            org.json.JSONObject r2 = com.bytedance.crash.runtime.j.a(r2)
            r3 = 0
            if (r2 == 0) goto L_0x003d
            java.lang.String r4 = "aid"
            java.lang.String r4 = r2.optString(r4)
            java.lang.String r5 = "app_version"
            java.lang.String r5 = r2.optString(r5)
            java.lang.String r6 = "update_version_code"
            java.lang.String r6 = r2.optString(r6)
            java.lang.String r7 = "sdk_version"
            java.lang.String r2 = r2.optString(r7)
            goto L_0x0041
        L_0x003d:
            r2 = r3
            r4 = r2
            r5 = r4
            r6 = r5
        L_0x0041:
            java.io.File r7 = r0.f19496a
            java.lang.String r8 = ".info"
            java.io.File r7 = com.bytedance.crash.i.h.a(r7, r8)
            boolean r8 = r7.exists()
            r9 = 0
            if (r8 == 0) goto L_0x0064
            java.util.Map r7 = com.bytedance.crash.i.d.b((java.io.File) r7)
            if (r7 == 0) goto L_0x0064
            java.lang.String r8 = "crash_time"
            java.lang.Object r7 = r7.get(r8)
            java.lang.String r7 = (java.lang.String) r7
            long r7 = d(r7)
            goto L_0x0065
        L_0x0064:
            r7 = r9
        L_0x0065:
            com.bytedance.crash.runtime.b r11 = com.bytedance.crash.j.e()
            boolean r11 = r11.m
            if (r11 == 0) goto L_0x0093
            com.bytedance.crash.runtime.a r11 = com.bytedance.crash.j.a()
            if (r11 == 0) goto L_0x0093
            com.bytedance.crash.runtime.a r11 = com.bytedance.crash.j.a()
            java.util.Map r11 = r11.a()
            if (r11 == 0) goto L_0x0093
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "common "
            r11.<init>(r12)
            com.bytedance.crash.runtime.a r12 = com.bytedance.crash.j.a()
            java.util.Map r12 = r12.a()
            java.lang.String r12 = r12.toString()
            r11.append(r12)
        L_0x0093:
            com.bytedance.crash.nativecrash.e r0 = r18.d()
            r11 = 0
            if (r0 == 0) goto L_0x00a8
            java.lang.String r0 = r0.a()
            java.lang.String r3 = "\n"
            int r3 = r0.indexOf(r3)
            java.lang.String r3 = r0.substring(r11, r3)
        L_0x00a8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r12 = 0
            r13 = 0
            r14 = 0
        L_0x00b0:
            int r15 = r1.size()
            if (r12 >= r15) goto L_0x014c
            java.lang.Object r15 = r1.get(r12)
            java.util.HashMap r15 = (java.util.HashMap) r15
            if (r15 == 0) goto L_0x0141
            int r16 = r15.size()
            if (r16 == 0) goto L_0x0141
            com.bytedance.crash.event.a r11 = new com.bytedance.crash.event.a
            r11.<init>()
            a((com.bytedance.crash.event.a) r11)
            com.bytedance.crash.d r16 = com.bytedance.crash.d.NATIVE
            r17 = r1
            java.lang.String r1 = r16.getName()
            r11.crashType = r1
            int r1 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r1 <= 0) goto L_0x00dc
            r11.crashTime = r7
        L_0x00dc:
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 != 0) goto L_0x00e4
            r11.updateVersionCode = r6
        L_0x00e4:
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x00ec
            r11.aid = r4
        L_0x00ec:
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L_0x00f4
            r11.appVersion = r5
        L_0x00f4:
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L_0x00fc
            r11.sdkVersion = r2
        L_0x00fc:
            java.lang.String r1 = "event_type"
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r11.event = r1
            java.lang.String r1 = "event_time"
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            long r9 = d(r1)
            r11.eventTime = r9
            java.lang.String r1 = "state"
            java.lang.Object r1 = r15.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            int r1 = c(r1)
            r11.state = r1
            r11.crashSummary = r3
            org.json.JSONObject r1 = r11.a()
            r0.add(r11)
            if (r14 != 0) goto L_0x0135
            java.lang.String r1 = com.bytedance.crash.c.a.f19377a
            java.lang.String r9 = r11.event
            boolean r14 = r1.equals(r9)
        L_0x0135:
            if (r13 != 0) goto L_0x0143
            java.lang.String r1 = com.bytedance.crash.c.a.f19378b
            java.lang.String r9 = r11.event
            boolean r1 = r1.equals(r9)
            r13 = r1
            goto L_0x0143
        L_0x0141:
            r17 = r1
        L_0x0143:
            int r12 = r12 + 1
            r1 = r17
            r9 = 0
            r11 = 0
            goto L_0x00b0
        L_0x014c:
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x0172
            if (r13 == 0) goto L_0x0172
            if (r14 != 0) goto L_0x0172
            r1 = 0
            java.lang.Object r1 = r0.get(r1)
            com.bytedance.crash.event.a r1 = (com.bytedance.crash.event.a) r1
            com.bytedance.crash.event.a r1 = r1.clone()
            java.lang.String r2 = com.bytedance.crash.c.a.f19377a
            com.bytedance.crash.event.a r1 = r1.eventType(r2)
            java.lang.String r2 = "Trap"
            com.bytedance.crash.event.a r1 = r1.errorInfo((java.lang.String) r2)
            r0.add(r1)
            goto L_0x0172
        L_0x0171:
            r0 = r2
        L_0x0172:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.event.b.a(com.bytedance.crash.nativecrash.c):java.util.ArrayList");
    }

    private static void a(a aVar) {
        aVar.osVersion = a();
        aVar.appVersion = b("app_version");
        aVar.updateVersionCode = b("update_version_code");
        aVar.sdkVersion = "220";
        aVar.mccMnc = b();
        aVar.access = i.a(j.d());
        aVar.aid = b("aid");
        aVar.deviceId = j.c().a();
        aVar.deviceModel = Build.MODEL;
        aVar.osType = "Android";
    }

    public static a a(com.bytedance.crash.d dVar, String str, a aVar) {
        if (aVar == null || aVar.f19417a == null) {
            return new a();
        }
        return a(dVar, str, aVar.f19417a);
    }

    public static a a(com.bytedance.crash.d dVar, String str, JSONObject jSONObject) {
        int i;
        a aVar = new a();
        aVar.eventTime = System.currentTimeMillis();
        aVar.event = str;
        if (jSONObject != null) {
            int i2 = 0;
            if (dVar == com.bytedance.crash.d.LAUNCH) {
                JSONArray optJSONArray = jSONObject.optJSONArray("data");
                if (optJSONArray != null && optJSONArray.length() > 0) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(0);
                    aVar.crashTime = optJSONObject.optLong("crash_time");
                    aVar.crashSummary = optJSONObject.optString("stack");
                }
            } else {
                aVar.crashTime = jSONObject.optLong("crash_time");
                aVar.crashSummary = jSONObject.optString("data");
            }
            if (aVar.crashSummary != null) {
                if (dVar == com.bytedance.crash.d.NATIVE) {
                    i = Math.max(0, aVar.crashSummary.indexOf("\n"));
                } else {
                    i2 = Math.max(0, aVar.crashSummary.indexOf(": ") + ": ".length());
                    i = Math.max(i2, aVar.crashSummary.indexOf("\n"));
                }
                if (i > 0) {
                    aVar.crashSummary = aVar.crashSummary.substring(i2, i);
                } else {
                    aVar.crashSummary = null;
                }
            }
            if (dVar != null) {
                aVar.crashType = dVar.getName();
            }
            JSONObject optJSONObject2 = jSONObject.optJSONObject("header");
            if (optJSONObject2 != null) {
                aVar.appVersion = optJSONObject2.optString("app_version");
                aVar.updateVersionCode = optJSONObject2.optString("update_version_code");
                aVar.sdkVersion = optJSONObject2.optString("sdk_version");
                aVar.mccMnc = optJSONObject2.optString("mcc_mnc");
                aVar.access = optJSONObject2.optString("access");
                aVar.aid = optJSONObject2.optString("aid");
                aVar.deviceId = optJSONObject2.optString("device_id");
                aVar.deviceModel = optJSONObject2.optString("device_model");
                aVar.osType = optJSONObject2.optString("os");
                aVar.osVersion = optJSONObject2.optString("os_version");
            } else {
                a(aVar);
            }
        }
        return aVar;
    }

    public static a a(com.bytedance.crash.d dVar, String str, long j, Throwable th) {
        a aVar = new a();
        aVar.crashTime = j;
        aVar.eventTime = System.currentTimeMillis();
        aVar.event = str;
        if (th != null) {
            aVar.crashSummary = th.getMessage();
        }
        if (dVar != null) {
            aVar.crashType = dVar.getName();
        }
        a(aVar);
        return aVar;
    }
}
