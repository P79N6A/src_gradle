package com.xiaomi.push;

import android.text.TextUtils;
import com.xiaomi.channel.commonutils.logger.b;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class m {

    /* renamed from: a  reason: collision with root package name */
    private static int f82441a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static Map<String, p> f878a = null;

    /* renamed from: b  reason: collision with root package name */
    private static int f82442b = -1;

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0027 A[Catch:{ Throwable -> 0x002c, all -> 0x0050 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0028 A[Catch:{ Throwable -> 0x002c, all -> 0x0050 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int a() {
        /*
            java.lang.Class<com.xiaomi.push.m> r0 = com.xiaomi.push.m.class
            monitor-enter(r0)
            int r0 = f82441a     // Catch:{ all -> 0x0050 }
            if (r0 != 0) goto L_0x004a
            r0 = 0
            java.lang.String r1 = "ro.miui.ui.version.code"
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ Throwable -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x002c }
            r2 = 1
            if (r1 == 0) goto L_0x0024
            java.lang.String r1 = "ro.miui.ui.version.name"
            java.lang.String r1 = a((java.lang.String) r1)     // Catch:{ Throwable -> 0x002c }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x002c }
            if (r1 != 0) goto L_0x0022
            goto L_0x0024
        L_0x0022:
            r1 = 0
            goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            if (r1 == 0) goto L_0x0028
            goto L_0x0029
        L_0x0028:
            r2 = 2
        L_0x0029:
            f82441a = r2     // Catch:{ Throwable -> 0x002c }
            goto L_0x0034
        L_0x002c:
            r1 = move-exception
            java.lang.String r2 = "get isMIUI failed"
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x0050 }
            f82441a = r0     // Catch:{ all -> 0x0050 }
        L_0x0034:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0050 }
            r0.<init>()     // Catch:{ all -> 0x0050 }
            java.lang.String r1 = "isMIUI's value is: "
            r0.append(r1)     // Catch:{ all -> 0x0050 }
            int r1 = f82441a     // Catch:{ all -> 0x0050 }
            r0.append(r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x0050 }
            com.xiaomi.channel.commonutils.logger.b.b(r0)     // Catch:{ all -> 0x0050 }
        L_0x004a:
            int r0 = f82441a     // Catch:{ all -> 0x0050 }
            java.lang.Class<com.xiaomi.push.m> r1 = com.xiaomi.push.m.class
            monitor-exit(r1)
            return r0
        L_0x0050:
            r0 = move-exception
            java.lang.Class<com.xiaomi.push.m> r1 = com.xiaomi.push.m.class
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.m.a():int");
    }

    public static p a(String str) {
        p b2 = b(str);
        return b2 == null ? p.Global : b2;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m566a() {
        String str;
        synchronized (m.class) {
            try {
                int a2 = u.a();
                str = (!a() || a2 <= 0) ? "" : a2 < 2 ? "alpha" : a2 < 3 ? "development" : "stable";
            } catch (Throwable th) {
                Class<m> cls = m.class;
                throw th;
            }
        }
        return str;
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m567a(String str) {
        try {
            return (String) au.a("android.os.SystemProperties", "get", str, "");
        } catch (Exception e2) {
            b.a((Throwable) e2);
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    private static void m568a() {
        if (f878a == null) {
            HashMap hashMap = new HashMap();
            f878a = hashMap;
            hashMap.put("CN", p.China);
            f878a.put("FI", p.Europe);
            f878a.put("SE", p.Europe);
            f878a.put("NO", p.Europe);
            f878a.put("FO", p.Europe);
            f878a.put("EE", p.Europe);
            f878a.put("LV", p.Europe);
            f878a.put("LT", p.Europe);
            f878a.put("BY", p.Europe);
            f878a.put("MD", p.Europe);
            f878a.put("UA", p.Europe);
            f878a.put("PL", p.Europe);
            f878a.put("CZ", p.Europe);
            f878a.put("SK", p.Europe);
            f878a.put("HU", p.Europe);
            f878a.put("DE", p.Europe);
            f878a.put("AT", p.Europe);
            f878a.put("CH", p.Europe);
            f878a.put("LI", p.Europe);
            f878a.put("GB", p.Europe);
            f878a.put("IE", p.Europe);
            f878a.put("NL", p.Europe);
            f878a.put("BE", p.Europe);
            f878a.put("LU", p.Europe);
            f878a.put("FR", p.Europe);
            f878a.put("RO", p.Europe);
            f878a.put("BG", p.Europe);
            f878a.put("RS", p.Europe);
            f878a.put("MK", p.Europe);
            f878a.put("AL", p.Europe);
            f878a.put("GR", p.Europe);
            f878a.put("SI", p.Europe);
            f878a.put("HR", p.Europe);
            f878a.put("IT", p.Europe);
            f878a.put("SM", p.Europe);
            f878a.put("MT", p.Europe);
            f878a.put("ES", p.Europe);
            f878a.put("PT", p.Europe);
            f878a.put("AD", p.Europe);
            f878a.put("CY", p.Europe);
            f878a.put("DK", p.Europe);
            f878a.put("RU", p.Russia);
            f878a.put("IN", p.India);
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m569a() {
        boolean z;
        synchronized (m.class) {
            try {
                z = true;
                if (a() != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                Class<m> cls = m.class;
                throw th;
            }
        }
        return z;
    }

    private static p b(String str) {
        a();
        return f878a.get(str.toUpperCase());
    }

    public static String b() {
        String a2 = t.a("ro.miui.region", "");
        if (TextUtils.isEmpty(a2)) {
            a2 = t.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(a2)) {
            a2 = t.a("persist.sys.country", "");
        }
        return TextUtils.isEmpty(a2) ? Locale.getDefault().getCountry() : a2;
    }

    /* renamed from: b  reason: collision with other method in class */
    public static boolean m570b() {
        boolean z;
        synchronized (m.class) {
            try {
                z = a() == 2;
            } catch (Throwable th) {
                Class<m> cls = m.class;
                throw th;
            }
        }
        return z;
    }

    public static boolean c() {
        if (f82442b < 0) {
            Object a2 = au.a("miui.external.SdkHelper", "isMiuiSystem", new Object[0]);
            f82442b = 0;
            if (a2 != null && (a2 instanceof Boolean) && !Boolean.class.cast(a2).booleanValue()) {
                f82442b = 1;
            }
        }
        return f82442b > 0;
    }

    public static boolean d() {
        return !p.China.name().equalsIgnoreCase(a(b()).name());
    }
}
