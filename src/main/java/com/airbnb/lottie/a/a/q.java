package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.c.a;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;

public final class q extends a {

    /* renamed from: b  reason: collision with root package name */
    private final a f4634b;

    /* renamed from: c  reason: collision with root package name */
    private final String f4635c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.a.b.a<Integer, Integer> f4636d;
    @Nullable

    /* renamed from: e  reason: collision with root package name */
    private com.airbnb.lottie.a.b.a<ColorFilter, ColorFilter> f4637e;

    public final String b() {
        return this.f4635c;
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        super.a(t, cVar);
        if (t == i.f4877b) {
            this.f4636d.a(cVar);
            return;
        }
        if (t == i.x) {
            if (cVar == null) {
                this.f4637e = null;
                return;
            }
            this.f4637e = new p(cVar);
            this.f4637e.a((a.C0033a) this);
            this.f4634b.a(this.f4636d);
        }
    }

    public q(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, com.airbnb.lottie.c.b.p pVar) {
        super(lottieDrawable, aVar, pVar.g.toPaintCap(), pVar.h.toPaintJoin(), pVar.i, pVar.f4757e, pVar.f4758f, pVar.f4755c, pVar.f4754b);
        this.f4634b = aVar;
        this.f4635c = pVar.f4753a;
        this.f4636d = pVar.f4756d.a();
        this.f4636d.a((a.C0033a) this);
        aVar.a(this.f4636d);
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.f4565a.setColor(((Integer) this.f4636d.d()).intValue());
        if (this.f4637e != null) {
            this.f4565a.setColorFilter((ColorFilter) this.f4637e.d());
        }
        super.a(canvas, matrix, i);
    }
}
