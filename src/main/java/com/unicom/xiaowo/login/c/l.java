package com.unicom.xiaowo.login.c;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class l {
    private static String a(InputStream inputStream) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.close();
                    inputStream.close();
                    return new String(byteArrayOutputStream.toByteArray());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r3, java.util.HashMap r4, android.net.Network r5) {
        /*
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x0092, all -> 0x008e }
            r1.<init>(r3)     // Catch:{ Exception -> 0x0092, all -> 0x008e }
            if (r5 == 0) goto L_0x0015
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0092, all -> 0x008e }
            r2 = 21
            if (r3 < r2) goto L_0x0015
            java.net.URLConnection r3 = r5.openConnection(r1)     // Catch:{ Exception -> 0x0092, all -> 0x008e }
        L_0x0012:
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0092, all -> 0x008e }
            goto L_0x001a
        L_0x0015:
            java.net.URLConnection r3 = r1.openConnection()     // Catch:{ Exception -> 0x0092, all -> 0x008e }
            goto L_0x0012
        L_0x001a:
            r5 = 1
            r3.setDoInput(r5)     // Catch:{ Exception -> 0x008c }
            r3.setDoOutput(r5)     // Catch:{ Exception -> 0x008c }
            r1 = 0
            r3.setUseCaches(r1)     // Catch:{ Exception -> 0x008c }
            r3.setInstanceFollowRedirects(r5)     // Catch:{ Exception -> 0x008c }
            r5 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r5)     // Catch:{ Exception -> 0x008c }
            r3.setReadTimeout(r5)     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "GET"
            r3.setRequestMethod(r5)     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "Content-Type"
            java.lang.String r1 = "application/x-www-form-urlencoded"
            r3.setRequestProperty(r5, r1)     // Catch:{ Exception -> 0x008c }
            if (r4 == 0) goto L_0x005c
            java.util.Set r5 = r4.keySet()     // Catch:{ Exception -> 0x008c }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x008c }
        L_0x0046:
            boolean r1 = r5.hasNext()     // Catch:{ Exception -> 0x008c }
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x008c }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Exception -> 0x008c }
            java.lang.Object r2 = r4.get(r1)     // Catch:{ Exception -> 0x008c }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x008c }
            r3.setRequestProperty(r1, r2)     // Catch:{ Exception -> 0x008c }
            goto L_0x0046
        L_0x005c:
            java.lang.String r4 = "Connection"
            java.lang.String r5 = "close"
            r3.addRequestProperty(r4, r5)     // Catch:{ Exception -> 0x008c }
            r3.connect()     // Catch:{ Exception -> 0x008c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x008c }
            java.lang.String r5 = "getResponseCode:"
            r4.<init>(r5)     // Catch:{ Exception -> 0x008c }
            int r5 = r3.getResponseCode()     // Catch:{ Exception -> 0x008c }
            r4.append(r5)     // Catch:{ Exception -> 0x008c }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x008c }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x0085
            java.io.InputStream r4 = r3.getInputStream()     // Catch:{ Exception -> 0x008c }
            java.lang.String r4 = a(r4)     // Catch:{ Exception -> 0x008c }
            goto L_0x0086
        L_0x0085:
            r4 = r0
        L_0x0086:
            if (r3 == 0) goto L_0x008b
            r3.disconnect()
        L_0x008b:
            return r4
        L_0x008c:
            r4 = move-exception
            goto L_0x0095
        L_0x008e:
            r3 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x00aa
        L_0x0092:
            r3 = move-exception
            r4 = r3
            r3 = r0
        L_0x0095:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00a9 }
            java.lang.String r1 = "requestGet error!"
            r5.<init>(r1)     // Catch:{ all -> 0x00a9 }
            java.lang.String r4 = r4.getMessage()     // Catch:{ all -> 0x00a9 }
            r5.append(r4)     // Catch:{ all -> 0x00a9 }
            if (r3 == 0) goto L_0x00a8
            r3.disconnect()
        L_0x00a8:
            return r0
        L_0x00a9:
            r4 = move-exception
        L_0x00aa:
            if (r3 == 0) goto L_0x00af
            r3.disconnect()
        L_0x00af:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.c.l.a(java.lang.String, java.util.HashMap, android.net.Network):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00ac  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(java.lang.String r5, java.lang.String r6, java.util.HashMap r7) {
        /*
            r4 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x00b0, all -> 0x00a8 }
            r1.<init>(r5)     // Catch:{ Exception -> 0x00b0, all -> 0x00a8 }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x00b0, all -> 0x00a8 }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x00b0, all -> 0x00a8 }
            r2 = 1
            r1.setDoInput(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r1.setDoOutput(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r3 = 0
            r1.setUseCaches(r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r1.setInstanceFollowRedirects(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.lang.String r2 = "POST"
            r1.setRequestMethod(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r2 = 10000(0x2710, float:1.4013E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            com.unicom.xiaowo.login.c.m r2 = new com.unicom.xiaowo.login.c.m     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r2.<init>()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r1.setHostnameVerifier(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            if (r5 == 0) goto L_0x0043
            java.lang.String r2 = "token"
            boolean r5 = r5.contains(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            if (r5 != 0) goto L_0x0043
            java.lang.String r5 = "Content-Type"
            java.lang.String r2 = "application/json;charset=utf-8"
        L_0x003f:
            r1.setRequestProperty(r5, r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            goto L_0x0048
        L_0x0043:
            java.lang.String r5 = "Content-Type"
            java.lang.String r2 = "application/x-www-form-urlencoded"
            goto L_0x003f
        L_0x0048:
            java.lang.String r5 = "Connection"
            java.lang.String r2 = "close"
            r1.addRequestProperty(r5, r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            if (r7 == 0) goto L_0x006f
            java.util.Set r5 = r7.keySet()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
        L_0x0059:
            boolean r2 = r5.hasNext()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            if (r2 == 0) goto L_0x006f
            java.lang.Object r2 = r5.next()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.lang.Object r3 = r7.get(r2)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r1.setRequestProperty(r2, r3)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            goto L_0x0059
        L_0x006f:
            r1.connect()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            boolean r5 = android.text.TextUtils.isEmpty(r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            if (r5 != 0) goto L_0x008e
            java.io.DataOutputStream r5 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.io.OutputStream r7 = r1.getOutputStream()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r5.<init>(r7)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            byte[] r6 = r6.getBytes()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r5.write(r6)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r5.flush()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r5.close()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
        L_0x008e:
            int r5 = r1.getResponseCode()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            r6 = 200(0xc8, float:2.8E-43)
            if (r5 != r6) goto L_0x009f
            java.io.InputStream r5 = r1.getInputStream()     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            java.lang.String r5 = a(r5)     // Catch:{ Exception -> 0x00b1, all -> 0x00a6 }
            goto L_0x00a0
        L_0x009f:
            r5 = r0
        L_0x00a0:
            if (r1 == 0) goto L_0x00a5
            r1.disconnect()
        L_0x00a5:
            return r5
        L_0x00a6:
            r5 = move-exception
            goto L_0x00aa
        L_0x00a8:
            r5 = move-exception
            r1 = r0
        L_0x00aa:
            if (r1 == 0) goto L_0x00af
            r1.disconnect()
        L_0x00af:
            throw r5
        L_0x00b0:
            r1 = r0
        L_0x00b1:
            if (r1 == 0) goto L_0x00b6
            r1.disconnect()
        L_0x00b6:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unicom.xiaowo.login.c.l.a(java.lang.String, java.lang.String, java.util.HashMap):java.lang.String");
    }
}
