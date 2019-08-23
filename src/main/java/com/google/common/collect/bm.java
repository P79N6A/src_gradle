package com.google.common.collect;

import com.google.common.a.j;
import com.google.common.a.m;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.collect.bg;
import com.google.common.collect.bh;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtCompatible
public final class bm<K> {

    /* renamed from: a  reason: collision with root package name */
    transient Object[] f24676a;

    /* renamed from: b  reason: collision with root package name */
    transient int[] f24677b;

    /* renamed from: c  reason: collision with root package name */
    public transient int f24678c;

    /* renamed from: d  reason: collision with root package name */
    transient int f24679d;

    /* renamed from: e  reason: collision with root package name */
    transient int[] f24680e;
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    transient long[] f24681f;
    private transient float g;
    private transient int h;

    class a extends bh.a<K> {
        @NullableDecl

        /* renamed from: a  reason: collision with root package name */
        final K f24682a;

        /* renamed from: b  reason: collision with root package name */
        int f24683b;

        public final K getElement() {
            return this.f24682a;
        }

        public final int getCount() {
            if (this.f24683b == -1 || this.f24683b >= bm.this.f24678c || !j.a(this.f24682a, bm.this.f24676a[this.f24683b])) {
                this.f24683b = bm.this.a((Object) this.f24682a);
            }
            if (this.f24683b == -1) {
                return 0;
            }
            return bm.this.f24677b[this.f24683b];
        }

        a(int i) {
            this.f24682a = bm.this.f24676a[i];
            this.f24683b = i;
        }
    }

    private static int a(long j) {
        return (int) (j >>> 32);
    }

    private static long a(long j, int i) {
        return (j & -4294967296L) | (((long) i) & 4294967295L);
    }

    private static int b(long j) {
        return (int) j;
    }

    private int b() {
        return this.f24680e.length - 1;
    }

    bm() {
        a(3, 1.0f);
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        if (this.f24678c == 0) {
            return -1;
        }
        return 0;
    }

    bm(int i) {
        this(i, 1.0f);
    }

    private static int[] g(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static long[] h(int i) {
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1);
        return jArr;
    }

    public final int b(@NullableDecl Object obj) {
        int a2 = a(obj);
        if (a2 == -1) {
            return 0;
        }
        return this.f24677b[a2];
    }

    /* access modifiers changed from: package-private */
    public final int c(int i) {
        m.a(i, this.f24678c);
        return this.f24677b[i];
    }

    /* access modifiers changed from: package-private */
    public final bg.a<K> d(int i) {
        m.a(i, this.f24678c);
        return new a(i);
    }

    private void i(int i) {
        int length = this.f24681f.length;
        if (i > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max < 0) {
                max = Integer.MAX_VALUE;
            }
            if (max != length) {
                j(max);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final K b(int i) {
        m.a(i, this.f24678c);
        return this.f24676a[i];
    }

    /* access modifiers changed from: package-private */
    public final void e(int i) {
        if (i > this.f24681f.length) {
            j(i);
        }
        if (i >= this.h) {
            k(Math.max(2, Integer.highestOneBit(i - 1) << 1));
        }
    }

    /* access modifiers changed from: package-private */
    @CanIgnoreReturnValue
    public final int f(int i) {
        return b(this.f24676a[i], a(this.f24681f[i]));
    }

    bm(bm<? extends K> bmVar) {
        a(bmVar.f24678c, 1.0f);
        int a2 = bmVar.a();
        while (a2 != -1) {
            a((K) bmVar.b(a2), bmVar.c(a2));
            a2 = bmVar.a(a2);
        }
    }

    private void j(int i) {
        this.f24676a = Arrays.copyOf(this.f24676a, i);
        this.f24677b = Arrays.copyOf(this.f24677b, i);
        long[] jArr = this.f24681f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1);
        }
        this.f24681f = copyOf;
    }

    private void k(int i) {
        if (this.f24680e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (((float) i) * this.g)) + 1;
        int[] g2 = g(i);
        long[] jArr = this.f24681f;
        int length = g2.length - 1;
        for (int i3 = 0; i3 < this.f24678c; i3++) {
            int a2 = a(jArr[i3]);
            int i4 = a2 & length;
            int i5 = g2[i4];
            g2[i4] = i3;
            jArr[i3] = (((long) a2) << 32) | (4294967295L & ((long) i5));
        }
        this.h = i2;
        this.f24680e = g2;
    }

