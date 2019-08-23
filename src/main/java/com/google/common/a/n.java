package com.google.common.a;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public interface n<T> {
    @CanIgnoreReturnValue
    boolean apply(@NullableDecl T t);

    boolean equals(@NullableDecl Object obj);
}
