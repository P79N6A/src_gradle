package com.umeng.analytics.social;

public abstract class b {
    /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(java.io.InputStream r5) {
        /*
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r5)
            r2 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r1, r2)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        L_0x0011:
            r2 = 0
            java.lang.String r3 = r0.readLine()     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            if (r3 == 0) goto L_0x002d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            r4.<init>()     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            r4.append(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            java.lang.String r3 = "\n"
            r4.append(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            java.lang.String r3 = r4.toString()     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            r1.append(r3)     // Catch:{ IOException -> 0x003c, all -> 0x0036 }
            goto L_0x0011
        L_0x002d:
            r5.close()     // Catch:{ IOException -> 0x0035 }
            java.lang.String r5 = r1.toString()
            return r5
        L_0x0035:
            return r2
        L_0x0036:
            r0 = move-exception
            r5.close()     // Catch:{ IOException -> 0x003b }
            throw r0
        L_0x003b:
            return r2
        L_0x003c:
            r5.close()     // Catch:{ IOException -> 0x003f }
        L_0x003f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.social.b.a(java.io.InputStream):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String a(java.lang.String r6) {
        /*
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0.nextInt(r1)
            r1 = 0
            java.lang.String r2 = "line.separator"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            int r3 = r6.length()     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            r4 = 1
            if (r3 > r4) goto L_0x002e
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            r6.<init>()     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            r6.append(r0)     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            java.lang.String r0 = ":  Invalid baseUrl."
            r6.append(r0)     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            com.umeng.analytics.pro.by.e((java.lang.String) r6)     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            return r1
        L_0x002e:
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            r3.<init>(r6)     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0126, all -> 0x011e }
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4 = 20000(0x4e20, float:2.8026E-41)
            r3.setReadTimeout(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = "GET"
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = android.os.Build.VERSION.SDK     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r5 = 8
            if (r4 >= r5) goto L_0x0059
            java.lang.String r4 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r4, r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
        L_0x0059:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r5 = ": GET_URL: "
            r4.append(r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            com.umeng.analytics.pro.by.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            int r4 = r3.getResponseCode()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r5 = 200(0xc8, float:2.8E-43)
            if (r4 != r5) goto L_0x00ff
            java.io.InputStream r6 = r3.getInputStream()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = "Content-Encoding"
            java.lang.String r4 = r3.getHeaderField(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r5 != 0) goto L_0x00aa
            java.lang.String r5 = "gzip"
            boolean r5 = r4.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r5 == 0) goto L_0x00aa
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r5 = "  Use GZIPInputStream get data...."
            r4.append(r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            com.umeng.analytics.pro.by.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.util.zip.GZIPInputStream r4 = new java.util.zip.GZIPInputStream     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            goto L_0x00d3
        L_0x00aa:
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r5 != 0) goto L_0x00d2
            java.lang.String r5 = "deflate"
            boolean r4 = r4.equalsIgnoreCase(r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r4 == 0) goto L_0x00d2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r5 = "  Use InflaterInputStream get data...."
            r4.append(r5)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            com.umeng.analytics.pro.by.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.util.zip.InflaterInputStream r4 = new java.util.zip.InflaterInputStream     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>(r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            goto L_0x00d3
        L_0x00d2:
            r4 = r6
        L_0x00d3:
            java.lang.String r6 = a((java.io.InputStream) r4)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.<init>()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r0 = ":  response: "
            r4.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r2)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r4.append(r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            com.umeng.analytics.pro.by.c((java.lang.String) r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r6 != 0) goto L_0x00f9
            if (r3 == 0) goto L_0x00f8
            r3.disconnect()
        L_0x00f8:
            return r1
        L_0x00f9:
            if (r3 == 0) goto L_0x00fe
            r3.disconnect()
        L_0x00fe:
            return r6
        L_0x00ff:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r2.<init>()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r2.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r0 = ":  Failed to get message."
            r2.append(r0)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            r2.append(r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            java.lang.String r6 = r2.toString()     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            com.umeng.analytics.pro.by.c((java.lang.String) r6)     // Catch:{ Exception -> 0x0127, all -> 0x011c }
            if (r3 == 0) goto L_0x011b
            r3.disconnect()
        L_0x011b:
            return r1
        L_0x011c:
            r6 = move-exception
            goto L_0x0120
        L_0x011e:
            r6 = move-exception
            r3 = r1
        L_0x0120:
            if (r3 == 0) goto L_0x0125
            r3.disconnect()
        L_0x0125:
            throw r6
        L_0x0126:
            r3 = r1
        L_0x0127:
            if (r3 == 0) goto L_0x012c
            r3.disconnect()
        L_0x012c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.social.b.a(java.lang.String):java.lang.String");
    }

    /* JADX WARNING: Removed duplicated region for block: B:35:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0127  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    protected static java.lang.String a(java.lang.String r7, java.lang.String r8) {
        /*
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            r1 = 1000(0x3e8, float:1.401E-42)
            int r0 = r0.nextInt(r1)
            r1 = 0
            java.lang.String r2 = "line.separator"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch:{ Exception -> 0x0124, all -> 0x011c }
            java.net.URL r3 = new java.net.URL     // Catch:{ Exception -> 0x0124, all -> 0x011c }
            r3.<init>(r7)     // Catch:{ Exception -> 0x0124, all -> 0x011c }
            java.net.URLConnection r3 = r3.openConnection()     // Catch:{ Exception -> 0x0124, all -> 0x011c }
            java.net.HttpURLConnection r3 = (java.net.HttpURLConnection) r3     // Catch:{ Exception -> 0x0124, all -> 0x011c }
            r4 = 10000(0x2710, float:1.4013E-41)
            r3.setConnectTimeout(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4 = 20000(0x4e20, float:2.8026E-41)
            r3.setReadTimeout(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4 = 1
            r3.setDoOutput(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r3.setDoInput(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4 = 0
            r3.setUseCaches(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = "POST"
            r3.setRequestMethod(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r5 = ": POST_URL: "
            r4.append(r5)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.append(r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            com.umeng.analytics.pro.by.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = android.os.Build.VERSION.SDK     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r5 = 8
            if (r4 >= r5) goto L_0x005f
            java.lang.String r4 = "http.keepAlive"
            java.lang.String r5 = "false"
            java.lang.System.setProperty(r4, r5)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
        L_0x005f:
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            if (r4 != 0) goto L_0x00ab
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r5 = ": POST_BODY: "
            r4.append(r5)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.append(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            com.umeng.analytics.pro.by.c((java.lang.String) r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r6 = "data="
            r5.<init>(r6)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r5.append(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r8 = r5.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4.add(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.io.OutputStream r8 = r3.getOutputStream()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r4 = java.net.URLEncoder.encode(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            byte[] r4 = r4.getBytes()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.write(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.flush()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.close()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
        L_0x00ab:
            int r8 = r3.getResponseCode()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r4 = 200(0xc8, float:2.8E-43)
            if (r8 != r4) goto L_0x00fd
            java.io.InputStream r7 = r3.getInputStream()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r8 = "Content-Encoding"
            java.lang.String r8 = r3.getHeaderField(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            boolean r4 = android.text.TextUtils.isEmpty(r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            if (r4 != 0) goto L_0x00d1
            java.lang.String r4 = "gzip"
            boolean r8 = r8.equalsIgnoreCase(r4)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            if (r8 == 0) goto L_0x00d1
            java.util.zip.InflaterInputStream r8 = new java.util.zip.InflaterInputStream     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.<init>(r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r7 = r8
        L_0x00d1:
            java.lang.String r7 = a((java.io.InputStream) r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r0 = ":  response: "
            r8.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.append(r2)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.append(r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            com.umeng.analytics.pro.by.c((java.lang.String) r8)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            if (r7 != 0) goto L_0x00f7
            if (r3 == 0) goto L_0x00f6
            r3.disconnect()
        L_0x00f6:
            return r1
        L_0x00f7:
            if (r3 == 0) goto L_0x00fc
            r3.disconnect()
        L_0x00fc:
            return r7
        L_0x00fd:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.<init>()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r0 = ":  Failed to send message."
            r8.append(r0)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            r8.append(r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            java.lang.String r7 = r8.toString()     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            com.umeng.analytics.pro.by.e((java.lang.String) r7)     // Catch:{ Exception -> 0x0125, all -> 0x011a }
            if (r3 == 0) goto L_0x0119
            r3.disconnect()
        L_0x0119:
            return r1
        L_0x011a:
            r7 = move-exception
            goto L_0x011e
        L_0x011c:
            r7 = move-exception
            r3 = r1
        L_0x011e:
            if (r3 == 0) goto L_0x0123
            r3.disconnect()
        L_0x0123:
            throw r7
        L_0x0124:
            r3 = r1
        L_0x0125:
            if (r3 == 0) goto L_0x012a
            r3.disconnect()
        L_0x012a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.umeng.analytics.social.b.a(java.lang.String, java.lang.String):java.lang.String");
    }
}
