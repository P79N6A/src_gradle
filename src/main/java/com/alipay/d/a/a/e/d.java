package com.alipay.d.a.a.e;

import com.google.a.a.a.a.a.a;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    private static String f5391a = "";

    /* renamed from: b  reason: collision with root package name */
    private static String f5392b = "";

    /* renamed from: c  reason: collision with root package name */
    private static String f5393c = "";

    public static synchronized void a(String str) {
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(str);
            a((List<String>) arrayList);
        }
    }

    public static synchronized void a(String str, String str2, String str3) {
        synchronized (d.class) {
            f5391a = str;
            f5392b = str2;
            f5393c = str3;
        }
    }

    public static synchronized void a(Throwable th) {
        String str;
        synchronized (d.class) {
            ArrayList arrayList = new ArrayList();
            if (th != null) {
                StringWriter stringWriter = new StringWriter();
                a.a(th, new PrintWriter(stringWriter));
                str = stringWriter.toString();
            } else {
                str = "";
            }
            arrayList.add(str);
            a((List<String>) arrayList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0093, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(java.util.List<java.lang.String> r7) {
        /*
            java.lang.Class<com.alipay.d.a.a.e.d> r0 = com.alipay.d.a.a.e.d.class
            monitor-enter(r0)
            java.lang.String r1 = f5392b     // Catch:{ all -> 0x0094 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ all -> 0x0094 }
            if (r1 != 0) goto L_0x0092
            java.lang.String r1 = f5393c     // Catch:{ all -> 0x0094 }
            boolean r1 = com.alipay.d.a.a.a.a.a((java.lang.String) r1)     // Catch:{ all -> 0x0094 }
            if (r1 == 0) goto L_0x0015
            goto L_0x0092
        L_0x0015:
            java.lang.StringBuffer r1 = new java.lang.StringBuffer     // Catch:{ all -> 0x0094 }
            r1.<init>()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = f5393c     // Catch:{ all -> 0x0094 }
            r1.append(r2)     // Catch:{ all -> 0x0094 }
            java.util.Iterator r7 = r7.iterator()     // Catch:{ all -> 0x0094 }
        L_0x0023:
            boolean r2 = r7.hasNext()     // Catch:{ all -> 0x0094 }
            if (r2 == 0) goto L_0x003d
            java.lang.Object r2 = r7.next()     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0094 }
            java.lang.String r3 = ", "
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ all -> 0x0094 }
            java.lang.String r2 = r3.concat(r2)     // Catch:{ all -> 0x0094 }
            r1.append(r2)     // Catch:{ all -> 0x0094 }
            goto L_0x0023
        L_0x003d:
            java.lang.String r7 = "\n"
            r1.append(r7)     // Catch:{ all -> 0x0094 }
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = f5391a     // Catch:{ Exception -> 0x0090 }
            r7.<init>(r2)     // Catch:{ Exception -> 0x0090 }
            boolean r2 = r7.exists()     // Catch:{ Exception -> 0x0090 }
            if (r2 != 0) goto L_0x0052
            r7.mkdirs()     // Catch:{ Exception -> 0x0090 }
        L_0x0052:
            java.io.File r7 = new java.io.File     // Catch:{ Exception -> 0x0090 }
            java.lang.String r2 = f5391a     // Catch:{ Exception -> 0x0090 }
            java.lang.String r3 = f5392b     // Catch:{ Exception -> 0x0090 }
            r7.<init>(r2, r3)     // Catch:{ Exception -> 0x0090 }
            boolean r2 = r7.exists()     // Catch:{ Exception -> 0x0090 }
            if (r2 != 0) goto L_0x0064
            r7.createNewFile()     // Catch:{ Exception -> 0x0090 }
        L_0x0064:
            long r2 = r7.length()     // Catch:{ Exception -> 0x0090 }
            int r4 = r1.length()     // Catch:{ Exception -> 0x0090 }
            long r4 = (long) r4     // Catch:{ Exception -> 0x0090 }
            long r4 = r4 + r2
            r2 = 51200(0xc800, double:2.5296E-319)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 > 0) goto L_0x007c
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ Exception -> 0x0090 }
            r3 = 1
            r2.<init>(r7, r3)     // Catch:{ Exception -> 0x0090 }
            goto L_0x0081
        L_0x007c:
            java.io.FileWriter r2 = new java.io.FileWriter     // Catch:{ Exception -> 0x0090 }
            r2.<init>(r7)     // Catch:{ Exception -> 0x0090 }
        L_0x0081:
            java.lang.String r7 = r1.toString()     // Catch:{ Exception -> 0x0090 }
            r2.write(r7)     // Catch:{ Exception -> 0x0090 }
            r2.flush()     // Catch:{ Exception -> 0x0090 }
            r2.close()     // Catch:{ Exception -> 0x0090 }
            monitor-exit(r0)
            return
        L_0x0090:
            monitor-exit(r0)
            return
        L_0x0092:
            monitor-exit(r0)
            return
        L_0x0094:
            r7 = move-exception
            monitor-exit(r0)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.d.a.a.e.d.a(java.util.List):void");
    }
}
