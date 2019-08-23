package com.facebook.imagepipeline.core;

import java.util.concurrent.Executor;

public final class a implements ExecutorSupplier {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f23911a = b.a(2, new PriorityThreadFactory(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b  reason: collision with root package name */
    private final Executor f23912b;

    /* renamed from: c  reason: collision with root package name */
    private final Executor f23913c;

    /* renamed from: d  reason: collision with root package name */
    private final Executor f23914d;

    public final Executor forBackgroundTasks() {
        return this.f23913c;
    }

    public final Executor forDecode() {
        return this.f23912b;
    }

    public final Executor forLightweightBackgroundTasks() {
        return this.f23914d;
    }

    public final Executor forLocalStorageRead() {
        return this.f23911a;
    }

    public final Executor forLocalStorageWrite() {
        return this.f23911a;
    }

    public a(int i) {
        this.f23912b = b.a(i, new PriorityThreadFactory(10, "FrescoDecodeExecutor", true));
        this.f23913c = b.a(i, new PriorityThreadFactory(10, "FrescoBackgroundExecutor", true));
        this.f23914d = b.a(1, new PriorityThreadFactory(10, "FrescoLightWeightBackgroundExecutor", true));
    }
}
