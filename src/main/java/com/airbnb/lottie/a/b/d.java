package com.airbnb.lottie.a.b;

import com.airbnb.lottie.c.b.c;
import com.airbnb.lottie.f.b;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.a;
import java.util.List;

public final class d extends f<c> {

    /* renamed from: e  reason: collision with root package name */
    private final c f4650e;

    public d(List<a<c>> list) {
        super(list);
        int i = 0;
        c cVar = (c) list.get(0).f4860b;
        i = cVar != null ? cVar.a() : i;
        this.f4650e = new c(new float[i], new int[i]);
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(a aVar, float f2) {
        c cVar = this.f4650e;
        c cVar2 = (c) aVar.f4860b;
        c cVar3 = (c) aVar.f4861c;
        if (cVar2.f4708b.length == cVar3.f4708b.length) {
            for (int i = 0; i < cVar2.f4708b.length; i++) {
                cVar.f4707a[i] = e.a(cVar2.f4707a[i], cVar3.f4707a[i], f2);
                cVar.f4708b[i] = b.a(f2, cVar2.f4708b[i], cVar3.f4708b[i]);
            }
            return this.f4650e;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + cVar2.f4708b.length + " vs " + cVar3.f4708b.length + ")");
    }
}
