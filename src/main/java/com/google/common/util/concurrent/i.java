package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ae;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@GwtCompatible
@CanIgnoreReturnValue
public abstract class i<V> extends ae implements Future<V> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Future<? extends V> delegate();

    protected i() {
    }

    public V get() throws InterruptedException, ExecutionException {
        return delegate().get();
    }

    public boolean isCancelled() {
        return delegate().isCancelled();
    }

    public boolean isDone() {
        return delegate().isDone();
    }

    public boolean cancel(boolean z) {
        return delegate().cancel(z);
    }

    public V get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return delegate().get(j, timeUnit);
    }
}
