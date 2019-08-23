package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class cc<T> {

    /* renamed from: a  reason: collision with root package name */
    final int f24717a;

    /* renamed from: b  reason: collision with root package name */
    final Comparator<? super T> f24718b;

    /* renamed from: c  reason: collision with root package name */
    final T[] f24719c;

    /* renamed from: d  reason: collision with root package name */
    int f24720d;
    @NullableDecl

    /* renamed from: e  reason: collision with root package name */
    T f24721e;

    private void a(int i, int i2) {
        T t = this.f24719c[i];
        T[] tArr = this.f24719c;
        tArr[i] = tArr[i2];
        this.f24719c[i2] = t;
    }

    cc(Comparator<? super T> comparator, int i) {
        boolean z;
        this.f24718b = (Comparator) m.a(comparator, (Object) "comparator");
        this.f24717a = i;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, "k must be nonnegative, was %s", i);
        this.f24719c = (Object[]) new Object[(i * 2)];
        this.f24720d = 0;
        this.f24721e = null;
    }

    /* access modifiers changed from: package-private */
    public int a(int i, int i2, int i3) {
        T t = this.f24719c[i3];
        T[] tArr = this.f24719c;
        tArr[i3] = tArr[i2];
        int i4 = i;
        while (i < i2) {
            if (this.f24718b.compare(this.f24719c[i], t) < 0) {
                a(i4, i);
                i4++;
            }
            i++;
        }
        T[] tArr2 = this.f24719c;
        tArr2[i2] = tArr2[i4];
        this.f24719c[i4] = t;
        return i4;
    }
}
