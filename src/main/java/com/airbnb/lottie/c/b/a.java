package com.airbnb.lottie.c.b;

import android.graphics.PointF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.b;
import com.airbnb.lottie.a.a.e;
import com.airbnb.lottie.c.a.f;
import com.airbnb.lottie.c.a.m;

public final class a implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4703a;

    /* renamed from: b  reason: collision with root package name */
    public final m<PointF, PointF> f4704b;

    /* renamed from: c  reason: collision with root package name */
    public final f f4705c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f4706d;

    public final b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        return new e(lottieDrawable, aVar, this);
    }

    public a(String str, m<PointF, PointF> mVar, f fVar, boolean z) {
        this.f4703a = str;
        this.f4704b = mVar;
        this.f4705c = fVar;
        this.f4706d = z;
    }
}
