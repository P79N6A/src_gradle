package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

@GwtCompatible
public interface q<V> extends Future<V> {
    void a(Runnable runnable, Executor executor);
}
