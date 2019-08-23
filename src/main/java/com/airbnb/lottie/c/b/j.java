package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.n;
import com.airbnb.lottie.c.a.b;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.m;
import com.airbnb.lottie.c.c.a;

public final class j implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4732a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f4733b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4734c;

    /* renamed from: d  reason: collision with root package name */
    public final b f4735d;

    public final String toString() {
        return "RectangleShape{position=" + this.f4733b + ", size=" + this.f4734c + '}';
    }

    public final com.airbnb.lottie.a.a.b a(LottieDrawable lottieDrawable, a aVar) {
        return new n(lottieDrawable, aVar, this);
    }

    public j(String str, m<PointF, PointF> mVar, f fVar, b bVar) {
        this.f4732a = str;
        this.f4733b = mVar;
        this.f4734c = fVar;
        this.f4735d = bVar;
    }
}
