package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.g.a;
import java.util.List;

public final class i extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f4655e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final float[] f4656f = new float[2];
    private h g;
    private PathMeasure h;

    public i(List<? extends a<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(a aVar, float f2) {
        h hVar = (h) aVar;
        Path path = hVar.f4654a;
        if (path == null) {
            return (PointF) aVar.f4860b;
        }
        if (this.f4647d != null) {
            return (PointF) this.f4647d.a(hVar.f4863e, hVar.f4864f.floatValue(), hVar.f4860b, hVar.f4861c, b(), f2, this.f4646c);
        }
        if (this.g != hVar) {
            this.h = new PathMeasure(path, false);
            this.g = hVar;
        }
        this.h.getPosTan(f2 * this.h.getLength(), this.f4656f, null);
        this.f4655e.set(this.f4656f[0], this.f4656f[1]);
        return this.f4655e;
    }
}
