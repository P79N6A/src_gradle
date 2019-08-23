package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;

@GwtCompatible
public final class bl {
    @CanIgnoreReturnValue
    static Object[] a(Object... objArr) {
        return b(objArr, objArr.length);
    }

    public static <T> T[] a(T[] tArr, int i) {
        return bo.a(tArr, i);
    }

    @CanIgnoreReturnValue
    static Object[] b(Object[] objArr, int i) {
        for (int i2 = 0; i2 < i; i2++) {
            a(objArr[i2], i2);
        }
        return objArr;
    }

    @CanIgnoreReturnValue
    static Object a(Object obj, int i) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i);
    }
}
