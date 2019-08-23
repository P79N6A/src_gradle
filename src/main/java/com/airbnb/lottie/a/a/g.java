package com.airbnb.lottie.a.a;

import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.c.b.d;
import com.airbnb.lottie.c.b.f;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.List;

public final class g implements d, j, a.C0033a {
    @NonNull

    /* renamed from: a  reason: collision with root package name */
    private final String f4591a;

    /* renamed from: b  reason: collision with root package name */
    private final com.airbnb.lottie.c.c.a f4592b;

    /* renamed from: c  reason: collision with root package name */
    private final LongSparseArray<LinearGradient> f4593c = new LongSparseArray<>();

    /* renamed from: d  reason: collision with root package name */
    private final LongSparseArray<RadialGradient> f4594d = new LongSparseArray<>();

    /* renamed from: e  reason: collision with root package name */
    private final Matrix f4595e = new Matrix();

    /* renamed from: f  reason: collision with root package name */
    private final Path f4596f = new Path();
    private final Paint g = new Paint(1);
    private final RectF h = new RectF();
    private final List<l> i = new ArrayList();
    private final f j;
    private final a<c, c> k;
    private final a<Integer, Integer> l;
    private final a<PointF, PointF> m;
    private final a<PointF, PointF> n;
    @Nullable
    private a<ColorFilter, ColorFilter> o;
    private final LottieDrawable p;
    private final int q;

    public final String b() {
        return this.f4591a;
    }

    public final void a() {
        this.p.invalidateSelf();
    }

    private int c() {
        int i2;
        int round = Math.round(this.m.f4646c * ((float) this.q));
        int round2 = Math.round(this.n.f4646c * ((float) this.q));
        int round3 = Math.round(this.k.f4646c * ((float) this.q));
        if (round != 0) {
            i2 = round * 527;
        } else {
            i2 = 17;
        }
        if (round2 != 0) {
            i2 = i2 * 31 * round2;
        }
        if (round3 != 0) {
            return i2 * 31 * round3;
        }
        return i2;
    }

