package com.bytedance.apm.k;

public final class b {
    public static int a(Object[] objArr, Class<?> cls) {
        if (objArr == null || objArr.length == 0) {
            return -1;
        }
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            if (objArr[i] != null && objArr[i].getClass().equals(cls)) {
                return i;
            }
        }
        return -1;
    }
}