    private void l(int i) {
        int i2 = this.f24678c - 1;
        if (i < i2) {
            Object[] objArr = this.f24676a;
            objArr[i] = objArr[i2];
            int[] iArr = this.f24677b;
            iArr[i] = iArr[i2];
            this.f24676a[i2] = null;
            this.f24677b[i2] = 0;
            long j = this.f24681f[i2];
            this.f24681f[i] = j;
            this.f24681f[i2] = -1;
            int a2 = a(j) & b();
            int i3 = this.f24680e[a2];
            if (i3 == i2) {
                this.f24680e[a2] = i;
            } else {
                while (true) {
                    long j2 = this.f24681f[i3];
                    int b2 = b(j2);
                    if (b2 == i2) {
                        this.f24681f[i3] = a(j2, i);
                        return;
                    }
                    i3 = b2;
                }
            }
        } else {
            this.f24676a[i] = null;
            this.f24677b[i] = 0;
            this.f24681f[i] = -1;
        }
    }

    /* access modifiers changed from: package-private */
    public final int a(int i) {
        int i2 = i + 1;
        if (i2 < this.f24678c) {
            return i2;
        }
        return -1;
    }

    /* access modifiers changed from: package-private */
    public final int a(@NullableDecl Object obj) {
        int a2 = af.a(obj);
        int i = this.f24680e[b() & a2];
        while (i != -1) {
            long j = this.f24681f[i];
            if (a(j) == a2 && j.a(obj, this.f24676a[i])) {
                return i;
            }
            i = b(j);
        }
        return -1;
    }

    private bm(int i, float f2) {
        a(i, 1.0f);
    }

    private void a(int i, float f2) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        m.a(z, (Object) "Initial capacity must be non-negative");
        if (f2 > 0.0f) {
            z2 = true;
        }
        m.a(z2, (Object) "Illegal load factor");
        int a2 = af.a(i, (double) f2);
        this.f24680e = g(a2);
        this.g = f2;
        this.f24676a = new Object[i];
        this.f24677b = new int[i];
        this.f24681f = h(i);
        this.h = Math.max(1, (int) (((float) a2) * f2));
    }

    /* access modifiers changed from: package-private */
    public int b(@NullableDecl Object obj, int i) {
        int b2 = b() & i;
        int i2 = this.f24680e[b2];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (a(this.f24681f[i2]) != i || !j.a(obj, this.f24676a[i2])) {
                int b3 = b(this.f24681f[i2]);
                if (b3 == -1) {
                    return 0;
                }
                int i4 = b3;
                i3 = i2;
                i2 = i4;
            } else {
                int i5 = this.f24677b[i2];
                if (i3 == -1) {
                    this.f24680e[b2] = b(this.f24681f[i2]);
                } else {
                    long[] jArr = this.f24681f;
                    jArr[i3] = a(jArr[i3], b(this.f24681f[i2]));
                }
                l(i2);
                this.f24678c--;
                this.f24679d++;
                return i5;
            }
        }
    }

    @CanIgnoreReturnValue
    public final int a(@NullableDecl K k, int i) {
        l.b(i, "count");
        long[] jArr = this.f24681f;
        Object[] objArr = this.f24676a;
        int[] iArr = this.f24677b;
        int a2 = af.a((Object) k);
        int b2 = b() & a2;
        int i2 = this.f24678c;
        int i3 = this.f24680e[b2];
        if (i3 == -1) {
            this.f24680e[b2] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (a(j) != a2 || !j.a(k, objArr[i3])) {
                    int b3 = b(j);
                    if (b3 == -1) {
                        jArr[i3] = a(j, i2);
                        break;
                    }
                    i3 = b3;
                } else {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
            }
        }
        if (i2 != Integer.MAX_VALUE) {
            int i5 = i2 + 1;
            i(i5);
            a(i2, k, i, a2);
            this.f24678c = i5;
            if (i2 >= this.h) {
                k(this.f24680e.length * 2);
            }
            this.f24679d++;
            return 0;
        }
        throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
    }

    /* access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        m.a(i, this.f24678c);
        this.f24677b[i] = i2;
    }

    private void a(int i, @NullableDecl K k, int i2, int i3) {
        this.f24681f[i] = (((long) i3) << 32) | 4294967295L;
        this.f24676a[i] = k;
        this.f24677b[i] = i2;
    }
}
