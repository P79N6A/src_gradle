package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bs<E> extends ar<E> {

    /* renamed from: a  reason: collision with root package name */
    static final bs<Object> f24705a;
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    final transient Object[] f24706b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final transient Object[] f24707c;

    /* renamed from: d  reason: collision with root package name */
    private final transient int f24708d;

    /* renamed from: e  reason: collision with root package name */
    private final transient int f24709e;

    /* renamed from: f  reason: collision with root package name */
    private final transient int f24710f;

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return true;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return false;
    }

    public final int hashCode() {
        return this.f24709e;
    }

    public final int size() {
        return this.f24710f;
    }

    static {
        bs bsVar = new bs(new Object[0], 0, null, 0, 0);
        f24705a = bsVar;
    }

    /* access modifiers changed from: package-private */
    public final ai<E> c() {
        return ai.b(this.f24706b, this.f24710f);
    }

    public final cg<E> iterator() {
        return asList().iterator();
    }

    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f24707c;
        if (obj == null || objArr == null) {
            return false;
        }
        int a2 = af.a(obj);
        while (true) {
            int i = a2 & this.f24708d;
            Object obj2 = objArr[i];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            a2 = i + 1;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        System.arraycopy(this.f24706b, 0, objArr, i, this.f24710f);
        return i + this.f24710f;
    }

    bs(Object[] objArr, int i, Object[] objArr2, int i2, int i3) {
        this.f24706b = objArr;
        this.f24707c = objArr2;
        this.f24708d = i2;
        this.f24709e = i;
        this.f24710f = i3;
    }
}
