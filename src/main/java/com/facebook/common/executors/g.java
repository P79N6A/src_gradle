package com.facebook.common.executors;

import java.util.concurrent.atomic.AtomicInteger;

public abstract class g<T> implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    protected final AtomicInteger f23521a = new AtomicInteger(0);

    /* access modifiers changed from: protected */
    public void disposeResult(T t) {
    }

    /* access modifiers changed from: protected */
    public abstract T getResult() throws Exception;

    /* access modifiers changed from: protected */
    public void onCancellation() {
    }

    /* access modifiers changed from: protected */
    public void onFailure(Exception exc) {
    }

    /* access modifiers changed from: protected */
    public void onSuccess(T t) {
    }

    public void cancel() {
        if (this.f23521a.compareAndSet(0, 2)) {
            onCancellation();
        }
    }

    public final void run() {
        if (this.f23521a.compareAndSet(0, 1)) {
            try {
                Object result = getResult();
                this.f23521a.set(3);
                try {
                    onSuccess(result);
                } finally {
                    disposeResult(result);
                }
            } catch (Exception e2) {
                this.f23521a.set(4);
                onFailure(e2);
            }
        }
    }
}
