package com.amap.api.mapcore2d;

import android.graphics.Point;
import android.graphics.PointF;
import com.amap.api.mapcore2d.az;

public class av {

    /* renamed from: a  reason: collision with root package name */
    public int f5643a = 256;

    /* renamed from: b  reason: collision with root package name */
    public int f5644b = 256;

    /* renamed from: c  reason: collision with root package name */
    float f5645c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    public double f5646d = 156543.0339d;

    /* renamed from: e  reason: collision with root package name */
    int f5647e;

    /* renamed from: f  reason: collision with root package name */
    double f5648f = -2.003750834E7d;
    double g = 2.003750834E7d;
    public int h = q.f6269d;
    public int i = q.f6268c;
    public float j = 10.0f;
    public double k;
    public w l;
    public w m;
    public Point n;
    public a o;
    az.c p;
    private double q = 116.39716d;
    private double r = 39.91669d;
    private double s = 0.01745329251994329d;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        float f5649a;

        /* renamed from: b  reason: collision with root package name */
        float f5650b;

        /* renamed from: c  reason: collision with root package name */
        float f5651c;

        /* renamed from: d  reason: collision with root package name */
        float f5652d;

        a() {
        }
    }

    public void a() {
        double d2 = (double) this.f5643a;
        Double.isNaN(d2);
        this.f5646d = (this.g * 2.0d) / d2;
        int i2 = (int) this.j;
        double d3 = this.f5646d;
        double d4 = (double) (1 << i2);
        Double.isNaN(d4);
        double d5 = d3 / d4;
        double d6 = (double) ((this.j + 1.0f) - ((float) i2));
        Double.isNaN(d6);
        this.k = d5 / d6;
        w wVar = new w(this.r, this.q, true);
        this.l = a(wVar);
        this.m = this.l.g();
        this.n = new Point(this.p.c() / 2, this.p.d() / 2);
        this.o = new a();
        this.o.f5649a = -2.0037508E7f;
        this.o.f5650b = 2.0037508E7f;
        this.o.f5651c = 2.0037508E7f;
        this.o.f5652d = -2.0037508E7f;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x010f A[Catch:{ Error -> 0x00ff }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0169 A[LOOP:0: B:9:0x009a->B:45:0x0169, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0173 A[EDGE_INSN: B:47:0x0173->B:46:0x0173 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0102 A[EDGE_INSN: B:48:0x0102->B:27:0x0102 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.ArrayList<com.amap.api.mapcore2d.bs> a(com.amap.api.mapcore2d.w r21, int r22, int r23, int r24) {
        /*
            r20 = this;
            r9 = r20
            java.lang.String r10 = "getTilesInDomain"
            double r5 = r9.k
            double r0 = r21.e()
            double r2 = r9.f5648f
            double r0 = r0 - r2
            int r2 = r9.f5643a
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r5
            double r0 = r0 / r2
            int r0 = (int) r0
            int r1 = r9.f5643a
            int r1 = r1 * r0
            double r1 = (double) r1
            java.lang.Double.isNaN(r1)
            double r1 = r1 * r5
            double r3 = r9.f5648f
            double r14 = r1 + r3
            int r1 = r9.f5647e
            r17 = 0
            r8 = 1
            if (r1 != 0) goto L_0x004d
            double r1 = r9.g
            double r3 = r21.f()
            double r1 = r1 - r3
            int r3 = r9.f5643a
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            double r1 = r1 / r3
            int r1 = (int) r1
            double r2 = r9.g
            int r4 = r9.f5643a
            int r4 = r4 * r1
            double r11 = (double) r4
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r5
            double r2 = r2 - r11
        L_0x004a:
            r7 = r1
            r12 = r2
            goto L_0x0073
        L_0x004d:
            int r1 = r9.f5647e
            if (r1 != r8) goto L_0x006f
            double r1 = r21.f()
            double r3 = r9.g
            double r1 = r1 - r3
            int r3 = r9.f5643a
            double r3 = (double) r3
            java.lang.Double.isNaN(r3)
            double r3 = r3 * r5
            double r1 = r1 / r3
            int r1 = (int) r1
            int r2 = r1 + 1
            int r3 = r9.f5643a
            int r2 = r2 * r3
            double r2 = (double) r2
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r5
            goto L_0x004a
        L_0x006f:
            r1 = 0
            r12 = r1
            r7 = 0
        L_0x0073:
            com.amap.api.mapcore2d.w r2 = new com.amap.api.mapcore2d.w
            r16 = 0
            r11 = r2
            r11.<init>(r12, r14, r16)
            android.graphics.Point r4 = r9.n
            r1 = r20
            r3 = r21
            android.graphics.PointF r11 = r1.a((com.amap.api.mapcore2d.w) r2, (com.amap.api.mapcore2d.w) r3, (android.graphics.Point) r4, (double) r5)
            com.amap.api.mapcore2d.bs r1 = new com.amap.api.mapcore2d.bs
            int r2 = r20.b()
            r12 = -1
            r1.<init>(r0, r7, r2, r12)
            r1.g = r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r13.add(r1)
            r14 = 1
        L_0x009a:
            int r15 = r0 - r14
            r6 = r15
            r16 = 0
        L_0x009f:
            int r5 = r0 + r14
            if (r6 > r5) goto L_0x0102
            int r5 = r7 + r14
            r1 = r20
            r2 = r6
            r3 = r5
            r4 = r0
            r12 = r5
            r5 = r7
            r9 = r6
            r6 = r11
            r18 = r7
            r7 = r23
            r19 = 1
            r8 = r24
            android.graphics.PointF r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Error -> 0x00ff }
            if (r1 == 0) goto L_0x00cf
            if (r16 != 0) goto L_0x00c0
            r16 = 1
        L_0x00c0:
            com.amap.api.mapcore2d.bs r2 = new com.amap.api.mapcore2d.bs     // Catch:{ Error -> 0x00ff }
            int r3 = r20.b()     // Catch:{ Error -> 0x00ff }
            r4 = -1
            r2.<init>(r9, r12, r3, r4)     // Catch:{ Error -> 0x00ff }
            r2.g = r1     // Catch:{ Error -> 0x00ff }
            r13.add(r2)     // Catch:{ Error -> 0x00ff }
        L_0x00cf:
            int r12 = r18 - r14
            r1 = r20
            r2 = r9
            r3 = r12
            r4 = r0
            r5 = r18
            r6 = r11
            r7 = r23
            r8 = r24
            android.graphics.PointF r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Error -> 0x00ff }
            if (r1 == 0) goto L_0x00f6
            if (r16 != 0) goto L_0x00e7
            r16 = 1
        L_0x00e7:
            com.amap.api.mapcore2d.bs r2 = new com.amap.api.mapcore2d.bs     // Catch:{ Error -> 0x00ff }
            int r3 = r20.b()     // Catch:{ Error -> 0x00ff }
            r4 = -1
            r2.<init>(r9, r12, r3, r4)     // Catch:{ Error -> 0x00ff }
            r2.g = r1     // Catch:{ Error -> 0x00ff }
            r13.add(r2)     // Catch:{ Error -> 0x00ff }
        L_0x00f6:
            int r6 = r9 + 1
            r7 = r18
            r8 = 1
            r9 = r20
            r12 = -1
            goto L_0x009f
        L_0x00ff:
            r0 = move-exception
            goto L_0x0160
        L_0x0102:
            r18 = r7
            r19 = 1
            int r7 = r18 + r14
            int r7 = r7 + -1
            r9 = r7
        L_0x010b:
            int r7 = r18 - r14
            if (r9 <= r7) goto L_0x0166
            r1 = r20
            r2 = r5
            r3 = r9
            r4 = r0
            r12 = r5
            r5 = r18
            r6 = r11
            r7 = r23
            r8 = r24
            android.graphics.PointF r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Error -> 0x00ff }
            if (r1 == 0) goto L_0x0135
            if (r16 != 0) goto L_0x0126
            r16 = 1
        L_0x0126:
            com.amap.api.mapcore2d.bs r2 = new com.amap.api.mapcore2d.bs     // Catch:{ Error -> 0x00ff }
            int r3 = r20.b()     // Catch:{ Error -> 0x00ff }
            r4 = -1
            r2.<init>(r12, r9, r3, r4)     // Catch:{ Error -> 0x00ff }
            r2.g = r1     // Catch:{ Error -> 0x00ff }
            r13.add(r2)     // Catch:{ Error -> 0x00ff }
        L_0x0135:
            r1 = r20
            r2 = r15
            r3 = r9
            r4 = r0
            r5 = r18
            r6 = r11
            r7 = r23
            r8 = r24
            android.graphics.PointF r1 = r1.a(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ Error -> 0x00ff }
            if (r1 == 0) goto L_0x015b
            if (r16 != 0) goto L_0x014b
            r16 = 1
        L_0x014b:
            com.amap.api.mapcore2d.bs r2 = new com.amap.api.mapcore2d.bs     // Catch:{ Error -> 0x00ff }
            int r3 = r20.b()     // Catch:{ Error -> 0x00ff }
            r4 = -1
            r2.<init>(r15, r9, r3, r4)     // Catch:{ Error -> 0x00ff }
            r2.g = r1     // Catch:{ Error -> 0x00ff }
            r13.add(r2)     // Catch:{ Error -> 0x00ff }
            goto L_0x015c
        L_0x015b:
            r4 = -1
        L_0x015c:
            int r9 = r9 + -1
            r5 = r12
            goto L_0x010b
        L_0x0160:
            java.lang.String r1 = "MapProjection"
            com.amap.api.mapcore2d.cm.a(r0, r1, r10)
            goto L_0x0173
        L_0x0166:
            r4 = -1
            if (r16 == 0) goto L_0x0173
            int r14 = r14 + 1
            r7 = r18
            r8 = 1
            r9 = r20
            r12 = -1
            goto L_0x009a
        L_0x0173:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.av.a(com.amap.api.mapcore2d.w, int, int, int):java.util.ArrayList");
    }

    /* access modifiers changed from: package-private */
    public int b() {
        int i2 = (int) this.j;
        if (((double) (this.j - ((float) i2))) < az.f5663a) {
            return i2;
        }
        return i2 + 1;
    }

    public void a(Point point) {
        this.n = point;
    }

    public av(az.c cVar) {
        this.p = cVar;
    }

    public w b(w wVar) {
        if (wVar == null) {
            return null;
        }
        double f2 = (double) ((float) ((wVar.f() * 180.0d) / 2.003750834E7d));
        Double.isNaN(f2);
        double atan = (double) ((float) (((Math.atan(Math.exp((f2 * 3.141592653589793d) / 180.0d)) * 2.0d) - 1.5707963267948966d) * 57.29577951308232d));
        Double.isNaN(atan);
        int i2 = (int) (atan * 1000000.0d);
        double e2 = (double) ((float) ((wVar.e() * 180.0d) / 2.003750834E7d));
        Double.isNaN(e2);
        return new w(i2, (int) (e2 * 1000000.0d));
    }

    public w a(w wVar) {
        if (wVar == null) {
            return null;
        }
        double b2 = (double) wVar.b();
        Double.isNaN(b2);
        double a2 = (double) wVar.a();
        Double.isNaN(a2);
        w wVar2 = new w(((Math.log(Math.tan((((b2 / 1000000.0d) + 90.0d) * 3.141592653589793d) / 360.0d)) / 0.017453292519943295d) * 2.003750834E7d) / 180.0d, ((a2 / 1000000.0d) * 2.003750834E7d) / 180.0d, false);
        return wVar2;
    }

    public w a(PointF pointF, PointF pointF2) {
        double[] b2 = b(pointF, pointF2);
        w wVar = new w(this.l.b(), this.l.a());
        wVar.b(b2[1]);
        wVar.a(b2[0]);
        return wVar;
    }

    public PointF a(int i2, int i3) {
        double d2;
        double d3;
        double d4 = (double) (this.f5643a * i2);
        double d5 = this.k;
        Double.isNaN(d4);
        double d6 = (d4 * d5) + this.f5648f;
        if (this.f5647e == 0) {
            double d7 = this.g;
            double d8 = (double) (i3 * this.f5643a);
            double d9 = this.k;
            Double.isNaN(d8);
            d2 = d7 - (d8 * d9);
        } else {
            if (this.f5647e == 1) {
                double d10 = (double) ((i3 + 1) * this.f5643a);
                double d11 = this.k;
                Double.isNaN(d10);
                d3 = d10 * d11;
            } else {
                d3 = 0.0d;
            }
            d2 = d3;
        }
        w wVar = new w(d2, d6, false);
        return a(wVar, this.l, this.n, this.k);
    }

    private double[] b(PointF pointF, PointF pointF2) {
        double d2 = this.k;
        w b2 = b(pointF, this.l, this.n, d2, this.o);
        w b3 = b(pointF2, this.l, this.n, d2, this.o);
        double e2 = b3.e() - b2.e();
        double f2 = b3.f() - b2.f();
        double e3 = this.l.e() + e2;
        double f3 = this.l.f() + f2;
        while (e3 < ((double) this.o.f5649a)) {
            double d3 = (double) (this.o.f5650b - this.o.f5649a);
            Double.isNaN(d3);
            e3 += d3;
        }
        while (e3 > ((double) this.o.f5650b)) {
            double d4 = (double) (this.o.f5650b - this.o.f5649a);
            Double.isNaN(d4);
            e3 -= d4;
        }
        while (f3 < ((double) this.o.f5652d)) {
            double d5 = (double) (this.o.f5651c - this.o.f5652d);
            Double.isNaN(d5);
            f3 += d5;
        }
        while (f3 > ((double) this.o.f5651c)) {
            double d6 = (double) (this.o.f5651c - this.o.f5652d);
            Double.isNaN(d6);
            f3 -= d6;
        }
        return new double[]{e3, f3};
    }

    public float a(w wVar, w wVar2) {
        if (wVar == null || wVar2 == null) {
            return 0.0f;
        }
        double a2 = r.a(wVar.c());
        double a3 = r.a(wVar.d());
        double a4 = r.a(wVar2.c());
        double a5 = r.a(wVar2.d());
        double d2 = a2 * this.s;
        double d3 = a3 * this.s;
        double d4 = a4 * this.s;
        double d5 = a5 * this.s;
        double sin = Math.sin(d2);
        double sin2 = Math.sin(d3);
        double cos = Math.cos(d2);
        double cos2 = Math.cos(d3);
        double sin3 = Math.sin(d4);
        double sin4 = Math.sin(d5);
        double cos3 = Math.cos(d4);
        double cos4 = Math.cos(d5);
        double d6 = sin4;
        double[] dArr = {cos * cos2, cos2 * sin, sin2};
        double[] dArr2 = {cos3 * cos4, cos4 * sin3, d6};
        return (float) (Math.asin(Math.sqrt((((dArr[0] - dArr2[0]) * (dArr[0] - dArr2[0])) + ((dArr[1] - dArr2[1]) * (dArr[1] - dArr2[1]))) + ((dArr[2] - dArr2[2]) * (dArr[2] - dArr2[2]))) / 2.0d) * 1.27420015798544E7d);
    }

    public void a(PointF pointF, PointF pointF2, float f2) {
        if (this.l != null) {
            double[] b2 = b(pointF, pointF2);
            this.l.b(b2[1]);
            this.l.a(b2[0]);
        }
    }

    public PointF b(w wVar, w wVar2, Point point, double d2) {
        if (this.p == null || wVar == null || wVar2 == null || point == null) {
            return null;
        }
        return this.p.g().b(a(a(wVar), wVar2, point, d2));
    }

    /* access modifiers changed from: package-private */
    public PointF a(w wVar, w wVar2, Point point, double d2) {
        PointF pointF;
        if (wVar == null || wVar2 == null) {
            return null;
        }
        try {
            pointF = new PointF();
            try {
                double e2 = (wVar.e() - wVar2.e()) / d2;
                double d3 = (double) point.x;
                Double.isNaN(d3);
                pointF.x = (float) (e2 + d3);
                double d4 = (double) point.y;
                Double.isNaN(d4);
                pointF.y = (float) (d4 - ((wVar.f() - wVar2.f()) / d2));
            } catch (Throwable th) {
                th = th;
            }
        } catch (Throwable th2) {
            th = th2;
            pointF = null;
            cm.a(th, "MapProjection", "convertProjectionToScreen");
            return pointF;
        }
        return pointF;
    }

    public w a(PointF pointF, w wVar, Point point, double d2, a aVar) {
        return b(b(pointF, wVar, point, d2, aVar));
    }

    /* access modifiers changed from: package-private */
    public w b(PointF pointF, w wVar, Point point, double d2, a aVar) {
        if (this.p == null || pointF == null || wVar == null || point == null || aVar == null) {
            return null;
        }
        PointF c2 = this.p.g().c(pointF);
        float f2 = c2.x - ((float) point.x);
        double e2 = wVar.e();
        double d3 = (double) f2;
        Double.isNaN(d3);
        double d4 = e2 + (d3 * d2);
        double f3 = wVar.f();
        double d5 = (double) (c2.y - ((float) point.y));
        Double.isNaN(d5);
        double d6 = f3 - (d5 * d2);
        while (d4 < ((double) aVar.f5649a)) {
            double d7 = (double) (aVar.f5650b - aVar.f5649a);
            Double.isNaN(d7);
            d4 += d7;
        }
        double d8 = d4;
        while (d8 > ((double) aVar.f5650b)) {
            double d9 = (double) (aVar.f5650b - aVar.f5649a);
            Double.isNaN(d9);
            d8 -= d9;
        }
        while (d6 < ((double) aVar.f5652d)) {
            double d10 = (double) (aVar.f5651c - aVar.f5652d);
            Double.isNaN(d10);
            d6 += d10;
        }
        double d11 = d6;
        while (d11 > ((double) aVar.f5651c)) {
            double d12 = (double) (aVar.f5651c - aVar.f5652d);
            Double.isNaN(d12);
            d11 -= d12;
        }
        w wVar2 = new w(d11, d8, false);
        return wVar2;
    }

    /* access modifiers changed from: package-private */
    public PointF a(int i2, int i3, int i4, int i5, PointF pointF, int i6, int i7) {
        PointF pointF2 = new PointF();
        pointF2.x = ((float) ((i2 - i4) * this.f5643a)) + pointF.x;
        if (this.f5647e == 0) {
            pointF2.y = ((float) ((i3 - i5) * this.f5643a)) + pointF.y;
        } else if (this.f5647e == 1) {
            pointF2.y = pointF.y - ((float) ((i3 - i5) * this.f5643a));
        }
        if (pointF2.x + ((float) this.f5643a) <= 0.0f || pointF2.x >= ((float) i6) || pointF2.y + ((float) this.f5643a) <= 0.0f || pointF2.y >= ((float) i7)) {
            return null;
        }
        return pointF2;
    }
}
