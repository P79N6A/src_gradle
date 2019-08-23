package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface f<F, T> {
    @NullableDecl
    @CanIgnoreReturnValue
    T apply(@NullableDecl F f2);

    boolean equals(@NullableDecl Object obj);
}
