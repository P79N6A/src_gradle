package com.facebook.imagepipeline.cache;

import com.facebook.common.internal.Supplier;

public final class i implements Supplier<MemoryCacheParams> {
    public final MemoryCacheParams get() {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (min < 16777216) {
            i = 1048576;
        } else if (min < 33554432) {
            i = 2097152;
        } else {
            i = 4194304;
        }
        MemoryCacheParams memoryCacheParams = new MemoryCacheParams(i, Integer.MAX_VALUE, i, Integer.MAX_VALUE, i / 8);
        return memoryCacheParams;
    }
}
