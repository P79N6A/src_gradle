package com.monitor.cloudmessage.b.b.a;

public final class d {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.io.BufferedWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v7, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v12, resolved type: java.io.FileWriter} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v15, resolved type: java.io.FileWriter} */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:39|40|(2:42|43)|(2:46|47)|48|49|50|52) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:48:0x01d4 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:100:0x0224 A[Catch:{ IOException -> 0x0227 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01fc A[SYNTHETIC, Splitter:B:70:0x01fc] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0201 A[SYNTHETIC, Splitter:B:74:0x0201] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0206 A[SYNTHETIC, Splitter:B:78:0x0206] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x020b A[Catch:{ IOException -> 0x020e }] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0215 A[SYNTHETIC, Splitter:B:89:0x0215] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x021a A[SYNTHETIC, Splitter:B:93:0x021a] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x021f A[SYNTHETIC, Splitter:B:97:0x021f] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.io.File a(android.content.Context r23, org.json.JSONObject r24) {
        /*
            java.lang.String r0 = "domain"
            r1 = r24
            java.lang.String r0 = r1.optString(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L_0x0228
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r3 = "http://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x0041
            java.lang.String r3 = "https://"
            boolean r3 = r0.startsWith(r3)
            if (r3 != 0) goto L_0x0041
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "http://"
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "https://"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            goto L_0x0042
        L_0x0041:
            r3 = r2
        L_0x0042:
            java.net.URL r4 = new java.net.URL     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r4 = r4.getHost()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.io.File r5 = com.monitor.cloudmessage.e.b.a((android.content.Context) r23)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r5 = r5.getAbsolutePath()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r6.<init>()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r6.append(r5)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = java.io.File.separator     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r6.append(r7)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "%s.txt"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r9 = 0
            r8[r9] = r4     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = java.lang.String.format(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r6.append(r7)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "networkType"
            com.monitor.cloudmessage.e.d$a r8 = com.monitor.cloudmessage.e.d.e(r23)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r8 = com.monitor.cloudmessage.e.d.a((com.monitor.cloudmessage.e.d.a) r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "currentNativeIP"
            java.lang.String r8 = com.monitor.cloudmessage.e.d.a()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "localDNS"
            java.util.List r8 = com.monitor.cloudmessage.e.d.c(r23)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "localGateway"
            java.util.List r8 = com.monitor.cloudmessage.e.d.d(r23)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "uploadSpeed"
            android.content.pm.ApplicationInfo r8 = r23.getApplicationInfo()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            int r8 = r8.uid     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            long r8 = android.net.TrafficStats.getTotalTxBytes()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r10 = 1024(0x400, double:5.06E-321)
            long r8 = r8 / r10
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = -1
            int r16 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r16 != 0) goto L_0x00b5
            java.lang.String r8 = "UNSUPPORTED"
            goto L_0x00e2
        L_0x00b5:
            long r16 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            long r18 = com.monitor.cloudmessage.e.d.f27355b     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r20 = 0
            long r18 = r8 - r18
            long r18 = r18 * r12
            long r20 = com.monitor.cloudmessage.e.d.f27357d     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r22 = 0
            long r20 = r16 - r20
            long r18 = r18 / r20
            com.monitor.cloudmessage.e.d.f27357d = r16     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            com.monitor.cloudmessage.e.d.f27355b = r8     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r8.<init>()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r9 = java.lang.String.valueOf(r18)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r8.append(r9)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r9 = " KB/s"
            r8.append(r9)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
        L_0x00e2:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "downloadSpeed"
            android.content.pm.ApplicationInfo r8 = r23.getApplicationInfo()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            int r8 = r8.uid     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            long r8 = android.net.TrafficStats.getTotalRxBytes()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            long r8 = r8 / r10
            int r10 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r10 != 0) goto L_0x00f9
            java.lang.String r8 = "UNSUPPORTED"
            goto L_0x0125
        L_0x00f9:
            long r10 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            long r14 = com.monitor.cloudmessage.e.d.f27354a     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r16 = 0
            long r14 = r8 - r14
            long r14 = r14 * r12
            long r12 = com.monitor.cloudmessage.e.d.f27356c     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r16 = 0
            long r12 = r10 - r12
            long r14 = r14 / r12
            com.monitor.cloudmessage.e.d.f27356c = r10     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            com.monitor.cloudmessage.e.d.f27354a = r8     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r8.<init>()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r9 = java.lang.String.valueOf(r14)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r8.append(r9)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r9 = " KB/s"
            r8.append(r9)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
        L_0x0125:
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "cdn"
            r1.put(r7, r4)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r7 = "domainNameParse"
            java.util.List r8 = com.monitor.cloudmessage.e.d.a((java.lang.String) r4)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r1.put(r7, r8)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            boolean r0 = com.monitor.cloudmessage.e.d.a(r0, r1)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            if (r0 != 0) goto L_0x0141
            if (r3 == 0) goto L_0x0141
            com.monitor.cloudmessage.e.d.a(r3, r1)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
        L_0x0141:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r3 = "ping -c 5 "
            r0.<init>(r3)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r0.append(r4)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.Runtime r3 = java.lang.Runtime.getRuntime()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.lang.Process r0 = r3.exec(r0)     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            java.io.OutputStream r3 = r0.getOutputStream()     // Catch:{ Exception -> 0x020f, all -> 0x01f6 }
            r3.close()     // Catch:{ Exception -> 0x01f4, all -> 0x01ee }
            long r7 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x01f4, all -> 0x01ee }
            r4 = 0
            java.io.InputStream r9 = r0.getInputStream()     // Catch:{ Exception -> 0x01f4, all -> 0x01ee }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.io.InputStreamReader r11 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.lang.String r12 = "UTF8"
            r11.<init>(r9, r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r10.<init>(r11)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            org.json.JSONArray r11 = new org.json.JSONArray     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r11.<init>()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
        L_0x0178:
            java.lang.String r12 = r10.readLine()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            if (r12 == 0) goto L_0x019d
            r11.put(r12)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.lang.String r13 = "From"
            boolean r13 = r12.contains(r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            if (r13 != 0) goto L_0x0191
            java.lang.String r13 = "from"
            boolean r12 = r12.contains(r13)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            if (r12 == 0) goto L_0x0178
        L_0x0191:
            long r12 = java.lang.System.nanoTime()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r4 = 0
            long r12 = r12 - r7
            float r4 = (float) r12     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r12 = 1232348160(0x49742400, float:1000000.0)
            float r4 = r4 / r12
            goto L_0x0178
        L_0x019d:
            r0.destroy()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.lang.String r0 = "pingResults"
            r1.put(r0, r11)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.lang.String r0 = "elapsedTime"
            double r7 = (double) r4     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r1.put(r0, r7)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.io.File r0 = new java.io.File     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r0.<init>(r5)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            boolean r4 = r0.exists()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            if (r4 != 0) goto L_0x01b9
            r0.mkdirs()     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
        L_0x01b9:
            java.io.FileWriter r4 = new java.io.FileWriter     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            r4.<init>(r6)     // Catch:{ Exception -> 0x01eb, all -> 0x01e7 }
            java.io.BufferedWriter r5 = new java.io.BufferedWriter     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            r5.<init>(r4)     // Catch:{ Exception -> 0x01e5, all -> 0x01e2 }
            java.lang.String r0 = r1.toString()     // Catch:{ Exception -> 0x0213, all -> 0x01e0 }
            r5.write(r0)     // Catch:{ Exception -> 0x0213, all -> 0x01e0 }
            if (r3 == 0) goto L_0x01cf
            r3.close()     // Catch:{ IOException -> 0x01cf }
        L_0x01cf:
            if (r9 == 0) goto L_0x01d4
            r9.close()     // Catch:{ IOException -> 0x01d4 }
        L_0x01d4:
            r5.close()     // Catch:{ IOException -> 0x01da }
            r4.close()     // Catch:{ IOException -> 0x01da }
        L_0x01da:
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            return r0
        L_0x01e0:
            r0 = move-exception
            goto L_0x01f2
        L_0x01e2:
            r0 = move-exception
            r5 = r2
            goto L_0x01f2
        L_0x01e5:
            r5 = r2
            goto L_0x0213
        L_0x01e7:
            r0 = move-exception
            r4 = r2
            r5 = r4
            goto L_0x01f2
        L_0x01eb:
            r4 = r2
            r5 = r4
            goto L_0x0213
        L_0x01ee:
            r0 = move-exception
            r4 = r2
            r5 = r4
            r9 = r5
        L_0x01f2:
            r2 = r3
            goto L_0x01fa
        L_0x01f4:
            r4 = r2
            goto L_0x0211
        L_0x01f6:
            r0 = move-exception
            r4 = r2
            r5 = r4
            r9 = r5
        L_0x01fa:
            if (r2 == 0) goto L_0x01ff
            r2.close()     // Catch:{ IOException -> 0x01ff }
        L_0x01ff:
            if (r9 == 0) goto L_0x0204
            r9.close()     // Catch:{ IOException -> 0x0204 }
        L_0x0204:
            if (r5 == 0) goto L_0x0209
            r5.close()     // Catch:{ IOException -> 0x020e }
        L_0x0209:
            if (r4 == 0) goto L_0x020e
            r4.close()     // Catch:{ IOException -> 0x020e }
        L_0x020e:
            throw r0
        L_0x020f:
            r3 = r2
            r4 = r3
        L_0x0211:
            r5 = r4
            r9 = r5
        L_0x0213:
            if (r3 == 0) goto L_0x0218
            r3.close()     // Catch:{ IOException -> 0x0218 }
        L_0x0218:
            if (r9 == 0) goto L_0x021d
            r9.close()     // Catch:{ IOException -> 0x021d }
        L_0x021d:
            if (r5 == 0) goto L_0x0222
            r5.close()     // Catch:{ IOException -> 0x0227 }
        L_0x0222:
            if (r4 == 0) goto L_0x0227
            r4.close()     // Catch:{ IOException -> 0x0227 }
        L_0x0227:
            return r2
        L_0x0228:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.monitor.cloudmessage.b.b.a.d.a(android.content.Context, org.json.JSONObject):java.io.File");
    }
}
