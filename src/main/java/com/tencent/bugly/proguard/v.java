package com.tencent.bugly.proguard;

import android.content.Context;
import com.tencent.bugly.crashreport.common.info.a;
import java.util.Map;
import java.util.UUID;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private int f79531a;

    /* renamed from: b  reason: collision with root package name */
    private int f79532b;

    /* renamed from: c  reason: collision with root package name */
    private final Context f79533c;

    /* renamed from: d  reason: collision with root package name */
    private final int f79534d;

    /* renamed from: e  reason: collision with root package name */
    private final byte[] f79535e;

    /* renamed from: f  reason: collision with root package name */
    private final a f79536f;
    private final com.tencent.bugly.crashreport.common.strategy.a g;
    private final s h;
    private final u i;
    private final int j;
    private final t k;
    private final t l;
    private String m;
    private final String n;
    private final Map<String, String> o;
    private int p;
    private long q;
    private long r;
    private boolean s;
    private boolean t;

    /* JADX WARNING: Code restructure failed: missing block: B:100:0x0335, code lost:
        a(null, false, 1, "status of server is ".concat(java.lang.String.valueOf(r13)), r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x0348, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x0349, code lost:
        r10 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x02c5, code lost:
        if (r13 == 0) goto L_0x0349;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x02c7, code lost:
        if (r13 != 2) goto L_0x0335;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x02d3, code lost:
        if ((r7.q + r7.r) <= 0) goto L_0x02ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x02d5, code lost:
        r7.i.a((r7.i.a(r7.t) + r7.q) + r7.r, r7.t);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x02ec, code lost:
        r7.i.a(r13, (com.tencent.bugly.proguard.an) null);
        com.tencent.bugly.proguard.x.a("[Upload] Session ID is invalid, will try again immediately (pid=%d | tid=%d).", java.lang.Integer.valueOf(android.os.Process.myPid()), java.lang.Integer.valueOf(android.os.Process.myTid()));
        r7.i.a(r7.j, r7.f79534d, r7.f79535e, r7.m, r7.n, r7.k, r7.f79531a, r7.f79532b, true, r7.o);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0334, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0230 A[Catch:{ Throwable -> 0x034b, Throwable -> 0x0463 }] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x0298  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r24 = this;
            r7 = r24
            r0 = 0
            r7.p = r0     // Catch:{ Throwable -> 0x0463 }
            r1 = 0
            r7.q = r1     // Catch:{ Throwable -> 0x0463 }
            r7.r = r1     // Catch:{ Throwable -> 0x0463 }
            byte[] r3 = r7.f79535e     // Catch:{ Throwable -> 0x0463 }
            android.content.Context r4 = r7.f79533c     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r4 = com.tencent.bugly.crashreport.common.info.b.f(r4)     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x0021
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "network is not available"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0021:
            if (r3 == 0) goto L_0x0457
            int r4 = r3.length     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x0028
            goto L_0x0457
        L_0x0028:
            com.tencent.bugly.proguard.u r4 = r7.i     // Catch:{ Throwable -> 0x0463 }
            boolean r5 = r7.t     // Catch:{ Throwable -> 0x0463 }
            long r4 = r4.a((boolean) r5)     // Catch:{ Throwable -> 0x0463 }
            int r6 = r3.length     // Catch:{ Throwable -> 0x0463 }
            long r8 = (long) r6     // Catch:{ Throwable -> 0x0463 }
            long r8 = r8 + r4
            r10 = 2097152(0x200000, double:1.0361308E-317)
            r6 = 2
            r12 = 1
            int r13 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r13 < 0) goto L_0x0069
            java.lang.String r1 = "[Upload] Upload too much data, try next time: %d/%d"
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Long r3 = java.lang.Long.valueOf(r4)     // Catch:{ Throwable -> 0x0463 }
            r2[r0] = r3     // Catch:{ Throwable -> 0x0463 }
            java.lang.Long r0 = java.lang.Long.valueOf(r10)     // Catch:{ Throwable -> 0x0463 }
            r2[r12] = r0     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.e(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = "over net consume: 2048"
            r0.<init>(r1)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = "K"
            r0.append(r1)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r5 = r0.toString()     // Catch:{ Throwable -> 0x0463 }
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0069:
            java.lang.String r4 = "[Upload] Run upload task with cmd: %d"
            java.lang.Object[] r5 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            int r8 = r7.f79534d     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ Throwable -> 0x0463 }
            r5[r0] = r8     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r4, r5)     // Catch:{ Throwable -> 0x0463 }
            android.content.Context r4 = r7.f79533c     // Catch:{ Throwable -> 0x0463 }
            if (r4 == 0) goto L_0x044b
            com.tencent.bugly.crashreport.common.info.a r4 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            if (r4 == 0) goto L_0x044b
            com.tencent.bugly.crashreport.common.strategy.a r4 = r7.g     // Catch:{ Throwable -> 0x0463 }
            if (r4 == 0) goto L_0x044b
            com.tencent.bugly.proguard.s r4 = r7.h     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x008a
            goto L_0x044b
        L_0x008a:
            com.tencent.bugly.crashreport.common.strategy.a r4 = r7.g     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.crashreport.common.strategy.StrategyBean r4 = r4.c()     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x009e
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "illegal local strategy"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x009e:
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ Throwable -> 0x0463 }
            r5.<init>()     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "prodId"
            com.tencent.bugly.crashreport.common.info.a r9 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = r9.f()     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "bundleId"
            com.tencent.bugly.crashreport.common.info.a r9 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = r9.f79276c     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "appVer"
            com.tencent.bugly.crashreport.common.info.a r9 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = r9.j     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.o     // Catch:{ Throwable -> 0x0463 }
            if (r8 == 0) goto L_0x00c9
            java.util.Map<java.lang.String, java.lang.String> r8 = r7.o     // Catch:{ Throwable -> 0x0463 }
            r5.putAll(r8)     // Catch:{ Throwable -> 0x0463 }
        L_0x00c9:
            boolean r8 = r7.s     // Catch:{ Throwable -> 0x0463 }
            if (r8 == 0) goto L_0x0132
            java.lang.String r8 = "cmd"
            int r9 = r7.f79534d     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = java.lang.Integer.toString(r9)     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "platformId"
            java.lang.String r9 = java.lang.Byte.toString(r12)     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "sdkVer"
            com.tencent.bugly.crashreport.common.info.a r9 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            r9.getClass()     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = "2.6.6"
            r5.put(r8, r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r8 = "strategylastUpdateTime"
            long r9 = r4.p     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r4 = java.lang.Long.toString(r9)     // Catch:{ Throwable -> 0x0463 }
            r5.put(r8, r4)     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.u r4 = r7.i     // Catch:{ Throwable -> 0x0463 }
            boolean r4 = r4.a((java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x010c
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "failed to add security info to HTTP headers"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x010c:
            byte[] r3 = com.tencent.bugly.proguard.z.a((byte[]) r3, (int) r6)     // Catch:{ Throwable -> 0x0463 }
            if (r3 != 0) goto L_0x011e
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "failed to zip request body"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x011e:
            com.tencent.bugly.proguard.u r4 = r7.i     // Catch:{ Throwable -> 0x0463 }
            byte[] r3 = r4.a((byte[]) r3)     // Catch:{ Throwable -> 0x0463 }
            if (r3 != 0) goto L_0x0132
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "failed to encrypt request body"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0132:
            com.tencent.bugly.proguard.u r4 = r7.i     // Catch:{ Throwable -> 0x0463 }
            int r8 = r7.j     // Catch:{ Throwable -> 0x0463 }
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0463 }
            r4.a((int) r8, (long) r9)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r4 = r7.m     // Catch:{ Throwable -> 0x0463 }
            r8 = -1
            r9 = r4
            r4 = 0
            r8 = 0
            r10 = -1
        L_0x0144:
            int r11 = r4 + 1
            int r13 = r7.f79531a     // Catch:{ Throwable -> 0x0463 }
            if (r4 >= r13) goto L_0x043f
            if (r11 <= r12) goto L_0x0170
            java.lang.String r4 = "[Upload] Failed to upload last time, wait and try(%d) again."
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r11)     // Catch:{ Throwable -> 0x0463 }
            r8[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.d(r4, r8)     // Catch:{ Throwable -> 0x0463 }
            int r4 = r7.f79532b     // Catch:{ Throwable -> 0x0463 }
            long r13 = (long) r4     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.z.b((long) r13)     // Catch:{ Throwable -> 0x0463 }
            int r4 = r7.f79531a     // Catch:{ Throwable -> 0x0463 }
            if (r11 != r4) goto L_0x0170
            java.lang.String r4 = "[Upload] Use the back-up url at the last time: %s"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = r7.n     // Catch:{ Throwable -> 0x0463 }
            r8[r0] = r9     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.d(r4, r8)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r9 = r7.n     // Catch:{ Throwable -> 0x0463 }
        L_0x0170:
            java.lang.String r4 = "[Upload] Send %d bytes"
            java.lang.Object[] r8 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            int r13 = r3.length     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0463 }
            r8[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r4, r8)     // Catch:{ Throwable -> 0x0463 }
            boolean r4 = r7.s     // Catch:{ Throwable -> 0x0463 }
            if (r4 == 0) goto L_0x0187
            java.lang.String r4 = a((java.lang.String) r9)     // Catch:{ Throwable -> 0x0463 }
            r9 = r4
        L_0x0187:
            java.lang.String r4 = "[Upload] Upload to %s with cmd %d (pid=%d | tid=%d)."
            r8 = 4
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ Throwable -> 0x0463 }
            r8[r0] = r9     // Catch:{ Throwable -> 0x0463 }
            int r13 = r7.f79534d     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0463 }
            r8[r12] = r13     // Catch:{ Throwable -> 0x0463 }
            int r13 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0463 }
            r8[r6] = r13     // Catch:{ Throwable -> 0x0463 }
            int r13 = android.os.Process.myTid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x0463 }
            r14 = 3
            r8[r14] = r13     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r4, r8)     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.s r4 = r7.h     // Catch:{ Throwable -> 0x0463 }
            byte[] r4 = r4.a((java.lang.String) r9, (byte[]) r3, (com.tencent.bugly.proguard.v) r7, (java.util.Map<java.lang.String, java.lang.String>) r5)     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x01cb
            java.lang.String r4 = "Failed to upload for no response!"
            java.lang.String r8 = "[Upload] Failed to upload(%d): %s"
            java.lang.Object[] r13 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r14 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x0463 }
            r13[r0] = r14     // Catch:{ Throwable -> 0x0463 }
            r13[r12] = r4     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.e(r8, r13)     // Catch:{ Throwable -> 0x0463 }
            r4 = r11
        L_0x01c8:
            r8 = 1
            goto L_0x0144
        L_0x01cb:
            com.tencent.bugly.proguard.s r8 = r7.h     // Catch:{ Throwable -> 0x0463 }
            java.util.Map<java.lang.String, java.lang.String> r8 = r8.f79515a     // Catch:{ Throwable -> 0x0463 }
            boolean r13 = r7.s     // Catch:{ Throwable -> 0x0463 }
            if (r13 == 0) goto L_0x0376
            if (r8 == 0) goto L_0x0226
            int r13 = r8.size()     // Catch:{ Throwable -> 0x0463 }
            if (r13 != 0) goto L_0x01dc
            goto L_0x0226
        L_0x01dc:
            java.lang.String r13 = "status"
            boolean r13 = r8.containsKey(r13)     // Catch:{ Throwable -> 0x0463 }
            if (r13 != 0) goto L_0x01f0
            java.lang.String r13 = "[Upload] Headers does not contain %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r16 = "status"
            r15[r0] = r16     // Catch:{ Throwable -> 0x0463 }
        L_0x01ec:
            com.tencent.bugly.proguard.x.d(r13, r15)     // Catch:{ Throwable -> 0x0463 }
            goto L_0x022d
        L_0x01f0:
            java.lang.String r13 = "Bugly-Version"
            boolean r13 = r8.containsKey(r13)     // Catch:{ Throwable -> 0x0463 }
            if (r13 != 0) goto L_0x0201
            java.lang.String r13 = "[Upload] Headers does not contain %s"
            java.lang.Object[] r15 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r16 = "Bugly-Version"
            r15[r0] = r16     // Catch:{ Throwable -> 0x0463 }
            goto L_0x01ec
        L_0x0201:
            java.lang.String r13 = "Bugly-Version"
            java.lang.Object r13 = r8.get(r13)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r13 = (java.lang.String) r13     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r15 = "bugly"
            boolean r15 = r13.contains(r15)     // Catch:{ Throwable -> 0x0463 }
            if (r15 != 0) goto L_0x021b
            java.lang.String r15 = "[Upload] Bugly version is not valid: %s"
            java.lang.Object[] r1 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            r1[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.d(r15, r1)     // Catch:{ Throwable -> 0x0463 }
            goto L_0x022d
        L_0x021b:
            java.lang.String r1 = "[Upload] Bugly version from headers is: %s"
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            r2[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            r1 = 1
            goto L_0x022e
        L_0x0226:
            java.lang.String r1 = "[Upload] Headers is empty."
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.d(r1, r2)     // Catch:{ Throwable -> 0x0463 }
        L_0x022d:
            r1 = 0
        L_0x022e:
            if (r1 != 0) goto L_0x0298
            java.lang.String r1 = "[Upload] Headers from server is not valid, just try again (pid=%d | tid=%d)."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            int r4 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0463 }
            r2[r0] = r4     // Catch:{ Throwable -> 0x0463 }
            int r4 = android.os.Process.myTid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0463 }
            r2[r12] = r4     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = "[Upload] Failed to upload for no status header."
            java.lang.String r2 = "[Upload] Failed to upload(%d): %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x0463 }
            r4[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            r4[r12] = r1     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.e(r2, r4)     // Catch:{ Throwable -> 0x0463 }
            if (r8 == 0) goto L_0x028c
            java.util.Set r1 = r8.entrySet()     // Catch:{ Throwable -> 0x0463 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0463 }
        L_0x0266:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x0463 }
            if (r2 == 0) goto L_0x028c
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x0463 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r4 = "[key]: %s, [value]: %s"
            java.lang.Object[] r8 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Object r13 = r2.getKey()     // Catch:{ Throwable -> 0x0463 }
            r8[r0] = r13     // Catch:{ Throwable -> 0x0463 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x0463 }
            r8[r12] = r2     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r2 = java.lang.String.format(r4, r8)     // Catch:{ Throwable -> 0x0463 }
            java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r2, r4)     // Catch:{ Throwable -> 0x0463 }
            goto L_0x0266
        L_0x028c:
            java.lang.String r1 = "[Upload] Failed to upload for no status header."
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            r4 = r11
            r1 = 0
            goto L_0x01c8
        L_0x0298:
            java.lang.String r1 = "status"
            java.lang.Object r1 = r8.get(r1)     // Catch:{ Throwable -> 0x034f }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ Throwable -> 0x034f }
            int r13 = java.lang.Integer.parseInt(r1)     // Catch:{ Throwable -> 0x034f }
            java.lang.String r1 = "[Upload] Status from server is %d (pid=%d | tid=%d)."
            java.lang.Object[] r2 = new java.lang.Object[r14]     // Catch:{ Throwable -> 0x034b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r13)     // Catch:{ Throwable -> 0x034b }
            r2[r0] = r10     // Catch:{ Throwable -> 0x034b }
            int r10 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x034b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x034b }
            r2[r12] = r10     // Catch:{ Throwable -> 0x034b }
            int r10 = android.os.Process.myTid()     // Catch:{ Throwable -> 0x034b }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ Throwable -> 0x034b }
            r2[r6] = r10     // Catch:{ Throwable -> 0x034b }
            com.tencent.bugly.proguard.x.c(r1, r2)     // Catch:{ Throwable -> 0x034b }
            if (r13 == 0) goto L_0x0349
            if (r13 != r6) goto L_0x0335
            long r1 = r7.q     // Catch:{ Throwable -> 0x0463 }
            long r3 = r7.r     // Catch:{ Throwable -> 0x0463 }
            r5 = 0
            long r1 = r1 + r3
            r14 = 0
            int r3 = (r1 > r14 ? 1 : (r1 == r14 ? 0 : -1))
            if (r3 <= 0) goto L_0x02ec
            com.tencent.bugly.proguard.u r1 = r7.i     // Catch:{ Throwable -> 0x0463 }
            boolean r2 = r7.t     // Catch:{ Throwable -> 0x0463 }
            long r1 = r1.a((boolean) r2)     // Catch:{ Throwable -> 0x0463 }
            long r3 = r7.q     // Catch:{ Throwable -> 0x0463 }
            r5 = 0
            long r1 = r1 + r3
            long r3 = r7.r     // Catch:{ Throwable -> 0x0463 }
            r5 = 0
            long r1 = r1 + r3
            com.tencent.bugly.proguard.u r3 = r7.i     // Catch:{ Throwable -> 0x0463 }
            boolean r4 = r7.t     // Catch:{ Throwable -> 0x0463 }
            r3.a((long) r1, (boolean) r4)     // Catch:{ Throwable -> 0x0463 }
        L_0x02ec:
            com.tencent.bugly.proguard.u r1 = r7.i     // Catch:{ Throwable -> 0x0463 }
            r2 = 0
            r1.a((int) r13, (com.tencent.bugly.proguard.an) r2)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = "[Upload] Session ID is invalid, will try again immediately (pid=%d | tid=%d)."
            java.lang.Object[] r2 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            int r3 = android.os.Process.myPid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0463 }
            r2[r0] = r3     // Catch:{ Throwable -> 0x0463 }
            int r0 = android.os.Process.myTid()     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0463 }
            r2[r12] = r0     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.a(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.u r13 = r7.i     // Catch:{ Throwable -> 0x0463 }
            int r14 = r7.j     // Catch:{ Throwable -> 0x0463 }
            int r15 = r7.f79534d     // Catch:{ Throwable -> 0x0463 }
            byte[] r0 = r7.f79535e     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = r7.m     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r2 = r7.n     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.t r3 = r7.k     // Catch:{ Throwable -> 0x0463 }
            int r4 = r7.f79531a     // Catch:{ Throwable -> 0x0463 }
            int r5 = r7.f79532b     // Catch:{ Throwable -> 0x0463 }
            r22 = 1
            java.util.Map<java.lang.String, java.lang.String> r6 = r7.o     // Catch:{ Throwable -> 0x0463 }
            r16 = r0
            r17 = r1
            r18 = r2
            r19 = r3
            r20 = r4
            r21 = r5
            r23 = r6
            r13.a(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0335:
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r0 = "status of server is "
            java.lang.String r1 = java.lang.String.valueOf(r13)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r5 = r0.concat(r1)     // Catch:{ Throwable -> 0x0463 }
            r1 = r24
            r6 = r13
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0349:
            r10 = r13
            goto L_0x0376
        L_0x034b:
            r14 = 0
            r10 = r13
            goto L_0x0351
        L_0x034f:
            r14 = 0
        L_0x0351:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r2 = "[Upload] Failed to upload for format of status header is invalid: "
            r1.<init>(r2)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r2 = java.lang.Integer.toString(r10)     // Catch:{ Throwable -> 0x0463 }
            r1.append(r2)     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r1 = r1.toString()     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r2 = "[Upload] Failed to upload(%d): %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r12)     // Catch:{ Throwable -> 0x0463 }
            r4[r0] = r8     // Catch:{ Throwable -> 0x0463 }
            r4[r12] = r1     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.e(r2, r4)     // Catch:{ Throwable -> 0x0463 }
            r4 = r11
            r1 = r14
            goto L_0x01c8
        L_0x0376:
            java.lang.String r1 = "[Upload] Received %d bytes"
            java.lang.Object[] r2 = new java.lang.Object[r12]     // Catch:{ Throwable -> 0x0463 }
            int r3 = r4.length     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch:{ Throwable -> 0x0463 }
            r2[r0] = r3     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r1, r2)     // Catch:{ Throwable -> 0x0463 }
            boolean r1 = r7.s     // Catch:{ Throwable -> 0x0463 }
            if (r1 == 0) goto L_0x03e5
            int r1 = r4.length     // Catch:{ Throwable -> 0x0463 }
            if (r1 != 0) goto L_0x03bf
            java.util.Set r1 = r8.entrySet()     // Catch:{ Throwable -> 0x0463 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ Throwable -> 0x0463 }
        L_0x0393:
            boolean r2 = r1.hasNext()     // Catch:{ Throwable -> 0x0463 }
            if (r2 == 0) goto L_0x03b3
            java.lang.Object r2 = r1.next()     // Catch:{ Throwable -> 0x0463 }
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch:{ Throwable -> 0x0463 }
            java.lang.String r3 = "[Upload] HTTP headers from server: key = %s, value = %s"
            java.lang.Object[] r4 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            java.lang.Object r5 = r2.getKey()     // Catch:{ Throwable -> 0x0463 }
            r4[r0] = r5     // Catch:{ Throwable -> 0x0463 }
            java.lang.Object r2 = r2.getValue()     // Catch:{ Throwable -> 0x0463 }
            r4[r12] = r2     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r3, r4)     // Catch:{ Throwable -> 0x0463 }
            goto L_0x0393
        L_0x03b3:
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "response data from server is empty"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x03bf:
            com.tencent.bugly.proguard.u r1 = r7.i     // Catch:{ Throwable -> 0x0463 }
            byte[] r1 = r1.b((byte[]) r4)     // Catch:{ Throwable -> 0x0463 }
            if (r1 != 0) goto L_0x03d3
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "failed to decrypt response from server"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x03d3:
            byte[] r4 = com.tencent.bugly.proguard.z.b((byte[]) r1, (int) r6)     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x03e5
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "failed unzip(Gzip) response from server"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x03e5:
            boolean r1 = r7.s     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.an r2 = com.tencent.bugly.proguard.a.a((byte[]) r4, (boolean) r1)     // Catch:{ Throwable -> 0x0463 }
            if (r2 != 0) goto L_0x03f9
            r2 = 0
            r3 = 0
            r4 = 1
            java.lang.String r5 = "failed to decode response package"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x03f9:
            boolean r1 = r7.s     // Catch:{ Throwable -> 0x0463 }
            if (r1 == 0) goto L_0x0402
            com.tencent.bugly.proguard.u r1 = r7.i     // Catch:{ Throwable -> 0x0463 }
            r1.a((int) r10, (com.tencent.bugly.proguard.an) r2)     // Catch:{ Throwable -> 0x0463 }
        L_0x0402:
            java.lang.String r1 = "[Upload] Response cmd is: %d, length of sBuffer is: %d"
            java.lang.Object[] r3 = new java.lang.Object[r6]     // Catch:{ Throwable -> 0x0463 }
            int r4 = r2.f79433b     // Catch:{ Throwable -> 0x0463 }
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Throwable -> 0x0463 }
            r3[r0] = r4     // Catch:{ Throwable -> 0x0463 }
            byte[] r4 = r2.f79434c     // Catch:{ Throwable -> 0x0463 }
            if (r4 != 0) goto L_0x0413
            goto L_0x0416
        L_0x0413:
            byte[] r0 = r2.f79434c     // Catch:{ Throwable -> 0x0463 }
            int r0 = r0.length     // Catch:{ Throwable -> 0x0463 }
        L_0x0416:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Throwable -> 0x0463 }
            r3[r12] = r0     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.proguard.x.c(r1, r3)     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.crashreport.common.info.a r0 = r7.f79536f     // Catch:{ Throwable -> 0x0463 }
            com.tencent.bugly.crashreport.common.strategy.a r1 = r7.g     // Catch:{ Throwable -> 0x0463 }
            boolean r0 = a(r2, r0, r1)     // Catch:{ Throwable -> 0x0463 }
            if (r0 != 0) goto L_0x0434
            r3 = 0
            r4 = 2
            java.lang.String r5 = "failed to process response package"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0434:
            r3 = 1
            r4 = 2
            java.lang.String r5 = "successfully uploaded"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x043f:
            r2 = 0
            r3 = 0
            java.lang.String r5 = "failed after many attempts"
            r6 = 0
            r1 = r24
            r4 = r8
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x044b:
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "illegal access error"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0457:
            r2 = 0
            r3 = 0
            r4 = 0
            java.lang.String r5 = "request package is empty!"
            r6 = 0
            r1 = r24
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ Throwable -> 0x0463 }
            return
        L_0x0463:
            r0 = move-exception
            com.tencent.bugly.proguard.x.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.v.run():void");
    }

    public final void b(long j2) {
        this.r += j2;
    }

    public final void a(long j2) {
        this.p++;
        this.q += j2;
    }

    private static String a(String str) {
        if (z.a(str)) {
            return str;
        }
        try {
            return String.format("%s?aid=%s", new Object[]{str, UUID.randomUUID().toString()});
        } catch (Throwable th) {
            x.a(th);
            return str;
        }
    }

    private static boolean a(an anVar, a aVar, com.tencent.bugly.crashreport.common.strategy.a aVar2) {
        if (anVar == null) {
            x.d("resp == null!", new Object[0]);
            return false;
        } else if (anVar.f79432a != 0) {
            x.e("resp result error %d", Byte.valueOf(anVar.f79432a));
            return false;
        } else {
            try {
                if (!z.a(anVar.f79435d) && !a.b().i().equals(anVar.f79435d)) {
                    p.a().a(com.tencent.bugly.crashreport.common.strategy.a.f79288a, "key_ip", anVar.f79435d.getBytes("UTF-8"), (o) null, true);
                    aVar.d(anVar.f79435d);
                }
                if (!z.a(anVar.f79437f) && !a.b().j().equals(anVar.f79437f)) {
                    p.a().a(com.tencent.bugly.crashreport.common.strategy.a.f79288a, "key_imei", anVar.f79437f.getBytes("UTF-8"), (o) null, true);
                    aVar.e(anVar.f79437f);
                }
            } catch (Throwable th) {
                x.a(th);
            }
            aVar.i = anVar.f79436e;
            if (anVar.f79433b == 510) {
                if (anVar.f79434c == null) {
                    x.e("[Upload] Strategy data is null. Response cmd: %d", Integer.valueOf(anVar.f79433b));
                    return false;
                }
                ap apVar = (ap) a.a(anVar.f79434c, ap.class);
                if (apVar == null) {
                    x.e("[Upload] Failed to decode strategy from server. Response cmd: %d", Integer.valueOf(anVar.f79433b));
                    return false;
                }
                aVar2.a(apVar);
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0022  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(com.tencent.bugly.proguard.an r5, boolean r6, int r7, java.lang.String r8, int r9) {
        /*
            r4 = this;
            int r5 = r4.f79534d
            r0 = 630(0x276, float:8.83E-43)
            if (r5 == r0) goto L_0x001c
            r0 = 640(0x280, float:8.97E-43)
            if (r5 == r0) goto L_0x0019
            r0 = 830(0x33e, float:1.163E-42)
            if (r5 == r0) goto L_0x001c
            r0 = 840(0x348, float:1.177E-42)
            if (r5 == r0) goto L_0x0019
            int r5 = r4.f79534d
            java.lang.String r5 = java.lang.String.valueOf(r5)
            goto L_0x001e
        L_0x0019:
            java.lang.String r5 = "userinfo"
            goto L_0x001e
        L_0x001c:
            java.lang.String r5 = "crash"
        L_0x001e:
            r0 = 0
            r1 = 1
            if (r6 == 0) goto L_0x002c
            java.lang.String r7 = "[Upload] Success: %s"
            java.lang.Object[] r8 = new java.lang.Object[r1]
            r8[r0] = r5
            com.tencent.bugly.proguard.x.a(r7, r8)
            goto L_0x0049
        L_0x002c:
            java.lang.String r2 = "[Upload] Failed to upload(%d) %s: %s"
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3[r0] = r7
            r3[r1] = r5
            r5 = 2
            r3[r5] = r8
            com.tencent.bugly.proguard.x.e(r2, r3)
            boolean r5 = r4.s
            if (r5 == 0) goto L_0x0049
            com.tencent.bugly.proguard.u r5 = r4.i
            r7 = 0
            r5.a((int) r9, (com.tencent.bugly.proguard.an) r7)
        L_0x0049:
            long r7 = r4.q
            long r0 = r4.r
            long r7 = r7 + r0
            r0 = 0
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 <= 0) goto L_0x0069
            com.tencent.bugly.proguard.u r5 = r4.i
            boolean r7 = r4.t
            long r7 = r5.a((boolean) r7)
            long r0 = r4.q
            long r7 = r7 + r0
            long r0 = r4.r
            long r7 = r7 + r0
            com.tencent.bugly.proguard.u r5 = r4.i
            boolean r9 = r4.t
            r5.a((long) r7, (boolean) r9)
        L_0x0069:
            com.tencent.bugly.proguard.t r5 = r4.k
            if (r5 == 0) goto L_0x0072
            com.tencent.bugly.proguard.t r5 = r4.k
            r5.a(r6)
        L_0x0072:
            com.tencent.bugly.proguard.t r5 = r4.l
            if (r5 == 0) goto L_0x007b
            com.tencent.bugly.proguard.t r5 = r4.l
            r5.a(r6)
        L_0x007b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.v.a(com.tencent.bugly.proguard.an, boolean, int, java.lang.String, int):void");
    }

    public v(Context context, int i2, int i3, byte[] bArr, String str, String str2, t tVar, boolean z, boolean z2) {
        this(context, i2, i3, bArr, str, str2, tVar, z, 2, 30000, z2, null);
    }

    public v(Context context, int i2, int i3, byte[] bArr, String str, String str2, t tVar, boolean z, int i4, int i5, boolean z2, Map<String, String> map) {
        this.f79531a = 2;
        this.f79532b = 30000;
        this.s = true;
        this.f79533c = context;
        this.f79536f = a.a(context);
        this.f79535e = bArr;
        this.g = com.tencent.bugly.crashreport.common.strategy.a.a();
        this.h = s.a(context);
        this.i = u.a();
        this.j = i2;
        this.m = str;
        this.n = str2;
        this.k = tVar;
        this.l = null;
        this.s = z;
        this.f79534d = i3;
        if (i4 > 0) {
            this.f79531a = i4;
        }
        if (i5 > 0) {
            this.f79532b = i5;
        }
        this.t = z2;
        this.o = map;
    }
}
