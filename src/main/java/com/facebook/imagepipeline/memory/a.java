package com.facebook.imagepipeline.memory;

import android.annotation.SuppressLint;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.common.internal.Preconditions;
import com.facebook.common.internal.VisibleForTesting;
import com.facebook.common.logging.FLog;
import com.facebook.common.memory.MemoryTrimType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;
import javax.annotation.concurrent.NotThreadSafe;

public abstract class a<V> implements com.facebook.common.memory.c<V> {

    /* renamed from: a  reason: collision with root package name */
    final com.facebook.common.memory.b f23943a;

    /* renamed from: b  reason: collision with root package name */
    final af f23944b;
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    final SparseArray<f<V>> f23945c;
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    final Set<V> f23946d;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    final C0266a f23947e;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: f  reason: collision with root package name */
    final C0266a f23948f;
    private final Class<?> g = getClass();
    private boolean h;
    private final ag i;

    @VisibleForTesting
    @NotThreadSafe
    /* renamed from: com.facebook.imagepipeline.memory.a$a  reason: collision with other inner class name */
    static class C0266a {

        /* renamed from: a  reason: collision with root package name */
        int f23949a;

        /* renamed from: b  reason: collision with root package name */
        int f23950b;

        C0266a() {
        }

        public final void reset() {
            this.f23949a = 0;
            this.f23950b = 0;
        }

        public final void increment(int i) {
            this.f23949a++;
            this.f23950b += i;
        }

        public final void decrement(int i) {
            if (this.f23950b < i || this.f23949a <= 0) {
                FLog.wtf("com.facebook.imagepipeline.memory.BasePool.Counter", "Unexpected decrement of %d. Current numBytes = %d, count = %d", Integer.valueOf(i), Integer.valueOf(this.f23950b), Integer.valueOf(this.f23949a));
                return;
            }
            this.f23949a--;
            this.f23950b -= i;
        }
    }

    public static class b extends RuntimeException {
        public b(Object obj) {
            super("Invalid size: " + obj.toString());
        }
    }

    public static class c extends RuntimeException {
        public c(int i, int i2, int i3, int i4) {
            super("Pool hard cap violation? Hard cap = " + i + " Used size = " + i2 + " Free size = " + i3 + " Request size = " + i4);
        }
    }

    /* access modifiers changed from: protected */
    public abstract V a(int i2);

    /* access modifiers changed from: protected */
    @VisibleForTesting
    public abstract void a(V v);

    /* access modifiers changed from: protected */
    public abstract int b(int i2);

    /* access modifiers changed from: protected */
    public abstract int b(V v);

    /* access modifiers changed from: protected */
    public abstract int c(int i2);

    private synchronized void b() {
        boolean z;
        if (e()) {
            if (this.f23948f.f23950b != 0) {
                z = false;
                Preconditions.checkState(z);
            }
        }
        z = true;
        Preconditions.checkState(z);
    }

    @VisibleForTesting
    private synchronized void d() {
        if (e()) {
            e(this.f23944b.maxSizeSoftCap);
        }
    }

    @VisibleForTesting
    private synchronized boolean e() {
        boolean z;
        if (this.f23947e.f23950b + this.f23948f.f23950b > this.f23944b.maxSizeSoftCap) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.i.onSoftCapReached();
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        this.f23943a.registerMemoryTrimmable(this);
        this.i.setBasePool(this);
    }

    private synchronized void c() {
        SparseIntArray sparseIntArray = this.f23944b.bucketSizes;
        if (sparseIntArray != null) {
            this.f23945c.clear();
            for (int i2 = 0; i2 < sparseIntArray.size(); i2++) {
                int keyAt = sparseIntArray.keyAt(i2);
                this.f23945c.put(keyAt, new f(c(keyAt), sparseIntArray.valueAt(i2), 0, this.f23944b.fixBucketsReinitialization));
            }
            this.h = false;
            return;
        }
        this.h = true;
    }

    @SuppressLint({"InvalidAccessToGuardedField"})
    private void f() {
        if (FLog.isLoggable(2)) {
            FLog.v(this.g, "Used = (%d, %d); Free = (%d, %d)", (Object) Integer.valueOf(this.f23947e.f23949a), (Object) Integer.valueOf(this.f23947e.f23950b), (Object) Integer.valueOf(this.f23948f.f23949a), (Object) Integer.valueOf(this.f23948f.f23950b));
        }
    }

    /* access modifiers changed from: protected */
    public boolean c(V v) {
        Preconditions.checkNotNull(v);
        return true;
    }

