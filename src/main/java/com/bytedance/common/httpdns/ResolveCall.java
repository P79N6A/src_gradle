package com.bytedance.common.httpdns;

import android.content.Context;
import java.util.concurrent.Callable;

public class ResolveCall implements Callable<DnsRecord> {
    private final HostManager hostManager;
    private final String mAccount;
    private final Context mContext;
    private final String mHost;
    private final long ttl;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: com.bytedance.common.httpdns.DnsRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: com.bytedance.common.httpdns.DnsRecord} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: com.bytedance.common.httpdns.DnsRecord} */
    /* JADX WARNING: type inference failed for: r0v0 */
    /* JADX WARNING: type inference failed for: r0v8, types: [java.io.InputStream] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Failed to insert additional move for type inference */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0109 A[SYNTHETIC, Splitter:B:53:0x0109] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0111 A[Catch:{ IOException -> 0x010d }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0133  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0150 A[SYNTHETIC, Splitter:B:72:0x0150] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x0158 A[Catch:{ IOException -> 0x0154 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.common.httpdns.DnsRecord call() {
        /*
            r8 = this;
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            r2 = 14
            if (r1 < r2) goto L_0x000d
            r1 = 40965(0xa005, float:5.7404E-41)
            android.net.TrafficStats.setThreadStatsTag(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
        L_0x000d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.lang.String r2 = "http://203.107.1.4:80/"
            r1.<init>(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.lang.String r2 = r8.mAccount     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            r1.append(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.lang.String r2 = "/d?host="
            r1.append(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.lang.String r2 = r8.mHost     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            r1.append(r2)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.lang.String r1 = r1.toString()     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            boolean r2 = com.bytedance.common.httpdns.LogUtil.debug()     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            if (r2 == 0) goto L_0x0030
            com.bytedance.common.httpdns.LogUtil.d(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
        L_0x0030:
            java.net.URL r2 = new java.net.URL     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.net.URLConnection r1 = r2.openConnection()     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x00ec, all -> 0x00e6 }
            r2 = 15000(0x3a98, float:2.102E-41)
            r1.setConnectTimeout(r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            r1.setReadTimeout(r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            int r2 = r1.getResponseCode()     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            r3 = 200(0xc8, float:2.8E-43)
            if (r2 == r3) goto L_0x0068
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            java.lang.String r3 = "response code is "
            r2.<init>(r3)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            int r3 = r1.getResponseCode()     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            r2.append(r3)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            java.lang.String r3 = " expect 200"
            r2.append(r3)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            com.bytedance.common.httpdns.LogUtil.e(r2)     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            r3 = r0
            r5 = r3
            goto L_0x00b6
        L_0x0068:
            java.io.InputStream r2 = r1.getInputStream()     // Catch:{ Exception -> 0x00e1, all -> 0x00db }
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.lang.String r5 = "UTF-8"
            r4.<init>(r2, r5)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            r3.<init>(r4)     // Catch:{ Exception -> 0x00d7, all -> 0x00d1 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cf }
            r4.<init>()     // Catch:{ Exception -> 0x00cf }
        L_0x007d:
            java.lang.String r5 = r3.readLine()     // Catch:{ Exception -> 0x00cf }
            if (r5 == 0) goto L_0x0087
            r4.append(r5)     // Catch:{ Exception -> 0x00cf }
            goto L_0x007d
        L_0x0087:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00cf }
            java.lang.String r6 = "resolve host: "
            r5.<init>(r6)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r6 = r8.mHost     // Catch:{ Exception -> 0x00cf }
            r5.append(r6)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r6 = ", return: "
            r5.append(r6)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r6 = r4.toString()     // Catch:{ Exception -> 0x00cf }
            r5.append(r6)     // Catch:{ Exception -> 0x00cf }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00cf }
            com.bytedance.common.httpdns.LogUtil.d(r5)     // Catch:{ Exception -> 0x00cf }
            com.bytedance.common.httpdns.DnsRecord r5 = new com.bytedance.common.httpdns.DnsRecord     // Catch:{ Exception -> 0x00cf }
            java.lang.String r4 = r4.toString()     // Catch:{ Exception -> 0x00cf }
            com.bytedance.common.httpdns.HostManager r6 = r8.hostManager     // Catch:{ Exception -> 0x00cf }
            boolean r6 = r6.isNeedRefetchOnExpire()     // Catch:{ Exception -> 0x00cf }
            r5.<init>(r4, r6)     // Catch:{ Exception -> 0x00cf }
            r0 = r2
        L_0x00b6:
            if (r1 == 0) goto L_0x00bb
            r1.disconnect()
        L_0x00bb:
            if (r0 == 0) goto L_0x00c3
            r0.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00c3
        L_0x00c1:
            r0 = move-exception
            goto L_0x00c9
        L_0x00c3:
            if (r3 == 0) goto L_0x00cc
            r3.close()     // Catch:{ IOException -> 0x00c1 }
            goto L_0x00cc
        L_0x00c9:
            com.bytedance.common.httpdns.LogUtil.a(r0)
        L_0x00cc:
            r0 = r5
            goto L_0x0118
        L_0x00cf:
            r4 = move-exception
            goto L_0x00f1
        L_0x00d1:
            r3 = move-exception
            r7 = r3
            r3 = r0
            r0 = r7
            goto L_0x0149
        L_0x00d7:
            r3 = move-exception
            r4 = r3
            r3 = r0
            goto L_0x00f1
        L_0x00db:
            r2 = move-exception
            r3 = r0
            r0 = r2
            r2 = r3
            goto L_0x0149
        L_0x00e1:
            r2 = move-exception
            r3 = r0
            r4 = r2
            r2 = r3
            goto L_0x00f1
        L_0x00e6:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r0 = r1
            r1 = r3
            goto L_0x0149
        L_0x00ec:
            r1 = move-exception
            r2 = r0
            r3 = r2
            r4 = r1
            r1 = r3
        L_0x00f1:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0148 }
            java.lang.String r6 = "resolve fail: "
            r5.<init>(r6)     // Catch:{ all -> 0x0148 }
            r5.append(r4)     // Catch:{ all -> 0x0148 }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0148 }
            com.bytedance.common.httpdns.LogUtil.d(r4)     // Catch:{ all -> 0x0148 }
            if (r1 == 0) goto L_0x0107
            r1.disconnect()
        L_0x0107:
            if (r2 == 0) goto L_0x010f
            r2.close()     // Catch:{ IOException -> 0x010d }
            goto L_0x010f
        L_0x010d:
            r1 = move-exception
            goto L_0x0115
        L_0x010f:
            if (r3 == 0) goto L_0x0118
            r3.close()     // Catch:{ IOException -> 0x010d }
            goto L_0x0118
        L_0x0115:
            com.bytedance.common.httpdns.LogUtil.a(r1)
        L_0x0118:
            if (r0 != 0) goto L_0x0129
            com.bytedance.common.httpdns.DnsRecord r0 = new com.bytedance.common.httpdns.DnsRecord
            java.lang.String r1 = r8.mHost
            long r2 = r8.ttl
            com.bytedance.common.httpdns.HostManager r4 = r8.hostManager
            boolean r4 = r4.isNeedRefetchOnExpire()
            r0.<init>(r1, r2, r4)
        L_0x0129:
            com.bytedance.common.httpdns.HostManager r1 = r8.hostManager
            int r1 = r1.getRecordSize()
            r2 = 100
            if (r1 >= r2) goto L_0x013b
            com.bytedance.common.httpdns.HostManager r1 = r8.hostManager
            java.lang.String r2 = r8.mHost
            r1.addRecord(r2, r0)
            goto L_0x0140
        L_0x013b:
            java.lang.String r1 = "the total number of hosts is exceed 100"
            com.bytedance.common.httpdns.LogUtil.d(r1)
        L_0x0140:
            com.bytedance.common.httpdns.HostManager r1 = r8.hostManager
            java.lang.String r2 = r8.mHost
            r1.removeResolve(r2)
            return r0
        L_0x0148:
            r0 = move-exception
        L_0x0149:
            if (r1 == 0) goto L_0x014e
            r1.disconnect()
        L_0x014e:
            if (r2 == 0) goto L_0x0156
            r2.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x0156
        L_0x0154:
            r1 = move-exception
            goto L_0x015c
        L_0x0156:
            if (r3 == 0) goto L_0x015f
            r3.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x015f
        L_0x015c:
            com.bytedance.common.httpdns.LogUtil.a(r1)
        L_0x015f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.common.httpdns.ResolveCall.call():com.bytedance.common.httpdns.DnsRecord");
    }

    ResolveCall(String str, Context context, String str2, HostManager hostManager2, long j) {
        this.mHost = str;
        this.mContext = context;
        this.mAccount = str2;
        this.hostManager = hostManager2;
        this.ttl = j;
    }
}
