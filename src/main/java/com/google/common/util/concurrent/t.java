package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

@GwtIncompatible
public interface t extends ExecutorService {
    <T> q<T> a(Callable<T> callable);
}
