package com.airbnb.lottie.a.b;

import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import java.util.List;

public final class c extends f<Float> {
    public c(List<a<Float>> list) {
        super(list);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(a aVar, float f2) {
        if (aVar.f4860b == null || aVar.f4861c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        } else if (this.f4647d == null) {
            return Float.valueOf(e.a(((Float) aVar.f4860b).floatValue(), ((Float) aVar.f4861c).floatValue(), f2));
        } else {
            return (Float) this.f4647d.a(aVar.f4863e, aVar.f4864f.floatValue(), aVar.f4860b, aVar.f4861c, f2, b(), this.f4646c);
        }
    }
}
