package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public final class n {
    public static af get() {
        int i;
        int i2;
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(1024, 5);
        sparseIntArray.put(2048, 5);
        sparseIntArray.put(4096, 5);
        sparseIntArray.put(8192, 5);
        sparseIntArray.put(16384, 5);
        sparseIntArray.put(32768, 5);
        sparseIntArray.put(65536, 5);
        sparseIntArray.put(131072, 5);
        sparseIntArray.put(262144, 2);
        sparseIntArray.put(524288, 2);
        sparseIntArray.put(1048576, 2);
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 3145728;
        } else if (min < 33554432) {
            i = 6291456;
        } else {
            i = 12582912;
        }
        int min2 = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min2 < 16777216) {
            i2 = min2 / 2;
        } else {
            i2 = (min2 / 4) * 3;
        }
        return new af(i, i2, sparseIntArray);
    }
}
