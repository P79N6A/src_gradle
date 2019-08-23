package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.p;
import com.airbnb.lottie.c.b.m;
import com.airbnb.lottie.d;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.List;

public final class f implements d, j, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Path f4585a = new Path();

    /* renamed from: b  reason: collision with root package name */
    private final Paint f4586b = new Paint(1);

    /* renamed from: c  reason: collision with root package name */
    private final com.airbnb.lottie.c.c.a f4587c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4588d;

    /* renamed from: e  reason: collision with root package name */
    private final List<l> f4589e = new ArrayList();

    /* renamed from: f  reason: collision with root package name */
    private final a<Integer, Integer> f4590f;
    private final a<Integer, Integer> g;
    @Nullable
    private a<ColorFilter, ColorFilter> h;
    private final LottieDrawable i;

    public final String b() {
        return this.f4588d;
    }

    public final void a() {
        this.i.invalidateSelf();
    }

    public final void a(List<b> list, List<b> list2) {
        for (int i2 = 0; i2 < list2.size(); i2++) {
            b bVar = list2.get(i2);
            if (bVar instanceof l) {
                this.f4589e.add((l) bVar);
            }
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.f4585a.reset();
        for (int i2 = 0; i2 < this.f4589e.size(); i2++) {
            this.f4585a.addPath(this.f4589e.get(i2).e(), matrix);
        }
        this.f4585a.computeBounds(rectF, false);
        rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        if (t == i.f4876a) {
            this.f4590f.a(cVar);
        } else if (t == i.f4879d) {
            this.g.a(cVar);
        } else {
            if (t == i.x) {
                if (cVar == null) {
                    this.h = null;
                    return;
                }
                this.h = new p(cVar);
                this.h.a((a.C0033a) this);
                this.f4587c.a(this.h);
            }
        }
    }

    public f(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, m mVar) {
        this.f4587c = aVar;
        this.f4588d = mVar.f4744b;
        this.i = lottieDrawable;
        if (mVar.f4745c == null || mVar.f4746d == null) {
            this.f4590f = null;
            this.g = null;
            return;
        }
        this.f4585a.setFillType(mVar.f4743a);
        this.f4590f = mVar.f4745c.a();
        this.f4590f.a((a.C0033a) this);
        aVar.a(this.f4590f);
        this.g = mVar.f4746d.a();
        this.g.a((a.C0033a) this);
        aVar.a(this.g);
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        d.b("FillContent#draw");
        this.f4586b.setColor(((Integer) this.f4590f.d()).intValue());
        this.f4586b.setAlpha(e.a((int) ((((((float) i2) / 255.0f) * ((float) ((Integer) this.g.d()).intValue())) / 100.0f) * 255.0f), 0, 255));
        if (this.h != null) {
            this.f4586b.setColorFilter((ColorFilter) this.h.d());
        }
        this.f4585a.reset();
        for (int i3 = 0; i3 < this.f4589e.size(); i3++) {
            this.f4585a.addPath(this.f4589e.get(i3).e(), matrix);
        }
        canvas.drawPath(this.f4585a, this.f4586b);
        d.c("FillContent#draw");
    }

    public final void a(com.airbnb.lottie.c.e eVar, int i2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e eVar2) {
        e.a(eVar, i2, list, eVar2, this);
    }
}
