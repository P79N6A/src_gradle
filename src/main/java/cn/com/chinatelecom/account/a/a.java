package cn.com.chinatelecom.account.a;

public final class a {
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x009c, code lost:
        if (r6 != null) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x009e, code lost:
        r6.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b5, code lost:
        if (r6 != null) goto L_0x009e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a6 A[SYNTHETIC, Splitter:B:32:0x00a6] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ab A[Catch:{ Exception -> 0x00ae }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b2 A[SYNTHETIC, Splitter:B:42:0x00b2] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r0 = ""
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2.<init>(r6)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.net.URLConnection r6 = r2.openConnection()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.lang.String r2 = "accept"
            java.lang.String r3 = "*/*"
            r6.setRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.lang.String r2 = "POST"
            r6.setRequestMethod(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2 = 1
            r6.setDoOutput(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r6.setDoInput(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2 = 5000(0x1388, float:7.006E-42)
            r6.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r6.setReadTimeout(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2 = 0
            r6.setUseCaches(r2)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.lang.String r2 = "Accept-Charset"
            java.lang.String r3 = "UTF-8"
            r6.addRequestProperty(r2, r3)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            boolean r2 = android.text.TextUtils.isEmpty(r7)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            if (r2 != 0) goto L_0x0058
            java.io.DataOutputStream r2 = new java.io.DataOutputStream     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.io.BufferedOutputStream r3 = new java.io.BufferedOutputStream     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.io.OutputStream r4 = r6.getOutputStream()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.lang.String r3 = "UTF-8"
            byte[] r7 = r7.getBytes(r3)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2.write(r7)     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2.flush()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2.close()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            goto L_0x005b
        L_0x0058:
            r6.connect()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
        L_0x005b:
            int r7 = r6.getResponseCode()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r7 != r2) goto L_0x0096
            java.io.InputStream r6 = r6.getInputStream()     // Catch:{ Throwable -> 0x00af, all -> 0x00a2 }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
            r7.<init>()     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
            r3.<init>(r6)     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
            r2.<init>(r3)     // Catch:{ Throwable -> 0x00b0, all -> 0x0091 }
        L_0x0076:
            java.lang.String r1 = r2.readLine()     // Catch:{ Throwable -> 0x008f, all -> 0x008c }
            if (r1 == 0) goto L_0x0085
            r7.append(r1)     // Catch:{ Throwable -> 0x008f, all -> 0x008c }
            java.lang.String r1 = "\n"
            r7.append(r1)     // Catch:{ Throwable -> 0x008f, all -> 0x008c }
            goto L_0x0076
        L_0x0085:
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x008f, all -> 0x008c }
            r0 = r7
            r1 = r2
            goto L_0x0097
        L_0x008c:
            r7 = move-exception
            r1 = r2
            goto L_0x0092
        L_0x008f:
            r1 = r2
            goto L_0x00b0
        L_0x0091:
            r7 = move-exception
        L_0x0092:
            r5 = r7
            r7 = r6
            r6 = r5
            goto L_0x00a4
        L_0x0096:
            r6 = r1
        L_0x0097:
            if (r1 == 0) goto L_0x009c
            r1.close()     // Catch:{ Exception -> 0x00b8 }
        L_0x009c:
            if (r6 == 0) goto L_0x00b8
        L_0x009e:
            r6.close()     // Catch:{ Exception -> 0x00b8 }
            goto L_0x00b8
        L_0x00a2:
            r6 = move-exception
            r7 = r1
        L_0x00a4:
            if (r1 == 0) goto L_0x00a9
            r1.close()     // Catch:{ Exception -> 0x00ae }
        L_0x00a9:
            if (r7 == 0) goto L_0x00ae
            r7.close()     // Catch:{ Exception -> 0x00ae }
        L_0x00ae:
            throw r6
        L_0x00af:
            r6 = r1
        L_0x00b0:
            if (r1 == 0) goto L_0x00b5
            r1.close()     // Catch:{ Exception -> 0x00b8 }
        L_0x00b5:
            if (r6 == 0) goto L_0x00b8
            goto L_0x009e
        L_0x00b8:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.com.chinatelecom.account.a.a.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
