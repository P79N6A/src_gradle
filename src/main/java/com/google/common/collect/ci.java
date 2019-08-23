package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

@GwtCompatible
public final class ci extends bn<Object> implements Serializable {

    /* renamed from: a  reason: collision with root package name */
    static final ci f24723a = new ci();
    private static final long serialVersionUID = 0;

    public final String toString() {
        return "Ordering.usingToString()";
    }

    private ci() {
    }

    private Object readResolve() {
        return f24723a;
    }

    public final int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }
}
