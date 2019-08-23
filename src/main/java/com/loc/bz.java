package com.loc;

public final class bz {

    /* renamed from: a  reason: collision with root package name */
    static bz f25619a;

    /* renamed from: b  reason: collision with root package name */
    ah f25620b = ah.a();

    /* renamed from: c  reason: collision with root package name */
    public int f25621c;

    /* renamed from: d  reason: collision with root package name */
    boolean f25622d;

    /* renamed from: e  reason: collision with root package name */
    private int f25623e = ce.f25649f;

    /* renamed from: f  reason: collision with root package name */
    private int f25624f;

    bz() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00c1, code lost:
        r11.put(r12, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x00ca, code lost:
        r11.remove("custom");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00cf, code lost:
        r2.l = r11;
        r2.f25469c = r10.f25623e;
        r2.f25470d = r10.f25623e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x00db, code lost:
        if (r10.f25622d == false) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00dd, code lost:
        r2.g = r2.c().replace("http", "https");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:?, code lost:
        return r2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.loc.ca a(android.content.Context r11, byte[] r12, java.lang.String r13, boolean r14) {
        /*
            r10 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00ec }
            r1 = 16
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00ec }
            com.loc.ca r2 = new com.loc.ca     // Catch:{ Throwable -> 0x00ec }
            com.loc.dh r3 = com.loc.ce.b()     // Catch:{ Throwable -> 0x00ec }
            r2.<init>(r11, r3)     // Catch:{ Throwable -> 0x00ec }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/octet-stream"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "Accept-Encoding"
            java.lang.String r4 = "gzip"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "gzipped"
            java.lang.String r4 = "1"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "AMAP_Location_SDK_Android 4.2.0"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "KEY"
            java.lang.String r4 = com.loc.cy.f(r11)     // Catch:{ Throwable -> 0x00ee }
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "enginever"
            java.lang.String r4 = "4.9"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = com.loc.da.a()     // Catch:{ Throwable -> 0x00ee }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r5 = "key="
            r4.<init>(r5)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r5 = com.loc.cy.f(r11)     // Catch:{ Throwable -> 0x00ee }
            r4.append(r5)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r4 = r4.toString()     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r4 = com.loc.da.a(r11, r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r5 = "ts"
            r0.put(r5, r3)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "scode"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r3 = "encr"
            java.lang.String r4 = "1"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00ee }
            r2.f25625f = r0     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r0 = "loc"
            if (r14 != 0) goto L_0x0076
            java.lang.String r0 = "locf"
        L_0x0076:
            r3 = 1
            r2.m = r3     // Catch:{ Throwable -> 0x00ee }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r5 = "platform=Android&sdkversion=%s&product=%s&loc_channel=%s"
            r6 = 3
            java.lang.Object[] r7 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x00ee }
            r8 = 0
            java.lang.String r9 = "4.2.0"
            r7[r8] = r9     // Catch:{ Throwable -> 0x00ee }
            r7[r3] = r0     // Catch:{ Throwable -> 0x00ee }
            r0 = 2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)     // Catch:{ Throwable -> 0x00ee }
            r7[r0] = r3     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r0 = java.lang.String.format(r4, r5, r7)     // Catch:{ Throwable -> 0x00ee }
            r2.k = r0     // Catch:{ Throwable -> 0x00ee }
            r2.j = r14     // Catch:{ Throwable -> 0x00ee }
            r2.g = r13     // Catch:{ Throwable -> 0x00ee }
            byte[] r12 = com.loc.cn.a((byte[]) r12)     // Catch:{ Throwable -> 0x00ee }
            r2.h = r12     // Catch:{ Throwable -> 0x00ee }
            java.net.Proxy r11 = com.loc.df.a(r11)     // Catch:{ Throwable -> 0x00ee }
            r2.f25471e = r11     // Catch:{ Throwable -> 0x00ee }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ Throwable -> 0x00ee }
            r11.<init>(r1)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r12 = "output"
            java.lang.String r13 = "bin"
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r12 = "policy"
            java.lang.String r13 = "3103"
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x00ee }
            int r12 = r10.f25624f     // Catch:{ Throwable -> 0x00ee }
            switch(r12) {
                case 0: goto L_0x00ca;
                case 1: goto L_0x00c5;
                case 2: goto L_0x00bd;
                default: goto L_0x00bc;
            }     // Catch:{ Throwable -> 0x00ee }
        L_0x00bc:
            goto L_0x00ca
        L_0x00bd:
            java.lang.String r12 = "custom"
            java.lang.String r13 = "language:en"
        L_0x00c1:
            r11.put(r12, r13)     // Catch:{ Throwable -> 0x00ee }
            goto L_0x00cf
        L_0x00c5:
            java.lang.String r12 = "custom"
            java.lang.String r13 = "language:cn"
            goto L_0x00c1
        L_0x00ca:
            java.lang.String r12 = "custom"
            r11.remove(r12)     // Catch:{ Throwable -> 0x00ee }
        L_0x00cf:
            r2.l = r11     // Catch:{ Throwable -> 0x00ee }
            int r11 = r10.f25623e     // Catch:{ Throwable -> 0x00ee }
            r2.f25469c = r11     // Catch:{ Throwable -> 0x00ee }
            int r11 = r10.f25623e     // Catch:{ Throwable -> 0x00ee }
            r2.f25470d = r11     // Catch:{ Throwable -> 0x00ee }
            boolean r11 = r10.f25622d     // Catch:{ Throwable -> 0x00ee }
            if (r11 == 0) goto L_0x00ee
            java.lang.String r11 = r2.c()     // Catch:{ Throwable -> 0x00ee }
            java.lang.String r12 = "http"
            java.lang.String r13 = "https"
            java.lang.String r11 = r11.replace(r12, r13)     // Catch:{ Throwable -> 0x00ee }
            r2.g = r11     // Catch:{ Throwable -> 0x00ee }
            goto L_0x00ee
        L_0x00ec:
            r11 = 0
            r2 = r11
        L_0x00ee:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bz.a(android.content.Context, byte[], java.lang.String, boolean):com.loc.ca");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        return new java.lang.String(com.loc.ah.b(r2), "utf-8");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0047, code lost:
        r3.put(r1, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0050, code lost:
        r3.remove("language");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        r1 = com.loc.da.a();
        r4 = com.loc.da.a(r7, r1, com.loc.di.b((java.util.Map<java.lang.String, java.lang.String>) r3));
        r3.put(com.meizu.cloud.pushsdk.notification.model.TimeDisplaySetting.TIME_DISPLAY_SETTING, r1);
        r3.put("scode", r4);
        r2.b(("output=json&radius=1000&extensions=all&location=" + r10 + "," + r8).getBytes("UTF-8"));
        r2.m = false;
        r2.j = true;
        r2.k = java.lang.String.format(java.util.Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", new java.lang.Object[]{"4.2.0", "loc", 3});
        r2.l = r3;
        r2.f25625f = r0;
        r2.g = "http://restapi.amap.com/v3/geocode/regeo";
        r2.f25471e = com.loc.df.a(r7);
        r2.f25469c = com.loc.ce.f25649f;
        r2.f25470d = com.loc.ce.f25649f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String a(android.content.Context r7, double r8, double r10) {
        /*
            r6 = this;
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ Throwable -> 0x00d6 }
            r1 = 16
            r0.<init>(r1)     // Catch:{ Throwable -> 0x00d6 }
            com.loc.ca r2 = new com.loc.ca     // Catch:{ Throwable -> 0x00d6 }
            com.loc.dh r3 = com.loc.ce.b()     // Catch:{ Throwable -> 0x00d6 }
            r2.<init>(r7, r3)     // Catch:{ Throwable -> 0x00d6 }
            r0.clear()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r3 = "Content-Type"
            java.lang.String r4 = "application/x-www-form-urlencoded"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r3 = "Connection"
            java.lang.String r4 = "Keep-Alive"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r3 = "User-Agent"
            java.lang.String r4 = "AMAP_Location_SDK_Android 4.2.0"
            r0.put(r3, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ Throwable -> 0x00d6 }
            r3.<init>(r1)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r1 = "custom"
            java.lang.String r4 = "26260A1F00020002"
            r3.put(r1, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r1 = "key"
            java.lang.String r4 = com.loc.cy.f(r7)     // Catch:{ Throwable -> 0x00d6 }
            r3.put(r1, r4)     // Catch:{ Throwable -> 0x00d6 }
            int r1 = r6.f25624f     // Catch:{ Throwable -> 0x00d6 }
            switch(r1) {
                case 0: goto L_0x0050;
                case 1: goto L_0x004b;
                case 2: goto L_0x0043;
                default: goto L_0x0042;
            }     // Catch:{ Throwable -> 0x00d6 }
        L_0x0042:
            goto L_0x0050
        L_0x0043:
            java.lang.String r1 = "language"
            java.lang.String r4 = "en"
        L_0x0047:
            r3.put(r1, r4)     // Catch:{ Throwable -> 0x00d6 }
            goto L_0x0055
        L_0x004b:
            java.lang.String r1 = "language"
            java.lang.String r4 = "zh-CN"
            goto L_0x0047
        L_0x0050:
            java.lang.String r1 = "language"
            r3.remove(r1)     // Catch:{ Throwable -> 0x00d6 }
        L_0x0055:
            java.lang.String r1 = com.loc.da.a()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r4 = com.loc.di.b((java.util.Map<java.lang.String, java.lang.String>) r3)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r4 = com.loc.da.a(r7, r1, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r5 = "ts"
            r3.put(r5, r1)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r1 = "scode"
            r3.put(r1, r4)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r4 = "output=json&radius=1000&extensions=all&location="
            r1.<init>(r4)     // Catch:{ Throwable -> 0x00d6 }
            r1.append(r10)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r10 = ","
            r1.append(r10)     // Catch:{ Throwable -> 0x00d6 }
            r1.append(r8)     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r8 = r1.toString()     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r9 = "UTF-8"
            byte[] r8 = r8.getBytes(r9)     // Catch:{ Throwable -> 0x00d6 }
            r2.b(r8)     // Catch:{ Throwable -> 0x00d6 }
            r8 = 0
            r2.m = r8     // Catch:{ Throwable -> 0x00d6 }
            r9 = 1
            r2.j = r9     // Catch:{ Throwable -> 0x00d6 }
            java.util.Locale r10 = java.util.Locale.US     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r11 = "platform=Android&sdkversion=%s&product=%s&loc_channel=%s"
            r1 = 3
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r5 = "4.2.0"
            r4[r8] = r5     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r8 = "loc"
            r4[r9] = r8     // Catch:{ Throwable -> 0x00d6 }
            r8 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r1)     // Catch:{ Throwable -> 0x00d6 }
            r4[r8] = r9     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r8 = java.lang.String.format(r10, r11, r4)     // Catch:{ Throwable -> 0x00d6 }
            r2.k = r8     // Catch:{ Throwable -> 0x00d6 }
            r2.l = r3     // Catch:{ Throwable -> 0x00d6 }
            r2.f25625f = r0     // Catch:{ Throwable -> 0x00d6 }
            java.lang.String r8 = "http://restapi.amap.com/v3/geocode/regeo"
            r2.g = r8     // Catch:{ Throwable -> 0x00d6 }
            java.net.Proxy r7 = com.loc.df.a(r7)     // Catch:{ Throwable -> 0x00d6 }
            r2.f25471e = r7     // Catch:{ Throwable -> 0x00d6 }
            int r7 = com.loc.ce.f25649f     // Catch:{ Throwable -> 0x00d6 }
            r2.f25469c = r7     // Catch:{ Throwable -> 0x00d6 }
            int r7 = com.loc.ce.f25649f     // Catch:{ Throwable -> 0x00d6 }
            r2.f25470d = r7     // Catch:{ Throwable -> 0x00d6 }
            byte[] r7 = com.loc.ah.b(r2)     // Catch:{ Throwable -> 0x00ce }
            java.lang.String r8 = new java.lang.String     // Catch:{ Throwable -> 0x00ce }
            java.lang.String r9 = "utf-8"
            r8.<init>(r7, r9)     // Catch:{ Throwable -> 0x00ce }
            goto L_0x00d7
        L_0x00ce:
            r7 = move-exception
            java.lang.String r8 = "LocNetManager"
            java.lang.String r9 = "post"
            com.loc.ce.a(r7, r8, r9)     // Catch:{ Throwable -> 0x00d6 }
        L_0x00d6:
            r8 = 0
        L_0x00d7:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.loc.bz.a(android.content.Context, double, double):java.lang.String");
    }

    public final void a(long j, boolean z, int i) {
        try {
            this.f25622d = z;
            this.f25623e = Long.valueOf(j).intValue();
            this.f25624f = i;
        } catch (Throwable th) {
            ce.a(th, "netmanager", "setOption");
        }
    }
}
