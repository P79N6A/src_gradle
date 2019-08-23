package com.bytedance.frameworks.core.b;

import java.util.concurrent.PriorityBlockingQueue;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    static final int f19983a;

    /* renamed from: b  reason: collision with root package name */
    static final int f19984b;

    /* renamed from: c  reason: collision with root package name */
    static final PriorityBlockingQueue<Runnable> f19985c = new PriorityBlockingQueue<>();

    /* renamed from: d  reason: collision with root package name */
    static final PriorityBlockingQueue<Runnable> f19986d = new PriorityBlockingQueue<>();

    /* renamed from: e  reason: collision with root package name */
    private static final int f19987e;

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f19987e = availableProcessors;
        int i2 = 4;
        if ((availableProcessors / 2) + 1 < 4) {
            i = 4;
        } else {
            i = (f19987e / 2) + 1;
        }
        f19983a = i;
        if ((f19987e / 2) + 1 >= 4) {
            i2 = (f19987e / 2) + 1;
        }
        f19984b = i2;
    }
}
