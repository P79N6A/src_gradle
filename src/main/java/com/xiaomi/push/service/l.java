package com.xiaomi.push.service;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.ac;
import com.xiaomi.push.gr;
import com.xiaomi.push.j;
import com.xiaomi.push.p;

public class l {

    /* renamed from: a  reason: collision with root package name */
    private static k f82583a;

    /* renamed from: a  reason: collision with other field name */
    private static a f996a;

    public interface a {
        void a();
    }

    public static k a(Context context) {
        k kVar;
        synchronized (l.class) {
            try {
                kVar = null;
                if (f82583a != null) {
                    kVar = f82583a;
                } else {
                    SharedPreferences a2 = c.a(context, "mipush_account", 0);
                    String string = a2.getString("uuid", null);
                    String string2 = a2.getString("token", null);
                    String string3 = a2.getString("security", null);
                    String string4 = a2.getString("app_id", null);
                    String string5 = a2.getString("app_token", null);
                    String string6 = a2.getString("package_name", null);
                    String string7 = a2.getString("device_id", null);
                    int i = a2.getInt("env_type", 1);
                    if (!TextUtils.isEmpty(string7) && string7.startsWith("a-")) {
                        string7 = j.k(context);
                        a2.edit().putString("device_id", string7).commit();
                    }
                    if (!TextUtils.isEmpty(string) && !TextUtils.isEmpty(string2) && !TextUtils.isEmpty(string3)) {
                        String k = j.k(context);
                        if ("com.xiaomi.xmsf".equals(context.getPackageName()) || TextUtils.isEmpty(k) || TextUtils.isEmpty(string7) || string7.equals(k)) {
                            k kVar2 = new k(string, string2, string3, string4, string5, string6, i);
                            f82583a = kVar2;
                            kVar = kVar2;
                        } else {
                            b.d("erase the old account.");
                            a(context);
                        }
                    }
                }
            } catch (Throwable th) {
                Class<l> cls = l.class;
                throw th;
            }
        }
        return kVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0052 A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061 A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x007e  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x009d A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x013d A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0150 A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0181 A[SYNTHETIC, Splitter:B:67:0x0181] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x018b A[Catch:{ Exception -> 0x0096, all -> 0x0210 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.xiaomi.push.service.k a(android.content.Context r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            java.lang.Class<com.xiaomi.push.service.l> r0 = com.xiaomi.push.service.l.class
            monitor-enter(r0)
            java.util.TreeMap r0 = new java.util.TreeMap     // Catch:{ all -> 0x0210 }
            r0.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "devid"
            r2 = 0
            java.lang.String r2 = com.xiaomi.push.j.a((android.content.Context) r11, (boolean) r2)     // Catch:{ all -> 0x0210 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = "devid1"
            java.lang.String r2 = com.xiaomi.push.j.a((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            r0.put(r1, r2)     // Catch:{ all -> 0x0210 }
            com.xiaomi.push.service.k r1 = f82583a     // Catch:{ all -> 0x0210 }
            r2 = 0
            if (r1 == 0) goto L_0x004b
            com.xiaomi.push.service.k r1 = f82583a     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = r1.f995a     // Catch:{ all -> 0x0210 }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0210 }
            if (r1 != 0) goto L_0x004b
            java.lang.String r1 = "uuid"
            com.xiaomi.push.service.k r3 = f82583a     // Catch:{ all -> 0x0210 }
            java.lang.String r3 = r3.f995a     // Catch:{ all -> 0x0210 }
            r0.put(r1, r3)     // Catch:{ all -> 0x0210 }
            com.xiaomi.push.service.k r1 = f82583a     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = r1.f995a     // Catch:{ all -> 0x0210 }
            java.lang.String r3 = "/"
            int r1 = r1.lastIndexOf(r3)     // Catch:{ all -> 0x0210 }
            r3 = -1
            if (r1 == r3) goto L_0x004b
            com.xiaomi.push.service.k r3 = f82583a     // Catch:{ all -> 0x0210 }
            java.lang.String r3 = r3.f995a     // Catch:{ all -> 0x0210 }
            int r1 = r1 + 1
            java.lang.String r1 = r3.substring(r1)     // Catch:{ all -> 0x0210 }
            goto L_0x004c
        L_0x004b:
            r1 = r2
        L_0x004c:
            java.lang.String r3 = com.xiaomi.push.j.c(r11)     // Catch:{ all -> 0x0210 }
            if (r3 == 0) goto L_0x0057
            java.lang.String r4 = "vdevid"
            r0.put(r4, r3)     // Catch:{ all -> 0x0210 }
        L_0x0057:
            java.lang.String r3 = com.xiaomi.push.j.b((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ all -> 0x0210 }
            if (r4 != 0) goto L_0x0066
            java.lang.String r4 = "gaid"
            r0.put(r4, r3)     // Catch:{ all -> 0x0210 }
        L_0x0066:
            boolean r3 = a((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            if (r3 == 0) goto L_0x006e
            java.lang.String r13 = "1000271"
        L_0x006e:
            r7 = r13
            boolean r13 = a((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            if (r13 == 0) goto L_0x0077
            java.lang.String r14 = "420100086271"
        L_0x0077:
            r8 = r14
            boolean r13 = a((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            if (r13 == 0) goto L_0x0080
            java.lang.String r12 = "com.xiaomi.xmsf"
        L_0x0080:
            r9 = r12
            java.lang.String r12 = "appid"
            r0.put(r12, r7)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = "apptoken"
            r0.put(r12, r8)     // Catch:{ all -> 0x0210 }
            android.content.pm.PackageManager r12 = r11.getPackageManager()     // Catch:{ Exception -> 0x0096 }
            r13 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r12 = r12.getPackageInfo(r9, r13)     // Catch:{ Exception -> 0x0096 }
            goto L_0x009b
        L_0x0096:
            r12 = move-exception
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.Throwable) r12)     // Catch:{ all -> 0x0210 }
            r12 = r2
        L_0x009b:
            if (r12 == 0) goto L_0x00a4
            int r12 = r12.versionCode     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = java.lang.String.valueOf(r12)     // Catch:{ all -> 0x0210 }
            goto L_0x00a6
        L_0x00a4:
            java.lang.String r12 = "0"
        L_0x00a6:
            java.lang.String r13 = "appversion"
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = "sdkversion"
            r13 = 30616(0x7798, float:4.2902E-41)
            java.lang.String r13 = java.lang.Integer.toString(r13)     // Catch:{ all -> 0x0210 }
            r0.put(r12, r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = "packagename"
            r0.put(r12, r9)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = "model"
            java.lang.String r13 = android.os.Build.MODEL     // Catch:{ all -> 0x0210 }
            r0.put(r12, r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = "board"
            java.lang.String r13 = android.os.Build.BOARD     // Catch:{ all -> 0x0210 }
            r0.put(r12, r13)     // Catch:{ all -> 0x0210 }
            boolean r12 = com.xiaomi.push.m.d()     // Catch:{ all -> 0x0210 }
            if (r12 != 0) goto L_0x011a
            java.lang.String r12 = ""
            java.lang.String r13 = com.xiaomi.push.j.f(r11)     // Catch:{ all -> 0x0210 }
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0210 }
            if (r14 != 0) goto L_0x00eb
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r12.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = com.xiaomi.push.az.a((java.lang.String) r13)     // Catch:{ all -> 0x0210 }
            r12.append(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0210 }
        L_0x00eb:
            java.lang.String r13 = com.xiaomi.push.j.h(r11)     // Catch:{ all -> 0x0210 }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0210 }
            if (r14 != 0) goto L_0x010f
            boolean r14 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0210 }
            if (r14 != 0) goto L_0x010f
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r14.<init>()     // Catch:{ all -> 0x0210 }
            r14.append(r12)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = ","
            r14.append(r12)     // Catch:{ all -> 0x0210 }
            r14.append(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = r14.toString()     // Catch:{ all -> 0x0210 }
        L_0x010f:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0210 }
            if (r13 != 0) goto L_0x011a
            java.lang.String r13 = "imei_md5"
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
        L_0x011a:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r12.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "os"
            java.lang.String r14 = android.os.Build.VERSION.RELEASE     // Catch:{ all -> 0x0210 }
            r12.append(r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "-"
            r12.append(r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ all -> 0x0210 }
            r12.append(r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0210 }
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
            int r12 = com.xiaomi.push.j.a()     // Catch:{ all -> 0x0210 }
            if (r12 < 0) goto L_0x0146
            java.lang.String r13 = "space_id"
            java.lang.String r12 = java.lang.Integer.toString(r12)     // Catch:{ all -> 0x0210 }
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
        L_0x0146:
            java.lang.String r12 = com.xiaomi.push.j.n(r11)     // Catch:{ all -> 0x0210 }
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0210 }
            if (r13 != 0) goto L_0x0159
            java.lang.String r13 = "mac_address"
            java.lang.String r12 = com.xiaomi.push.az.a((java.lang.String) r12)     // Catch:{ all -> 0x0210 }
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
        L_0x0159:
            java.lang.String r12 = "android_id"
            java.lang.String r13 = com.xiaomi.push.j.e(r11)     // Catch:{ all -> 0x0210 }
            r0.put(r12, r13)     // Catch:{ all -> 0x0210 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r12.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "brand"
            java.lang.String r14 = android.os.Build.BRAND     // Catch:{ all -> 0x0210 }
            r12.append(r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0210 }
            r0.put(r13, r12)     // Catch:{ all -> 0x0210 }
            java.lang.String r12 = a((android.content.Context) r11)     // Catch:{ all -> 0x0210 }
            com.xiaomi.push.ar r12 = com.xiaomi.push.at.a(r11, r12, r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = ""
            if (r12 == 0) goto L_0x0185
            java.lang.String r13 = r12.a()     // Catch:{ all -> 0x0210 }
        L_0x0185:
            boolean r12 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x0210 }
            if (r12 != 0) goto L_0x020c
            org.json.JSONObject r12 = new org.json.JSONObject     // Catch:{ all -> 0x0210 }
            r12.<init>(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r14 = "code"
            int r14 = r12.getInt(r14)     // Catch:{ all -> 0x0210 }
            if (r14 != 0) goto L_0x01fa
            java.lang.String r13 = "data"
            org.json.JSONObject r12 = r12.getJSONObject(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "ssecurity"
            java.lang.String r6 = r12.getString(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "token"
            java.lang.String r5 = r12.getString(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "userId"
            java.lang.String r13 = r12.getString(r13)     // Catch:{ all -> 0x0210 }
            boolean r14 = android.text.TextUtils.isEmpty(r1)     // Catch:{ all -> 0x0210 }
            if (r14 == 0) goto L_0x01cc
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r14.<init>()     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "an"
            r14.append(r0)     // Catch:{ all -> 0x0210 }
            r0 = 6
            java.lang.String r0 = com.xiaomi.push.az.a((int) r0)     // Catch:{ all -> 0x0210 }
            r14.append(r0)     // Catch:{ all -> 0x0210 }
            java.lang.String r1 = r14.toString()     // Catch:{ all -> 0x0210 }
        L_0x01cc:
            com.xiaomi.push.service.k r14 = new com.xiaomi.push.service.k     // Catch:{ all -> 0x0210 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x0210 }
            r0.<init>()     // Catch:{ all -> 0x0210 }
            r0.append(r13)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "@xiaomi.com/"
            r0.append(r13)     // Catch:{ all -> 0x0210 }
            r0.append(r1)     // Catch:{ all -> 0x0210 }
            java.lang.String r4 = r0.toString()     // Catch:{ all -> 0x0210 }
            int r10 = com.xiaomi.push.ac.a()     // Catch:{ all -> 0x0210 }
            r3 = r14
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0210 }
            a(r11, r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r13 = "vdevid"
            java.lang.String r12 = r12.optString(r13)     // Catch:{ all -> 0x0210 }
            com.xiaomi.push.j.a((android.content.Context) r11, (java.lang.String) r12)     // Catch:{ all -> 0x0210 }
            f82583a = r14     // Catch:{ all -> 0x0210 }
            r2 = r14
            goto L_0x020c
        L_0x01fa:
            java.lang.String r14 = "code"
            int r14 = r12.getInt(r14)     // Catch:{ all -> 0x0210 }
            java.lang.String r0 = "description"
            java.lang.String r12 = r12.optString(r0)     // Catch:{ all -> 0x0210 }
            com.xiaomi.push.service.o.a(r11, r14, r12)     // Catch:{ all -> 0x0210 }
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r13)     // Catch:{ all -> 0x0210 }
        L_0x020c:
            java.lang.Class<com.xiaomi.push.service.l> r11 = com.xiaomi.push.service.l.class
            monitor-exit(r11)
            return r2
        L_0x0210:
            r11 = move-exception
            java.lang.Class<com.xiaomi.push.service.l> r12 = com.xiaomi.push.service.l.class
            monitor-exit(r12)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.l.a(android.content.Context, java.lang.String, java.lang.String, java.lang.String):com.xiaomi.push.service.k");
    }

    /* renamed from: a  reason: collision with other method in class */
    public static String m638a(Context context) {
        StringBuilder sb;
        String str;
        String a2 = a.a(context).a();
        if (ac.b()) {
            sb = new StringBuilder("http://");
            sb.append(gr.f82123b);
            str = ":9085/pass/v2/register";
        } else {
            if (p.China.name().equals(a2)) {
                sb = new StringBuilder("https://cn.register.xmpush.xiaomi.com");
            } else if (p.Global.name().equals(a2)) {
                sb = new StringBuilder("https://register.xmpush.global.xiaomi.com");
            } else if (p.Europe.name().equals(a2)) {
                sb = new StringBuilder("https://fr.register.xmpush.global.xiaomi.com");
            } else if (p.Russia.name().equals(a2)) {
                sb = new StringBuilder("https://ru.register.xmpush.global.xiaomi.com");
            } else if (p.India.name().equals(a2)) {
                sb = new StringBuilder("https://idmb.register.xmpush.global.xiaomi.com");
            } else {
                sb = new StringBuilder("https://");
                sb.append(ac.a() ? "sandbox.xmpush.xiaomi.com" : "register.xmpush.xiaomi.com");
            }
            str = "/pass/v2/register";
        }
        sb.append(str);
        return sb.toString();
    }

    public static void a() {
        if (f996a != null) {
            f996a.a();
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static void m639a(Context context) {
        c.a(context, "mipush_account", 0).edit().clear().commit();
        f82583a = null;
        a();
    }

    public static void a(Context context, k kVar) {
        SharedPreferences.Editor edit = c.a(context, "mipush_account", 0).edit();
        edit.putString("uuid", kVar.f995a);
        edit.putString("security", kVar.f82579c);
        edit.putString("token", kVar.f82578b);
        edit.putString("app_id", kVar.f82580d);
        edit.putString("package_name", kVar.f82582f);
        edit.putString("app_token", kVar.f82581e);
        edit.putString("device_id", j.k(context));
        edit.putInt("env_type", kVar.f82577a);
        edit.commit();
        a();
    }

    public static void a(a aVar) {
        f996a = aVar;
    }

    /* renamed from: a  reason: collision with other method in class */
    private static boolean m640a(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }
}
