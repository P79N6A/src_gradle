package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class ax<T> extends bn<Iterable<T>> implements Serializable {
    private static final long serialVersionUID = 0;
    final Comparator<? super T> elementOrder;

    public final int hashCode() {
        return this.elementOrder.hashCode() ^ 2075626741;
    }

    public final String toString() {
        return this.elementOrder + ".lexicographical()";
    }

    ax(Comparator<? super T> comparator) {
        this.elementOrder = comparator;
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ax) {
            return this.elementOrder.equals(((ax) obj).elementOrder);
        }
        return false;
    }

    public final int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it2 = iterable2.iterator();
        for (T compare : iterable) {
            if (!it2.hasNext()) {
                return 1;
            }
            int compare2 = this.elementOrder.compare(compare, it2.next());
            if (compare2 != 0) {
                return compare2;
            }
        }
        if (it2.hasNext()) {
            return -1;
        }
        return 0;
    }
}
