package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.i;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.g.c;
import java.util.List;

public final class m implements j, l, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4609a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f4610b;

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f4611c;

    /* renamed from: d  reason: collision with root package name */
    private final i.a f4612d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, Float> f4613e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f4614f;
    private final a<?, Float> g;
    @Nullable
    private final a<?, Float> h;
    private final a<?, Float> i;
    @Nullable
    private final a<?, Float> j;
    private final a<?, Float> k;
    @Nullable
    private r l;
    private boolean m;

    public final String b() {
        return this.f4610b;
    }

    public final void a() {
        this.m = false;
        this.f4611c.invalidateSelf();
    }

    /* JADX WARNING: Removed duplicated region for block: B:63:0x02ca  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x02cd  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x02d1  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x02d4  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02d8  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x02db  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x02df  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x02e2  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x02fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.graphics.Path e() {
        /*
            r45 = this;
            r0 = r45
            boolean r1 = r0.m
            if (r1 == 0) goto L_0x0009
            android.graphics.Path r1 = r0.f4609a
            return r1
        L_0x0009:
            android.graphics.Path r1 = r0.f4609a
            r1.reset()
            int[] r1 = com.airbnb.lottie.a.a.m.AnonymousClass1.f4615a
            com.airbnb.lottie.c.b.i$a r2 = r0.f4612d
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r4 = 4636033603912859648(0x4056800000000000, double:90.0)
            r6 = 0
            r9 = 1120403456(0x42c80000, float:100.0)
            switch(r1) {
                case 1: goto L_0x0142;
                case 2: goto L_0x002b;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0353
        L_0x002b:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r1 = r0.f4613e
            java.lang.Object r1 = r1.d()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            double r13 = (double) r1
            double r13 = java.lang.Math.floor(r13)
            int r1 = (int) r13
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r13 = r0.g
            if (r13 != 0) goto L_0x0042
            goto L_0x004f
        L_0x0042:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r6 = r0.g
            java.lang.Object r6 = r6.d()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            double r6 = (double) r6
        L_0x004f:
            r13 = 0
            double r6 = r6 - r4
            double r4 = java.lang.Math.toRadians(r6)
            double r6 = (double) r1
            java.lang.Double.isNaN(r6)
            double r2 = r2 / r6
            float r1 = (float) r2
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r2 = r0.k
            java.lang.Object r2 = r2.d()
            java.lang.Float r2 = (java.lang.Float) r2
            float r2 = r2.floatValue()
            float r2 = r2 / r9
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r3 = r0.i
            java.lang.Object r3 = r3.d()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            double r13 = (double) r3
            double r15 = java.lang.Math.cos(r4)
            java.lang.Double.isNaN(r13)
            double r8 = r13 * r15
            float r8 = (float) r8
            double r15 = java.lang.Math.sin(r4)
            java.lang.Double.isNaN(r13)
            double r10 = r13 * r15
            float r9 = (float) r10
            android.graphics.Path r10 = r0.f4609a
            r10.moveTo(r8, r9)
            double r10 = (double) r1
            java.lang.Double.isNaN(r10)
            double r4 = r4 + r10
            double r6 = java.lang.Math.ceil(r6)
            r18 = r13
            r1 = 0
        L_0x009a:
            double r12 = (double) r1
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 >= 0) goto L_0x012a
            double r12 = java.lang.Math.cos(r4)
            java.lang.Double.isNaN(r18)
            double r13 = r18 * r12
            float r12 = (float) r13
            double r13 = java.lang.Math.sin(r4)
            java.lang.Double.isNaN(r18)
            double r13 = r13 * r18
            float r13 = (float) r13
            r14 = 0
            int r15 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r15 == 0) goto L_0x0110
            double r14 = (double) r9
            r27 = r6
            double r6 = (double) r8
            double r6 = java.lang.Math.atan2(r14, r6)
            r14 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r6 = r6 - r14
            float r6 = (float) r6
            double r6 = (double) r6
            double r14 = java.lang.Math.cos(r6)
            float r14 = (float) r14
            double r6 = java.lang.Math.sin(r6)
            float r6 = (float) r6
            r31 = r4
            double r4 = (double) r13
            r33 = r10
            double r10 = (double) r12
            double r4 = java.lang.Math.atan2(r4, r10)
            r10 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r4 = r4 - r10
            float r4 = (float) r4
            double r4 = (double) r4
            double r10 = java.lang.Math.cos(r4)
            float r7 = (float) r10
            double r4 = java.lang.Math.sin(r4)
            float r4 = (float) r4
            float r5 = r3 * r2
            r10 = 1048576000(0x3e800000, float:0.25)
            float r5 = r5 * r10
            float r14 = r14 * r5
            float r6 = r6 * r5
            float r7 = r7 * r5
            float r5 = r5 * r4
            android.graphics.Path r4 = r0.f4609a
            float r21 = r8 - r14
            float r22 = r9 - r6
            float r23 = r12 + r7
            float r24 = r13 + r5
            r20 = r4
            r25 = r12
            r26 = r13
            r20.cubicTo(r21, r22, r23, r24, r25, r26)
            goto L_0x011b
        L_0x0110:
            r31 = r4
            r27 = r6
            r33 = r10
            android.graphics.Path r4 = r0.f4609a
            r4.lineTo(r12, r13)
        L_0x011b:
            java.lang.Double.isNaN(r33)
            double r4 = r31 + r33
            int r1 = r1 + 1
            r8 = r12
            r9 = r13
            r6 = r27
            r10 = r33
            goto L_0x009a
        L_0x012a:
            com.airbnb.lottie.a.b.a<?, android.graphics.PointF> r1 = r0.f4614f
            java.lang.Object r1 = r1.d()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.Path r2 = r0.f4609a
            float r3 = r1.x
            float r1 = r1.y
            r2.offset(r3, r1)
            android.graphics.Path r1 = r0.f4609a
            r1.close()
            goto L_0x0353
        L_0x0142:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r1 = r0.f4613e
            java.lang.Object r1 = r1.d()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r8 = r0.g
            if (r8 != 0) goto L_0x0153
            goto L_0x0160
        L_0x0153:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r6 = r0.g
            java.lang.Object r6 = r6.d()
            java.lang.Float r6 = (java.lang.Float) r6
            float r6 = r6.floatValue()
            double r6 = (double) r6
        L_0x0160:
            r8 = 0
            double r6 = r6 - r4
            double r4 = java.lang.Math.toRadians(r6)
            double r6 = (double) r1
            java.lang.Double.isNaN(r6)
            double r2 = r2 / r6
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r8 = r2 / r3
            int r10 = (int) r1
            float r10 = (float) r10
            float r1 = r1 - r10
            r10 = 0
            int r11 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r11 == 0) goto L_0x0182
            r10 = 1065353216(0x3f800000, float:1.0)
            float r10 = r10 - r1
            float r10 = r10 * r8
            double r10 = (double) r10
            java.lang.Double.isNaN(r10)
            double r4 = r4 + r10
        L_0x0182:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r10 = r0.i
            java.lang.Object r10 = r10.d()
            java.lang.Float r10 = (java.lang.Float) r10
            float r10 = r10.floatValue()
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r11 = r0.h
            java.lang.Object r11 = r11.d()
            java.lang.Float r11 = (java.lang.Float) r11
            float r11 = r11.floatValue()
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r12 = r0.j
            if (r12 == 0) goto L_0x01ac
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r12 = r0.j
            java.lang.Object r12 = r12.d()
            java.lang.Float r12 = (java.lang.Float) r12
            float r12 = r12.floatValue()
            float r12 = r12 / r9
            goto L_0x01ad
        L_0x01ac:
            r12 = 0
        L_0x01ad:
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r13 = r0.k
            if (r13 == 0) goto L_0x01c0
            com.airbnb.lottie.a.b.a<?, java.lang.Float> r13 = r0.k
            java.lang.Object r13 = r13.d()
            java.lang.Float r13 = (java.lang.Float) r13
            float r13 = r13.floatValue()
            float r9 = r13 / r9
            goto L_0x01c1
        L_0x01c0:
            r9 = 0
        L_0x01c1:
            r13 = 0
            int r14 = (r1 > r13 ? 1 : (r1 == r13 ? 0 : -1))
            if (r14 == 0) goto L_0x01f2
            float r13 = r10 - r11
            float r13 = r13 * r1
            float r13 = r13 + r11
            double r14 = (double) r13
            double r18 = java.lang.Math.cos(r4)
            java.lang.Double.isNaN(r14)
            r35 = r11
            r36 = r12
            double r11 = r14 * r18
            float r11 = (float) r11
            double r18 = java.lang.Math.sin(r4)
            java.lang.Double.isNaN(r14)
            double r14 = r14 * r18
            float r12 = (float) r14
            android.graphics.Path r14 = r0.f4609a
            r14.moveTo(r11, r12)
            float r14 = r2 * r1
            float r14 = r14 / r3
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r4 = r4 + r14
            goto L_0x0217
        L_0x01f2:
            r35 = r11
            r36 = r12
            double r11 = (double) r10
            double r13 = java.lang.Math.cos(r4)
            java.lang.Double.isNaN(r11)
            double r13 = r13 * r11
            float r13 = (float) r13
            double r14 = java.lang.Math.sin(r4)
            java.lang.Double.isNaN(r11)
            double r11 = r11 * r14
            float r12 = (float) r11
            android.graphics.Path r11 = r0.f4609a
            r11.moveTo(r13, r12)
            double r14 = (double) r8
            java.lang.Double.isNaN(r14)
            double r4 = r4 + r14
            r11 = r13
            r13 = 0
        L_0x0217:
            double r6 = java.lang.Math.ceil(r6)
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r6 = r6 * r14
            r18 = r4
            r4 = 0
            r17 = 0
        L_0x0224:
            double r14 = (double) r4
            int r5 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r5 >= 0) goto L_0x033d
            if (r17 == 0) goto L_0x022f
            r5 = r10
        L_0x022c:
            r16 = 0
            goto L_0x0232
        L_0x022f:
            r5 = r35
            goto L_0x022c
        L_0x0232:
            int r20 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r20 == 0) goto L_0x0245
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r22 = r6 - r20
            int r16 = (r14 > r22 ? 1 : (r14 == r22 ? 0 : -1))
            if (r16 != 0) goto L_0x0247
            float r16 = r2 * r1
            float r16 = r16 / r3
            r3 = r16
            goto L_0x0248
        L_0x0245:
            r20 = 4611686018427387904(0x4000000000000000, double:2.0)
        L_0x0247:
            r3 = r8
        L_0x0248:
            r22 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            r16 = 0
            int r24 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r24 == 0) goto L_0x025c
            double r24 = r6 - r22
            int r16 = (r14 > r24 ? 1 : (r14 == r24 ? 0 : -1))
            if (r16 != 0) goto L_0x025c
            r37 = r2
            r38 = r3
            r5 = r13
            goto L_0x0260
        L_0x025c:
            r37 = r2
            r38 = r3
        L_0x0260:
            double r2 = (double) r5
            double r24 = java.lang.Math.cos(r18)
            java.lang.Double.isNaN(r2)
            r39 = r13
            r40 = r14
            double r13 = r2 * r24
            float r5 = (float) r13
            double r13 = java.lang.Math.sin(r18)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r13
            float r2 = (float) r2
            r3 = 0
            int r13 = (r36 > r3 ? 1 : (r36 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0292
            int r13 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r13 != 0) goto L_0x0292
            android.graphics.Path r3 = r0.f4609a
            r3.lineTo(r5, r2)
            r42 = r8
            r43 = r9
            r44 = r10
            r3 = r38
            r8 = 0
            goto L_0x0323
        L_0x0292:
            double r13 = (double) r12
            r42 = r8
            r43 = r9
            double r8 = (double) r11
            double r8 = java.lang.Math.atan2(r13, r8)
            r13 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r8 = r8 - r13
            float r3 = (float) r8
            double r8 = (double) r3
            double r13 = java.lang.Math.cos(r8)
            float r3 = (float) r13
            double r8 = java.lang.Math.sin(r8)
            float r8 = (float) r8
            double r13 = (double) r2
            r44 = r10
            double r9 = (double) r5
            double r9 = java.lang.Math.atan2(r13, r9)
            r13 = 4609753056924675352(0x3ff921fb54442d18, double:1.5707963267948966)
            double r9 = r9 - r13
            float r9 = (float) r9
            double r9 = (double) r9
            double r13 = java.lang.Math.cos(r9)
            float r13 = (float) r13
            double r9 = java.lang.Math.sin(r9)
            float r9 = (float) r9
            if (r17 == 0) goto L_0x02cd
            r10 = r36
            goto L_0x02cf
        L_0x02cd:
            r10 = r43
        L_0x02cf:
            if (r17 == 0) goto L_0x02d4
            r14 = r43
            goto L_0x02d6
        L_0x02d4:
            r14 = r36
        L_0x02d6:
            if (r17 == 0) goto L_0x02db
            r15 = r35
            goto L_0x02dd
        L_0x02db:
            r15 = r44
        L_0x02dd:
            if (r17 == 0) goto L_0x02e2
            r16 = r44
            goto L_0x02e4
        L_0x02e2:
            r16 = r35
        L_0x02e4:
            float r15 = r15 * r10
            r10 = 1056236141(0x3ef4e26d, float:0.47829)
            float r15 = r15 * r10
            float r3 = r3 * r15
            float r15 = r15 * r8
            float r16 = r16 * r14
            float r16 = r16 * r10
            float r13 = r13 * r16
            float r16 = r16 * r9
            r8 = 0
            int r9 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r9 == 0) goto L_0x030e
            if (r4 != 0) goto L_0x0303
            float r3 = r3 * r1
            float r15 = r15 * r1
            goto L_0x030e
        L_0x0303:
            r9 = 0
            double r9 = r6 - r22
            int r14 = (r40 > r9 ? 1 : (r40 == r9 ? 0 : -1))
            if (r14 != 0) goto L_0x030e
            float r13 = r13 * r1
            float r16 = r16 * r1
        L_0x030e:
            android.graphics.Path r9 = r0.f4609a
            float r25 = r11 - r3
            float r26 = r12 - r15
            float r27 = r5 + r13
            float r28 = r2 + r16
            r24 = r9
            r29 = r5
            r30 = r2
            r24.cubicTo(r25, r26, r27, r28, r29, r30)
            r3 = r38
        L_0x0323:
            double r9 = (double) r3
            java.lang.Double.isNaN(r9)
            double r18 = r18 + r9
            r17 = r17 ^ 1
            int r4 = r4 + 1
            r12 = r2
            r11 = r5
            r2 = r37
            r13 = r39
            r8 = r42
            r9 = r43
            r10 = r44
            r3 = 1073741824(0x40000000, float:2.0)
            goto L_0x0224
        L_0x033d:
            com.airbnb.lottie.a.b.a<?, android.graphics.PointF> r1 = r0.f4614f
            java.lang.Object r1 = r1.d()
            android.graphics.PointF r1 = (android.graphics.PointF) r1
            android.graphics.Path r2 = r0.f4609a
            float r3 = r1.x
            float r1 = r1.y
            r2.offset(r3, r1)
            android.graphics.Path r1 = r0.f4609a
            r1.close()
        L_0x0353:
            android.graphics.Path r1 = r0.f4609a
            r1.close()
            android.graphics.Path r1 = r0.f4609a
            com.airbnb.lottie.a.a.r r2 = r0.l
            com.airbnb.lottie.f.f.a(r1, r2)
            r1 = 1
            r0.m = r1
            android.graphics.Path r1 = r0.f4609a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.m.e():android.graphics.Path");
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f4638a == q.a.Simultaneously) {
                    this.l = rVar;
                    this.l.a(this);
                }
            }
        }
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        if (t == com.airbnb.lottie.i.o) {
            this.f4613e.a(cVar);
        } else if (t == com.airbnb.lottie.i.p) {
            this.g.a(cVar);
        } else if (t == com.airbnb.lottie.i.h) {
            this.f4614f.a(cVar);
        } else if (t == com.airbnb.lottie.i.q && this.h != null) {
            this.h.a(cVar);
        } else if (t == com.airbnb.lottie.i.r) {
            this.i.a(cVar);
        } else if (t != com.airbnb.lottie.i.s || this.j == null) {
            if (t == com.airbnb.lottie.i.t) {
                this.k.a(cVar);
            }
        } else {
            this.j.a(cVar);
        }
    }

    public m(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, i iVar) {
        this.f4611c = lottieDrawable;
        this.f4610b = iVar.f4726a;
        this.f4612d = iVar.f4727b;
        this.f4613e = iVar.f4728c.a();
        this.f4614f = iVar.f4729d.a();
        this.g = iVar.f4730e.a();
        this.i = iVar.g.a();
        this.k = iVar.i.a();
        if (this.f4612d == i.a.Star) {
            this.h = iVar.f4731f.a();
            this.j = iVar.h.a();
        } else {
            this.h = null;
            this.j = null;
        }
        aVar.a(this.f4613e);
        aVar.a(this.f4614f);
        aVar.a(this.g);
        aVar.a(this.i);
        aVar.a(this.k);
        if (this.f4612d == i.a.Star) {
            aVar.a(this.h);
            aVar.a(this.j);
        }
        this.f4613e.a((a.C0033a) this);
        this.f4614f.a((a.C0033a) this);
        this.g.a((a.C0033a) this);
        this.i.a((a.C0033a) this);
        this.k.a((a.C0033a) this);
        if (this.f4612d == i.a.Star) {
            this.h.a((a.C0033a) this);
            this.j.a((a.C0033a) this);
        }
    }

    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        com.airbnb.lottie.f.e.a(eVar, i2, list, eVar2, this);
    }
}
