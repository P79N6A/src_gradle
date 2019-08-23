package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.j;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.c;
import java.util.List;

public final class n implements j, l, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4616a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final RectF f4617b = new RectF();

    /* renamed from: c  reason: collision with root package name */
    private final String f4618c;

    /* renamed from: d  reason: collision with root package name */
    private final LottieDrawable f4619d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f4620e;

    /* renamed from: f  reason: collision with root package name */
    private final a<?, PointF> f4621f;
    private final a<?, Float> g;
    @Nullable
    private r h;
    private boolean i;

    public final <T> void a(T t, @Nullable c<T> cVar) {
    }

    public final String b() {
        return this.f4618c;
    }

    public final void a() {
        this.i = false;
        this.f4619d.invalidateSelf();
    }

    public final Path e() {
        float f2;
        if (this.i) {
            return this.f4616a;
        }
        this.f4616a.reset();
        PointF pointF = (PointF) this.f4621f.d();
        float f3 = pointF.x / 2.0f;
        float f4 = pointF.y / 2.0f;
        if (this.g == null) {
            f2 = 0.0f;
        } else {
            f2 = ((Float) this.g.d()).floatValue();
        }
        float min = Math.min(f3, f4);
        if (f2 > min) {
            f2 = min;
        }
        PointF pointF2 = (PointF) this.f4620e.d();
        this.f4616a.moveTo(pointF2.x + f3, (pointF2.y - f4) + f2);
        this.f4616a.lineTo(pointF2.x + f3, (pointF2.y + f4) - f2);
        if (f2 > 0.0f) {
            float f5 = f2 * 2.0f;
            this.f4617b.set((pointF2.x + f3) - f5, (pointF2.y + f4) - f5, pointF2.x + f3, pointF2.y + f4);
            this.f4616a.arcTo(this.f4617b, 0.0f, 90.0f, false);
        }
        this.f4616a.lineTo((pointF2.x - f3) + f2, pointF2.y + f4);
        if (f2 > 0.0f) {
            float f6 = f2 * 2.0f;
            this.f4617b.set(pointF2.x - f3, (pointF2.y + f4) - f6, (pointF2.x - f3) + f6, pointF2.y + f4);
            this.f4616a.arcTo(this.f4617b, 90.0f, 90.0f, false);
        }
        this.f4616a.lineTo(pointF2.x - f3, (pointF2.y - f4) + f2);
        if (f2 > 0.0f) {
            float f7 = f2 * 2.0f;
            this.f4617b.set(pointF2.x - f3, pointF2.y - f4, (pointF2.x - f3) + f7, (pointF2.y - f4) + f7);
            this.f4616a.arcTo(this.f4617b, 180.0f, 90.0f, false);
        }
        this.f4616a.lineTo((pointF2.x + f3) - f2, pointF2.y - f4);
        if (f2 > 0.0f) {
            float f8 = f2 * 2.0f;
            this.f4617b.set((pointF2.x + f3) - f8, pointF2.y - f4, pointF2.x + f3, (pointF2.y - f4) + f8);
            this.f4616a.arcTo(this.f4617b, 270.0f, 90.0f, false);
        }
        this.f4616a.close();
        f.a(this.f4616a, this.h);
        this.i = true;
        return this.f4616a;
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list.size(); i2++) {
            b bVar = list.get(i2);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f4638a == q.a.Simultaneously) {
                    this.h = rVar;
                    this.h.a(this);
                }
            }
        }
    }

    public n(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, j jVar) {
        this.f4618c = jVar.f4732a;
        this.f4619d = lottieDrawable;
        this.f4620e = jVar.f4733b.a();
        this.f4621f = jVar.f4734c.a();
        this.g = jVar.f4735d.a();
        aVar.a(this.f4620e);
        aVar.a(this.f4621f);
        aVar.a(this.g);
        this.f4620e.a((a.C0033a) this);
        this.f4621f.a((a.C0033a) this);
        this.g.a((a.C0033a) this);
    }

    public final void a(e eVar, int i2, List<e> list, e eVar2) {
        com.airbnb.lottie.f.e.a(eVar, i2, list, eVar2, this);
    }
}
