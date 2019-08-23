package com.toutiao.proxyserver.e;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f80044a;

    /* renamed from: b  reason: collision with root package name */
    private e f80045b;

    /* renamed from: c  reason: collision with root package name */
    private volatile boolean f80046c;

    /* renamed from: d  reason: collision with root package name */
    private AtomicReference<b> f80047d;

    /* renamed from: e  reason: collision with root package name */
    private AtomicReference<b> f80048e;

    /* renamed from: f  reason: collision with root package name */
    private ArrayList<Object> f80049f;
    private int g;

    /* renamed from: com.toutiao.proxyserver.e.a$a  reason: collision with other inner class name */
    static class C0855a {

        /* renamed from: a  reason: collision with root package name */
        public static final a f80051a = new a((byte) 0);
    }

    private a() {
        this.f80045b = new e(0.05d);
        this.f80046c = false;
        this.f80047d = new AtomicReference<>(b.UNKNOWN);
        this.f80049f = new ArrayList<>();
    }

    private void b() {
        if (PatchProxy.isSupport(new Object[0], this, f80044a, false, 91846, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f80044a, false, 91846, new Class[0], Void.TYPE);
            return;
        }
        int size = this.f80049f.size();
        for (int i = 0; i < size; i++) {
            this.f80049f.get(i);
            this.f80047d.get();
        }
    }

    private synchronized b a() {
        if (PatchProxy.isSupport(new Object[0], this, f80044a, false, 91843, new Class[0], b.class)) {
            return (b) PatchProxy.accessDispatch(new Object[0], this, f80044a, false, 91843, new Class[0], b.class);
        } else if (this.f80045b == null) {
            return b.UNKNOWN;
        } else {
            double d2 = this.f80045b.f80065d;
            if (d2 < 0.0d) {
                return b.UNKNOWN;
            } else if (d2 < 150.0d) {
                return b.POOR;
            } else if (d2 < 550.0d) {
                return b.MODERATE;
            } else if (d2 < 2000.0d) {
                return b.GOOD;
            } else {
                return b.EXCELLENT;
            }
        }
    }

    /* synthetic */ a(byte b2) {
        this();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x019e, code lost:
        r5 = r8.f80045b.f80065d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a4, code lost:
        if (r5 <= r3) goto L_0x01af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x01ac, code lost:
        if (r5 <= (r3 * 1.25d)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01b8, code lost:
        if (r5 >= (r1 * 0.8d)) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x01d1, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x01ee, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r25, long r27) {
        /*
            r24 = this;
            r8 = r24
            r9 = r25
            r11 = r27
            monitor-enter(r24)
            r0 = 2
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ef }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01ef }
            r2.<init>(r9)     // Catch:{ all -> 0x01ef }
            r13 = 0
            r1[r13] = r2     // Catch:{ all -> 0x01ef }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01ef }
            r2.<init>(r11)     // Catch:{ all -> 0x01ef }
            r14 = 1
            r1[r14] = r2     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r3 = f80044a     // Catch:{ all -> 0x01ef }
            r4 = 0
            r5 = 91840(0x166c0, float:1.28695E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ef }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x01ef }
            r6[r13] = r2     // Catch:{ all -> 0x01ef }
            java.lang.Class r2 = java.lang.Long.TYPE     // Catch:{ all -> 0x01ef }
            r6[r14] = r2     // Catch:{ all -> 0x01ef }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ef }
            r2 = r24
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ef }
            if (r1 == 0) goto L_0x005d
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x01ef }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01ef }
            r2.<init>(r9)     // Catch:{ all -> 0x01ef }
            r1[r13] = r2     // Catch:{ all -> 0x01ef }
            java.lang.Long r2 = new java.lang.Long     // Catch:{ all -> 0x01ef }
            r2.<init>(r11)     // Catch:{ all -> 0x01ef }
            r1[r14] = r2     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r3 = f80044a     // Catch:{ all -> 0x01ef }
            r4 = 0
            r5 = 91840(0x166c0, float:1.28695E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x01ef }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x01ef }
            r6[r13] = r0     // Catch:{ all -> 0x01ef }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x01ef }
            r6[r14] = r0     // Catch:{ all -> 0x01ef }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ef }
            r2 = r24
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ef }
            monitor-exit(r24)
            return
        L_0x005d:
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x01ed
            double r0 = (double) r9
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            double r4 = (double) r11
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            r4 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r0 = r0 * r4
            r4 = 4621819117588971520(0x4024000000000000, double:10.0)
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 >= 0) goto L_0x007c
            goto L_0x01ed
        L_0x007c:
            com.toutiao.proxyserver.e.e r4 = r8.f80045b     // Catch:{ all -> 0x01ef }
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x01ef }
            java.lang.Double r5 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x01ef }
            r15[r13] = r5     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r17 = com.toutiao.proxyserver.e.e.f80062a     // Catch:{ all -> 0x01ef }
            r18 = 0
            r19 = 91857(0x166d1, float:1.28719E-40)
            java.lang.Class[] r5 = new java.lang.Class[r14]     // Catch:{ all -> 0x01ef }
            java.lang.Class r6 = java.lang.Double.TYPE     // Catch:{ all -> 0x01ef }
            r5[r13] = r6     // Catch:{ all -> 0x01ef }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ef }
            r16 = r4
            r20 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ef }
            if (r5 == 0) goto L_0x00be
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ all -> 0x01ef }
            java.lang.Double r0 = java.lang.Double.valueOf(r0)     // Catch:{ all -> 0x01ef }
            r15[r13] = r0     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r17 = com.toutiao.proxyserver.e.e.f80062a     // Catch:{ all -> 0x01ef }
            r18 = 0
            r19 = 91857(0x166d1, float:1.28719E-40)
            java.lang.Class[] r0 = new java.lang.Class[r14]     // Catch:{ all -> 0x01ef }
            java.lang.Class r1 = java.lang.Double.TYPE     // Catch:{ all -> 0x01ef }
            r0[r13] = r1     // Catch:{ all -> 0x01ef }
            java.lang.Class r21 = java.lang.Void.TYPE     // Catch:{ all -> 0x01ef }
            r16 = r4
            r20 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ all -> 0x01ef }
            goto L_0x0116
        L_0x00be:
            double r5 = r4.f80063b     // Catch:{ all -> 0x01ef }
            r7 = 0
            double r5 = r2 - r5
            int r7 = r4.f80066e     // Catch:{ all -> 0x01ef }
            int r9 = r4.f80064c     // Catch:{ all -> 0x01ef }
            if (r7 <= r9) goto L_0x00e2
            double r2 = r4.f80065d     // Catch:{ all -> 0x01ef }
            double r2 = java.lang.Math.log(r2)     // Catch:{ all -> 0x01ef }
            double r5 = r5 * r2
            double r2 = r4.f80063b     // Catch:{ all -> 0x01ef }
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x01ef }
            double r2 = r2 * r0
            r0 = 0
            double r5 = r5 + r2
            double r0 = java.lang.Math.exp(r5)     // Catch:{ all -> 0x01ef }
            r4.f80065d = r0     // Catch:{ all -> 0x01ef }
            goto L_0x0111
        L_0x00e2:
            int r7 = r4.f80066e     // Catch:{ all -> 0x01ef }
            if (r7 <= 0) goto L_0x010f
            int r7 = r4.f80066e     // Catch:{ all -> 0x01ef }
            double r9 = (double) r7
            java.lang.Double.isNaN(r9)
            double r5 = r5 * r9
            int r7 = r4.f80066e     // Catch:{ all -> 0x01ef }
            double r9 = (double) r7
            java.lang.Double.isNaN(r9)
            r7 = 0
            double r9 = r9 + r2
            double r5 = r5 / r9
            double r2 = r2 - r5
            double r9 = r4.f80065d     // Catch:{ all -> 0x01ef }
            double r9 = java.lang.Math.log(r9)     // Catch:{ all -> 0x01ef }
            double r5 = r5 * r9
            double r0 = java.lang.Math.log(r0)     // Catch:{ all -> 0x01ef }
            double r2 = r2 * r0
            r0 = 0
            double r5 = r5 + r2
            double r0 = java.lang.Math.exp(r5)     // Catch:{ all -> 0x01ef }
            r4.f80065d = r0     // Catch:{ all -> 0x01ef }
            goto L_0x0111
        L_0x010f:
            r4.f80065d = r0     // Catch:{ all -> 0x01ef }
        L_0x0111:
            int r0 = r4.f80066e     // Catch:{ all -> 0x01ef }
            int r0 = r0 + r14
            r4.f80066e = r0     // Catch:{ all -> 0x01ef }
        L_0x0116:
            boolean r0 = r8.f80046c     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01d2
            int r0 = r8.g     // Catch:{ all -> 0x01ef }
            int r0 = r0 + r14
            r8.g = r0     // Catch:{ all -> 0x01ef }
            com.toutiao.proxyserver.e.b r0 = r24.a()     // Catch:{ all -> 0x01ef }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r1 = r8.f80048e     // Catch:{ all -> 0x01ef }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01ef }
            if (r0 == r1) goto L_0x012f
            r8.f80046c = r13     // Catch:{ all -> 0x01ef }
            r8.g = r14     // Catch:{ all -> 0x01ef }
        L_0x012f:
            int r0 = r8.g     // Catch:{ all -> 0x01ef }
            double r0 = (double) r0     // Catch:{ all -> 0x01ef }
            r2 = 4617315517961601024(0x4014000000000000, double:5.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L_0x01d0
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r3 = f80044a     // Catch:{ all -> 0x01ef }
            r4 = 0
            r5 = 91841(0x166c1, float:1.28697E-40)
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x01ef }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01ef }
            r2 = r24
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x0165
            java.lang.Object[] r1 = new java.lang.Object[r13]     // Catch:{ all -> 0x01ef }
            com.meituan.robust.ChangeQuickRedirect r3 = f80044a     // Catch:{ all -> 0x01ef }
            r4 = 0
            r5 = 91841(0x166c1, float:1.28697E-40)
            java.lang.Class[] r6 = new java.lang.Class[r13]     // Catch:{ all -> 0x01ef }
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch:{ all -> 0x01ef }
            r2 = r24
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x01ef }
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch:{ all -> 0x01ef }
            boolean r0 = r0.booleanValue()     // Catch:{ all -> 0x01ef }
            goto L_0x01bc
        L_0x0165:
            com.toutiao.proxyserver.e.e r0 = r8.f80045b     // Catch:{ all -> 0x01ef }
            if (r0 == 0) goto L_0x01bb
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r0 = r8.f80047d     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ef }
            com.toutiao.proxyserver.e.b r0 = (com.toutiao.proxyserver.e.b) r0     // Catch:{ all -> 0x01ef }
            int[] r1 = com.toutiao.proxyserver.e.a.AnonymousClass1.f80050a     // Catch:{ all -> 0x01ef }
            int r0 = r0.ordinal()     // Catch:{ all -> 0x01ef }
            r0 = r1[r0]     // Catch:{ all -> 0x01ef }
            r1 = 4656510908468559872(0x409f400000000000, double:2000.0)
            r3 = 4648049066981195776(0x4081300000000000, double:550.0)
            r5 = 4639481672377565184(0x4062c00000000000, double:150.0)
            switch(r0) {
                case 1: goto L_0x019b;
                case 2: goto L_0x0199;
                case 3: goto L_0x0193;
                case 4: goto L_0x018d;
                default: goto L_0x018b;
            }     // Catch:{ all -> 0x01ef }
        L_0x018b:
            r0 = 1
            goto L_0x01bc
        L_0x018d:
            r3 = 5183643170566569984(0x47efffffe0000000, double:3.4028234663852886E38)
            goto L_0x019e
        L_0x0193:
            r22 = r1
            r1 = r3
            r3 = r22
            goto L_0x019e
        L_0x0199:
            r1 = r5
            goto L_0x019e
        L_0x019b:
            r1 = 0
            r3 = r5
        L_0x019e:
            com.toutiao.proxyserver.e.e r0 = r8.f80045b     // Catch:{ all -> 0x01ef }
            double r5 = r0.f80065d     // Catch:{ all -> 0x01ef }
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01af
            r0 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r3 = r3 * r0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x01bb
            goto L_0x018b
        L_0x01af:
            r3 = 4605380978949069210(0x3fe999999999999a, double:0.8)
            double r1 = r1 * r3
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x01bb
            goto L_0x018b
        L_0x01bb:
            r0 = 0
        L_0x01bc:
            if (r0 == 0) goto L_0x01d0
            r8.f80046c = r13     // Catch:{ all -> 0x01ef }
            r8.g = r14     // Catch:{ all -> 0x01ef }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r0 = r8.f80047d     // Catch:{ all -> 0x01ef }
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r1 = r8.f80048e     // Catch:{ all -> 0x01ef }
            java.lang.Object r1 = r1.get()     // Catch:{ all -> 0x01ef }
            r0.set(r1)     // Catch:{ all -> 0x01ef }
            r24.b()     // Catch:{ all -> 0x01ef }
        L_0x01d0:
            monitor-exit(r24)
            return
        L_0x01d2:
            java.util.concurrent.atomic.AtomicReference<com.toutiao.proxyserver.e.b> r0 = r8.f80047d     // Catch:{ all -> 0x01ef }
            java.lang.Object r0 = r0.get()     // Catch:{ all -> 0x01ef }
            com.toutiao.proxyserver.e.b r1 = r24.a()     // Catch:{ all -> 0x01ef }
            if (r0 == r1) goto L_0x01eb
            r8.f80046c = r14     // Catch:{ all -> 0x01ef }
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference     // Catch:{ all -> 0x01ef }
            com.toutiao.proxyserver.e.b r1 = r24.a()     // Catch:{ all -> 0x01ef }
            r0.<init>(r1)     // Catch:{ all -> 0x01ef }
            r8.f80048e = r0     // Catch:{ all -> 0x01ef }
        L_0x01eb:
            monitor-exit(r24)
            return
        L_0x01ed:
            monitor-exit(r24)
            return
        L_0x01ef:
            r0 = move-exception
            monitor-exit(r24)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.e.a.a(long, long):void");
    }
}
