package com.benchmark.a;

import com.benchmark.Benchmark;
import com.benchmark.j;
import com.benchmark.n;
import com.ss.android.vesdk.VEBenchmark;
import com.ss.android.vesdk.y;

public final class f implements j {

    /* renamed from: a  reason: collision with root package name */
    private Benchmark f7455a;

    public final void c() {
    }

    public final int b() {
        return n.a().b();
    }

    public final int a() {
        int i;
        VEBenchmark a2 = VEBenchmark.a();
        int i2 = this.f7455a.innerTimes;
        if (!a2.f77842a) {
            i = -105;
        } else {
            if (i2 < 0) {
                i2 = 1;
            }
            y.b("VEBenchmark", "runFaceDetection: times = " + i2);
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = a2.faceDetection(a2.f77843b);
                if (i3 != 0) {
                    break;
                }
            }
            i = i3;
        }
        if (i >= 0) {
            return 0;
        }
        return i;
    }

    public f(Benchmark benchmark) {
        this.f7455a = benchmark;
    }
}
