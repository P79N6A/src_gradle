package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.c.b.k;
import com.airbnb.lottie.f.e;
import com.airbnb.lottie.g.c;
import com.airbnb.lottie.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public final class o implements d, i, j, l, a.C0033a {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f4622a = new Matrix();

    /* renamed from: b  reason: collision with root package name */
    private final Path f4623b = new Path();

    /* renamed from: c  reason: collision with root package name */
    private final LottieDrawable f4624c;

    /* renamed from: d  reason: collision with root package name */
    private final com.airbnb.lottie.c.c.a f4625d;

    /* renamed from: e  reason: collision with root package name */
    private final String f4626e;

    /* renamed from: f  reason: collision with root package name */
    private final a<Float, Float> f4627f;
    private final a<Float, Float> g;
    private final com.airbnb.lottie.a.b.o h;
    private c i;

    public final String b() {
        return this.f4626e;
    }

    public final void a() {
        this.f4624c.invalidateSelf();
    }

    public final Path e() {
        Path e2 = this.i.e();
        this.f4623b.reset();
        float floatValue = ((Float) this.f4627f.d()).floatValue();
        float floatValue2 = ((Float) this.g.d()).floatValue();
        for (int i2 = ((int) floatValue) - 1; i2 >= 0; i2--) {
            this.f4622a.set(this.h.a(((float) i2) + floatValue2));
            this.f4623b.addPath(e2, this.f4622a);
        }
        return this.f4623b;
    }

    public final void a(ListIterator<b> listIterator) {
        if (this.i == null) {
            while (listIterator.hasPrevious()) {
                if (listIterator.previous() == this) {
                    break;
                }
            }
            ArrayList arrayList = new ArrayList();
            while (listIterator.hasPrevious()) {
                arrayList.add(listIterator.previous());
                listIterator.remove();
            }
            Collections.reverse(arrayList);
            c cVar = new c(this.f4624c, this.f4625d, "Repeater", arrayList, null);
            this.i = cVar;
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.i.a(rectF, matrix);
    }

    public final <T> void a(T t, @Nullable c<T> cVar) {
        if (!this.h.a(t, cVar)) {
            if (t == i.m) {
                this.f4627f.a(cVar);
                return;
            }
            if (t == i.n) {
                this.g.a(cVar);
            }
        }
    }

    public final void a(List<b> list, List<b> list2) {
        this.i.a(list, list2);
    }

    public o(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, k kVar) {
        this.f4624c = lottieDrawable;
        this.f4625d = aVar;
        this.f4626e = kVar.f4736a;
        this.f4627f = kVar.f4737b.a();
        aVar.a(this.f4627f);
        this.f4627f.a((a.C0033a) this);
        this.g = kVar.f4738c.a();
        aVar.a(this.g);
        this.g.a((a.C0033a) this);
        this.h = kVar.f4739d.a();
        this.h.a(aVar);
        this.h.a((a.C0033a) this);
    }

    public final void a(Canvas canvas, Matrix matrix, int i2) {
        float floatValue = ((Float) this.f4627f.d()).floatValue();
        float floatValue2 = ((Float) this.g.d()).floatValue();
        float floatValue3 = ((Float) this.h.f4667f.d()).floatValue() / 100.0f;
        float floatValue4 = ((Float) this.h.g.d()).floatValue() / 100.0f;
        for (int i3 = ((int) floatValue) - 1; i3 >= 0; i3--) {
            this.f4622a.set(matrix);
            float f2 = (float) i3;
            this.f4622a.preConcat(this.h.a(f2 + floatValue2));
            this.i.a(canvas, this.f4622a, (int) (((float) i2) * e.a(floatValue3, floatValue4, f2 / floatValue)));
        }
    }

    public final void a(com.airbnb.lottie.c.e eVar, int i2, List<com.airbnb.lottie.c.e> list, com.airbnb.lottie.c.e eVar2) {
        e.a(eVar, i2, list, eVar2, this);
    }
}
