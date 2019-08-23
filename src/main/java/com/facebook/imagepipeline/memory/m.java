package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public final class m {
    public static final int DEFAULT_MAX_NUM_THREADS = Runtime.getRuntime().availableProcessors();

    public static af get() {
        af afVar = new af(4194304, DEFAULT_MAX_NUM_THREADS * 4194304, generateBuckets(131072, 4194304, DEFAULT_MAX_NUM_THREADS), 131072, 4194304, DEFAULT_MAX_NUM_THREADS);
        return afVar;
    }

    public static SparseIntArray generateBuckets(int i, int i2, int i3) {
        SparseIntArray sparseIntArray = new SparseIntArray();
        while (i <= i2) {
            sparseIntArray.put(i, i3);
            i *= 2;
        }
        return sparseIntArray;
    }
}
