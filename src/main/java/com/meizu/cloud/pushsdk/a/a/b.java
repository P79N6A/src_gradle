package com.meizu.cloud.pushsdk.a.a;

import android.content.Context;
import android.text.TextUtils;
import com.meizu.cloud.pushinternal.DebugLogger;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static final String f26837a = "b";

    /* renamed from: b  reason: collision with root package name */
    private static final Object f26838b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static b f26839c;

    /* renamed from: d  reason: collision with root package name */
    private Context f26840d;

    private b(Context context) {
        this.f26840d = context;
        try {
            System.setProperty("sun.net.http.allowRestrictedHeaders", "true");
        } catch (Exception unused) {
        }
        a.a(context);
    }

    public static b a(Context context) {
        if (f26839c == null) {
            synchronized (f26838b) {
                if (f26839c == null) {
                    f26839c = new b(context);
                }
            }
        }
        return f26839c;
    }

    private Map<String, String> a(Map<String, String> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        byte[] c2 = a.a().c();
        if (c2 == null || c2.length <= 0) {
            byte[] b2 = a.a().b();
            if (b2 != null && b2.length > 0) {
                String str = new String(a.a().b());
                String str2 = f26837a;
                DebugLogger.d(str2, "attach x_a_key: " + str);
                map.put("X-A-Key", str);
            }
        } else {
            String str3 = new String(c2);
            String str4 = f26837a;
            DebugLogger.d(str4, "attach x_s_key: " + str3);
            map.put("X-S-Key", str3);
        }
        return map;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x001a A[SYNTHETIC, Splitter:B:12:0x001a] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.net.HttpURLConnection r3, byte[] r4) throws java.io.IOException {
        /*
            r2 = this;
            r0 = 0
            java.util.zip.GZIPOutputStream r1 = new java.util.zip.GZIPOutputStream     // Catch:{ all -> 0x0017 }
            java.io.OutputStream r3 = r3.getOutputStream()     // Catch:{ all -> 0x0017 }
            r1.<init>(r3)     // Catch:{ all -> 0x0017 }
            r1.write(r4)     // Catch:{ all -> 0x0014 }
            r1.flush()     // Catch:{ all -> 0x0014 }
            r1.close()     // Catch:{ Exception -> 0x0013 }
        L_0x0013:
            return
        L_0x0014:
            r3 = move-exception
            r0 = r1
            goto L_0x0018
        L_0x0017:
            r3 = move-exception
        L_0x0018:
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ Exception -> 0x001d }
        L_0x001d:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.a.b.a(java.net.HttpURLConnection, byte[]):void");
    }

    private void a(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("X-S-Key");
            String str = f26837a;
            DebugLogger.d(str, "get x_s_key = " + headerField);
            if (!TextUtils.isEmpty(headerField)) {
                a.a().a(headerField);
            }
        } catch (NullPointerException unused) {
        }
    }

    private byte[] a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            try {
                int read = inputStream.read();
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(read);
            } finally {
                try {
                    byteArrayOutputStream.close();
                } catch (IOException unused) {
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00f9, code lost:
        if (r9 == null) goto L_0x0133;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00fb, code lost:
        r9.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0122, code lost:
        if (r9 != null) goto L_0x00fb;
     */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d A[SYNTHETIC, Splitter:B:46:0x011d] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0128 A[SYNTHETIC, Splitter:B:52:0x0128] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x012f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.meizu.cloud.pushsdk.a.a.c b(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8, java.lang.String r9) throws java.io.IOException {
        /*
            r6 = this;
            r0 = 0
            if (r9 == 0) goto L_0x0133
            com.meizu.cloud.pushsdk.a.a.a r1 = com.meizu.cloud.pushsdk.a.a.a.a()
            byte[] r9 = r9.getBytes()
            byte[] r9 = r1.a((byte[]) r9)
            if (r9 == 0) goto L_0x001c
            java.lang.String r1 = new java.lang.String
            r2 = 2
            byte[] r9 = android.util.Base64.encode(r9, r2)
            r1.<init>(r9)
            goto L_0x001d
        L_0x001c:
            r1 = r0
        L_0x001d:
            java.net.URL r9 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0133 }
            java.lang.String r2 = "http://norma-external-collect.meizu.com/push/android/external/add.do"
            r9.<init>(r2)     // Catch:{ MalformedURLException -> 0x0133 }
            java.net.URLConnection r9 = r9.openConnection()
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9
            r9.setRequestMethod(r7)
            r7 = 1
            r9.setDoInput(r7)
            r9.setDoOutput(r7)
            r7 = 0
            r9.setUseCaches(r7)
            r7 = 30000(0x7530, float:4.2039E-41)
            r9.setConnectTimeout(r7)
            r9.setReadTimeout(r7)
            java.lang.String r7 = "Connection"
            java.lang.String r2 = "keep-alive"
            r9.setRequestProperty(r7, r2)
            java.lang.String r7 = "Charset"
            java.lang.String r2 = "UTF-8"
            r9.setRequestProperty(r7, r2)
            java.lang.String r7 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            r9.setRequestProperty(r7, r2)
            java.lang.String r7 = "Content-Encoding"
            java.lang.String r2 = "gzip"
            r9.setRequestProperty(r7, r2)
            if (r8 == 0) goto L_0x0088
            int r7 = r8.size()
            if (r7 <= 0) goto L_0x0088
            java.util.Set r7 = r8.entrySet()
            java.util.Iterator r7 = r7.iterator()
        L_0x006c:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0088
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r2 = r8.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r8 = r8.getValue()
            java.lang.String r8 = (java.lang.String) r8
            r9.setRequestProperty(r2, r8)
            goto L_0x006c
        L_0x0088:
            byte[] r7 = r1.getBytes()     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r6.a(r9, r7)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            int r7 = r9.getResponseCode()     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.lang.String r8 = f26837a     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.lang.String r2 = "code = "
            r1.<init>(r2)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r1.append(r7)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            com.meizu.cloud.pushinternal.DebugLogger.d(r8, r1)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r6.a((java.net.URLConnection) r9)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            r6.b(r9)     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            java.io.InputStream r8 = r9.getInputStream()     // Catch:{ Exception -> 0x0102, all -> 0x00ff }
            if (r8 == 0) goto L_0x00dd
            byte[] r1 = r6.a((java.io.InputStream) r8)     // Catch:{ Exception -> 0x00db }
            if (r1 == 0) goto L_0x00de
            java.lang.String r2 = new java.lang.String     // Catch:{ Exception -> 0x00db }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = f26837a     // Catch:{ Exception -> 0x00db }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00db }
            java.lang.String r5 = "body = "
            r4.<init>(r5)     // Catch:{ Exception -> 0x00db }
            r4.append(r2)     // Catch:{ Exception -> 0x00db }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00db }
            com.meizu.cloud.pushinternal.DebugLogger.d(r3, r4)     // Catch:{ Exception -> 0x00db }
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00de }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00de }
            java.lang.String r2 = "code"
            r3.getInt(r2)     // Catch:{ JSONException -> 0x00de }
            goto L_0x00de
        L_0x00db:
            r7 = move-exception
            goto L_0x0104
        L_0x00dd:
            r1 = r0
        L_0x00de:
            if (r1 == 0) goto L_0x00ec
            com.meizu.cloud.pushsdk.a.a.c r2 = new com.meizu.cloud.pushsdk.a.a.c     // Catch:{ Exception -> 0x00db }
            java.lang.String r3 = new java.lang.String     // Catch:{ Exception -> 0x00db }
            r3.<init>(r1)     // Catch:{ Exception -> 0x00db }
            r2.<init>(r7, r3)     // Catch:{ Exception -> 0x00db }
            r0 = r2
            goto L_0x00f2
        L_0x00ec:
            com.meizu.cloud.pushsdk.a.a.c r1 = new com.meizu.cloud.pushsdk.a.a.c     // Catch:{ Exception -> 0x00db }
            r1.<init>(r7, r0)     // Catch:{ Exception -> 0x00db }
            r0 = r1
        L_0x00f2:
            if (r8 == 0) goto L_0x00f9
            r8.close()     // Catch:{ IOException -> 0x00f8 }
            goto L_0x00f9
        L_0x00f8:
        L_0x00f9:
            if (r9 == 0) goto L_0x0133
        L_0x00fb:
            r9.disconnect()
            goto L_0x0133
        L_0x00ff:
            r7 = move-exception
            r8 = r0
            goto L_0x0126
        L_0x0102:
            r7 = move-exception
            r8 = r0
        L_0x0104:
            java.lang.String r1 = f26837a     // Catch:{ all -> 0x0125 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0125 }
            java.lang.String r3 = "realStringPartRequest error "
            r2.<init>(r3)     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = r7.getMessage()     // Catch:{ all -> 0x0125 }
            r2.append(r7)     // Catch:{ all -> 0x0125 }
            java.lang.String r7 = r2.toString()     // Catch:{ all -> 0x0125 }
            com.meizu.cloud.pushinternal.DebugLogger.e(r1, r7)     // Catch:{ all -> 0x0125 }
            if (r8 == 0) goto L_0x0122
            r8.close()     // Catch:{ IOException -> 0x0121 }
            goto L_0x0122
        L_0x0121:
        L_0x0122:
            if (r9 == 0) goto L_0x0133
            goto L_0x00fb
        L_0x0125:
            r7 = move-exception
        L_0x0126:
            if (r8 == 0) goto L_0x012d
            r8.close()     // Catch:{ IOException -> 0x012c }
            goto L_0x012d
        L_0x012c:
        L_0x012d:
            if (r9 == 0) goto L_0x0132
            r9.disconnect()
        L_0x0132:
            throw r7
        L_0x0133:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meizu.cloud.pushsdk.a.a.b.b(java.lang.String, java.util.Map, java.lang.String):com.meizu.cloud.pushsdk.a.a.c");
    }

    private void b(URLConnection uRLConnection) {
        try {
            String headerField = uRLConnection.getHeaderField("Key-Timeout");
            String str = f26837a;
            DebugLogger.d(str, "get keyTimeout = " + headerField);
        } catch (NullPointerException unused) {
        }
    }

    public c a(String str, Map<String, String> map, String str2) {
        try {
            return b(str, a(map), str2);
        } catch (IOException unused) {
            return null;
        }
    }
}
