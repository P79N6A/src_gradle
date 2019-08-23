package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class f extends Error {
    private static final long serialVersionUID = 0;

    protected f() {
    }

    public f(@NullableDecl Error error) {
        super(error);
    }

    public f(@NullableDecl String str, @NullableDecl Error error) {
        super(str, error);
    }
}
