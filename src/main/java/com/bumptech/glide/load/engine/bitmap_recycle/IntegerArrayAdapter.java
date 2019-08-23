package com.bumptech.glide.load.engine.bitmap_recycle;

public final class IntegerArrayAdapter implements ArrayAdapterInterface<int[]> {
    public final int getElementSizeInBytes() {
        return 4;
    }

    public final String getTag() {
        return "IntegerArrayPool";
    }

    public final int getArrayLength(int[] iArr) {
        return iArr.length;
    }

    public final int[] newArray(int i) {
        return new int[i];
    }
}
