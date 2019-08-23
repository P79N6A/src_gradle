package com.facebook.imagepipeline.producers;

import android.os.SystemClock;
import com.facebook.common.internal.VisibleForTesting;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

public final class v {
    @GuardedBy
    @VisibleForTesting

    /* renamed from: a  reason: collision with root package name */
    com.facebook.imagepipeline.image.b f24202a = null;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: b  reason: collision with root package name */
    int f24203b = 0;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: c  reason: collision with root package name */
    c f24204c = c.IDLE;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: d  reason: collision with root package name */
    long f24205d = 0;
    @GuardedBy
    @VisibleForTesting

    /* renamed from: e  reason: collision with root package name */
    long f24206e = 0;

    /* renamed from: f  reason: collision with root package name */
    private final Executor f24207f;
    private final a g;
    private final Runnable h = new Runnable() {
        public final void run() {
            v.this.doJob();
        }
    };
    private final Runnable i = new Runnable() {
        public final void run() {
            v.this.submitJob();
        }
    };
    private final int j;

    public interface a {
        void run(com.facebook.imagepipeline.image.b bVar, int i);
    }

    @VisibleForTesting
    static class b {

        /* renamed from: a  reason: collision with root package name */
        private static ScheduledExecutorService f24211a;

        static ScheduledExecutorService a() {
            if (f24211a == null) {
                f24211a = w.a();
            }
            return f24211a;
        }
    }

    @VisibleForTesting
    enum c {
        IDLE,
        QUEUED,
        RUNNING,
        RUNNING_AND_PENDING
    }

    public final void submitJob() {
        this.f24207f.execute(this.h);
    }

    public final synchronized long getQueuedTime() {
        return this.f24206e - this.f24205d;
    }

    public final void clearJob() {
        com.facebook.imagepipeline.image.b bVar;
        synchronized (this) {
            bVar = this.f24202a;
            this.f24202a = null;
            this.f24203b = 0;
        }
        com.facebook.imagepipeline.image.b.closeSafely(bVar);
    }

    private void a() {
        boolean z;
        long j2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            if (this.f24204c == c.RUNNING_AND_PENDING) {
                j2 = Math.max(this.f24206e + ((long) this.j), uptimeMillis);
                z = true;
                this.f24205d = uptimeMillis;
                this.f24204c = c.QUEUED;
            } else {
                this.f24204c = c.IDLE;
                j2 = 0;
                z = false;
            }
        }
        if (z) {
            a(j2 - uptimeMillis);
        }
    }

    public final void doJob() {
        com.facebook.imagepipeline.image.b bVar;
        int i2;
        long uptimeMillis = SystemClock.uptimeMillis();
        synchronized (this) {
            bVar = this.f24202a;
            i2 = this.f24203b;
            this.f24202a = null;
            this.f24203b = 0;
            this.f24204c = c.RUNNING;
            this.f24206e = uptimeMillis;
        }
        try {
            if (a(bVar, i2)) {
                this.g.run(bVar, i2);
            }
        } finally {
            com.facebook.imagepipeline.image.b.closeSafely(bVar);
            a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003c, code lost:
        if (r3 == false) goto L_0x0042;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003e, code lost:
        a(r5 - r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean scheduleJob() {
        /*
            r7 = this;
            long r0 = android.os.SystemClock.uptimeMillis()
            monitor-enter(r7)
            com.facebook.imagepipeline.image.b r2 = r7.f24202a     // Catch:{ all -> 0x0043 }
            int r3 = r7.f24203b     // Catch:{ all -> 0x0043 }
            boolean r2 = a(r2, r3)     // Catch:{ all -> 0x0043 }
            r3 = 0
            if (r2 != 0) goto L_0x0012
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            return r3
        L_0x0012:
            int[] r2 = com.facebook.imagepipeline.producers.v.AnonymousClass3.f24210a     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.v$c r4 = r7.f24204c     // Catch:{ all -> 0x0043 }
            int r4 = r4.ordinal()     // Catch:{ all -> 0x0043 }
            r2 = r2[r4]     // Catch:{ all -> 0x0043 }
            r4 = 1
            switch(r2) {
                case 1: goto L_0x0026;
                case 2: goto L_0x0039;
                case 3: goto L_0x0021;
                default: goto L_0x0020;
            }     // Catch:{ all -> 0x0043 }
        L_0x0020:
            goto L_0x0039
        L_0x0021:
            com.facebook.imagepipeline.producers.v$c r2 = com.facebook.imagepipeline.producers.v.c.RUNNING_AND_PENDING     // Catch:{ all -> 0x0043 }
            r7.f24204c = r2     // Catch:{ all -> 0x0043 }
            goto L_0x0039
        L_0x0026:
            long r2 = r7.f24206e     // Catch:{ all -> 0x0043 }
            int r5 = r7.j     // Catch:{ all -> 0x0043 }
            long r5 = (long) r5     // Catch:{ all -> 0x0043 }
            long r2 = r2 + r5
            long r2 = java.lang.Math.max(r2, r0)     // Catch:{ all -> 0x0043 }
            r7.f24205d = r0     // Catch:{ all -> 0x0043 }
            com.facebook.imagepipeline.producers.v$c r5 = com.facebook.imagepipeline.producers.v.c.QUEUED     // Catch:{ all -> 0x0043 }
            r7.f24204c = r5     // Catch:{ all -> 0x0043 }
            r5 = r2
            r3 = 1
            goto L_0x003b
        L_0x0039:
            r5 = 0
        L_0x003b:
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            if (r3 == 0) goto L_0x0042
            long r5 = r5 - r0
            r7.a(r5)
        L_0x0042:
            return r4
        L_0x0043:
            r0 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0043 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.imagepipeline.producers.v.scheduleJob():boolean");
    }

    private void a(long j2) {
        if (j2 > 0) {
            b.a().schedule(this.i, j2, TimeUnit.MILLISECONDS);
        } else {
            this.i.run();
        }
    }

    public final boolean updateJob(com.facebook.imagepipeline.image.b bVar, int i2) {
        com.facebook.imagepipeline.image.b bVar2;
        if (!a(bVar, i2)) {
            return false;
        }
        synchronized (this) {
            bVar2 = this.f24202a;
            this.f24202a = com.facebook.imagepipeline.image.b.cloneOrNull(bVar);
            this.f24203b = i2;
        }
        com.facebook.imagepipeline.image.b.closeSafely(bVar2);
        return true;
    }

    private static boolean a(com.facebook.imagepipeline.image.b bVar, int i2) {
        if (b.isLast(i2) || b.statusHasFlag(i2, 4) || com.facebook.imagepipeline.image.b.isValid(bVar)) {
            return true;
        }
        return false;
    }

    public v(Executor executor, a aVar, int i2) {
        this.f24207f = executor;
        this.g = aVar;
        this.j = i2;
    }
}
