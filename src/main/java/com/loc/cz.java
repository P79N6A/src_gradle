package com.loc;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.meizu.cloud.pushsdk.notification.model.NotifyType;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

public final class cz {

    /* renamed from: a  reason: collision with root package name */
    public static int f25739a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f25740b = "";

    public static class a {
        @Deprecated
        public c A;
        public c B;
        public b C;
        public b D;
        public b E;
        public b F;
        public e G;

        /* renamed from: a  reason: collision with root package name */
        public String f25741a;

        /* renamed from: b  reason: collision with root package name */
        public int f25742b = -1;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f25743c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f25744d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f25745e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f25746f;
        @Deprecated
        public JSONObject g;
        @Deprecated
        public JSONObject h;
        @Deprecated
        public JSONObject i;
        @Deprecated
        public JSONObject j;
        @Deprecated
        public JSONObject k;
        @Deprecated
        public JSONObject l;
        @Deprecated
        public JSONObject m;
        @Deprecated
        public JSONObject n;
        @Deprecated
        public JSONObject o;
        @Deprecated
        public JSONObject p;
        @Deprecated
        public JSONObject q;
        @Deprecated
        public JSONObject r;
        @Deprecated
        public JSONObject s;
        @Deprecated
        public JSONObject t;
        @Deprecated
        public JSONObject u;
        @Deprecated
        public JSONObject v;
        public JSONObject w;
        public C0296a x;
        public d y;
        public f z;

        /* renamed from: com.loc.cz$a$a  reason: collision with other inner class name */
        public static class C0296a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f25747a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f25748b;

            /* renamed from: c  reason: collision with root package name */
            public JSONObject f25749c;
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f25750a;

            /* renamed from: b  reason: collision with root package name */
            public String f25751b;

            /* renamed from: c  reason: collision with root package name */
            public String f25752c;

            /* renamed from: d  reason: collision with root package name */
            public String f25753d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f25754e;
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f25755a;

            /* renamed from: b  reason: collision with root package name */
            public String f25756b;
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f25757a;

            /* renamed from: b  reason: collision with root package name */
            public String f25758b;

            /* renamed from: c  reason: collision with root package name */
            public String f25759c;
        }

        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public boolean f25760a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f25761b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f25762c;

            /* renamed from: d  reason: collision with root package name */
            public String f25763d;

            /* renamed from: e  reason: collision with root package name */
            public String f25764e;

