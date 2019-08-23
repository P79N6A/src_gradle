package com.facebook.imagepipeline.memory;

import com.facebook.infer.annotation.ThreadSafe;

public class c {
    public static final int MAX_BITMAP_TOTAL_SIZE;

    /* renamed from: a  reason: collision with root package name */
    private static final Class<?> f23964a = c.class;

    /* renamed from: b  reason: collision with root package name */
    private static int f23965b = 384;

    /* renamed from: c  reason: collision with root package name */
    private static volatile b f23966c;

    @ThreadSafe
    public static b get() {
        if (f23966c == null) {
            synchronized (c.class) {
                if (f23966c == null) {
                    f23966c = new b(f23965b, MAX_BITMAP_TOTAL_SIZE);
                }
            }
        }
        return f23966c;
    }

    static {
        int i;
        int min = (int) Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
        if (((long) min) > 16777216) {
            i = (min / 4) * 3;
        } else {
            i = min / 2;
        }
        MAX_BITMAP_TOTAL_SIZE = i;
    }
}
