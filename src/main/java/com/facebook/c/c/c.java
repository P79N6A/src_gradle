package com.facebook.c.c;

import com.facebook.c.b.d;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public final class c {
    public static boolean a(List<d> list) {
        if (list == null || list.size() == 0) {
            return true;
        }
        HashSet hashSet = new HashSet(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Integer valueOf = Integer.valueOf(list.get(i).f23341a);
            if (hashSet.contains(valueOf)) {
                return false;
            }
            hashSet.add(valueOf);
        }
        return true;
    }

    public static boolean a(float[][][] fArr, int i) {
        if (i <= 1 && (fArr == null || fArr.length == 0)) {
            return true;
        }
        if (i - 1 != fArr.length) {
            return false;
        }
        for (int i2 = 0; i2 < fArr.length; i2++) {
            if (fArr[i2].length != 2) {
                return false;
            }
            for (float[] length : fArr[i2]) {
                if (length.length != 2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static <T> T a(T t, boolean z, String str) {
        if (z) {
            return t;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "Illegal argument for %s.", new Object[]{str}));
    }
}
