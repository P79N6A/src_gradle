package com.airbnb.lottie.a.b;

import com.airbnb.lottie.g.a;
import java.util.List;

public final class b extends f<Integer> {
    public b(List<a<Integer>> list) {
        super(list);
    }

    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f4860b == null || aVar.f4861c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = ((Integer) aVar.f4860b).intValue();
        int intValue2 = ((Integer) aVar.f4861c).intValue();
        if (this.f4647d == null) {
            return Integer.valueOf(com.airbnb.lottie.f.b.a(f2, intValue, intValue2));
        }
        return (Integer) this.f4647d.a(aVar.f4863e, aVar.f4864f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, b(), this.f4646c);
    }
}
