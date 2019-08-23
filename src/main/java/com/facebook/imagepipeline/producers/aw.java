package com.facebook.imagepipeline.producers;

import com.facebook.common.internal.Preconditions;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

public final class aw {

    /* renamed from: a  reason: collision with root package name */
    private boolean f24105a;

    /* renamed from: b  reason: collision with root package name */
    private final Deque<Runnable> f24106b = new ArrayDeque();

    /* renamed from: c  reason: collision with root package name */
    private final Executor f24107c;

    public final synchronized boolean isQueueing() {
        return this.f24105a;
    }

    public final synchronized void startQueueing() {
        this.f24105a = true;
    }

    public final synchronized void stopQueuing() {
        this.f24105a = false;
        while (!this.f24106b.isEmpty()) {
            this.f24107c.execute(this.f24106b.pop());
        }
        this.f24106b.clear();
    }

    public final synchronized void remove(Runnable runnable) {
        this.f24106b.remove(runnable);
    }

    public aw(Executor executor) {
        this.f24107c = (Executor) Preconditions.checkNotNull(executor);
    }

    public final synchronized void addToQueueOrExecute(Runnable runnable) {
        if (this.f24105a) {
            this.f24106b.add(runnable);
        } else {
            this.f24107c.execute(runnable);
        }
    }
}
