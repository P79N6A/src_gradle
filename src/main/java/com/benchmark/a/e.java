package com.benchmark.a;

import com.benchmark.Benchmark;
import com.benchmark.j;
import com.benchmark.n;
import com.ss.android.vesdk.VEBenchmark;
import com.ss.android.vesdk.y;

public final class e implements j {

    /* renamed from: a  reason: collision with root package name */
    private Benchmark f7454a;

    public final void c() {
    }

    public final int b() {
        return n.a().b();
    }

    public final int a() {
        VEBenchmark a2 = VEBenchmark.a();
        int i = this.f7454a.innerTimes;
        if (i < 0) {
            i = 1;
        }
        y.b("VEBenchmark", "runFaceBeauty: times = " + i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = a2.faceBeauty(a2.f77843b);
            if (i2 != 0) {
                break;
            }
        }
        return i2;
    }

    public e(Benchmark benchmark) {
        this.f7454a = benchmark;
    }
}
