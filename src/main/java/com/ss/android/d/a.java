package com.ss.android.d;

import org.json.JSONObject;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static JSONObject f28340a;

    /* JADX WARNING: Can't wrap try/catch for region: R(52:2|3|4|(1:6)|7|(2:9|(1:11))|12|(4:16|(2:19|17)|126|20)|21|(1:23)|24|(1:26)|27|(2:29|(1:31))|32|(2:34|(1:36))|37|(3:39|40|(1:42))|43|44|(2:46|(1:48))|49|(1:51)|52|(1:54)(1:55)|56|(1:58)|59|(2:61|(4:65|(1:67)|127|68))|69|(2:71|(1:73))|74|(2:76|(1:80))|81|(1:83)|84|(2:86|(1:88))|89|(2:92|(1:94)(10:95|96|(3:98|(1:100)(1:101)|102)|103|(1:105)|106|(4:108|(3:110|(2:112|129)(1:130)|113)|128|114)|115|(4:119|120|121|124)|122))|91|96|(0)|103|(0)|106|(0)|115|117|119|120|121|124) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:43:0x00fc */
    /* JADX WARNING: Removed duplicated region for block: B:105:0x024a A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:108:0x0276 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0106 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0121 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0132 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0134 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x013e A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0150 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0186 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x01a1 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:83:0x01dc A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01ed A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0206 A[Catch:{ Throwable -> 0x030f }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x0226 A[Catch:{ Throwable -> 0x030f }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(org.json.JSONObject r9, android.content.Context r10) {
        /*
            if (r10 != 0) goto L_0x0003
            return
        L_0x0003:
            android.content.Context r10 = r10.getApplicationContext()
            org.json.JSONObject r0 = f28340a     // Catch:{ Throwable -> 0x030f }
            if (r0 != 0) goto L_0x0012
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch:{ Throwable -> 0x030f }
            r0.<init>()     // Catch:{ Throwable -> 0x030f }
            f28340a = r0     // Catch:{ Throwable -> 0x030f }
        L_0x0012:
            com.ss.android.d.c.e r0 = new com.ss.android.d.c.e     // Catch:{ Throwable -> 0x030f }
            r0.<init>()     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "band"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x0034
            java.lang.String r1 = "gsm.version.baseband"
            java.lang.String r1 = r0.a(r1)     // Catch:{ Throwable -> 0x030f }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x0034
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "band"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x0034:
            java.util.List r1 = com.ss.android.d.c.c.d(r10)     // Catch:{ Throwable -> 0x030f }
            if (r1 == 0) goto L_0x0082
            boolean r2 = r1.isEmpty()     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x0082
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch:{ Throwable -> 0x030f }
            r2.<init>()     // Catch:{ Throwable -> 0x030f }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x030f }
        L_0x0049:
            boolean r3 = r1.hasNext()     // Catch:{ Throwable -> 0x030f }
            if (r3 == 0) goto L_0x007b
            java.lang.Object r3 = r1.next()     // Catch:{ Throwable -> 0x030f }
            android.net.wifi.ScanResult r3 = (android.net.wifi.ScanResult) r3     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch:{ Throwable -> 0x030f }
            r4.<init>()     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "ap"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x030f }
            r6.<init>()     // Catch:{ Throwable -> 0x030f }
            java.lang.String r7 = r3.BSSID     // Catch:{ Throwable -> 0x030f }
            r6.append(r7)     // Catch:{ Throwable -> 0x030f }
            java.lang.String r7 = ","
            r6.append(r7)     // Catch:{ Throwable -> 0x030f }
            int r3 = r3.level     // Catch:{ Throwable -> 0x030f }
            r6.append(r3)     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = r6.toString()     // Catch:{ Throwable -> 0x030f }
            r4.put(r5, r3)     // Catch:{ Throwable -> 0x030f }
            r2.put(r4)     // Catch:{ Throwable -> 0x030f }
            goto L_0x0049
        L_0x007b:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "aps"
            r1.put(r3, r2)     // Catch:{ Throwable -> 0x030f }
        L_0x0082:
            org.json.JSONArray r1 = com.ss.android.d.c.c.e(r10)     // Catch:{ Throwable -> 0x030f }
            if (r1 == 0) goto L_0x008f
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "cell"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x008f:
            java.lang.String r1 = com.ss.android.d.c.c.g(r10)     // Catch:{ Throwable -> 0x030f }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x00a0
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "bssid"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x00a0:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "mac"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x00bb
            java.lang.String r1 = com.ss.android.d.c.c.h(r10)     // Catch:{ Throwable -> 0x030f }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x00bb
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "mac"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x00bb:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "imsi"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = com.ss.android.d.c.c.i(r10)     // Catch:{ Throwable -> 0x030f }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x00d6
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "imsi"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x00d6:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "t"
            long r3 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x030f }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "cpuModel"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x00fc
            java.lang.String r1 = com.ss.android.d.c.c.a()     // Catch:{ Exception -> 0x00fc }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Exception -> 0x00fc }
            if (r2 != 0) goto L_0x00fc
            org.json.JSONObject r2 = f28340a     // Catch:{ Exception -> 0x00fc }
            java.lang.String r3 = "cpuModel"
            r2.put(r3, r1)     // Catch:{ Exception -> 0x00fc }
        L_0x00fc:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "btmac"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x0117
            java.lang.String r1 = com.ss.android.d.c.c.j(r10)     // Catch:{ Throwable -> 0x030f }
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x0117
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "btmac"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x0117:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "boot"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x012c
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "boot"
            long r3 = android.os.SystemClock.elapsedRealtime()     // Catch:{ Throwable -> 0x030f }
            r1.put(r2, r3)     // Catch:{ Throwable -> 0x030f }
        L_0x012c:
            android.net.wifi.WifiInfo r1 = com.ss.android.d.c.c.f(r10)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x0134
            r1 = 0
            goto L_0x0138
        L_0x0134:
            java.lang.String r1 = r1.getSSID()     // Catch:{ Throwable -> 0x030f }
        L_0x0138:
            boolean r2 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r2 != 0) goto L_0x0145
            org.json.JSONObject r2 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "ssid"
            r2.put(r3, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x0145:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "accid"
            boolean r1 = r1.has(r2)     // Catch:{ Throwable -> 0x030f }
            r2 = 0
            if (r1 != 0) goto L_0x017c
            java.lang.String[] r1 = com.ss.android.d.c.c.a((android.content.Context) r10)     // Catch:{ Throwable -> 0x030f }
            if (r1 == 0) goto L_0x017c
            int r3 = r1.length     // Catch:{ Throwable -> 0x030f }
            if (r3 <= 0) goto L_0x017c
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch:{ Throwable -> 0x030f }
            r3.<init>()     // Catch:{ Throwable -> 0x030f }
            int r4 = r1.length     // Catch:{ Throwable -> 0x030f }
            r5 = 0
        L_0x0160:
            if (r5 >= r4) goto L_0x0175
            r6 = r1[r5]     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Throwable -> 0x030f }
            r7.<init>()     // Catch:{ Throwable -> 0x030f }
            java.lang.String r8 = "accid"
            org.json.JSONObject r6 = r7.put(r8, r6)     // Catch:{ Throwable -> 0x030f }
            r3.put(r6)     // Catch:{ Throwable -> 0x030f }
            int r5 = r5 + 1
            goto L_0x0160
        L_0x0175:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "accid"
            r1.put(r4, r3)     // Catch:{ Throwable -> 0x030f }
        L_0x017c:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "mem"
            boolean r1 = r1.has(r3)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x0197
            long r3 = com.ss.android.d.c.c.b()     // Catch:{ Throwable -> 0x030f }
            r5 = 0
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 < 0) goto L_0x0197
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "mem"
            r1.put(r5, r3)     // Catch:{ Throwable -> 0x030f }
        L_0x0197:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "cpuFreq"
            boolean r1 = r1.has(r3)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x01d0
            java.lang.String r1 = com.ss.android.d.c.c.c()     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = com.ss.android.d.c.c.d()     // Catch:{ Throwable -> 0x030f }
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r4 == 0) goto L_0x01b5
            boolean r4 = com.bytedance.common.utility.StringUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x030f }
            if (r4 != 0) goto L_0x01d0
        L_0x01b5:
            org.json.JSONObject r4 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "cpuFreq"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x030f }
            r6.<init>()     // Catch:{ Throwable -> 0x030f }
            r6.append(r1)     // Catch:{ Throwable -> 0x030f }
            java.lang.String r1 = " - "
            r6.append(r1)     // Catch:{ Throwable -> 0x030f }
            r6.append(r3)     // Catch:{ Throwable -> 0x030f }
            java.lang.String r1 = r6.toString()     // Catch:{ Throwable -> 0x030f }
            r4.put(r5, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x01d0:
            java.lang.String r1 = android.os.Build.BRAND     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "brand"
            boolean r3 = r3.has(r4)     // Catch:{ Throwable -> 0x030f }
            if (r3 != 0) goto L_0x01e3
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "brand"
            r3.put(r4, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x01e3:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "proc"
            boolean r1 = r1.has(r3)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x01fe
            java.lang.String r1 = com.ss.android.d.c.c.k(r10)     // Catch:{ Throwable -> 0x030f }
            boolean r3 = com.bytedance.common.utility.StringUtils.isEmpty(r1)     // Catch:{ Throwable -> 0x030f }
            if (r3 != 0) goto L_0x01fe
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "proc"
            r3.put(r4, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x01fe:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "sim"
            if (r10 != 0) goto L_0x0206
        L_0x0204:
            r4 = 0
            goto L_0x0219
        L_0x0206:
            android.content.Context r4 = r10.getApplicationContext()     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "phone"
            java.lang.Object r4 = r4.getSystemService(r5)     // Catch:{ Throwable -> 0x030f }
            android.telephony.TelephonyManager r4 = (android.telephony.TelephonyManager) r4     // Catch:{ Throwable -> 0x030f }
            if (r4 != 0) goto L_0x0215
            goto L_0x0204
        L_0x0215:
            int r4 = r4.getSimState()     // Catch:{ Throwable -> 0x030f }
        L_0x0219:
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "cpi_abi2"
            boolean r1 = r1.has(r3)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x023e
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "cpi_abi2"
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x030f }
            r5 = 21
            if (r4 < r5) goto L_0x0239
            java.lang.String[] r4 = android.os.Build.SUPPORTED_ABIS     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = ","
            java.lang.String r4 = android.text.TextUtils.join(r5, r4)     // Catch:{ Throwable -> 0x030f }
            goto L_0x023b
        L_0x0239:
            java.lang.String r4 = android.os.Build.CPU_ABI     // Catch:{ Throwable -> 0x030f }
        L_0x023b:
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x030f }
        L_0x023e:
            java.lang.String r1 = android.os.Build.HARDWARE     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "diaplay"
            boolean r3 = r3.has(r4)     // Catch:{ Throwable -> 0x030f }
            if (r3 != 0) goto L_0x026c
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "diaplay"
            java.lang.String r5 = android.os.Build.DISPLAY     // Catch:{ Throwable -> 0x030f }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "manufacturer"
            java.lang.String r5 = android.os.Build.MANUFACTURER     // Catch:{ Throwable -> 0x030f }
            r3.put(r4, r5)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r3 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r4 = "hardware"
            r3.put(r4, r1)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "product"
            java.lang.String r4 = android.os.Build.PRODUCT     // Catch:{ Throwable -> 0x030f }
            r1.put(r3, r4)     // Catch:{ Throwable -> 0x030f }
        L_0x026c:
            org.json.JSONObject r1 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r3 = "props"
            boolean r1 = r1.has(r3)     // Catch:{ Throwable -> 0x030f }
            if (r1 != 0) goto L_0x02f5
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ Throwable -> 0x030f }
            r1.<init>()     // Catch:{ Throwable -> 0x030f }
            r3 = 16
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "gsm.version.baseband"
            r4[r2] = r5     // Catch:{ Throwable -> 0x030f }
            java.lang.String r5 = "ro.debuggable"
            r6 = 1
            r4[r6] = r5     // Catch:{ Throwable -> 0x030f }
            r5 = 2
            java.lang.String r6 = "ro.serialno"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 3
            java.lang.String r6 = "ro.boot.hardware"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 4
            java.lang.String r6 = "ro.build.tags"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 5
            java.lang.String r6 = "ro.build.date.utc"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 6
            java.lang.String r6 = "ro.product.name"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 7
            java.lang.String r6 = "gsm.network.type"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 8
            java.lang.String r6 = "gsm.sim.state"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 9
            java.lang.String r6 = "persist.sys.country"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 10
            java.lang.String r6 = "persist.sys.language"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 11
            java.lang.String r6 = "sys.usb.state"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 12
            java.lang.String r6 = "net.dns1"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 13
            java.lang.String r6 = "net.hostname"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 14
            java.lang.String r6 = "net.eth0.gw"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
            r5 = 15
            java.lang.String r6 = "net.gprs.local-ip"
            r4[r5] = r6     // Catch:{ Throwable -> 0x030f }
        L_0x02d6:
            if (r2 >= r3) goto L_0x02ee
            r5 = r4[r2]     // Catch:{ Throwable -> 0x030f }
            java.lang.String r6 = r0.a(r5)     // Catch:{ Throwable -> 0x030f }
            boolean r6 = com.bytedance.common.utility.StringUtils.isEmpty(r6)     // Catch:{ Throwable -> 0x030f }
            if (r6 != 0) goto L_0x02eb
            java.lang.String r6 = r0.a(r5)     // Catch:{ Throwable -> 0x030f }
            r1.put(r5, r6)     // Catch:{ Throwable -> 0x030f }
        L_0x02eb:
            int r2 = r2 + 1
            goto L_0x02d6
        L_0x02ee:
            org.json.JSONObject r0 = f28340a     // Catch:{ Throwable -> 0x030f }
            java.lang.String r2 = "props"
            r0.put(r2, r1)     // Catch:{ Throwable -> 0x030f }
        L_0x02f5:
            org.json.JSONObject r0 = f28340a     // Catch:{ Throwable -> 0x030f }
            com.ss.android.d.g.a(r10, r0)     // Catch:{ Throwable -> 0x030f }
            org.json.JSONObject r10 = f28340a     // Catch:{ Throwable -> 0x030f }
            if (r10 == 0) goto L_0x030e
            org.json.JSONObject r10 = f28340a     // Catch:{ Throwable -> 0x030f }
            int r10 = r10.length()     // Catch:{ Throwable -> 0x030f }
            if (r10 <= 0) goto L_0x030e
            java.lang.String r10 = "anti_cheating"
            org.json.JSONObject r0 = f28340a     // Catch:{ JSONException -> 0x030e }
            r9.put(r10, r0)     // Catch:{ JSONException -> 0x030e }
            goto L_0x030f
        L_0x030e:
            return
        L_0x030f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.d.a.a(org.json.JSONObject, android.content.Context):void");
    }
}
