package com.airbnb.lottie.a.b;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.a;
import java.util.Collections;

public final class m extends a<PointF, PointF> {

    /* renamed from: e  reason: collision with root package name */
    private final PointF f4660e = new PointF();

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f4661f;
    private final a<Float, Float> g;

    /* access modifiers changed from: private */
    /* renamed from: e */
    public PointF d() {
        return this.f4660e;
    }

    public final void a(float f2) {
        this.f4661f.a(f2);
        this.g.a(f2);
        this.f4660e.set(((Float) this.f4661f.d()).floatValue(), ((Float) this.g.d()).floatValue());
        for (int i = 0; i < this.f4644a.size(); i++) {
            ((a.C0033a) this.f4644a.get(i)).a();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ Object a(com.airbnb.lottie.g.a aVar, float f2) {
        return d();
    }

    public m(a<Float, Float> aVar, a<Float, Float> aVar2) {
        super(Collections.emptyList());
        this.f4661f = aVar;
        this.g = aVar2;
        a(this.f4646c);
    }
}
