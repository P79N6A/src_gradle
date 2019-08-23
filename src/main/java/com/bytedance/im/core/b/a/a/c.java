package com.bytedance.im.core.b.a.a;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    private static String f20901a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile com.bytedance.im.core.b.a.c.c f20902b;

    /* JADX WARNING: type inference failed for: r8v1, types: [com.tencent.wcdb.database.SQLiteDatabase$CursorFactory] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.bytedance.im.core.b.a.c.a$1] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized com.bytedance.im.core.b.a.c.c a() {
        /*
            java.lang.Class<com.bytedance.im.core.b.a.a.c> r0 = com.bytedance.im.core.b.a.a.c.class
            monitor-enter(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ff }
            r1.<init>()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.a r2 = r2.f20879c     // Catch:{ Exception -> 0x00ff }
            long r2 = r2.a()     // Catch:{ Exception -> 0x00ff }
            r1.append(r2)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = "_im.db"
            r1.append(r2)     // Catch:{ Exception -> 0x00ff }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.b.a.c.c r2 = f20902b     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0036
            java.lang.String r2 = f20901a     // Catch:{ Exception -> 0x00ff }
            boolean r2 = r1.equals(r2)     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0036
            com.bytedance.im.core.b.a.c.c r2 = f20902b     // Catch:{ Exception -> 0x00ff }
            boolean r2 = r2.a()     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0036
            com.bytedance.im.core.b.a.c.c r1 = f20902b     // Catch:{ Exception -> 0x00ff }
            monitor-exit(r0)
            return r1
        L_0x0036:
            com.bytedance.im.core.b.a.c.c r2 = f20902b     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x004b
            com.bytedance.im.core.b.a.c.c r2 = f20902b     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x004b
            r2.b()     // Catch:{ Exception -> 0x0042 }
            goto L_0x004b
        L_0x0042:
            r2 = move-exception
            java.lang.String r3 = "close db"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r3, (java.lang.Throwable) r2)     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.c.d.a(r2)     // Catch:{ Exception -> 0x00ff }
        L_0x004b:
            com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.a r2 = r2.f20879c     // Catch:{ Exception -> 0x00ff }
            r2.g()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.e r2 = r2.b()     // Catch:{ Exception -> 0x00ff }
            boolean r2 = r2.f20899e     // Catch:{ Exception -> 0x00ff }
            if (r2 == 0) goto L_0x0086
            com.bytedance.im.core.a.c r2 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.e r2 = r2.b()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r2 = r2.x     // Catch:{ Exception -> 0x00ff }
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch:{ Exception -> 0x00ff }
            if (r2 != 0) goto L_0x0086
            com.bytedance.im.core.b.a.a.e r2 = new com.bytedance.im.core.b.a.a.e     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r3 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            android.app.Application r3 = r3.f20877a     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r4 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.e r4 = r4.b()     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r4.x     // Catch:{ Exception -> 0x00ff }
            r2.<init>(r3, r1, r4)     // Catch:{ Exception -> 0x00ff }
            goto L_0x0091
        L_0x0086:
            com.bytedance.im.core.b.a.a.b r2 = new com.bytedance.im.core.b.a.a.b     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r3 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            android.app.Application r3 = r3.f20877a     // Catch:{ Exception -> 0x00ff }
            r2.<init>(r3, r1)     // Catch:{ Exception -> 0x00ff }
        L_0x0091:
            com.bytedance.im.core.b.a.c.a.a r3 = r2.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.c r4 = com.bytedance.im.core.a.c.a()     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.a.e r4 = r4.b()     // Catch:{ Exception -> 0x00ff }
            boolean r4 = r4.f20899e     // Catch:{ Exception -> 0x00ff }
            r5 = 0
            if (r4 == 0) goto L_0x00d7
            com.bytedance.im.core.b.a.c.c$a r4 = r2.f20914c     // Catch:{ Exception -> 0x00ff }
            if (r4 == 0) goto L_0x00ab
            com.bytedance.im.core.b.a.c.a$1 r5 = new com.bytedance.im.core.b.a.c.a$1     // Catch:{ Exception -> 0x00ff }
            r5.<init>()     // Catch:{ Exception -> 0x00ff }
        L_0x00ab:
            r8 = r5
            java.lang.String r4 = r2.f20916e     // Catch:{ Exception -> 0x00ff }
            boolean r4 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Exception -> 0x00ff }
            if (r4 == 0) goto L_0x00c2
            com.bytedance.im.core.b.a.c.a.f r4 = new com.bytedance.im.core.b.a.c.a.f     // Catch:{ Exception -> 0x00ff }
            android.content.Context r5 = r2.f20912a     // Catch:{ Exception -> 0x00ff }
            java.lang.String r6 = r2.f20913b     // Catch:{ Exception -> 0x00ff }
            int r7 = r2.f20915d     // Catch:{ Exception -> 0x00ff }
            r4.<init>(r5, r6, r8, r7)     // Catch:{ Exception -> 0x00ff }
            r2.f20917f = r4     // Catch:{ Exception -> 0x00ff }
            goto L_0x00ed
        L_0x00c2:
            com.bytedance.im.core.b.a.c.a.f r10 = new com.bytedance.im.core.b.a.c.a.f     // Catch:{ Exception -> 0x00ff }
            android.content.Context r5 = r2.f20912a     // Catch:{ Exception -> 0x00ff }
            java.lang.String r6 = r2.f20913b     // Catch:{ Exception -> 0x00ff }
            java.lang.String r4 = r2.f20916e     // Catch:{ Exception -> 0x00ff }
            byte[] r7 = r4.getBytes()     // Catch:{ Exception -> 0x00ff }
            int r9 = r2.f20915d     // Catch:{ Exception -> 0x00ff }
            r4 = r10
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ Exception -> 0x00ff }
            r2.f20917f = r10     // Catch:{ Exception -> 0x00ff }
            goto L_0x00ed
        L_0x00d7:
            com.bytedance.im.core.b.a.c.c$a r4 = r2.f20914c     // Catch:{ Exception -> 0x00ff }
            if (r4 == 0) goto L_0x00e0
            com.bytedance.im.core.b.a.c.a$2 r5 = new com.bytedance.im.core.b.a.c.a$2     // Catch:{ Exception -> 0x00ff }
            r5.<init>()     // Catch:{ Exception -> 0x00ff }
        L_0x00e0:
            com.bytedance.im.core.b.a.c.a.e r4 = new com.bytedance.im.core.b.a.c.a.e     // Catch:{ Exception -> 0x00ff }
            android.content.Context r6 = r2.f20912a     // Catch:{ Exception -> 0x00ff }
            java.lang.String r7 = r2.f20913b     // Catch:{ Exception -> 0x00ff }
            int r8 = r2.f20915d     // Catch:{ Exception -> 0x00ff }
            r4.<init>(r6, r7, r5, r8)     // Catch:{ Exception -> 0x00ff }
            r2.f20917f = r4     // Catch:{ Exception -> 0x00ff }
        L_0x00ed:
            com.bytedance.im.core.b.a.c.a.a r4 = r2.f20917f     // Catch:{ Exception -> 0x00ff }
            r4.a((com.bytedance.im.core.b.a.c.a.a) r3)     // Catch:{ Exception -> 0x00ff }
            f20901a = r1     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.b.a.c.a.a r1 = r2.f20917f     // Catch:{ Exception -> 0x00ff }
            com.bytedance.im.core.b.a.c.c r1 = r1.b()     // Catch:{ Exception -> 0x00ff }
            f20902b = r1     // Catch:{ Exception -> 0x00ff }
            goto L_0x0108
        L_0x00fd:
            r1 = move-exception
            goto L_0x010c
        L_0x00ff:
            r1 = move-exception
            java.lang.String r2 = "getIMDB"
            com.bytedance.im.core.b.e.d.a((java.lang.String) r2, (java.lang.Throwable) r1)     // Catch:{ all -> 0x00fd }
            com.bytedance.im.core.c.d.a(r1)     // Catch:{ all -> 0x00fd }
        L_0x0108:
            com.bytedance.im.core.b.a.c.c r1 = f20902b     // Catch:{ all -> 0x00fd }
            monitor-exit(r0)
            return r1
        L_0x010c:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.im.core.b.a.a.c.a():com.bytedance.im.core.b.a.c.c");
    }
}
