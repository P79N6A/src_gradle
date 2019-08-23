package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.lang.reflect.Field;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public class cq {

    /* renamed from: a  reason: collision with root package name */
    public static int f5856a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f5857b = "";

    public static class a {
        public b A;

        /* renamed from: a  reason: collision with root package name */
        public String f5858a;

        /* renamed from: b  reason: collision with root package name */
        public int f5859b = -1;

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f5860c;

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f5861d;

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f5862e;

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f5863f;
        public JSONObject g;
        public JSONObject h;
        public JSONObject i;
        public JSONObject j;
        public JSONObject k;
        public JSONObject l;
        public JSONObject m;
        public JSONObject n;
        public JSONObject o;
        public JSONObject p;
        public JSONObject q;
        public JSONObject r;
        public JSONObject s;
        public JSONObject t;
        public C0044a u;
        public d v;
        public c w;
        public b x;
        public b y;
        public b z;

        /* renamed from: com.amap.api.mapcore2d.cq$a$a  reason: collision with other inner class name */
        public static class C0044a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f5864a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f5865b;

            /* renamed from: c  reason: collision with root package name */
            public JSONObject f5866c;
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f5867a;

            /* renamed from: b  reason: collision with root package name */
            public String f5868b;

            /* renamed from: c  reason: collision with root package name */
            public String f5869c;

            /* renamed from: d  reason: collision with root package name */
            public String f5870d;
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f5871a;

            /* renamed from: b  reason: collision with root package name */
            public String f5872b;
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f5873a;

            /* renamed from: b  reason: collision with root package name */
            public String f5874b;

            /* renamed from: c  reason: collision with root package name */
            public String f5875c;
        }
    }

    static class b extends eq {

        /* renamed from: f  reason: collision with root package name */
        private String f5876f;
        private Map<String, String> g;
        private boolean h;

        public byte[] b() {
            return null;
        }

        /* access modifiers changed from: protected */
        public String d() {
            return "3.0";
        }

        public Map<String, String> e() {
            return null;
        }

        public boolean a() {
            return this.h;
        }

        public byte[] c() {
            return cz.a(cz.a(n()));
        }

        public String g() {
            if (this.h) {
                return "https://restapi.amap.com/v3/iasdkauth";
            }
            return "http://restapi.amap.com/v3/iasdkauth";
        }

        private Map<String, String> n() {
            String q = ct.q(this.f6074a);
            if (!TextUtils.isEmpty(q)) {
                q = cv.b(new StringBuilder(q).reverse().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", this.f5876f);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.f6075b.a());
            hashMap.put("version", this.f6075b.b());
            hashMap.put("output", "json");
            hashMap.put("androidversion", Build.VERSION.SDK_INT);
            hashMap.put("deviceId", q);
            if (this.g != null && !this.g.isEmpty()) {
                hashMap.putAll(this.g);
            }
            String str = null;
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    ApplicationInfo applicationInfo = this.f6074a.getApplicationInfo();
                    Field declaredField = Class.forName(ApplicationInfo.class.getName()).getDeclaredField("primaryCpuAbi");
                    declaredField.setAccessible(true);
                    str = (String) declaredField.get(applicationInfo);
                } catch (Throwable th) {
                    dd.a(th, "ConfigManager", "getcpu");
                }
            }
            if (TextUtils.isEmpty(str)) {
                str = Build.CPU_ABI;
            }
            hashMap.put("abitype", str);
            hashMap.put("ext", this.f6075b.e());
            return hashMap;
        }

        b(Context context, cy cyVar, String str, Map<String, String> map) {
            super(context, cyVar);
            boolean z;
            this.f5876f = str;
            this.g = map;
            if (Build.VERSION.SDK_INT != 19) {
                z = true;
            } else {
                z = false;
            }
            this.h = z;
        }
    }

    public static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            return "";
        }
        String str2 = "";
        if (jSONObject.has(str) && !jSONObject.getString(str).equals("[]")) {
            str2 = jSONObject.optString(str);
        }
        return str2;
    }

    private static void a(JSONObject jSONObject, a.b bVar) {
        if (bVar != null) {
            try {
                String a2 = a(jSONObject, "m");
                String a3 = a(jSONObject, "u");
                String a4 = a(jSONObject, NotifyType.VIBRATE);
                String a5 = a(jSONObject, "able");
                bVar.f5869c = a2;
                bVar.f5868b = a3;
                bVar.f5870d = a4;
                bVar.f5867a = a(a5, false);
            } catch (Throwable th) {
                dd.a(th, "ConfigManager", "parsePluginEntity");
            }
        }
    }

    private static void a(JSONObject jSONObject, a.c cVar) {
        if (jSONObject != null) {
            try {
                String a2 = a(jSONObject, "md5");
                String a3 = a(jSONObject, PushConstants.WEB_URL);
                cVar.f5872b = a2;
                cVar.f5871a = a3;
            } catch (Throwable th) {
                dd.a(th, "ConfigManager", "parseSDKCoordinate");
            }
        }
    }

    private static void a(JSONObject jSONObject, a.d dVar) {
        if (jSONObject != null) {
            try {
                String a2 = a(jSONObject, "md5");
                String a3 = a(jSONObject, PushConstants.WEB_URL);
                String a4 = a(jSONObject, "sdkversion");
                if (!TextUtils.isEmpty(a2) && !TextUtils.isEmpty(a3)) {
                    if (!TextUtils.isEmpty(a4)) {
                        dVar.f5873a = a3;
                        dVar.f5874b = a2;
                        dVar.f5875c = a4;
                    }
                }
            } catch (Throwable th) {
                dd.a(th, "ConfigManager", "parseSDKUpdate");
            }
        }
    }

    public static boolean a(String str, boolean z) {
        try {
            String[] split = URLDecoder.decode(str).split("/");
            if (split[split.length - 1].charAt(4) % 2 == 1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x007a, code lost:
        r10 = null;
        r11 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x0064 */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: IllegalBlockSizeException (unused javax.crypto.IllegalBlockSizeException), SYNTHETIC, Splitter:B:1:0x0007] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x008f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.amap.api.mapcore2d.cq.a a(android.content.Context r8, com.amap.api.mapcore2d.cy r9, java.lang.String r10, java.util.Map<java.lang.String, java.lang.String> r11) {
        /*
            com.amap.api.mapcore2d.cq$a r0 = new com.amap.api.mapcore2d.cq$a
            r0.<init>()
            r1 = 0
            r2 = 0
            com.amap.api.mapcore2d.ep r3 = new com.amap.api.mapcore2d.ep     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
            r3.<init>()     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
            com.amap.api.mapcore2d.cq$b r4 = new com.amap.api.mapcore2d.cq$b     // Catch:{ co -> 0x006c, Throwable -> 0x0064, IllegalBlockSizeException -> 0x007a }
            r4.<init>(r8, r9, r10, r11)     // Catch:{ co -> 0x006c, Throwable -> 0x0064, IllegalBlockSizeException -> 0x007a }
            boolean r10 = r4.a()     // Catch:{ co -> 0x006c, Throwable -> 0x0064, IllegalBlockSizeException -> 0x007a }
            com.amap.api.mapcore2d.ex r10 = r3.a(r4, r10)     // Catch:{ co -> 0x006c, Throwable -> 0x0064, IllegalBlockSizeException -> 0x007a }
            if (r10 == 0) goto L_0x0029
            byte[] r11 = r10.f6094a     // Catch:{ co -> 0x0025, IllegalBlockSizeException -> 0x0022, Throwable -> 0x001e }
            goto L_0x002a
        L_0x001e:
            r11 = move-exception
            r3 = r11
            r11 = r1
            goto L_0x0072
        L_0x0022:
            r11 = r1
            goto L_0x008c
        L_0x0025:
            r11 = move-exception
            r3 = r11
            r11 = r1
            goto L_0x0081
        L_0x0029:
            r11 = r1
        L_0x002a:
            r3 = 16
            byte[] r4 = new byte[r3]     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            int r5 = r11.length     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            int r5 = r5 - r3
            byte[] r5 = new byte[r5]     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            java.lang.System.arraycopy(r11, r2, r4, r2, r3)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            int r6 = r11.length     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            int r6 = r6 - r3
            java.lang.System.arraycopy(r11, r3, r5, r2, r6)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            java.lang.String r6 = "AES"
            r3.<init>(r4, r6)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            java.lang.String r4 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r4 = javax.crypto.Cipher.getInstance(r4)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            javax.crypto.spec.IvParameterSpec r6 = new javax.crypto.spec.IvParameterSpec     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            byte[] r7 = com.amap.api.mapcore2d.cz.b()     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            r6.<init>(r7)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            r7 = 2
            r4.init(r7, r3, r6)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            byte[] r3 = r4.doFinal(r5)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            java.lang.String r3 = com.amap.api.mapcore2d.cz.a((byte[]) r3)     // Catch:{ co -> 0x0062, IllegalBlockSizeException -> 0x0060, Throwable -> 0x005e }
            r1 = r3
            goto L_0x008c
        L_0x005e:
            r3 = move-exception
            goto L_0x0072
        L_0x0060:
            goto L_0x008c
        L_0x0062:
            r3 = move-exception
            goto L_0x0081
        L_0x0064:
            com.amap.api.mapcore2d.co r10 = new com.amap.api.mapcore2d.co     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
            java.lang.String r11 = "未知的错误"
            r10.<init>(r11)     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
            throw r10     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
        L_0x006c:
            r10 = move-exception
            throw r10     // Catch:{ co -> 0x007d, IllegalBlockSizeException -> 0x007a, Throwable -> 0x006e }
        L_0x006e:
            r11 = move-exception
            r3 = r11
            r10 = r1
            r11 = r10
        L_0x0072:
            java.lang.String r4 = "ConfigManager"
            java.lang.String r5 = "loadConfig"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r3, (java.lang.String) r4, (java.lang.String) r5)
            goto L_0x008c
        L_0x007a:
            r10 = r1
            r11 = r10
            goto L_0x008c
        L_0x007d:
            r11 = move-exception
            r3 = r11
            r10 = r1
            r11 = r10
        L_0x0081:
            java.lang.String r4 = r3.a()
            r0.f5858a = r4
            java.lang.String r4 = "/v3/iasdkauth"
            com.amap.api.mapcore2d.dg.a((com.amap.api.mapcore2d.cy) r9, (java.lang.String) r4, (com.amap.api.mapcore2d.co) r3)
        L_0x008c:
            if (r11 != 0) goto L_0x008f
            return r0
        L_0x008f:
            boolean r3 = android.text.TextUtils.isEmpty(r1)
            if (r3 == 0) goto L_0x0099
            java.lang.String r1 = com.amap.api.mapcore2d.cz.a((byte[]) r11)
        L_0x0099:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ Throwable -> 0x0309 }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x0309 }
            java.lang.String r1 = "status"
            boolean r1 = r11.has(r1)     // Catch:{ Throwable -> 0x0309 }
            if (r1 == 0) goto L_0x0311
            java.lang.String r1 = "status"
            int r1 = r11.getInt(r1)     // Catch:{ Throwable -> 0x0309 }
            r3 = 1
            if (r1 != r3) goto L_0x00b2
            f5856a = r3     // Catch:{ Throwable -> 0x0309 }
            goto L_0x00f3
        L_0x00b2:
            if (r1 != 0) goto L_0x00f3
            java.lang.String r1 = "authcsid"
            java.lang.String r3 = "authgsid"
            if (r10 == 0) goto L_0x00be
            java.lang.String r1 = r10.f6096c     // Catch:{ Throwable -> 0x0309 }
            java.lang.String r3 = r10.f6097d     // Catch:{ Throwable -> 0x0309 }
        L_0x00be:
            com.amap.api.mapcore2d.cz.a(r8, r1, r3, r11)     // Catch:{ Throwable -> 0x0309 }
            f5856a = r2     // Catch:{ Throwable -> 0x0309 }
            java.lang.String r8 = "info"
            boolean r8 = r11.has(r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x00d3
            java.lang.String r8 = "info"
            java.lang.String r8 = r11.getString(r8)     // Catch:{ Throwable -> 0x0309 }
            f5857b = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x00d3:
            java.lang.String r8 = ""
            java.lang.String r10 = "infocode"
            boolean r10 = r11.has(r10)     // Catch:{ Throwable -> 0x0309 }
            if (r10 == 0) goto L_0x00e3
            java.lang.String r8 = "infocode"
            java.lang.String r8 = r11.getString(r8)     // Catch:{ Throwable -> 0x0309 }
        L_0x00e3:
            java.lang.String r10 = "/v3/iasdkauth"
            java.lang.String r1 = f5857b     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.dg.a(r9, r10, r1, r3, r8)     // Catch:{ Throwable -> 0x0309 }
            int r8 = f5856a     // Catch:{ Throwable -> 0x0309 }
            if (r8 != 0) goto L_0x00f3
            java.lang.String r8 = f5857b     // Catch:{ Throwable -> 0x0309 }
            r0.f5858a = r8     // Catch:{ Throwable -> 0x0309 }
            return r0
        L_0x00f3:
            java.lang.String r8 = "ver"
            boolean r8 = r11.has(r8)     // Catch:{ Throwable -> 0x0104 }
            if (r8 == 0) goto L_0x010c
            java.lang.String r8 = "ver"
            int r8 = r11.getInt(r8)     // Catch:{ Throwable -> 0x0104 }
            r0.f5859b = r8     // Catch:{ Throwable -> 0x0104 }
            goto L_0x010c
        L_0x0104:
            r8 = move-exception
            java.lang.String r9 = "AuthConfigManager"
            java.lang.String r10 = "loadConfigVer"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r8, (java.lang.String) r9, (java.lang.String) r10)     // Catch:{ Throwable -> 0x0309 }
        L_0x010c:
            java.lang.String r8 = "result"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r11, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0308
            com.amap.api.mapcore2d.cq$a$a r8 = new com.amap.api.mapcore2d.cq$a$a     // Catch:{ Throwable -> 0x0309 }
            r8.<init>()     // Catch:{ Throwable -> 0x0309 }
            r8.f5864a = r2     // Catch:{ Throwable -> 0x0309 }
            r8.f5865b = r2     // Catch:{ Throwable -> 0x0309 }
            r0.u = r8     // Catch:{ Throwable -> 0x0309 }
            java.lang.String r9 = "result"
            org.json.JSONObject r9 = r11.getJSONObject(r9)     // Catch:{ Throwable -> 0x0309 }
            java.lang.String r10 = "11K"
            boolean r10 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r10)     // Catch:{ Throwable -> 0x0309 }
            if (r10 == 0) goto L_0x0158
            java.lang.String r10 = "11K"
            org.json.JSONObject r10 = r9.getJSONObject(r10)     // Catch:{ Throwable -> 0x0150 }
            java.lang.String r11 = "able"
            java.lang.String r11 = r10.getString(r11)     // Catch:{ Throwable -> 0x0150 }
            boolean r11 = a((java.lang.String) r11, (boolean) r2)     // Catch:{ Throwable -> 0x0150 }
            r8.f5864a = r11     // Catch:{ Throwable -> 0x0150 }
            java.lang.String r11 = "off"
            boolean r11 = r10.has(r11)     // Catch:{ Throwable -> 0x0150 }
            if (r11 == 0) goto L_0x0158
            java.lang.String r11 = "off"
            org.json.JSONObject r10 = r10.getJSONObject(r11)     // Catch:{ Throwable -> 0x0150 }
            r8.f5866c = r10     // Catch:{ Throwable -> 0x0150 }
            goto L_0x0158
        L_0x0150:
            r8 = move-exception
            java.lang.String r10 = "AuthConfigManager"
            java.lang.String r11 = "loadException"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r8, (java.lang.String) r10, (java.lang.String) r11)     // Catch:{ Throwable -> 0x0309 }
        L_0x0158:
            java.lang.String r8 = "11B"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0168
            java.lang.String r8 = "11B"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.h = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0168:
            java.lang.String r8 = "11C"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0178
            java.lang.String r8 = "11C"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.k = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0178:
            java.lang.String r8 = "11I"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0188
            java.lang.String r8 = "11I"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.l = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0188:
            java.lang.String r8 = "11H"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0198
            java.lang.String r8 = "11H"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.m = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0198:
            java.lang.String r8 = "11E"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x01a8
            java.lang.String r8 = "11E"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.n = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x01a8:
            java.lang.String r8 = "11F"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x01b8
            java.lang.String r8 = "11F"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.o = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x01b8:
            java.lang.String r8 = "13A"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x01c8
            java.lang.String r8 = "13A"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.q = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x01c8:
            java.lang.String r8 = "13J"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x01d8
            java.lang.String r8 = "13J"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.i = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x01d8:
            java.lang.String r8 = "11G"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x01e8
            java.lang.String r8 = "11G"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.p = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x01e8:
            java.lang.String r8 = "001"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0200
            java.lang.String r8 = "001"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$d r10 = new com.amap.api.mapcore2d.cq$a$d     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.d) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.v = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x0200:
            java.lang.String r8 = "002"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0218
            java.lang.String r8 = "002"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$c r10 = new com.amap.api.mapcore2d.cq$a$c     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.c) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.w = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x0218:
            java.lang.String r8 = "006"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0228
            java.lang.String r8 = "006"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.r = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0228:
            java.lang.String r8 = "010"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0238
            java.lang.String r8 = "010"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.s = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0238:
            java.lang.String r8 = "11Z"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0250
            java.lang.String r8 = "11Z"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$b r10 = new com.amap.api.mapcore2d.cq$a$b     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.b) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.x = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x0250:
            java.lang.String r8 = "135"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0260
            java.lang.String r8 = "135"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.j = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0260:
            java.lang.String r8 = "13S"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0270
            java.lang.String r8 = "13S"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.g = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0270:
            java.lang.String r8 = "121"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0288
            java.lang.String r8 = "121"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$b r10 = new com.amap.api.mapcore2d.cq$a$b     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.b) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.y = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x0288:
            java.lang.String r8 = "122"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02a0
            java.lang.String r8 = "122"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$b r10 = new com.amap.api.mapcore2d.cq$a$b     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.b) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.z = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x02a0:
            java.lang.String r8 = "123"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02b8
            java.lang.String r8 = "123"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            com.amap.api.mapcore2d.cq$a$b r10 = new com.amap.api.mapcore2d.cq$a$b     // Catch:{ Throwable -> 0x0309 }
            r10.<init>()     // Catch:{ Throwable -> 0x0309 }
            a((org.json.JSONObject) r8, (com.amap.api.mapcore2d.cq.a.b) r10)     // Catch:{ Throwable -> 0x0309 }
            r0.A = r10     // Catch:{ Throwable -> 0x0309 }
        L_0x02b8:
            java.lang.String r8 = "011"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02c8
            java.lang.String r8 = "011"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.f5860c = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x02c8:
            java.lang.String r8 = "012"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02d8
            java.lang.String r8 = "012"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.f5861d = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x02d8:
            java.lang.String r8 = "013"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02e8
            java.lang.String r8 = "013"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.f5862e = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x02e8:
            java.lang.String r8 = "014"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x02f8
            java.lang.String r8 = "014"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.f5863f = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x02f8:
            java.lang.String r8 = "145"
            boolean r8 = com.amap.api.mapcore2d.cz.a((org.json.JSONObject) r9, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0309 }
            if (r8 == 0) goto L_0x0308
            java.lang.String r8 = "145"
            org.json.JSONObject r8 = r9.getJSONObject(r8)     // Catch:{ Throwable -> 0x0309 }
            r0.t = r8     // Catch:{ Throwable -> 0x0309 }
        L_0x0308:
            return r0
        L_0x0309:
            r8 = move-exception
            java.lang.String r9 = "AuthConfigManager"
            java.lang.String r10 = "loadConfig"
            com.amap.api.mapcore2d.dd.a((java.lang.Throwable) r8, (java.lang.String) r9, (java.lang.String) r10)
        L_0x0311:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.cq.a(android.content.Context, com.amap.api.mapcore2d.cy, java.lang.String, java.util.Map):com.amap.api.mapcore2d.cq$a");
    }
}
