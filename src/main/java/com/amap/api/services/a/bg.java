package com.amap.api.services.a;

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

public class bg {

    /* renamed from: a  reason: collision with root package name */
    public static int f6593a = -1;

    /* renamed from: b  reason: collision with root package name */
    public static String f6594b = "";

    public static class a {
        @Deprecated
        public c A;
        public c B;
        public b C;
        public b D;
        public b E;
        public b F;
        public f G;

        /* renamed from: a  reason: collision with root package name */
        public String f6595a;

        /* renamed from: b  reason: collision with root package name */
        public int f6596b = -1;
        @Deprecated

        /* renamed from: c  reason: collision with root package name */
        public JSONObject f6597c;
        @Deprecated

        /* renamed from: d  reason: collision with root package name */
        public JSONObject f6598d;
        @Deprecated

        /* renamed from: e  reason: collision with root package name */
        public JSONObject f6599e;
        @Deprecated

        /* renamed from: f  reason: collision with root package name */
        public JSONObject f6600f;
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
        public C0046a x;
        public d y;
        public e z;

        /* renamed from: com.amap.api.services.a.bg$a$a  reason: collision with other inner class name */
        public static class C0046a {

            /* renamed from: a  reason: collision with root package name */
            public boolean f6601a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f6602b;

            /* renamed from: c  reason: collision with root package name */
            public JSONObject f6603c;
        }

        public static class b {

            /* renamed from: a  reason: collision with root package name */
            public boolean f6604a;

            /* renamed from: b  reason: collision with root package name */
            public String f6605b;

            /* renamed from: c  reason: collision with root package name */
            public String f6606c;

            /* renamed from: d  reason: collision with root package name */
            public String f6607d;

            /* renamed from: e  reason: collision with root package name */
            public boolean f6608e;
        }

        public static class c {

            /* renamed from: a  reason: collision with root package name */
            public String f6609a;

            /* renamed from: b  reason: collision with root package name */
            public String f6610b;
        }

        public static class d {

            /* renamed from: a  reason: collision with root package name */
            public String f6611a;

            /* renamed from: b  reason: collision with root package name */
            public String f6612b;

            /* renamed from: c  reason: collision with root package name */
            public String f6613c;
        }

        public static class e {

            /* renamed from: a  reason: collision with root package name */
            public boolean f6614a;
        }

        public static class f {

            /* renamed from: a  reason: collision with root package name */
            public boolean f6615a;

            /* renamed from: b  reason: collision with root package name */
            public boolean f6616b;

            /* renamed from: c  reason: collision with root package name */
            public boolean f6617c;

            /* renamed from: d  reason: collision with root package name */
            public String f6618d;

            /* renamed from: e  reason: collision with root package name */
            public String f6619e;

            /* renamed from: f  reason: collision with root package name */
            public String f6620f;
        }
    }

    static class b extends dc {

        /* renamed from: c  reason: collision with root package name */
        private String f6621c;

        /* renamed from: d  reason: collision with root package name */
        private Map<String, String> f6622d;

        /* renamed from: e  reason: collision with root package name */
        private boolean f6623e;

        public byte[] b() {
            return null;
        }

        public Map<String, String> e() {
            return null;
        }

        /* access modifiers changed from: protected */
        public String f() {
            return "3.0";
        }

        public boolean a() {
            return this.f6623e;
        }

        public byte[] c() {
            return bo.a(bo.a(o()));
        }

        public String i() {
            if (this.f6623e) {
                return "https://restapi.amap.com/v3/iasdkauth";
            }
            return "http://restapi.amap.com/v3/iasdkauth";
        }

        private Map<String, String> o() {
            String t = bj.t(this.f6799a);
            if (TextUtils.isEmpty(t)) {
                t = bj.c();
            }
            if (!TextUtils.isEmpty(t)) {
                t = bl.b(new StringBuilder(t).reverse().toString());
            }
            HashMap hashMap = new HashMap();
            hashMap.put("authkey", this.f6621c);
            hashMap.put("plattype", "android");
            hashMap.put("product", this.f6800b.a());
            hashMap.put("version", this.f6800b.b());
            hashMap.put("output", "json");
            hashMap.put("androidversion", Build.VERSION.SDK_INT);
            hashMap.put("deviceId", t);
            hashMap.put("manufacture", Build.MANUFACTURER);
            if (this.f6622d != null && !this.f6622d.isEmpty()) {
                hashMap.putAll(this.f6622d);
            }
            hashMap.put("abitype", bo.a(this.f6799a));
            hashMap.put("ext", this.f6800b.d());
            return hashMap;
        }

