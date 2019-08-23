package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;

@GwtIncompatible
public final class r<V> extends FutureTask<V> implements q<V> {

    /* renamed from: a  reason: collision with root package name */
    private final g f24892a = new g();

    /* access modifiers changed from: protected */
    public final void done() {
        this.f24892a.a();
    }

    public r(Callable<V> callable) {
        super(callable);
    }

    public final void a(Runnable runnable, Executor executor) {
        this.f24892a.a(runnable, executor);
    }
}
