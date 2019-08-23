package com.bytedance.frameworks.baselib.network.http.util;

public final class f {
    public static int a(int i, int i2) {
        return (i * 37) + i2;
    }

    public static int a(int i, Object obj) {
        int i2;
        if (obj != null) {
            i2 = obj.hashCode();
        } else {
            i2 = 0;
        }
        return a(i, i2);
    }
}
