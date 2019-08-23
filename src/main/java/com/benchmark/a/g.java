package com.benchmark.a;

import com.benchmark.Benchmark;
import com.benchmark.j;
import com.benchmark.n;
import com.ss.android.vesdk.VEBenchmark;
import com.ss.android.vesdk.y;

public final class g implements j {

    /* renamed from: a  reason: collision with root package name */
    private Benchmark f7456a;

    public final void c() {
    }

    public final int b() {
        return n.a().b();
    }

    public final int a() {
        VEBenchmark a2 = VEBenchmark.a();
        int i = this.f7456a.innerTimes;
        if (i < 0) {
            i = 1;
        }
        y.b("VEBenchmark", "runGaussianBlurCPU: times = " + i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = a2.gaussianBlurCPU(a2.f77843b);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }

    public g(Benchmark benchmark) {
        this.f7456a = benchmark;
    }
}
