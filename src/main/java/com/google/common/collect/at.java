package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ar;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

@GwtCompatible
public abstract class at<E> extends au<E> implements ca<E>, NavigableSet<E> {
    @GwtIncompatible
    @LazyInit

    /* renamed from: a  reason: collision with root package name */
    transient at<E> f24595a;
    public final transient Comparator<? super E> comparator;

    public static final class a<E> extends ar.a<E> {

        /* renamed from: e  reason: collision with root package name */
        private final Comparator<? super E> f24596e;

        /* renamed from: b */
        public final at<E> a() {
            at<E> a2 = at.a(this.f24596e, this.f24538b, this.f24537a);
            this.f24538b = a2.size();
            this.f24539c = true;
            return a2;
        }

        /* access modifiers changed from: private */
        @CanIgnoreReturnValue
        /* renamed from: c */
        public a<E> b(Iterable<? extends E> iterable) {
            super.a(iterable);
            return this;
        }

        /* access modifiers changed from: private */
        @CanIgnoreReturnValue
        /* renamed from: d */
        public a<E> c(E e2) {
            super.b(e2);
            return this;
        }

        public a(Comparator<? super E> comparator) {
            this.f24596e = (Comparator) m.a(comparator);
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final a<E> b(Iterator<? extends E> it2) {
            super.a(it2);
            return this;
        }

        @CanIgnoreReturnValue
        /* renamed from: c */
        public final a<E> b(E... eArr) {
            super.a(eArr);
            return this;
        }
    }

    static class b<E> implements Serializable {
        private static final long serialVersionUID = 0;
        final Comparator<? super E> comparator;
        final Object[] elements;

        /* access modifiers changed from: package-private */
        public final Object readResolve() {
            return new a(this.comparator).b((E[]) this.elements).a();
        }

        public b(Comparator<? super E> comparator2, Object[] objArr) {
            this.comparator = comparator2;
            this.elements = objArr;
        }
    }

    /* access modifiers changed from: package-private */
    @GwtIncompatible
    public abstract at<E> a();

    /* access modifiers changed from: package-private */
    public abstract at<E> a(E e2, boolean z);

    /* access modifiers changed from: package-private */
    public abstract at<E> a(E e2, boolean z, E e3, boolean z2);

    /* access modifiers changed from: package-private */
    public abstract at<E> b(E e2, boolean z);

    @GwtIncompatible
    public abstract cg<E> descendingIterator();

    public abstract cg<E> iterator();

