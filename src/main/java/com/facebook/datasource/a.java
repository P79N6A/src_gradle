package com.facebook.datasource;

import android.util.Pair;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import javax.annotation.concurrent.GuardedBy;

public abstract class a<T> implements DataSource<T> {
    @GuardedBy

    /* renamed from: a  reason: collision with root package name */
    private C0257a f23589a = C0257a.IN_PROGRESS;
    @GuardedBy

    /* renamed from: b  reason: collision with root package name */
    private boolean f23590b;
    @GuardedBy
    @Nullable

    /* renamed from: c  reason: collision with root package name */
    private T f23591c;
    @GuardedBy

    /* renamed from: d  reason: collision with root package name */
    private Throwable f23592d;
    @GuardedBy

    /* renamed from: e  reason: collision with root package name */
    private float f23593e;

    /* renamed from: f  reason: collision with root package name */
    private final ConcurrentLinkedQueue<Pair<DataSubscriber<T>, Executor>> f23594f = new ConcurrentLinkedQueue<>();

    /* renamed from: com.facebook.datasource.a$a  reason: collision with other inner class name */
    enum C0257a {
        IN_PROGRESS,
        SUCCESS,
        FAILURE
    }

    /* access modifiers changed from: protected */
    public void closeResult(@Nullable T t) {
    }

    public boolean hasMultipleResults() {
        return false;
    }

    @Nullable
    public synchronized Throwable getFailureCause() {
        return this.f23592d;
    }

    public synchronized float getProgress() {
        return this.f23593e;
    }

    @Nullable
    public synchronized T getResult() {
        return this.f23591c;
    }

    public synchronized boolean isClosed() {
        return this.f23590b;
    }

    protected a() {
    }

