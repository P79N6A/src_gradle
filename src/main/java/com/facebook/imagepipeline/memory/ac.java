package com.facebook.imagepipeline.memory;

import android.support.annotation.Nullable;

public interface ac<T> {
    @Nullable
    T get(int i);

    int getSize(T t);

    @Nullable
    T pop();

    void put(T t);
}
