package com.loc;

import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ExecutorService;

public final class bx {

    /* renamed from: a  reason: collision with root package name */
    static bx f25598a;

    /* renamed from: b  reason: collision with root package name */
    Context f25599b;

    /* renamed from: c  reason: collision with root package name */
    ExecutorService f25600c;

    /* renamed from: d  reason: collision with root package name */
    boolean f25601d;

    /* renamed from: e  reason: collision with root package name */
    boolean f25602e = true;

    /* renamed from: f  reason: collision with root package name */
    ca f25603f;
    String g = "";
    String h = "";
    String[] i;
    int j;
    private Object k;
    private final int l = 2;
    private final String m = "https";
    private final int n = 5;
    private final int o = 2;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        ca f25604a;

        a(ca caVar) {
            this.f25604a = caVar;
        }

        public final void run() {
            bx.this.j++;
            bx.this.a(this.f25604a);
            bx bxVar = bx.this;
            bxVar.j--;
        }
    }

    private bx() {
    }

    public static bx a(Context context) {
        if (f25598a == null) {
            f25598a = new bx(context);
        }
        return f25598a;
    }

    private static boolean a(String[] strArr, String[] strArr2) {
        if (strArr != null && strArr2 == null) {
            return false;
        }
        if (strArr == null && strArr2 != null) {
            return false;
        }
        if (strArr == null && strArr2 == null) {
            return true;
        }
        try {
            if (strArr.length != strArr2.length) {
                return false;
            }
            ArrayList arrayList = new ArrayList(12);
            ArrayList arrayList2 = new ArrayList(12);
            arrayList.addAll(Arrays.asList(strArr));
            arrayList2.addAll(Arrays.asList(strArr2));
            Collections.sort(arrayList);
            Collections.sort(arrayList2);
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                if (!((String) arrayList.get(i2)).equals(arrayList2.get(i2))) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x003e A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b() {
        /*
            r7 = this;
            r0 = 0
            r1 = 1
            r2 = -1
            r3 = 0
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0034 }
            r5 = 14
            if (r4 < r5) goto L_0x000c
            r4 = 1
            goto L_0x000d
        L_0x000c:
            r4 = 0
        L_0x000d:
            if (r4 == 0) goto L_0x0027
            java.lang.String r4 = "http.proxyHost"
            java.lang.String r4 = java.lang.System.getProperty(r4)     // Catch:{ Throwable -> 0x0034 }
            java.lang.String r3 = "http.proxyPort"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch:{ Throwable -> 0x0025 }
            if (r3 == 0) goto L_0x001e
            goto L_0x0020
        L_0x001e:
            java.lang.String r3 = "-1"
        L_0x0020:
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ Throwable -> 0x0025 }
            goto L_0x003c
        L_0x0025:
            r3 = move-exception
            goto L_0x0038
        L_0x0027:
            android.content.Context r4 = r7.f25599b     // Catch:{ Throwable -> 0x0034 }
            java.lang.String r4 = android.net.Proxy.getHost(r4)     // Catch:{ Throwable -> 0x0034 }
            android.content.Context r3 = r7.f25599b     // Catch:{ Throwable -> 0x0025 }
            int r3 = android.net.Proxy.getPort(r3)     // Catch:{ Throwable -> 0x0025 }
            goto L_0x003c
        L_0x0034:
            r4 = move-exception
            r6 = r4
            r4 = r3
            r3 = r6
        L_0x0038:
            com.google.a.a.a.a.a.a.b(r3)
            r3 = -1
        L_0x003c:
            if (r4 == 0) goto L_0x0041
            if (r3 == r2) goto L_0x0041
            return r1
        L_0x0041:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bx.b():boolean");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        com.loc.cl.a(r8.f25599b, "pref", "dns_faile_count_total", 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0049, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.loc.ca r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = 0
            java.lang.String r2 = com.loc.ce.a()     // Catch:{ Throwable -> 0x003f }
            r9.g = r2     // Catch:{ Throwable -> 0x003f }
            android.content.Context r2 = r8.f25599b     // Catch:{ Throwable -> 0x003f }
            java.lang.String r3 = "pref"
            java.lang.String r4 = "dns_faile_count_total"
            long r2 = com.loc.cl.b((android.content.Context) r2, (java.lang.String) r3, (java.lang.String) r4, (long) r0)     // Catch:{ Throwable -> 0x003f }
            r4 = 2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L_0x001b
            monitor-exit(r8)
            return
        L_0x001b:
            com.loc.ah.a()     // Catch:{ Throwable -> 0x003f }
            r6 = 0
            com.loc.ah.a(r9, r6)     // Catch:{ Throwable -> 0x003f }
            r6 = 1
            long r2 = r2 + r6
            int r9 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r9 < 0) goto L_0x0032
            android.content.Context r9 = r8.f25599b     // Catch:{ Throwable -> 0x003f }
            java.lang.String r4 = "HttpDNS"
            java.lang.String r5 = "dns failed too much"
            com.loc.ck.a(r9, r4, r5)     // Catch:{ Throwable -> 0x003f }
        L_0x0032:
            android.content.Context r9 = r8.f25599b     // Catch:{ Throwable -> 0x003f }
            java.lang.String r4 = "pref"
            java.lang.String r5 = "dns_faile_count_total"
            com.loc.cl.a((android.content.Context) r9, (java.lang.String) r4, (java.lang.String) r5, (long) r2)     // Catch:{ Throwable -> 0x003f }
            monitor-exit(r8)
            return
        L_0x003d:
            r9 = move-exception
            goto L_0x004a
        L_0x003f:
            android.content.Context r9 = r8.f25599b     // Catch:{ all -> 0x003d }
            java.lang.String r2 = "pref"
            java.lang.String r3 = "dns_faile_count_total"
            com.loc.cl.a((android.content.Context) r9, (java.lang.String) r2, (java.lang.String) r3, (long) r0)     // Catch:{ all -> 0x003d }
            monitor-exit(r8)
            return
        L_0x004a:
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bx.a(com.loc.ca):void");
    }

    /* access modifiers changed from: package-private */
    public boolean a() {
        return cd.g() && this.k != null && !b() && cl.b(this.f25599b, "pref", "dns_faile_count_total", 0) < 2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(11:7|8|9|10|11|(1:13)|14|15|16|17|18) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0048 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x004c A[Catch:{ Throwable -> 0x0055, Throwable -> 0x005e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private bx(android.content.Context r10) {
        /*
            r9 = this;
            r9.<init>()
            r0 = 1
            r9.f25602e = r0
            r1 = 2
            r9.l = r1
            java.lang.String r2 = "https"
            r9.m = r2
            java.lang.String r2 = ""
            r9.g = r2
            java.lang.String r2 = ""
            r9.h = r2
            r2 = 5
            r9.n = r2
            r9.o = r1
            r9.f25599b = r10
            android.content.Context r10 = r9.f25599b
            boolean r1 = com.loc.cd.g()     // Catch:{ Throwable -> 0x005e }
            if (r1 != 0) goto L_0x0025
            return
        L_0x0025:
            java.lang.String r1 = "HttpDNS"
            java.lang.String r2 = "1.0.0"
            com.loc.dh r4 = com.loc.ce.a((java.lang.String) r1, (java.lang.String) r2)     // Catch:{ Throwable -> 0x005e }
            boolean r1 = com.loc.cj.a((android.content.Context) r10, (com.loc.dh) r4)     // Catch:{ Throwable -> 0x005e }
            if (r1 == 0) goto L_0x005d
            r1 = 0
            java.lang.String r5 = "com.autonavi.httpdns.HttpDnsManager"
            r6 = 0
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ Throwable -> 0x0048 }
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r7[r1] = r2     // Catch:{ Throwable -> 0x0048 }
            java.lang.Object[] r8 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0048 }
            r8[r1] = r10     // Catch:{ Throwable -> 0x0048 }
            r3 = r10
            java.lang.Object r2 = com.loc.t.a(r3, r4, r5, r6, r7, r8)     // Catch:{ Throwable -> 0x0048 }
            r9.k = r2     // Catch:{ Throwable -> 0x0048 }
        L_0x0048:
            java.lang.Object r2 = r9.k     // Catch:{ Throwable -> 0x005e }
            if (r2 != 0) goto L_0x004d
            r0 = 0
        L_0x004d:
            java.lang.String r1 = "HttpDns"
            java.lang.String r2 = "O009"
            com.loc.cj.a(r10, r2, r0, r1)     // Catch:{ Throwable -> 0x0055 }
            return
        L_0x0055:
            r10 = move-exception
            java.lang.String r0 = "ReportUtil"
            java.lang.String r1 = "reportDexLoadDexClass"
            com.loc.ce.a(r10, r0, r1)     // Catch:{ Throwable -> 0x005e }
        L_0x005d:
            return
        L_0x005e:
            r10 = move-exception
            java.lang.String r0 = "DNSManager"
            java.lang.String r1 = "initHttpDns"
            com.loc.ce.a(r10, r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bx.<init>(android.content.Context):void");
    }

    /* access modifiers changed from: package-private */
    public String a(String str) {
        String str2;
        String str3 = null;
        if (a()) {
            int i2 = 1;
            try {
                String[] strArr = (String[]) ch.a(this.k, "getIpsByHostAsync", str);
                if (strArr == null || strArr.length <= 0) {
                    str2 = null;
                } else if (this.i == null) {
                    this.i = strArr;
                    str2 = strArr[0];
                } else if (a(strArr, this.i)) {
                    str2 = this.i[0];
                } else {
                    this.i = strArr;
                    str2 = strArr[0];
                }
                str3 = str2;
            } catch (Throwable unused) {
                i2 = 0;
            }
            try {
                cj.a(this.f25599b, "O010", i2, "HttpDns");
            } catch (Throwable th) {
                ce.a(th, "ReportUtil", "reportDexFunction");
            }
        }
        return str3;
    }
}
