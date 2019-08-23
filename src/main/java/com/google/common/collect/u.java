package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.bn;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class u<T> extends bn<T> implements Serializable {
    private static final long serialVersionUID = 0;
    final ak<T, Integer> rankMap;

    public final int hashCode() {
        return this.rankMap.hashCode();
    }

    public final String toString() {
        return "Ordering.explicit(" + this.rankMap.keySet() + ")";
    }

    private u(ak<T, Integer> akVar) {
        this.rankMap = akVar;
    }

    u(List<T> list) {
        this(bc.a((Collection<E>) list));
    }

    private int a(T t) {
        Integer num = (Integer) this.rankMap.get(t);
        if (num != null) {
            return num.intValue();
        }
        throw new bn.c(t);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (obj instanceof u) {
            return this.rankMap.equals(((u) obj).rankMap);
        }
        return false;
    }

    public final int compare(T t, T t2) {
        return a(t) - a(t2);
    }
}
