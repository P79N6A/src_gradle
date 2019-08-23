package com.ss.sys.ces;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public static int f78509a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static long f78510b = 3600;

    /* renamed from: c  reason: collision with root package name */
    public static long f78511c;

    /* JADX WARNING: Can't wrap try/catch for region: R(5:12|13|14|15|16) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x0088 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r8) {
        /*
            java.lang.Class<com.ss.sys.ces.c> r0 = com.ss.sys.ces.c.class
            monitor-enter(r0)
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x00aa }
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 / r3
            long r3 = f78511c     // Catch:{ all -> 0x00aa }
            r5 = 0
            long r3 = r1 - r3
            long r5 = f78510b     // Catch:{ all -> 0x00aa }
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x00a8
            r3 = 0
            com.ss.sys.ces.b.i = r3     // Catch:{ all -> 0x00aa }
            f78509a = r3     // Catch:{ all -> 0x00aa }
            f78511c = r1     // Catch:{ all -> 0x00aa }
        L_0x001c:
            r1 = 3
            if (r3 >= r1) goto L_0x00a8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "SETTINGS loop="
            r2.<init>(r4)     // Catch:{ all -> 0x00aa }
            r2.append(r3)     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "\tsettings="
            r2.append(r4)     // Catch:{ all -> 0x00aa }
            boolean r4 = com.ss.sys.ces.b.i     // Catch:{ all -> 0x00aa }
            r2.append(r4)     // Catch:{ all -> 0x00aa }
            java.lang.String r4 = "\tretry_time="
            r2.append(r4)     // Catch:{ all -> 0x00aa }
            int r4 = f78509a     // Catch:{ all -> 0x00aa }
            r2.append(r4)     // Catch:{ all -> 0x00aa }
            boolean r2 = com.ss.sys.ces.b.i     // Catch:{ all -> 0x00aa }
            if (r2 != 0) goto L_0x009a
            int r2 = f78509a     // Catch:{ all -> 0x00aa }
            if (r2 >= r1) goto L_0x009a
            com.ss.sys.ces.b.e r1 = new com.ss.sys.ces.b.e     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r2 = com.ss.sys.ces.b.f78490d     // Catch:{ Throwable -> 0x0088 }
            r1.<init>(r8, r2)     // Catch:{ Throwable -> 0x0088 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0088 }
            r2.<init>()     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.retrofit2.client.Header r4 = new com.bytedance.retrofit2.client.Header     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r5 = "Cookie"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r7 = "sessionid="
            r6.<init>(r7)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r7 = r1.f78505a     // Catch:{ Throwable -> 0x0088 }
            r6.append(r7)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r6 = r6.toString()     // Catch:{ Throwable -> 0x0088 }
            r4.<init>(r5, r6)     // Catch:{ Throwable -> 0x0088 }
            r2.add(r4)     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r4 = r1.f78507c     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.retrofit2.Retrofit r4 = com.bytedance.ttnet.utils.RetrofitUtils.getSsRetrofit(r4)     // Catch:{ Throwable -> 0x0088 }
            java.lang.Class<com.ss.sys.ces.b.c> r5 = com.ss.sys.ces.b.c.class
            java.lang.Object r4 = r4.create(r5)     // Catch:{ Throwable -> 0x0088 }
            com.ss.sys.ces.b.c r4 = (com.ss.sys.ces.b.c) r4     // Catch:{ Throwable -> 0x0088 }
            java.lang.String r5 = r1.f78507c     // Catch:{ Throwable -> 0x0088 }
            com.bytedance.retrofit2.Call r2 = r4.a(r5, r2)     // Catch:{ Throwable -> 0x0088 }
            com.ss.sys.ces.b.e$1 r4 = new com.ss.sys.ces.b.e$1     // Catch:{ Throwable -> 0x0088 }
            r4.<init>()     // Catch:{ Throwable -> 0x0088 }
            r2.enqueue(r4)     // Catch:{ Throwable -> 0x0088 }
            goto L_0x0094
        L_0x0088:
            com.ss.sys.ces.b.b r1 = new com.ss.sys.ces.b.b     // Catch:{ all -> 0x00aa }
            java.lang.String r2 = com.ss.sys.ces.b.f78490d     // Catch:{ all -> 0x00aa }
            r1.<init>(r8, r2)     // Catch:{ all -> 0x00aa }
            r2 = 0
            r4 = 2
            r1.a(r4, r4, r2)     // Catch:{ all -> 0x00aa }
        L_0x0094:
            int r1 = f78509a     // Catch:{ all -> 0x00aa }
            int r1 = r1 + 1
            f78509a = r1     // Catch:{ all -> 0x00aa }
        L_0x009a:
            int r3 = r3 + 1
            int r1 = r3 * 5000
            long r1 = (long) r1     // Catch:{ all -> 0x00aa }
            com.ss.a.b.f.a(r1)     // Catch:{ all -> 0x00aa }
            boolean r1 = com.ss.sys.ces.b.i     // Catch:{ all -> 0x00aa }
            if (r1 != 0) goto L_0x00a8
            goto L_0x001c
        L_0x00a8:
            monitor-exit(r0)
            return
        L_0x00aa:
            r8 = move-exception
            monitor-exit(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.sys.ces.c.a(android.content.Context):void");
    }
}
