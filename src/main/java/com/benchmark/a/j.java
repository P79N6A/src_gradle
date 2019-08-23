package com.benchmark.a;

public final class j implements com.benchmark.j {
    public final int b() {
        return 0;
    }

    public final void c() {
    }

    public final int a() {
        try {
            Thread.sleep(10);
            return 0;
        } catch (InterruptedException unused) {
            return 1;
        }
    }
}
