package me.drakeet.multitype;

import android.support.annotation.IntRange;
import android.support.annotation.NonNull;

public interface d<T> {
    @IntRange(from = 0)
    int a(@NonNull T t);
}
