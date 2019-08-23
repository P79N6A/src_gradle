package com.benchmark;

import com.benchmark.b;

public final /* synthetic */ class c implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f7492a;

    /* renamed from: b  reason: collision with root package name */
    private final Benchmark f7493b;

    /* renamed from: c  reason: collision with root package name */
    private final long[] f7494c;

    c(b.a aVar, Benchmark benchmark, long[] jArr) {
        this.f7492a = aVar;
        this.f7493b = benchmark;
        this.f7494c = jArr;
    }

    public final void run() {
        b.a aVar = this.f7492a;
        Benchmark benchmark = this.f7493b;
        long[] jArr = this.f7494c;
        aVar.f7465a = null;
        if (b.this.f7460b != null) {
            b.this.f7460b.a(benchmark.id, benchmark.when, jArr);
        }
    }
}
