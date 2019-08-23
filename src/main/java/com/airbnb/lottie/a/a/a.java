package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import android.support.annotation.CallSuper;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.List;

public abstract class a implements d, j, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    final Paint f4565a = new Paint(1);

    /* renamed from: b  reason: collision with root package name */
    private final PathMeasure f4566b = new PathMeasure();

    /* renamed from: c  reason: collision with root package name */
    private final Path f4567c = new Path();

    /* renamed from: d  reason: collision with root package name */
    private final Path f4568d = new Path();

    /* renamed from: e  reason: collision with root package name */
    private final RectF f4569e = new RectF();

    /* renamed from: f  reason: collision with root package name */
    private final LottieDrawable f4570f;
    private final com.airbnb.lottie.c.c.a g;
    private final List<C0032a> h = new ArrayList();
    private final float[] i;
    private final com.airbnb.lottie.a.b.a<?, Float> j;
    private final com.airbnb.lottie.a.b.a<?, Integer> k;
    private final List<com.airbnb.lottie.a.b.a<?, Float>> l;
    @Nullable
    private final com.airbnb.lottie.a.b.a<?, Float> m;
    @Nullable
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> n;

    /* renamed from: com.airbnb.lottie.a.a.a$a  reason: collision with other inner class name */
    static final class C0032a {

        /* renamed from: a  reason: collision with root package name */
        public final List<l> f4571a;
        @Nullable

        /* renamed from: b  reason: collision with root package name */
        public final r f4572b;

        private C0032a(@Nullable r rVar) {
            this.f4571a = new ArrayList();
            this.f4572b = rVar;
        }

        /* synthetic */ C0032a(r rVar, byte b2) {
            this(rVar);
        }
    }

    public final void a() {
        this.f4570f.invalidateSelf();
    }

    @CallSuper
    public <T> void a(T t, @Nullable c<T> cVar) {
        if (t == i.f4879d) {
            this.k.a(cVar);
        } else if (t == i.k) {
            this.j.a(cVar);
        } else {
            if (t == i.x) {
                if (cVar == null) {
                    this.n = null;
                    return;
                }
                this.n = new p(cVar);
                this.n.a((a.C0033a) this);
                this.g.a(this.n);
            }
        }
    }

    public final void a(List<b> list, List<b> list2) {
        C0032a aVar = null;
        r rVar = null;
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof r) {
                r rVar2 = (r) bVar;
                if (rVar2.f4638a == q.a.Individually) {
                    rVar = rVar2;
                }
            }
        }
        if (rVar != null) {
            rVar.a(this);
        }
        for (int size2 = list2.size() - 1; size2 >= 0; size2--) {
            b bVar2 = list2.get(size2);
            if (bVar2 instanceof r) {
                r rVar3 = (r) bVar2;
                if (rVar3.f4638a == q.a.Individually) {
                    if (aVar != null) {
                        this.h.add(aVar);
                    }
                    C0032a aVar2 = new C0032a(rVar3, (byte) 0);
                    rVar3.a(this);
                    aVar = aVar2;
                }
            }
            if (bVar2 instanceof l) {
                if (aVar == null) {
                    aVar = new C0032a(rVar, (byte) 0);
                }
                aVar.f4571a.add((l) bVar2);
            }
        }
        if (aVar != null) {
            this.h.add(aVar);
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        d.b("StrokeContent#getBounds");
        this.f4567c.reset();
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            C0032a aVar = this.h.get(i2);
            for (int i3 = 0; i3 < aVar.f4571a.size(); i3++) {
                this.f4567c.addPath(aVar.f4571a.get(i3).e(), matrix);
            }
        }
        this.f4567c.computeBounds(this.f4569e, false);
        float floatValue = ((Float) this.j.d()).floatValue() / 2.0f;
        this.f4569e.set(this.f4569e.left - floatValue, this.f4569e.top - floatValue, this.f4569e.right + floatValue, this.f4569e.bottom + floatValue);
        rectF.set(this.f4569e);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
        d.c("StrokeContent#getBounds");
    }

    private void a(Canvas canvas, C0032a aVar, Matrix matrix) {
        float f2;
        float f3;
        d.b("StrokeContent#applyTrimPath");
        if (aVar.f4572b == null) {
            d.c("StrokeContent#applyTrimPath");
            return;
        }
        this.f4567c.reset();
        for (int size = aVar.f4571a.size() - 1; size >= 0; size--) {
            this.f4567c.addPath(aVar.f4571a.get(size).e(), matrix);
        }
        this.f4566b.setPath(this.f4567c, false);
        float length = this.f4566b.getLength();
        while (this.f4566b.nextContour()) {
            length += this.f4566b.getLength();
        }
        float floatValue = (((Float) aVar.f4572b.f4641d.d()).floatValue() * length) / 360.0f;
        float floatValue2 = ((((Float) aVar.f4572b.f4639b.d()).floatValue() * length) / 100.0f) + floatValue;
        float floatValue3 = ((((Float) aVar.f4572b.f4640c.d()).floatValue() * length) / 100.0f) + floatValue;
        float f4 = 0.0f;
        for (int size2 = aVar.f4571a.size() - 1; size2 >= 0; size2--) {
            this.f4568d.set(aVar.f4571a.get(size2).e());
            this.f4568d.transform(matrix);
            this.f4566b.setPath(this.f4568d, false);
            float length2 = this.f4566b.getLength();
            float f5 = 1.0f;
            if (floatValue3 > length) {
                float f6 = floatValue3 - length;
                if (f6 < f4 + length2 && f4 < f6) {
                    if (floatValue2 > length) {
                        f2 = (floatValue2 - length) / length2;
                    } else {
                        f2 = 0.0f;
                    }
                    f5 = Math.min(f6 / length2, 1.0f);
                    f.a(this.f4568d, f2, f5, 0.0f);
                    canvas.drawPath(this.f4568d, this.f4565a);
                    f4 += length2;
                }
            }
            float f7 = f4 + length2;
            if (f7 >= floatValue2 && f4 <= floatValue3) {
                if (f7 > floatValue3 || floatValue2 >= f4) {
                    if (floatValue2 < f4) {
                        f3 = 0.0f;
                    } else {
                        f3 = (floatValue2 - f4) / length2;
                    }
                    if (floatValue3 <= f7) {
                        f5 = (floatValue3 - f4) / length2;
                    }
                    f.a(this.f4568d, f2, f5, 0.0f);
                    canvas.drawPath(this.f4568d, this.f4565a);
                } else {
                    canvas.drawPath(this.f4568d, this.f4565a);
                }
            }
            f4 += length2;
        }
        d.c("StrokeContent#applyTrimPath");
    }

    public void a(Canvas canvas, Matrix matrix, int i2) {
        d.b("StrokeContent#draw");
        this.f4565a.setAlpha(e.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.k.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        this.f4565a.setStrokeWidth(((Float) this.j.d()).floatValue() * f.a(matrix));
        float f2 = 0.0f;
        if (this.f4565a.getStrokeWidth() <= 0.0f) {
            d.c("StrokeContent#draw");
            return;
        }
        d.b("StrokeContent#applyDashPattern");
        if (this.l.isEmpty()) {
            d.c("StrokeContent#applyDashPattern");
        } else {
            float a2 = f.a(matrix);
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                this.i[i3] = ((Float) this.l.get(i3).d()).floatValue();
                if (i3 % 2 == 0) {
                    if (this.i[i3] < 1.0f) {
                        this.i[i3] = 1.0f;
                    }
                } else if (this.i[i3] < 0.1f) {
                    this.i[i3] = 0.1f;
                }
                float[] fArr = this.i;
                fArr[i3] = fArr[i3] * a2;
            }
            if (this.m != null) {
                f2 = ((Float) this.m.d()).floatValue();
            }
            this.f4565a.setPathEffect(new DashPathEffect(this.i, f2));
            d.c("StrokeContent#applyDashPattern");
        }
        if (this.n != null) {
            this.f4565a.setColorFilter((ColorFilter) this.n.d());
        }
        for (int i4 = 0; i4 < this.h.size(); i4++) {
            C0032a aVar = this.h.get(i4);
            if (aVar.f4572b != null) {
                a(canvas, aVar, matrix);
            } else {
                d.b("StrokeContent#buildPath");
                this.f4567c.reset();
                for (int size = aVar.f4571a.size() - 1; size >= 0; size--) {
                    this.f4567c.addPath(aVar.f4571a.get(size).e(), matrix);
                }
                d.c("StrokeContent#buildPath");
                d.b("StrokeContent#drawPath");
                canvas.drawPath(this.f4567c, this.f4565a);
                d.c("StrokeContent#drawPath");
            }
        }
        d.c("StrokeContent#draw");
    }

    public final void a(com.airbnb.lottie.c.e eVar, int i2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e eVar2) {
        e.a(eVar, i2, list, eVar2, this);
    }

    a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, Paint.Cap cap, Paint.Join join, float f2, com.airbnb.lottie.c.a.d dVar, b bVar, List<b> list, b bVar2) {
        this.f4570f = lottieDrawable;
        this.g = aVar;
        this.f4565a.setStyle(Paint.Style.STROKE);
        this.f4565a.setStrokeCap(cap);
        this.f4565a.setStrokeJoin(join);
        this.f4565a.setStrokeMiter(f2);
        this.k = dVar.a();
        this.j = bVar.a();
        if (bVar2 == null) {
            this.m = null;
        } else {
            this.m = bVar2.a();
        }
        this.l = new ArrayList(list.size());
        this.i = new float[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.l.add(list.get(i2).a());
        }
        aVar.a(this.k);
        aVar.a(this.j);
        for (int i3 = 0; i3 < this.l.size(); i3++) {
            aVar.a(this.l.get(i3));
        }
        if (this.m != null) {
            aVar.a(this.m);
        }
        this.k.a((a.C0033a) this);
        this.j.a((a.C0033a) this);
        for (int i4 = 0; i4 < list.size(); i4++) {
            this.l.get(i4).a((a.C0033a) this);
        }
        if (this.m != null) {
            this.m.a((a.C0033a) this);
        }
    }
}
