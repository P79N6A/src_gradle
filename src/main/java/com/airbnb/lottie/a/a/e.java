package com.airbnb.lottie.a.a;

import android.graphics.Path;
import android.graphics.PointF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.q;
import com.airbnb.lottie.f.f;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;
import java.util.List;

public final class e implements j, l, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4579a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final String f4580b;

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f4581c;

    /* renamed from: d  reason: collision with root package name */
    private final a<?, PointF> f4582d;

    /* renamed from: e  reason: collision with root package name */
    private final a<?, PointF> f4583e;

    /* renamed from: f  reason: collision with root package name */
    private final com.airbnb.lottie.c.b.a f4584f;
    @Nullable
    private r g;
    private boolean h;

    public final String b() {
        return this.f4580b;
    }

    public final void a() {
        this.h = false;
        this.f4581c.invalidateSelf();
    }

    public final Path e() {
        if (this.h) {
            return this.f4579a;
        }
        this.f4579a.reset();
        PointF pointF = (PointF) this.f4582d.d();
        float f2 = pointF.x / 2.0f;
        float f3 = pointF.y / 2.0f;
        float f4 = f2 * 0.55228f;
        float f5 = 0.55228f * f3;
        this.f4579a.reset();
        if (this.f4584f.f4706d) {
            float f6 = -f3;
            this.f4579a.moveTo(0.0f, f6);
            float f7 = 0.0f - f4;
            float f8 = -f2;
            float f9 = 0.0f - f5;
            this.f4579a.cubicTo(f7, f6, f8, f9, f8, 0.0f);
            float f10 = f5 + 0.0f;
            float f11 = f6;
            this.f4579a.cubicTo(f8, f10, f7, f3, 0.0f, f3);
            float f12 = f4 + 0.0f;
            this.f4579a.cubicTo(f12, f3, f2, f10, f2, 0.0f);
            this.f4579a.cubicTo(f2, f9, f12, f11, 0.0f, f11);
        } else {
            float f13 = -f3;
            this.f4579a.moveTo(0.0f, f13);
            float f14 = f4 + 0.0f;
            float f15 = 0.0f - f5;
            this.f4579a.cubicTo(f14, f13, f2, f15, f2, 0.0f);
            float f16 = f5 + 0.0f;
            this.f4579a.cubicTo(f2, f16, f14, f3, 0.0f, f3);
            float f17 = 0.0f - f4;
            float f18 = -f2;
            this.f4579a.cubicTo(f17, f3, f18, f16, f18, 0.0f);
            float f19 = f13;
            this.f4579a.cubicTo(f18, f15, f17, f19, 0.0f, f19);
        }
        PointF pointF2 = (PointF) this.f4583e.d();
        this.f4579a.offset(pointF2.x, pointF2.y);
        this.f4579a.close();
        f.a(this.f4579a, this.g);
        this.h = true;
        return this.f4579a;
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        if (t == i.g) {
            this.f4582d.a(cVar);
            return;
        }
        if (t == i.h) {
            this.f4583e.a(cVar);
        }
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof r) {
                r rVar = (r) bVar;
                if (rVar.f4638a == q.a.Simultaneously) {
                    this.g = rVar;
                    this.g.a(this);
                }
            }
        }
    }

    public e(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, com.airbnb.lottie.c.b.a aVar2) {
        this.f4580b = aVar2.f4703a;
        this.f4581c = lottieDrawable;
        this.f4582d = aVar2.f4705c.a();
        this.f4583e = aVar2.f4704b.a();
        this.f4584f = aVar2;
        aVar.a(this.f4582d);
        aVar.a(this.f4583e);
        this.f4582d.a((a.C0033a) this);
        this.f4583e.a((a.C0033a) this);
    }

    public final void a(com.airbnb.lottie.c.e eVar, int i, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e eVar2) {
        com.airbnb.lottie.f.e.a(eVar, i, list, eVar2, this);
    }
}
