package com.ss.android.socialbase.downloader.network;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private static final String f31079a = "e";

    /* renamed from: b  reason: collision with root package name */
    private final b f31080b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f31081c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<f> f31082d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicReference<f> f31083e;

    /* renamed from: f  reason: collision with root package name */
    private final ArrayList<Object> f31084f;
    private int g;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f31086a = new e((byte) 0);
    }

    public static e a() {
        return a.f31086a;
    }

    private e() {
        this.f31080b = new b(0.05d);
        this.f31081c = false;
        this.f31082d = new AtomicReference<>(f.UNKNOWN);
        this.f31084f = new ArrayList<>();
    }

    private boolean c() {
        if (this.f31080b == null) {
            return false;
        }
        try {
            double d2 = 2000.0d;
            double d3 = 550.0d;
            switch (this.f31082d.get()) {
                case POOR:
                    d2 = 0.0d;
                    d3 = 150.0d;
                    break;
                case MODERATE:
                    d2 = 150.0d;
                    break;
                case GOOD:
                    d2 = 550.0d;
                    d3 = 2000.0d;
                    break;
                case EXCELLENT:
                    d3 = 3.4028234663852886E38d;
                    break;
                default:
                    return true;
            }
            double d4 = this.f31080b.f31077c;
            if (d4 > d3) {
                if (d4 > d3 * 1.25d) {
                    return true;
                }
            } else if (d4 < d2 * 0.8d) {
                return true;
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:13|(4:15|16|17|18)(2:19|(4:21|22|23|24)(2:25|(4:27|28|29|30)(4:31|32|33|34)))|35|36|37|38) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x0042 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.socialbase.downloader.network.f b() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.ss.android.socialbase.downloader.network.b r0 = r5.f31080b     // Catch:{ all -> 0x0046 }
            if (r0 != 0) goto L_0x0009
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.UNKNOWN     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return r0
        L_0x0009:
            com.ss.android.socialbase.downloader.network.b r0 = r5.f31080b     // Catch:{ Throwable -> 0x0042 }
            double r0 = r0.f31077c     // Catch:{ Throwable -> 0x0042 }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0017
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.UNKNOWN     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0017:
            r2 = 4639481672377565184(0x4062c00000000000, double:150.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0024
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.POOR     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0024:
            r2 = 4648049066981195776(0x4081300000000000, double:550.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0031
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.MODERATE     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0031:
            r2 = 4656510908468559872(0x409f400000000000, double:2000.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x003e
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.GOOD     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x003e:
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.EXCELLENT     // Catch:{ Throwable -> 0x0042 }
            monitor-exit(r5)
            return r0
        L_0x0042:
            com.ss.android.socialbase.downloader.network.f r0 = com.ss.android.socialbase.downloader.network.f.UNKNOWN     // Catch:{ all -> 0x0046 }
            monitor-exit(r5)
            return r0
        L_0x0046:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.network.e.b():com.ss.android.socialbase.downloader.network.f");
    }

    /* synthetic */ e(byte b2) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00de, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00e5, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r7, long r9) {
        /*
            r6 = this;
            monitor-enter(r6)
            double r7 = (double) r7
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r0
            double r2 = (double) r9
            java.lang.Double.isNaN(r2)
            double r7 = r7 / r2
            r2 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r2
            r2 = 0
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x00e4
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00e4
        L_0x0020:
            com.ss.android.socialbase.downloader.network.b r9 = r6.f31080b     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r9.f31075a     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f31078d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            int r4 = r9.f31076b     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r10 <= r4) goto L_0x0046
            double r0 = r9.f31077c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = java.lang.Math.log(r0)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r2 * r0
            double r0 = r9.f31075a     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r9.f31077c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            goto L_0x0075
        L_0x0046:
            int r10 = r9.f31078d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r10 <= 0) goto L_0x0073
            int r10 = r9.f31078d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f31078d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f31077c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r4 = java.lang.Math.log(r4)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r9.f31077c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            goto L_0x0075
        L_0x0073:
            r9.f31077c = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
        L_0x0075:
            int r7 = r9.f31078d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r8 = 1
            int r7 = r7 + r8
            r9.f31078d = r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            com.ss.android.socialbase.downloader.network.f r7 = r6.b()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            boolean r9 = r6.f31081c     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r9 == 0) goto L_0x00cc
            int r9 = r6.g     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            int r9 = r9 + r8
            r6.g = r9     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.f> r9 = r6.f31083e     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r10 = 0
            if (r7 == r9) goto L_0x0095
            r6.f31081c = r10     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.g = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
        L_0x0095:
            int r7 = r6.g     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            double r0 = (double) r7     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00ca
            boolean r7 = r6.c()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r7 == 0) goto L_0x00ca
            r6.f31081c = r10     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.g = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.f> r7 = r6.f31082d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.f> r8 = r6.f31083e     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r8 = r8.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r7.set(r8)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.ArrayList<java.lang.Object> r7 = r6.f31084f     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            int r7 = r7.size()     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
        L_0x00b9:
            if (r10 >= r7) goto L_0x00c8
            java.util.ArrayList<java.lang.Object> r8 = r6.f31084f     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            r8.get(r10)     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.f> r8 = r6.f31082d     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            r8.get()     // Catch:{ Throwable -> 0x00ca, all -> 0x00df }
            int r10 = r10 + 1
            goto L_0x00b9
        L_0x00c8:
            monitor-exit(r6)
            return
        L_0x00ca:
            monitor-exit(r6)
            return
        L_0x00cc:
            java.util.concurrent.atomic.AtomicReference<com.ss.android.socialbase.downloader.network.f> r9 = r6.f31082d     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            if (r9 == r7) goto L_0x00dd
            r6.f31081c = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            java.util.concurrent.atomic.AtomicReference r8 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r8.<init>(r7)     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
            r6.f31083e = r8     // Catch:{ Throwable -> 0x00e2, all -> 0x00df }
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
        L_0x00e4:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.socialbase.downloader.network.e.a(long, long):void");
    }
}
