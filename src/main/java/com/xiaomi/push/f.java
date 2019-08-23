package com.xiaomi.push;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    static final int f82001a = a(1, 3);

    /* renamed from: b  reason: collision with root package name */
    static final int f82002b = a(1, 4);

    /* renamed from: c  reason: collision with root package name */
    static final int f82003c = a(2, 0);

    /* renamed from: d  reason: collision with root package name */
    static final int f82004d = a(3, 2);

    static int a(int i) {
        return i & 7;
    }

    static int a(int i, int i2) {
        return (i << 3) | i2;
    }

    public static int b(int i) {
        return i >>> 3;
    }
}
