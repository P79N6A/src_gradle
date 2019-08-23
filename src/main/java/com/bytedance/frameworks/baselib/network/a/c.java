package com.bytedance.frameworks.baselib.network.a;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public class c {

    /* renamed from: a  reason: collision with root package name */
    public AtomicReference<d> f19701a = new AtomicReference<>(d.UNKNOWN);

    /* renamed from: b  reason: collision with root package name */
    public ArrayList<b> f19702b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private f f19703c = new f(0.05d);

    /* renamed from: d  reason: collision with root package name */
    private volatile boolean f19704d = false;

    /* renamed from: e  reason: collision with root package name */
    private AtomicReference<d> f19705e;

    /* renamed from: f  reason: collision with root package name */
    private int f19706f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final c f19707a = new c();
    }

    public interface b {
        void a(d dVar);
    }

    public static c b() {
        return a.f19707a;
    }

    public final synchronized double d() {
        if (this.f19703c == null) {
            return -1.0d;
        }
        return this.f19703c.f19718c;
    }

    protected c() {
    }

    private boolean a() {
        if (this.f19703c == null) {
            return false;
        }
        try {
            d dVar = this.f19701a.get();
            double d2 = 560.0d;
            double d3 = 112.0d;
            if (d.POOR == dVar) {
                d2 = 0.0d;
                d3 = 28.0d;
            } else if (d.MODERATE == dVar) {
                d2 = 28.0d;
            } else if (d.GOOD == dVar) {
                d2 = 112.0d;
                d3 = 560.0d;
            } else if (d.EXCELLENT != dVar) {
                return true;
            } else {
                d3 = 3.4028234663852886E38d;
            }
            double d4 = this.f19703c.f19718c;
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
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.bytedance.frameworks.baselib.network.a.d c() {
        /*
            r5 = this;
            monitor-enter(r5)
            com.bytedance.frameworks.baselib.network.a.f r0 = r5.f19703c     // Catch:{ all -> 0x0040 }
            if (r0 != 0) goto L_0x0009
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.UNKNOWN     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return r0
        L_0x0009:
            com.bytedance.frameworks.baselib.network.a.f r0 = r5.f19703c     // Catch:{ Throwable -> 0x003c }
            double r0 = r0.f19718c     // Catch:{ Throwable -> 0x003c }
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0017
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.UNKNOWN     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0017:
            r2 = 4628574517030027264(0x403c000000000000, double:28.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0021
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.POOR     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0021:
            r2 = 4637581716284768256(0x405c000000000000, double:112.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x002b
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.MODERATE     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x002b:
            r2 = 4648137027911417856(0x4081800000000000, double:560.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0038
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.GOOD     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x0038:
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.EXCELLENT     // Catch:{ Throwable -> 0x003c }
            monitor-exit(r5)
            return r0
        L_0x003c:
            com.bytedance.frameworks.baselib.network.a.d r0 = com.bytedance.frameworks.baselib.network.a.d.UNKNOWN     // Catch:{ all -> 0x0040 }
            monitor-exit(r5)
            return r0
        L_0x0040:
            r0 = move-exception
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.a.c.c():com.bytedance.frameworks.baselib.network.a.d");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00f2, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00f9, code lost:
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
            if (r4 == 0) goto L_0x00f8
            r9 = 4613937818241073152(0x4008000000000000, double:3.0)
            int r2 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r2 >= 0) goto L_0x0020
            goto L_0x00f8
        L_0x0020:
            com.bytedance.common.utility.Logger.debug()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.f r9 = r6.f19703c     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r2 = r9.f19716a     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r10 = 0
            double r2 = r0 - r2
            int r10 = r9.f19719d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            int r4 = r9.f19717b     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            if (r10 <= r4) goto L_0x0049
            double r0 = r9.f19718c     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r0 = java.lang.Math.log(r0)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r2 = r2 * r0
            double r0 = r9.f19716a     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r9.f19718c = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            goto L_0x0078
        L_0x0049:
            int r10 = r9.f19719d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            if (r10 <= 0) goto L_0x0076
            int r10 = r9.f19719d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            double r2 = r2 * r4
            int r10 = r9.f19719d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r4 = (double) r10
            java.lang.Double.isNaN(r4)
            r10 = 0
            double r4 = r4 + r0
            double r2 = r2 / r4
            double r0 = r0 - r2
            double r4 = r9.f19718c     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r4 = java.lang.Math.log(r4)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r2 = r2 * r4
            double r7 = java.lang.Math.log(r7)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r0 = r0 * r7
            r7 = 0
            double r2 = r2 + r0
            double r7 = java.lang.Math.exp(r2)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r9.f19718c = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            goto L_0x0078
        L_0x0076:
            r9.f19718c = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
        L_0x0078:
            int r7 = r9.f19719d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r8 = 1
            int r7 = r7 + r8
            r9.f19719d = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            boolean r7 = r6.f19704d     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            if (r7 == 0) goto L_0x00d8
            int r7 = r6.f19706f     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            int r7 = r7 + r8
            r6.f19706f = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.d r7 = r6.c()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r9 = r6.f19705e     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r10 = 0
            if (r7 == r9) goto L_0x0098
            r6.f19704d = r10     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r6.f19706f = r8     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
        L_0x0098:
            int r7 = r6.f19706f     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            double r0 = (double) r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 < 0) goto L_0x00d6
            boolean r7 = r6.a()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            if (r7 == 0) goto L_0x00d6
            r6.f19704d = r10     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r6.f19706f = r8     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r7 = r6.f19701a     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r8 = r6.f19705e     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.lang.Object r8 = r8.get()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r7.set(r8)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.util.ArrayList<com.bytedance.frameworks.baselib.network.a.c$b> r7 = r6.f19702b     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            int r7 = r7.size()     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
        L_0x00bc:
            if (r10 >= r7) goto L_0x00d4
            java.util.ArrayList<com.bytedance.frameworks.baselib.network.a.c$b> r8 = r6.f19702b     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            java.lang.Object r8 = r8.get(r10)     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.c$b r8 = (com.bytedance.frameworks.baselib.network.a.c.b) r8     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r9 = r6.f19701a     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            java.lang.Object r9 = r9.get()     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.d r9 = (com.bytedance.frameworks.baselib.network.a.d) r9     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            r8.a(r9)     // Catch:{ Throwable -> 0x00d6, all -> 0x00f3 }
            int r10 = r10 + 1
            goto L_0x00bc
        L_0x00d4:
            monitor-exit(r6)
            return
        L_0x00d6:
            monitor-exit(r6)
            return
        L_0x00d8:
            java.util.concurrent.atomic.AtomicReference<com.bytedance.frameworks.baselib.network.a.d> r7 = r6.f19701a     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.lang.Object r7 = r7.get()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.d r9 = r6.c()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            if (r7 == r9) goto L_0x00f1
            r6.f19704d = r8     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            java.util.concurrent.atomic.AtomicReference r7 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            com.bytedance.frameworks.baselib.network.a.d r8 = r6.c()     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r7.<init>(r8)     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
            r6.f19705e = r7     // Catch:{ Throwable -> 0x00f6, all -> 0x00f3 }
        L_0x00f1:
            monitor-exit(r6)
            return
        L_0x00f3:
            r7 = move-exception
            monitor-exit(r6)
            throw r7
        L_0x00f6:
            monitor-exit(r6)
            return
        L_0x00f8:
            monitor-exit(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.a.c.a(long, long):void");
    }
}
