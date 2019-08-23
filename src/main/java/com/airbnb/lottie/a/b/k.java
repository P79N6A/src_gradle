package com.airbnb.lottie.a.b;

import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import com.airbnb.lottie.g.d;
import java.util.List;

public final class k extends f<d> {
    public k(List<a<d>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f4860b == null || aVar.f4861c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        d dVar = (d) aVar.f4860b;
        d dVar2 = (d) aVar.f4861c;
        if (this.f4647d == null) {
            return new d(e.a(dVar.f4874a, dVar2.f4874a, f2), e.a(dVar.f4875b, dVar2.f4875b, f2));
        }
        return (d) this.f4647d.a(aVar.f4863e, aVar.f4864f.floatValue(), dVar, dVar2, f2, b(), this.f4646c);
    }
}
