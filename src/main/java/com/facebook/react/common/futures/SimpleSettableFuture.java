package com.facebook.react.common.futures;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.Nullable;

public class SimpleSettableFuture<T> implements Future<T> {
    @Nullable
    private Exception mException;
    private final CountDownLatch mReadyLatch = new CountDownLatch(1);
    @Nullable
    private T mResult;

    public boolean isCancelled() {
        return false;
    }

    @Nullable
    public T getOrThrow() {
        try {
            return get();
        } catch (InterruptedException | ExecutionException e2) {
            throw new RuntimeException(e2);
        }
    }

    public boolean isDone() {
        if (this.mReadyLatch.getCount() == 0) {
            return true;
        }
        return false;
    }

    private void checkNotSet() {
        if (this.mReadyLatch.getCount() == 0) {
            throw new RuntimeException("Result has already been set!");
        }
    }

    @Nullable
    public T get() throws InterruptedException, ExecutionException {
        this.mReadyLatch.await();
        if (this.mException == null) {
            return this.mResult;
        }
        throw new ExecutionException(this.mException);
    }

    public boolean cancel(boolean z) {
        throw new UnsupportedOperationException();
    }

    public void set(@Nullable T t) {
        checkNotSet();
        this.mResult = t;
        this.mReadyLatch.countDown();
    }

    public void setException(Exception exc) {
        checkNotSet();
        this.mException = exc;
        this.mReadyLatch.countDown();
    }

    @Nullable
    public T getOrThrow(long j, TimeUnit timeUnit) {
        try {
            return get(j, timeUnit);
        } catch (InterruptedException | ExecutionException | TimeoutException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Nullable
    public T get(long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        if (!this.mReadyLatch.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for result");
        } else if (this.mException == null) {
            return this.mResult;
        } else {
            throw new ExecutionException(this.mException);
        }
    }
}
