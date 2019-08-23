package com.benchmark.a;

import com.benchmark.Benchmark;
import com.benchmark.j;
import com.benchmark.n;
import com.ss.android.vesdk.VEBenchmark;
import com.ss.android.vesdk.y;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private Benchmark f7457a;

    public final void c() {
    }

    public final int b() {
        return n.a().b();
    }

    public final int a() {
        VEBenchmark a2 = VEBenchmark.a();
        int i = this.f7457a.innerTimes;
        if (i < 0) {
            i = 1;
        }
        y.b("VEBenchmark", "runHistogramEqualization: times = " + i);
        for (int i2 = 0; i2 < i; i2++) {
            a2.histogramEqualization(a2.f77843b);
        }
        return 0;
    }

    public h(Benchmark benchmark) {
        this.f7457a = benchmark;
    }
}
