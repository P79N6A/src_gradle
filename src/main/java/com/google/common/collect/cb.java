package com.google.common.collect;

import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

@GwtCompatible
public final class cb {
    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        if (comparator == null) {
            return bn.natural();
        }
        return comparator;
    }

    public static boolean a(Comparator<?> comparator, Iterable<?> iterable) {
        Object obj;
        m.a(comparator);
        m.a(iterable);
        if (iterable instanceof SortedSet) {
            obj = a((SortedSet) iterable);
        } else if (!(iterable instanceof ca)) {
            return false;
        } else {
            obj = ((ca) iterable).comparator();
        }
        return comparator.equals(obj);
    }
}
