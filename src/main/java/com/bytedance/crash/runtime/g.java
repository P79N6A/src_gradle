package com.bytedance.crash.runtime;

import java.util.concurrent.atomic.AtomicReference;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final AtomicReference<Long> f19551a = new AtomicReference<>(0L);

    public static void a(long j) {
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (((long) i) < 5) {
                long longValue = f19551a.get().longValue();
                if (!f19551a.compareAndSet(Long.valueOf(longValue), Long.valueOf(longValue | j))) {
                    i = i2;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }
}
