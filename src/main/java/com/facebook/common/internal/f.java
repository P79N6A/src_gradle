package com.facebook.common.internal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class f<E> extends ArrayList<E> {
    private f(int i) {
        super(i);
    }

    private f(List<E> list) {
        super(list);
    }

    public static <E> f<E> copyOf(List<E> list) {
        return new f<>(list);
    }

    public static <E> f<E> of(E... eArr) {
        f<E> fVar = new f<>(eArr.length);
        Collections.addAll(fVar, eArr);
        return fVar;
    }
}
