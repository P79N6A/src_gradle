package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.channel.commonutils.logger.b;
import com.xiaomi.push.service.XMJobService;

public final class ga {

    /* renamed from: a  reason: collision with root package name */
    private static int f82082a = 0;

    /* renamed from: a  reason: collision with other field name */
    private static a f406a;

    /* renamed from: a  reason: collision with other field name */
    private static final String f407a = XMJobService.class.getCanonicalName();

    interface a {
        void a();

        void a(boolean z);

        /* renamed from: a  reason: collision with other method in class */
        boolean m319a();
    }

    public static void a() {
        synchronized (ga.class) {
            try {
                if (f406a != null) {
                    f406a.a();
                }
            } catch (Throwable th) {
                Class<ga> cls = ga.class;
                throw th;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005d, code lost:
        if (f407a.equals(java.lang.Class.forName(r5.name).getSuperclass().getCanonicalName()) != false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0063, code lost:
        r1 = r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.content.Context r8) {
        /*
            android.content.Context r8 = r8.getApplicationContext()
            java.lang.String r0 = "com.xiaomi.xmsf"
            java.lang.String r1 = r8.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0018
            com.xiaomi.push.gb r0 = new com.xiaomi.push.gb
            r0.<init>(r8)
        L_0x0015:
            f406a = r0
            return
        L_0x0018:
            android.content.pm.PackageManager r0 = r8.getPackageManager()
            r1 = 1
            r2 = 0
            java.lang.String r3 = r8.getPackageName()     // Catch:{ Exception -> 0x007e }
            r4 = 4
            android.content.pm.PackageInfo r0 = r0.getPackageInfo(r3, r4)     // Catch:{ Exception -> 0x007e }
            android.content.pm.ServiceInfo[] r3 = r0.services     // Catch:{ Exception -> 0x007e }
            if (r3 == 0) goto L_0x007c
            android.content.pm.ServiceInfo[] r0 = r0.services     // Catch:{ Exception -> 0x007e }
            int r3 = r0.length     // Catch:{ Exception -> 0x007e }
            r4 = 0
        L_0x002f:
            if (r4 >= r3) goto L_0x0063
            r5 = r0[r4]
            java.lang.String r6 = "android.permission.BIND_JOB_SERVICE"
            java.lang.String r7 = r5.permission     // Catch:{ Exception -> 0x007e }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x007e }
            if (r6 == 0) goto L_0x0065
            java.lang.String r6 = f407a     // Catch:{ Exception -> 0x007e }
            java.lang.String r7 = r5.name     // Catch:{ Exception -> 0x007e }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x007e }
            if (r6 == 0) goto L_0x0049
        L_0x0047:
            r2 = 1
            goto L_0x0061
        L_0x0049:
            java.lang.String r6 = r5.name     // Catch:{ Exception -> 0x0060 }
            java.lang.Class r6 = java.lang.Class.forName(r6)     // Catch:{ Exception -> 0x0060 }
            java.lang.String r7 = f407a     // Catch:{ Exception -> 0x0060 }
            java.lang.Class r6 = r6.getSuperclass()     // Catch:{ Exception -> 0x0060 }
            java.lang.String r6 = r6.getCanonicalName()     // Catch:{ Exception -> 0x0060 }
            boolean r6 = r7.equals(r6)     // Catch:{ Exception -> 0x0060 }
            if (r6 == 0) goto L_0x0061
            goto L_0x0047
        L_0x0060:
        L_0x0061:
            if (r2 != r1) goto L_0x0065
        L_0x0063:
            r1 = r2
            goto L_0x0095
        L_0x0065:
            java.lang.String r6 = f407a     // Catch:{ Exception -> 0x007e }
            java.lang.String r7 = r5.name     // Catch:{ Exception -> 0x007e }
            boolean r6 = r6.equals(r7)     // Catch:{ Exception -> 0x007e }
            if (r6 == 0) goto L_0x0079
            java.lang.String r6 = "android.permission.BIND_JOB_SERVICE"
            java.lang.String r5 = r5.permission     // Catch:{ Exception -> 0x007e }
            boolean r5 = r6.equals(r5)     // Catch:{ Exception -> 0x007e }
            if (r5 != 0) goto L_0x0095
        L_0x0079:
            int r4 = r4 + 1
            goto L_0x002f
        L_0x007c:
            r1 = 0
            goto L_0x0095
        L_0x007e:
            r0 = move-exception
            r1 = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "check service err : "
            r2.<init>(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.xiaomi.channel.commonutils.logger.b.a((java.lang.String) r0)
        L_0x0095:
            if (r1 != 0) goto L_0x00be
            boolean r0 = com.xiaomi.push.u.a((android.content.Context) r8)
            if (r0 != 0) goto L_0x009e
            goto L_0x00be
        L_0x009e:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Should export service: "
            r0.<init>(r1)
            java.lang.String r1 = f407a
            r0.append(r1)
            java.lang.String r1 = " with permission android.permission.BIND_JOB_SERVICE"
            r0.append(r1)
            java.lang.String r1 = " in AndroidManifest.xml file"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r8.<init>(r0)
            throw r8
        L_0x00be:
            com.xiaomi.push.gb r0 = new com.xiaomi.push.gb
            r0.<init>(r8)
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ga.a(android.content.Context):void");
    }

    public static void a(Context context, int i) {
        synchronized (ga.class) {
            try {
                int i2 = f82082a;
                if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
                    if (i == 2) {
                        f82082a = 2;
                    } else {
                        f82082a = 0;
                    }
                }
                if (i2 != f82082a && f82082a == 2) {
                    a();
                    f406a = new gd(context);
                }
            } catch (Throwable th) {
                Class<ga> cls = ga.class;
                throw th;
            }
        }
    }

    public static void a(boolean z) {
        synchronized (ga.class) {
            try {
                if (f406a == null) {
                    b.a("timer is not initialized");
                } else {
                    f406a.a(z);
                }
            } catch (Throwable th) {
                Class<ga> cls = ga.class;
                throw th;
            }
        }
    }

    /* renamed from: a  reason: collision with other method in class */
    public static boolean m318a() {
        boolean a2;
        synchronized (ga.class) {
            try {
                a2 = f406a == null ? false : f406a.a();
            } catch (Throwable th) {
                Class<ga> cls = ga.class;
                throw th;
            }
        }
        return a2;
    }
}
