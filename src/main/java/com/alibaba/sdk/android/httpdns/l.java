package com.alibaba.sdk.android.httpdns;

import android.content.Context;
import java.util.concurrent.Callable;

public class l implements Callable<String[]> {

    /* renamed from: a  reason: collision with root package name */
    private static Context f5106a;
    private static b hostManager = b.a();

    /* renamed from: a  reason: collision with other field name */
    private n f26a;

    /* renamed from: b  reason: collision with root package name */
    private String f5107b;

    /* renamed from: d  reason: collision with root package name */
    private int f5108d = 1;

    /* renamed from: e  reason: collision with root package name */
    private String[] f5109e = d.f25d;
    private String g;

    l(String str, n nVar) {
        this.f5107b = str;
        this.f26a = nVar;
    }

    static void setContext(Context context) {
        f5106a = context;
    }

    public void a(int i) {
        if (i >= 0) {
            this.f5108d = i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:71:0x020b A[Catch:{ all -> 0x0234 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0216  */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021b A[SYNTHETIC, Splitter:B:75:0x021b] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x0223 A[Catch:{ IOException -> 0x021f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x023c A[SYNTHETIC, Splitter:B:88:0x023c] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0244 A[Catch:{ IOException -> 0x0240 }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String[] call() {
        /*
            r7 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2 = 14
            if (r1 < r2) goto L_0x000d
            r1 = 40965(0xa005, float:5.7404E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
        L_0x000d:
            com.alibaba.sdk.android.httpdns.b r1 = hostManager     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = r7.f5107b     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.b(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            com.alibaba.sdk.android.httpdns.n r1 = r7.f26a     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = com.alibaba.sdk.android.httpdns.s.a((com.alibaba.sdk.android.httpdns.n) r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r7.g = r1     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = r7.g     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            if (r1 != 0) goto L_0x0037
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = "serverIp is null, give up query for hostname:"
            r1.<init>(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = r7.f5107b     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            com.alibaba.sdk.android.httpdns.g.e(r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2 = r0
            r3 = r2
            goto L_0x01d2
        L_0x0037:
            boolean r1 = com.alibaba.sdk.android.httpdns.a.a()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            if (r1 == 0) goto L_0x008e
            java.lang.String r1 = com.alibaba.sdk.android.httpdns.a.getTimestamp()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.<init>()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = com.alibaba.sdk.android.httpdns.d.PROTOCOL     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = r7.g     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = ":"
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = com.alibaba.sdk.android.httpdns.d.f5096d     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = "/"
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = com.alibaba.sdk.android.httpdns.d.f5095c     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = "/sign_d?host="
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = r7.f5107b     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = "&sdk=android_1.1.3.1"
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = "&t="
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = "&s="
            r2.append(r3)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r3 = r7.f5107b     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = com.alibaba.sdk.android.httpdns.a.a(r3, r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.append(r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = r2.toString()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            goto L_0x00c4
        L_0x008e:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.<init>()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = com.alibaba.sdk.android.httpdns.d.PROTOCOL     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = r7.g     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = ":"
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = com.alibaba.sdk.android.httpdns.d.f5096d     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = "/"
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = com.alibaba.sdk.android.httpdns.d.f5095c     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = "/d?host="
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = r7.f5107b     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r2 = "&sdk=android_1.1.3.1"
            r1.append(r2)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
        L_0x00c4:
            java.net.URL r2 = new java.net.URL     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            r2.<init>(r1)     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Throwable -> 0x01fa, all -> 0x01f6 }
            int r2 = com.alibaba.sdk.android.httpdns.d.f5093a     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            r1.setConnectTimeout(r2)     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            int r2 = com.alibaba.sdk.android.httpdns.d.f5093a     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            r1.setReadTimeout(r2)     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            boolean r2 = r1 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            if (r2 == 0) goto L_0x00e8
            r2 = r1
            javax.net.ssl.HttpsURLConnection r2 = (javax.net.ssl.HttpsURLConnection) r2     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            com.alibaba.sdk.android.httpdns.l$1 r3 = new com.alibaba.sdk.android.httpdns.l$1     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            r3.<init>()     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            r2.setHostnameVerifier(r3)     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
        L_0x00e8:
            int r2 = r1.getResponseCode()     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0165
            java.io.InputStream r2 = r1.getErrorStream()     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0.<init>()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
        L_0x0105:
            java.lang.String r4 = r3.readLine()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            if (r4 == 0) goto L_0x010f
            r0.append(r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            goto L_0x0105
        L_0x010f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = "response code is "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            int r5 = r1.getResponseCode()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = " expect 200. response body is "
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.g.f(r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.e r4 = new com.alibaba.sdk.android.httpdns.e     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            int r5 = r1.getResponseCode()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.<init>(r5, r0)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.f r0 = new com.alibaba.sdk.android.httpdns.f     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            int r5 = r1.getResponseCode()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r4 = r4.a()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0.<init>(r5, r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            throw r0     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
        L_0x014b:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x0235
        L_0x0151:
            r0 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L_0x01fd
        L_0x0157:
            r3 = move-exception
            r6 = r3
            r3 = r0
            r0 = r1
            r1 = r6
            goto L_0x0235
        L_0x015e:
            r3 = move-exception
            r6 = r3
            r3 = r0
            r0 = r1
            r1 = r6
            goto L_0x01fd
        L_0x0165:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Throwable -> 0x01f0, all -> 0x01ea }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            r3.<init>(r4)     // Catch:{ Throwable -> 0x015e, all -> 0x0157 }
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0.<init>()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
        L_0x017a:
            java.lang.String r4 = r3.readLine()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            if (r4 == 0) goto L_0x0184
            r0.append(r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            goto L_0x017a
        L_0x0184:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = "resolve host: "
            r4.<init>(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r7.f5107b     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = ", return: "
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.append(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.g.e(r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.c r4 = new com.alibaba.sdk.android.httpdns.c     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r0 = r0.toString()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r4.<init>((java.lang.String) r0)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.b r0 = hostManager     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            int r0 = r0.a()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r5 = 100
            if (r0 >= r5) goto L_0x01e2
            com.alibaba.sdk.android.httpdns.b r0 = hostManager     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r7.f5107b     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0.a(r5, r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r0 = r7.f5107b     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r7.g     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.s.a(r0, r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            com.alibaba.sdk.android.httpdns.b r0 = hostManager     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r5 = r7.f5107b     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0.c(r5)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String[] r0 = r4.a()     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r7.f5109e = r0     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            r0 = r1
        L_0x01d2:
            if (r0 == 0) goto L_0x01d7
            r0.disconnect()
        L_0x01d7:
            if (r2 == 0) goto L_0x01dc
            r2.close()     // Catch:{ IOException -> 0x021f }
        L_0x01dc:
            if (r3 == 0) goto L_0x022a
            r3.close()     // Catch:{ IOException -> 0x021f }
            goto L_0x022a
        L_0x01e2:
            java.lang.Exception r0 = new java.lang.Exception     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            java.lang.String r4 = "the total number of hosts is exceed 100"
            r0.<init>(r4)     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
            throw r0     // Catch:{ Throwable -> 0x0151, all -> 0x014b }
        L_0x01ea:
            r2 = move-exception
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x0235
        L_0x01f0:
            r2 = move-exception
            r3 = r0
            r0 = r1
            r1 = r2
            r2 = r3
            goto L_0x01fd
        L_0x01f6:
            r1 = move-exception
            r2 = r0
            r3 = r2
            goto L_0x0235
        L_0x01fa:
            r1 = move-exception
            r2 = r0
            r3 = r2
        L_0x01fd:
            com.alibaba.sdk.android.httpdns.g.a(r1)     // Catch:{ all -> 0x0234 }
            java.lang.String r4 = r7.f5107b     // Catch:{ all -> 0x0234 }
            java.lang.String r5 = r7.g     // Catch:{ all -> 0x0234 }
            com.alibaba.sdk.android.httpdns.s.a(r4, r5, r1)     // Catch:{ all -> 0x0234 }
            int r1 = r7.f5108d     // Catch:{ all -> 0x0234 }
            if (r1 <= 0) goto L_0x0214
            int r1 = r7.f5108d     // Catch:{ all -> 0x0234 }
            int r1 = r1 + -1
            r7.f5108d = r1     // Catch:{ all -> 0x0234 }
            r7.call()     // Catch:{ all -> 0x0234 }
        L_0x0214:
            if (r0 == 0) goto L_0x0219
            r0.disconnect()
        L_0x0219:
            if (r2 == 0) goto L_0x0221
            r2.close()     // Catch:{ IOException -> 0x021f }
            goto L_0x0221
        L_0x021f:
            r0 = move-exception
            goto L_0x0227
        L_0x0221:
            if (r3 == 0) goto L_0x022a
            r3.close()     // Catch:{ IOException -> 0x021f }
            goto L_0x022a
        L_0x0227:
            com.alibaba.sdk.android.httpdns.g.a(r0)
        L_0x022a:
            com.alibaba.sdk.android.httpdns.b r0 = hostManager
            java.lang.String r1 = r7.f5107b
            r0.c(r1)
            java.lang.String[] r0 = r7.f5109e
            return r0
        L_0x0234:
            r1 = move-exception
        L_0x0235:
            if (r0 == 0) goto L_0x023a
            r0.disconnect()
        L_0x023a:
            if (r2 == 0) goto L_0x0242
            r2.close()     // Catch:{ IOException -> 0x0240 }
            goto L_0x0242
        L_0x0240:
            r0 = move-exception
            goto L_0x0248
        L_0x0242:
            if (r3 == 0) goto L_0x024b
            r3.close()     // Catch:{ IOException -> 0x0240 }
            goto L_0x024b
        L_0x0248:
            com.alibaba.sdk.android.httpdns.g.a(r0)
        L_0x024b:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alibaba.sdk.android.httpdns.l.call():java.lang.String[]");
    }
}
