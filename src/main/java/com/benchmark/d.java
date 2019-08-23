package com.benchmark;

import com.benchmark.b;

public final /* synthetic */ class d implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private final b.a f7495a;

    /* renamed from: b  reason: collision with root package name */
    private final Benchmark f7496b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7497c;

    d(b.a aVar, Benchmark benchmark, String str) {
        this.f7495a = aVar;
        this.f7496b = benchmark;
        this.f7497c = str;
    }

    public final void run() {
        b.a aVar = this.f7495a;
        Benchmark benchmark = this.f7496b;
        String str = this.f7497c;
        aVar.f7465a = null;
        if (b.this.f7460b != null) {
            b.this.f7460b.a(benchmark.id, benchmark.when, str);
        }
    }
}
