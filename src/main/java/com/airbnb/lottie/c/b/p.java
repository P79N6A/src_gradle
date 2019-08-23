package com.airbnb.lottie.c.b;

import android.graphics.Paint;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.a.q;
import com.airbnb.lottie.c.a.d;
import java.util.List;

public final class p implements b {

    /* renamed from: a  reason: collision with root package name */
    public final String f4753a;
    @Nullable

    /* renamed from: b  reason: collision with root package name */
    public final com.airbnb.lottie.c.a.b f4754b;

    /* renamed from: c  reason: collision with root package name */
    public final List<com.airbnb.lottie.c.a.b> f4755c;

    /* renamed from: d  reason: collision with root package name */
    public final com.airbnb.lottie.c.a.a f4756d;

    /* renamed from: e  reason: collision with root package name */
    public final d f4757e;

    /* renamed from: f  reason: collision with root package name */
    public final com.airbnb.lottie.c.a.b f4758f;
    public final a g;
    public final b h;
    public final float i;

    public enum a {
        Butt,
        Round,
        Unknown;

        public final Paint.Cap toPaintCap() {
            switch (this) {
                case Butt:
                    return Paint.Cap.BUTT;
                case Round:
                    return Paint.Cap.ROUND;
                default:
                    return Paint.Cap.SQUARE;
            }
        }
    }

    public enum b {
        Miter,
        Round,
        Bevel;

        public final Paint.Join toPaintJoin() {
            switch (this) {
                case Bevel:
                    return Paint.Join.BEVEL;
                case Miter:
                    return Paint.Join.MITER;
                case Round:
                    return Paint.Join.ROUND;
                default:
                    return null;
            }
        }
    }

    public final com.airbnb.lottie.a.a.b a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar) {
        return new q(lottieDrawable, aVar, this);
    }

    public p(String str, @Nullable com.airbnb.lottie.c.a.b bVar, List<com.airbnb.lottie.c.a.b> list, com.airbnb.lottie.c.a.a aVar, d dVar, com.airbnb.lottie.c.a.b bVar2, a aVar2, b bVar3, float f2) {
        this.f4753a = str;
        this.f4754b = bVar;
        this.f4755c = list;
        this.f4756d = aVar;
        this.f4757e = dVar;
        this.f4758f = bVar2;
        this.g = aVar2;
        this.h = bVar3;
        this.i = f2;
    }
}