    public synchronized boolean hasFailed() {
        boolean z;
        if (this.f23589a == C0257a.FAILURE) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean hasResult() {
        boolean z;
        if (this.f23591c != null) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized boolean isFinished() {
        boolean z;
        if (this.f23589a != C0257a.IN_PROGRESS) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    private synchronized boolean b() {
        boolean z;
        if (!isClosed() || isFinished()) {
            z = false;
        } else {
            z = true;
        }
        return z;
    }

    private void a() {
        boolean hasFailed = hasFailed();
        boolean b2 = b();
        Iterator<Pair<DataSubscriber<T>, Executor>> it2 = this.f23594f.iterator();
        while (it2.hasNext()) {
            Pair next = it2.next();
            a((DataSubscriber) next.first, (Executor) next.second, hasFailed, b2);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0013, code lost:
        closeResult(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001a, code lost:
        if (isFinished() != false) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001f, code lost:
        monitor-enter(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        r3.f23594f.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0025, code lost:
        monitor-exit(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0026, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0011, code lost:
        if (r1 == null) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean close() {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f23590b     // Catch:{ all -> 0x002a }
            if (r0 == 0) goto L_0x0008
            r0 = 0
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            return r0
        L_0x0008:
            r0 = 1
            r3.f23590b = r0     // Catch:{ all -> 0x002a }
            T r1 = r3.f23591c     // Catch:{ all -> 0x002a }
            r2 = 0
            r3.f23591c = r2     // Catch:{ all -> 0x002a }
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            if (r1 == 0) goto L_0x0016
            r3.closeResult(r1)
        L_0x0016:
            boolean r1 = r3.isFinished()
            if (r1 != 0) goto L_0x001f
            r3.a()
        L_0x001f:
            monitor-enter(r3)
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r1 = r3.f23594f     // Catch:{ all -> 0x0027 }
            r1.clear()     // Catch:{ all -> 0x0027 }
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            return r0
        L_0x0027:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0027 }
            throw r0
        L_0x002a:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x002a }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.close():boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x001b, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized boolean a(float r4) {
        /*
            r3 = this;
            monitor-enter(r3)
            boolean r0 = r3.f23590b     // Catch:{ all -> 0x001c }
            r1 = 0
            if (r0 != 0) goto L_0x001a
            com.facebook.datasource.a$a r0 = r3.f23589a     // Catch:{ all -> 0x001c }
            com.facebook.datasource.a$a r2 = com.facebook.datasource.a.C0257a.IN_PROGRESS     // Catch:{ all -> 0x001c }
            if (r0 == r2) goto L_0x000d
            goto L_0x001a
        L_0x000d:
            float r0 = r3.f23593e     // Catch:{ all -> 0x001c }
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x0015
            monitor-exit(r3)
            return r1
        L_0x0015:
            r3.f23593e = r4     // Catch:{ all -> 0x001c }
            r4 = 1
            monitor-exit(r3)
            return r4
        L_0x001a:
            monitor-exit(r3)
            return r1
        L_0x001c:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.a(float):boolean");
    }

    private synchronized boolean b(Throwable th) {
        if (!this.f23590b) {
            if (this.f23589a == C0257a.IN_PROGRESS) {
                this.f23589a = C0257a.FAILURE;
                this.f23592d = th;
                return true;
            }
        }
        return false;
    }

    public boolean setProgress(float f2) {
        boolean a2 = a(f2);
        if (a2) {
            Iterator<Pair<DataSubscriber<T>, Executor>> it2 = this.f23594f.iterator();
            while (it2.hasNext()) {
                Pair next = it2.next();
                final DataSubscriber dataSubscriber = (DataSubscriber) next.first;
                ((Executor) next.second).execute(new Runnable() {
                    public final void run() {
                        dataSubscriber.onProgressUpdate(a.this);
                    }
                });
            }
        }
        return a2;
    }

    /* access modifiers changed from: protected */
    public boolean a(Throwable th) {
        boolean b2 = b(th);
        if (b2) {
            a();
        }
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0026, code lost:
        if (r4 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0028, code lost:
        closeResult(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x002c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0034, code lost:
        return false;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:20:0x0025=Splitter:B:20:0x0025, B:26:0x002d=Splitter:B:26:0x002d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(@javax.annotation.Nullable T r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            monitor-enter(r3)     // Catch:{ all -> 0x003c }
            boolean r1 = r3.f23590b     // Catch:{ all -> 0x0039 }
            if (r1 != 0) goto L_0x002d
            com.facebook.datasource.a$a r1 = r3.f23589a     // Catch:{ all -> 0x0039 }
            com.facebook.datasource.a$a r2 = com.facebook.datasource.a.C0257a.IN_PROGRESS     // Catch:{ all -> 0x0039 }
            if (r1 == r2) goto L_0x000d
            goto L_0x002d
        L_0x000d:
            if (r5 == 0) goto L_0x0017
            com.facebook.datasource.a$a r5 = com.facebook.datasource.a.C0257a.SUCCESS     // Catch:{ all -> 0x0039 }
            r3.f23589a = r5     // Catch:{ all -> 0x0039 }
            r5 = 1065353216(0x3f800000, float:1.0)
            r3.f23593e = r5     // Catch:{ all -> 0x0039 }
        L_0x0017:
            T r5 = r3.f23591c     // Catch:{ all -> 0x0039 }
            if (r5 == r4) goto L_0x0024
            T r5 = r3.f23591c     // Catch:{ all -> 0x0039 }
            r3.f23591c = r4     // Catch:{ all -> 0x0021 }
            r4 = r5
            goto L_0x0025
        L_0x0021:
            r4 = move-exception
            r0 = r5
            goto L_0x003a
        L_0x0024:
            r4 = r0
        L_0x0025:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x002b
            r3.closeResult(r4)
        L_0x002b:
            r4 = 1
            return r4
        L_0x002d:
            monitor-exit(r3)     // Catch:{ all -> 0x0035 }
            if (r4 == 0) goto L_0x0033
            r3.closeResult(r4)
        L_0x0033:
            r4 = 0
            return r4
        L_0x0035:
            r5 = move-exception
            r0 = r4
            r4 = r5
            goto L_0x003a
        L_0x0039:
            r4 = move-exception
        L_0x003a:
            monitor-exit(r3)     // Catch:{ all -> 0x0039 }
            throw r4     // Catch:{ all -> 0x003c }
        L_0x003c:
            r4 = move-exception
            if (r0 == 0) goto L_0x0042
            r3.closeResult(r0)
        L_0x0042:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.b(java.lang.Object, boolean):boolean");
    }

    /* access modifiers changed from: protected */
    public boolean a(@Nullable T t, boolean z) {
        boolean b2 = b(t, z);
        if (b2) {
            a();
        }
        return b2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (r0 == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0035, code lost:
        a(r3, r4, hasFailed(), b());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void subscribe(com.facebook.datasource.DataSubscriber<T> r3, java.util.concurrent.Executor r4) {
        /*
            r2 = this;
            com.facebook.common.internal.Preconditions.checkNotNull(r3)
            com.facebook.common.internal.Preconditions.checkNotNull(r4)
            monitor-enter(r2)
            boolean r0 = r2.f23590b     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x000d
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            return
        L_0x000d:
            com.facebook.datasource.a$a r0 = r2.f23589a     // Catch:{ all -> 0x0041 }
            com.facebook.datasource.a$a r1 = com.facebook.datasource.a.C0257a.IN_PROGRESS     // Catch:{ all -> 0x0041 }
            if (r0 != r1) goto L_0x001c
            java.util.concurrent.ConcurrentLinkedQueue<android.util.Pair<com.facebook.datasource.DataSubscriber<T>, java.util.concurrent.Executor>> r0 = r2.f23594f     // Catch:{ all -> 0x0041 }
            android.util.Pair r1 = android.util.Pair.create(r3, r4)     // Catch:{ all -> 0x0041 }
            r0.add(r1)     // Catch:{ all -> 0x0041 }
        L_0x001c:
            boolean r0 = r2.hasResult()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.isFinished()     // Catch:{ all -> 0x0041 }
            if (r0 != 0) goto L_0x0031
            boolean r0 = r2.b()     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x002f
            goto L_0x0031
        L_0x002f:
            r0 = 0
            goto L_0x0032
        L_0x0031:
            r0 = 1
        L_0x0032:
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            if (r0 == 0) goto L_0x0040
            boolean r0 = r2.hasFailed()
            boolean r1 = r2.b()
            r2.a(r3, r4, r0, r1)
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.datasource.a.subscribe(com.facebook.datasource.DataSubscriber, java.util.concurrent.Executor):void");
    }

    private void a(final DataSubscriber<T> dataSubscriber, Executor executor, final boolean z, final boolean z2) {
        executor.execute(new Runnable() {
            public final void run() {
                if (z) {
                    dataSubscriber.onFailure(a.this);
                } else if (z2) {
                    dataSubscriber.onCancellation(a.this);
                } else {
                    dataSubscriber.onNewResult(a.this);
                }
            }
        });
    }
}
