package com.facebook.imagepipeline.memory;

import com.facebook.common.internal.Preconditions;

public final class v {
    static int a(int i, int i2, int i3) {
        return Math.min(Math.max(0, i3 - i), i2);
    }

    static void a(int i, int i2, int i3, int i4, int i5) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = false;
        if (i4 >= 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z);
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2);
        if (i3 >= 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3);
        if (i + i4 <= i5) {
            z4 = true;
        } else {
            z4 = false;
        }
        Preconditions.checkArgument(z4);
        if (i3 + i4 <= i2) {
            z5 = true;
        }
        Preconditions.checkArgument(z5);
    }
}
