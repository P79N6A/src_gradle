package com.google.common.f;

import com.google.common.annotations.GwtCompatible;

@GwtCompatible
public final class a {
    public static int a(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }
}
