package com.airbnb.lottie.a.a;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.support.annotation.Nullable;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.a.b.a;
import com.airbnb.lottie.a.b.o;
import com.airbnb.lottie.c.a.l;
import com.airbnb.lottie.c.b.b;
import com.airbnb.lottie.c.b.n;
import com.airbnb.lottie.c.e;
import com.airbnb.lottie.c.f;
import java.util.ArrayList;
import java.util.List;

public final class c implements d, l, a.C0033a, f {

    /* renamed from: a  reason: collision with root package name */
    private final Matrix f4573a;

    /* renamed from: b  reason: collision with root package name */
    private final Path f4574b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f4575c;

    /* renamed from: d  reason: collision with root package name */
    private final String f4576d;

    /* renamed from: e  reason: collision with root package name */
    private final List<b> f4577e;

    /* renamed from: f  reason: collision with root package name */
    private final LottieDrawable f4578f;
    @Nullable
    private List<l> g;
    @Nullable
    private o h;

    public final String b() {
        return this.f4576d;
    }

    public final void a() {
        this.f4578f.invalidateSelf();
    }

    /* access modifiers changed from: package-private */
    public final Matrix d() {
        if (this.h != null) {
            return this.h.a();
        }
        this.f4573a.reset();
        return this.f4573a;
    }

    /* access modifiers changed from: package-private */
    public final List<l> c() {
        if (this.g == null) {
            this.g = new ArrayList();
            for (int i = 0; i < this.f4577e.size(); i++) {
                b bVar = this.f4577e.get(i);
                if (bVar instanceof l) {
                    this.g.add((l) bVar);
                }
            }
        }
        return this.g;
    }

    public final Path e() {
        this.f4573a.reset();
        if (this.h != null) {
            this.f4573a.set(this.h.a());
        }
        this.f4574b.reset();
        for (int size = this.f4577e.size() - 1; size >= 0; size--) {
            b bVar = this.f4577e.get(size);
            if (bVar instanceof l) {
                this.f4574b.addPath(((l) bVar).e(), this.f4573a);
            }
        }
        return this.f4574b;
    }

    @Nullable
    private static l a(List<b> list) {
        for (int i = 0; i < list.size(); i++) {
            b bVar = list.get(i);
            if (bVar instanceof l) {
                return (l) bVar;
            }
        }
        return null;
    }

    public final <T> void a(T t, @Nullable com.airbnb.lottie.g.c<T> cVar) {
        if (this.h != null) {
            this.h.a(t, cVar);
        }
    }

    public final void a(RectF rectF, Matrix matrix) {
        this.f4573a.set(matrix);
        if (this.h != null) {
            this.f4573a.preConcat(this.h.a());
        }
        this.f4575c.set(0.0f, 0.0f, 0.0f, 0.0f);
        for (int size = this.f4577e.size() - 1; size >= 0; size--) {
            b bVar = this.f4577e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(this.f4575c, this.f4573a);
                if (rectF.isEmpty()) {
                    rectF.set(this.f4575c);
                } else {
                    rectF.set(Math.min(rectF.left, this.f4575c.left), Math.min(rectF.top, this.f4575c.top), Math.max(rectF.right, this.f4575c.right), Math.max(rectF.bottom, this.f4575c.bottom));
                }
            }
        }
    }

    public final void a(List<b> list, List<b> list2) {
        ArrayList arrayList = new ArrayList(list.size() + this.f4577e.size());
        arrayList.addAll(list);
        for (int size = this.f4577e.size() - 1; size >= 0; size--) {
            b bVar = this.f4577e.get(size);
            bVar.a(arrayList, this.f4577e.subList(0, size));
            arrayList.add(bVar);
        }
    }

    public c(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, n nVar) {
        this(lottieDrawable, aVar, nVar.f4748a, a(lottieDrawable, aVar, nVar.f4749b), a(nVar.f4749b));
    }

    private static List<b> a(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, List<b> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            b a2 = list.get(i).a(lottieDrawable, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return arrayList;
    }

    public final void a(Canvas canvas, Matrix matrix, int i) {
        this.f4573a.set(matrix);
        if (this.h != null) {
            this.f4573a.preConcat(this.h.a());
            i = (int) ((((((float) ((Integer) this.h.f4666e.d()).intValue()) / 100.0f) * ((float) i)) / 255.0f) * 255.0f);
        }
        for (int size = this.f4577e.size() - 1; size >= 0; size--) {
            b bVar = this.f4577e.get(size);
            if (bVar instanceof d) {
                ((d) bVar).a(canvas, this.f4573a, i);
            }
        }
    }

    public final void a(e eVar, int i, List<e> list, e eVar2) {
        if (eVar.a(b(), i)) {
            if (!"__container".equals(b())) {
                eVar2 = eVar2.a(b());
                if (eVar.c(b(), i)) {
                    list.add(eVar2.a((f) this));
                }
            }
            if (eVar.d(b(), i)) {
                int b2 = i + eVar.b(b(), i);
                for (int i2 = 0; i2 < this.f4577e.size(); i2++) {
                    b bVar = this.f4577e.get(i2);
                    if (bVar instanceof f) {
                        ((f) bVar).a(eVar, b2, list, eVar2);
                    }
                }
            }
        }
    }

    c(LottieDrawable lottieDrawable, com.airbnb.lottie.c.c.a aVar, String str, List<b> list, @Nullable l lVar) {
        this.f4573a = new Matrix();
        this.f4574b = new Path();
        this.f4575c = new RectF();
        this.f4576d = str;
        this.f4578f = lottieDrawable;
        this.f4577e = list;
        if (lVar != null) {
            this.h = lVar.a();
            this.h.a(aVar);
            this.h.a((a.C0033a) this);
        }
        ArrayList arrayList = new ArrayList();
        for (int size = list.size() - 1; size >= 0; size--) {
            b bVar = list.get(size);
            if (bVar instanceof i) {
                arrayList.add((i) bVar);
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ((i) arrayList.get(size2)).a(list.listIterator(list.size()));
        }
    }
}
