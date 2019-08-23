package com.bytedance.apm.net;

import com.bytedance.services.apm.api.IHttpService;
import com.bytedance.services.apm.api.b;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;

public class DefaultHttpServiceImpl implements IHttpService {
    private static String METHOD_GET = "GET";
    private static String METHOD_POST = "POST";

    public static byte[] toByteArray(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (-1 == read) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        if (inputStream != null) {
            inputStream.close();
        }
        return byteArrayOutputStream.toByteArray();
    }

    public b doGet(String str, Map<String, String> map) throws Exception {
        return doRequest(str, null, METHOD_GET, map);
    }

    public b doPost(String str, byte[] bArr, Map<String, String> map) throws Exception {
        return doRequest(str, bArr, METHOD_POST, map);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:60:0x00eb, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00ed, code lost:
        r5 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ee, code lost:
        r6 = null;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00eb A[ExcHandler: all (th java.lang.Throwable), Splitter:B:5:0x0010] */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x00f4 A[SYNTHETIC, Splitter:B:66:0x00f4] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0104 A[SYNTHETIC, Splitter:B:71:0x0104] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0121 A[SYNTHETIC, Splitter:B:80:0x0121] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0131 A[SYNTHETIC, Splitter:B:85:0x0131] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.services.apm.api.b doRequest(java.lang.String r4, byte[] r5, java.lang.String r6, java.util.Map<java.lang.String, java.lang.String> r7) throws java.lang.Exception {
        /*
            r3 = this;
            if (r6 == 0) goto L_0x0140
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Throwable -> 0x0113, all -> 0x00f0 }
            r1.<init>(r4)     // Catch:{ Throwable -> 0x0113, all -> 0x00f0 }
            java.net.URLConnection r4 = r1.openConnection()     // Catch:{ Throwable -> 0x0113, all -> 0x00f0 }
            java.net.HttpURLConnection r4 = (java.net.HttpURLConnection) r4     // Catch:{ Throwable -> 0x0113, all -> 0x00f0 }
            r1 = 5000(0x1388, float:7.006E-42)
            r4.setConnectTimeout(r1)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r4.setReadTimeout(r1)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r7 == 0) goto L_0x0044
            boolean r1 = r7.isEmpty()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r1 != 0) goto L_0x0044
            java.util.Set r7 = r7.entrySet()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
        L_0x0026:
            boolean r1 = r7.hasNext()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r1 == 0) goto L_0x0044
            java.lang.Object r1 = r7.next()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r1 == 0) goto L_0x0026
            java.lang.Object r2 = r1.getKey()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.lang.Object r1 = r1.getValue()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r4.setRequestProperty(r2, r1)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            goto L_0x0026
        L_0x0044:
            java.lang.String r7 = METHOD_POST     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            boolean r7 = android.text.TextUtils.equals(r6, r7)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r7 == 0) goto L_0x0051
            r7 = 1
            r4.setDoOutput(r7)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            goto L_0x0055
        L_0x0051:
            r7 = 0
            r4.setDoOutput(r7)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
        L_0x0055:
            r4.setRequestMethod(r6)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r5 == 0) goto L_0x006f
            int r6 = r5.length     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            if (r6 <= 0) goto L_0x006f
            java.io.DataOutputStream r6 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.io.OutputStream r7 = r4.getOutputStream()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r6.<init>(r7)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r6.write(r5)     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r6.flush()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r6.close()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
        L_0x006f:
            int r5 = r4.getResponseCode()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x00c9
            java.io.InputStream r6 = r4.getInputStream()     // Catch:{ Throwable -> 0x00ed, all -> 0x00eb }
            java.lang.String r7 = r4.getContentEncoding()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            if (r1 != 0) goto L_0x009a
            java.lang.String r1 = "gzip"
            boolean r7 = r7.equalsIgnoreCase(r1)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            if (r7 == 0) goto L_0x009a
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            r7.<init>(r6)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            byte[] r1 = toByteArray(r7)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            r7.close()     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            goto L_0x009e
        L_0x009a:
            byte[] r1 = toByteArray(r6)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
        L_0x009e:
            com.bytedance.services.apm.api.b r7 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            r7.<init>(r5, r1)     // Catch:{ Throwable -> 0x00c7, all -> 0x00c4 }
            if (r6 == 0) goto L_0x00b3
            r6.close()     // Catch:{ Exception -> 0x00a9 }
            goto L_0x00b3
        L_0x00a9:
            r5 = move-exception
            com.bytedance.apm.d r6 = com.bytedance.apm.d.a()
            java.lang.String r0 = "DefaultHttpServiceImpl: doRequest"
            r6.a(r5, r0)
        L_0x00b3:
            if (r4 == 0) goto L_0x00c3
            r4.disconnect()     // Catch:{ Exception -> 0x00b9 }
            goto L_0x00c3
        L_0x00b9:
            r4 = move-exception
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r6 = "DefaultHttpServiceImpl: doRequest"
            r5.a(r4, r6)
        L_0x00c3:
            return r7
        L_0x00c4:
            r5 = move-exception
            r0 = r6
            goto L_0x00f2
        L_0x00c7:
            r5 = move-exception
            goto L_0x0116
        L_0x00c9:
            com.bytedance.services.apm.api.b r6 = new com.bytedance.services.apm.api.b     // Catch:{ Throwable -> 0x00df, all -> 0x00eb }
            r6.<init>(r5, r0)     // Catch:{ Throwable -> 0x00df, all -> 0x00eb }
            if (r4 == 0) goto L_0x00de
            r4.disconnect()     // Catch:{ Exception -> 0x00d4 }
            goto L_0x00de
        L_0x00d4:
            r4 = move-exception
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r7 = "DefaultHttpServiceImpl: doRequest"
            r5.a(r4, r7)
        L_0x00de:
            return r6
        L_0x00df:
            r5 = move-exception
            com.bytedance.apm.d r6 = com.bytedance.apm.d.a()
            java.lang.String r7 = "DefaultHttpServiceImpl: doRequest"
            r6.a(r5, r7)
            r6 = r0
            goto L_0x011f
        L_0x00eb:
            r5 = move-exception
            goto L_0x00f2
        L_0x00ed:
            r5 = move-exception
            r6 = r0
            goto L_0x0116
        L_0x00f0:
            r5 = move-exception
            r4 = r0
        L_0x00f2:
            if (r0 == 0) goto L_0x0102
            r0.close()     // Catch:{ Exception -> 0x00f8 }
            goto L_0x0102
        L_0x00f8:
            r6 = move-exception
            com.bytedance.apm.d r7 = com.bytedance.apm.d.a()
            java.lang.String r0 = "DefaultHttpServiceImpl: doRequest"
            r7.a(r6, r0)
        L_0x0102:
            if (r4 == 0) goto L_0x0112
            r4.disconnect()     // Catch:{ Exception -> 0x0108 }
            goto L_0x0112
        L_0x0108:
            r4 = move-exception
            com.bytedance.apm.d r6 = com.bytedance.apm.d.a()
            java.lang.String r7 = "DefaultHttpServiceImpl: doRequest"
            r6.a(r4, r7)
        L_0x0112:
            throw r5
        L_0x0113:
            r5 = move-exception
            r4 = r0
            r6 = r4
        L_0x0116:
            com.bytedance.apm.d r7 = com.bytedance.apm.d.a()
            java.lang.String r1 = "DefaultHttpServiceImpl: doRequest"
            r7.a(r5, r1)
        L_0x011f:
            if (r6 == 0) goto L_0x012f
            r6.close()     // Catch:{ Exception -> 0x0125 }
            goto L_0x012f
        L_0x0125:
            r5 = move-exception
            com.bytedance.apm.d r6 = com.bytedance.apm.d.a()
            java.lang.String r7 = "DefaultHttpServiceImpl: doRequest"
            r6.a(r5, r7)
        L_0x012f:
            if (r4 == 0) goto L_0x013f
            r4.disconnect()     // Catch:{ Exception -> 0x0135 }
            goto L_0x013f
        L_0x0135:
            r4 = move-exception
            com.bytedance.apm.d r5 = com.bytedance.apm.d.a()
            java.lang.String r6 = "DefaultHttpServiceImpl: doRequest"
            r5.a(r4, r6)
        L_0x013f:
            return r0
        L_0x0140:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "request method is not null"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.net.DefaultHttpServiceImpl.doRequest(java.lang.String, byte[], java.lang.String, java.util.Map):com.bytedance.services.apm.api.b");
    }
}
