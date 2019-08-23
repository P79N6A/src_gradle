package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

@GwtIncompatible
public final class p<K, V> extends n<K, V> {
    private final boolean accessOrder;
    @MonotonicNonNullDecl
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    transient long[] f24805f;
    private transient int g;
    private transient int h;

    /* access modifiers changed from: package-private */
    public final int a() {
        return this.g;
    }

    p() {
        this(3);
    }

    public static <K, V> p<K, V> create() {
        return new p<>();
    }

    public final void clear() {
        super.clear();
        this.g = -2;
        this.h = -2;
    }

    public static <K, V> p<K, V> createWithExpectedSize(int i) {
        return new p<>(i);
    }

    /* access modifiers changed from: package-private */
    public final int d(int i) {
        return (int) this.f24805f[i];
    }

    private p(int i) {
        this(i, 1.0f, false);
    }

    private int e(int i) {
        return (int) (this.f24805f[i] >>> 32);
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        super.b(i);
        this.f24805f = Arrays.copyOf(this.f24805f, i);
    }

    /* access modifiers changed from: package-private */
    public final void a(int i) {
        if (this.accessOrder) {
            b(e(i), d(i));
            b(this.h, i);
            b(i, -2);
            this.f24780e++;
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(int i) {
        int size = size() - 1;
        b(e(i), d(i));
        if (i < size) {
            b(e(size), i);
            b(i, d(size));
        }
        super.c(i);
    }

    /* access modifiers changed from: package-private */
    public final int a(int i, int i2) {
        if (i >= size()) {
            return i2;
        }
        return i;
    }

    private void b(int i, int i2) {
        if (i == -2) {
            this.g = i2;
        } else {
            this.f24805f[i] = (this.f24805f[i] & -4294967296L) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.h = i;
        } else {
            this.f24805f[i2] = (4294967295L & this.f24805f[i2]) | (((long) i) << 32);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, float f2) {
        super.a(i, f2);
        this.g = -2;
        this.h = -2;
        this.f24805f = new long[i];
        Arrays.fill(this.f24805f, -1);
    }

    private p(int i, float f2, boolean z) {
        super(i, 1.0f);
        this.accessOrder = false;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, K k, V v, int i2) {
        super.a(i, k, v, i2);
        b(this.h, i);
        b(i, -2);
    }
}
