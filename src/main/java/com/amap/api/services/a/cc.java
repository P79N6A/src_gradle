package com.amap.api.services.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.q.c;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class cc {

    /* renamed from: a  reason: collision with root package name */
    public static byte[] f6694a = "FDF1F436161AEF5B".getBytes();

    /* renamed from: b  reason: collision with root package name */
    public static byte[] f6695b = "0102030405060708".getBytes();

    /* renamed from: c  reason: collision with root package name */
    public static String f6696c = "SOCRASH";

    /* renamed from: d  reason: collision with root package name */
    private static HashSet<String> f6697d = new HashSet<>();

    /* renamed from: f  reason: collision with root package name */
    private static final String f6698f = "SOCRASH";

    /* renamed from: e  reason: collision with root package name */
    private File[] f6699e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f6700a;

        /* renamed from: b  reason: collision with root package name */
        private String f6701b;

        /* renamed from: c  reason: collision with root package name */
        private String f6702c;

        /* renamed from: d  reason: collision with root package name */
        private String f6703d;

        /* renamed from: e  reason: collision with root package name */
        private String f6704e;

        public a() {
        }

        public String a() {
            return this.f6700a;
        }

        public String b() {
            return this.f6701b;
        }

        public String c() {
            return this.f6702c;
        }

        public String d() {
            return this.f6703d;
        }

        public String e() {
            return this.f6704e;
        }

        public static List<a> b(String str) {
            if (TextUtils.isEmpty(str)) {
                return new ArrayList();
            }
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(str);
                for (int i = 0; i < jSONArray.length(); i++) {
                    arrayList.add(a(jSONArray.getString(i)));
                }
            } catch (Throwable unused) {
            }
            return arrayList;
        }

        public static a a(String str) {
            if (TextUtils.isEmpty(str)) {
                return new a();
            }
            try {
                JSONObject jSONObject = new JSONObject(str);
                a aVar = new a(jSONObject.optString("mk", ""), jSONObject.optString("ak", ""), jSONObject.optString("bk", ""), jSONObject.optString("ik", ""), jSONObject.optString("nk", ""));
                return aVar;
            } catch (Throwable unused) {
                return new a();
            }
        }

        public a(String str, String str2, String str3, String str4, String str5) {
            this.f6700a = str;
            this.f6701b = str2;
            this.f6702c = str3;
            this.f6703d = str4;
            this.f6704e = str5;
        }
    }

    static class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public int f6705a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f6706b;
    }

    private static String a() {
        return bl.b("SO_DYNAMIC_FILE_KEY");
    }

    private void a(File file) {
        if (file != null) {
            try {
                file.delete();
            } catch (Exception unused) {
            }
        }
    }

    private File[] b(Context context) {
        File file = new File(by.a(context));
        if (!file.isDirectory()) {
            return null;
        }
        return file.listFiles();
    }

    private byte[] b(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[fileInputStream.available()];
            fileInputStream.read(bArr);
            fileInputStream.close();
            byte[] a2 = bk.a("a1f5886b7153004c5c99559f5261676f".getBytes(), bArr, "nFy1THrhajaZzz8U".getBytes());
            byte[] bArr2 = new byte[16];
            byte[] bArr3 = new byte[(a2.length - 16)];
            System.arraycopy(a2, 0, bArr2, 0, 16);
            System.arraycopy(a2, 16, bArr3, 0, a2.length - 16);
            if (!a(bl.a(bArr3, "MD5"), bArr2)) {
                return new byte[0];
            }
            return bArr3;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0021 */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004c A[Catch:{ Throwable -> 0x0080 }] */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x004d A[Catch:{ Throwable -> 0x0080 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.content.Context r9) {
        /*
            r8 = this;
            java.io.File[] r0 = r8.b((android.content.Context) r9)     // Catch:{ Throwable -> 0x0080 }
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            r8.f6699e = r0     // Catch:{ Throwable -> 0x0080 }
            r1 = 0
            r2 = 0
            com.amap.api.services.a.bn$a r3 = new com.amap.api.services.a.bn$a     // Catch:{ Throwable -> 0x0021 }
            java.lang.String r4 = f6698f     // Catch:{ Throwable -> 0x0021 }
            java.lang.String r5 = "1.0"
            java.lang.String r6 = ""
            r3.<init>(r4, r5, r6)     // Catch:{ Throwable -> 0x0021 }
            java.lang.String[] r4 = new java.lang.String[r2]     // Catch:{ Throwable -> 0x0021 }
            com.amap.api.services.a.bn$a r3 = r3.a((java.lang.String[]) r4)     // Catch:{ Throwable -> 0x0021 }
            com.amap.api.services.a.bn r3 = r3.a()     // Catch:{ Throwable -> 0x0021 }
            r1 = r3
        L_0x0021:
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0080 }
            r3.<init>()     // Catch:{ Throwable -> 0x0080 }
        L_0x0026:
            int r4 = r0.length     // Catch:{ Throwable -> 0x0080 }
            if (r2 >= r4) goto L_0x007f
            r4 = 10
            if (r2 >= r4) goto L_0x007f
            r4 = r0[r2]     // Catch:{ Throwable -> 0x0080 }
            if (r4 == 0) goto L_0x007c
            boolean r5 = r4.exists()     // Catch:{ Throwable -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            boolean r5 = r4.isFile()     // Catch:{ Throwable -> 0x0080 }
            if (r5 == 0) goto L_0x007c
            byte[] r5 = r8.b((java.io.File) r4)     // Catch:{ Throwable -> 0x0080 }
            if (r5 == 0) goto L_0x0079
            int r6 = r5.length     // Catch:{ Throwable -> 0x0080 }
            if (r6 == 0) goto L_0x0079
            int r6 = r5.length     // Catch:{ Throwable -> 0x0080 }
            r7 = 100000(0x186a0, float:1.4013E-40)
            if (r6 <= r7) goto L_0x004d
            goto L_0x0079
        L_0x004d:
            java.lang.String r6 = com.amap.api.services.a.bl.a((byte[]) r5)     // Catch:{ Throwable -> 0x0080 }
            boolean r7 = r8.a((java.util.List<com.amap.api.services.a.cc.b>) r3, (java.lang.String) r6)     // Catch:{ Throwable -> 0x0080 }
            if (r7 != 0) goto L_0x0075
            java.util.HashSet<java.lang.String> r7 = f6697d     // Catch:{ Throwable -> 0x0080 }
            boolean r7 = r7.contains(r6)     // Catch:{ Throwable -> 0x0080 }
            if (r7 == 0) goto L_0x0060
            goto L_0x0075
        L_0x0060:
            r8.a((android.content.Context) r9, (byte[]) r5)     // Catch:{ Throwable -> 0x0080 }
            java.util.HashSet<java.lang.String> r7 = f6697d     // Catch:{ Throwable -> 0x0080 }
            r7.add(r6)     // Catch:{ Throwable -> 0x0080 }
            java.lang.String r5 = com.amap.api.services.a.bk.b((byte[]) r5)     // Catch:{ Throwable -> 0x0080 }
            java.lang.String r6 = f6698f     // Catch:{ Throwable -> 0x0080 }
            com.amap.api.services.a.cb.a((com.amap.api.services.a.bn) r1, (android.content.Context) r9, (java.lang.String) r6, (java.lang.String) r5)     // Catch:{ Throwable -> 0x0080 }
            r8.a((java.io.File) r4)     // Catch:{ Throwable -> 0x0080 }
            goto L_0x007c
        L_0x0075:
            r4.delete()     // Catch:{ Throwable -> 0x0080 }
            goto L_0x007c
        L_0x0079:
            r4.delete()     // Catch:{ Throwable -> 0x0080 }
        L_0x007c:
            int r2 = r2 + 1
            goto L_0x0026
        L_0x007f:
            return
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.services.a.cc.a(android.content.Context):void");
    }

    private boolean a(List<b> list, String str) {
        if (list == null) {
            return false;
        }
        for (b next : list) {
            if (next.f6706b.equals(str)) {
                int unused = next.f6705a = next.f6705a + 1;
                return true;
            }
        }
        return false;
    }

    private void a(Context context, byte[] bArr) {
        boolean z;
        if (context != null) {
            try {
                String str = new String(bArr, "ISO-8859-1");
                if (str.indexOf("{\"") <= 0 || str.indexOf("\"}") <= 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    JSONObject jSONObject = new JSONObject(str.substring(str.indexOf("{\""), str.lastIndexOf("\"}") + 2));
                    String optString = jSONObject.optString("ik");
                    String optString2 = jSONObject.optString("jk");
                    if (!TextUtils.isEmpty(optString2)) {
                        List<a> b2 = a.b(optString);
                        if (b2 != null) {
                            for (int i = 0; i < b2.size(); i++) {
                                a aVar = b2.get(i);
                                if (optString2.contains(aVar.e())) {
                                    a(context, aVar);
                                }
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    private static void a(Context context, a aVar) throws JSONException {
        if (!TextUtils.isEmpty(aVar.b()) && !TextUtils.isEmpty(aVar.c()) && !TextUtils.isEmpty(aVar.d())) {
            int i = 0;
            SharedPreferences a2 = c.a(context, a(), 0);
            JSONArray jSONArray = new JSONArray(bo.a(bd.b(bo.d(a2.getString("SO_ERROR_KEY", "")))));
            while (i < jSONArray.length()) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                if (!jSONObject.opt("mk").equals(aVar.a()) || !jSONObject.opt("ak").equals(aVar.b()) || !jSONObject.opt("bk").equals(aVar.c()) || !jSONObject.opt("ik").equals(aVar.d()) || !jSONObject.opt("nk").equals(aVar.e())) {
                    i++;
                } else {
                    return;
                }
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("mk", aVar.a());
            jSONObject2.putOpt("ak", aVar.b());
            jSONObject2.putOpt("bk", aVar.c());
            jSONObject2.putOpt("ik", aVar.d());
            jSONObject2.putOpt("nk", aVar.e());
            jSONArray.put(jSONObject2);
            SharedPreferences.Editor edit = a2.edit();
            edit.putString("SO_ERROR_KEY", bo.g(bd.a(bo.a(jSONArray.toString()))));
            edit.commit();
        }
    }

    private boolean a(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0 || bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }
}
