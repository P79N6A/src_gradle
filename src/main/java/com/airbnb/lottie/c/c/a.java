package com.airbnb.lottie.c.c;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import android.support.annotation.CallSuper;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.d;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.g;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.b.g;
import com.airbnb.lottie.c.b.l;
import com.airbnb.lottie.c.c.d;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.c.f;
import com.airbnb.lottie.g.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public abstract class a implements d, a.C0033a, f {

    /* renamed from: a  reason: collision with root package name */
    final Matrix f4770a;

    /* renamed from: b  reason: collision with root package name */
    final LottieDrawable f4771b;

    /* renamed from: c  reason: collision with root package name */
    public final d f4772c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public a f4773d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    public a f4774e;

    /* renamed from: f  reason: collision with root package name */
    final o f4775f;
    private final Path g = new Path();
    private final Matrix h = new Matrix();
    private final Paint i;
    private final Paint j;
    private final Paint k;
    private final Paint l;
    private final Paint m;
    private final RectF n;
    private final RectF o;
    private final RectF p;
    private final RectF q;
    private final String r;
    @Nullable
    private g s;
    private List<a> t;
    private final List<com.airbnb.lottie.a.b.a<?, ?>> u;
    private boolean v;

    public final void a(List<b> list, List<b> list2) {
    }

    /* access modifiers changed from: package-private */
    public abstract void b(Canvas canvas, Matrix matrix, int i2);

    /* access modifiers changed from: package-private */
    public void b(e eVar, int i2, List<e> list, e eVar2) {
    }

    public final void a() {
        e();
    }

    public final void a(boolean z) {
        if (z != this.v) {
            this.v = z;
            e();
        }
    }

    private void e() {
        this.f4771b.invalidateSelf();
    }

    public final String b() {
        return this.f4772c.f4783c;
    }

    public final boolean c() {
        if (this.f4773d != null) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final boolean d() {
        if (this.s == null || this.s.f4651a.isEmpty()) {
            return false;
        }
        return true;
    }

    public final void a(com.airbnb.lottie.a.b.a<?, ?> aVar) {
        this.u.add(aVar);
    }

    private void b(float f2) {
        this.f4771b.getComposition().getPerformanceTracker().a(this.f4772c.f4783c, f2);
    }

    private void a(Canvas canvas) {
        com.airbnb.lottie.d.b("Layer#clearLayer");
        canvas.drawRect(this.n.left - 1.0f, this.n.top - 1.0f, this.n.right + 1.0f, this.n.bottom + 1.0f, this.m);
        com.airbnb.lottie.d.c("Layer#clearLayer");
    }

    /* access modifiers changed from: package-private */
    public void a(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        o oVar = this.f4775f;
        oVar.f4662a.a(f2);
        oVar.f4663b.a(f2);
        oVar.f4664c.a(f2);
        oVar.f4665d.a(f2);
        oVar.f4666e.a(f2);
        if (oVar.f4667f != null) {
            oVar.f4667f.a(f2);
        }
        if (oVar.g != null) {
            oVar.g.a(f2);
        }
        if (this.s != null) {
            for (int i2 = 0; i2 < this.s.f4651a.size(); i2++) {
                this.s.f4651a.get(i2).a(f2);
            }
        }
        if (this.f4772c.m != 0.0f) {
            f2 /= this.f4772c.m;
        }
        if (this.f4773d != null) {
            this.f4773d.a(this.f4773d.f4772c.m * f2);
        }
        for (int i3 = 0; i3 < this.u.size(); i3++) {
            this.u.get(i3).a(f2);
        }
    }

    @CallSuper
    public <T> void a(T t2, @Nullable c<T> cVar) {
        this.f4775f.a(t2, cVar);
    }

    @CallSuper
    public void a(RectF rectF, Matrix matrix) {
        this.f4770a.set(matrix);
        this.f4770a.preConcat(this.f4775f.a());
    }

    private void b(RectF rectF, Matrix matrix) {
        this.o.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (d()) {
            int size = this.s.f4653c.size();
            int i2 = 0;
            while (i2 < size) {
                this.g.set((Path) this.s.f4651a.get(i2).d());
                this.g.transform(matrix);
                switch (this.s.f4653c.get(i2).f4721a) {
                    case MaskModeSubtract:
                        return;
                    case MaskModeIntersect:
                        return;
                    default:
                        this.g.computeBounds(this.q, false);
                        if (i2 == 0) {
                            this.o.set(this.q);
                        } else {
                            this.o.set(Math.min(this.o.left, this.q.left), Math.min(this.o.top, this.q.top), Math.max(this.o.right, this.q.right), Math.max(this.o.bottom, this.q.bottom));
                        }
                        i2++;
                }
            }
            rectF.set(Math.max(rectF.left, this.o.left), Math.max(rectF.top, this.o.top), Math.min(rectF.right, this.o.right), Math.min(rectF.bottom, this.o.bottom));
        }
    }

    a(LottieDrawable lottieDrawable, d dVar) {
        boolean z = true;
        this.i = new Paint(1);
        this.j = new Paint(1);
        this.k = new Paint(1);
        this.l = new Paint(1);
        this.m = new Paint();
        this.n = new RectF();
        this.o = new RectF();
        this.p = new RectF();
        this.q = new RectF();
        this.f4770a = new Matrix();
        this.u = new ArrayList();
        this.v = true;
        this.f4771b = lottieDrawable;
        this.f4772c = dVar;
        this.r = dVar.f4783c + "#draw";
        this.m.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        this.j.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        this.k.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        if (dVar.u == d.b.Invert) {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        } else {
            this.l.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        }
        this.f4775f = dVar.i.a();
        this.f4775f.a((a.C0033a) this);
        if (dVar.h != null && !dVar.h.isEmpty()) {
            this.s = new g(dVar.h);
            for (com.airbnb.lottie.a.b.a<l, Path> a2 : this.s.f4651a) {
                a2.a((a.C0033a) this);
            }
            for (com.airbnb.lottie.a.b.a next : this.s.f4652b) {
                a(next);
                next.a((a.C0033a) this);
            }
        }
        if (!this.f4772c.t.isEmpty()) {
            final com.airbnb.lottie.a.b.c cVar = new com.airbnb.lottie.a.b.c(this.f4772c.t);
            cVar.f4645b = true;
            cVar.a((a.C0033a) new a.C0033a() {
                public final void a() {
                    boolean z;
                    a aVar = a.this;
                    if (((Float) cVar.d()).floatValue() == 1.0f) {
                        z = true;
                    } else {
                        z = false;
                    }
                    aVar.a(z);
                }
            });
            a(((Float) cVar.d()).floatValue() != 1.0f ? false : z);
            a((com.airbnb.lottie.a.b.a<?, ?>) cVar);
            return;
        }
        a(true);
    }

    private void a(Canvas canvas, Matrix matrix, g.a aVar) {
        Paint paint;
        boolean z = true;
        if (AnonymousClass2.f4779b[aVar.ordinal()] != 1) {
            paint = this.j;
        } else {
            paint = this.k;
        }
        int size = this.s.f4653c.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                z = false;
                break;
            } else if (this.s.f4653c.get(i2).f4721a == aVar) {
                break;
            } else {
                i2++;
            }
        }
        if (z) {
            com.airbnb.lottie.d.b("Layer#drawMask");
            com.airbnb.lottie.d.b("Layer#saveLayer");
            a(canvas, this.n, paint, false);
            com.airbnb.lottie.d.c("Layer#saveLayer");
            a(canvas);
            for (int i3 = 0; i3 < size; i3++) {
                if (this.s.f4653c.get(i3).f4721a == aVar) {
                    this.g.set((Path) this.s.f4651a.get(i3).d());
                    this.g.transform(matrix);
                    int alpha = this.i.getAlpha();
                    this.i.setAlpha((int) (((float) ((Integer) this.s.f4652b.get(i3).d()).intValue()) * 2.55f));
                    canvas.drawPath(this.g, this.i);
                    this.i.setAlpha(alpha);
                }
            }
            com.airbnb.lottie.d.b("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.d.c("Layer#restoreLayer");
            com.airbnb.lottie.d.c("Layer#drawMask");
        }
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        com.airbnb.lottie.d.b(this.r);
        if (!this.v) {
            com.airbnb.lottie.d.c(this.r);
            return;
        }
        if (this.t == null) {
            if (this.f4774e == null) {
                this.t = Collections.emptyList();
            } else {
                this.t = new ArrayList();
                for (a aVar = this.f4774e; aVar != null; aVar = aVar.f4774e) {
                    this.t.add(aVar);
                }
            }
        }
        com.airbnb.lottie.d.b("Layer#parentMatrix");
        this.h.reset();
        this.h.set(matrix);
        for (int size = this.t.size() - 1; size >= 0; size--) {
            this.h.preConcat(this.t.get(size).f4775f.a());
        }
        com.airbnb.lottie.d.c("Layer#parentMatrix");
        int intValue = (int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.f4775f.f4666e.d()).intValue())) / 100.0f) * 255.0f);
        if (c() || d()) {
            com.airbnb.lottie.d.b("Layer#computeBounds");
            this.n.set(0.0f, 0.0f, 0.0f, 0.0f);
            a(this.n, this.h);
            RectF rectF = this.n;
            Matrix matrix2 = this.h;
            if (c() && this.f4772c.u != d.b.Invert) {
                this.f4773d.a(this.p, matrix2);
                rectF.set(Math.max(rectF.left, this.p.left), Math.max(rectF.top, this.p.top), Math.min(rectF.right, this.p.right), Math.min(rectF.bottom, this.p.bottom));
            }
            this.h.preConcat(this.f4775f.a());
            b(this.n, this.h);
            this.n.set(0.0f, 0.0f, (float) canvas.getWidth(), (float) canvas.getHeight());
            com.airbnb.lottie.d.c("Layer#computeBounds");
            com.airbnb.lottie.d.b("Layer#saveLayer");
            a(canvas, this.n, this.i, true);
            com.airbnb.lottie.d.c("Layer#saveLayer");
            a(canvas);
            com.airbnb.lottie.d.b("Layer#drawLayer");
            b(canvas, this.h, intValue);
            com.airbnb.lottie.d.c("Layer#drawLayer");
            if (d()) {
                Matrix matrix3 = this.h;
                a(canvas, matrix3, g.a.MaskModeAdd);
                a(canvas, matrix3, g.a.MaskModeIntersect);
                a(canvas, matrix3, g.a.MaskModeSubtract);
            }
            if (c()) {
                com.airbnb.lottie.d.b("Layer#drawMatte");
                com.airbnb.lottie.d.b("Layer#saveLayer");
                a(canvas, this.n, this.l, false);
                com.airbnb.lottie.d.c("Layer#saveLayer");
                a(canvas);
                this.f4773d.a(canvas, matrix, intValue);
                com.airbnb.lottie.d.b("Layer#restoreLayer");
                canvas.restore();
                com.airbnb.lottie.d.c("Layer#restoreLayer");
                com.airbnb.lottie.d.c("Layer#drawMatte");
            }
            com.airbnb.lottie.d.b("Layer#restoreLayer");
            canvas.restore();
            com.airbnb.lottie.d.c("Layer#restoreLayer");
            b(com.airbnb.lottie.d.c(this.r));
            return;
        }
        this.h.preConcat(this.f4775f.a());
        com.airbnb.lottie.d.b("Layer#drawLayer");
        b(canvas, this.h, intValue);
        com.airbnb.lottie.d.c("Layer#drawLayer");
        b(com.airbnb.lottie.d.c(this.r));
    }

    @SuppressLint({"WrongConstant"})
    private static void a(Canvas canvas, RectF rectF, Paint paint, boolean z) {
        int i2;
        if (Build.VERSION.SDK_INT < 23) {
            if (z) {
                i2 = 31;
            } else {
                i2 = 19;
            }
            canvas.saveLayer(rectF, paint, i2);
            return;
        }
        canvas.saveLayer(rectF, paint);
    }

    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        if (eVar.a(b(), i2)) {
            if (!"__container".equals(b())) {
                eVar2 = eVar2.a(b());
                if (eVar.c(b(), i2)) {
                    list.add(eVar2.a((f) this));
                }
            }
            if (eVar.d(b(), i2)) {
                b(eVar, i2 + eVar.b(b(), i2), list, eVar2);
            }
        }
    }
}