        b(Context context, bn bnVar, String str, Map<String, String> map) {
            super(context, bnVar);
            boolean z;
            this.f6621c = str;
            this.f6622d = map;
            if (Build.VERSION.SDK_INT != 19) {
                z = true;
            } else {
                z = false;
            }
            this.f6623e = z;
        }
    }

    public static boolean a(String str, boolean z) {
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            String[] split = URLDecoder.decode(str).split("/");
            if (split[split.length - 1].charAt(4) % 2 == 1) {
                return true;
            }
            return false;
        } catch (Throwable unused) {
            return z;
        }
    }

    private static void a(JSONObject jSONObject, a.f fVar) {
        if (fVar != null) {
            try {
                String a2 = a(jSONObject, "md5");
                String a3 = a(jSONObject, "md5info");
                String a4 = a(jSONObject, PushConstants.WEB_URL);
                String a5 = a(jSONObject, "able");
                String a6 = a(jSONObject, "on");
                String a7 = a(jSONObject, "mobileable");
                fVar.f6619e = a2;
                fVar.f6620f = a3;
                fVar.f6618d = a4;
                fVar.f6615a = a(a5, false);
                fVar.f6616b = a(a6, false);
                fVar.f6617c = a(a7, false);
            } catch (Throwable th) {
                bx.a(th, "at", "pes");
            }
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
                String a6 = a(jSONObject, "on");
                bVar.f6606c = a2;
                bVar.f6605b = a3;
                bVar.f6607d = a4;
                bVar.f6604a = a(a5, false);
                bVar.f6608e = a(a6, true);
            } catch (Throwable th) {
                bx.a(th, "at", "pe");
            }
        }
    }

    private static void a(JSONObject jSONObject, a.c cVar) {
        if (jSONObject != null) {
            try {
                String a2 = a(jSONObject, "md5");
                String a3 = a(jSONObject, PushConstants.WEB_URL);
                cVar.f6610b = a2;
                cVar.f6609a = a3;
            } catch (Throwable th) {
                bx.a(th, "at", "psc");
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
                        dVar.f6611a = a3;
                        dVar.f6612b = a2;
                        dVar.f6613c = a4;
                    }
                }
            } catch (Throwable th) {
                bx.a(th, "at", "psu");
            }
        }
    }

    private static void a(a aVar, JSONObject jSONObject) {
        try {
            if (bo.a(jSONObject, "11B")) {
                aVar.h = jSONObject.getJSONObject("11B");
            }
            if (bo.a(jSONObject, "11C")) {
                aVar.k = jSONObject.getJSONObject("11C");
            }
            if (bo.a(jSONObject, "11I")) {
                aVar.l = jSONObject.getJSONObject("11I");
            }
            if (bo.a(jSONObject, "11H")) {
                aVar.m = jSONObject.getJSONObject("11H");
            }
            if (bo.a(jSONObject, "11E")) {
                aVar.n = jSONObject.getJSONObject("11E");
            }
            if (bo.a(jSONObject, "11F")) {
                aVar.o = jSONObject.getJSONObject("11F");
            }
            if (bo.a(jSONObject, "13A")) {
                aVar.q = jSONObject.getJSONObject("13A");
            }
            if (bo.a(jSONObject, "13J")) {
                aVar.i = jSONObject.getJSONObject("13J");
            }
            if (bo.a(jSONObject, "11G")) {
                aVar.p = jSONObject.getJSONObject("11G");
            }
            if (bo.a(jSONObject, "006")) {
                aVar.r = jSONObject.getJSONObject("006");
            }
            if (bo.a(jSONObject, "010")) {
                aVar.s = jSONObject.getJSONObject("010");
            }
            if (bo.a(jSONObject, "11Z")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("11Z");
                a.b bVar = new a.b();
                a(jSONObject2, bVar);
                aVar.C = bVar;
            }
            if (bo.a(jSONObject, "135")) {
                aVar.j = jSONObject.getJSONObject("135");
            }
            if (bo.a(jSONObject, "13S")) {
                aVar.g = jSONObject.getJSONObject("13S");
            }
            if (bo.a(jSONObject, "121")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("121");
                a.b bVar2 = new a.b();
                a(jSONObject3, bVar2);
                aVar.D = bVar2;
            }
            if (bo.a(jSONObject, "122")) {
                JSONObject jSONObject4 = jSONObject.getJSONObject("122");
                a.b bVar3 = new a.b();
                a(jSONObject4, bVar3);
                aVar.E = bVar3;
            }
            if (bo.a(jSONObject, "123")) {
                JSONObject jSONObject5 = jSONObject.getJSONObject("123");
                a.b bVar4 = new a.b();
                a(jSONObject5, bVar4);
                aVar.F = bVar4;
            }
            if (bo.a(jSONObject, "011")) {
                aVar.f6597c = jSONObject.getJSONObject("011");
            }
            if (bo.a(jSONObject, "012")) {
                aVar.f6598d = jSONObject.getJSONObject("012");
            }
            if (bo.a(jSONObject, "013")) {
                aVar.f6599e = jSONObject.getJSONObject("013");
            }
            if (bo.a(jSONObject, "014")) {
                aVar.f6600f = jSONObject.getJSONObject("014");
            }
            if (bo.a(jSONObject, "145")) {
                aVar.t = jSONObject.getJSONObject("145");
            }
            if (bo.a(jSONObject, "14B")) {
                aVar.u = jSONObject.getJSONObject("14B");
            }
            if (bo.a(jSONObject, "14D")) {
                aVar.v = jSONObject.getJSONObject("14D");
            }
        } catch (Throwable th) {
            ca.c(th, "at", "pe");
        }
    }

    private static void a(JSONObject jSONObject, a.e eVar) {
        if (eVar != null && jSONObject != null) {
            eVar.f6614a = a(jSONObject.optString("able"), false);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0092, code lost:
        r12 = null;
        r3 = null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:22:0x007c */
    /* JADX WARNING: Removed duplicated region for block: B:31:? A[ExcHandler: IllegalBlockSizeException (unused javax.crypto.IllegalBlockSizeException), SYNTHETIC, Splitter:B:1:0x000e] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.amap.api.services.a.bg.a a(android.content.Context r9, com.amap.api.services.a.bn r10, java.lang.String r11, java.util.Map<java.lang.String, java.lang.String> r12) {
        /*
            com.amap.api.services.a.bg$a r0 = new com.amap.api.services.a.bg$a
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            r0.w = r1
            r1 = 0
            r2 = 0
            com.amap.api.services.a.db r3 = new com.amap.api.services.a.db     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
            r3.<init>()     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
            com.amap.api.services.a.bg$b r4 = new com.amap.api.services.a.bg$b     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            r5.<init>()     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            r5.append(r11)     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            java.lang.String r6 = ";14N"
            r5.append(r6)     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            java.lang.String r5 = r5.toString()     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            r4.<init>(r9, r10, r5, r12)     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            boolean r12 = r4.a()     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            com.amap.api.services.a.di r12 = r3.a(r4, r12)     // Catch:{ be -> 0x0084, Throwable -> 0x007c, IllegalBlockSizeException -> 0x0092 }
            if (r12 == 0) goto L_0x0041
            byte[] r3 = r12.f6817a     // Catch:{ be -> 0x003d, IllegalBlockSizeException -> 0x003a, Throwable -> 0x0036 }
            goto L_0x0042
        L_0x0036:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L_0x008a
        L_0x003a:
            r3 = r1
            goto L_0x00a4
        L_0x003d:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L_0x0099
        L_0x0041:
            r3 = r1
        L_0x0042:
            r4 = 16
            byte[] r5 = new byte[r4]     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            int r6 = r3.length     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            int r6 = r6 - r4
            byte[] r6 = new byte[r6]     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            java.lang.System.arraycopy(r3, r2, r5, r2, r4)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            int r7 = r3.length     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            int r7 = r7 - r4
            java.lang.System.arraycopy(r3, r4, r6, r2, r7)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            java.lang.String r7 = "AES"
            r4.<init>(r5, r7)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            java.lang.String r5 = "AES/CBC/PKCS5Padding"
            javax.crypto.Cipher r5 = javax.crypto.Cipher.getInstance(r5)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            javax.crypto.spec.IvParameterSpec r7 = new javax.crypto.spec.IvParameterSpec     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            byte[] r8 = com.amap.api.services.a.bo.b()     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            r7.<init>(r8)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            r8 = 2
            r5.init(r8, r4, r7)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            byte[] r4 = r5.doFinal(r6)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            java.lang.String r4 = com.amap.api.services.a.bo.a((byte[]) r4)     // Catch:{ be -> 0x007a, IllegalBlockSizeException -> 0x0078, Throwable -> 0x0076 }
            r1 = r4
            goto L_0x00a4
        L_0x0076:
            r4 = move-exception
            goto L_0x008a
        L_0x0078:
            goto L_0x00a4
        L_0x007a:
            r4 = move-exception
            goto L_0x0099
        L_0x007c:
            com.amap.api.services.a.be r12 = new com.amap.api.services.a.be     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
            java.lang.String r3 = "未知的错误"
            r12.<init>(r3)     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
            throw r12     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
        L_0x0084:
            r12 = move-exception
            throw r12     // Catch:{ be -> 0x0095, IllegalBlockSizeException -> 0x0092, Throwable -> 0x0086 }
        L_0x0086:
            r3 = move-exception
            r12 = r1
            r4 = r3
            r3 = r12
        L_0x008a:
            java.lang.String r5 = "at"
            java.lang.String r6 = "lc"
            com.amap.api.services.a.ca.c(r4, r5, r6)
            goto L_0x00a4
        L_0x0092:
            r12 = r1
            r3 = r12
            goto L_0x00a4
        L_0x0095:
            r3 = move-exception
            r12 = r1
            r4 = r3
            r3 = r12
        L_0x0099:
            java.lang.String r5 = r4.a()
            r0.f6595a = r5
            java.lang.String r5 = "/v3/iasdkauth"
            com.amap.api.services.a.ca.a((com.amap.api.services.a.bn) r10, (java.lang.String) r5, (com.amap.api.services.a.be) r4)
        L_0x00a4:
            if (r3 != 0) goto L_0x00a7
            return r0
        L_0x00a7:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 == 0) goto L_0x00b1
            java.lang.String r1 = com.amap.api.services.a.bo.a((byte[]) r3)
        L_0x00b1:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Throwable -> 0x026c }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x026c }
            java.lang.String r1 = "status"
            boolean r1 = r3.has(r1)     // Catch:{ Throwable -> 0x026c }
            if (r1 == 0) goto L_0x0274
            java.lang.String r1 = "status"
            int r1 = r3.getInt(r1)     // Catch:{ Throwable -> 0x026c }
            r4 = 1
            if (r1 != r4) goto L_0x00ca
            f6593a = r4     // Catch:{ Throwable -> 0x026c }
            goto L_0x010b
        L_0x00ca:
            if (r1 != 0) goto L_0x010b
            java.lang.String r1 = "authcsid"
            java.lang.String r4 = "authgsid"
            if (r12 == 0) goto L_0x00d6
            java.lang.String r1 = r12.f6819c     // Catch:{ Throwable -> 0x026c }
            java.lang.String r4 = r12.f6820d     // Catch:{ Throwable -> 0x026c }
        L_0x00d6:
            com.amap.api.services.a.bo.a(r9, r1, r4, r3)     // Catch:{ Throwable -> 0x026c }
            f6593a = r2     // Catch:{ Throwable -> 0x026c }
            java.lang.String r12 = "info"
            boolean r12 = r3.has(r12)     // Catch:{ Throwable -> 0x026c }
            if (r12 == 0) goto L_0x00eb
            java.lang.String r12 = "info"
            java.lang.String r12 = r3.getString(r12)     // Catch:{ Throwable -> 0x026c }
            f6594b = r12     // Catch:{ Throwable -> 0x026c }
        L_0x00eb:
            java.lang.String r12 = ""
            java.lang.String r1 = "infocode"
            boolean r1 = r3.has(r1)     // Catch:{ Throwable -> 0x026c }
            if (r1 == 0) goto L_0x00fb
            java.lang.String r12 = "infocode"
            java.lang.String r12 = r3.getString(r12)     // Catch:{ Throwable -> 0x026c }
        L_0x00fb:
            java.lang.String r1 = "/v3/iasdkauth"
            java.lang.String r5 = f6594b     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.ca.a(r10, r1, r5, r4, r12)     // Catch:{ Throwable -> 0x026c }
            int r10 = f6593a     // Catch:{ Throwable -> 0x026c }
            if (r10 != 0) goto L_0x010b
            java.lang.String r9 = f6594b     // Catch:{ Throwable -> 0x026c }
            r0.f6595a = r9     // Catch:{ Throwable -> 0x026c }
            return r0
        L_0x010b:
            java.lang.String r10 = "ver"
            boolean r10 = r3.has(r10)     // Catch:{ Throwable -> 0x011c }
            if (r10 == 0) goto L_0x0124
            java.lang.String r10 = "ver"
            int r10 = r3.getInt(r10)     // Catch:{ Throwable -> 0x011c }
            r0.f6596b = r10     // Catch:{ Throwable -> 0x011c }
            goto L_0x0124
        L_0x011c:
            r10 = move-exception
            java.lang.String r12 = "at"
            java.lang.String r1 = "lc"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r10, (java.lang.String) r12, (java.lang.String) r1)     // Catch:{ Throwable -> 0x026c }
        L_0x0124:
            java.lang.String r10 = "result"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r3, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x0274
            com.amap.api.services.a.bg$a$a r10 = new com.amap.api.services.a.bg$a$a     // Catch:{ Throwable -> 0x026c }
            r10.<init>()     // Catch:{ Throwable -> 0x026c }
            r10.f6601a = r2     // Catch:{ Throwable -> 0x026c }
            r10.f6602b = r2     // Catch:{ Throwable -> 0x026c }
            r0.x = r10     // Catch:{ Throwable -> 0x026c }
            java.lang.String r12 = "result"
            org.json.JSONObject r12 = r3.getJSONObject(r12)     // Catch:{ Throwable -> 0x026c }
            java.lang.String r1 = ";"
            java.lang.String[] r11 = r11.split(r1)     // Catch:{ Throwable -> 0x0160 }
            if (r11 == 0) goto L_0x0168
            int r1 = r11.length     // Catch:{ Throwable -> 0x0160 }
            if (r1 <= 0) goto L_0x0168
            int r1 = r11.length     // Catch:{ Throwable -> 0x0160 }
            r3 = 0
        L_0x014a:
            if (r3 >= r1) goto L_0x0168
            r4 = r11[r3]     // Catch:{ Throwable -> 0x0160 }
            boolean r5 = r12.has(r4)     // Catch:{ Throwable -> 0x0160 }
            if (r5 == 0) goto L_0x015d
            org.json.JSONObject r5 = r0.w     // Catch:{ Throwable -> 0x0160 }
            java.lang.Object r6 = r12.get(r4)     // Catch:{ Throwable -> 0x0160 }
            r5.putOpt(r4, r6)     // Catch:{ Throwable -> 0x0160 }
        L_0x015d:
            int r3 = r3 + 1
            goto L_0x014a
        L_0x0160:
            r11 = move-exception
            java.lang.String r1 = "at"
            java.lang.String r3 = "co"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r11, (java.lang.String) r1, (java.lang.String) r3)     // Catch:{ Throwable -> 0x026c }
        L_0x0168:
            java.lang.String r11 = "11K"
            boolean r11 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r11)     // Catch:{ Throwable -> 0x026c }
            if (r11 == 0) goto L_0x019b
            java.lang.String r11 = "11K"
            org.json.JSONObject r11 = r12.getJSONObject(r11)     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r1 = "able"
            java.lang.String r1 = r11.getString(r1)     // Catch:{ Throwable -> 0x0193 }
            boolean r1 = a((java.lang.String) r1, (boolean) r2)     // Catch:{ Throwable -> 0x0193 }
            r10.f6601a = r1     // Catch:{ Throwable -> 0x0193 }
            java.lang.String r1 = "off"
            boolean r1 = r11.has(r1)     // Catch:{ Throwable -> 0x0193 }
            if (r1 == 0) goto L_0x019b
            java.lang.String r1 = "off"
            org.json.JSONObject r11 = r11.getJSONObject(r1)     // Catch:{ Throwable -> 0x0193 }
            r10.f6603c = r11     // Catch:{ Throwable -> 0x0193 }
            goto L_0x019b
        L_0x0193:
            r10 = move-exception
            java.lang.String r11 = "AuthConfigManager"
            java.lang.String r1 = "loadException"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r10, (java.lang.String) r11, (java.lang.String) r1)     // Catch:{ Throwable -> 0x026c }
        L_0x019b:
            java.lang.String r10 = "001"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x01b3
            java.lang.String r10 = "001"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$d r11 = new com.amap.api.services.a.bg$a$d     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            a((org.json.JSONObject) r10, (com.amap.api.services.a.bg.a.d) r11)     // Catch:{ Throwable -> 0x026c }
            r0.y = r11     // Catch:{ Throwable -> 0x026c }
        L_0x01b3:
            java.lang.String r10 = "002"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x01cb
            java.lang.String r10 = "002"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$c r11 = new com.amap.api.services.a.bg$a$c     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            a((org.json.JSONObject) r10, (com.amap.api.services.a.bg.a.c) r11)     // Catch:{ Throwable -> 0x026c }
            r0.A = r11     // Catch:{ Throwable -> 0x026c }
        L_0x01cb:
            java.lang.String r10 = "14S"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x01e3
            java.lang.String r10 = "14S"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$c r11 = new com.amap.api.services.a.bg$a$c     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            a((org.json.JSONObject) r10, (com.amap.api.services.a.bg.a.c) r11)     // Catch:{ Throwable -> 0x026c }
            r0.B = r11     // Catch:{ Throwable -> 0x026c }
        L_0x01e3:
            a((com.amap.api.services.a.bg.a) r0, (org.json.JSONObject) r12)     // Catch:{ Throwable -> 0x026c }
            java.lang.String r10 = "14Z"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x01fe
            java.lang.String r10 = "14Z"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$f r11 = new com.amap.api.services.a.bg$a$f     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            a((org.json.JSONObject) r10, (com.amap.api.services.a.bg.a.f) r11)     // Catch:{ Throwable -> 0x026c }
            r0.G = r11     // Catch:{ Throwable -> 0x026c }
        L_0x01fe:
            java.lang.String r10 = "151"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x0216
            java.lang.String r10 = "151"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$e r11 = new com.amap.api.services.a.bg$a$e     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            a((org.json.JSONObject) r10, (com.amap.api.services.a.bg.a.e) r11)     // Catch:{ Throwable -> 0x026c }
            r0.z = r11     // Catch:{ Throwable -> 0x026c }
        L_0x0216:
            a((com.amap.api.services.a.bg.a) r0, (org.json.JSONObject) r12)     // Catch:{ Throwable -> 0x026c }
            java.lang.String r10 = "14N"
            boolean r10 = com.amap.api.services.a.bo.a((org.json.JSONObject) r12, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x0274
            java.lang.String r10 = "14N"
            org.json.JSONObject r10 = r12.getJSONObject(r10)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.bg$a$b r11 = new com.amap.api.services.a.bg$a$b     // Catch:{ Throwable -> 0x026c }
            r11.<init>()     // Catch:{ Throwable -> 0x026c }
            java.lang.String r12 = "able"
            java.lang.String r12 = r10.optString(r12)     // Catch:{ Throwable -> 0x026c }
            boolean r12 = a((java.lang.String) r12, (boolean) r2)     // Catch:{ Throwable -> 0x026c }
            r11.f6604a = r12     // Catch:{ Throwable -> 0x026c }
            java.lang.String r12 = "url"
            java.lang.String r12 = r10.optString(r12)     // Catch:{ Throwable -> 0x026c }
            r11.f6605b = r12     // Catch:{ Throwable -> 0x026c }
            java.lang.String r12 = "md5"
            java.lang.String r10 = r10.optString(r12)     // Catch:{ Throwable -> 0x026c }
            r11.f6606c = r10     // Catch:{ Throwable -> 0x026c }
            boolean r10 = r11.f6604a     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x0266
            com.amap.api.services.a.bn r10 = com.amap.api.services.a.bv.a()     // Catch:{ Throwable -> 0x026c }
            if (r10 == 0) goto L_0x0274
            com.amap.api.services.a.cl r12 = new com.amap.api.services.a.cl     // Catch:{ Throwable -> 0x026c }
            java.lang.String r1 = r11.f6605b     // Catch:{ Throwable -> 0x026c }
            java.lang.String r11 = r11.f6606c     // Catch:{ Throwable -> 0x026c }
            java.lang.String r2 = ""
            r12.<init>(r1, r11, r2)     // Catch:{ Throwable -> 0x026c }
            com.amap.api.services.a.ck r11 = new com.amap.api.services.a.ck     // Catch:{ Throwable -> 0x026c }
            r11.<init>(r9, r12, r10)     // Catch:{ Throwable -> 0x026c }
            r11.a()     // Catch:{ Throwable -> 0x026c }
            goto L_0x0274
        L_0x0266:
            java.lang.String r10 = "aiu"
            com.amap.api.services.a.cm.a((android.content.Context) r9, (java.lang.String) r10)     // Catch:{ Throwable -> 0x026c }
            goto L_0x0274
        L_0x026c:
            r9 = move-exception
            java.lang.String r10 = "at"
            java.lang.String r11 = "lc"
            com.amap.api.services.a.bx.a((java.lang.Throwable) r9, (java.lang.String) r10, (java.lang.String) r11)
        L_0x0274:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.bg.a(android.content.Context, com.amap.api.services.a.bn, java.lang.String, java.util.Map):com.amap.api.services.a.bg$a");
    }
}