    public final <T> void a(T t, @Nullable com.airbnb.lottie.g.c<T> cVar) {
        if (t == i.x) {
            if (cVar == null) {
                this.o = null;
                return;
            }
            this.o = new p(cVar);
            this.o.a((a.C0033a) this);
            this.f4592b.a(this.o);
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.f4596f.reset();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.f4596f.addPath(this.i.get(i2).e(), matrix);
        }
        this.f4596f.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.i.add((l) bVar);
            }
        }
    }

    public g(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, d dVar) {
        this.f4592b = aVar;
        this.f4591a = dVar.g;
        this.p = lottieDrawable;
        this.j = dVar.f4709a;
        this.f4596f.setFillType(dVar.f4710b);
        this.q = (int) (lottieDrawable.getComposition().getDuration() / 32.0f);
        this.k = dVar.f4711c.a();
        this.k.a((a.C0033a) this);
        aVar.a(this.k);
        this.l = dVar.f4712d.a();
        this.l.a((a.C0033a) this);
        aVar.a(this.l);
        this.m = dVar.f4713e.a();
        this.m.a((a.C0033a) this);
        aVar.a(this.m);
        this.n = dVar.f4714f.a();
        this.n.a((a.C0033a) this);
        aVar.a(this.n);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.graphics.LinearGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v29, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v31, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.graphics.RadialGradient} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v32, resolved type: android.graphics.RadialGradient} */
    /* JADX WARNING: type inference failed for: r3v24, types: [android.graphics.LinearGradient] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(android.graphics.Canvas r17, android.graphics.Matrix r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r18
            java.lang.String r2 = "GradientFillContent#draw"
            com.airbnb.lottie.d.b(r2)
            android.graphics.Path r2 = r0.f4596f
            r2.reset()
            r2 = 0
            r3 = 0
        L_0x0010:
            java.util.List<com.airbnb.lottie.a.a.l> r4 = r0.i
            int r4 = r4.size()
            if (r3 >= r4) goto L_0x002c
            android.graphics.Path r4 = r0.f4596f
            java.util.List<com.airbnb.lottie.a.a.l> r5 = r0.i
            java.lang.Object r5 = r5.get(r3)
            com.airbnb.lottie.a.a.l r5 = (com.airbnb.lottie.a.a.l) r5
            android.graphics.Path r5 = r5.e()
            r4.addPath(r5, r1)
            int r3 = r3 + 1
            goto L_0x0010
        L_0x002c:
            android.graphics.Path r3 = r0.f4596f
            android.graphics.RectF r4 = r0.h
            r3.computeBounds(r4, r2)
            com.airbnb.lottie.c.b.f r3 = r0.j
            com.airbnb.lottie.c.b.f r4 = com.airbnb.lottie.c.b.f.Linear
            if (r3 != r4) goto L_0x007d
            int r3 = r16.c()
            android.support.v4.util.LongSparseArray<android.graphics.LinearGradient> r4 = r0.f4593c
            long r5 = (long) r3
            java.lang.Object r3 = r4.get(r5)
            android.graphics.LinearGradient r3 = (android.graphics.LinearGradient) r3
            if (r3 == 0) goto L_0x004a
            goto L_0x00c7
        L_0x004a:
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.m
            java.lang.Object r3 = r3.d()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.n
            java.lang.Object r4 = r4.d()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.a<com.airbnb.lottie.c.b.c, com.airbnb.lottie.c.b.c> r7 = r0.k
            java.lang.Object r7 = r7.d()
            com.airbnb.lottie.c.b.c r7 = (com.airbnb.lottie.c.b.c) r7
            int[] r13 = r7.f4708b
            float[] r14 = r7.f4707a
            android.graphics.LinearGradient r7 = new android.graphics.LinearGradient
            float r9 = r3.x
            float r10 = r3.y
            float r11 = r4.x
            float r12 = r4.y
            android.graphics.Shader$TileMode r15 = android.graphics.Shader.TileMode.CLAMP
            r8 = r7
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            android.support.v4.util.LongSparseArray<android.graphics.LinearGradient> r3 = r0.f4593c
            r3.put(r5, r7)
            r3 = r7
            goto L_0x00c7
        L_0x007d:
            int r3 = r16.c()
            android.support.v4.util.LongSparseArray<android.graphics.RadialGradient> r4 = r0.f4594d
            long r5 = (long) r3
            java.lang.Object r3 = r4.get(r5)
            android.graphics.RadialGradient r3 = (android.graphics.RadialGradient) r3
            if (r3 == 0) goto L_0x008d
            goto L_0x00c7
        L_0x008d:
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r3 = r0.m
            java.lang.Object r3 = r3.d()
            android.graphics.PointF r3 = (android.graphics.PointF) r3
            com.airbnb.lottie.a.b.a<android.graphics.PointF, android.graphics.PointF> r4 = r0.n
            java.lang.Object r4 = r4.d()
            android.graphics.PointF r4 = (android.graphics.PointF) r4
            com.airbnb.lottie.a.b.a<com.airbnb.lottie.c.b.c, com.airbnb.lottie.c.b.c> r7 = r0.k
            java.lang.Object r7 = r7.d()
            com.airbnb.lottie.c.b.c r7 = (com.airbnb.lottie.c.b.c) r7
            int[] r12 = r7.f4708b
            float[] r13 = r7.f4707a
            float r9 = r3.x
            float r10 = r3.y
            float r3 = r4.x
            float r4 = r4.y
            float r3 = r3 - r9
            double r7 = (double) r3
            float r4 = r4 - r10
            double r3 = (double) r4
            double r3 = java.lang.Math.hypot(r7, r3)
            float r11 = (float) r3
            android.graphics.RadialGradient r3 = new android.graphics.RadialGradient
            android.graphics.Shader$TileMode r14 = android.graphics.Shader.TileMode.CLAMP
            r8 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14)
            android.support.v4.util.LongSparseArray<android.graphics.RadialGradient> r4 = r0.f4594d
            r4.put(r5, r3)
        L_0x00c7:
            android.graphics.Matrix r4 = r0.f4595e
            r4.set(r1)
            android.graphics.Matrix r1 = r0.f4595e
            r3.setLocalMatrix(r1)
            android.graphics.Paint r1 = r0.g
            r1.setShader(r3)
            com.airbnb.lottie.a.b.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r1 = r0.o
            if (r1 == 0) goto L_0x00e7
            android.graphics.Paint r1 = r0.g
            com.airbnb.lottie.a.b.a<android.graphics.ColorFilter, android.graphics.ColorFilter> r3 = r0.o
            java.lang.Object r3 = r3.d()
            android.graphics.ColorFilter r3 = (android.graphics.ColorFilter) r3
            r1.setColorFilter(r3)
        L_0x00e7:
            r1 = r19
            float r1 = (float) r1
            r3 = 1132396544(0x437f0000, float:255.0)
            float r1 = r1 / r3
            com.airbnb.lottie.a.b.a<java.lang.Integer, java.lang.Integer> r4 = r0.l
            java.lang.Object r4 = r4.d()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            float r1 = r1 * r4
            r4 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r4
            float r1 = r1 * r3
            int r1 = (int) r1
            android.graphics.Paint r3 = r0.g
            r4 = 255(0xff, float:3.57E-43)
            int r1 = com.airbnb.lottie.f.e.a((int) r1, (int) r2, (int) r4)
            r3.setAlpha(r1)
            android.graphics.Path r1 = r0.f4596f
            android.graphics.Paint r2 = r0.g
            r3 = r17
            r3.drawPath(r1, r2)
            java.lang.String r1 = "GradientFillContent#draw"
            com.airbnb.lottie.d.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.a.a.g.a(android.graphics.Canvas, android.graphics.Matrix, int):void");
    }

    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        com.airbnb.lottie.f.e.a(eVar, i2, list, eVar2, this);
    }
}
