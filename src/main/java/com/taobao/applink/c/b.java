package com.taobao.applink.c;

import com.taobao.applink.TBAppLinkSDK;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: b  reason: collision with root package name */
    private static volatile b f79164b;

    /* renamed from: a  reason: collision with root package name */
    private String f79165a = TBAppLinkSDK.getInstance().sOpenParam.mAppkey;

    /* renamed from: c  reason: collision with root package name */
    private Map f79166c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    private a f79167d = c();

    public interface a {
        void a(a aVar);
    }

    private b() {
    }

    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (f79164b == null) {
                f79164b = new b();
            }
            bVar = f79164b;
        }
        return bVar;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:63:?, code lost:
        r12 = new java.lang.StringBuffer();
        r12.append("isSuccess=0&configExist=0");
        b(com.taobao.applink.util.TBAppLinkUtil.getConfigUrl(), null, r12.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0190, code lost:
        if (r0 != null) goto L_0x0192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0192, code lost:
        r0.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0195, code lost:
        if (r2 != null) goto L_0x0197;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019b, code lost:
        r12 = th;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:62:0x017b */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x019e  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x01a3 A[SYNTHETIC, Splitter:B:75:0x01a3] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(com.taobao.applink.c.b.a r12) {
        /*
            r11 = this;
            java.lang.String r0 = "https://nbsdk-baichuan.alicdn.com/2.0.0/applink.htm?plat=android&appKey=%s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r2 = r11.f79165a
            r3 = 0
            r1[r3] = r2
            java.lang.String r0 = java.lang.String.format(r0, r1)
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x0179, all -> 0x0175 }
            r2.<init>(r0)     // Catch:{ Exception -> 0x0179, all -> 0x0175 }
            java.net.URLConnection r0 = r2.openConnection()     // Catch:{ Exception -> 0x0179, all -> 0x0175 }
            java.net.HttpURLConnection r0 = (java.net.HttpURLConnection) r0     // Catch:{ Exception -> 0x0179, all -> 0x0175 }
            r2 = 5000(0x1388, float:7.006E-42)
            r0.setConnectTimeout(r2)     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
            r0.setReadTimeout(r2)     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
            int r2 = r0.getResponseCode()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 != r3) goto L_0x0165
            java.io.InputStream r2 = r0.getInputStream()     // Catch:{ Exception -> 0x0173, all -> 0x0170 }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x017b }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x017b }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x017b }
            r3.<init>(r4)     // Catch:{ Exception -> 0x017b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x017b }
            r4.<init>()     // Catch:{ Exception -> 0x017b }
        L_0x003f:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x017b }
            if (r5 == 0) goto L_0x0049
            r4.append(r5)     // Catch:{ Exception -> 0x017b }
            goto L_0x003f
        L_0x0049:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017b }
            r3.<init>(r4)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            if (r4 != 0) goto L_0x005d
            com.taobao.applink.c.a r4 = new com.taobao.applink.c.a     // Catch:{ Exception -> 0x017b }
            r4.<init>()     // Catch:{ Exception -> 0x017b }
            r11.f79167d = r4     // Catch:{ Exception -> 0x017b }
        L_0x005d:
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            r4.a(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            boolean r4 = r4.a()     // Catch:{ Exception -> 0x017b }
            if (r4 != 0) goto L_0x008a
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x017b }
            r12.<init>()     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "isSuccess=1&configExist=0"
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = com.taobao.applink.util.TBAppLinkUtil.getConfigUrl()     // Catch:{ Exception -> 0x017b }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x017b }
            r11.b(r3, r1, r12)     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x0084
            r0.disconnect()
        L_0x0084:
            if (r2 == 0) goto L_0x0089
            r2.close()     // Catch:{ IOException -> 0x0089 }
        L_0x0089:
            return
        L_0x008a:
            java.lang.String r4 = "appLinkConfig"
            org.json.JSONObject r3 = r3.optJSONObject(r4)     // Catch:{ Exception -> 0x017b }
            if (r3 != 0) goto L_0x00b2
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x017b }
            r12.<init>()     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "isSuccess=0&configExist=0"
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = com.taobao.applink.util.TBAppLinkUtil.getConfigUrl()     // Catch:{ Exception -> 0x017b }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x017b }
            r11.b(r3, r1, r12)     // Catch:{ Exception -> 0x017b }
            if (r0 == 0) goto L_0x00ac
            r0.disconnect()
        L_0x00ac:
            if (r2 == 0) goto L_0x00b1
            r2.close()     // Catch:{ IOException -> 0x00b1 }
        L_0x00b1:
            return
        L_0x00b2:
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r5 = "exp"
            long r5 = r3.optLong(r5)     // Catch:{ Exception -> 0x017b }
            r4.f79161d = r5     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r5 = "taobao_scheme"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x017b }
            r4.f79159b = r5     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r5 = "tmall_scheme"
            java.lang.String r5 = r3.optString(r5)     // Catch:{ Exception -> 0x017b }
            r4.f79160c = r5     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r4 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r5 = "sign"
            java.lang.String r3 = r3.optString(r5)     // Catch:{ Exception -> 0x017b }
            r4.f79163f = r3     // Catch:{ Exception -> 0x017b }
            java.util.Map r3 = r11.f79166c     // Catch:{ Exception -> 0x017b }
            if (r3 != 0) goto L_0x00e5
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Exception -> 0x017b }
            r3.<init>()     // Catch:{ Exception -> 0x017b }
            r11.f79166c = r3     // Catch:{ Exception -> 0x017b }
        L_0x00e5:
            java.util.Map r3 = r11.f79166c     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r11.f79165a     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017b }
            r3.remove(r4)     // Catch:{ Exception -> 0x017b }
            java.util.Map r3 = r11.f79166c     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r11.f79165a     // Catch:{ Exception -> 0x017b }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x017b }
            long r5 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r7 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            long r7 = r7.f79161d     // Catch:{ Exception -> 0x017b }
            r9 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r9
            long r5 = r5 + r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch:{ Exception -> 0x017b }
            r3.put(r4, r5)     // Catch:{ Exception -> 0x017b }
            if (r12 == 0) goto L_0x0113
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            r12.a(r3)     // Catch:{ Exception -> 0x017b }
        L_0x0113:
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x017b }
            r12.<init>()     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "isSuccess=1&configExist=1"
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&appkeyExist=1&taobao_scheme="
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r3.f79159b     // Catch:{ Exception -> 0x017b }
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&tmall_scheme="
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r3.f79160c     // Catch:{ Exception -> 0x017b }
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&sug="
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r3.f79162e     // Catch:{ Exception -> 0x017b }
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&sign="
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = r3.f79163f     // Catch:{ Exception -> 0x017b }
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = "&exp="
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            com.taobao.applink.c.a r3 = r11.f79167d     // Catch:{ Exception -> 0x017b }
            long r3 = r3.f79161d     // Catch:{ Exception -> 0x017b }
            r12.append(r3)     // Catch:{ Exception -> 0x017b }
            java.lang.String r3 = com.taobao.applink.util.TBAppLinkUtil.getConfigUrl()     // Catch:{ Exception -> 0x017b }
            java.lang.String r12 = r12.toString()     // Catch:{ Exception -> 0x017b }
            r11.b(r3, r1, r12)     // Catch:{ Exception -> 0x017b }
            r1 = r2
        L_0x0165:
            if (r0 == 0) goto L_0x016a
            r0.disconnect()
        L_0x016a:
            if (r1 == 0) goto L_0x019a
            r1.close()     // Catch:{ IOException -> 0x016f }
        L_0x016f:
            return
        L_0x0170:
            r12 = move-exception
            r2 = r1
            goto L_0x019c
        L_0x0173:
            r2 = r1
            goto L_0x017b
        L_0x0175:
            r12 = move-exception
            r0 = r1
            r2 = r0
            goto L_0x019c
        L_0x0179:
            r0 = r1
            r2 = r0
        L_0x017b:
            java.lang.StringBuffer r12 = new java.lang.StringBuffer     // Catch:{ all -> 0x019b }
            r12.<init>()     // Catch:{ all -> 0x019b }
            java.lang.String r3 = "isSuccess=0&configExist=0"
            r12.append(r3)     // Catch:{ all -> 0x019b }
            java.lang.String r3 = com.taobao.applink.util.TBAppLinkUtil.getConfigUrl()     // Catch:{ all -> 0x019b }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x019b }
            r11.b(r3, r1, r12)     // Catch:{ all -> 0x019b }
            if (r0 == 0) goto L_0x0195
            r0.disconnect()
        L_0x0195:
            if (r2 == 0) goto L_0x019a
            r2.close()     // Catch:{ IOException -> 0x019a }
        L_0x019a:
            return
        L_0x019b:
            r12 = move-exception
        L_0x019c:
            if (r0 == 0) goto L_0x01a1
            r0.disconnect()
        L_0x01a1:
            if (r2 == 0) goto L_0x01a6
            r2.close()     // Catch:{ IOException -> 0x01a6 }
        L_0x01a6:
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.c.b.b(com.taobao.applink.c.b$a):void");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x010c A[SYNTHETIC, Splitter:B:38:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x011b A[SYNTHETIC, Splitter:B:47:0x011b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void b(java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.System.currentTimeMillis()
            java.lang.String r1 = "logtype=2&wappkey="
            r0.append(r1)
            java.lang.String r1 = r4.f79165a
            r0.append(r1)
            java.lang.String r1 = "&packagename="
            r0.append(r1)
            android.app.Application r1 = com.taobao.applink.util.TBAppLinkUtil.getApplication()
            java.lang.String r1 = com.taobao.applink.b.a.a(r1)
            r0.append(r1)
            java.lang.String r1 = "&os="
            r0.append(r1)
            java.lang.String r1 = "android&"
            r0.append(r1)
            java.lang.String r1 = "&t=&sdkversion="
            r0.append(r1)
            java.lang.String r1 = "2.0.0"
            r0.append(r1)
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            if (r1 != 0) goto L_0x0044
            java.lang.String r1 = "&"
            r0.append(r1)
            r0.append(r7)
        L_0x0044:
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x0052
            java.lang.String r7 = "&type="
            r0.append(r7)
            r0.append(r6)
        L_0x0052:
            com.taobao.applink.TBAppLinkSDK r6 = com.taobao.applink.TBAppLinkSDK.getInstance()
            com.taobao.applink.TBAppLinkParam r6 = r6.sOpenParam
            java.lang.String r6 = r6.mTtid
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 != 0) goto L_0x0070
            java.lang.String r6 = "&ttid="
            r0.append(r6)
            com.taobao.applink.TBAppLinkSDK r6 = com.taobao.applink.TBAppLinkSDK.getInstance()
            com.taobao.applink.TBAppLinkParam r6 = r6.sOpenParam
            java.lang.String r6 = r6.mTtid
            r0.append(r6)
        L_0x0070:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r5)
            java.lang.String r5 = "?"
            r6.append(r5)
            java.lang.String r5 = r0.toString()
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            r6 = 0
            java.net.URL r7 = new java.net.URL     // Catch:{ Throwable -> 0x0113, all -> 0x0101 }
            r7.<init>(r5)     // Catch:{ Throwable -> 0x0113, all -> 0x0101 }
            java.net.URLConnection r5 = r7.openConnection()     // Catch:{ Throwable -> 0x0113, all -> 0x0101 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ Throwable -> 0x0113, all -> 0x0101 }
            java.lang.String r7 = "POST"
            r5.setRequestMethod(r7)     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            r7 = 1
            r5.setDoOutput(r7)     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            r5.setDoInput(r7)     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            r7 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r7)     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            r5.setReadTimeout(r7)     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            java.io.OutputStream r7 = r5.getOutputStream()     // Catch:{ Throwable -> 0x00ff, all -> 0x00fa }
            java.lang.String r6 = r0.toString()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = "UTF-8"
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            byte[] r6 = r6.getBytes()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r7.write(r6)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.io.InputStream r1 = r5.getInputStream()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r6.<init>(r0)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = ""
        L_0x00cd:
            java.lang.String r1 = r6.readLine()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            if (r1 == 0) goto L_0x00e8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r2.<init>()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r2.append(r0)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = "\n"
            r2.append(r0)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            r2.append(r1)     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            java.lang.String r0 = r2.toString()     // Catch:{ Throwable -> 0x00f8, all -> 0x00f6 }
            goto L_0x00cd
        L_0x00e8:
            if (r5 == 0) goto L_0x00ed
            r5.disconnect()
        L_0x00ed:
            if (r7 == 0) goto L_0x0121
            r7.flush()     // Catch:{ IOException -> 0x00f5 }
            r7.close()     // Catch:{ IOException -> 0x00f5 }
        L_0x00f5:
            return
        L_0x00f6:
            r6 = move-exception
            goto L_0x0105
        L_0x00f8:
            r6 = r7
            goto L_0x0114
        L_0x00fa:
            r7 = move-exception
            r3 = r7
            r7 = r6
            r6 = r3
            goto L_0x0105
        L_0x00ff:
            goto L_0x0114
        L_0x0101:
            r5 = move-exception
            r7 = r6
            r6 = r5
            r5 = r7
        L_0x0105:
            if (r5 == 0) goto L_0x010a
            r5.disconnect()
        L_0x010a:
            if (r7 == 0) goto L_0x0112
            r7.flush()     // Catch:{ IOException -> 0x0112 }
            r7.close()     // Catch:{ IOException -> 0x0112 }
        L_0x0112:
            throw r6
        L_0x0113:
            r5 = r6
        L_0x0114:
            if (r5 == 0) goto L_0x0119
            r5.disconnect()
        L_0x0119:
            if (r6 == 0) goto L_0x0121
            r6.flush()     // Catch:{ IOException -> 0x0121 }
            r6.close()     // Catch:{ IOException -> 0x0121 }
        L_0x0121:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.c.b.b(java.lang.String, java.lang.String, java.lang.String):void");
    }

    private a c() {
        a aVar = new a();
        aVar.f79159b = "tbopen://m.taobao.com/tbopen/index.html?";
        aVar.f79160c = "tmall://page.tm/appLink?";
        return aVar;
    }

    public void a(a aVar) {
        try {
            new c(this, aVar).execute(new Void[0]);
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
        /*
            r1 = this;
            boolean r0 = com.taobao.applink.util.e.a((java.lang.String) r2)
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            monitor-enter(r1)
            com.taobao.applink.c.d r0 = new com.taobao.applink.c.d     // Catch:{ Exception -> 0x0016 }
            r0.<init>(r1, r2, r3, r4)     // Catch:{ Exception -> 0x0016 }
            r2 = 0
            java.lang.Void[] r2 = new java.lang.Void[r2]     // Catch:{ Exception -> 0x0016 }
            r0.execute(r2)     // Catch:{ Exception -> 0x0016 }
            goto L_0x0016
        L_0x0014:
            r2 = move-exception
            goto L_0x0018
        L_0x0016:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            return
        L_0x0018:
            monitor-exit(r1)     // Catch:{ all -> 0x0014 }
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taobao.applink.c.b.a(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public boolean a(String str) {
        return !this.f79166c.containsKey(str) || ((Long) this.f79166c.get(str)).longValue() - System.currentTimeMillis() < 1000;
    }

    public a b() {
        if (a(this.f79165a)) {
            a((a) null);
        }
        return this.f79167d;
    }
}
