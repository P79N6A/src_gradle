package com.google.common.collect;

import com.google.common.a.n;
import com.google.common.a.o;
import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.m;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.SortedSet;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class by {

    static class a<E> extends m.a<E> implements Set<E> {
        public int hashCode() {
            return by.a(this);
        }

        public boolean equals(@NullableDecl Object obj) {
            return by.a((Set<?>) this, obj);
        }

        a(Set<E> set, n<? super E> nVar) {
            super(set, nVar);
        }
    }

    static class b<E> extends a<E> implements SortedSet<E> {
        public final Comparator<? super E> comparator() {
            return ((SortedSet) this.f24772a).comparator();
        }

        public final E first() {
            return aw.b(this.f24772a.iterator(), this.f24773b);
        }

        public final E last() {
            SortedSet sortedSet = (SortedSet) this.f24772a;
            while (true) {
                E last = sortedSet.last();
                if (this.f24773b.apply(last)) {
                    return last;
                }
                sortedSet = sortedSet.headSet(last);
            }
        }

        public final SortedSet<E> headSet(E e2) {
            return new b(((SortedSet) this.f24772a).headSet(e2), this.f24773b);
        }

        public final SortedSet<E> tailSet(E e2) {
            return new b(((SortedSet) this.f24772a).tailSet(e2), this.f24773b);
        }

        b(SortedSet<E> sortedSet, n<? super E> nVar) {
            super(sortedSet, nVar);
        }

        public final SortedSet<E> subSet(E e2, E e3) {
            return new b(((SortedSet) this.f24772a).subSet(e2, e3), this.f24773b);
        }
    }

    static abstract class c<E> extends AbstractSet<E> {
        c() {
        }

        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) com.google.common.a.m.a(collection));
        }

        public boolean removeAll(Collection<?> collection) {
            com.google.common.a.m.a(collection);
            if (collection instanceof bg) {
                collection = ((bg) collection).elementSet();
            }
            if (!(collection instanceof Set) || collection.size() <= size()) {
                return by.a((Set<?>) this, collection.iterator());
            }
            Iterator it2 = iterator();
            com.google.common.a.m.a(collection);
            boolean z = false;
            while (it2.hasNext()) {
                if (collection.contains(it2.next())) {
                    it2.remove();
                    z = true;
                }
            }
            return z;
        }
    }

    public static <E> HashSet<E> a() {
        return new HashSet<>();
    }

    public static <E> LinkedHashSet<E> b() {
        return new LinkedHashSet<>();
    }

    static int a(Set<?> set) {
        int i;
        int i2 = 0;
        for (Object next : set) {
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = ((i2 + i) ^ -1) ^ -1;
        }
        return i2;
    }

    public static <E> Set<E> a(Set<E> set, n<? super E> nVar) {
        if (set instanceof SortedSet) {
            return a((SortedSet) set, nVar);
        }
        if (!(set instanceof a)) {
            return new a((Set) com.google.common.a.m.a(set), (n) com.google.common.a.m.a(nVar));
        }
        a aVar = (a) set;
        return new a((Set) aVar.f24772a, o.a(aVar.f24773b, nVar));
    }

    private static <E> SortedSet<E> a(SortedSet<E> sortedSet, n<? super E> nVar) {
        if (!(sortedSet instanceof a)) {
            return new b((SortedSet) com.google.common.a.m.a(sortedSet), (n) com.google.common.a.m.a(nVar));
        }
        a aVar = (a) sortedSet;
        return new b((SortedSet) aVar.f24772a, o.a(aVar.f24773b, nVar));
    }

    static boolean a(Set<?> set, @NullableDecl Object obj) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            if (set.size() != set2.size() || !set.containsAll(set2)) {
                return false;
            }
            return true;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static boolean a(Set<?> set, Iterator<?> it2) {
        boolean z = false;
        while (it2.hasNext()) {
            z |= set.remove(it2.next());
        }
        return z;
    }
}
