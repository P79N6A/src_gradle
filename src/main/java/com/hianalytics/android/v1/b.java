package com.hianalytics.android.v1;

import javax.net.ssl.HttpsURLConnection;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static HttpsURLConnection f24916a;

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0081 A[SYNTHETIC, Splitter:B:30:0x0081] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0095 A[SYNTHETIC, Splitter:B:39:0x0095] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x009f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(java.lang.String r5, byte[] r6) {
        /*
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            r2.<init>(r5)     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            java.net.URLConnection r5 = r2.openConnection()     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch:{ IOException -> 0x006c, all -> 0x0069 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ IOException -> 0x0067 }
            java.lang.String r2 = "POST"
            r5.setRequestMethod(r2)     // Catch:{ IOException -> 0x0067 }
            r2 = 5000(0x1388, float:7.006E-42)
            r5.setConnectTimeout(r2)     // Catch:{ IOException -> 0x0067 }
            r2 = 1
            r5.setDoOutput(r2)     // Catch:{ IOException -> 0x0067 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded; charset=UTF-8"
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0067 }
            java.lang.String r3 = "Content-Length"
            int r4 = r6.length     // Catch:{ IOException -> 0x0067 }
            java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ IOException -> 0x0067 }
            r5.setRequestProperty(r3, r4)     // Catch:{ IOException -> 0x0067 }
            java.io.OutputStream r3 = r5.getOutputStream()     // Catch:{ IOException -> 0x0067 }
            r3.write(r6)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r3.flush()     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            int r6 = r5.getResponseCode()     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            java.lang.String r1 = "connHttp.getResponseCode() = "
            java.lang.String r4 = java.lang.String.valueOf(r6)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r1.concat(r4)     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ IOException -> 0x0064, all -> 0x0061 }
            r1 = 200(0xc8, float:2.8E-43)
            if (r6 != r1) goto L_0x004e
            r0 = 1
        L_0x004e:
            if (r3 == 0) goto L_0x0058
            r3.close()     // Catch:{ IOException -> 0x0054 }
            goto L_0x0058
        L_0x0054:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x0058:
            if (r5 == 0) goto L_0x0060
            r5.disconnect()
            com.hianalytics.android.a.a.a.h()
        L_0x0060:
            return r0
        L_0x0061:
            r6 = move-exception
            r1 = r3
            goto L_0x0093
        L_0x0064:
            r6 = move-exception
            r1 = r3
            goto L_0x006e
        L_0x0067:
            r6 = move-exception
            goto L_0x006e
        L_0x0069:
            r6 = move-exception
            r5 = r1
            goto L_0x0093
        L_0x006c:
            r6 = move-exception
            r5 = r1
        L_0x006e:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0092 }
            java.lang.String r3 = "connHttp error:"
            r2.<init>(r3)     // Catch:{ all -> 0x0092 }
            java.lang.String r6 = r6.getMessage()     // Catch:{ all -> 0x0092 }
            r2.append(r6)     // Catch:{ all -> 0x0092 }
            com.hianalytics.android.a.a.a.h()     // Catch:{ all -> 0x0092 }
            if (r1 == 0) goto L_0x0089
            r1.close()     // Catch:{ IOException -> 0x0085 }
            goto L_0x0089
        L_0x0085:
            r6 = move-exception
            com.google.a.a.a.a.a.a.b(r6)
        L_0x0089:
            if (r5 == 0) goto L_0x0091
            r5.disconnect()
            com.hianalytics.android.a.a.a.h()
        L_0x0091:
            return r0
        L_0x0092:
            r6 = move-exception
        L_0x0093:
            if (r1 == 0) goto L_0x009d
            r1.close()     // Catch:{ IOException -> 0x0099 }
            goto L_0x009d
        L_0x0099:
            r0 = move-exception
            com.google.a.a.a.a.a.a.b(r0)
        L_0x009d:
            if (r5 == 0) goto L_0x00a5
            r5.disconnect()
            com.hianalytics.android.a.a.a.h()
        L_0x00a5:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.hianalytics.android.v1.b.a(java.lang.String, byte[]):boolean");
    }
}