            /* renamed from: f  reason: collision with root package name */
            public String f25765f;
        }

        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public boolean f25766a;
        }
    }

    static class b extends ai {

        /* renamed from: f  reason: collision with root package name */
        public boolean f25767f;
        private String g;
        private Map<String, String> h;

        b(Context context, dh dhVar, String str) {
            super(context, dhVar);
            this.g = str;
            this.f25767f = Build.VERSION.SDK_INT != 19;
        }

        public final Map<String, String> a() {
            return null;
        }

        public final String c() {
            return this.f25767f ? "https://restapi.amap.com/v3/iasdkauth" : "http://restapi.amap.com/v3/iasdkauth";
        }

        /* access modifiers changed from: protected */
        public final String g() {
            return "3.0";
        }

        public final byte[] h() {
            return null;
        }

        public final byte[] i() {
            String u = dc.u(this.f25458a);
            if (TextUtils.isEmpty(u)) {
                u = dc.c();
            }
            if (!TextUtils.isEmpty(u)) {
                u = de.b(new StringBuilder(u).reverse().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", this.g);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.f25459b.a());
            hashMap.put("version", this.f25459b.f25797a);
            hashMap.put("output", "json");
            hashMap.put("androidversion", Build.VERSION.SDK_INT);
            hashMap.put("deviceId", u);
            hashMap.put("manufacture", Build.MANUFACTURER);
            if (this.h != null && !this.h.isEmpty()) {
                hashMap.putAll(this.h);
            }
            hashMap.put("abitype", di.a(this.f25458a));
            hashMap.put("ext", this.f25459b.c());
            return di.a(di.a((Map<String, String>) hashMap));
        }
    }

    private static String a(JSONObject jSONObject, String str) throws JSONException {
        if (jSONObject == null) {
            return "";
        }
        String str2 = "";
        if (jSONObject.has(str) && !jSONObject.getString(str).equals("[]")) {
            str2 = jSONObject.optString(str);
        }
        return str2;
    }

    public static void a(Context context, String str) {
        cy.a(context, str);
    }

    private static void a(a aVar, JSONObject jSONObject) {
        try {
            if (di.a(jSONObject, "11B")) {
                aVar.h = jSONObject.getJSONObject("11B");
            }
            if (di.a(jSONObject, "11C")) {
                aVar.k = jSONObject.getJSONObject("11C");
            }
            if (di.a(jSONObject, "11I")) {
                aVar.l = jSONObject.getJSONObject("11I");
            }
            if (di.a(jSONObject, "11H")) {
                aVar.m = jSONObject.getJSONObject("11H");
            }
            if (di.a(jSONObject, "11E")) {
                aVar.n = jSONObject.getJSONObject("11E");
            }
            if (di.a(jSONObject, "11F")) {
                aVar.o = jSONObject.getJSONObject("11F");
            }
            if (di.a(jSONObject, "13A")) {
                aVar.q = jSONObject.getJSONObject("13A");
            }
            if (di.a(jSONObject, "13J")) {
                aVar.i = jSONObject.getJSONObject("13J");
            }
            if (di.a(jSONObject, "11G")) {
                aVar.p = jSONObject.getJSONObject("11G");
            }
            if (di.a(jSONObject, "006")) {
                aVar.r = jSONObject.getJSONObject("006");
            }
            if (di.a(jSONObject, "010")) {
                aVar.s = jSONObject.getJSONObject("010");
            }
            if (di.a(jSONObject, "11Z")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("11Z");
                a.b bVar = new a.b();
                a(jSONObject2, bVar);
                aVar.C = bVar;
            }
            if (di.a(jSONObject, "135")) {
                aVar.j = jSONObject.getJSONObject("135");
            }
            if (di.a(jSONObject, "13S")) {
                aVar.g = jSONObject.getJSONObject("13S");
            }
            if (di.a(jSONObject, "121")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("121");
                a.b bVar2 = new a.b();
                a(jSONObject3, bVar2);
                aVar.D = bVar2;
            }
            if (di.a(jSONObject, "122")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("122");
                a.b bVar3 = new a.b();
                a(jSONObject4, bVar3);
                aVar.E = bVar3;
            }
            if (di.a(jSONObject, "123")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("123");
                a.b bVar4 = new a.b();
                a(jSONObject5, bVar4);
                aVar.F = bVar4;
            }
            if (di.a(jSONObject, "011")) {
                aVar.f25743c = jSONObject.getJSONObject("011");
            }
            if (di.a(jSONObject, "012")) {
                aVar.f25744d = jSONObject.getJSONObject("012");
            }
            if (di.a(jSONObject, "013")) {
                aVar.f25745e = jSONObject.getJSONObject("013");
            }
            if (di.a(jSONObject, "014")) {
                aVar.f25746f = jSONObject.getJSONObject("014");
            }
            if (di.a(jSONObject, "145")) {
                aVar.t = jSONObject.getJSONObject("145");
            }
            if (di.a(jSONObject, "14B")) {
                aVar.u = jSONObject.getJSONObject("14B");
            }
            if (di.a(jSONObject, "14D")) {
                aVar.v = jSONObject.getJSONObject("14D");
            }
        } catch (Throwable th) {
            i.b(th, "at", "pe");
        }
    }

    private static void a(JSONObject jSONObject, a.b bVar) {
        try {
            String a2 = a(jSONObject, "m");
            String a3 = a(jSONObject, "u");
            String a4 = a(jSONObject, NotifyType.VIBRATE);
            String a5 = a(jSONObject, "able");
            String a6 = a(jSONObject, "on");
            bVar.f25752c = a2;
            bVar.f25751b = a3;
            bVar.f25753d = a4;
            bVar.f25750a = a(a5, false);
            bVar.f25754e = a(a6, true);
        } catch (Throwable th) {
            f.a(th, "at", "pe");
        }
    }

    private static void a(JSONObject jSONObject, a.c cVar) {
        if (jSONObject != null) {
            try {
                String a2 = a(jSONObject, "md5");
                String a3 = a(jSONObject, PushConstants.WEB_URL);
                cVar.f25756b = a2;
                cVar.f25755a = a3;
            } catch (Throwable th) {
                f.a(th, "at", "psc");
            }
        }
    }

    public static boolean a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            String[] split = URLDecoder.decode(str).split("/");
            return split[split.length - 1].charAt(4) % 2 == 1;
        } catch (Throwable unused) {
            return z;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0094, code lost:
        r7 = null;
        r8 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x007f */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[ExcHandler: IllegalBlockSizeException (unused javax.crypto.IllegalBlockSizeException), SYNTHETIC, Splitter:B:1:0x0014] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.loc.cz.a a(android.content.Context r16, com.loc.dh r17, java.lang.String r18, boolean r19) {
        /*
            r1 = r16
            r2 = r17
            r3 = r18
            com.loc.cz$a r4 = new com.loc.cz$a
            r4.<init>()
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            r4.w = r0
            r5 = 0
            r6 = 0
            com.loc.ah r0 = new com.loc.ah     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
            r0.<init>()     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
            com.loc.cz$b r0 = new com.loc.cz$b     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            r7.<init>()     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            r7.append(r3)     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            java.lang.String r8 = ";14N"
            r7.append(r8)     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            java.lang.String r7 = r7.toString()     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            r0.<init>(r1, r2, r7)     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            boolean r7 = r0.f25767f     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            com.loc.am r7 = com.loc.ah.a(r0, r7)     // Catch:{ cx -> 0x0087, Throwable -> 0x007f, IllegalBlockSizeException -> 0x0094 }
            if (r7 == 0) goto L_0x0044
            byte[] r0 = r7.f25472a     // Catch:{ cx -> 0x0041, IllegalBlockSizeException -> 0x003e, Throwable -> 0x003b }
            r8 = r0
            goto L_0x0045
        L_0x003b:
            r0 = move-exception
            r8 = r5
            goto L_0x008c
        L_0x003e:
            r8 = r5
            goto L_0x00a5
        L_0x0041:
            r0 = move-exception
            r8 = r5
            goto L_0x009a
        L_0x0044:
            r8 = r5
        L_0x0045:
            r0 = 16
            byte[] r9 = new byte[r0]     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            int r10 = r8.length     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            int r10 = r10 - r0
            byte[] r10 = new byte[r10]     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            java.lang.System.arraycopy(r8, r6, r9, r6, r0)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            int r11 = r8.length     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            int r11 = r11 - r0
            java.lang.System.arraycopy(r8, r0, r10, r6, r11)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            javax.crypto.spec.SecretKeySpec r0 = new javax.crypto.spec.SecretKeySpec     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            java.lang.String r11 = "AES"
            r0.<init>(r9, r11)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            java.lang.String r9 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r9 = javax.crypto.Cipher.getInstance(r9)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            javax.crypto.spec.IvParameterSpec r11 = new javax.crypto.spec.IvParameterSpec     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            byte[] r12 = com.loc.di.b()     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            r11.<init>(r12)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            r12 = 2
            r9.init(r12, r0, r11)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            byte[] r0 = r9.doFinal(r10)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            java.lang.String r0 = com.loc.di.a((byte[]) r0)     // Catch:{ cx -> 0x007d, IllegalBlockSizeException -> 0x007b, Throwable -> 0x0079 }
            r5 = r0
            goto L_0x00a5
        L_0x0079:
            r0 = move-exception
            goto L_0x008c
        L_0x007b:
            goto L_0x00a5
        L_0x007d:
            r0 = move-exception
            goto L_0x009a
        L_0x007f:
            com.loc.cx r0 = new com.loc.cx     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
            java.lang.String r7 = "未知的错误"
            r0.<init>(r7)     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
            throw r0     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
        L_0x0087:
            r0 = move-exception
            throw r0     // Catch:{ cx -> 0x0097, IllegalBlockSizeException -> 0x0094, Throwable -> 0x0089 }
        L_0x0089:
            r0 = move-exception
            r7 = r5
            r8 = r7
        L_0x008c:
            java.lang.String r9 = "at"
            java.lang.String r10 = "lc"
            com.loc.i.b((java.lang.Throwable) r0, (java.lang.String) r9, (java.lang.String) r10)
            goto L_0x00a5
        L_0x0094:
            r7 = r5
            r8 = r7
            goto L_0x00a5
        L_0x0097:
            r0 = move-exception
            r7 = r5
            r8 = r7
        L_0x009a:
            java.lang.String r9 = r0.a()
            r4.f25741a = r9
            java.lang.String r9 = "/v3/iasdkauth"
            com.loc.i.a((com.loc.dh) r2, (java.lang.String) r9, (com.loc.cx) r0)
        L_0x00a5:
            if (r8 != 0) goto L_0x00a8
            return r4
        L_0x00a8:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L_0x00b2
            java.lang.String r5 = com.loc.di.a((byte[]) r8)
        L_0x00b2:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Throwable -> 0x03bb }
            r8.<init>(r5)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "status"
            boolean r0 = r8.has(r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x03c3
            java.lang.String r0 = "status"
            int r0 = r8.getInt(r0)     // Catch:{ Throwable -> 0x03bb }
            r5 = 1
            if (r0 != r5) goto L_0x00cc
            f25739a = r5     // Catch:{ Throwable -> 0x03bb }
            goto L_0x01d3
        L_0x00cc:
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = "authcsid"
            java.lang.String r5 = "authgsid"
            if (r7 == 0) goto L_0x00d8
            java.lang.String r0 = r7.f25474c     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r5 = r7.f25475d     // Catch:{ Throwable -> 0x03bb }
        L_0x00d8:
            java.lang.String r7 = ""
            java.lang.String r9 = com.loc.cy.e(r16)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r10 = com.loc.de.b(r9)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r13 = com.loc.cy.a((android.content.Context) r16)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r14 = ""
            java.lang.String r15 = "info"
            boolean r15 = r8.has(r15)     // Catch:{ Throwable -> 0x0157 }
            if (r15 == 0) goto L_0x0109
            java.lang.String r7 = "info"
            java.lang.String r7 = r8.getString(r7)     // Catch:{ Throwable -> 0x0157 }
            java.lang.StringBuilder r15 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0157 }
            java.lang.String r6 = "请在高德开放平台官网中搜索\""
            r15.<init>(r6)     // Catch:{ Throwable -> 0x0157 }
            r15.append(r7)     // Catch:{ Throwable -> 0x0157 }
            java.lang.String r6 = "\"相关内容进行解决"
            r15.append(r6)     // Catch:{ Throwable -> 0x0157 }
        L_0x0109:
            java.lang.String r6 = "INVALID_USER_SCODE"
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x0157 }
            if (r6 == 0) goto L_0x0138
            java.lang.String r6 = "sec_code"
            boolean r6 = r8.has(r6)     // Catch:{ Throwable -> 0x0157 }
            if (r6 == 0) goto L_0x011f
            java.lang.String r6 = "sec_code"
            java.lang.String r11 = r8.getString(r6)     // Catch:{ Throwable -> 0x0157 }
        L_0x011f:
            java.lang.String r6 = "sec_code_debug"
            boolean r6 = r8.has(r6)     // Catch:{ Throwable -> 0x0157 }
            if (r6 == 0) goto L_0x012d
            java.lang.String r6 = "sec_code_debug"
            java.lang.String r12 = r8.getString(r6)     // Catch:{ Throwable -> 0x0157 }
        L_0x012d:
            boolean r6 = r10.equals(r11)     // Catch:{ Throwable -> 0x0157 }
            if (r6 != 0) goto L_0x0157
            boolean r6 = r10.equals(r12)     // Catch:{ Throwable -> 0x0157 }
            goto L_0x0157
        L_0x0138:
            java.lang.String r6 = "INVALID_USER_KEY"
            boolean r6 = r6.equals(r7)     // Catch:{ Throwable -> 0x0157 }
            if (r6 == 0) goto L_0x0157
            java.lang.String r6 = "key"
            boolean r6 = r8.has(r6)     // Catch:{ Throwable -> 0x0157 }
            if (r6 == 0) goto L_0x014e
            java.lang.String r6 = "key"
            java.lang.String r14 = r8.getString(r6)     // Catch:{ Throwable -> 0x0157 }
        L_0x014e:
            int r6 = r14.length()     // Catch:{ Throwable -> 0x0157 }
            if (r6 <= 0) goto L_0x0157
            r13.equals(r14)     // Catch:{ Throwable -> 0x0157 }
        L_0x0157:
            java.lang.String r6 = "SHA1Package:"
            java.lang.String r7 = java.lang.String.valueOf(r9)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Throwable -> 0x03bb }
            com.loc.di.d((java.lang.String) r6)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = "key:"
            java.lang.String r7 = java.lang.String.valueOf(r13)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = r6.concat(r7)     // Catch:{ Throwable -> 0x03bb }
            com.loc.di.d((java.lang.String) r6)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = "csid:"
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = r6.concat(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.di.d((java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "gsid:"
            java.lang.String r6 = java.lang.String.valueOf(r5)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = r0.concat(r6)     // Catch:{ Throwable -> 0x03bb }
            com.loc.di.d((java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = "json:"
            r0.<init>(r6)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r6 = r8.toString()     // Catch:{ Throwable -> 0x03bb }
            r0.append(r6)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x03bb }
            com.loc.di.d((java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            r6 = 0
            f25739a = r6     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "info"
            boolean r0 = r8.has(r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x01b3
            java.lang.String r0 = "info"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Throwable -> 0x03bb }
            f25740b = r0     // Catch:{ Throwable -> 0x03bb }
        L_0x01b3:
            java.lang.String r0 = ""
            java.lang.String r6 = "infocode"
            boolean r6 = r8.has(r6)     // Catch:{ Throwable -> 0x03bb }
            if (r6 == 0) goto L_0x01c3
            java.lang.String r0 = "infocode"
            java.lang.String r0 = r8.getString(r0)     // Catch:{ Throwable -> 0x03bb }
        L_0x01c3:
            java.lang.String r6 = "/v3/iasdkauth"
            java.lang.String r7 = f25740b     // Catch:{ Throwable -> 0x03bb }
            com.loc.i.a(r2, r6, r7, r5, r0)     // Catch:{ Throwable -> 0x03bb }
            int r0 = f25739a     // Catch:{ Throwable -> 0x03bb }
            if (r0 != 0) goto L_0x01d3
            java.lang.String r0 = f25740b     // Catch:{ Throwable -> 0x03bb }
            r4.f25741a = r0     // Catch:{ Throwable -> 0x03bb }
            return r4
        L_0x01d3:
            java.lang.String r0 = "ver"
            boolean r0 = r8.has(r0)     // Catch:{ Throwable -> 0x01e4 }
            if (r0 == 0) goto L_0x01ec
            java.lang.String r0 = "ver"
            int r0 = r8.getInt(r0)     // Catch:{ Throwable -> 0x01e4 }
            r4.f25742b = r0     // Catch:{ Throwable -> 0x01e4 }
            goto L_0x01ec
        L_0x01e4:
            r0 = move-exception
            java.lang.String r2 = "at"
            java.lang.String r5 = "lc"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r5)     // Catch:{ Throwable -> 0x03bb }
        L_0x01ec:
            java.lang.String r0 = "result"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r8, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x03c3
            com.loc.cz$a$a r2 = new com.loc.cz$a$a     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            r5 = 0
            r2.f25747a = r5     // Catch:{ Throwable -> 0x03bb }
            r2.f25748b = r5     // Catch:{ Throwable -> 0x03bb }
            r4.x = r2     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "result"
            org.json.JSONObject r5 = r8.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = ";"
            java.lang.String[] r0 = r3.split(r0)     // Catch:{ Throwable -> 0x0229 }
            if (r0 == 0) goto L_0x0231
            int r3 = r0.length     // Catch:{ Throwable -> 0x0229 }
            if (r3 <= 0) goto L_0x0231
            int r3 = r0.length     // Catch:{ Throwable -> 0x0229 }
            r6 = 0
        L_0x0213:
            if (r6 >= r3) goto L_0x0231
            r7 = r0[r6]     // Catch:{ Throwable -> 0x0229 }
            boolean r8 = r5.has(r7)     // Catch:{ Throwable -> 0x0229 }
            if (r8 == 0) goto L_0x0226
            org.json.JSONObject r8 = r4.w     // Catch:{ Throwable -> 0x0229 }
            java.lang.Object r9 = r5.get(r7)     // Catch:{ Throwable -> 0x0229 }
            r8.putOpt(r7, r9)     // Catch:{ Throwable -> 0x0229 }
        L_0x0226:
            int r6 = r6 + 1
            goto L_0x0213
        L_0x0229:
            r0 = move-exception
            java.lang.String r3 = "at"
            java.lang.String r6 = "co"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x03bb }
        L_0x0231:
            java.lang.String r0 = "11K"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x0265
            java.lang.String r0 = "11K"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x025d }
            java.lang.String r3 = "able"
            java.lang.String r3 = r0.getString(r3)     // Catch:{ Throwable -> 0x025d }
            r6 = 0
            boolean r3 = a((java.lang.String) r3, (boolean) r6)     // Catch:{ Throwable -> 0x025d }
            r2.f25747a = r3     // Catch:{ Throwable -> 0x025d }
            java.lang.String r3 = "off"
            boolean r3 = r0.has(r3)     // Catch:{ Throwable -> 0x025d }
            if (r3 == 0) goto L_0x0265
            java.lang.String r3 = "off"
            org.json.JSONObject r0 = r0.getJSONObject(r3)     // Catch:{ Throwable -> 0x025d }
            r2.f25749c = r0     // Catch:{ Throwable -> 0x025d }
            goto L_0x0265
        L_0x025d:
            r0 = move-exception
            java.lang.String r2 = "AuthConfigManager"
            java.lang.String r3 = "loadException"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r2, (java.lang.String) r3)     // Catch:{ Throwable -> 0x03bb }
        L_0x0265:
            java.lang.String r0 = "001"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x02b0
            java.lang.String r0 = "001"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$d r2 = new com.loc.cz$a$d     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x02ae
            java.lang.String r3 = "md5"
            java.lang.String r3 = a((org.json.JSONObject) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x02a6 }
            java.lang.String r6 = "url"
            java.lang.String r6 = a((org.json.JSONObject) r0, (java.lang.String) r6)     // Catch:{ Throwable -> 0x02a6 }
            java.lang.String r7 = "sdkversion"
            java.lang.String r0 = a((org.json.JSONObject) r0, (java.lang.String) r7)     // Catch:{ Throwable -> 0x02a6 }
            boolean r7 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x02a6 }
            if (r7 != 0) goto L_0x02ae
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x02a6 }
            if (r7 != 0) goto L_0x02ae
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Throwable -> 0x02a6 }
            if (r7 == 0) goto L_0x029f
            goto L_0x02ae
        L_0x029f:
            r2.f25757a = r6     // Catch:{ Throwable -> 0x02a6 }
            r2.f25758b = r3     // Catch:{ Throwable -> 0x02a6 }
            r2.f25759c = r0     // Catch:{ Throwable -> 0x02a6 }
            goto L_0x02ae
        L_0x02a6:
            r0 = move-exception
            java.lang.String r3 = "at"
            java.lang.String r6 = "psu"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x03bb }
        L_0x02ae:
            r4.y = r2     // Catch:{ Throwable -> 0x03bb }
        L_0x02b0:
            java.lang.String r0 = "002"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x02c8
            java.lang.String r0 = "002"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$c r2 = new com.loc.cz$a$c     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            a((org.json.JSONObject) r0, (com.loc.cz.a.c) r2)     // Catch:{ Throwable -> 0x03bb }
            r4.A = r2     // Catch:{ Throwable -> 0x03bb }
        L_0x02c8:
            java.lang.String r0 = "14S"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x02e0
            java.lang.String r0 = "14S"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$c r2 = new com.loc.cz$a$c     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            a((org.json.JSONObject) r0, (com.loc.cz.a.c) r2)     // Catch:{ Throwable -> 0x03bb }
            r4.B = r2     // Catch:{ Throwable -> 0x03bb }
        L_0x02e0:
            a((com.loc.cz.a) r4, (org.json.JSONObject) r5)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "14Z"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x033e
            java.lang.String r0 = "14Z"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$e r2 = new com.loc.cz$a$e     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r3 = "md5"
            java.lang.String r3 = a((org.json.JSONObject) r0, (java.lang.String) r3)     // Catch:{ Throwable -> 0x0334 }
            java.lang.String r6 = "md5info"
            java.lang.String r6 = a((org.json.JSONObject) r0, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0334 }
            java.lang.String r7 = "url"
            java.lang.String r7 = a((org.json.JSONObject) r0, (java.lang.String) r7)     // Catch:{ Throwable -> 0x0334 }
            java.lang.String r8 = "able"
            java.lang.String r8 = a((org.json.JSONObject) r0, (java.lang.String) r8)     // Catch:{ Throwable -> 0x0334 }
            java.lang.String r9 = "on"
            java.lang.String r9 = a((org.json.JSONObject) r0, (java.lang.String) r9)     // Catch:{ Throwable -> 0x0334 }
            java.lang.String r10 = "mobileable"
            java.lang.String r0 = a((org.json.JSONObject) r0, (java.lang.String) r10)     // Catch:{ Throwable -> 0x0334 }
            r2.f25764e = r3     // Catch:{ Throwable -> 0x0334 }
            r2.f25765f = r6     // Catch:{ Throwable -> 0x0334 }
            r2.f25763d = r7     // Catch:{ Throwable -> 0x0334 }
            r3 = 0
            boolean r6 = a((java.lang.String) r8, (boolean) r3)     // Catch:{ Throwable -> 0x0334 }
            r2.f25760a = r6     // Catch:{ Throwable -> 0x0334 }
            boolean r6 = a((java.lang.String) r9, (boolean) r3)     // Catch:{ Throwable -> 0x0334 }
            r2.f25761b = r6     // Catch:{ Throwable -> 0x0334 }
            boolean r0 = a((java.lang.String) r0, (boolean) r3)     // Catch:{ Throwable -> 0x0334 }
            r2.f25762c = r0     // Catch:{ Throwable -> 0x0334 }
            goto L_0x033c
        L_0x0334:
            r0 = move-exception
            java.lang.String r3 = "at"
            java.lang.String r6 = "pes"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x03bb }
        L_0x033c:
            r4.G = r2     // Catch:{ Throwable -> 0x03bb }
        L_0x033e:
            java.lang.String r0 = "151"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x0362
            java.lang.String r0 = "151"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$f r2 = new com.loc.cz$a$f     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x0360
            java.lang.String r3 = "able"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ Throwable -> 0x03bb }
            r3 = 0
            boolean r0 = a((java.lang.String) r0, (boolean) r3)     // Catch:{ Throwable -> 0x03bb }
            r2.f25766a = r0     // Catch:{ Throwable -> 0x03bb }
        L_0x0360:
            r4.z = r2     // Catch:{ Throwable -> 0x03bb }
        L_0x0362:
            a((com.loc.cz.a) r4, (org.json.JSONObject) r5)     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r0 = "14N"
            boolean r0 = com.loc.di.a((org.json.JSONObject) r5, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x03c3
            java.lang.String r0 = "14N"
            org.json.JSONObject r0 = r5.getJSONObject(r0)     // Catch:{ Throwable -> 0x03bb }
            com.loc.cz$a$b r2 = new com.loc.cz$a$b     // Catch:{ Throwable -> 0x03bb }
            r2.<init>()     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r3 = "able"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ Throwable -> 0x03bb }
            r5 = 0
            boolean r3 = a((java.lang.String) r3, (boolean) r5)     // Catch:{ Throwable -> 0x03bb }
            r2.f25750a = r3     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r3 = "url"
            java.lang.String r3 = r0.optString(r3)     // Catch:{ Throwable -> 0x03bb }
            r2.f25751b = r3     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r3 = "md5"
            java.lang.String r0 = r0.optString(r3)     // Catch:{ Throwable -> 0x03bb }
            r2.f25752c = r0     // Catch:{ Throwable -> 0x03bb }
            boolean r0 = r2.f25750a     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x03b5
            com.loc.dh r0 = com.loc.d.a()     // Catch:{ Throwable -> 0x03bb }
            if (r0 == 0) goto L_0x03c3
            com.loc.s r3 = new com.loc.s     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r5 = r2.f25751b     // Catch:{ Throwable -> 0x03bb }
            java.lang.String r2 = r2.f25752c     // Catch:{ Throwable -> 0x03bb }
            r3.<init>(r5, r2)     // Catch:{ Throwable -> 0x03bb }
            r2 = r19
            r3.j = r2     // Catch:{ Throwable -> 0x03bb }
            com.loc.r r2 = new com.loc.r     // Catch:{ Throwable -> 0x03bb }
            r2.<init>(r1, r3, r0)     // Catch:{ Throwable -> 0x03bb }
            r2.a()     // Catch:{ Throwable -> 0x03bb }
            goto L_0x03c3
        L_0x03b5:
            java.lang.String r0 = "aiu"
            com.loc.t.a((android.content.Context) r1, (java.lang.String) r0)     // Catch:{ Throwable -> 0x03bb }
            goto L_0x03c3
        L_0x03bb:
            r0 = move-exception
            java.lang.String r1 = "at"
            java.lang.String r2 = "lc"
            com.loc.f.a((java.lang.Throwable) r0, (java.lang.String) r1, (java.lang.String) r2)
        L_0x03c3:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.cz.a(android.content.Context, com.loc.dh, java.lang.String, boolean):com.loc.cz$a");
    }
}