    private synchronized f<V> f(int i2) {
        return this.f23945c.get(i2);
    }

    /* access modifiers changed from: protected */
    @Nullable
    public synchronized V a(f<V> fVar) {
        return fVar.get();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002e, code lost:
        return r0;
     */
    @com.facebook.common.internal.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized com.facebook.imagepipeline.memory.f<V> g(int r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r0 = r3.f23945c     // Catch:{ all -> 0x002f }
            java.lang.Object r0 = r0.get(r4)     // Catch:{ all -> 0x002f }
            com.facebook.imagepipeline.memory.f r0 = (com.facebook.imagepipeline.memory.f) r0     // Catch:{ all -> 0x002f }
            if (r0 != 0) goto L_0x002d
            boolean r1 = r3.h     // Catch:{ all -> 0x002f }
            if (r1 != 0) goto L_0x0010
            goto L_0x002d
        L_0x0010:
            r0 = 2
            boolean r0 = com.facebook.common.logging.FLog.isLoggable(r0)     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0022
            java.lang.Class<?> r0 = r3.g     // Catch:{ all -> 0x002f }
            java.lang.String r1 = "creating new bucket %s"
            java.lang.Integer r2 = java.lang.Integer.valueOf(r4)     // Catch:{ all -> 0x002f }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r0, (java.lang.String) r1, (java.lang.Object) r2)     // Catch:{ all -> 0x002f }
        L_0x0022:
            com.facebook.imagepipeline.memory.f r0 = r3.d(r4)     // Catch:{ all -> 0x002f }
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r1 = r3.f23945c     // Catch:{ all -> 0x002f }
            r1.put(r4, r0)     // Catch:{ all -> 0x002f }
            monitor-exit(r3)
            return r0
        L_0x002d:
            monitor-exit(r3)
            return r0
        L_0x002f:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.g(int):com.facebook.imagepipeline.memory.f");
    }

    /* access modifiers changed from: package-private */
    public f<V> d(int i2) {
        return new f<>(c(i2), Integer.MAX_VALUE, 0, this.f23944b.fixBucketsReinitialization);
    }

    private synchronized void a(SparseIntArray sparseIntArray) {
        Preconditions.checkNotNull(sparseIntArray);
        this.f23945c.clear();
        SparseIntArray sparseIntArray2 = this.f23944b.bucketSizes;
        if (sparseIntArray2 != null) {
            for (int i2 = 0; i2 < sparseIntArray2.size(); i2++) {
                int keyAt = sparseIntArray2.keyAt(i2);
                this.f23945c.put(keyAt, new f(c(keyAt), sparseIntArray2.valueAt(i2), sparseIntArray.get(keyAt, 0), this.f23944b.fixBucketsReinitialization));
            }
            this.h = false;
            return;
        }
        this.h = true;
    }

    @VisibleForTesting
    private synchronized boolean h(int i2) {
        int i3 = this.f23944b.maxSizeHardCap;
        if (i2 > i3 - this.f23947e.f23950b) {
            this.i.onHardCapReached();
            return false;
        }
        int i4 = this.f23944b.maxSizeSoftCap;
        if (i2 > i4 - (this.f23947e.f23950b + this.f23948f.f23950b)) {
            e(i4 - i2);
        }
        if (i2 <= i3 - (this.f23947e.f23950b + this.f23948f.f23950b)) {
            return true;
        }
        this.i.onHardCapReached();
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008b, code lost:
        return;
     */
    @com.facebook.common.internal.VisibleForTesting
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void e(int r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            com.facebook.imagepipeline.memory.a$a r0 = r7.f23947e     // Catch:{ all -> 0x008c }
            int r0 = r0.f23950b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r1 = r7.f23948f     // Catch:{ all -> 0x008c }
            int r1 = r1.f23950b     // Catch:{ all -> 0x008c }
            int r0 = r0 + r1
            int r0 = r0 - r8
            com.facebook.imagepipeline.memory.a$a r1 = r7.f23948f     // Catch:{ all -> 0x008c }
            int r1 = r1.f23950b     // Catch:{ all -> 0x008c }
            int r0 = java.lang.Math.min(r0, r1)     // Catch:{ all -> 0x008c }
            if (r0 > 0) goto L_0x0017
            monitor-exit(r7)
            return
        L_0x0017:
            r1 = 2
            boolean r2 = com.facebook.common.logging.FLog.isLoggable(r1)     // Catch:{ all -> 0x008c }
            if (r2 == 0) goto L_0x003a
            java.lang.Class<?> r2 = r7.g     // Catch:{ all -> 0x008c }
            java.lang.String r3 = "trimToSize: TargetSize = %d; Initial Size = %d; Bytes to free = %d"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r5 = r7.f23947e     // Catch:{ all -> 0x008c }
            int r5 = r5.f23950b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r6 = r7.f23948f     // Catch:{ all -> 0x008c }
            int r6 = r6.f23950b     // Catch:{ all -> 0x008c }
            int r5 = r5 + r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ all -> 0x008c }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)     // Catch:{ all -> 0x008c }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r2, (java.lang.String) r3, (java.lang.Object) r4, (java.lang.Object) r5, (java.lang.Object) r6)     // Catch:{ all -> 0x008c }
        L_0x003a:
            r7.f()     // Catch:{ all -> 0x008c }
            r2 = 0
        L_0x003e:
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f23945c     // Catch:{ all -> 0x008c }
            int r3 = r3.size()     // Catch:{ all -> 0x008c }
            if (r2 >= r3) goto L_0x0069
            if (r0 <= 0) goto L_0x0069
            android.util.SparseArray<com.facebook.imagepipeline.memory.f<V>> r3 = r7.f23945c     // Catch:{ all -> 0x008c }
            java.lang.Object r3 = r3.valueAt(r2)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.f r3 = (com.facebook.imagepipeline.memory.f) r3     // Catch:{ all -> 0x008c }
        L_0x0050:
            if (r0 <= 0) goto L_0x0066
            java.lang.Object r4 = r3.pop()     // Catch:{ all -> 0x008c }
            if (r4 == 0) goto L_0x0066
            r7.a((V) r4)     // Catch:{ all -> 0x008c }
            int r4 = r3.mItemSize     // Catch:{ all -> 0x008c }
            int r0 = r0 - r4
            com.facebook.imagepipeline.memory.a$a r4 = r7.f23948f     // Catch:{ all -> 0x008c }
            int r5 = r3.mItemSize     // Catch:{ all -> 0x008c }
            r4.decrement(r5)     // Catch:{ all -> 0x008c }
            goto L_0x0050
        L_0x0066:
            int r2 = r2 + 1
            goto L_0x003e
        L_0x0069:
            r7.f()     // Catch:{ all -> 0x008c }
            boolean r0 = com.facebook.common.logging.FLog.isLoggable(r1)     // Catch:{ all -> 0x008c }
            if (r0 == 0) goto L_0x008a
            java.lang.Class<?> r0 = r7.g     // Catch:{ all -> 0x008c }
            java.lang.String r1 = "trimToSize: TargetSize = %d; Final Size = %d"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r2 = r7.f23947e     // Catch:{ all -> 0x008c }
            int r2 = r2.f23950b     // Catch:{ all -> 0x008c }
            com.facebook.imagepipeline.memory.a$a r3 = r7.f23948f     // Catch:{ all -> 0x008c }
            int r3 = r3.f23950b     // Catch:{ all -> 0x008c }
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x008c }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r0, (java.lang.String) r1, (java.lang.Object) r8, (java.lang.Object) r2)     // Catch:{ all -> 0x008c }
        L_0x008a:
            monitor-exit(r7)
            return
        L_0x008c:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.e(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0052, code lost:
        return r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x006d, code lost:
        r0 = a(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006f, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0070, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        r5.f23947e.decrement(r2);
        r4 = g(r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007a, code lost:
        if (r4 != null) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x007c, code lost:
        r4.decrementInUseCount();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0080, code lost:
        com.facebook.common.internal.k.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0083, code lost:
        monitor-enter(r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        com.facebook.common.internal.Preconditions.checkState(r5.f23946d.add(r0));
        d();
        r5.i.onAlloc(r2);
        f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009c, code lost:
        if (com.facebook.common.logging.FLog.isLoggable(2) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x009e, code lost:
        com.facebook.common.logging.FLog.v(r5.g, "get (alloc) (object, size) = (%x, %s)", (java.lang.Object) java.lang.Integer.valueOf(java.lang.System.identityHashCode(r0)), (java.lang.Object) java.lang.Integer.valueOf(r6));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b2, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public V get(int r6) {
        /*
            r5 = this;
            r5.b()
            int r6 = r5.b((int) r6)
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.f r0 = r5.g(r6)     // Catch:{ all -> 0x00cb }
            r1 = 2
            if (r0 == 0) goto L_0x0053
            java.lang.Object r2 = r5.a((com.facebook.imagepipeline.memory.f<V>) r0)     // Catch:{ all -> 0x00cb }
            if (r2 == 0) goto L_0x0053
            java.util.Set<V> r6 = r5.f23946d     // Catch:{ all -> 0x00cb }
            boolean r6 = r6.add(r2)     // Catch:{ all -> 0x00cb }
            com.facebook.common.internal.Preconditions.checkState(r6)     // Catch:{ all -> 0x00cb }
            int r6 = r5.b((V) r2)     // Catch:{ all -> 0x00cb }
            int r0 = r5.c((int) r6)     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f23947e     // Catch:{ all -> 0x00cb }
            r3.increment(r0)     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f23948f     // Catch:{ all -> 0x00cb }
            r3.decrement(r0)     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.ag r3 = r5.i     // Catch:{ all -> 0x00cb }
            r3.onValueReuse(r0)     // Catch:{ all -> 0x00cb }
            r5.f()     // Catch:{ all -> 0x00cb }
            boolean r0 = com.facebook.common.logging.FLog.isLoggable(r1)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0051
            java.lang.Class<?> r0 = r5.g     // Catch:{ all -> 0x00cb }
            java.lang.String r1 = "get (reuse) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r2)     // Catch:{ all -> 0x00cb }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00cb }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00cb }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r0, (java.lang.String) r1, (java.lang.Object) r3, (java.lang.Object) r6)     // Catch:{ all -> 0x00cb }
        L_0x0051:
            monitor-exit(r5)     // Catch:{ all -> 0x00cb }
            return r2
        L_0x0053:
            int r2 = r5.c((int) r6)     // Catch:{ all -> 0x00cb }
            boolean r3 = r5.h(r2)     // Catch:{ all -> 0x00cb }
            if (r3 == 0) goto L_0x00b9
            com.facebook.imagepipeline.memory.a$a r3 = r5.f23947e     // Catch:{ all -> 0x00cb }
            r3.increment(r2)     // Catch:{ all -> 0x00cb }
            if (r0 == 0) goto L_0x0067
            r0.incrementInUseCount()     // Catch:{ all -> 0x00cb }
        L_0x0067:
            monitor-exit(r5)     // Catch:{ all -> 0x00cb }
            r0 = 0
            java.lang.Object r3 = r5.a((int) r6)     // Catch:{ Throwable -> 0x006f }
            r0 = r3
            goto L_0x0083
        L_0x006f:
            r3 = move-exception
            monitor-enter(r5)
            com.facebook.imagepipeline.memory.a$a r4 = r5.f23947e     // Catch:{ all -> 0x00b6 }
            r4.decrement(r2)     // Catch:{ all -> 0x00b6 }
            com.facebook.imagepipeline.memory.f r4 = r5.g(r6)     // Catch:{ all -> 0x00b6 }
            if (r4 == 0) goto L_0x007f
            r4.decrementInUseCount()     // Catch:{ all -> 0x00b6 }
        L_0x007f:
            monitor-exit(r5)     // Catch:{ all -> 0x00b6 }
            com.facebook.common.internal.k.a(r3)
        L_0x0083:
            monitor-enter(r5)
            java.util.Set<V> r3 = r5.f23946d     // Catch:{ all -> 0x00b3 }
            boolean r3 = r3.add(r0)     // Catch:{ all -> 0x00b3 }
            com.facebook.common.internal.Preconditions.checkState(r3)     // Catch:{ all -> 0x00b3 }
            r5.d()     // Catch:{ all -> 0x00b3 }
            com.facebook.imagepipeline.memory.ag r3 = r5.i     // Catch:{ all -> 0x00b3 }
            r3.onAlloc(r2)     // Catch:{ all -> 0x00b3 }
            r5.f()     // Catch:{ all -> 0x00b3 }
            boolean r1 = com.facebook.common.logging.FLog.isLoggable(r1)     // Catch:{ all -> 0x00b3 }
            if (r1 == 0) goto L_0x00b1
            java.lang.Class<?> r1 = r5.g     // Catch:{ all -> 0x00b3 }
            java.lang.String r2 = "get (alloc) (object, size) = (%x, %s)"
            int r3 = java.lang.System.identityHashCode(r0)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ all -> 0x00b3 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00b3 }
            com.facebook.common.logging.FLog.v((java.lang.Class<?>) r1, (java.lang.String) r2, (java.lang.Object) r3, (java.lang.Object) r6)     // Catch:{ all -> 0x00b3 }
        L_0x00b1:
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            return r0
        L_0x00b3:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b3 }
            throw r6
        L_0x00b6:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b6 }
            throw r6
        L_0x00b9:
            com.facebook.imagepipeline.memory.a$c r6 = new com.facebook.imagepipeline.memory.a$c     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.af r0 = r5.f23944b     // Catch:{ all -> 0x00cb }
            int r0 = r0.maxSizeHardCap     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.a$a r1 = r5.f23947e     // Catch:{ all -> 0x00cb }
            int r1 = r1.f23950b     // Catch:{ all -> 0x00cb }
            com.facebook.imagepipeline.memory.a$a r3 = r5.f23948f     // Catch:{ all -> 0x00cb }
            int r3 = r3.f23950b     // Catch:{ all -> 0x00cb }
            r6.<init>(r0, r1, r3, r2)     // Catch:{ all -> 0x00cb }
            throw r6     // Catch:{ all -> 0x00cb }
        L_0x00cb:
            r6 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00cb }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.memory.a.get(int):java.lang.Object");
    }

    public void release(V v) {
        Preconditions.checkNotNull(v);
        int b2 = b(v);
        int c2 = c(b2);
        synchronized (this) {
            f f2 = f(b2);
            if (!this.f23946d.remove(v)) {
                FLog.e(this.g, "release (free, value unrecognized) (object, size) = (%x, %s)", Integer.valueOf(System.identityHashCode(v)), Integer.valueOf(b2));
                a(v);
                this.i.onFree(c2);
            } else {
                if (f2 != null && !f2.isMaxLengthExceeded() && !e()) {
                    if (c(v)) {
                        f2.release(v);
                        this.f23948f.increment(c2);
                        this.f23947e.decrement(c2);
                        this.i.onValueRelease(c2);
                        if (FLog.isLoggable(2)) {
                            FLog.v(this.g, "release (reuse) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(b2));
                        }
                    }
                }
                if (f2 != null) {
                    f2.decrementInUseCount();
                }
                if (FLog.isLoggable(2)) {
                    FLog.v(this.g, "release (free) (object, size) = (%x, %s)", (Object) Integer.valueOf(System.identityHashCode(v)), (Object) Integer.valueOf(b2));
                }
                a(v);
                this.f23947e.decrement(c2);
                this.i.onFree(c2);
            }
            f();
        }
    }

    public void trim(MemoryTrimType memoryTrimType) {
        int i2;
        ArrayList arrayList;
        synchronized (this) {
            if (this.f23944b.fixBucketsReinitialization) {
                arrayList = new ArrayList(this.f23945c.size());
                int size = this.f23945c.size();
                for (int i3 = 0; i3 < size; i3++) {
                    f valueAt = this.f23945c.valueAt(i3);
                    int i4 = valueAt.mItemSize;
                    int i5 = valueAt.mMaxLength;
                    int i6 = valueAt.mInUseLength;
                    if (valueAt.a() > 0) {
                        arrayList.add(valueAt);
                    }
                    this.f23945c.setValueAt(i3, new f(c(i4), i5, i6, this.f23944b.fixBucketsReinitialization));
                }
            } else {
                arrayList = new ArrayList(this.f23945c.size());
                SparseIntArray sparseIntArray = new SparseIntArray();
                for (int i7 = 0; i7 < this.f23945c.size(); i7++) {
                    f valueAt2 = this.f23945c.valueAt(i7);
                    if (valueAt2.a() > 0) {
                        arrayList.add(valueAt2);
                    }
                    sparseIntArray.put(this.f23945c.keyAt(i7), valueAt2.mInUseLength);
                }
                a(sparseIntArray);
            }
            this.f23948f.reset();
            f();
        }
        for (i2 = 0; i2 < arrayList.size(); i2++) {
            f fVar = (f) arrayList.get(i2);
            while (true) {
                Object pop = fVar.pop();
                if (pop == null) {
                    break;
                }
                a((V) pop);
            }
        }
    }

    public a(com.facebook.common.memory.b bVar, af afVar, ag agVar) {
        this.f23943a = (com.facebook.common.memory.b) Preconditions.checkNotNull(bVar);
        this.f23944b = (af) Preconditions.checkNotNull(afVar);
        this.i = (ag) Preconditions.checkNotNull(agVar);
        this.f23945c = new SparseArray<>();
        if (this.f23944b.fixBucketsReinitialization) {
            c();
        } else {
            a(new SparseIntArray(0));
        }
        this.f23946d = Collections.newSetFromMap(new IdentityHashMap());
        this.f23948f = new C0266a();
        this.f23947e = new C0266a();
    }
}
