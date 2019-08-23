package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class af {
    static int a(@NullableDecl Object obj) {
        int i;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        return a(i);
    }

    static int a(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int a(int i, double d2) {
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        double d3 = (double) highestOneBit;
        Double.isNaN(d3);
        if (max <= ((int) (d2 * d3))) {
            return highestOneBit;
        }
        int i2 = highestOneBit << 1;
        if (i2 > 0) {
            return i2;
        }
        return 1073741824;
    }
}
