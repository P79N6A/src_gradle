package com.umeng.commonsdk.statistics.idtracking;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;

public class s extends a {

    /* renamed from: b  reason: collision with root package name */
    private Context f80978b;

    /* renamed from: c  reason: collision with root package name */
    private String f80979c;

    /* renamed from: d  reason: collision with root package name */
    private String f80980d;

    public String f() {
        try {
            if (!TextUtils.isEmpty(a("ro.yunos.version", "")) && this.f80978b != null) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(this.f80978b);
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("yosuid", "");
                    if (!TextUtils.isEmpty(string)) {
                        return string;
                    }
                    this.f80980d = b("23346339");
                    if (!(TextUtils.isEmpty(this.f80980d) || this.f80978b == null || sharedPreferences == null)) {
                        SharedPreferences.Editor edit = sharedPreferences.edit();
                        if (edit != null) {
                            edit.putString("yosuid", this.f80980d).commit();
                        }
                    }
                    return this.f80980d;
                }
            }
        } catch (Exception unused) {
        }
        return null;
    }

    public s(Context context) {
        super("uuid");
        this.f80978b = context;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.InputStream} */
    /* JADX WARNING: type inference failed for: r7v12 */
    /* JADX WARNING: type inference failed for: r7v13, types: [java.io.DataOutputStream] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v15 */
    /* JADX WARNING: type inference failed for: r0v6 */
    /* JADX WARNING: type inference failed for: r7v16 */
    /* JADX WARNING: type inference failed for: r7v17 */
    /* JADX WARNING: type inference failed for: r7v18 */
    /* JADX WARNING: type inference failed for: r7v19, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r7v21 */
    /* JADX WARNING: type inference failed for: r7v30 */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f3, code lost:
        if (r0 != null) goto L_0x012a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00f6, code lost:
        r1 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f7, code lost:
        r3 = null;
        r7 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:?, code lost:
        r7.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r3.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011e, code lost:
        r2.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0128, code lost:
        if (r0 == null) goto L_0x012d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x012a, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e7 A[SYNTHETIC, Splitter:B:43:0x00e7] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ee A[SYNTHETIC, Splitter:B:47:0x00ee] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f6 A[ExcHandler: all (th java.lang.Throwable), Splitter:B:15:0x009d] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0109 A[SYNTHETIC, Splitter:B:63:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0110 A[SYNTHETIC, Splitter:B:67:0x0110] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0117 A[SYNTHETIC, Splitter:B:71:0x0117] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0125 A[SYNTHETIC, Splitter:B:80:0x0125] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private java.lang.String b(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r7 = "ro.yunos.openuuid"
            java.lang.String r0 = ""
            java.lang.String r7 = a(r7, r0)
            r6.f80980d = r7
            java.lang.String r7 = r6.f80980d
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x0015
            java.lang.String r7 = r6.f80980d
            return r7
        L_0x0015:
            java.lang.String r7 = "ro.aliyun.clouduuid"
            java.lang.String r0 = ""
            java.lang.String r7 = a(r7, r0)
            r6.f80979c = r7
            java.lang.String r7 = r6.f80979c
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x0031
            java.lang.String r7 = "ro.sys.aliyun.clouduuid"
            java.lang.String r0 = ""
            java.lang.String r7 = a(r7, r0)
            r6.f80979c = r7
        L_0x0031:
            java.lang.String r7 = r6.f80979c
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x012d
            r7 = 0
            java.net.URL r0 = new java.net.URL     // Catch:{ Exception -> 0x0122, all -> 0x0102 }
            java.lang.String r1 = "https://cmnsguider.yunos.com:443/genDeviceToken"
            r0.<init>(r1)     // Catch:{ Exception -> 0x0122, all -> 0x0102 }
            java.net.URLConnection r0 = r0.openConnection()     // Catch:{ Exception -> 0x0122, all -> 0x0102 }
            javax.net.ssl.HttpsURLConnection r0 = (javax.net.ssl.HttpsURLConnection) r0     // Catch:{ Exception -> 0x0122, all -> 0x0102 }
            r1 = 30000(0x7530, float:4.2039E-41)
            r0.setConnectTimeout(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r0.setReadTimeout(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r1 = "POST"
            r0.setRequestMethod(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r1 = 1
            r0.setDoInput(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r0.setDoOutput(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r1 = 0
            r0.setUseCaches(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r0.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            com.umeng.commonsdk.statistics.idtracking.s$1 r1 = new com.umeng.commonsdk.statistics.idtracking.s$1     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r1.<init>()     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r0.setHostnameVerifier(r1)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r2 = "appKey="
            r1.<init>(r2)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r2 = "23338940"
            java.lang.String r3 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r1.append(r2)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r2 = "&uuid="
            r1.append(r2)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r2 = "FC1FE84794417B1BEF276234F6FB4E63"
            java.lang.String r3 = "UTF-8"
            java.lang.String r2 = java.net.URLEncoder.encode(r2, r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r1.append(r2)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r2.<init>(r3)     // Catch:{ Exception -> 0x0100, all -> 0x00fc }
            r2.writeBytes(r1)     // Catch:{ Exception -> 0x00fa, all -> 0x00f6 }
            r2.flush()     // Catch:{ Exception -> 0x00fa, all -> 0x00f6 }
            int r1 = r0.getResponseCode()     // Catch:{ Exception -> 0x00fa, all -> 0x00f6 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r1 != r3) goto L_0x00e1
            java.io.InputStream r1 = r0.getInputStream()     // Catch:{ Exception -> 0x00e1, all -> 0x00f6 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00df, all -> 0x00d7 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00df, all -> 0x00d7 }
            r4.<init>(r1)     // Catch:{ Exception -> 0x00df, all -> 0x00d7 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00df, all -> 0x00d7 }
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
            r7.<init>()     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
        L_0x00be:
            java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
            if (r4 == 0) goto L_0x00c8
            r7.append(r4)     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
            goto L_0x00be
        L_0x00c8:
            java.lang.String r7 = r7.toString()     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
            r6.f80980d = r7     // Catch:{ Exception -> 0x00ce, all -> 0x00d0 }
        L_0x00ce:
            r7 = r1
            goto L_0x00e2
        L_0x00d0:
            r7 = move-exception
            r5 = r1
            r1 = r7
            r7 = r2
            r2 = r0
            r0 = r5
            goto L_0x0107
        L_0x00d7:
            r3 = move-exception
            r5 = r3
            r3 = r7
            r7 = r2
            r2 = r0
            r0 = r1
            r1 = r5
            goto L_0x0107
        L_0x00df:
            r3 = r7
            goto L_0x00ce
        L_0x00e1:
            r3 = r7
        L_0x00e2:
            r2.close()     // Catch:{ Exception -> 0x00e5 }
        L_0x00e5:
            if (r3 == 0) goto L_0x00ec
            r3.close()     // Catch:{ Exception -> 0x00eb }
            goto L_0x00ec
        L_0x00eb:
        L_0x00ec:
            if (r7 == 0) goto L_0x00f3
            r7.close()     // Catch:{ Exception -> 0x00f2 }
            goto L_0x00f3
        L_0x00f2:
        L_0x00f3:
            if (r0 == 0) goto L_0x012d
            goto L_0x012a
        L_0x00f6:
            r1 = move-exception
            r3 = r7
            r7 = r2
            goto L_0x00fe
        L_0x00fa:
            r7 = r2
            goto L_0x0123
        L_0x00fc:
            r1 = move-exception
            r3 = r7
        L_0x00fe:
            r2 = r0
            goto L_0x0106
        L_0x0100:
            goto L_0x0123
        L_0x0102:
            r0 = move-exception
            r2 = r7
            r3 = r2
            r1 = r0
        L_0x0106:
            r0 = r3
        L_0x0107:
            if (r7 == 0) goto L_0x010e
            r7.close()     // Catch:{ Exception -> 0x010d }
            goto L_0x010e
        L_0x010d:
        L_0x010e:
            if (r3 == 0) goto L_0x0115
            r3.close()     // Catch:{ Exception -> 0x0114 }
            goto L_0x0115
        L_0x0114:
        L_0x0115:
            if (r0 == 0) goto L_0x011c
            r0.close()     // Catch:{ Exception -> 0x011b }
            goto L_0x011c
        L_0x011b:
        L_0x011c:
            if (r2 == 0) goto L_0x0121
            r2.disconnect()
        L_0x0121:
            throw r1
        L_0x0122:
            r0 = r7
        L_0x0123:
            if (r7 == 0) goto L_0x0128
            r7.close()     // Catch:{ Exception -> 0x0128 }
        L_0x0128:
            if (r0 == 0) goto L_0x012d
        L_0x012a:
            r0.disconnect()
        L_0x012d:
            java.lang.String r7 = r6.f80980d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.commonsdk.statistics.idtracking.s.b(java.lang.String):java.lang.String");
    }

    public static String a(String str, String str2) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", new Class[]{String.class, String.class}).invoke(null, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }
}
