package com.airbnb.lottie.g;

import android.graphics.PointF;
import android.support.annotation.FloatRange;
import android.support.annotation.Nullable;
import android.view.animation.Interpolator;
import com.airbnb.lottie.LottieComposition;

public class a<T> {
    @Nullable

    /* renamed from: a  reason: collision with root package name */
    private final LottieComposition f4859a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final T f4860b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final T f4861c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final Interpolator f4862d;

    /* renamed from: e  reason: collision with root package name */
    public final float f4863e;
    @Nullable

    /* renamed from: f  reason: collision with root package name */
    public Float f4864f;
    public PointF g;
    public PointF h;
    private float i = Float.MIN_VALUE;
    private float j = Float.MIN_VALUE;

    public final boolean c() {
        if (this.f4862d == null) {
            return true;
        }
        return false;
    }

    public final float a() {
        if (this.f4859a == null) {
            return 0.0f;
        }
        if (this.i == Float.MIN_VALUE) {
            this.i = (this.f4863e - this.f4859a.getStartFrame()) / this.f4859a.getDurationFrames();
        }
        return this.i;
    }

    public final float b() {
        if (this.f4859a == null) {
            return 1.0f;
        }
        if (this.j == Float.MIN_VALUE) {
            if (this.f4864f == null) {
                this.j = 1.0f;
            } else {
                this.j = a() + ((this.f4864f.floatValue() - this.f4863e) / this.f4859a.getDurationFrames());
            }
        }
        return this.j;
    }

    public String toString() {
        return "Keyframe{startValue=" + this.f4860b + ", endValue=" + this.f4861c + ", startFrame=" + this.f4863e + ", endFrame=" + this.f4864f + ", interpolator=" + this.f4862d + '}';
    }

    public final boolean a(@FloatRange(from = 0.0d, to = 1.0d) float f2) {
        if (f2 < a() || f2 >= b()) {
            return false;
        }
        return true;
    }

    public a(T t) {
        this.f4860b = t;
        this.f4861c = t;
        this.f4863e = Float.MIN_VALUE;
        this.f4864f = Float.valueOf(Float.MAX_VALUE);
    }

    public a(LottieComposition lottieComposition, @Nullable T t, @Nullable T t2, @Nullable Interpolator interpolator, float f2, @Nullable Float f3) {
        this.f4859a = lottieComposition;
        this.f4860b = t;
        this.f4861c = t2;
        this.f4862d = interpolator;
        this.f4863e = f2;
        this.f4864f = f3;
    }
}
