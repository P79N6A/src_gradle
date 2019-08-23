package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.g.a;
import java.util.List;

public final class j extends f<PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f4657e = new PointF();

    public j(List<a<PointF>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f4860b == null || aVar.f4861c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF = (PointF) aVar.f4860b;
        PointF pointF2 = (PointF) aVar.f4861c;
        if (this.f4647d != null) {
            return (PointF) this.f4647d.a(aVar.f4863e, aVar.f4864f.floatValue(), pointF, pointF2, f2, b(), this.f4646c);
        }
        this.f4657e.set(pointF.x + ((pointF2.x - pointF.x) * f2), pointF.y + (f2 * (pointF2.y - pointF.y)));
        return this.f4657e;
    }
}
