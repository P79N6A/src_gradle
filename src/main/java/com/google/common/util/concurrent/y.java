package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class y extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected y() {
    }

    public y(@NullableDecl Throwable th) {
        super(th);
    }

    public y(@NullableDecl String str, @NullableDecl Throwable th) {
        super(str, th);
    }
}
