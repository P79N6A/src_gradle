package com.google.common.util.concurrent;

import com.google.common.a.m;
import com.google.common.annotations.GwtIncompatible;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

@GwtIncompatible
public final class g {

    /* renamed from: a  reason: collision with root package name */
    private static final Logger f24878a = Logger.getLogger(g.class.getName());
    @NullableDecl
    @GuardedBy

    /* renamed from: b  reason: collision with root package name */
    private a f24879b;
    @GuardedBy

    /* renamed from: c  reason: collision with root package name */
    private boolean f24880c;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        final Runnable f24881a;

        /* renamed from: b  reason: collision with root package name */
        final Executor f24882b;
        @NullableDecl

        /* renamed from: c  reason: collision with root package name */
        a f24883c;

        a(Runnable runnable, Executor executor, a aVar) {
            this.f24881a = runnable;
            this.f24882b = executor;
            this.f24883c = aVar;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0015, code lost:
        r2 = r1.f24883c;
        r1.f24883c = r0;
        r0 = r1;
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        if (r0 == null) goto L_0x0028;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        b(r0.f24881a, r0.f24882b);
        r0 = r0.f24883c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0010, code lost:
        r1 = r0;
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f24880c     // Catch:{ all -> 0x0029 }
            if (r0 == 0) goto L_0x0007
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            return
        L_0x0007:
            r0 = 1
            r4.f24880c = r0     // Catch:{ all -> 0x0029 }
            com.google.common.util.concurrent.g$a r0 = r4.f24879b     // Catch:{ all -> 0x0029 }
            r1 = 0
            r4.f24879b = r1     // Catch:{ all -> 0x0029 }
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            r3 = r1
            r1 = r0
            r0 = r3
        L_0x0013:
            if (r1 == 0) goto L_0x001c
            com.google.common.util.concurrent.g$a r2 = r1.f24883c
            r1.f24883c = r0
            r0 = r1
            r1 = r2
            goto L_0x0013
        L_0x001c:
            if (r0 == 0) goto L_0x0028
            java.lang.Runnable r1 = r0.f24881a
            java.util.concurrent.Executor r2 = r0.f24882b
            b(r1, r2)
            com.google.common.util.concurrent.g$a r0 = r0.f24883c
            goto L_0x001c
        L_0x0028:
            return
        L_0x0029:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0029 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.g.a():void");
    }

    private static void b(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f24878a;
            Level level = Level.SEVERE;
            logger.log(level, "RuntimeException while executing runnable " + runnable + " with executor " + executor, e2);
        }
    }

    public final void a(Runnable runnable, Executor executor) {
        m.a(runnable, (Object) "Runnable was null.");
        m.a(executor, (Object) "Executor was null.");
        synchronized (this) {
            if (!this.f24880c) {
                this.f24879b = new a(runnable, executor, this.f24879b);
            } else {
                b(runnable, executor);
            }
        }
    }
}
