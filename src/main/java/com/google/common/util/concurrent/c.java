package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
@CanIgnoreReturnValue
@Beta
public abstract class c extends AbstractExecutorService implements t {
    /* renamed from: a */
    public final <T> q<T> submit(Callable<T> callable) {
        return (q) super.submit(callable);
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable) {
        return (q) super.submit(runnable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Callable<T> callable) {
        return x.a(callable);
    }

    /* access modifiers changed from: protected */
    public final <T> RunnableFuture<T> newTaskFor(Runnable runnable, T t) {
        return x.a(runnable, t);
    }

    public /* bridge */ /* synthetic */ Future submit(Runnable runnable, @NullableDecl Object obj) {
        return (q) super.submit(runnable, obj);
    }
}
