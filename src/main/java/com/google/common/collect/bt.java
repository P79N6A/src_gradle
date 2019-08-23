package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bt<E> extends at<E> {

    /* renamed from: b  reason: collision with root package name */
    static final bt<Comparable> f24711b = new bt<>(ai.of(), bn.natural());
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final transient ai<E> f24712c;

    public final ai<E> asList() {
        return this.f24712c;
    }

    /* access modifiers changed from: package-private */
    public final boolean isPartialView() {
        return this.f24712c.isPartialView();
    }

    public final cg<E> iterator() {
        return this.f24712c.iterator();
    }

    public final int size() {
        return this.f24712c.size();
    }

    @GwtIncompatible
    public final cg<E> descendingIterator() {
        return this.f24712c.reverse().iterator();
    }

    public final E first() {
        if (!isEmpty()) {
            return this.f24712c.get(0);
        }
        throw new NoSuchElementException();
    }

    public final E last() {
        if (!isEmpty()) {
            return this.f24712c.get(size() - 1);
        }
        throw new NoSuchElementException();
    }

    /* access modifiers changed from: package-private */
    public final at<E> a() {
        Comparator reverseOrder = Collections.reverseOrder(this.comparator);
        if (isEmpty()) {
            return a(reverseOrder);
        }
        return new bt(this.f24712c.reverse(), reverseOrder);
    }

    public final E ceiling(E e2) {
        int d2 = d(e2, true);
        if (d2 == size()) {
            return null;
        }
        return this.f24712c.get(d2);
    }

    public final boolean contains(@NullableDecl Object obj) {
        if (obj != null) {
            try {
                if (Collections.binarySearch(this.f24712c, obj, this.comparator) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final E floor(E e2) {
        int c2 = c(e2, true) - 1;
        if (c2 == -1) {
            return null;
        }
        return this.f24712c.get(c2);
    }

    public final E higher(E e2) {
        int d2 = d(e2, false);
        if (d2 == size()) {
            return null;
        }
        return this.f24712c.get(d2);
    }

    public final E lower(E e2) {
        int c2 = c(e2, false) - 1;
        if (c2 == -1) {
            return null;
        }
        return this.f24712c.get(c2);
    }

    public final boolean containsAll(Collection<?> collection) {
        if (collection instanceof bg) {
            collection = ((bg) collection).elementSet();
        }
        if (!cb.a(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        cg it2 = iterator();
        Iterator<?> it3 = collection.iterator();
        if (!it2.hasNext()) {
            return false;
        }
        Object next = it3.next();
        Object next2 = it2.next();
        while (true) {
            try {
                int a2 = a(next2, (Object) next);
                if (a2 < 0) {
                    if (!it2.hasNext()) {
                        return false;
                    }
                    next2 = it2.next();
                } else if (a2 == 0) {
                    if (!it3.hasNext()) {
                        return true;
                    }
                    next = it3.next();
                } else if (a2 > 0) {
                    return false;
                }
            } catch (ClassCastException | NullPointerException unused) {
                return false;
            }
        }
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!cb.a(this.comparator, set)) {
            return containsAll(set);
        }
        Iterator it2 = set.iterator();
        try {
            cg it3 = iterator();
            while (it3.hasNext()) {
                Object next = it3.next();
                Object next2 = it2.next();
                if (next2 != null) {
                    if (a(next, next2) != 0) {
                    }
                }
                return false;
            }
            return true;
        } catch (ClassCastException unused) {
            return false;
        } catch (NoSuchElementException unused2) {
            return false;
        }
    }

    bt(ai<E> aiVar, Comparator<? super E> comparator) {
        super(comparator);
        this.f24712c = aiVar;
    }

    /* access modifiers changed from: package-private */
    public final int a(Object[] objArr, int i) {
        return this.f24712c.a(objArr, i);
    }

    /* access modifiers changed from: package-private */
    public final at<E> a(E e2, boolean z) {
        return a(0, c(e2, z));
    }

    /* access modifiers changed from: package-private */
    public final at<E> b(E e2, boolean z) {
        return a(d(e2, z), size());
    }

    private bt<E> a(int i, int i2) {
        if (i == 0 && i2 == size()) {
            return this;
        }
        if (i < i2) {
            return new bt<>(this.f24712c.subList(i, i2), this.comparator);
        }
        return a(this.comparator);
    }

    private int c(E e2, boolean z) {
        int binarySearch = Collections.binarySearch(this.f24712c, m.a(e2), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            binarySearch++;
        }
        return binarySearch;
    }

    private int d(E e2, boolean z) {
        int binarySearch = Collections.binarySearch(this.f24712c, m.a(e2), comparator());
        if (binarySearch < 0) {
            return binarySearch ^ -1;
        }
        if (z) {
            return binarySearch;
        }
        return binarySearch + 1;
    }

    /* access modifiers changed from: package-private */
    public final at<E> a(E e2, boolean z, E e3, boolean z2) {
        return b(e2, z).a(e3, z2);
    }
}
