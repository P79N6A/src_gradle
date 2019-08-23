package com.ss.sys.a;

import android.content.Context;
import com.ss.sys.a.a.a;

public final class b implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private static int f78475a = 3;

    /* renamed from: b  reason: collision with root package name */
    private a f78476b;

    /* renamed from: c  reason: collision with root package name */
    private Context f78477c;

    public b(Context context, a aVar) {
        this.f78476b = aVar;
        this.f78477c = context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00ee, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:?, code lost:
        com.ss.sys.a.a.f78470b = 500;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f2, code lost:
        r0 = com.ss.sys.ces.b.a();
        r1 = new java.lang.StringBuilder("SS-");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0116, code lost:
        com.ss.sys.ces.b.a().reportNow("SS-" + com.ss.sys.a.a.f78470b);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012d, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:40:0x00f0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r1 = ""
            java.lang.String r2 = com.ss.a.a.a.f2370d
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0015
            java.lang.String r1 = com.ss.a.a.a.f2370d
            goto L_0x003a
        L_0x0015:
            int r2 = com.ss.a.a.a.f2367a
            if (r2 == 0) goto L_0x0038
            switch(r2) {
                case 2: goto L_0x002c;
                case 3: goto L_0x0020;
                case 4: goto L_0x001d;
                default: goto L_0x001c;
            }
        L_0x001c:
            goto L_0x003a
        L_0x001d:
            java.lang.String r1 = "http://10.2.197.212:8888"
            goto L_0x003a
        L_0x0020:
            int r1 = com.ss.a.a.a.f2368b
            r2 = 1233(0x4d1, float:1.728E-42)
            if (r1 == r2) goto L_0x0029
            java.lang.String r1 = "https://sdfp-va.byteoversea.com"
            goto L_0x003a
        L_0x0029:
            java.lang.String r1 = "https://sdfp-va.musical.ly"
            goto L_0x003a
        L_0x002c:
            int r1 = com.ss.a.a.a.f2368b
            r2 = 1180(0x49c, float:1.654E-42)
            if (r1 == r2) goto L_0x0035
            java.lang.String r1 = "https://sdfp-sg.byteoversea.com"
            goto L_0x003a
        L_0x0035:
            java.lang.String r1 = "https://sdfp-sg.tiktokv.com"
            goto L_0x003a
        L_0x0038:
            java.lang.String r1 = "https://sdfp.snssdk.com"
        L_0x003a:
            r2 = 500(0x1f4, float:7.0E-43)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f0 }
            r3.<init>()     // Catch:{ Throwable -> 0x00f0 }
            r3.append(r1)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r1 = "/v1/getInfo"
            r3.append(r1)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r1 = r3.toString()     // Catch:{ Throwable -> 0x00f0 }
            r3 = 301(0x12d, float:4.22E-43)
            android.content.Context r4 = r9.f78477c     // Catch:{ Throwable -> 0x00f0 }
            r5 = 0
            java.lang.Object r3 = com.ss.sys.ces.a.meta(r3, r4, r5)     // Catch:{ Throwable -> 0x00f0 }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00f0 }
            byte[] r3 = (byte[]) r3     // Catch:{ Throwable -> 0x00f0 }
            if (r3 == 0) goto L_0x00e6
            int r4 = r3.length     // Catch:{ Throwable -> 0x00f0 }
            if (r4 <= 0) goto L_0x00e6
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ Throwable -> 0x00f0 }
            r4.<init>()     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "os"
            java.lang.String r6 = "android"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "app_id"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00f0 }
            r6.<init>()     // Catch:{ Throwable -> 0x00f0 }
            long r7 = com.ss.sys.a.a.f78472d     // Catch:{ Throwable -> 0x00f0 }
            r6.append(r7)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x00f0 }
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "version"
            java.lang.String r6 = "1.0.3"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "version_code"
            java.lang.String r6 = "4"
            r4.put(r5, r6)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "time"
            r4.put(r5, r0)     // Catch:{ Throwable -> 0x00f0 }
            r0 = 0
            r5 = 0
        L_0x0093:
            int r6 = f78475a     // Catch:{ Throwable -> 0x00f0 }
            if (r0 >= r6) goto L_0x00d8
            java.lang.String r5 = com.ss.sys.a.b.c.a((java.lang.String) r1, (java.util.Map) r4, (byte[]) r3)     // Catch:{ Throwable -> 0x00f0 }
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch:{ Throwable -> 0x00f0 }
            r6.<init>(r5)     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r5 = "code"
            int r5 = r6.getInt(r5)     // Catch:{ Throwable -> 0x00f0 }
            if (r5 != r2) goto L_0x00b3
            int r0 = r0 + 1
            int r6 = r0 * 3
            int r6 = r6 * 1000
            long r6 = (long) r6     // Catch:{ Throwable -> 0x00f0 }
            com.ss.a.b.f.a(r6)     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x0093
        L_0x00b3:
            r0 = 200(0xc8, float:2.8E-43)
            r1 = 1
            if (r5 != r0) goto L_0x00c3
            com.ss.sys.a.a.f78471c = r1     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r0 = "token_id"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x00f0 }
            com.ss.sys.a.a.f78474f = r0     // Catch:{ Throwable -> 0x00f0 }
            goto L_0x00d8
        L_0x00c3:
            r0 = 202(0xca, float:2.83E-43)
            if (r5 != r0) goto L_0x00d8
            com.ss.sys.a.a.f78471c = r1     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r0 = "token_id"
            java.lang.String r0 = r6.getString(r0)     // Catch:{ Throwable -> 0x00f0 }
            com.ss.sys.a.a.f78474f = r0     // Catch:{ Throwable -> 0x00f0 }
            r1 = 302(0x12e, float:4.23E-43)
            android.content.Context r3 = r9.f78477c     // Catch:{ Throwable -> 0x00f0 }
            com.ss.sys.ces.a.meta(r1, r3, r0)     // Catch:{ Throwable -> 0x00f0 }
        L_0x00d8:
            com.ss.sys.a.a.f78470b = r5     // Catch:{ Throwable -> 0x00f0 }
            com.ss.sys.ces.b r0 = com.ss.sys.ces.b.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SS-"
            r1.<init>(r2)
            goto L_0x00fd
        L_0x00e6:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException     // Catch:{ Throwable -> 0x00f0 }
            java.lang.String r1 = "NullPointerException"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00f0 }
            throw r0     // Catch:{ Throwable -> 0x00f0 }
        L_0x00ee:
            r0 = move-exception
            goto L_0x0116
        L_0x00f0:
            com.ss.sys.a.a.f78470b = r2     // Catch:{ all -> 0x00ee }
            com.ss.sys.ces.b r0 = com.ss.sys.ces.b.a()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "SS-"
            r1.<init>(r2)
        L_0x00fd:
            int r2 = com.ss.sys.a.a.f78470b
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.reportNow(r1)
            com.ss.sys.a.a.a r0 = r9.f78476b
            if (r0 == 0) goto L_0x0115
            com.ss.sys.a.a.a r0 = r9.f78476b
            com.ss.sys.a.a.a()
            r0.a()
        L_0x0115:
            return
        L_0x0116:
            com.ss.sys.ces.b r1 = com.ss.sys.ces.b.a()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "SS-"
            r2.<init>(r3)
            int r3 = com.ss.sys.a.a.f78470b
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.reportNow(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.a.b.run():void");
    }
}
