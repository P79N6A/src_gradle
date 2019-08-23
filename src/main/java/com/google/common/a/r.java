package com.google.common.a;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public final class r {
    public static String a(String str, int i) {
        m.a(str);
        boolean z = true;
        if (i <= 1) {
            if (i < 0) {
                z = false;
            }
            m.a(z, "invalid count: %s", i);
            if (i == 0) {
                str = "";
            }
            return str;
        }
        int length = str.length();
        long j = ((long) length) * ((long) i);
        int i2 = (int) j;
        if (((long) i2) == j) {
            char[] cArr = new char[i2];
            str.getChars(0, length, cArr, 0);
            while (true) {
                int i3 = i2 - length;
                if (length < i3) {
                    System.arraycopy(cArr, 0, cArr, length, length);
                    length <<= 1;
                } else {
                    System.arraycopy(cArr, 0, cArr, length, i3);
                    return new String(cArr);
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("Required array size too large: " + j);
        }
    }
}
