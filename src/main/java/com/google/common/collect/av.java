package com.google.common.collect;

import com.google.common.a.k;
import com.google.common.a.m;
import com.google.common.a.n;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class av {
    private static <E> Collection<E> b(Iterable<E> iterable) {
        if (iterable instanceof Collection) {
            return (Collection) iterable;
        }
        return az.a(iterable.iterator());
    }

    static Object[] a(Iterable<?> iterable) {
        return b(iterable).toArray();
    }

    @NullableDecl
    public static <T> T a(Iterable<? extends T> iterable, @NullableDecl T t) {
        return aw.a(iterable.iterator(), null);
    }

    public static <T> T b(Iterable<T> iterable, n<? super T> nVar) {
        return aw.b(iterable.iterator(), nVar);
    }

    public static <T> int d(Iterable<T> iterable, n<? super T> nVar) {
        return aw.c(iterable.iterator(), nVar);
    }

    @CanIgnoreReturnValue
    public static <T> boolean a(Iterable<T> iterable, n<? super T> nVar) {
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            return aw.a(iterable.iterator(), nVar);
        }
        return a((List) iterable, (n) m.a(nVar));
    }

    public static <T> k<T> c(Iterable<T> iterable, n<? super T> nVar) {
        Iterator<T> it2 = iterable.iterator();
        m.a(it2);
        m.a(nVar);
        while (it2.hasNext()) {
            T next = it2.next();
            if (nVar.apply(next)) {
                return k.of(next);
            }
        }
        return k.absent();
    }

    private static <T> boolean a(List<T> list, n<? super T> nVar) {
        int i = 0;
        int i2 = 0;
        while (i < list.size()) {
            T t = list.get(i);
            if (!nVar.apply(t)) {
                if (i > i2) {
                    try {
                        list.set(i2, t);
                    } catch (UnsupportedOperationException unused) {
                        a(list, nVar, i2, i);
                        return true;
                    } catch (IllegalArgumentException unused2) {
                        a(list, nVar, i2, i);
                        return true;
                    }
                }
                i2++;
            }
            i++;
        }
        list.subList(i2, list.size()).clear();
        if (i != i2) {
            return true;
        }
        return false;
    }

    static <T> T[] a(Iterable<? extends T> iterable, T[] tArr) {
        return b(iterable).toArray(tArr);
    }

    private static <T> void a(List<T> list, n<? super T> nVar, int i, int i2) {
        for (int size = list.size() - 1; size > i2; size--) {
            if (nVar.apply(list.get(size))) {
                list.remove(size);
            }
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            list.remove(i3);
        }
    }
}
