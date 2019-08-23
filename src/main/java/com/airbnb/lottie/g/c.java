package com.airbnb.lottie.g;

import android.support.annotation.Nullable;
import android.support.annotation.RestrictTo;
import com.airbnb.lottie.a.b.a;

public class c<T> {

    /* renamed from: a  reason: collision with root package name */
    private final b<T> f4871a = new b<>();
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public a<?, ?> f4872c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    protected T f4873d = null;

    public c() {
    }

    public T a(b<T> bVar) {
        return this.f4873d;
    }

    public c(@Nullable T t) {
        this.f4873d = t;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public final T a(float f2, float f3, T t, T t2, float f4, float f5, float f6) {
        return a(this.f4871a.a(f2, f3, t, t2, f4, f5, f6));
    }
}
