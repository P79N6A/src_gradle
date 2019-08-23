package com.airbnb.lottie.c;

import android.support.annotation.ColorInt;
import android.support.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4697a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4698b;

    /* renamed from: c  reason: collision with root package name */
    public final double f4699c;

    /* renamed from: d  reason: collision with root package name */
    final int f4700d;

    /* renamed from: e  reason: collision with root package name */
    public final int f4701e;

    /* renamed from: f  reason: collision with root package name */
    final double f4702f;
    public final double g;
    @ColorInt
    public final int h;
    @ColorInt
    public final int i;
    public final int j;
    public final boolean k;

    public final int hashCode() {
        double hashCode = (double) (((this.f4697a.hashCode() * 31) + this.f4698b.hashCode()) * 31);
        double d2 = this.f4699c;
        Double.isNaN(hashCode);
        int i2 = (((((int) (hashCode + d2)) * 31) + this.f4700d) * 31) + this.f4701e;
        long doubleToLongBits = Double.doubleToLongBits(this.f4702f);
        return (((i2 * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)))) * 31) + this.h;
    }

    public b(String str, String str2, double d2, int i2, int i3, double d3, double d4, @ColorInt int i4, @ColorInt int i5, int i6, boolean z) {
        this.f4697a = str;
        this.f4698b = str2;
        this.f4699c = d2;
        this.f4700d = i2;
        this.f4701e = i3;
        this.f4702f = d3;
        this.g = d4;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = z;
    }
}
