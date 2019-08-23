package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.util.concurrent.b;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class w<V> extends b.h<V> {
    @CanIgnoreReturnValue
    @Beta
    public final boolean a(q<? extends V> qVar) {
        return super.a(qVar);
    }

    @CanIgnoreReturnValue
    public final boolean b(@NullableDecl V v) {
        return super.b(v);
    }

    @CanIgnoreReturnValue
    public final boolean a(Throwable th) {
        return super.a(th);
    }
}
