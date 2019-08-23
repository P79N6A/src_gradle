package com.airbnb.lottie.a.b;

import android.graphics.Path;
import android.graphics.PointF;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import java.util.List;

public final class l extends a<com.airbnb.lottie.c.b.l, Path> {

    /* renamed from: e  reason: collision with root package name */
    private final com.airbnb.lottie.c.b.l f4658e = new com.airbnb.lottie.c.b.l();

    /* renamed from: f  reason: collision with root package name */
    private final Path f4659f = new Path();

    public l(List<a<com.airbnb.lottie.c.b.l>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(a aVar, float f2) {
        boolean z;
        com.airbnb.lottie.c.b.l lVar = (com.airbnb.lottie.c.b.l) aVar.f4860b;
        com.airbnb.lottie.c.b.l lVar2 = (com.airbnb.lottie.c.b.l) aVar.f4861c;
        com.airbnb.lottie.c.b.l lVar3 = this.f4658e;
        if (lVar3.f4741b == null) {
            lVar3.f4741b = new PointF();
        }
        if (lVar.f4742c || lVar2.f4742c) {
            z = true;
        } else {
            z = false;
        }
        lVar3.f4742c = z;
        if (lVar.f4740a.size() != lVar2.f4740a.size()) {
            d.a("Curves must have the same number of control points. Shape 1: " + lVar.f4740a.size() + "\tShape 2: " + lVar2.f4740a.size());
        }
        if (lVar3.f4740a.isEmpty()) {
            int min = Math.min(lVar.f4740a.size(), lVar2.f4740a.size());
            for (int i = 0; i < min; i++) {
                lVar3.f4740a.add(new com.airbnb.lottie.c.a());
            }
        }
        PointF pointF = lVar.f4741b;
        PointF pointF2 = lVar2.f4741b;
        float a2 = e.a(pointF.x, pointF2.x, f2);
        float a3 = e.a(pointF.y, pointF2.y, f2);
        if (lVar3.f4741b == null) {
            lVar3.f4741b = new PointF();
        }
        lVar3.f4741b.set(a2, a3);
        for (int size = lVar3.f4740a.size() - 1; size >= 0; size--) {
            com.airbnb.lottie.c.a aVar2 = lVar.f4740a.get(size);
            com.airbnb.lottie.c.a aVar3 = lVar2.f4740a.get(size);
            PointF pointF3 = aVar2.f4680a;
            PointF pointF4 = aVar2.f4681b;
            PointF pointF5 = aVar2.f4682c;
            PointF pointF6 = aVar3.f4680a;
            PointF pointF7 = aVar3.f4681b;
            PointF pointF8 = aVar3.f4682c;
            lVar3.f4740a.get(size).f4680a.set(e.a(pointF3.x, pointF6.x, f2), e.a(pointF3.y, pointF6.y, f2));
            lVar3.f4740a.get(size).f4681b.set(e.a(pointF4.x, pointF7.x, f2), e.a(pointF4.y, pointF7.y, f2));
            lVar3.f4740a.get(size).f4682c.set(e.a(pointF5.x, pointF8.x, f2), e.a(pointF5.y, pointF8.y, f2));
        }
        e.a(this.f4658e, this.f4659f);
        return this.f4659f;
    }
}
