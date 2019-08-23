package com.ss.android.d.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import com.bytedance.common.utility.DigestUtils;
import com.bytedance.common.utility.StringUtils;
import com.ss.android.common.AppContext;
import com.ss.android.d.b.b;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static String f28344a = null;

    /* renamed from: b  reason: collision with root package name */
    public static AppContext f28345b = null;

    /* renamed from: c  reason: collision with root package name */
    public static String f28346c = null;

    /* renamed from: d  reason: collision with root package name */
    public static int f28347d = 0;

    /* renamed from: e  reason: collision with root package name */
    public static String f28348e = null;

    /* renamed from: f  reason: collision with root package name */
    public static String f28349f = "2.5.5.6";
    public static String g;
    public static b h;
    public static c i;
    public static ConcurrentHashMap<String, Object> j;
    private static String k;
    private static int l;
    private static String m;
    private static ConcurrentHashMap<String, Object> n = new ConcurrentHashMap<>();
    private static boolean o = false;
    private static JSONObject p;
    private static String q;
    private static String r;
    private static String s;
    private static final Object t = new Object();
    private static boolean u = false;

    public static String c() {
        return f28344a;
    }

    public static String d() {
        return k;
    }

    public static boolean e() {
        if (!u) {
            return true;
        }
        return false;
    }

    public static int a() {
        if (f28347d <= 0 && f28345b != null) {
            f28345b.getAid();
        }
        return f28347d;
    }

    public static int b() {
        if (l <= 0 && f28345b != null) {
            l = f28345b.getVersionCode();
        }
        return l;
    }

    public static String a(Context context) {
        if (StringUtils.isEmpty(q) && context != null) {
            try {
                PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
                if (!(packageInfo == null || packageInfo.signatures == null)) {
                    if (packageInfo.signatures.length > 0) {
                        Signature signature = packageInfo.signatures[0];
                        if (signature == null) {
                            return q;
                        }
                        q = DigestUtils.md5Hex(signature.toByteArray());
                    }
                }
                return q;
            } catch (Exception unused) {
            }
        }
        return q;
    }

    public static String b(Context context) {
        if (StringUtils.isEmpty(g)) {
            g = a.a(context).getString("user_agent", null);
        }
        return g;
    }

    private static void a(Throwable th) {
        if (f28345b != null) {
            c cVar = i;
            Context context = f28345b.getContext();
            if (cVar != null) {
                String stackTraceString = Log.getStackTraceString(th);
                if (!StringUtils.isEmpty(stackTraceString)) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("stack", stackTraceString);
                    } catch (JSONException unused) {
                    }
                    cVar.onDeviceRegisterEvent(context, "umeng", "device_register", "error", 0, 0, jSONObject);
                }
            }
        }
    }

    public static void a(JSONObject jSONObject) {
        if (jSONObject != null && !e()) {
            try {
                jSONObject.remove("sim_serial_number");
            } catch (Exception unused) {
            }
        }
    }

    public static void a(boolean z) {
        u = z;
        if (p != null) {
            synchronized (t) {
                a(p);
            }
        }
    }

    public static void a(Context context, String str) {
        try {
            SharedPreferences.Editor edit = a.a(context).edit();
            edit.putString("app_track", str);
            edit.commit();
        } catch (Throwable unused) {
        }
    }

    private static void a(JSONObject jSONObject, JSONObject jSONObject2) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                jSONObject2.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:226:0x04d6, code lost:
        if (com.bytedance.common.utility.StringUtils.isEmpty(m) == false) goto L_0x04d8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:234:0x04f2, code lost:
        if (r4.equals(m) == false) goto L_0x04d8;
     */
    /* JADX WARNING: Removed duplicated region for block: B:203:0x043c A[Catch:{ Throwable -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x0459 A[Catch:{ Throwable -> 0x049c }] */
    /* JADX WARNING: Removed duplicated region for block: B:240:0x04fc A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x0506 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x0528 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:261:0x0543 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x055e A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0569 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:275:0x0570 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0577 A[Catch:{ Throwable -> 0x0586 }] */
    /* JADX WARNING: Removed duplicated region for block: B:285:0x058c  */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x05ac A[Catch:{ Throwable -> 0x05b9 }] */
    /* JADX WARNING: Removed duplicated region for block: B:295:0x05c1 A[SYNTHETIC, Splitter:B:295:0x05c1] */
    /* JADX WARNING: Removed duplicated region for block: B:332:0x0664  */
    /* JADX WARNING: Removed duplicated region for block: B:338:0x066f  */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x06a9 A[Catch:{ Throwable -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:353:0x06c0 A[Catch:{ Throwable -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:356:0x06ee A[Catch:{ Throwable -> 0x06f4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x06fb A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(android.content.Context r13, org.json.JSONObject r14) {
        /*
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r1 = p
            r2 = 1
            if (r1 == 0) goto L_0x0017
            java.lang.Object r1 = t
            monitor-enter(r1)
            org.json.JSONObject r13 = p     // Catch:{ all -> 0x0014 }
            a((org.json.JSONObject) r13, (org.json.JSONObject) r14)     // Catch:{ all -> 0x0014 }
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            return r2
        L_0x0014:
            r13 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r13
        L_0x0017:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r3 = 0
            java.lang.String r4 = r13.getPackageName()     // Catch:{ Exception -> 0x0705 }
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x0058 }
            r6 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r5 = r5.getApplicationInfo(r4, r6)     // Catch:{ Exception -> 0x0058 }
            android.os.Bundle r5 = r5.metaData     // Catch:{ Exception -> 0x0058 }
            java.lang.String r6 = f28344a     // Catch:{ Exception -> 0x0058 }
            if (r6 == 0) goto L_0x0041
            java.lang.String r6 = f28344a     // Catch:{ Exception -> 0x0058 }
            int r6 = r6.length()     // Catch:{ Exception -> 0x0058 }
            if (r6 <= 0) goto L_0x0041
            java.lang.String r6 = "channel"
            java.lang.String r7 = f28344a     // Catch:{ Exception -> 0x0058 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0058 }
            goto L_0x004c
        L_0x0041:
            java.lang.String r6 = "channel"
            java.lang.String r7 = "UMENG_CHANNEL"
            java.lang.String r7 = r5.getString(r7)     // Catch:{ Exception -> 0x0058 }
            r0.put(r6, r7)     // Catch:{ Exception -> 0x0058 }
        L_0x004c:
            java.lang.String r6 = "appkey"
            java.lang.String r7 = "UMENG_APPKEY"
            java.lang.String r5 = r5.getString(r7)     // Catch:{ Exception -> 0x0058 }
            r0.put(r6, r5)     // Catch:{ Exception -> 0x0058 }
            goto L_0x005c
        L_0x0058:
            r5 = move-exception
            a((java.lang.Throwable) r5)     // Catch:{ Exception -> 0x0705 }
        L_0x005c:
            java.lang.String r5 = "package"
            java.lang.String r6 = r13.getPackageName()     // Catch:{ Exception -> 0x0705 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x0705 }
            com.ss.android.common.AppContext r5 = f28345b     // Catch:{ Exception -> 0x0705 }
            if (r5 == 0) goto L_0x0071
            com.ss.android.common.AppContext r5 = f28345b     // Catch:{ Exception -> 0x0705 }
            java.lang.String r5 = r5.getVersion()     // Catch:{ Exception -> 0x0705 }
            k = r5     // Catch:{ Exception -> 0x0705 }
        L_0x0071:
            java.lang.String r5 = f28346c     // Catch:{ Exception -> 0x0705 }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Exception -> 0x0705 }
            if (r5 != 0) goto L_0x007d
            java.lang.String r5 = f28346c     // Catch:{ Exception -> 0x0705 }
            k = r5     // Catch:{ Exception -> 0x0705 }
        L_0x007d:
            java.lang.String r5 = "app_version"
            java.lang.String r6 = k     // Catch:{ Exception -> 0x0705 }
            r0.put(r5, r6)     // Catch:{ Exception -> 0x0705 }
            com.ss.android.common.AppContext r5 = f28345b     // Catch:{ Exception -> 0x0705 }
            if (r5 == 0) goto L_0x0090
            com.ss.android.common.AppContext r5 = f28345b     // Catch:{ Exception -> 0x0705 }
            int r5 = r5.getVersionCode()     // Catch:{ Exception -> 0x0705 }
            l = r5     // Catch:{ Exception -> 0x0705 }
        L_0x0090:
            android.content.pm.PackageManager r5 = r13.getPackageManager()     // Catch:{ Exception -> 0x0705 }
            android.content.pm.PackageInfo r4 = r5.getPackageInfo(r4, r3)     // Catch:{ Exception -> 0x0705 }
            android.content.pm.ApplicationInfo r5 = r4.applicationInfo     // Catch:{ Exception -> 0x0705 }
            if (r5 == 0) goto L_0x00ab
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch:{ Exception -> 0x0705 }
            int r4 = r4.labelRes     // Catch:{ Exception -> 0x0705 }
            if (r4 <= 0) goto L_0x00ab
            java.lang.String r5 = "display_name"
            java.lang.String r4 = r13.getString(r4)     // Catch:{ Exception -> 0x0705 }
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0705 }
        L_0x00ab:
            com.ss.android.common.AppContext r4 = f28345b     // Catch:{ Exception -> 0x0705 }
            if (r4 == 0) goto L_0x00c9
            com.ss.android.common.AppContext r4 = f28345b     // Catch:{ Exception -> 0x0705 }
            int r4 = r4.getUpdateVersionCode()     // Catch:{ Exception -> 0x0705 }
            if (r4 <= 0) goto L_0x00bc
            java.lang.String r5 = "update_version_code"
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0705 }
        L_0x00bc:
            com.ss.android.common.AppContext r4 = f28345b     // Catch:{ Exception -> 0x0705 }
            int r4 = r4.getManifestVersionCode()     // Catch:{ Exception -> 0x0705 }
            if (r4 <= 0) goto L_0x00c9
            java.lang.String r5 = "manifest_version_code"
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0705 }
        L_0x00c9:
            r4 = 4
            java.lang.String[] r5 = new java.lang.String[r4]
            java.lang.String r6 = "channel"
            r5[r3] = r6
            java.lang.String r6 = "appkey"
            r5[r2] = r6
            r6 = 2
            java.lang.String r7 = "package"
            r5[r6] = r7
            r6 = 3
            java.lang.String r7 = "app_version"
            r5[r6] = r7
            int r6 = f28347d     // Catch:{ Exception -> 0x0167 }
            if (r6 != 0) goto L_0x00ee
            com.ss.android.common.AppContext r6 = f28345b     // Catch:{ Exception -> 0x0167 }
            if (r6 == 0) goto L_0x00ee
            com.ss.android.common.AppContext r6 = f28345b     // Catch:{ Exception -> 0x0167 }
            int r6 = r6.getAid()     // Catch:{ Exception -> 0x0167 }
            f28347d = r6     // Catch:{ Exception -> 0x0167 }
        L_0x00ee:
            java.lang.String r6 = "aid"
            int r7 = f28347d     // Catch:{ Exception -> 0x0167 }
            r1.put(r6, r7)     // Catch:{ Exception -> 0x0167 }
            r6 = 0
        L_0x00f6:
            if (r6 >= r4) goto L_0x0115
            r7 = r5[r6]     // Catch:{ Exception -> 0x0167 }
            java.lang.Object r8 = r0.get(r7)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ Exception -> 0x0167 }
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0167 }
            if (r9 == 0) goto L_0x010f
            java.lang.String r8 = "appkey"
            boolean r7 = r8.equals(r7)     // Catch:{ Exception -> 0x0167 }
            if (r7 != 0) goto L_0x0112
            return r3
        L_0x010f:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x0167 }
        L_0x0112:
            int r6 = r6 + 1
            goto L_0x00f6
        L_0x0115:
            java.lang.String r0 = "version_code"
            int r4 = l     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "sdk_version"
            java.lang.String r4 = f28349f     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "os"
            java.lang.String r4 = "Android"
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "os_version"
            java.lang.String r4 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "os_api"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "device_model"
            java.lang.String r4 = android.os.Build.MODEL     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "device_brand"
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "device_manufacturer"
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "cpu_abi"
            java.lang.String r4 = android.os.Build.CPU_ABI     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = "build_serial"
            java.lang.String r4 = android.os.Build.SERIAL     // Catch:{ Exception -> 0x0167 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0167 }
            java.lang.String r0 = f28348e     // Catch:{ Exception -> 0x0167 }
            if (r0 != 0) goto L_0x0161
            java.lang.String r0 = ""
        L_0x0161:
            java.lang.String r4 = "release_build"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x0167 }
            goto L_0x016b
        L_0x0167:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x016b:
            android.content.res.Resources r0 = r13.getResources()     // Catch:{ Exception -> 0x01b4 }
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()     // Catch:{ Exception -> 0x01b4 }
            int r4 = r0.densityDpi     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r5 = "density_dpi"
            r1.put(r5, r4)     // Catch:{ Exception -> 0x01b4 }
            r5 = 120(0x78, float:1.68E-43)
            if (r4 == r5) goto L_0x018f
            r5 = 240(0xf0, float:3.36E-43)
            if (r4 == r5) goto L_0x018c
            r5 = 320(0x140, float:4.48E-43)
            if (r4 == r5) goto L_0x0189
            java.lang.String r4 = "mdpi"
            goto L_0x0191
        L_0x0189:
            java.lang.String r4 = "xhdpi"
            goto L_0x0191
        L_0x018c:
            java.lang.String r4 = "hdpi"
            goto L_0x0191
        L_0x018f:
            java.lang.String r4 = "ldpi"
        L_0x0191:
            java.lang.String r5 = "display_density"
            r1.put(r5, r4)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r4 = "resolution"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x01b4 }
            r5.<init>()     // Catch:{ Exception -> 0x01b4 }
            int r6 = r0.heightPixels     // Catch:{ Exception -> 0x01b4 }
            r5.append(r6)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r6 = "x"
            r5.append(r6)     // Catch:{ Exception -> 0x01b4 }
            int r0 = r0.widthPixels     // Catch:{ Exception -> 0x01b4 }
            r5.append(r0)     // Catch:{ Exception -> 0x01b4 }
            java.lang.String r0 = r5.toString()     // Catch:{ Exception -> 0x01b4 }
            r1.put(r4, r0)     // Catch:{ Exception -> 0x01b4 }
            goto L_0x01b8
        L_0x01b4:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x01b8:
            android.content.res.Resources r0 = r13.getResources()     // Catch:{ Exception -> 0x020b }
            android.content.res.Configuration r0 = r0.getConfiguration()     // Catch:{ Exception -> 0x020b }
            java.util.Locale r0 = r0.locale     // Catch:{ Exception -> 0x020b }
            java.lang.String r0 = r0.getLanguage()     // Catch:{ Exception -> 0x020b }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x020b }
            if (r4 != 0) goto L_0x01d1
            java.lang.String r4 = "language"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x020b }
        L_0x01d1:
            java.lang.String r0 = com.bytedance.common.utility.NetworkUtils.getMacAddress(r13)     // Catch:{ Exception -> 0x020b }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x020b }
            if (r4 != 0) goto L_0x01e2
            java.lang.String r4 = "mc"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x020b }
            m = r0     // Catch:{ Exception -> 0x020b }
        L_0x01e2:
            java.util.TimeZone r0 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x020b }
            int r0 = r0.getRawOffset()     // Catch:{ Exception -> 0x020b }
            r4 = 3600000(0x36ee80, float:5.044674E-39)
            int r0 = r0 / r4
            r4 = -12
            if (r0 >= r4) goto L_0x01f4
            r0 = -12
        L_0x01f4:
            r4 = 12
            if (r0 <= r4) goto L_0x01fa
            r0 = 12
        L_0x01fa:
            java.lang.String r4 = "timezone"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x020b }
            java.lang.String r0 = com.bytedance.common.utility.NetworkUtils.getNetworkAccessType((android.content.Context) r13)     // Catch:{ Exception -> 0x020b }
            if (r0 == 0) goto L_0x020f
            java.lang.String r4 = "access"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x020b }
            goto L_0x020f
        L_0x020b:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x020f:
            java.lang.String r0 = com.ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x0223 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0223 }
            if (r0 != 0) goto L_0x0227
            java.lang.String r0 = "aliyun_uuid"
            java.lang.String r4 = com.ss.android.common.applog.NetUtil.getAliyunUuid()     // Catch:{ Exception -> 0x0223 }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x0223 }
            goto L_0x0227
        L_0x0223:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x0227:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = n     // Catch:{ Exception -> 0x025d }
            boolean r0 = r0.isEmpty()     // Catch:{ Exception -> 0x025d }
            if (r0 != 0) goto L_0x0255
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = n     // Catch:{ Exception -> 0x025d }
            java.util.Set r0 = r0.entrySet()     // Catch:{ Exception -> 0x025d }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x025d }
        L_0x0239:
            boolean r4 = r0.hasNext()     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x0255
            java.lang.Object r4 = r0.next()     // Catch:{ Exception -> 0x025d }
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch:{ Exception -> 0x025d }
            if (r4 == 0) goto L_0x0239
            java.lang.Object r5 = r4.getKey()     // Catch:{ Exception -> 0x025d }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x025d }
            java.lang.Object r4 = r4.getValue()     // Catch:{ Exception -> 0x025d }
            r1.put(r5, r4)     // Catch:{ Exception -> 0x025d }
            goto L_0x0239
        L_0x0255:
            java.lang.String r0 = "not_request_sender"
            boolean r4 = o     // Catch:{ Exception -> 0x025d }
            r1.put(r0, r4)     // Catch:{ Exception -> 0x025d }
            goto L_0x0261
        L_0x025d:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x0261:
            java.lang.String r0 = "phone"
            java.lang.Object r0 = r13.getSystemService(r0)     // Catch:{ Exception -> 0x0288 }
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0     // Catch:{ Exception -> 0x0288 }
            java.lang.String r4 = r0.getNetworkOperatorName()     // Catch:{ Exception -> 0x0288 }
            java.lang.String r0 = r0.getNetworkOperator()     // Catch:{ Exception -> 0x0288 }
            boolean r5 = com.bytedance.common.utility.StringUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0288 }
            if (r5 != 0) goto L_0x027c
            java.lang.String r5 = "carrier"
            r1.put(r5, r4)     // Catch:{ Exception -> 0x0288 }
        L_0x027c:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x0288 }
            if (r4 != 0) goto L_0x028c
            java.lang.String r4 = "mcc_mnc"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x0288 }
            goto L_0x028c
        L_0x0288:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x028c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            boolean r4 = com.ss.android.common.util.ToolUtils.isMiui()     // Catch:{ Throwable -> 0x02df }
            if (r4 == 0) goto L_0x029d
            java.lang.String r4 = "MIUI-"
            r0.append(r4)     // Catch:{ Throwable -> 0x02df }
            goto L_0x02c6
        L_0x029d:
            boolean r4 = com.ss.android.common.util.ToolUtils.isFlyme()     // Catch:{ Throwable -> 0x02df }
            if (r4 == 0) goto L_0x02a9
            java.lang.String r4 = "FLYME-"
            r0.append(r4)     // Catch:{ Throwable -> 0x02df }
            goto L_0x02c6
        L_0x02a9:
            java.lang.String r4 = com.ss.android.common.util.ToolUtils.getEmuiInfo()     // Catch:{ Throwable -> 0x02df }
            boolean r5 = com.ss.android.common.util.ToolUtils.isEmui(r4)     // Catch:{ Throwable -> 0x02df }
            if (r5 == 0) goto L_0x02b8
            java.lang.String r5 = "EMUI-"
            r0.append(r5)     // Catch:{ Throwable -> 0x02df }
        L_0x02b8:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x02df }
            if (r5 != 0) goto L_0x02c6
            r0.append(r4)     // Catch:{ Throwable -> 0x02df }
            java.lang.String r4 = "-"
            r0.append(r4)     // Catch:{ Throwable -> 0x02df }
        L_0x02c6:
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x02df }
            r0.append(r4)     // Catch:{ Throwable -> 0x02df }
            int r4 = r0.length()     // Catch:{ Throwable -> 0x02df }
            if (r4 <= 0) goto L_0x02e3
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x02df }
            r = r0     // Catch:{ Throwable -> 0x02df }
            java.lang.String r0 = "rom"
            java.lang.String r4 = r     // Catch:{ Throwable -> 0x02df }
            r1.put(r0, r4)     // Catch:{ Throwable -> 0x02df }
            goto L_0x02e3
        L_0x02df:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x02e3:
            boolean r0 = com.ss.android.common.util.ToolUtils.isMiui()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x0313
            boolean r0 = com.ss.android.common.util.ToolUtils.isMiui()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x030f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "miui_"
            r0.<init>(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.miui.ui.version.name"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0490
        L_0x030f:
            java.lang.String r0 = ""
            goto L_0x0490
        L_0x0313:
            boolean r0 = com.ss.android.common.util.ToolUtils.isFlyme()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x032f
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x032b
            java.lang.String r4 = r0.toLowerCase()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r5 = "flyme"
            boolean r4 = r4.contains(r5)     // Catch:{ Throwable -> 0x049c }
            if (r4 == 0) goto L_0x032b
            goto L_0x0490
        L_0x032b:
            java.lang.String r0 = ""
            goto L_0x0490
        L_0x032f:
            boolean r0 = com.ss.android.d.c.d.a()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x035f
            boolean r0 = com.ss.android.d.c.d.a()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x035b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "coloros_"
            r0.<init>(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.build.version.opporom"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0490
        L_0x035b:
            java.lang.String r0 = ""
            goto L_0x0490
        L_0x035f:
            java.lang.String r0 = com.ss.android.common.util.ToolUtils.getEmuiInfo()     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x0388
            java.lang.String r4 = r0.toLowerCase()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r5 = "emotionui"
            boolean r4 = r4.contains(r5)     // Catch:{ Throwable -> 0x049c }
            if (r4 == 0) goto L_0x0388
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            r4.<init>()     // Catch:{ Throwable -> 0x049c }
            r4.append(r0)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = "_"
            r4.append(r0)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            r4.append(r0)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r4.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x038a
        L_0x0388:
            java.lang.String r0 = ""
        L_0x038a:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x0392
            goto L_0x0490
        L_0x0392:
            java.lang.String r0 = "ro.vivo.os.build.display.id"
            java.lang.String r0 = com.ss.android.d.c.d.a(r0)     // Catch:{ Throwable -> 0x049c }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x03ac
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Throwable -> 0x049c }
            java.lang.CharSequence r4 = com.ss.android.d.c.d.f28395b     // Catch:{ Throwable -> 0x049c }
            boolean r0 = r0.contains(r4)     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x03ac
            r0 = 1
            goto L_0x03ad
        L_0x03ac:
            r0 = 0
        L_0x03ad:
            if (r0 == 0) goto L_0x03d1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            r0.<init>()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.vivo.os.build.display.id"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.vivo.product.version"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0490
        L_0x03d1:
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r0 != 0) goto L_0x03e9
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Throwable -> 0x049c }
            java.lang.CharSequence r4 = com.ss.android.d.c.d.f28394a     // Catch:{ Throwable -> 0x049c }
            boolean r0 = r0.contains(r4)     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x03e9
            r0 = 1
            goto L_0x03ea
        L_0x03e9:
            r0 = 0
        L_0x03ea:
            if (r0 == 0) goto L_0x040a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            r0.<init>()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.gn.sv.version"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0490
        L_0x040a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            r0.<init>()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x0439
            java.lang.String r0 = r0.toLowerCase()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "360"
            boolean r4 = r0.contains(r4)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x0437
            java.lang.String r4 = "qiku"
            boolean r0 = r0.contains(r4)     // Catch:{ Throwable -> 0x049c }
            if (r0 == 0) goto L_0x0439
        L_0x0437:
            r0 = 1
            goto L_0x043a
        L_0x0439:
            r0 = 0
        L_0x043a:
            if (r0 == 0) goto L_0x0459
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            r0.<init>()     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.build.uiversion"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0490
        L_0x0459:
            java.lang.String r0 = "ro.letv.release.version"
            java.lang.String r0 = com.ss.android.d.c.d.a(r0)     // Catch:{ Throwable -> 0x049c }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            r0 = r0 ^ r2
            if (r0 == 0) goto L_0x0485
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "eui_"
            r0.<init>(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "ro.letv.release.version"
            java.lang.String r4 = com.ss.android.d.c.d.a(r4)     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = "_"
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r4 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
            r0.append(r4)     // Catch:{ Throwable -> 0x049c }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x049c }
            goto L_0x0487
        L_0x0485:
            java.lang.String r0 = ""
        L_0x0487:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x048e
            goto L_0x0490
        L_0x048e:
            java.lang.String r0 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x049c }
        L_0x0490:
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x049c }
            if (r4 != 0) goto L_0x04a0
            java.lang.String r4 = "rom_version"
            r1.put(r4, r0)     // Catch:{ Throwable -> 0x049c }
            goto L_0x04a0
        L_0x049c:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x04a0:
            java.lang.String r0 = a((android.content.Context) r13)
            if (r0 == 0) goto L_0x04ad
            java.lang.String r4 = "sig_hash"
            r1.put(r4, r0)     // Catch:{ JSONException -> 0x04ac }
            goto L_0x04ad
        L_0x04ac:
        L_0x04ad:
            android.content.SharedPreferences r0 = com.ss.android.d.a.a.a(r13)
            java.lang.String r4 = "mac_addr"
            r5 = 0
            java.lang.String r4 = r0.getString(r4, r5)
            java.lang.String r6 = "google_aid"
            java.lang.String r6 = r0.getString(r6, r5)
            java.lang.String r7 = "app_language"
            java.lang.String r7 = r0.getString(r7, r5)
            java.lang.String r8 = "app_region"
            java.lang.String r8 = r0.getString(r8, r5)
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r9 == 0) goto L_0x04da
            java.lang.String r4 = m
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x04f5
        L_0x04d8:
            r4 = 1
            goto L_0x04f6
        L_0x04da:
            java.lang.String r9 = m
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x04ec
            m = r4
            java.lang.String r4 = "mc"
            java.lang.String r9 = m     // Catch:{ JSONException -> 0x04f5 }
            r1.put(r4, r9)     // Catch:{ JSONException -> 0x04f5 }
            goto L_0x04f5
        L_0x04ec:
            java.lang.String r9 = m
            boolean r4 = r4.equals(r9)
            if (r4 != 0) goto L_0x04f5
            goto L_0x04d8
        L_0x04f5:
            r4 = 0
        L_0x04f6:
            boolean r9 = com.ss.android.d.d.d()     // Catch:{ Throwable -> 0x0586 }
            if (r9 == 0) goto L_0x0500
            java.lang.String r5 = com.ss.android.d.c.c.g()     // Catch:{ Throwable -> 0x0586 }
        L_0x0500:
            boolean r9 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0586 }
            if (r9 == 0) goto L_0x050a
            java.lang.String r5 = com.ss.android.a.a()     // Catch:{ Throwable -> 0x0586 }
        L_0x050a:
            java.lang.String r9 = com.ss.android.a.b()     // Catch:{ Throwable -> 0x0586 }
            java.lang.String r10 = com.ss.android.a.c()     // Catch:{ Throwable -> 0x0586 }
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0520
            boolean r11 = r5.equals(r6)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0520
            r6 = 1
            goto L_0x0522
        L_0x0520:
            r5 = r6
            r6 = 0
        L_0x0522:
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x052d
            java.lang.String r11 = "google_aid"
            r1.put(r11, r5)     // Catch:{ Throwable -> 0x0586 }
        L_0x052d:
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r9)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x053c
            boolean r11 = r9.equals(r7)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x053c
            r7 = r9
            r9 = 1
            goto L_0x053d
        L_0x053c:
            r9 = 0
        L_0x053d:
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0548
            java.lang.String r11 = "app_language"
            r1.put(r11, r7)     // Catch:{ Throwable -> 0x0586 }
        L_0x0548:
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r10)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0557
            boolean r11 = r10.equals(r8)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0557
            r8 = r10
            r10 = 1
            goto L_0x0558
        L_0x0557:
            r10 = 0
        L_0x0558:
            boolean r11 = com.bytedance.common.utility.StringUtils.isEmpty(r8)     // Catch:{ Throwable -> 0x0586 }
            if (r11 != 0) goto L_0x0563
            java.lang.String r11 = "app_region"
            r1.put(r11, r8)     // Catch:{ Throwable -> 0x0586 }
        L_0x0563:
            android.content.SharedPreferences$Editor r11 = r0.edit()     // Catch:{ Throwable -> 0x0586 }
            if (r6 == 0) goto L_0x056e
            java.lang.String r12 = "google_aid"
            r11.putString(r12, r5)     // Catch:{ Throwable -> 0x0586 }
        L_0x056e:
            if (r9 == 0) goto L_0x0575
            java.lang.String r5 = "app_language"
            r11.putString(r5, r7)     // Catch:{ Throwable -> 0x0586 }
        L_0x0575:
            if (r10 == 0) goto L_0x057c
            java.lang.String r5 = "app_region"
            r11.putString(r5, r8)     // Catch:{ Throwable -> 0x0586 }
        L_0x057c:
            if (r9 != 0) goto L_0x0582
            if (r10 != 0) goto L_0x0582
            if (r6 == 0) goto L_0x058a
        L_0x0582:
            r11.commit()     // Catch:{ Throwable -> 0x0586 }
            goto L_0x058a
        L_0x0586:
            r5 = move-exception
            a((java.lang.Throwable) r5)
        L_0x058a:
            if (r4 == 0) goto L_0x059a
            android.content.SharedPreferences$Editor r4 = r0.edit()
            java.lang.String r5 = "mac_addr"
            java.lang.String r6 = m
            r4.putString(r5, r6)
            r4.commit()
        L_0x059a:
            java.lang.String r4 = "app_track"
            java.lang.String r5 = ""
            java.lang.String r0 = r0.getString(r4, r5)
            s = r0
            java.lang.String r0 = s     // Catch:{ Throwable -> 0x05b9 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x05b9 }
            if (r0 != 0) goto L_0x05bd
            java.lang.String r0 = "app_track"
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x05b9 }
            java.lang.String r5 = s     // Catch:{ Throwable -> 0x05b9 }
            r4.<init>(r5)     // Catch:{ Throwable -> 0x05b9 }
            r1.put(r0, r4)     // Catch:{ Throwable -> 0x05b9 }
            goto L_0x05bd
        L_0x05b9:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x05bd:
            com.ss.android.d.b.b r0 = h
            if (r0 == 0) goto L_0x065e
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.a()     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x05d2
            java.lang.String r4 = "device_id"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x05d2:
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.c()     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x05e3
            java.lang.String r4 = "openudid"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x05e3:
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.q     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x05f2
            java.lang.String r4 = "install_id"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x05f2:
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            com.ss.android.d.b.a.a r0 = r0.i     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.d()     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x0605
            java.lang.String r4 = "udid"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x0605:
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.d()     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x0616
            java.lang.String r4 = "clientudid"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x0616:
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            com.ss.android.d.b.a.a r0 = r0.i     // Catch:{ Exception -> 0x065a }
            java.lang.String r0 = r0.b()     // Catch:{ Exception -> 0x065a }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Exception -> 0x065a }
            if (r4 != 0) goto L_0x0629
            java.lang.String r4 = "serial_number"
            r1.put(r4, r0)     // Catch:{ Exception -> 0x065a }
        L_0x0629:
            boolean r0 = e()     // Catch:{ Exception -> 0x065a }
            if (r0 == 0) goto L_0x065e
            com.ss.android.d.b.b r0 = h     // Catch:{ Exception -> 0x065a }
            com.ss.android.d.b.a.a r0 = r0.i     // Catch:{ Exception -> 0x065a }
            java.lang.String[] r0 = r0.c()     // Catch:{ Exception -> 0x065a }
            if (r0 == 0) goto L_0x065e
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ Exception -> 0x065a }
            r4.<init>()     // Catch:{ Exception -> 0x065a }
            int r5 = r0.length     // Catch:{ Exception -> 0x065a }
        L_0x063f:
            if (r3 >= r5) goto L_0x0654
            r6 = r0[r3]     // Catch:{ Exception -> 0x065a }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0651 }
            r7.<init>()     // Catch:{ JSONException -> 0x0651 }
            java.lang.String r8 = "sim_serial_number"
            org.json.JSONObject r6 = r7.put(r8, r6)     // Catch:{ JSONException -> 0x0651 }
            r4.put(r6)     // Catch:{ JSONException -> 0x0651 }
        L_0x0651:
            int r3 = r3 + 1
            goto L_0x063f
        L_0x0654:
            java.lang.String r0 = "sim_serial_number"
            r1.put(r0, r4)     // Catch:{ Exception -> 0x065a }
            goto L_0x065e
        L_0x065a:
            r0 = move-exception
            a((java.lang.Throwable) r0)
        L_0x065e:
            boolean r0 = com.ss.android.d.d.b(r13)
            if (r0 == 0) goto L_0x066b
            java.lang.String r0 = "new_user_mode"
            r1.put(r0, r2)     // Catch:{ JSONException -> 0x066a }
            goto L_0x066b
        L_0x066a:
        L_0x066b:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = j
            if (r0 == 0) goto L_0x069b
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Object> r0 = j
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0679:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x069b
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getValue()     // Catch:{ JSONException -> 0x0699 }
            if (r4 == 0) goto L_0x0679
            java.lang.Object r4 = r3.getKey()     // Catch:{ JSONException -> 0x0699 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ JSONException -> 0x0699 }
            java.lang.Object r3 = r3.getValue()     // Catch:{ JSONException -> 0x0699 }
            r1.put(r4, r3)     // Catch:{ JSONException -> 0x0699 }
            goto L_0x0679
        L_0x0699:
            goto L_0x0679
        L_0x069b:
            java.util.Locale r0 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x06f4 }
            java.lang.String r0 = r0.getCountry()     // Catch:{ Throwable -> 0x06f4 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x06f4 }
            if (r3 != 0) goto L_0x06ae
            java.lang.String r3 = "region"
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x06f4 }
        L_0x06ae:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x06f4 }
            java.util.TimeZone r0 = r0.getTimeZone()     // Catch:{ Throwable -> 0x06f4 }
            java.lang.String r0 = r0.getID()     // Catch:{ Throwable -> 0x06f4 }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x06f4 }
            if (r3 != 0) goto L_0x06c5
            java.lang.String r3 = "tz_name"
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x06f4 }
        L_0x06c5:
            java.util.Calendar r0 = java.util.Calendar.getInstance()     // Catch:{ Throwable -> 0x06f4 }
            java.util.TimeZone r0 = r0.getTimeZone()     // Catch:{ Throwable -> 0x06f4 }
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x06f4 }
            int r0 = r0.getOffset(r3)     // Catch:{ Throwable -> 0x06f4 }
            int r0 = r0 / 1000
            java.lang.String r3 = "tz_offset"
            r1.put(r3, r0)     // Catch:{ Throwable -> 0x06f4 }
            java.lang.String r0 = "phone"
            java.lang.Object r13 = r13.getSystemService(r0)     // Catch:{ Throwable -> 0x06f4 }
            android.telephony.TelephonyManager r13 = (android.telephony.TelephonyManager) r13     // Catch:{ Throwable -> 0x06f4 }
            java.lang.String r13 = r13.getSimCountryIso()     // Catch:{ Throwable -> 0x06f4 }
            boolean r0 = com.bytedance.common.utility.StringUtils.isEmpty(r13)     // Catch:{ Throwable -> 0x06f4 }
            if (r0 != 0) goto L_0x06f8
            java.lang.String r0 = "sim_region"
            r1.put(r0, r13)     // Catch:{ Throwable -> 0x06f4 }
            goto L_0x06f8
        L_0x06f4:
            r13 = move-exception
            a((java.lang.Throwable) r13)
        L_0x06f8:
            java.lang.Object r13 = t
            monitor-enter(r13)
            p = r1     // Catch:{ all -> 0x0702 }
            a((org.json.JSONObject) r1, (org.json.JSONObject) r14)     // Catch:{ all -> 0x0702 }
            monitor-exit(r13)     // Catch:{ all -> 0x0702 }
            return r2
        L_0x0702:
            r14 = move-exception
            monitor-exit(r13)     // Catch:{ all -> 0x0702 }
            throw r14
        L_0x0705:
            r13 = move-exception
            a((java.lang.Throwable) r13)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.a.d.a(android.content.Context, org.json.JSONObject):boolean");
    }
}