    public static <E> at<E> of() {
        return bt.f24711b;
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    public static <E extends Comparable<?>> a<E> naturalOrder() {
        return new a<>(bn.natural());
    }

    public static <E extends Comparable<?>> a<E> reverseOrder() {
        return new a<>(Collections.reverseOrder());
    }

    @GwtIncompatible
    public at<E> descendingSet() {
        at<E> atVar = this.f24595a;
        if (atVar != null) {
            return atVar;
        }
        at<E> a2 = a();
        this.f24595a = a2;
        a2.f24595a = this;
        return a2;
    }

    public E first() {
        return iterator().next();
    }

    public E last() {
        return descendingIterator().next();
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new b(this.comparator, toArray());
    }

    at(Comparator<? super E> comparator2) {
        this.comparator = comparator2;
    }

    public static <E> a<E> orderedBy(Comparator<E> comparator2) {
        return new a<>(comparator2);
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public at<E> headSet(E e2) {
        return headSet(e2, false);
    }

    public at<E> tailSet(E e2) {
        return tailSet(e2, true);
    }

    public static <E> at<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf((Comparator<? super E>) bn.natural(), iterable);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2) {
        return new bt(ai.of(e2), bn.natural());
    }

    @GwtIncompatible
    public E ceiling(E e2) {
        return av.a((Iterable<? extends T>) tailSet(e2, true), null);
    }

    @GwtIncompatible
    public E floor(E e2) {
        return aw.a((Iterator<? extends T>) headSet(e2, true).descendingIterator(), null);
    }

    @GwtIncompatible
    public E higher(E e2) {
        return av.a((Iterable<? extends T>) tailSet(e2, false), null);
    }

    @GwtIncompatible
    public E lower(E e2) {
        return aw.a((Iterator<? extends T>) headSet(e2, false).descendingIterator(), null);
    }

    static <E> bt<E> a(Comparator<? super E> comparator2) {
        if (bn.natural().equals(comparator2)) {
            return bt.f24711b;
        }
        return new bt<>(ai.of(), comparator2);
    }

    public static <E> at<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator<? super E>) bn.natural(), collection);
    }

    public static <E> at<E> copyOfSorted(SortedSet<E> sortedSet) {
        Comparator a2 = cb.a(sortedSet);
        ai<E> copyOf = ai.copyOf((Collection<? extends E>) sortedSet);
        if (copyOf.isEmpty()) {
            return a(a2);
        }
        return new bt(copyOf, a2);
    }

    public static <E> at<E> copyOf(Iterator<? extends E> it2) {
        return copyOf((Comparator<? super E>) bn.natural(), it2);
    }

    public static <E extends Comparable<? super E>> at<E> copyOf(E[] eArr) {
        return a(bn.natural(), eArr.length, (Object[]) eArr.clone());
    }

    public static <E> at<E> copyOf(Comparator<? super E> comparator2, Collection<? extends E> collection) {
        return copyOf(comparator2, (Iterable<? extends E>) collection);
    }

    /* access modifiers changed from: package-private */
    public final int a(Object obj, Object obj2) {
        return this.comparator.compare(obj, obj2);
    }

    public at<E> subSet(E e2, E e3) {
        return subSet(e2, true, e3, false);
    }

    @GwtIncompatible
    public at<E> headSet(E e2, boolean z) {
        return a((E) m.a(e2), z);
    }

    @GwtIncompatible
    public at<E> tailSet(E e2, boolean z) {
        return b(m.a(e2), z);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2, E e3) {
        return a(bn.natural(), 2, e2, e3);
    }

    public static <E> at<E> copyOf(Comparator<? super E> comparator2, Iterable<? extends E> iterable) {
        m.a(comparator2);
        if (cb.a(comparator2, iterable) && (iterable instanceof at)) {
            at<E> atVar = (at) iterable;
            if (!atVar.isPartialView()) {
                return atVar;
            }
        }
        Object[] a2 = av.a(iterable);
        return a(comparator2, a2.length, a2);
    }

    public static <E> at<E> copyOf(Comparator<? super E> comparator2, Iterator<? extends E> it2) {
        return new a(comparator2).b(it2).a();
    }

    static <E> at<E> a(Comparator<? super E> comparator2, int i, E... eArr) {
        if (i == 0) {
            return a(comparator2);
        }
        bl.b(eArr, i);
        Arrays.sort(eArr, 0, i, comparator2);
        int i2 = 1;
        for (int i3 = 1; i3 < i; i3++) {
            E e2 = eArr[i3];
            if (comparator2.compare(e2, eArr[i2 - 1]) != 0) {
                eArr[i2] = e2;
                i2++;
            }
        }
        Arrays.fill(eArr, i2, i, null);
        if (i2 < eArr.length / 2) {
            eArr = Arrays.copyOf(eArr, i2);
        }
        return new bt(ai.b(eArr, i2), comparator2);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2, E e3, E e4) {
        return a(bn.natural(), 3, e2, e3, e4);
    }

    @GwtIncompatible
    public at<E> subSet(E e2, boolean z, E e3, boolean z2) {
        boolean z3;
        m.a(e2);
        m.a(e3);
        if (this.comparator.compare(e2, e3) <= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        m.a(z3);
        return a(e2, z, e3, z2);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2, E e3, E e4, E e5) {
        return a(bn.natural(), 4, e2, e3, e4, e5);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2, E e3, E e4, E e5, E e6) {
        return a(bn.natural(), 5, e2, e3, e4, e5, e6);
    }

    public static <E extends Comparable<? super E>> at<E> of(E e2, E e3, E e4, E e5, E e6, E e7, E... eArr) {
        Comparable[] comparableArr = new Comparable[(eArr.length + 6)];
        comparableArr[0] = e2;
        comparableArr[1] = e3;
        comparableArr[2] = e4;
        comparableArr[3] = e5;
        comparableArr[4] = e6;
        comparableArr[5] = e7;
        System.arraycopy(eArr, 0, comparableArr, 6, eArr.length);
        return a(bn.natural(), comparableArr.length, comparableArr);
    }
}
