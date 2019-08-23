package com.tencent.bugly.proguard;

import android.content.Context;
import java.io.File;
import java.text.SimpleDateFormat;

public final class y {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f79542a = true;

    /* renamed from: b  reason: collision with root package name */
    private static SimpleDateFormat f79543b = null;

    /* renamed from: c  reason: collision with root package name */
    private static int f79544c = 5120;

    /* renamed from: d  reason: collision with root package name */
    private static StringBuilder f79545d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static StringBuilder f79546e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static boolean f79547f;
    /* access modifiers changed from: private */
    public static a g;
    private static String h;
    private static String i;
    private static Context j;
    /* access modifiers changed from: private */
    public static String k;
    private static boolean l;
    private static int m;
    /* access modifiers changed from: private */
    public static final Object n = new Object();

    public static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public boolean f79549a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public File f79550b;

        /* renamed from: c  reason: collision with root package name */
        private String f79551c;

        /* renamed from: d  reason: collision with root package name */
        private long f79552d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public long f79553e = 30720;

        /* access modifiers changed from: private */
        public boolean a() {
            try {
                this.f79550b = new File(this.f79551c);
                if (!this.f79550b.exists() || this.f79550b.delete()) {
                    if (!this.f79550b.createNewFile()) {
                        this.f79549a = false;
                        return false;
                    }
                    return true;
                }
                this.f79549a = false;
                return false;
            } catch (Throwable unused) {
                this.f79549a = false;
            }
        }

