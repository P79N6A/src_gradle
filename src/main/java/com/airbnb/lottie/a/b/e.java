package com.airbnb.lottie.a.b;

import com.airbnb.lottie.g.a;
import java.util.List;

public final class e extends f<Integer> {
    public e(List<a<Integer>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f4860b == null || aVar.f4861c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f4647d != null) {
            return (Integer) this.f4647d.a(aVar.f4863e, aVar.f4864f.floatValue(), aVar.f4860b, aVar.f4861c, f2, b(), this.f4646c);
        } else {
            int intValue = ((Integer) aVar.f4860b).intValue();
            return Integer.valueOf((int) (((float) intValue) + (f2 * ((float) (((Integer) aVar.f4861c).intValue() - intValue)))));
        }
    }
}
