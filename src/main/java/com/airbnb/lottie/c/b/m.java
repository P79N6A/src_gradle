package com.airbnb.lottie.c.b;

import android.graphics.Path;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.f;
import com.airbnb.lottie.c.a.a;
import com.airbnb.lottie.c.a.d;

public final class m implements b {

    /* renamed from: a  reason: collision with root package name */
    public final Path.FillType f4743a;

    /* renamed from: b  reason: collision with root package name */
    public final String f4744b;
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    public final a f4745c;
    @Nullable

    /* renamed from: d  reason: collision with root package name */
    public final d f4746d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f4747e;

    public final String toString() {
        return "ShapeFill{color=, fillEnabled=" + this.f4747e + '}';
    }

    public final b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        return new f(lottieDrawable, aVar, this);
    }

    public m(String str, boolean z, Path.FillType fillType, @Nullable a aVar, @Nullable d dVar) {
        this.f4744b = str;
        this.f4747e = z;
        this.f4743a = fillType;
        this.f4745c = aVar;
        this.f4746d = dVar;
    }
}
