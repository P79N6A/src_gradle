package com.airbnb.lottie.c.a;

import android.graphics.PointF;
import com.airbnb.lottie.a.b.i;
import com.airbnb.lottie.a.b.j;
import com.airbnb.lottie.g.a;
import java.util.Collections;
import java.util.List;

public final class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<a<PointF>> f4683a;

    public e() {
        this.f4683a = Collections.singletonList(new a(new PointF(0.0f, 0.0f)));
    }

    public final com.airbnb.lottie.a.b.a<PointF, PointF> a() {
        if (this.f4683a.get(0).c()) {
            return new j(this.f4683a);
        }
        return new i(this.f4683a);
    }

    public e(List<a<PointF>> list) {
        this.f4683a = list;
    }
}
