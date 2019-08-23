package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import javax.annotation.Nullable;

public final class af {
    public final SparseIntArray bucketSizes;
    public boolean fixBucketsReinitialization;
    public final int maxBucketSize;
    public final int maxNumThreads;
    public final int maxSizeHardCap;
    public final int maxSizeSoftCap;
    public final int minBucketSize;

    public af(int i, int i2, @Nullable SparseIntArray sparseIntArray) {
        this(i, i2, sparseIntArray, 0, Integer.MAX_VALUE, -1);
    }

    public af(int i, int i2, @Nullable SparseIntArray sparseIntArray, int i3, int i4, int i5) {
        boolean z;
        if (i < 0 || i2 < i) {
            z = false;
        } else {
            z = true;
        }
        Preconditions.checkState(z);
        this.maxSizeSoftCap = i;
        this.maxSizeHardCap = i2;
        this.bucketSizes = sparseIntArray;
        this.minBucketSize = i3;
        this.maxBucketSize = i4;
        this.maxNumThreads = i5;
    }
}
