package com.bytedance.router.net;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetClient {
    private static HttpURLConnection createConnection(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setUseCaches(false);
        return httpURLConnection;
    }

    private static byte[] getBytes(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(byteArrayOutputStream);
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        byte[] bArr = new byte[8192];
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read != -1) {
                bufferedOutputStream.write(bArr, 0, read);
            } else {
                bufferedOutputStream.flush();
                bufferedInputStream.close();
                bufferedOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00dd  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.router.net.NetResponse get(java.lang.String r7, java.util.Map<java.lang.String, java.lang.String> r8) {
        /*
            com.bytedance.router.net.NetResponse r0 = new com.bytedance.router.net.NetResponse
            r0.<init>()
            android.net.Uri r7 = android.net.Uri.parse(r7)
            android.net.Uri$Builder r7 = r7.buildUpon()
            if (r8 == 0) goto L_0x0039
            int r1 = r8.size()
            if (r1 <= 0) goto L_0x0039
            java.util.Set r8 = r8.entrySet()
            java.util.Iterator r8 = r8.iterator()
        L_0x001d:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0039
            java.lang.Object r1 = r8.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.lang.String r1 = (java.lang.String) r1
            r7.appendQueryParameter(r2, r1)
            goto L_0x001d
        L_0x0039:
            java.lang.String r7 = r7.toString()
            r8 = 0
        L_0x003e:
            r1 = 0
            r2 = 6
            r3 = 200(0xc8, float:2.8E-43)
            java.net.HttpURLConnection r4 = createConnection(r7)     // Catch:{ IOException -> 0x00b2 }
            java.lang.String r1 = "GET"
            r4.setRequestMethod(r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            r4.connect()     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            r0.errorCode = r1     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            int r1 = r4.getResponseCode()     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            if (r3 != r1) goto L_0x0090
            java.io.InputStream r1 = r4.getInputStream()     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            byte[] r1 = getBytes(r1)     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            java.lang.String r5 = new java.lang.String     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            java.lang.String r6 = "UTF-8"
            r5.<init>(r1, r6)     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            r0.content = r5     // Catch:{ IOException -> 0x00ad, all -> 0x00ab }
            if (r4 == 0) goto L_0x0070
            r4.disconnect()
        L_0x0070:
            int r7 = r0.errorCode
            if (r7 == r3) goto L_0x008f
            if (r8 >= r2) goto L_0x00e6
            int r8 = r8 + 1
            int r7 = r8 * 500
            long r1 = (long) r7
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x007e }
        L_0x007e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r7.<init>(r1)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.router.util.Logger.w(r7)
        L_0x008f:
            return r0
        L_0x0090:
            if (r4 == 0) goto L_0x0095
            r4.disconnect()
        L_0x0095:
            int r1 = r0.errorCode
            if (r1 == r3) goto L_0x003e
            if (r8 >= r2) goto L_0x00e6
            int r8 = r8 + 1
            int r1 = r8 * 500
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00a3 }
        L_0x00a3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "retry connect url: "
            r1.<init>(r2)
            goto L_0x00cf
        L_0x00ab:
            r7 = move-exception
            goto L_0x00db
        L_0x00ad:
            r1 = r4
            goto L_0x00b2
        L_0x00af:
            r7 = move-exception
            r4 = r1
            goto L_0x00db
        L_0x00b2:
            r4 = -1
            r0.errorCode = r4     // Catch:{ all -> 0x00af }
            if (r1 == 0) goto L_0x00ba
            r1.disconnect()
        L_0x00ba:
            int r1 = r0.errorCode
            if (r1 == r3) goto L_0x003e
            if (r8 >= r2) goto L_0x00e6
            int r8 = r8 + 1
            int r1 = r8 * 500
            long r1 = (long) r1
            java.lang.Thread.sleep(r1)     // Catch:{ InterruptedException -> 0x00c8 }
        L_0x00c8:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "retry connect url: "
            r1.<init>(r2)
        L_0x00cf:
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            com.bytedance.router.util.Logger.w(r1)
            goto L_0x003e
        L_0x00db:
            if (r4 == 0) goto L_0x00e0
            r4.disconnect()
        L_0x00e0:
            int r1 = r0.errorCode
            if (r1 == r3) goto L_0x0100
            if (r8 < r2) goto L_0x00e7
        L_0x00e6:
            return r0
        L_0x00e7:
            int r8 = r8 + 1
            int r0 = r8 * 500
            long r0 = (long) r0
            java.lang.Thread.sleep(r0)     // Catch:{ InterruptedException -> 0x00ef }
        L_0x00ef:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "retry connect url: "
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.bytedance.router.util.Logger.w(r8)
        L_0x0100:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.net.NetClient.get(java.lang.String, java.util.Map):com.bytedance.router.net.NetResponse");
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x00d7  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x010c  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.bytedance.router.net.NetResponse post(java.lang.String r9, java.util.Map<java.lang.String, java.lang.String> r10, org.json.JSONObject r11) {
        /*
            com.bytedance.router.net.NetResponse r0 = new com.bytedance.router.net.NetResponse
            r0.<init>()
            android.net.Uri r1 = android.net.Uri.parse(r9)
            android.net.Uri$Builder r1 = r1.buildUpon()
            if (r10 == 0) goto L_0x0039
            int r2 = r10.size()
            if (r2 <= 0) goto L_0x0039
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x001d:
            boolean r2 = r10.hasNext()
            if (r2 == 0) goto L_0x0039
            java.lang.Object r2 = r10.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.lang.String r2 = (java.lang.String) r2
            r1.appendQueryParameter(r3, r2)
            goto L_0x001d
        L_0x0039:
            java.lang.String r10 = r1.toString()
            r1 = 0
        L_0x003e:
            r2 = 0
            r3 = 6
            r4 = 1
            r5 = 200(0xc8, float:2.8E-43)
            java.net.HttpURLConnection r6 = createConnection(r10)     // Catch:{ IOException -> 0x00d2 }
            java.lang.String r2 = "POST"
            r6.setRequestMethod(r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r6.setDoOutput(r4)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r11 == 0) goto L_0x0067
            java.lang.String r2 = r11.toString()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.io.DataOutputStream r7 = new java.io.DataOutputStream     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.io.OutputStream r8 = r6.getOutputStream()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r7.<init>(r8)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r7.writeBytes(r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r7.flush()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r7.close()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
        L_0x0067:
            int r2 = r6.getResponseCode()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r0.errorCode = r2     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            int r2 = r6.getResponseCode()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r5 != r2) goto L_0x00b0
            java.io.InputStream r2 = r6.getInputStream()     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            byte[] r2 = getBytes(r2)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r7 = new java.lang.String     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            java.lang.String r8 = "UTF-8"
            r7.<init>(r2, r8)     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            r0.content = r7     // Catch:{ IOException -> 0x00cd, all -> 0x00cb }
            if (r6 == 0) goto L_0x0089
            r6.disconnect()
        L_0x0089:
            int r10 = r0.errorCode
            if (r10 == r5) goto L_0x00af
            if (r1 >= r3) goto L_0x010e
            int r1 = r1 + r4
            int r10 = r1 * 500
            long r10 = (long) r10
            java.lang.Thread.sleep(r10)     // Catch:{ InterruptedException -> 0x0096 }
        L_0x0096:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "retry connect url: "
            r10.<init>(r11)
            r10.append(r1)
            java.lang.String r11 = ": "
            r10.append(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.bytedance.router.util.Logger.w(r9)
        L_0x00af:
            return r0
        L_0x00b0:
            if (r6 == 0) goto L_0x00b5
            r6.disconnect()
        L_0x00b5:
            int r2 = r0.errorCode
            if (r2 == r5) goto L_0x003e
            if (r1 >= r3) goto L_0x010e
            int r1 = r1 + 1
            int r2 = r1 * 500
            long r2 = (long) r2
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x00c3 }
        L_0x00c3:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "retry connect url: "
            r2.<init>(r3)
            goto L_0x00ef
        L_0x00cb:
            r10 = move-exception
            goto L_0x0103
        L_0x00cd:
            r2 = r6
            goto L_0x00d2
        L_0x00cf:
            r10 = move-exception
            r6 = r2
            goto L_0x0103
        L_0x00d2:
            r6 = -1
            r0.errorCode = r6     // Catch:{ all -> 0x00cf }
            if (r2 == 0) goto L_0x00da
            r2.disconnect()
        L_0x00da:
            int r2 = r0.errorCode
            if (r2 == r5) goto L_0x003e
            if (r1 >= r3) goto L_0x010e
            int r1 = r1 + 1
            int r2 = r1 * 500
            long r2 = (long) r2
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x00e8 }
        L_0x00e8:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "retry connect url: "
            r2.<init>(r3)
        L_0x00ef:
            r2.append(r1)
            java.lang.String r3 = ": "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            com.bytedance.router.util.Logger.w(r2)
            goto L_0x003e
        L_0x0103:
            if (r6 == 0) goto L_0x0108
            r6.disconnect()
        L_0x0108:
            int r11 = r0.errorCode
            if (r11 == r5) goto L_0x012f
            if (r1 < r3) goto L_0x010f
        L_0x010e:
            return r0
        L_0x010f:
            int r1 = r1 + r4
            int r11 = r1 * 500
            long r2 = (long) r11
            java.lang.Thread.sleep(r2)     // Catch:{ InterruptedException -> 0x0116 }
        L_0x0116:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r0 = "retry connect url: "
            r11.<init>(r0)
            r11.append(r1)
            java.lang.String r0 = ": "
            r11.append(r0)
            r11.append(r9)
            java.lang.String r9 = r11.toString()
            com.bytedance.router.util.Logger.w(r9)
        L_0x012f:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.router.net.NetClient.post(java.lang.String, java.util.Map, org.json.JSONObject):com.bytedance.router.net.NetResponse");
    }
}
