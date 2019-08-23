package com.amap.api.mapcore2d;

public final class fl {

    /* renamed from: c  reason: collision with root package name */
    private static fl f6144c;

    /* renamed from: a  reason: collision with root package name */
    int f6145a;

    /* renamed from: b  reason: collision with root package name */
    long f6146b;

    /* renamed from: d  reason: collision with root package name */
    private fi f6147d;

    /* renamed from: e  reason: collision with root package name */
    private long f6148e;

    /* renamed from: f  reason: collision with root package name */
    private long f6149f;

    private fl() {
    }

    public static synchronized fl a() {
        fl flVar;
        synchronized (fl.class) {
            if (f6144c == null) {
                f6144c = new fl();
            }
            flVar = f6144c;
        }
        return flVar;
    }

    public static fi b(fi fiVar) {
        return fiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00ee, code lost:
        if ((r9 - r0.f6149f) > 30000) goto L_0x00f0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.amap.api.mapcore2d.fi a(com.amap.api.mapcore2d.fi r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            long r2 = com.amap.api.mapcore2d.gf.b()
            long r4 = r0.f6146b
            long r2 = r2 - r4
            r4 = 30000(0x7530, double:1.4822E-319)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x001c
            r0.f6147d = r1
            long r1 = com.amap.api.mapcore2d.gf.b()
            r0.f6146b = r1
        L_0x0019:
            com.amap.api.mapcore2d.fi r1 = r0.f6147d
            return r1
        L_0x001c:
            long r2 = com.amap.api.mapcore2d.gf.b()
            r0.f6146b = r2
            com.amap.api.mapcore2d.fi r2 = r0.f6147d
            boolean r2 = com.amap.api.mapcore2d.fs.a((com.amap.api.mapcore2d.fi) r2)
            if (r2 == 0) goto L_0x0056
            boolean r2 = com.amap.api.mapcore2d.fs.a((com.amap.api.mapcore2d.fi) r18)
            if (r2 != 0) goto L_0x0031
            goto L_0x0056
        L_0x0031:
            long r2 = r18.getTime()
            com.amap.api.mapcore2d.fi r6 = r0.f6147d
            long r6 = r6.getTime()
            r8 = 1133903872(0x43960000, float:300.0)
            int r9 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x004a
            float r2 = r18.getAccuracy()
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 >= 0) goto L_0x004a
            return r1
        L_0x004a:
            java.lang.String r2 = r18.getProvider()
            java.lang.String r3 = "gps"
            boolean r2 = r2.equalsIgnoreCase(r3)
            if (r2 == 0) goto L_0x005f
        L_0x0056:
            long r2 = com.amap.api.mapcore2d.gf.b()
            r0.f6148e = r2
        L_0x005c:
            r0.f6147d = r1
            goto L_0x0019
        L_0x005f:
            int r2 = r18.c()
            com.amap.api.mapcore2d.fi r3 = r0.f6147d
            int r3 = r3.c()
            if (r2 == r3) goto L_0x006c
            goto L_0x0056
        L_0x006c:
            java.lang.String r2 = r18.getBuildingId()
            com.amap.api.mapcore2d.fi r3 = r0.f6147d
            java.lang.String r3 = r3.getBuildingId()
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L_0x0087
            java.lang.String r2 = r18.getBuildingId()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0087
            goto L_0x0056
        L_0x0087:
            int r2 = r18.getLocationType()
            r0.f6145a = r2
            r2 = 4
            double[] r2 = new double[r2]
            r3 = 0
            double r6 = r18.getLatitude()
            r2[r3] = r6
            r3 = 1
            double r6 = r18.getLongitude()
            r2[r3] = r6
            r3 = 2
            com.amap.api.mapcore2d.fi r6 = r0.f6147d
            double r6 = r6.getLatitude()
            r2[r3] = r6
            r3 = 3
            com.amap.api.mapcore2d.fi r6 = r0.f6147d
            double r6 = r6.getLongitude()
            r2[r3] = r6
            float r2 = com.amap.api.mapcore2d.gf.a((double[]) r2)
            com.amap.api.mapcore2d.fi r3 = r0.f6147d
            float r3 = r3.getAccuracy()
            float r6 = r18.getAccuracy()
            float r7 = r6 - r3
            long r9 = com.amap.api.mapcore2d.gf.b()
            long r11 = r0.f6148e
            long r11 = r9 - r11
            r13 = 1120534528(0x42ca0000, float:101.0)
            r14 = 0
            r16 = 1133871104(0x43958000, float:299.0)
            int r13 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x00d7
            int r13 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x00df
        L_0x00d7:
            int r13 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00fb
            int r13 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x00fb
        L_0x00df:
            long r2 = r0.f6149f
            int r6 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r6 != 0) goto L_0x00e8
            r0.f6149f = r9
            goto L_0x00f8
        L_0x00e8:
            long r2 = r0.f6149f
            long r2 = r9 - r2
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00f8
        L_0x00f0:
            r0.f6148e = r9
            r0.f6147d = r1
            r0.f6149f = r14
            goto L_0x0019
        L_0x00f8:
            com.amap.api.mapcore2d.fi r1 = r0.f6147d
            return r1
        L_0x00fb:
            r13 = 1120403456(0x42c80000, float:100.0)
            int r13 = (r6 > r13 ? 1 : (r6 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0106
            int r13 = (r3 > r16 ? 1 : (r3 == r16 ? 0 : -1))
            if (r13 <= 0) goto L_0x0106
            goto L_0x00f0
        L_0x0106:
            int r13 = (r6 > r16 ? 1 : (r6 == r16 ? 0 : -1))
            if (r13 > 0) goto L_0x010c
            r0.f6149f = r14
        L_0x010c:
            r13 = 1092616192(0x41200000, float:10.0)
            int r13 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r13 >= 0) goto L_0x0139
            double r13 = (double) r2
            r15 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            int r2 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r2 <= 0) goto L_0x0139
            r2 = 1084227584(0x40a00000, float:5.0)
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0139
            r2 = -1013579776(0xffffffffc3960000, float:-300.0)
            int r2 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x012b
            com.amap.api.mapcore2d.fi r1 = r0.f6147d
            return r1
        L_0x012b:
            float r3 = r3 / r6
            r2 = 1073741824(0x40000000, float:2.0)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L_0x0136
            r0.f6148e = r9
            goto L_0x005c
        L_0x0136:
            com.amap.api.mapcore2d.fi r1 = r0.f6147d
            return r1
        L_0x0139:
            int r2 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r2 < 0) goto L_0x0056
            int r2 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
            if (r2 < 0) goto L_0x0143
            goto L_0x0056
        L_0x0143:
            com.amap.api.mapcore2d.fi r1 = r0.f6147d
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.fl.a(com.amap.api.mapcore2d.fi):com.amap.api.mapcore2d.fi");
    }
}