        public a(String str) {
            if (str != null && !str.equals("")) {
                this.f79551c = str;
                this.f79549a = a();
            }
        }

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:18:0x0030 */
        /* JADX WARNING: Removed duplicated region for block: B:21:0x0034 A[SYNTHETIC, Splitter:B:21:0x0034] */
        /* JADX WARNING: Removed duplicated region for block: B:26:0x003a A[SYNTHETIC, Splitter:B:26:0x003a] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean a(java.lang.String r10) {
            /*
                r9 = this;
                boolean r0 = r9.f79549a
                r1 = 0
                if (r0 != 0) goto L_0x0006
                return r1
            L_0x0006:
                r0 = 0
                java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ Throwable -> 0x0030 }
                java.io.File r3 = r9.f79550b     // Catch:{ Throwable -> 0x0030 }
                r4 = 1
                r2.<init>(r3, r4)     // Catch:{ Throwable -> 0x0030 }
                java.lang.String r0 = "UTF-8"
                byte[] r10 = r10.getBytes(r0)     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                r2.write(r10)     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                r2.flush()     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                r2.close()     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                long r5 = r9.f79552d     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                int r10 = r10.length     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                long r7 = (long) r10     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                long r5 = r5 + r7
                r9.f79552d = r5     // Catch:{ Throwable -> 0x002b, all -> 0x0029 }
                r2.close()     // Catch:{ IOException -> 0x0028 }
            L_0x0028:
                return r4
            L_0x0029:
                r10 = move-exception
                goto L_0x0038
            L_0x002b:
                r0 = r2
                goto L_0x0030
            L_0x002d:
                r10 = move-exception
                r2 = r0
                goto L_0x0038
            L_0x0030:
                r9.f79549a = r1     // Catch:{ all -> 0x002d }
                if (r0 == 0) goto L_0x0037
                r0.close()     // Catch:{ IOException -> 0x0037 }
            L_0x0037:
                return r1
            L_0x0038:
                if (r2 == 0) goto L_0x003d
                r2.close()     // Catch:{ IOException -> 0x003d }
            L_0x003d:
                throw r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.y.a.a(java.lang.String):boolean");
        }
    }

    static {
        try {
            f79543b = new SimpleDateFormat("MM-dd HH:mm:ss");
        } catch (Throwable unused) {
        }
    }

    public static byte[] a() {
        File file;
        if (!f79542a) {
            return null;
        }
        synchronized (n) {
            try {
                if (g == null || !g.f79549a) {
                    file = null;
                } else {
                    file = g.f79550b;
                }
                if (f79546e.length() == 0 && file == null) {
                    return null;
                }
                byte[] a2 = z.a(file, f79546e.toString(), "BuglyLog.txt");
                return a2;
            } catch (Throwable unused) {
                return null;
            }
        }
    }

    public static void a(int i2) {
        synchronized (n) {
            f79544c = i2;
            if (i2 < 0) {
                f79544c = 0;
            } else if (i2 > 10240) {
                f79544c = 10240;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006b, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r3) {
        /*
            java.lang.Class<com.tencent.bugly.proguard.y> r0 = com.tencent.bugly.proguard.y.class
            monitor-enter(r0)
            boolean r1 = l     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x006a
            if (r3 == 0) goto L_0x006a
            boolean r1 = f79542a     // Catch:{ all -> 0x006c }
            if (r1 != 0) goto L_0x000e
            goto L_0x006a
        L_0x000e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0065 }
            r2 = 0
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0065 }
            f79546e = r1     // Catch:{ Throwable -> 0x0065 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0065 }
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0065 }
            f79545d = r1     // Catch:{ Throwable -> 0x0065 }
            j = r3     // Catch:{ Throwable -> 0x0065 }
            com.tencent.bugly.crashreport.common.info.a r3 = com.tencent.bugly.crashreport.common.info.a.a((android.content.Context) r3)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = r3.f79277d     // Catch:{ Throwable -> 0x0065 }
            h = r1     // Catch:{ Throwable -> 0x0065 }
            r3.getClass()     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r3 = ""
            i = r3     // Catch:{ Throwable -> 0x0065 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0065 }
            r3.<init>()     // Catch:{ Throwable -> 0x0065 }
            android.content.Context r1 = j     // Catch:{ Throwable -> 0x0065 }
            java.io.File r1 = r1.getFilesDir()     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = r1.getPath()     // Catch:{ Throwable -> 0x0065 }
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = "/buglylog_"
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = h     // Catch:{ Throwable -> 0x0065 }
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = "_"
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = i     // Catch:{ Throwable -> 0x0065 }
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r1 = ".txt"
            r3.append(r1)     // Catch:{ Throwable -> 0x0065 }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x0065 }
            k = r3     // Catch:{ Throwable -> 0x0065 }
            int r3 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0065 }
            m = r3     // Catch:{ Throwable -> 0x0065 }
        L_0x0065:
            r3 = 1
            l = r3     // Catch:{ all -> 0x006c }
            monitor-exit(r0)
            return
        L_0x006a:
            monitor-exit(r0)
            return
        L_0x006c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.y.a(android.content.Context):void");
    }

    private static boolean b(String str, String str2, String str3) {
        try {
            com.tencent.bugly.crashreport.common.info.a b2 = com.tencent.bugly.crashreport.common.info.a.b();
            if (!(b2 == null || b2.D == null)) {
                return b2.D.appendLogToNative(str, str2, str3);
            }
        } catch (Throwable th) {
            x.a(th);
        }
        return false;
    }

    public static void a(String str, String str2, Throwable th) {
        if (th != null) {
            String message = th.getMessage();
            if (message == null) {
                message = "";
            }
            a(str, str2, message + 10 + z.b(th));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00b1, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            java.lang.Class<com.tencent.bugly.proguard.y> r0 = com.tencent.bugly.proguard.y.class
            monitor-enter(r0)
            boolean r1 = l     // Catch:{ all -> 0x00b2 }
            if (r1 == 0) goto L_0x00b0
            boolean r1 = f79542a     // Catch:{ all -> 0x00b2 }
            if (r1 != 0) goto L_0x000d
            goto L_0x00b0
        L_0x000d:
            b(r6, r7, r8)     // Catch:{ all -> 0x00b2 }
            int r1 = android.os.Process.myTid()     // Catch:{ all -> 0x00b2 }
            long r1 = (long) r1     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r3 = f79545d     // Catch:{ all -> 0x00b2 }
            r4 = 0
            r3.setLength(r4)     // Catch:{ all -> 0x00b2 }
            int r3 = r8.length()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = 30720(0x7800, float:4.3048E-41)
            if (r3 <= r5) goto L_0x0032
            int r3 = r8.length()     // Catch:{ all -> 0x00b2 }
            int r3 = r3 - r5
            int r5 = r8.length()     // Catch:{ all -> 0x00b2 }
            int r5 = r5 - r4
            java.lang.String r8 = r8.substring(r3, r5)     // Catch:{ all -> 0x00b2 }
        L_0x0032:
            java.util.Date r3 = new java.util.Date     // Catch:{ all -> 0x00b2 }
            r3.<init>()     // Catch:{ all -> 0x00b2 }
            java.text.SimpleDateFormat r5 = f79543b     // Catch:{ all -> 0x00b2 }
            if (r5 == 0) goto L_0x0042
            java.text.SimpleDateFormat r5 = f79543b     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = r5.format(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0046
        L_0x0042:
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x00b2 }
        L_0x0046:
            java.lang.StringBuilder r5 = f79545d     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = " "
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            int r3 = m     // Catch:{ all -> 0x00b2 }
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            java.lang.String r3 = " "
            r5.append(r3)     // Catch:{ all -> 0x00b2 }
            r5.append(r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r1 = " "
            r5.append(r1)     // Catch:{ all -> 0x00b2 }
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = " "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r7)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = ": "
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            r5.append(r8)     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = "\u0001\r\n"
            r5.append(r6)     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r6 = f79545d     // Catch:{ all -> 0x00b2 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x00b2 }
            java.lang.Object r7 = n     // Catch:{ all -> 0x00b2 }
            monitor-enter(r7)     // Catch:{ all -> 0x00b2 }
            java.lang.StringBuilder r8 = f79546e     // Catch:{ all -> 0x00ad }
            r8.append(r6)     // Catch:{ all -> 0x00ad }
            java.lang.StringBuilder r8 = f79546e     // Catch:{ all -> 0x00ad }
            int r8 = r8.length()     // Catch:{ all -> 0x00ad }
            int r1 = f79544c     // Catch:{ all -> 0x00ad }
            if (r8 > r1) goto L_0x0095
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)
            return
        L_0x0095:
            boolean r8 = f79547f     // Catch:{ all -> 0x00ad }
            if (r8 == 0) goto L_0x009c
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)
            return
        L_0x009c:
            f79547f = r4     // Catch:{ all -> 0x00ad }
            com.tencent.bugly.proguard.w r8 = com.tencent.bugly.proguard.w.a()     // Catch:{ all -> 0x00ad }
            com.tencent.bugly.proguard.y$1 r1 = new com.tencent.bugly.proguard.y$1     // Catch:{ all -> 0x00ad }
            r1.<init>(r6)     // Catch:{ all -> 0x00ad }
            r8.a(r1)     // Catch:{ all -> 0x00ad }
            monitor-exit(r7)     // Catch:{ all -> 0x00ad }
            monitor-exit(r0)
            return
        L_0x00ad:
            r6 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x00b2 }
            throw r6     // Catch:{ all -> 0x00b2 }
        L_0x00b0:
            monitor-exit(r0)
            return
        L_0x00b2:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.y.a(java.lang.String, java.lang.String, java.lang.String):void");
    }
}