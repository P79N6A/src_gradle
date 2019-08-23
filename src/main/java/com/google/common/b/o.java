package com.google.common.b;

import com.google.common.annotations.GwtIncompatible;
import java.util.Random;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import sun.misc.Unsafe;

@GwtIncompatible
public abstract class o extends Number {

    /* renamed from: a  reason: collision with root package name */
    static final ThreadLocal<int[]> f24525a = new ThreadLocal<>();

    /* renamed from: b  reason: collision with root package name */
    static final Random f24526b = new Random();

    /* renamed from: c  reason: collision with root package name */
    static final int f24527c = Runtime.getRuntime().availableProcessors();
    private static final Unsafe g;
    private static final long h;
    private static final long i;
    @NullableDecl

    /* renamed from: d  reason: collision with root package name */
    volatile transient a[] f24528d;

    /* renamed from: e  reason: collision with root package name */
    volatile transient long f24529e;

    /* renamed from: f  reason: collision with root package name */
    volatile transient int f24530f;

    static final class a {

        /* renamed from: b  reason: collision with root package name */
        private static final Unsafe f24531b;

        /* renamed from: c  reason: collision with root package name */
        private static final long f24532c;

        /* renamed from: a  reason: collision with root package name */
        volatile long f24533a;

        static {
            try {
                f24531b = o.getUnsafe();
                f24532c = f24531b.objectFieldOffset(a.class.getDeclaredField("value"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        a(long j) {
            this.f24533a = j;
        }

        /* access modifiers changed from: package-private */
        public final boolean a(long j, long j2) {
            return f24531b.compareAndSwapLong(this, f24532c, j, j2);
        }
    }

    /* access modifiers changed from: package-private */
    public abstract long a(long j, long j2);

    o() {
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return g.compareAndSwapInt(this, i, 0, 1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        return (sun.misc.Unsafe) java.security.AccessController.doPrivileged(new com.google.common.b.o.AnonymousClass1());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0011, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001d, code lost:
        throw new java.lang.RuntimeException("Could not initialize intrinsics", r0.getCause());
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0005 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static sun.misc.Unsafe getUnsafe() {
        /*
            sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch:{ SecurityException -> 0x0005 }
            return r0
        L_0x0005:
            com.google.common.b.o$1 r0 = new com.google.common.b.o$1     // Catch:{ PrivilegedActionException -> 0x0011 }
            r0.<init>()     // Catch:{ PrivilegedActionException -> 0x0011 }
            java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch:{ PrivilegedActionException -> 0x0011 }
            sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch:{ PrivilegedActionException -> 0x0011 }
            return r0
        L_0x0011:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.Throwable r0 = r0.getCause()
            java.lang.String r2 = "Could not initialize intrinsics"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.b.o.getUnsafe():sun.misc.Unsafe");
    }

    static {
        try {
            g = getUnsafe();
            Class<o> cls = o.class;
            h = g.objectFieldOffset(cls.getDeclaredField("base"));
            i = g.objectFieldOffset(cls.getDeclaredField("busy"));
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean b(long j, long j2) {
        return g.compareAndSwapLong(this, h, j, j2);
    }
}
