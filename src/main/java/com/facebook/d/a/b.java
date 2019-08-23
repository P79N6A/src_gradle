package com.facebook.d.a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import javax.annotation.Nonnull;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private e f23561a;

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f23562b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicReference<c> f23563c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicReference<c> f23564d;

    /* renamed from: e  reason: collision with root package name */
    private ArrayList<Object> f23565e;

    /* renamed from: f  reason: collision with root package name */
    private int f23566f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final b f23567a = new b((byte) 0);
    }

    @Nonnull
    public static b a() {
        return a.f23567a;
    }

    public final synchronized double c() {
        if (this.f23561a == null) {
            return -1.0d;
        }
        return this.f23561a.f23577c;
    }

    private b() {
        this.f23561a = new e(0.05d);
        this.f23562b = false;
        this.f23563c = new AtomicReference<>(c.UNKNOWN);
        this.f23565e = new ArrayList<>();
    }

    public final synchronized c b() {
        if (this.f23561a == null) {
            return c.UNKNOWN;
        }
        double d2 = this.f23561a.f23577c;
        if (d2 < 0.0d) {
            return c.UNKNOWN;
        } else if (d2 < 150.0d) {
            return c.POOR;
        } else if (d2 < 550.0d) {
            return c.MODERATE;
        } else if (d2 < 2000.0d) {
            return c.GOOD;
        } else {
            return c.EXCELLENT;
        }
    }

    /* synthetic */ b(byte b2) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00c3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00e3, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x00e2
            double r7 = (double) r7
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r0
            double r9 = (double) r9
            java.lang.Double.isNaN(r9)
            double r7 = r7 / r9
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r9
            r9 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00e2
        L_0x0020:
            com.facebook.d.a.e r9 = r6.f23561a     // Catch:{ all -> 0x00df }
            double r2 = r9.f23575a     // Catch:{ all -> 0x00df }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f23578d     // Catch:{ all -> 0x00df }
            int r4 = r9.f23576b     // Catch:{ all -> 0x00df }
            if (r10 <= r4) goto L_0x0046
            double r0 = r9.f23577c     // Catch:{ all -> 0x00df }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x00df }
            double r2 = r2 * r0
            double r0 = r9.f23575a     // Catch:{ all -> 0x00df }
            double r7 = java.lang.Math.log(r7)     // Catch:{ all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x00df }
            r9.f23577c = r7     // Catch:{ all -> 0x00df }
            goto L_0x0075
        L_0x0046:
            int r10 = r9.f23578d     // Catch:{ all -> 0x00df }
            if (r10 <= 0) goto L_0x0073
            int r10 = r9.f23578d     // Catch:{ all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f23578d     // Catch:{ all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f23577c     // Catch:{ all -> 0x00df }
            double r4 = java.lang.Math.log(r4)     // Catch:{ all -> 0x00df }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ all -> 0x00df }
            r9.f23577c = r7     // Catch:{ all -> 0x00df }
            goto L_0x0075
        L_0x0073:
            r9.f23577c = r7     // Catch:{ all -> 0x00df }
        L_0x0075:
            int r7 = r9.f23578d     // Catch:{ all -> 0x00df }
            r8 = 1
            int r7 = r7 + r8
            r9.f23578d = r7     // Catch:{ all -> 0x00df }
            boolean r7 = r6.f23562b     // Catch:{ all -> 0x00df }
            if (r7 == 0) goto L_0x00c4
            int r7 = r6.f23566f     // Catch:{ all -> 0x00df }
            int r7 = r7 + r8
            r6.f23566f = r7     // Catch:{ all -> 0x00df }
            com.facebook.d.a.c r7 = r6.b()     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.d.a.c> r9 = r6.f23564d     // Catch:{ all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ all -> 0x00df }
            r10 = 0
            if (r7 == r9) goto L_0x0095
            r6.f23562b = r10     // Catch:{ all -> 0x00df }
            r6.f23566f = r8     // Catch:{ all -> 0x00df }
        L_0x0095:
            int r7 = r6.f23566f     // Catch:{ all -> 0x00df }
            double r0 = (double) r7     // Catch:{ all -> 0x00df }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00c2
            r6.f23562b = r10     // Catch:{ all -> 0x00df }
            r6.f23566f = r8     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.d.a.c> r7 = r6.f23563c     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.d.a.c> r8 = r6.f23564d     // Catch:{ all -> 0x00df }
            java.lang.Object r8 = r8.get()     // Catch:{ all -> 0x00df }
            r7.set(r8)     // Catch:{ all -> 0x00df }
            java.util.ArrayList<java.lang.Object> r7 = r6.f23565e     // Catch:{ all -> 0x00df }
            int r7 = r7.size()     // Catch:{ all -> 0x00df }
        L_0x00b3:
            if (r10 >= r7) goto L_0x00c2
            java.util.ArrayList<java.lang.Object> r8 = r6.f23565e     // Catch:{ all -> 0x00df }
            r8.get(r10)     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.facebook.d.a.c> r8 = r6.f23563c     // Catch:{ all -> 0x00df }
            r8.get()     // Catch:{ all -> 0x00df }
            int r10 = r10 + 1
            goto L_0x00b3
        L_0x00c2:
            monitor-exit(r6)
            return
        L_0x00c4:
            java.util.concurrent.atomic.AtomicReference<com.facebook.d.a.c> r7 = r6.f23563c     // Catch:{ all -> 0x00df }
            java.lang.Object r7 = r7.get()     // Catch:{ all -> 0x00df }
            com.facebook.d.a.c r9 = r6.b()     // Catch:{ all -> 0x00df }
            if (r7 == r9) goto L_0x00dd
            r6.f23562b = r8     // Catch:{ all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x00df }
            com.facebook.d.a.c r8 = r6.b()     // Catch:{ all -> 0x00df }
            r7.<init>(r8)     // Catch:{ all -> 0x00df }
            r6.f23564d = r7     // Catch:{ all -> 0x00df }
        L_0x00dd:
            monitor-exit(r6)
            return
        L_0x00df:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00e2:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.d.a.b.a(long, long):void");
    }
}
