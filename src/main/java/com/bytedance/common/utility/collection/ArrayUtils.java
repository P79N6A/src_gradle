package com.bytedance.common.utility.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class ArrayUtils {
    public static List<Long> toList(long[] jArr) {
        if (jArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (long valueOf : jArr) {
            arrayList.add(Long.valueOf(valueOf));
        }
        return arrayList;
    }

    public static long[] toLongArray(List<Long> list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = list.get(i).longValue();
        }
        return jArr;
    }

    public static <T> T[] combineArray(T[] tArr, T[] tArr2) {
        T[] copyOfRange = copyOfRange(tArr, 0, tArr.length + tArr2.length);
        System.arraycopy(tArr2, 0, copyOfRange, tArr.length, tArr2.length);
        return copyOfRange;
    }

    public static <T> T[] copyOfRange(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (i > i2) {
            throw new IllegalArgumentException();
        } else if (i < 0 || i > length) {
            throw new ArrayIndexOutOfBoundsException();
        } else {
            int i3 = i2 - i;
            int min = Math.min(i3, length - i);
            T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3);
            System.arraycopy(tArr, i, tArr2, 0, min);
            return tArr2;
        }
    }

    public static <T> T[] insert(T[] tArr, int i, T t) {
        T t2;
        T[] tArr2 = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), tArr.length + 1);
        for (int i2 = 0; i2 < tArr2.length; i2++) {
            if (i2 < i) {
                t2 = tArr[i2];
            } else if (i2 == i) {
                t2 = t;
            } else {
                t2 = tArr[i2 - 1];
            }
            tArr2[i2] = t2;
        }
        return tArr2;
    }
}
