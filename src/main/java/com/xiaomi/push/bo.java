package com.xiaomi.push;

public class bo {
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0098, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0099, code lost:
        r6 = r5;
        r5 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00a7, code lost:
        if (r1 != null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00b8, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c4, code lost:
        if (r1 == null) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00c6, code lost:
        r1.disconnect();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098 A[ExcHandler: all (r5v9 'th' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:25:0x007f] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00b3 A[SYNTHETIC, Splitter:B:51:0x00b3] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00b8 A[Catch:{ Exception -> 0x00bb }] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00c1 A[SYNTHETIC, Splitter:B:60:0x00c1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String a(java.lang.String r5, java.util.Map r6) {
        /*
            java.lang.String r0 = ""
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L_0x000c
        L_0x0008:
            java.lang.String r5 = ""
            goto L_0x00ca
        L_0x000c:
            java.net.URL r1 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0008 }
            r1.<init>(r5)     // Catch:{ MalformedURLException -> 0x0008 }
            r5 = 0
            java.lang.String r2 = r1.getProtocol()     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            if (r2 == 0) goto L_0x0029
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            javax.net.ssl.HttpsURLConnection r1 = (javax.net.ssl.HttpsURLConnection) r1     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            goto L_0x002f
        L_0x0029:
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00bc, all -> 0x00af }
        L_0x002f:
            r2 = 30000(0x7530, float:4.2039E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r2 = "GET"
            r1.setRequestMethod(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r2 = 0
            r1.setDoOutput(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r6 == 0) goto L_0x0066
            int r2 = r6.size()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r2 <= 0) goto L_0x0066
            java.util.Set r2 = r6.keySet()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
        L_0x0050:
            boolean r3 = r2.hasNext()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            if (r3 == 0) goto L_0x0066
            java.lang.Object r3 = r2.next()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.Object r4 = r6.get(r3)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r1.addRequestProperty(r3, r4)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            goto L_0x0050
        L_0x0066:
            r1.connect()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            int r6 = r1.getResponseCode()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r2 = 200(0xc8, float:2.8E-43)
            if (r6 != r2) goto L_0x00a0
            java.io.InputStreamReader r6 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r6.<init>(r2)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            r2.<init>(r6)     // Catch:{ Exception -> 0x00ac, all -> 0x00aa }
            java.lang.StringBuffer r5 = new java.lang.StringBuffer     // Catch:{ Exception -> 0x009c, all -> 0x0098 }
            r5.<init>()     // Catch:{ Exception -> 0x009c, all -> 0x0098 }
        L_0x0084:
            java.lang.String r6 = r2.readLine()     // Catch:{ Exception -> 0x009c, all -> 0x0098 }
            if (r6 == 0) goto L_0x008e
            r5.append(r6)     // Catch:{ Exception -> 0x009c, all -> 0x0098 }
            goto L_0x0084
        L_0x008e:
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x009c, all -> 0x0098 }
            r2.close()     // Catch:{ Exception -> 0x009d, all -> 0x0098 }
            r6 = r5
            r5 = r2
            goto L_0x00a2
        L_0x0098:
            r5 = move-exception
            r6 = r5
            r5 = r2
            goto L_0x00b1
        L_0x009c:
            r5 = r0
        L_0x009d:
            r6 = r5
            r5 = r2
            goto L_0x00bf
        L_0x00a0:
            java.lang.String r6 = ""
        L_0x00a2:
            if (r5 == 0) goto L_0x00a7
            r5.close()     // Catch:{ Exception -> 0x00c9 }
        L_0x00a7:
            if (r1 == 0) goto L_0x00c9
            goto L_0x00c6
        L_0x00aa:
            r6 = move-exception
            goto L_0x00b1
        L_0x00ac:
            java.lang.String r6 = ""
            goto L_0x00bf
        L_0x00af:
            r6 = move-exception
            r1 = r5
        L_0x00b1:
            if (r5 == 0) goto L_0x00b6
            r5.close()     // Catch:{ Exception -> 0x00bb }
        L_0x00b6:
            if (r1 == 0) goto L_0x00bb
            r1.disconnect()     // Catch:{ Exception -> 0x00bb }
        L_0x00bb:
            throw r6
        L_0x00bc:
            java.lang.String r6 = ""
            r1 = r5
        L_0x00bf:
            if (r5 == 0) goto L_0x00c4
            r5.close()     // Catch:{ Exception -> 0x00c9 }
        L_0x00c4:
            if (r1 == 0) goto L_0x00c9
        L_0x00c6:
            r1.disconnect()     // Catch:{ Exception -> 0x00c9 }
        L_0x00c9:
            r5 = r6
        L_0x00ca:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.bo.a(java.lang.String, java.util.Map):java.lang.String");
    }
}
