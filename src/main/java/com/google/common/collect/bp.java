package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;

@GwtCompatible
public final class bp<E> extends ai<E> {

    /* renamed from: a  reason: collision with root package name */
    static final ai<Object> f24688a = new bp(new Object[0], 0);
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f24689b;

    /* renamed from: c  reason: collision with root package name */
    private final transient int f24690c;

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int size() {
        return this.f24690c;
    }

    public final E get(int i) {
        m.a(i, this.f24690c);
        return this.f24689b[i];
    }

    bp(Object[] objArr, int i) {
        this.f24689b = objArr;
        this.f24690c = i;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f24689b, 0, objArr, i, this.f24690c);
        return i + this.f24690c;
    }
}
