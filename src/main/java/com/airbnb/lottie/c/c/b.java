package com.airbnb.lottie.c.c;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.support.v4.util.LongSparseArray;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.d;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.List;

public final class b extends a {
    public final List<a> g = new ArrayList();
    @Nullable
    public Boolean h;
    @Nullable
    private a<Float, Float> i;
    private final RectF j = new RectF();
    private final RectF k = new RectF();
    @Nullable
    private Boolean l;

    public final boolean e() {
        if (this.l == null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                a aVar = this.g.get(size);
                if (aVar instanceof f) {
                    if (aVar.d()) {
                        this.l = Boolean.TRUE;
                        return true;
                    }
                } else if ((aVar instanceof b) && ((b) aVar).e()) {
                    this.l = Boolean.TRUE;
                    return true;
                }
            }
            this.l = Boolean.FALSE;
        }
        return this.l.booleanValue();
    }

    public final void a(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        super.a(f2);
        if (this.i != null) {
            f2 = ((float) ((long) (((Float) this.i.d()).floatValue() * 1000.0f))) / this.f4771b.getComposition().getDuration();
        }
        if (this.f4772c.m != 0.0f) {
            f2 /= this.f4772c.m;
        }
        d dVar = this.f4772c;
        float durationFrames = f2 - (dVar.n / dVar.f4782b.getDurationFrames());
        for (int size = this.g.size() - 1; size >= 0; size--) {
            this.g.get(size).a(durationFrames);
        }
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        super.a(t, cVar);
        if (t == i.w) {
            if (cVar == null) {
                this.i = null;
            } else {
                this.i = new p(cVar);
                a(this.i);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        super.a(rectF, matrix);
        this.j.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.g.size() - 1; size >= 0; size--) {
            this.g.get(size).a(this.j, this.f4770a);
            if (rectF.isEmpty()) {
                rectF.set(this.j);
            } else {
                rectF.set(Math.min(rectF.left, this.j.left), Math.min(rectF.top, this.j.top), Math.max(rectF.right, this.j.right), Math.max(rectF.bottom, this.j.bottom));
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(Canvas canvas, Matrix matrix, int i2) {
        boolean z;
        d.b("CompositionLayer#draw");
        canvas.save();
        this.k.set(0.0f, 0.0f, (float) this.f4772c.o, (float) this.f4772c.p);
        matrix.mapRect(this.k);
        for (int size = this.g.size() - 1; size >= 0; size--) {
            if (!this.k.isEmpty()) {
                z = canvas.clipRect(this.k);
            } else {
                z = true;
            }
            if (z) {
                this.g.get(size).a(canvas, matrix, i2);
            }
        }
        canvas.restore();
        d.c("CompositionLayer#draw");
    }

    /* access modifiers changed from: protected */
    public final void b(e eVar, int i2, List<e> list, e eVar2) {
        for (int i3 = 0; i3 < this.g.size(); i3++) {
            this.g.get(i3).a(eVar, i2, list, eVar2);
        }
    }

    public b(LottieDrawable lottieDrawable, d dVar, List<d> list, LottieComposition lottieComposition) {
        super(lottieDrawable, dVar);
        a aVar;
        com.airbnb.lottie.c.a.b bVar = dVar.s;
        if (bVar != null) {
            this.i = bVar.a();
            a(this.i);
            this.i.a((a.C0033a) this);
        } else {
            this.i = null;
        }
        LongSparseArray longSparseArray = new LongSparseArray(lottieComposition.getLayers().size());
        int size = list.size() - 1;
        a aVar2 = null;
        while (true) {
            if (size >= 0) {
                d dVar2 = list.get(size);
                switch (dVar2.f4785e) {
                    case Shape:
                        aVar = new f(lottieDrawable, dVar2);
                        break;
                    case PreComp:
                        aVar = new b(lottieDrawable, dVar2, lottieComposition.getPrecomps(dVar2.g), lottieComposition);
                        break;
                    case Solid:
                        aVar = new g(lottieDrawable, dVar2);
                        break;
                    case Image:
                        aVar = new c(lottieDrawable, dVar2);
                        break;
                    case Null:
                        aVar = new e(lottieDrawable, dVar2);
                        break;
                    case Text:
                        aVar = new h(lottieDrawable, dVar2);
                        break;
                    default:
                        d.a("Unknown layer type " + dVar2.f4785e);
                        aVar = null;
                        break;
                }
                if (aVar != null) {
                    longSparseArray.put(aVar.f4772c.f4784d, aVar);
                    if (aVar2 == null) {
                        this.g.add(0, aVar);
                        switch (dVar2.u) {
                            case Add:
                            case Invert:
                                aVar2 = aVar;
                                break;
                        }
                    } else {
                        aVar2.f4773d = aVar;
                        aVar2 = null;
                    }
                }
                size--;
            } else {
                for (int i2 = 0; i2 < longSparseArray.size(); i2++) {
                    a aVar3 = (a) longSparseArray.get(longSparseArray.keyAt(i2));
                    if (aVar3 != null) {
                        a aVar4 = (a) longSparseArray.get(aVar3.f4772c.f4786f);
                        if (aVar4 != null) {
                            aVar3.f4774e = aVar4;
                        }
                    }
                }
                return;
            }
        }
    }
}
