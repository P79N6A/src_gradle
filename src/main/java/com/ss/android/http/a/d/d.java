package com.ss.android.http.a.d;

public final class d {
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

    public static boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        if (obj2 == null) {
            return true;
        }
        return false;
    }
}
