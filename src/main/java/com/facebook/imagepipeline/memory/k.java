package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    private static final SparseIntArray f23979a = new SparseIntArray(0);

    public static af get() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        return new af(0, i, f23979a);
    }
}
