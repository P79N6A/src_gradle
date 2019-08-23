package com.bytedance.ttnet.hostmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.ugc.aweme.q.c;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final Context f22639a;

    /* renamed from: b  reason: collision with root package name */
    public Map<c, g> f22640b;

    /* renamed from: c  reason: collision with root package name */
    public String f22641c;

    /* renamed from: d  reason: collision with root package name */
    public int f22642d = -1;

    /* renamed from: e  reason: collision with root package name */
    public int f22643e = -1;

    /* renamed from: f  reason: collision with root package name */
    public int f22644f = -1;
    private SharedPreferences g;

    public SharedPreferences a() {
        if (this.g == null) {
            this.g = c.a(this.f22639a, "host_monitor_config", 0);
        }
        return this.g;
    }

    public final String c() {
        if (this.f22641c == null) {
            this.f22641c = a().getString("broadcastAction", "com.bytedance.ttnet.hostmonitor.status");
        }
        return this.f22641c;
    }

    public final int d() {
        if (this.f22643e <= 0) {
            this.f22643e = a().getInt("checkInterval", 0);
        }
        return this.f22643e;
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            f.b("HostMonitor", "saving hosts status map");
            a().edit().putString("host_status", a(this.f22640b).toString()).apply();
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x002a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.Map<com.bytedance.ttnet.hostmonitor.c, com.bytedance.ttnet.hostmonitor.g> b() {
        /*
            r3 = this;
            java.util.Map<com.bytedance.ttnet.hostmonitor.c, com.bytedance.ttnet.hostmonitor.g> r0 = r3.f22640b     // Catch:{ Throwable -> 0x004c }
            if (r0 != 0) goto L_0x004c
            android.content.SharedPreferences r0 = r3.a()     // Catch:{ Throwable -> 0x004c }
            java.lang.String r1 = "host_status"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.getString(r1, r2)     // Catch:{ Throwable -> 0x004c }
            boolean r1 = r0.isEmpty()     // Catch:{ Throwable -> 0x004c }
            if (r1 == 0) goto L_0x001e
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Throwable -> 0x004c }
            r0.<init>()     // Catch:{ Throwable -> 0x004c }
            r3.f22640b = r0     // Catch:{ Throwable -> 0x004c }
            goto L_0x004c
        L_0x001e:
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch:{ Exception -> 0x002a }
            r1.<init>(r0)     // Catch:{ Exception -> 0x002a }
            java.util.Map r1 = a((org.json.JSONArray) r1)     // Catch:{ Exception -> 0x002a }
            r3.f22640b = r1     // Catch:{ Exception -> 0x002a }
            goto L_0x004c
        L_0x002a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x004c }
            java.lang.String r2 = "Error while deserializing host status map: "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x004c }
            r1.append(r0)     // Catch:{ Throwable -> 0x004c }
            java.lang.String r0 = ". Ignoring values."
            r1.append(r0)     // Catch:{ Throwable -> 0x004c }
            r1.toString()     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f r0 = com.bytedance.ttnet.hostmonitor.f.c.f22653a     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f$a r0 = r0.f22651a     // Catch:{ Throwable -> 0x004c }
            com.bytedance.ttnet.hostmonitor.f$a r1 = com.bytedance.ttnet.hostmonitor.f.a.ERROR     // Catch:{ Throwable -> 0x004c }
            r0.compareTo(r1)     // Catch:{ Throwable -> 0x004c }
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Throwable -> 0x004c }
            r0.<init>()     // Catch:{ Throwable -> 0x004c }
            r3.f22640b = r0     // Catch:{ Throwable -> 0x004c }
        L_0x004c:
            java.util.Map<com.bytedance.ttnet.hostmonitor.c, com.bytedance.ttnet.hostmonitor.g> r0 = r3.f22640b
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ttnet.hostmonitor.d.b():java.util.Map");
    }

    public d(Context context) {
        this.f22639a = context.getApplicationContext();
    }

    public final boolean a(c cVar) {
        if (cVar == null) {
            return false;
        }
        try {
            Map<c, g> b2 = b();
            if (b2 == null) {
                return false;
            }
            g gVar = b2.get(cVar);
            if (gVar == null || !gVar.f22654a) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    private static Map<c, g> a(JSONArray jSONArray) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        if (jSONArray.length() <= 0) {
            return concurrentHashMap;
        }
        try {
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                String optString = optJSONObject.optString("host");
                int optInt = optJSONObject.optInt("port");
                boolean optBoolean = optJSONObject.optBoolean("reachable");
                int optInt2 = optJSONObject.optInt("connection_type");
                if (!StringUtils.isEmpty(optString) && optInt > 0) {
                    c cVar = new c(optString, optInt);
                    a aVar = a.NONE;
                    if (optInt2 == 1) {
                        aVar = a.WIFI;
                    } else if (optInt2 == 2) {
                        aVar = a.MOBILE;
                    }
                    concurrentHashMap.put(cVar, new g(optBoolean, aVar));
                }
            }
        } catch (Throwable unused) {
        }
        return concurrentHashMap;
    }

    public static JSONArray a(Map<c, g> map) {
        JSONArray jSONArray = new JSONArray();
        if (map == null || map.isEmpty()) {
            return jSONArray;
        }
        try {
            for (Map.Entry next : map.entrySet()) {
                if (next != null) {
                    c cVar = (c) next.getKey();
                    g gVar = (g) next.getValue();
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("host", cVar.f22637a);
                    jSONObject.put("port", cVar.f22638b);
                    jSONObject.put("reachable", gVar.f22654a);
                    jSONObject.put("connection_type", gVar.f22655b.getValue());
                    jSONArray.put(jSONObject);
                }
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
