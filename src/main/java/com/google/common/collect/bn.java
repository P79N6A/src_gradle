package com.google.common.collect;

import com.google.common.a.f;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.az;
import com.google.common.collect.bb;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public abstract class bn<T> implements Comparator<T> {

    @VisibleForTesting
    static class a extends bn<Object> {

        /* renamed from: a  reason: collision with root package name */
        private final AtomicInteger f24685a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        private final ConcurrentMap<Object, Integer> f24686b = new ba().a(bb.n.WEAK).e();

        public final String toString() {
            return "Ordering.arbitrary()";
        }

        a() {
        }

        private static int b(Object obj) {
            return System.identityHashCode(obj);
        }

        private Integer a(Object obj) {
            Integer num = (Integer) this.f24686b.get(obj);
            if (num != null) {
                return num;
            }
            Integer valueOf = Integer.valueOf(this.f24685a.getAndIncrement());
            Integer putIfAbsent = this.f24686b.putIfAbsent(obj, valueOf);
            if (putIfAbsent != null) {
                return putIfAbsent;
            }
            return valueOf;
        }

        public final int compare(Object obj, Object obj2) {
            if (obj == obj2) {
                return 0;
            }
            if (obj == null) {
                return -1;
            }
            if (obj2 == null) {
                return 1;
            }
            int b2 = b(obj);
            int b3 = b(obj2);
            if (b2 == b3) {
                int compareTo = a(obj).compareTo(a(obj2));
                if (compareTo != 0) {
                    return compareTo;
                }
                throw new AssertionError();
            } else if (b2 < b3) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    static class b {

        /* renamed from: a  reason: collision with root package name */
        static final bn<Object> f24687a = new a();
    }

    @VisibleForTesting
    static class c extends ClassCastException {
        private static final long serialVersionUID = 0;
        final Object value;

        c(Object obj) {
            super("Cannot compare value: " + obj);
            this.value = obj;
        }
    }

    @CanIgnoreReturnValue
    public abstract int compare(@NullableDecl T t, @NullableDecl T t2);

    protected bn() {
    }

    @GwtCompatible
    public static bn<Object> allEqual() {
        return j.f24771a;
    }

    public static bn<Object> arbitrary() {
        return b.f24687a;
    }

    @GwtCompatible
    public static <C extends Comparable> bn<C> natural() {
        return bi.f24673a;
    }

    @GwtCompatible
    public static bn<Object> usingToString() {
        return ci.f24723a;
    }

    @GwtCompatible
    public <S extends T> bn<Iterable<S>> lexicographical() {
        return new ax(this);
    }

    @GwtCompatible
    public <S extends T> bn<S> nullsFirst() {
        return new bj(this);
    }

    @GwtCompatible
    public <S extends T> bn<S> nullsLast() {
        return new bk(this);
    }

    @GwtCompatible
    public <S extends T> bn<S> reverse() {
        return new bv(this);
    }

    /* access modifiers changed from: package-private */
    public final <T2 extends T> bn<Map.Entry<T2, ?>> a() {
        return onResultOf(bc.a());
    }

    @GwtCompatible
    public static <T> bn<T> compound(Iterable<? extends Comparator<? super T>> iterable) {
        return new r(iterable);
    }

    @GwtCompatible
    public static <T> bn<T> explicit(List<T> list) {
        return new u(list);
    }

    @GwtCompatible
    @Deprecated
    public static <T> bn<T> from(bn<T> bnVar) {
        return (bn) m.a(bnVar);
    }

    @CanIgnoreReturnValue
    public <E extends T> ai<E> immutableSortedCopy(Iterable<E> iterable) {
        return ai.sortedCopyOf(this, iterable);
    }

    @GwtCompatible
    public <F> bn<F> onResultOf(f<F, ? extends T> fVar) {
        return new k(fVar, this);
    }

    @GwtCompatible
    public static <T> bn<T> from(Comparator<T> comparator) {
        if (comparator instanceof bn) {
            return (bn) comparator;
        }
        return new q(comparator);
    }

    @GwtCompatible
    public <U extends T> bn<U> compound(Comparator<? super U> comparator) {
        return new r(this, (Comparator) m.a(comparator));
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(Iterable<E> iterable) {
        return max(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(Iterable<E> iterable) {
        return min(iterable.iterator());
    }

    @CanIgnoreReturnValue
    public <E extends T> List<E> sortedCopy(Iterable<E> iterable) {
        Object[] a2 = av.a(iterable);
        Arrays.sort(a2, this);
        return az.a((Iterable<? extends E>) Arrays.asList(a2));
    }

    public boolean isOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    public boolean isStrictlyOrdered(Iterable<? extends T> iterable) {
        Iterator<? extends T> it2 = iterable.iterator();
        if (it2.hasNext()) {
            Object next = it2.next();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (compare(next, next2) >= 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(Iterator<E> it2) {
        E next = it2.next();
        while (it2.hasNext()) {
            next = max(next, it2.next());
        }
        return next;
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(Iterator<E> it2) {
        E next = it2.next();
        while (it2.hasNext()) {
            next = min(next, it2.next());
        }
        return next;
    }

    @Deprecated
    public int binarySearch(List<? extends T> list, @NullableDecl T t) {
        return Collections.binarySearch(list, t, this);
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(@NullableDecl E e2, @NullableDecl E e3) {
        if (compare(e2, e3) >= 0) {
            return e2;
        }
        return e3;
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(@NullableDecl E e2, @NullableDecl E e3) {
        if (compare(e2, e3) <= 0) {
            return e2;
        }
        return e3;
    }

    @GwtCompatible
    public static <T> bn<T> explicit(T t, T... tArr) {
        return explicit(new az.a(t, tArr));
    }

    public <E extends T> List<E> greatestOf(Iterable<E> iterable, int i) {
        return reverse().leastOf(iterable, i);
    }

    public <E extends T> List<E> greatestOf(Iterator<E> it2, int i) {
        return reverse().leastOf(it2, i);
    }

    public <E extends T> List<E> leastOf(Iterable<E> iterable, int i) {
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (((long) collection.size()) <= ((long) i) * 2) {
                Object[] array = collection.toArray();
                Arrays.sort(array, this);
                if (array.length > i) {
                    array = Arrays.copyOf(array, i);
                }
                return Collections.unmodifiableList(Arrays.asList(array));
            }
        }
        return leastOf(iterable.iterator(), i);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.util.Iterator<E>, java.util.Iterator, java.lang.Object] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public <E extends T> java.util.List<E> leastOf(java.util.Iterator<E> r9, int r10) {
        /*
            r8 = this;
            com.google.common.a.m.a(r9)
            java.lang.String r0 = "k"
            com.google.common.collect.l.a((int) r10, (java.lang.String) r0)
            if (r10 == 0) goto L_0x0192
            boolean r0 = r9.hasNext()
            if (r0 != 0) goto L_0x0012
            goto L_0x0192
        L_0x0012:
            r0 = 1073741823(0x3fffffff, float:1.9999999)
            if (r10 < r0) goto L_0x0037
            java.util.ArrayList r9 = com.google.common.collect.az.a((java.util.Iterator<? extends E>) r9)
            java.util.Collections.sort(r9, r8)
            int r0 = r9.size()
            if (r0 <= r10) goto L_0x002f
            int r0 = r9.size()
            java.util.List r10 = r9.subList(r10, r0)
            r10.clear()
        L_0x002f:
            r9.trimToSize()
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            return r9
        L_0x0037:
            com.google.common.collect.cc r0 = new com.google.common.collect.cc
            r0.<init>(r8, r10)
        L_0x003c:
            boolean r10 = r9.hasNext()
            r1 = 0
            r2 = 1
            if (r10 == 0) goto L_0x015a
            java.lang.Object r10 = r9.next()
            int r3 = r0.f24717a
            if (r3 == 0) goto L_0x003c
            int r3 = r0.f24720d
            if (r3 != 0) goto L_0x0059
            T[] r3 = r0.f24719c
            r3[r1] = r10
            r0.f24721e = r10
            r0.f24720d = r2
            goto L_0x003c
        L_0x0059:
            int r3 = r0.f24720d
            int r4 = r0.f24717a
            if (r3 >= r4) goto L_0x0076
            T[] r1 = r0.f24719c
            int r2 = r0.f24720d
            int r3 = r2 + 1
            r0.f24720d = r3
            r1[r2] = r10
            java.util.Comparator<? super T> r1 = r0.f24718b
            T r2 = r0.f24721e
            int r1 = r1.compare(r10, r2)
            if (r1 <= 0) goto L_0x003c
            r0.f24721e = r10
            goto L_0x003c
        L_0x0076:
            java.util.Comparator<? super T> r3 = r0.f24718b
            T r4 = r0.f24721e
            int r3 = r3.compare(r10, r4)
            if (r3 >= 0) goto L_0x003c
            T[] r3 = r0.f24719c
            int r4 = r0.f24720d
            int r5 = r4 + 1
            r0.f24720d = r5
            r3[r4] = r10
            int r10 = r0.f24720d
            int r3 = r0.f24717a
            int r3 = r3 * 2
            if (r10 != r3) goto L_0x003c
            int r10 = r0.f24717a
            int r10 = r10 * 2
            int r10 = r10 - r2
            int r3 = r10 + 0
            java.math.RoundingMode r4 = java.math.RoundingMode.CEILING
            if (r3 <= 0) goto L_0x0139
            int[] r5 = com.google.common.e.a.AnonymousClass1.f24841a
            int r4 = r4.ordinal()
            r4 = r5[r4]
            switch(r4) {
                case 1: goto L_0x00ca;
                case 2: goto L_0x00da;
                case 3: goto L_0x00da;
                case 4: goto L_0x00c1;
                case 5: goto L_0x00c1;
                case 6: goto L_0x00ae;
                case 7: goto L_0x00ae;
                case 8: goto L_0x00ae;
                default: goto L_0x00a8;
            }
        L_0x00a8:
            java.lang.AssertionError r9 = new java.lang.AssertionError
            r9.<init>()
            throw r9
        L_0x00ae:
            int r4 = java.lang.Integer.numberOfLeadingZeros(r3)
            r5 = -1257966797(0xffffffffb504f333, float:-4.9527733E-7)
            int r5 = r5 >>> r4
            int r4 = 31 - r4
            int r5 = r5 - r3
            r3 = r5 ^ -1
            r3 = r3 ^ -1
            int r3 = r3 >>> 31
            int r4 = r4 + r3
            goto L_0x00e0
        L_0x00c1:
            int r3 = r3 + -1
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r4 = 32 - r3
            goto L_0x00e0
        L_0x00ca:
            if (r3 <= 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            int r5 = r3 + -1
            r5 = r5 & r3
            if (r5 != 0) goto L_0x00d6
            r5 = 1
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            r4 = r4 & r5
            if (r4 == 0) goto L_0x0131
        L_0x00da:
            int r3 = java.lang.Integer.numberOfLeadingZeros(r3)
            int r4 = 31 - r3
        L_0x00e0:
            int r4 = r4 * 3
            r3 = 0
            r5 = 0
        L_0x00e4:
            if (r1 >= r10) goto L_0x010b
            int r6 = r1 + r10
            int r6 = r6 + r2
            int r6 = r6 >>> r2
            int r6 = r0.a(r1, r10, r6)
            int r7 = r0.f24717a
            if (r6 <= r7) goto L_0x00f6
            int r6 = r6 + -1
            r10 = r6
            goto L_0x0101
        L_0x00f6:
            int r7 = r0.f24717a
            if (r6 >= r7) goto L_0x010b
            int r1 = r1 + 1
            int r1 = java.lang.Math.max(r6, r1)
            r5 = r6
        L_0x0101:
            int r3 = r3 + r2
            if (r3 < r4) goto L_0x00e4
            T[] r3 = r0.f24719c
            java.util.Comparator<? super T> r4 = r0.f24718b
            java.util.Arrays.sort(r3, r1, r10, r4)
        L_0x010b:
            int r10 = r0.f24717a
            r0.f24720d = r10
            T[] r10 = r0.f24719c
            r10 = r10[r5]
            r0.f24721e = r10
            int r5 = r5 + r2
        L_0x0116:
            int r10 = r0.f24717a
            if (r5 >= r10) goto L_0x003c
            java.util.Comparator<? super T> r10 = r0.f24718b
            T[] r1 = r0.f24719c
            r1 = r1[r5]
            T r2 = r0.f24721e
            int r10 = r10.compare(r1, r2)
            if (r10 <= 0) goto L_0x012e
            T[] r10 = r0.f24719c
            r10 = r10[r5]
            r0.f24721e = r10
        L_0x012e:
            int r5 = r5 + 1
            goto L_0x0116
        L_0x0131:
            java.lang.ArithmeticException r9 = new java.lang.ArithmeticException
            java.lang.String r10 = "mode was UNNECESSARY, but rounding was necessary"
            r9.<init>(r10)
            throw r9
        L_0x0139:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "x"
            r10.append(r0)
            java.lang.String r0 = " ("
            r10.append(r0)
            r10.append(r3)
            java.lang.String r0 = ") must be > 0"
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        L_0x015a:
            T[] r9 = r0.f24719c
            int r10 = r0.f24720d
            java.util.Comparator<? super T> r3 = r0.f24718b
            java.util.Arrays.sort(r9, r1, r10, r3)
            int r9 = r0.f24720d
            int r10 = r0.f24717a
            if (r9 <= r10) goto L_0x0181
            T[] r9 = r0.f24719c
            int r10 = r0.f24717a
            T[] r1 = r0.f24719c
            int r1 = r1.length
            r3 = 0
            java.util.Arrays.fill(r9, r10, r1, r3)
            int r9 = r0.f24717a
            r0.f24720d = r9
            T[] r9 = r0.f24719c
            int r10 = r0.f24717a
            int r10 = r10 - r2
            r9 = r9[r10]
            r0.f24721e = r9
        L_0x0181:
            T[] r9 = r0.f24719c
            int r10 = r0.f24720d
            java.lang.Object[] r9 = java.util.Arrays.copyOf(r9, r10)
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.util.List r9 = java.util.Collections.unmodifiableList(r9)
            return r9
        L_0x0192:
            java.util.List r9 = java.util.Collections.emptyList()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.bn.leastOf(java.util.Iterator, int):java.util.List");
    }

    @CanIgnoreReturnValue
    public <E extends T> E max(@NullableDecl E e2, @NullableDecl E e3, @NullableDecl E e4, E... eArr) {
        E max = max(max(e2, e3), e4);
        for (E max2 : eArr) {
            max = max(max, max2);
        }
        return max;
    }

    @CanIgnoreReturnValue
    public <E extends T> E min(@NullableDecl E e2, @NullableDecl E e3, @NullableDecl E e4, E... eArr) {
        E min = min(min(e2, e3), e4);
        for (E min2 : eArr) {
            min = min(min, min2);
        }
        return min;
    }
}
