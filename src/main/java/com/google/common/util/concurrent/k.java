package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface k<V> {
    void onFailure(Throwable th);

    void onSuccess(@NullableDecl V v);
}
