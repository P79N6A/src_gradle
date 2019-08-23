package com.airbnb.lottie.a.b;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.g.d;
import com.airbnb.lottie.i;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    public final a<PointF, PointF> f4662a;

    /* renamed from: b  reason: collision with root package name */
    public final a<?, PointF> f4663b;

    /* renamed from: c  reason: collision with root package name */
    public final a<d, d> f4664c;

    /* renamed from: d  reason: collision with root package name */
    public final a<Float, Float> f4665d;

    /* renamed from: e  reason: collision with root package name */
    public final a<Integer, Integer> f4666e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public final a<?, Float> f4667f;
    @Nullable
    public final a<?, Float> g;
    private final Matrix h = new Matrix();

    public final Matrix a() {
        this.h.reset();
        PointF pointF = (PointF) this.f4663b.d();
        if (!(pointF.x == 0.0f && pointF.y == 0.0f)) {
            this.h.preTranslate(pointF.x, pointF.y);
        }
        float floatValue = ((Float) this.f4665d.d()).floatValue();
        if (floatValue != 0.0f) {
            this.h.preRotate(floatValue);
        }
        d dVar = (d) this.f4664c.d();
        if (!(dVar.f4874a == 1.0f && dVar.f4875b == 1.0f)) {
            this.h.preScale(dVar.f4874a, dVar.f4875b);
        }
        PointF pointF2 = (PointF) this.f4662a.d();
        if (!(pointF2.x == 0.0f && pointF2.y == 0.0f)) {
            this.h.preTranslate(-pointF2.x, -pointF2.y);
        }
        return this.h;
    }

    public final void a(a.C0033a aVar) {
        this.f4662a.a(aVar);
        this.f4663b.a(aVar);
        this.f4664c.a(aVar);
        this.f4665d.a(aVar);
        this.f4666e.a(aVar);
        if (this.f4667f != null) {
            this.f4667f.a(aVar);
        }
        if (this.g != null) {
            this.g.a(aVar);
        }
    }

    public o(l lVar) {
        this.f4662a = lVar.f4690a.a();
        this.f4663b = lVar.f4691b.a();
        this.f4664c = lVar.f4692c.a();
        this.f4665d = lVar.f4693d.a();
        this.f4666e = lVar.f4694e.a();
        if (lVar.f4695f != null) {
            this.f4667f = lVar.f4695f.a();
        } else {
            this.f4667f = null;
        }
        if (lVar.g != null) {
            this.g = lVar.g.a();
        } else {
            this.g = null;
        }
    }

    public final Matrix a(float f2) {
        PointF pointF = (PointF) this.f4663b.d();
        PointF pointF2 = (PointF) this.f4662a.d();
        d dVar = (d) this.f4664c.d();
        float floatValue = ((Float) this.f4665d.d()).floatValue();
        this.h.reset();
        this.h.preTranslate(pointF.x * f2, pointF.y * f2);
        double d2 = (double) f2;
        this.h.preScale((float) Math.pow((double) dVar.f4874a, d2), (float) Math.pow((double) dVar.f4875b, d2));
        this.h.preRotate(floatValue * f2, pointF2.x, pointF2.y);
        return this.h;
    }

    public final void a(com.airbnb.lottie.c.c.a aVar) {
        aVar.a(this.f4662a);
        aVar.a(this.f4663b);
        aVar.a(this.f4664c);
        aVar.a(this.f4665d);
        aVar.a(this.f4666e);
        if (this.f4667f != null) {
            aVar.a(this.f4667f);
        }
        if (this.g != null) {
            aVar.a(this.g);
        }
    }

    public final <T> boolean a(T t, @Nullable c<T> cVar) {
        if (t == i.f4880e) {
            this.f4662a.a(cVar);
        } else if (t == i.f4881f) {
            this.f4663b.a(cVar);
        } else if (t == i.i) {
            this.f4664c.a(cVar);
        } else if (t == i.j) {
            this.f4665d.a(cVar);
        } else if (t == i.f4878c) {
            this.f4666e.a(cVar);
        } else if (t == i.u && this.f4667f != null) {
            this.f4667f.a(cVar);
        } else if (t != i.v || this.g == null) {
            return false;
        } else {
            this.g.a(cVar);
        }
        return true;
    }
}
