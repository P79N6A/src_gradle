package com.alibaba.sdk.android.httpdns;

import java.util.concurrent.Callable;

public class m implements Callable<String[]> {

    /* renamed from: d  reason: collision with root package name */
    private int f5111d;

    public m(int i) {
        this.f5111d = i;
    }

    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v1, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v3 */
    /* JADX WARNING: type inference failed for: r0v6, types: [java.net.HttpURLConnection] */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: type inference failed for: r0v10 */
    /* JADX WARNING: type inference failed for: r0v11 */
    /* JADX WARNING: type inference failed for: r0v13 */
    /* JADX WARNING: type inference failed for: r0v18 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e5 A[Catch:{ all -> 0x0101 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00f0  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00f5 A[SYNTHETIC, Splitter:B:57:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00fa A[Catch:{ IOException -> 0x00c4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x010c A[SYNTHETIC, Splitter:B:69:0x010c] */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x0114 A[Catch:{ IOException -> 0x0110 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] call() {
        /*
            r7 = this;
            r0 = 0
            com.alibaba.sdk.android.httpdns.o r1 = com.alibaba.sdk.android.httpdns.o.a()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.lang.String r1 = r1.f()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            if (r1 == 0) goto L_0x00b7
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00d4, all -> 0x00d0 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            boolean r2 = r1 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            if (r2 == 0) goto L_0x002d
            r2 = r1
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            com.alibaba.sdk.android.httpdns.m$1 r3 = new com.alibaba.sdk.android.httpdns.m$1     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r3.<init>()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r2.setHostnameVerifier(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
        L_0x002d:
            int r2 = r1.getResponseCode()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0064
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.String r3 = "response code is "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r2.append(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.String r3 = " expect 200"
            r2.append(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            com.alibaba.sdk.android.httpdns.g.f(r2)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            com.alibaba.sdk.android.httpdns.o r2 = com.alibaba.sdk.android.httpdns.o.a()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            com.alibaba.sdk.android.httpdns.f r3 = new com.alibaba.sdk.android.httpdns.f     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            int r4 = r1.getResponseCode()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.lang.String r5 = ""
            r3.<init>(r4, r5)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r2.b(r3)     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            r3 = r0
            goto L_0x00b9
        L_0x0064:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00b2, all -> 0x00ae }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a0 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00a7, all -> 0x00a0 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x00a7, all -> 0x00a0 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00a7, all -> 0x00a0 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            r0.<init>()     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
        L_0x0079:
            java.lang.String r4 = r3.readLine()     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            if (r4 == 0) goto L_0x0083
            r0.append(r4)     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            goto L_0x0079
        L_0x0083:
            com.alibaba.sdk.android.httpdns.p r4 = new com.alibaba.sdk.android.httpdns.p     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            java.lang.String r0 = r0.toString()     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            com.alibaba.sdk.android.httpdns.o r0 = com.alibaba.sdk.android.httpdns.o.a()     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            r0.a((com.alibaba.sdk.android.httpdns.p) r4)     // Catch:{ Exception -> 0x009a, all -> 0x0095 }
            r0 = r2
            goto L_0x00b9
        L_0x0095:
            r0 = move-exception
            r6 = r2
            r2 = r0
            goto L_0x0104
        L_0x009a:
            r0 = move-exception
            r6 = r2
            r2 = r0
            r0 = r1
            r1 = r6
            goto L_0x00d7
        L_0x00a0:
            r3 = move-exception
            r6 = r3
            r3 = r0
            r0 = r2
            r2 = r6
            goto L_0x0105
        L_0x00a7:
            r3 = move-exception
            r6 = r3
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = r6
            goto L_0x00d7
        L_0x00ae:
            r2 = move-exception
            r3 = r0
            goto L_0x0105
        L_0x00b2:
            r2 = move-exception
            r3 = r0
            r0 = r1
            r1 = r3
            goto L_0x00d7
        L_0x00b7:
            r1 = r0
            r3 = r1
        L_0x00b9:
            if (r1 == 0) goto L_0x00be
            r1.disconnect()
        L_0x00be:
            if (r0 == 0) goto L_0x00c6
            r0.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00c6
        L_0x00c4:
            r0 = move-exception
            goto L_0x00cc
        L_0x00c6:
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x00c4 }
            goto L_0x00fd
        L_0x00cc:
            com.alibaba.sdk.android.httpdns.g.a(r0)
            goto L_0x00fd
        L_0x00d0:
            r2 = move-exception
            r1 = r0
            r3 = r1
            goto L_0x0105
        L_0x00d4:
            r2 = move-exception
            r1 = r0
            r3 = r1
        L_0x00d7:
            com.alibaba.sdk.android.httpdns.g.a(r2)     // Catch:{ all -> 0x0101 }
            com.alibaba.sdk.android.httpdns.o r4 = com.alibaba.sdk.android.httpdns.o.a()     // Catch:{ all -> 0x0101 }
            r4.b(r2)     // Catch:{ all -> 0x0101 }
            int r2 = r7.f5111d     // Catch:{ all -> 0x0101 }
            if (r2 <= 0) goto L_0x00ee
            int r2 = r7.f5111d     // Catch:{ all -> 0x0101 }
            int r2 = r2 + -1
            r7.f5111d = r2     // Catch:{ all -> 0x0101 }
            r7.call()     // Catch:{ all -> 0x0101 }
        L_0x00ee:
            if (r0 == 0) goto L_0x00f3
            r0.disconnect()
        L_0x00f3:
            if (r1 == 0) goto L_0x00f8
            r1.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00f8:
            if (r3 == 0) goto L_0x00fd
            r3.close()     // Catch:{ IOException -> 0x00c4 }
        L_0x00fd:
            r0 = 0
            java.lang.String[] r0 = new java.lang.String[r0]
            return r0
        L_0x0101:
            r2 = move-exception
            r6 = r1
            r1 = r0
        L_0x0104:
            r0 = r6
        L_0x0105:
            if (r1 == 0) goto L_0x010a
            r1.disconnect()
        L_0x010a:
            if (r0 == 0) goto L_0x0112
            r0.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x0112
        L_0x0110:
            r0 = move-exception
            goto L_0x0118
        L_0x0112:
            if (r3 == 0) goto L_0x011b
            r3.close()     // Catch:{ IOException -> 0x0110 }
            goto L_0x011b
        L_0x0118:
            com.alibaba.sdk.android.httpdns.g.a(r0)
        L_0x011b:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.m.call():java.lang.String[]");
    }
}
