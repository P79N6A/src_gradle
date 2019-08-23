package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.ag;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class ar<E> extends ag<E> implements Set<E> {
    @NullableDecl
    @RetainedWith
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    private transient ai<E> f24587a;

    public static class a<E> extends ag.a<E> {
        @NullableDecl
        @VisibleForTesting

        /* renamed from: d  reason: collision with root package name */
        Object[] f24588d;

        /* renamed from: e  reason: collision with root package name */
        private int f24589e;

        public a() {
            super(4);
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: com.google.common.collect.bs} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: com.google.common.collect.ar} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v18, resolved type: com.google.common.collect.bs} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: com.google.common.collect.bs} */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.google.common.collect.ar<E> a() {
            /*
                r8 = this;
                int r0 = r8.f24538b
                switch(r0) {
                    case 0: goto L_0x0034;
                    case 1: goto L_0x002a;
                    default: goto L_0x0005;
                }
            L_0x0005:
                java.lang.Object[] r0 = r8.f24588d
                r1 = 1
                if (r0 == 0) goto L_0x004e
                int r0 = r8.f24538b
                int r0 = com.google.common.collect.ar.b(r0)
                java.lang.Object[] r2 = r8.f24588d
                int r2 = r2.length
                if (r0 != r2) goto L_0x004e
                int r0 = r8.f24538b
                java.lang.Object[] r2 = r8.f24537a
                int r2 = r2.length
                boolean r0 = com.google.common.collect.ar.shouldTrim(r0, r2)
                if (r0 == 0) goto L_0x0039
                java.lang.Object[] r0 = r8.f24537a
                int r2 = r8.f24538b
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r2)
            L_0x0028:
                r3 = r0
                goto L_0x003c
            L_0x002a:
                java.lang.Object[] r0 = r8.f24537a
                r1 = 0
                r0 = r0[r1]
                com.google.common.collect.ar r0 = com.google.common.collect.ar.of(r0)
                return r0
            L_0x0034:
                com.google.common.collect.ar r0 = com.google.common.collect.ar.of()
                return r0
            L_0x0039:
                java.lang.Object[] r0 = r8.f24537a
                goto L_0x0028
            L_0x003c:
                com.google.common.collect.bs r0 = new com.google.common.collect.bs
                int r4 = r8.f24589e
                java.lang.Object[] r5 = r8.f24588d
                java.lang.Object[] r2 = r8.f24588d
                int r2 = r2.length
                int r6 = r2 + -1
                int r7 = r8.f24538b
                r2 = r0
                r2.<init>(r3, r4, r5, r6, r7)
                goto L_0x005c
            L_0x004e:
                int r0 = r8.f24538b
                java.lang.Object[] r2 = r8.f24537a
                com.google.common.collect.ar r0 = com.google.common.collect.ar.construct(r0, r2)
                int r2 = r0.size()
                r8.f24538b = r2
            L_0x005c:
                r8.f24539c = r1
                r1 = 0
                r8.f24588d = r1
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ar.a.a():com.google.common.collect.ar");
        }

        a(int i) {
            super(i);
            this.f24588d = new Object[ar.b(i)];
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public a<E> a(Iterable<? extends E> iterable) {
            m.a(iterable);
            if (this.f24588d != null) {
                for (Object c2 : iterable) {
                    b(c2);
                }
            } else {
                super.a(iterable);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public a<E> a(Iterator<? extends E> it2) {
            m.a(it2);
            while (it2.hasNext()) {
                b(it2.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: b */
        public a<E> a(E... eArr) {
            if (this.f24588d != null) {
                for (E c2 : eArr) {
                    b(c2);
                }
            } else {
                super.a(eArr);
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public a<E> b(E e2) {
            m.a(e2);
            if (this.f24588d == null || ar.b(this.f24538b) > this.f24588d.length) {
                this.f24588d = null;
                super.b(e2);
                return this;
            }
            int length = this.f24588d.length - 1;
            int hashCode = e2.hashCode();
            int a2 = af.a(hashCode);
            while (true) {
                int i = a2 & length;
                Object obj = this.f24588d[i];
                if (obj != null) {
                    if (obj.equals(e2)) {
                        break;
                    }
                    a2 = i + 1;
                } else {
                    this.f24588d[i] = e2;
                    this.f24589e += hashCode;
                    super.b(e2);
                    break;
                }
            }
            return this;
        }
    }

    static abstract class b<E> extends ar<E> {
        /* access modifiers changed from: package-private */
        public abstract E a(int i);

        b() {
        }

        /* access modifiers changed from: package-private */
        public final ai<E> c() {
            return new ai<E>() {
                /* access modifiers changed from: package-private */
                public final boolean isPartialView() {
                    return b.this.isPartialView();
                }

                public final int size() {
                    return b.this.size();
                }

                public final E get(int i) {
                    return b.this.a(i);
                }
            };
        }

        public cg<E> iterator() {
            return asList().iterator();
        }

        /* access modifiers changed from: package-private */
        public final int a(Object[] objArr, int i) {
            return asList().a(objArr, i);
        }
    }

    static class c implements Serializable {
        private static final long serialVersionUID = 0;
        final Object[] elements;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return ar.copyOf((E[]) this.elements);
        }

        c(Object[] objArr) {
            this.elements = objArr;
        }
    }

    public static boolean shouldTrim(int i, int i2) {
        return i < (i2 >> 1) + (i2 >> 2);
    }

    /* access modifiers changed from: package-private */
    public boolean b() {
        return false;
    }

    public abstract cg<E> iterator();

    ar() {
    }

    public static <E> ar<E> of() {
        return bs.f24705a;
    }

    public static <E> a<E> builder() {
        return new a<>();
    }

    public int hashCode() {
        return by.a(this);
    }

    public ai<E> asList() {
        ai<E> aiVar = this.f24587a;
        if (aiVar != null) {
            return aiVar;
        }
        ai<E> c2 = c();
        this.f24587a = c2;
        return c2;
    }

    /* access modifiers changed from: package-private */
    public ai<E> c() {
        return ai.a(toArray());
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new c(toArray());
    }

    public static <E> ar<E> of(E e2) {
        return new bz(e2);
    }

    @Beta
    public static <E> a<E> builderWithExpectedSize(int i) {
        l.a(i, "expectedSize");
        return new a<>(i);
    }

    public static <E> ar<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    @VisibleForTesting
    static int b(int i) {
        int max = Math.max(i, 2);
        boolean z = true;
        if (max < 751619276) {
            int highestOneBit = Integer.highestOneBit(max - 1) << 1;
            while (true) {
                double d2 = (double) highestOneBit;
                Double.isNaN(d2);
                if (d2 * 0.7d >= ((double) max)) {
                    return highestOneBit;
                }
                highestOneBit <<= 1;
            }
        } else {
            if (max >= 1073741824) {
                z = false;
            }
            m.a(z, (Object) "collection too large");
            return 1073741824;
        }
    }

    public static <E> ar<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ar) && !(collection instanceof SortedSet)) {
            ar<E> arVar = (ar) collection;
            if (!arVar.isPartialView()) {
                return arVar;
            }
        }
        Object[] array = collection.toArray();
        return construct(array.length, array);
    }

    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ar) || !b() || !((ar) obj).b() || hashCode() == obj.hashCode()) {
            return by.a((Set<?>) this, obj);
        }
        return false;
    }

    public static <E> ar<E> copyOf(Iterator<? extends E> it2) {
        if (!it2.hasNext()) {
            return of();
        }
        Object next = it2.next();
        if (!it2.hasNext()) {
            return of(next);
        }
        return new a().b(next).a(it2).a();
    }

    public static <E> ar<E> copyOf(E[] eArr) {
        switch (eArr.length) {
            case 0:
                return of();
            case 1:
                return of(eArr[0]);
            default:
                return construct(eArr.length, (Object[]) eArr.clone());
        }
    }

    public static <E> ar<E> of(E e2, E e3) {
        return construct(2, e2, e3);
    }

    public static <E> ar<E> construct(int i, Object... objArr) {
        while (true) {
            switch (i) {
                case 0:
                    return of();
                case 1:
                    return of(objArr[0]);
                default:
                    int b2 = b(i);
                    Object[] objArr2 = new Object[b2];
                    int i2 = b2 - 1;
                    int i3 = 0;
                    int i4 = 0;
                    for (int i5 = 0; i5 < i; i5++) {
                        Object a2 = bl.a(objArr[i5], i5);
                        int hashCode = a2.hashCode();
                        int a3 = af.a(hashCode);
                        while (true) {
                            int i6 = a3 & i2;
                            Object obj = objArr2[i6];
                            if (obj == null) {
                                objArr[i4] = a2;
                                objArr2[i6] = a2;
                                i3 += hashCode;
                                i4++;
                            } else if (!obj.equals(a2)) {
                                a3++;
                            }
                        }
                    }
                    Arrays.fill(objArr, i4, i, null);
                    if (i4 == 1) {
                        return new bz(objArr[0], i3);
                    }
                    if (b(i4) < b2 / 2) {
                        i = i4;
                    } else {
                        if (shouldTrim(i4, objArr.length)) {
                            objArr = Arrays.copyOf(objArr, i4);
                        }
                        bs bsVar = new bs(objArr, i3, objArr2, i2, i4);
                        return bsVar;
                    }
            }
        }
    }

    public static <E> ar<E> of(E e2, E e3, E e4) {
        return construct(3, e2, e3, e4);
    }

    public static <E> ar<E> of(E e2, E e3, E e4, E e5) {
        return construct(4, e2, e3, e4, e5);
    }

    public static <E> ar<E> of(E e2, E e3, E e4, E e5, E e6) {
        return construct(5, e2, e3, e4, e5, e6);
    }

    @SafeVarargs
    public static <E> ar<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        boolean z;
        if (eArr.length <= 2147483641) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, (Object) "the total number of elements must fit in an int");
        Object[] objArr = new Object[(eArr.length + 6)];
        objArr[0] = e2;
        objArr[1] = e3;
        objArr[2] = e4;
        objArr[3] = e5;
        objArr[4] = e6;
        objArr[5] = e7;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return construct(objArr.length, objArr);
    }
}
