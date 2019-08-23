package com.airbnb.lottie.c;

import android.support.annotation.RestrictTo;
import com.airbnb.lottie.c.b.n;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List<n> f4789a;

    /* renamed from: b  reason: collision with root package name */
    public final double f4790b;

    /* renamed from: c  reason: collision with root package name */
    public final double f4791c;

    /* renamed from: d  reason: collision with root package name */
    public final String f4792d;

    /* renamed from: e  reason: collision with root package name */
    private final char f4793e;

    /* renamed from: f  reason: collision with root package name */
    private final String f4794f;

    public final int hashCode() {
        return a(this.f4793e, this.f4794f, this.f4792d);
    }

    public static int a(char c2, String str, String str2) {
        return ((((c2 + 0) * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public d(List<n> list, char c2, double d2, double d3, String str, String str2) {
        this.f4789a = list;
        this.f4793e = c2;
        this.f4790b = d2;
        this.f4791c = d3;
        this.f4792d = str;
        this.f4794f = str2;
    }
}
