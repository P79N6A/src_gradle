package com.bytedance.crash.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class c {

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f19420b = {"version_code", "manifest_version_code", "aid", "update_version_code"};

    /* renamed from: a  reason: collision with root package name */
    public JSONObject f19421a = new JSONObject();

    /* renamed from: c  reason: collision with root package name */
    private Context f19422c;

    private static String a() {
        try {
            StringBuilder sb = new StringBuilder();
            if (Build.VERSION.SDK_INT < 21 || Build.SUPPORTED_ABIS.length <= 0) {
                sb = new StringBuilder(Build.CPU_ABI);
            } else {
                for (int i = 0; i < Build.SUPPORTED_ABIS.length; i++) {
                    sb.append(Build.SUPPORTED_ABIS[i]);
                    if (i != Build.SUPPORTED_ABIS.length - 1) {
                        sb.append(", ");
                    }
                }
            }
            if (TextUtils.isEmpty(sb.toString())) {
                return "unknown";
            }
            return sb.toString();
        } catch (Exception unused) {
            return "unknown";
        }
    }

    public c(Context context) {
        this.f19422c = context;
    }

    public final JSONObject a(long j) {
        if (j > 0) {
            try {
                this.f19421a.put("user_id", j);
            } catch (JSONException unused) {
            }
        }
        return this.f19421a;
    }

    public final JSONObject a(String str) {
        try {
            this.f19421a.put("device_id", str);
        } catch (JSONException unused) {
        }
        return this.f19421a;
    }

    public final JSONObject a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return this.f19421a;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                this.f19421a.put(next, jSONObject.opt(next));
            } catch (JSONException unused) {
            }
        }
        return this.f19421a;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:14|15|16|17|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x0055 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final org.json.JSONObject a(@android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r7) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0005
            org.json.JSONObject r7 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            return r7
        L_0x0005:
            java.util.Set r0 = r7.entrySet()     // Catch:{ Throwable -> 0x00bc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x00bc }
        L_0x000d:
            boolean r1 = r0.hasNext()     // Catch:{ Throwable -> 0x00bc }
            if (r1 == 0) goto L_0x0037
            java.lang.Object r1 = r0.next()     // Catch:{ Throwable -> 0x00bc }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00bc }
            org.json.JSONObject r2 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00bc }
            boolean r2 = r2.has(r3)     // Catch:{ Throwable -> 0x00bc }
            if (r2 != 0) goto L_0x000d
            org.json.JSONObject r2 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.Object r3 = r1.getKey()     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Throwable -> 0x00bc }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00bc }
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x00bc }
            goto L_0x000d
        L_0x0037:
            java.lang.String[] r0 = f19420b     // Catch:{ Throwable -> 0x00bc }
            int r1 = r0.length     // Catch:{ Throwable -> 0x00bc }
            r2 = 0
        L_0x003b:
            if (r2 >= r1) goto L_0x0061
            r3 = r0[r2]     // Catch:{ Throwable -> 0x00bc }
            boolean r4 = r7.containsKey(r3)     // Catch:{ Throwable -> 0x00bc }
            if (r4 == 0) goto L_0x005e
            java.lang.Object r4 = r7.get(r3)     // Catch:{ Exception -> 0x0055 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x0055 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0055 }
            org.json.JSONObject r5 = r6.f19421a     // Catch:{ Exception -> 0x0055 }
            r5.put(r3, r4)     // Catch:{ Exception -> 0x0055 }
            goto L_0x005e
        L_0x0055:
            org.json.JSONObject r4 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.Object r5 = r7.get(r3)     // Catch:{ Throwable -> 0x00bc }
            r4.put(r3, r5)     // Catch:{ Throwable -> 0x00bc }
        L_0x005e:
            int r2 = r2 + 1
            goto L_0x003b
        L_0x0061:
            java.lang.String r0 = "version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00bc }
            if (r0 == 0) goto L_0x0084
            java.lang.String r0 = "manifest_version_code"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00bc }
            if (r0 != 0) goto L_0x0084
            java.lang.String r0 = "version_code"
            java.lang.Object r0 = r7.get(r0)     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Throwable -> 0x00bc }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ Throwable -> 0x00bc }
            org.json.JSONObject r1 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r2 = "manifest_version_code"
            r1.put(r2, r0)     // Catch:{ Throwable -> 0x00bc }
        L_0x0084:
            java.lang.String r0 = "iid"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00bc }
            if (r0 == 0) goto L_0x00a0
            org.json.JSONObject r0 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r1 = "udid"
            java.lang.String r2 = "iid"
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Throwable -> 0x00bc }
            r0.put(r1, r2)     // Catch:{ Throwable -> 0x00bc }
            org.json.JSONObject r0 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r1 = "iid"
            r0.remove(r1)     // Catch:{ Throwable -> 0x00bc }
        L_0x00a0:
            java.lang.String r0 = "version_name"
            boolean r0 = r7.containsKey(r0)     // Catch:{ Throwable -> 0x00bc }
            if (r0 == 0) goto L_0x00bc
            org.json.JSONObject r0 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r1 = "app_version"
            java.lang.String r2 = "version_name"
            java.lang.Object r7 = r7.get(r2)     // Catch:{ Throwable -> 0x00bc }
            r0.put(r1, r7)     // Catch:{ Throwable -> 0x00bc }
            org.json.JSONObject r7 = r6.f19421a     // Catch:{ Throwable -> 0x00bc }
            java.lang.String r0 = "version_name"
            r7.remove(r0)     // Catch:{ Throwable -> 0x00bc }
        L_0x00bc:
            org.json.JSONObject r7 = r6.f19421a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.e.c.a(java.util.Map):org.json.JSONObject");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(35:0|1|2|(2:4|(1:6))|7|(1:9)(1:10)|11|12|13|(2:15|(2:17|(1:19)(1:20))(1:21))(1:22)|23|24|25|(1:27)|28|(1:30)|31|(1:33)|34|(1:36)|37|38|40|41|(1:43)(2:44|(1:46)(7:47|(1:49)(1:50)|51|(1:56)(1:55)|(1:58)|59|(1:61)))|62|(1:64)|65|(2:67|(1:69)(1:70))(2:71|(2:73|(1:78)(1:77))(2:79|(2:81|(1:83)(1:84))(4:85|(1:90)(1:89)|91|(1:93)(3:94|(1:99)(1:98)|(1:101)(3:102|(1:107)(1:106)|(1:109)(3:110|(2:112|(1:116))|(1:118)(4:119|(1:121)(1:122)|123|(1:125)(1:126))))))))|127|128|130|131|(3:132|133|(4:135|(1:137)|138|(1:140)))|141) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x008d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:132:0x0365 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00d7 */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x0371 A[Catch:{ Exception -> 0x038f }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x009d A[Catch:{ Exception -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae A[Catch:{ Exception -> 0x00d7 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00ed A[Catch:{ Exception -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0100 A[Catch:{ Exception -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0115 A[Catch:{ Exception -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x011b A[Catch:{ Exception -> 0x0122 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x012e A[Catch:{ Throwable -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0134 A[Catch:{ Throwable -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x018c A[Catch:{ Throwable -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x019d A[Catch:{ Throwable -> 0x035a }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01c7 A[Catch:{ Throwable -> 0x035a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.crash.e.c a(android.content.Context r7) {
        /*
            com.bytedance.crash.e.c r0 = new com.bytedance.crash.e.c
            r0.<init>(r7)
            org.json.JSONObject r7 = r0.f19421a
            r1 = 0
            android.content.Context r2 = r0.f19422c     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = r2.getPackageName()     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = "package"
            r7.put(r3, r2)     // Catch:{ Exception -> 0x008d }
            android.content.Context r3 = r0.f19422c     // Catch:{ Exception -> 0x008d }
            android.content.pm.PackageManager r3 = r3.getPackageManager()     // Catch:{ Exception -> 0x008d }
            android.content.pm.PackageInfo r2 = r3.getPackageInfo(r2, r1)     // Catch:{ Exception -> 0x008d }
            android.content.pm.ApplicationInfo r3 = r2.applicationInfo     // Catch:{ Exception -> 0x008d }
            if (r3 == 0) goto L_0x0032
            android.content.pm.ApplicationInfo r2 = r2.applicationInfo     // Catch:{ Exception -> 0x008d }
            int r2 = r2.labelRes     // Catch:{ Exception -> 0x008d }
            if (r2 <= 0) goto L_0x0032
            java.lang.String r3 = "display_name"
            android.content.Context r4 = r0.f19422c     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = r4.getString(r2)     // Catch:{ Exception -> 0x008d }
            r7.put(r3, r2)     // Catch:{ Exception -> 0x008d }
        L_0x0032:
            java.lang.String r2 = "sdk_version"
            r3 = 220(0xdc, float:3.08E-43)
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "sdk_version_name"
            java.lang.String r3 = "2.2.0"
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "os"
            java.lang.String r3 = "Android"
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "os_version"
            java.lang.String r3 = android.os.Build.VERSION.RELEASE     // Catch:{ Exception -> 0x008d }
            java.lang.String r4 = "."
            boolean r4 = r3.contains(r4)     // Catch:{ Exception -> 0x008d }
            if (r4 == 0) goto L_0x0054
            goto L_0x0065
        L_0x0054:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008d }
            r4.<init>()     // Catch:{ Exception -> 0x008d }
            r4.append(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = ".0"
            r4.append(r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r3 = r4.toString()     // Catch:{ Exception -> 0x008d }
        L_0x0065:
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "os_api"
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x008d }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "device_model"
            java.lang.String r3 = android.os.Build.MODEL     // Catch:{ Exception -> 0x008d }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "device_brand"
            java.lang.String r3 = android.os.Build.BRAND     // Catch:{ Exception -> 0x008d }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "device_manufacturer"
            java.lang.String r3 = android.os.Build.MANUFACTURER     // Catch:{ Exception -> 0x008d }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
            java.lang.String r2 = "cpu_abi"
            java.lang.String r3 = a()     // Catch:{ Exception -> 0x008d }
            r7.put(r2, r3)     // Catch:{ Exception -> 0x008d }
        L_0x008d:
            android.content.Context r2 = r0.f19422c     // Catch:{ Exception -> 0x00d7 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x00d7 }
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()     // Catch:{ Exception -> 0x00d7 }
            int r3 = r2.densityDpi     // Catch:{ Exception -> 0x00d7 }
            r4 = 120(0x78, float:1.68E-43)
            if (r3 == r4) goto L_0x00ae
            r4 = 240(0xf0, float:3.36E-43)
            if (r3 == r4) goto L_0x00ab
            r4 = 320(0x140, float:4.48E-43)
            if (r3 == r4) goto L_0x00a8
            java.lang.String r4 = "mdpi"
            goto L_0x00b0
        L_0x00a8:
            java.lang.String r4 = "xhdpi"
            goto L_0x00b0
        L_0x00ab:
            java.lang.String r4 = "hdpi"
            goto L_0x00b0
        L_0x00ae:
            java.lang.String r4 = "ldpi"
        L_0x00b0:
            java.lang.String r5 = "density_dpi"
            r7.put(r5, r3)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r3 = "display_density"
            r7.put(r3, r4)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r3 = "resolution"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00d7 }
            r4.<init>()     // Catch:{ Exception -> 0x00d7 }
            int r5 = r2.heightPixels     // Catch:{ Exception -> 0x00d7 }
            r4.append(r5)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r5 = "x"
            r4.append(r5)     // Catch:{ Exception -> 0x00d7 }
            int r2 = r2.widthPixels     // Catch:{ Exception -> 0x00d7 }
            r4.append(r2)     // Catch:{ Exception -> 0x00d7 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x00d7 }
            r7.put(r3, r2)     // Catch:{ Exception -> 0x00d7 }
        L_0x00d7:
            android.content.Context r2 = r0.f19422c     // Catch:{ Exception -> 0x0122 }
            android.content.res.Resources r2 = r2.getResources()     // Catch:{ Exception -> 0x0122 }
            android.content.res.Configuration r2 = r2.getConfiguration()     // Catch:{ Exception -> 0x0122 }
            java.util.Locale r2 = r2.locale     // Catch:{ Exception -> 0x0122 }
            java.lang.String r2 = r2.getLanguage()     // Catch:{ Exception -> 0x0122 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0122 }
            if (r3 != 0) goto L_0x00f2
            java.lang.String r3 = "language"
            r7.put(r3, r2)     // Catch:{ Exception -> 0x0122 }
        L_0x00f2:
            java.util.Locale r2 = java.util.Locale.getDefault()     // Catch:{ Exception -> 0x0122 }
            java.lang.String r2 = r2.getCountry()     // Catch:{ Exception -> 0x0122 }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x0122 }
            if (r3 != 0) goto L_0x0105
            java.lang.String r3 = "region"
            r7.put(r3, r2)     // Catch:{ Exception -> 0x0122 }
        L_0x0105:
            java.util.TimeZone r2 = java.util.TimeZone.getDefault()     // Catch:{ Exception -> 0x0122 }
            int r2 = r2.getRawOffset()     // Catch:{ Exception -> 0x0122 }
            r3 = 3600000(0x36ee80, float:5.044674E-39)
            int r2 = r2 / r3
            r3 = -12
            if (r2 >= r3) goto L_0x0117
            r2 = -12
        L_0x0117:
            r3 = 12
            if (r2 <= r3) goto L_0x011d
            r2 = 12
        L_0x011d:
            java.lang.String r3 = "timezone"
            r7.put(r3, r2)     // Catch:{ Exception -> 0x0122 }
        L_0x0122:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            boolean r3 = com.bytedance.crash.i.c.c()     // Catch:{ Throwable -> 0x035a }
            r4 = 1
            if (r3 == 0) goto L_0x0134
            java.lang.String r3 = "MIUI-"
            r2.append(r3)     // Catch:{ Throwable -> 0x035a }
            goto L_0x0181
        L_0x0134:
            boolean r3 = com.bytedance.crash.i.c.d()     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x0140
            java.lang.String r3 = "FLYME-"
            r2.append(r3)     // Catch:{ Throwable -> 0x035a }
            goto L_0x0181
        L_0x0140:
            java.lang.String r3 = com.bytedance.crash.i.c.a()     // Catch:{ Throwable -> 0x035a }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r5 == 0) goto L_0x014f
            java.lang.String r5 = com.bytedance.crash.i.c.a()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0150
        L_0x014f:
            r5 = r3
        L_0x0150:
            boolean r6 = android.text.TextUtils.isEmpty(r5)     // Catch:{ Throwable -> 0x035a }
            if (r6 != 0) goto L_0x0168
            java.util.Locale r6 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r5 = r5.toLowerCase(r6)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r6 = "emotionui"
            boolean r5 = r5.startsWith(r6)     // Catch:{ Throwable -> 0x035a }
            if (r5 == 0) goto L_0x0168
            r5 = 1
            goto L_0x016c
        L_0x0168:
            boolean r5 = com.bytedance.crash.i.c.b()     // Catch:{ Throwable -> 0x035a }
        L_0x016c:
            if (r5 == 0) goto L_0x0173
            java.lang.String r5 = "EMUI-"
            r2.append(r5)     // Catch:{ Throwable -> 0x035a }
        L_0x0173:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r5 != 0) goto L_0x0181
            r2.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "-"
            r2.append(r3)     // Catch:{ Throwable -> 0x035a }
        L_0x0181:
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x035a }
            r2.append(r3)     // Catch:{ Throwable -> 0x035a }
            int r3 = r2.length()     // Catch:{ Throwable -> 0x035a }
            if (r3 <= 0) goto L_0x0195
            java.lang.String r3 = "rom"
            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x035a }
            r7.put(r3, r2)     // Catch:{ Throwable -> 0x035a }
        L_0x0195:
            java.lang.String r2 = "rom_version"
            boolean r3 = com.bytedance.crash.i.c.c()     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x01c7
            boolean r1 = com.bytedance.crash.i.c.c()     // Catch:{ Throwable -> 0x035a }
            if (r1 == 0) goto L_0x01c3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "miui_"
            r1.<init>(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.miui.ui.version.name"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.VERSION.INCREMENTAL     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0357
        L_0x01c3:
            java.lang.String r1 = ""
            goto L_0x0357
        L_0x01c7:
            boolean r3 = com.bytedance.crash.i.c.d()     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x01e7
            java.lang.String r1 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            if (r1 == 0) goto L_0x01e3
            java.util.Locale r3 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r1.toLowerCase(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r4 = "flyme"
            boolean r3 = r3.contains(r4)     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x01e3
            goto L_0x0357
        L_0x01e3:
            java.lang.String r1 = ""
            goto L_0x0357
        L_0x01e7:
            boolean r3 = com.bytedance.crash.i.l.a()     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x0217
            boolean r1 = com.bytedance.crash.i.l.a()     // Catch:{ Throwable -> 0x035a }
            if (r1 == 0) goto L_0x0213
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "coloros_"
            r1.<init>(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.build.version.opporom"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0357
        L_0x0213:
            java.lang.String r1 = ""
            goto L_0x0357
        L_0x0217:
            java.lang.String r3 = com.bytedance.crash.i.c.a()     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x0244
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r5 = r3.toLowerCase(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r6 = "emotionui"
            boolean r5 = r5.contains(r6)     // Catch:{ Throwable -> 0x035a }
            if (r5 == 0) goto L_0x0244
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            r5.<init>()     // Catch:{ Throwable -> 0x035a }
            r5.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r5.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            r5.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r5.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0246
        L_0x0244:
            java.lang.String r3 = ""
        L_0x0246:
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r5 != 0) goto L_0x024f
            r1 = r3
            goto L_0x0357
        L_0x024f:
            java.lang.String r3 = "ro.vivo.os.build.display.id"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r5 != 0) goto L_0x026d
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r3.toLowerCase(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.CharSequence r5 = com.bytedance.crash.i.l.f19479b     // Catch:{ Throwable -> 0x035a }
            boolean r3 = r3.contains(r5)     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x026d
            r3 = 1
            goto L_0x026e
        L_0x026d:
            r3 = 0
        L_0x026e:
            if (r3 == 0) goto L_0x0292
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            r1.<init>()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.vivo.os.build.display.id"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.vivo.product.version"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0357
        L_0x0292:
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r3 != 0) goto L_0x02ae
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r3.toLowerCase(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.CharSequence r5 = com.bytedance.crash.i.l.f19478a     // Catch:{ Throwable -> 0x035a }
            boolean r3 = r3.contains(r5)     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x02ae
            r3 = 1
            goto L_0x02af
        L_0x02ae:
            r3 = 0
        L_0x02af:
            if (r3 == 0) goto L_0x02cf
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            r1.<init>()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.gn.sv.version"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0357
        L_0x02cf:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            r3.<init>()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x035a }
            r3.append(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r5 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x035a }
            r3.append(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x035a }
            boolean r5 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x035a }
            if (r5 != 0) goto L_0x0301
            java.util.Locale r5 = java.util.Locale.getDefault()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = r3.toLowerCase(r5)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r5 = "360"
            boolean r5 = r3.contains(r5)     // Catch:{ Throwable -> 0x035a }
            if (r5 != 0) goto L_0x0300
            java.lang.String r5 = "qiku"
            boolean r3 = r3.contains(r5)     // Catch:{ Throwable -> 0x035a }
            if (r3 == 0) goto L_0x0301
        L_0x0300:
            r1 = 1
        L_0x0301:
            if (r1 == 0) goto L_0x0320
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            r1.<init>()     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.build.uiversion"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x0357
        L_0x0320:
            java.lang.String r1 = "ro.letv.release.version"
            java.lang.String r1 = com.bytedance.crash.i.l.a(r1)     // Catch:{ Throwable -> 0x035a }
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x035a }
            r1 = r1 ^ r4
            if (r1 == 0) goto L_0x034c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "eui_"
            r1.<init>(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "ro.letv.release.version"
            java.lang.String r3 = com.bytedance.crash.i.l.a(r3)     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = "_"
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r3 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
            r1.append(r3)     // Catch:{ Throwable -> 0x035a }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x035a }
            goto L_0x034e
        L_0x034c:
            java.lang.String r1 = ""
        L_0x034e:
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x035a }
            if (r3 != 0) goto L_0x0355
            goto L_0x0357
        L_0x0355:
            java.lang.String r1 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x035a }
        L_0x0357:
            r7.put(r2, r1)     // Catch:{ Throwable -> 0x035a }
        L_0x035a:
            java.lang.String r1 = "access"
            android.content.Context r2 = r0.f19422c     // Catch:{ JSONException -> 0x0365 }
            java.lang.String r2 = com.bytedance.crash.i.i.a((android.content.Context) r2)     // Catch:{ JSONException -> 0x0365 }
            r7.put(r1, r2)     // Catch:{ JSONException -> 0x0365 }
        L_0x0365:
            android.content.Context r1 = r0.f19422c     // Catch:{ Exception -> 0x038f }
            java.lang.String r2 = "phone"
            java.lang.Object r1 = r1.getSystemService(r2)     // Catch:{ Exception -> 0x038f }
            android.telephony.TelephonyManager r1 = (android.telephony.TelephonyManager) r1     // Catch:{ Exception -> 0x038f }
            if (r1 == 0) goto L_0x038f
            java.lang.String r2 = r1.getNetworkOperatorName()     // Catch:{ Exception -> 0x038f }
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x038f }
            if (r3 != 0) goto L_0x0380
            java.lang.String r3 = "carrier"
            r7.put(r3, r2)     // Catch:{ Exception -> 0x038f }
        L_0x0380:
            java.lang.String r1 = r1.getNetworkOperator()     // Catch:{ Exception -> 0x038f }
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch:{ Exception -> 0x038f }
            if (r2 != 0) goto L_0x038f
            java.lang.String r2 = "mcc_mnc"
            r7.put(r2, r1)     // Catch:{ Exception -> 0x038f }
        L_0x038f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.e.c.a(android.content.Context):com.bytedance.crash.e.c");
    }
}
