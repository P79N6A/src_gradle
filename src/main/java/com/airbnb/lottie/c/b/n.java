package com.airbnb.lottie.c.b;

import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.c;
import com.airbnb.lottie.c.c.a;
import java.util.Arrays;
import java.util.List;

public final class n implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4748a;

    /* renamed from: b  reason: collision with root package name */
    public final List<b> f4749b;

    public final String toString() {
        return "ShapeGroup{name='" + this.f4748a + "' Shapes: " + Arrays.toString(this.f4749b.toArray()) + '}';
    }

    public n(String str, List<b> list) {
        this.f4748a = str;
        this.f4749b = list;
    }

    public final b a(LottieDrawable lottieDrawable, a aVar) {
        return new c(lottieDrawable, aVar, this);
    }
}
