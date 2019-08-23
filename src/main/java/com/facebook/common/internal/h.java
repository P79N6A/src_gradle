package com.facebook.common.internal;

public final class h {
    public static int a(int... iArr) {
        Preconditions.checkArgument(true);
        int i = iArr[0];
        for (int i2 = 1; i2 < 8; i2++) {
            if (iArr[i2] > i) {
                i = iArr[i2];
            }
        }
        return i;
    }
}
