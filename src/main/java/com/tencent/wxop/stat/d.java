package com.tencent.wxop.stat;

import android.content.Context;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import com.tencent.a.a.a.a.g;
import com.tencent.wxop.stat.a.b;
import com.tencent.wxop.stat.a.n;
import com.tencent.wxop.stat.a.r;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {
    static int A = 512;
    private static e B = e.APP_LAUNCH;
    private static boolean C = false;
    private static boolean D = true;
    private static int E = 30000;
    private static int F = 100000;
    private static int G = 30;
    private static String H = null;
    private static String I;
    private static String J = "mta_channel";
    private static int K = 1024;
    private static long L = 0;
    private static long M = 300000;
    private static int N = 0;
    private static volatile int O = 0;
    private static boolean P = false;
    private static int Q = 4096;
    private static String R = null;
    private static boolean S = false;
    private static ah T = null;

    /* renamed from: a  reason: collision with root package name */
    public static b f79884a = n.c();

    /* renamed from: b  reason: collision with root package name */
    static ag f79885b = new ag(2);

    /* renamed from: c  reason: collision with root package name */
    static ag f79886c = new ag(1);

    /* renamed from: d  reason: collision with root package name */
    static int f79887d = 30;

    /* renamed from: e  reason: collision with root package name */
    static int f79888e = 10;

    /* renamed from: f  reason: collision with root package name */
    static int f79889f = 100;
    static int g = 1;
    static String h = "__HIBERNATE__";
    static String i = "__HIBERNATE__TIME";
    static String j = "__MTA_KILL__";
    public static String k;
    public static String l = "";
    public static int m = 180;
    static boolean n = false;
    static int o = 100;
    static long p = 10000;
    public static boolean q = true;
    public static boolean r = true;
    static volatile String s = "pingma.qq.com:80";
    static volatile String t = "http://pingma.qq.com:80/mstat/report";
    static int u = 20;
    static int v = 0;
    public static boolean w = false;
    static boolean x = true;
    static int y = 0;
    static long z = 10000;

    public static e a() {
        return B;
    }

    public static String a(Context context) {
        if (context == null) {
            f79884a.d("Context for getCustomUid is null.");
            return null;
        }
        if (R == null) {
            R = r.a(context, "MTA_CUSTOM_UID", "");
        }
        return R;
    }

    static String a(String str, String str2) {
        try {
            String string = f79886c.f79841b.getString(str);
            if (string != null) {
                return string;
            }
        } catch (Throwable unused) {
            f79884a.c("can't find custom key:".concat(String.valueOf(str)));
        }
        return null;
    }

    static synchronized void a(int i2) {
        synchronized (d.class) {
            O = 0;
        }
    }

    private static void a(long j2) {
        r.b(aj.a(), h, j2);
        a(false);
        f79884a.b("MTA is disable for current SDK version");
    }

    static void a(Context context, ag agVar) {
        if (agVar.f79840a == f79886c.f79840a) {
            f79886c = agVar;
            a(agVar.f79841b);
            if (!f79886c.f79841b.isNull("iplist")) {
                i.a(context).a(f79886c.f79841b.getString("iplist"));
            }
            return;
        }
        if (agVar.f79840a == f79885b.f79840a) {
            f79885b = agVar;
        }
    }

    private static void a(Context context, ag agVar, JSONObject jSONObject) {
        boolean z2 = false;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(NotifyType.VIBRATE)) {
                    int i2 = jSONObject.getInt(next);
                    if (agVar.f79843d != i2) {
                        z2 = true;
                    }
                    agVar.f79843d = i2;
                } else if (next.equalsIgnoreCase("c")) {
                    String string = jSONObject.getString("c");
                    if (string.length() > 0) {
                        agVar.f79841b = new JSONObject(string);
                    }
                } else if (next.equalsIgnoreCase("m")) {
                    agVar.f79842c = jSONObject.getString("m");
                }
            }
            if (z2) {
                t a2 = t.a(aj.a());
                if (a2 != null) {
                    a2.b(agVar);
                }
                if (agVar.f79840a == f79886c.f79840a) {
                    a(agVar.f79841b);
                    b(agVar.f79841b);
                }
            }
            a(context, agVar);
        } catch (Throwable unused) {
        }
    }

    public static void a(Context context, String str) {
        b bVar;
        String str2;
        if (context == null) {
            bVar = f79884a;
            str2 = "ctx in StatConfig.setAppKey() is null";
        } else if (str == null || str.length() > 256) {
            bVar = f79884a;
            str2 = "appkey in StatConfig.setAppKey() is null or exceed 256 bytes";
        } else {
            I = str;
            return;
        }
        bVar.d(str2);
    }

    static void a(Context context, JSONObject jSONObject) {
        JSONObject jSONObject2;
        ag agVar;
        try {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (next.equalsIgnoreCase(Integer.toString(f79886c.f79840a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    agVar = f79886c;
                } else if (next.equalsIgnoreCase(Integer.toString(f79885b.f79840a))) {
                    jSONObject2 = jSONObject.getJSONObject(next);
                    agVar = f79885b;
                } else if (next.equalsIgnoreCase("rs")) {
                    e statReportStrategy = e.getStatReportStrategy(jSONObject.getInt(next));
                    if (statReportStrategy != null) {
                        B = statReportStrategy;
                        if (b()) {
                            b bVar = f79884a;
                            bVar.g("Change to ReportStrategy:" + statReportStrategy.name());
                        }
                    }
                } else {
                    return;
                }
                a(context, agVar, jSONObject2);
            }
        } catch (JSONException unused) {
        }
    }

    public static void a(e eVar) {
        B = eVar;
        if (eVar != e.PERIOD) {
            g.f79897f = 0;
        }
        if (b()) {
            f79884a.g("Change to statSendStrategy: ".concat(String.valueOf(eVar)));
        }
    }

    private static void a(JSONObject jSONObject) {
        try {
            e statReportStrategy = e.getStatReportStrategy(jSONObject.getInt("rs"));
            if (statReportStrategy != null) {
                a(statReportStrategy);
            }
        } catch (JSONException unused) {
            if (b()) {
                f79884a.a("rs not found.");
            }
        }
    }

    public static void a(boolean z2) {
        D = z2;
        if (!z2) {
            f79884a.b("!!!!!!MTA StatService has been disabled!!!!!!");
        }
    }

    private static boolean a(JSONObject jSONObject, String str, String str2) {
        if (!jSONObject.isNull(str)) {
            String optString = jSONObject.optString(str);
            if (n.c(str2) && n.c(optString) && str2.equalsIgnoreCase(optString)) {
                return true;
            }
        }
        return false;
    }

    public static String b(Context context) {
        return context != null ? g.a(context).a().f79215c : PushConstants.PUSH_TYPE_NOTIFY;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[Catch:{ Exception -> 0x01b1 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void b(android.content.Context r6, org.json.JSONObject r7) {
        /*
            java.lang.String r0 = j     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r7 = r7.optString(r0)     // Catch:{ Exception -> 0x01b1 }
            boolean r0 = com.tencent.wxop.stat.a.n.c((java.lang.String) r7)     // Catch:{ Exception -> 0x01b1 }
            if (r0 == 0) goto L_0x01b1
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Exception -> 0x01b1 }
            r0.<init>(r7)     // Catch:{ Exception -> 0x01b1 }
            int r7 = r0.length()     // Catch:{ Exception -> 0x01b1 }
            if (r7 != 0) goto L_0x0018
            return
        L_0x0018:
            java.lang.String r7 = "sm"
            boolean r7 = r0.isNull(r7)     // Catch:{ Exception -> 0x01b1 }
            r1 = 0
            if (r7 != 0) goto L_0x0077
            java.lang.String r7 = "sm"
            java.lang.Object r7 = r0.get(r7)     // Catch:{ Exception -> 0x01b1 }
            boolean r2 = r7 instanceof java.lang.Integer     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x0032
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch:{ Exception -> 0x01b1 }
        L_0x002d:
            int r7 = r7.intValue()     // Catch:{ Exception -> 0x01b1 }
            goto L_0x003e
        L_0x0032:
            boolean r2 = r7 instanceof java.lang.String     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x003d
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ Exception -> 0x01b1 }
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch:{ Exception -> 0x01b1 }
            goto L_0x002d
        L_0x003d:
            r7 = 0
        L_0x003e:
            if (r7 <= 0) goto L_0x0077
            boolean r2 = b()     // Catch:{ Exception -> 0x01b1 }
            if (r2 == 0) goto L_0x005e
            com.tencent.wxop.stat.a.b r2 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r4 = "match sleepTime:"
            r3.<init>(r4)     // Catch:{ Exception -> 0x01b1 }
            r3.append(r7)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r4 = " minutes"
            r3.append(r4)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b1 }
            r2.a(r3)     // Catch:{ Exception -> 0x01b1 }
        L_0x005e:
            long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01b1 }
            int r7 = r7 * 60
            int r7 = r7 * 1000
            long r4 = (long) r7     // Catch:{ Exception -> 0x01b1 }
            long r2 = r2 + r4
            java.lang.String r7 = i     // Catch:{ Exception -> 0x01b1 }
            com.tencent.wxop.stat.a.r.b((android.content.Context) r6, (java.lang.String) r7, (long) r2)     // Catch:{ Exception -> 0x01b1 }
            a((boolean) r1)     // Catch:{ Exception -> 0x01b1 }
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r2 = "MTA is disable for current SDK version"
            r7.b(r2)     // Catch:{ Exception -> 0x01b1 }
        L_0x0077:
            java.lang.String r7 = "sv"
            java.lang.String r2 = "2.0.4"
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r2)     // Catch:{ Exception -> 0x01b1 }
            r2 = 1
            if (r7 == 0) goto L_0x008a
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "match sdk version:2.0.4"
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x008a:
            java.lang.String r7 = "md"
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x00aa
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match MODEL:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x00aa:
            java.lang.String r7 = "av"
            java.lang.String r3 = com.tencent.wxop.stat.a.n.f(r6)     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x00ce
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match app version:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = com.tencent.wxop.stat.a.n.f(r6)     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x00ce:
            java.lang.String r7 = "mf"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r3.<init>()     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01b1 }
            r3.append(r4)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x00fa
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match MANUFACTURER:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x00fa:
            java.lang.String r7 = "osv"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r3.<init>()     // Catch:{ Exception -> 0x01b1 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b1 }
            r3.append(r4)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x0126
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match android SDK version:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x0126:
            java.lang.String r7 = "ov"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            r3.<init>()     // Catch:{ Exception -> 0x01b1 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b1 }
            r3.append(r4)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x0152
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match android SDK version:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x0152:
            java.lang.String r7 = "ui"
            com.tencent.wxop.stat.t r3 = com.tencent.wxop.stat.t.a((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            com.tencent.wxop.stat.a.c r3 = r3.b((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.f79784a     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x0182
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = "match imei:"
            r1.<init>(r3)     // Catch:{ Exception -> 0x01b1 }
            com.tencent.wxop.stat.t r3 = com.tencent.wxop.stat.t.a((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            com.tencent.wxop.stat.a.c r3 = r3.b((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r3 = r3.f79784a     // Catch:{ Exception -> 0x01b1 }
            r1.append(r3)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r1)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x0182:
            java.lang.String r7 = "mid"
            java.lang.String r3 = b((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            boolean r7 = a((org.json.JSONObject) r0, (java.lang.String) r7, (java.lang.String) r3)     // Catch:{ Exception -> 0x01b1 }
            if (r7 == 0) goto L_0x01a6
            com.tencent.wxop.stat.a.b r7 = f79884a     // Catch:{ Exception -> 0x01b1 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r1 = "match mid:"
            r0.<init>(r1)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r6 = b((android.content.Context) r6)     // Catch:{ Exception -> 0x01b1 }
            r0.append(r6)     // Catch:{ Exception -> 0x01b1 }
            java.lang.String r6 = r0.toString()     // Catch:{ Exception -> 0x01b1 }
            r7.a(r6)     // Catch:{ Exception -> 0x01b1 }
            r1 = 1
        L_0x01a6:
            if (r1 == 0) goto L_0x01b1
            java.lang.String r6 = "2.0.4"
            long r6 = com.tencent.wxop.stat.a.n.b((java.lang.String) r6)     // Catch:{ Exception -> 0x01b1 }
            a((long) r6)     // Catch:{ Exception -> 0x01b1 }
        L_0x01b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.wxop.stat.d.b(android.content.Context, org.json.JSONObject):void");
    }

    private static void b(JSONObject jSONObject) {
        if (!(jSONObject == null || jSONObject.length() == 0)) {
            try {
                b(aj.a(), jSONObject);
                String string = jSONObject.getString(h);
                if (b()) {
                    b bVar = f79884a;
                    bVar.g("hibernateVer:" + string + ", current version:2.0.4");
                }
                long b2 = n.b(string);
                if (n.b("2.0.4") <= b2) {
                    a(b2);
                }
            } catch (JSONException unused) {
                f79884a.g("__HIBERNATE__ not found.");
            }
        }
    }

    public static boolean b() {
        return C;
    }

    public static boolean c() {
        return D;
    }

    public static int d() {
        return G;
    }

    public static int e() {
        return F;
    }

    public static synchronized String f() {
        String str;
        synchronized (d.class) {
            str = I;
        }
        return str;
    }

    public static synchronized String g() {
        String str;
        synchronized (d.class) {
            str = k;
        }
        return str;
    }

    public static int h() {
        return m;
    }
}
