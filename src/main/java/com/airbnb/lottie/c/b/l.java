package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.c.a;
import java.util.ArrayList;
import java.util.List;

public final class l {

    /* renamed from: a  reason: collision with root package name */
    public final List<a> f4740a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    public PointF f4741b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f4742c;

    public l() {
    }

    public final String toString() {
        return "ShapeData{numCurves=" + this.f4740a.size() + "closed=" + this.f4742c + '}';
    }

    public l(PointF pointF, boolean z, List<a> list) {
        this.f4741b = pointF;
        this.f4742c = z;
        this.f4740a.addAll(list);
    }
}
