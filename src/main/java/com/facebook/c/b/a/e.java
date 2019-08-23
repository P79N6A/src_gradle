package com.facebook.c.b.a;

import android.util.SparseArray;
import android.view.animation.Interpolator;
import com.facebook.c.b.a;
import java.util.List;

public abstract class e<T extends a, M> {

    /* renamed from: a  reason: collision with root package name */
    private final SparseArray<T> f23322a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Interpolator> f23323b;

    /* renamed from: c  reason: collision with root package name */
    private final int f23324c;

    /* renamed from: d  reason: collision with root package name */
    private final int f23325d;

    protected static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    /* access modifiers changed from: protected */
    public abstract void a(T t, T t2, float f2, M m);

    protected e() {
    }

    public e(List<T> list, float[][][] fArr) {
        int size = list.size();
        this.f23322a = new SparseArray<>(size);
        for (int i = 0; i < size; i++) {
            a aVar = (a) list.get(i);
            this.f23322a.put(aVar.a(), aVar);
        }
        this.f23324c = this.f23322a.keyAt(0);
        this.f23325d = this.f23322a.keyAt(size - 1);
        this.f23323b = a.a(fArr);
    }

    public void a(float f2, M m) {
        a aVar;
        a aVar2 = null;
        if (this.f23323b.isEmpty() || f2 <= ((float) this.f23324c)) {
            a((a) this.f23322a.get(this.f23324c), null, 0.0f, m);
        } else if (f2 >= ((float) this.f23325d)) {
            a((a) this.f23322a.get(this.f23325d), null, 0.0f, m);
        } else {
            int size = this.f23323b.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    aVar = null;
                    break;
                } else if (((float) this.f23322a.keyAt(i)) == f2 || (((float) this.f23322a.keyAt(i)) < f2 && ((float) this.f23322a.keyAt(i + 1)) > f2)) {
                    aVar2 = (a) this.f23322a.valueAt(i);
                    aVar = (a) this.f23322a.valueAt(i + 1);
                } else {
                    i++;
                }
            }
            a(aVar2, aVar, this.f23323b.get(i).getInterpolation((f2 - ((float) aVar2.a())) / ((float) (aVar.a() - aVar2.a()))), m);
        }
    }
}
