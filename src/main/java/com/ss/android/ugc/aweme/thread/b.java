package com.ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class b implements Comparable, Runnable {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4176a;

    /* renamed from: b  reason: collision with root package name */
    public Runnable f4177b;

    /* renamed from: c  reason: collision with root package name */
    public a f4178c;

    /* renamed from: d  reason: collision with root package name */
    public long f4179d = SystemClock.uptimeMillis();

    /* renamed from: e  reason: collision with root package name */
    public Thread f4180e;

    public int hashCode() {
        if (!PatchProxy.isSupport(new Object[0], this, f4176a, false, 86863, new Class[0], Integer.TYPE)) {
            return this.f4177b.hashCode();
        }
        return ((Integer) PatchProxy.accessDispatch(new Object[0], this, f4176a, false, 86863, new Class[0], Integer.TYPE)).intValue();
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x01ba A[Catch:{ all -> 0x00a9, all -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x01bb A[Catch:{ all -> 0x00a9, all -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0217 A[Catch:{ all -> 0x00a9, all -> 0x0275 }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0257 A[Catch:{ all -> 0x00a9, all -> 0x0275 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r27 = this;
            r8 = r27
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f4176a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 86861(0x1534d, float:1.21718E-40)
            r2 = r27
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0029
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f4176a
            r4 = 0
            r5 = 86861(0x1534d, float:1.21718E-40)
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r27
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0029:
            long r1 = android.os.SystemClock.uptimeMillis()
            java.lang.Thread r3 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0275 }
            r8.f4180e = r3     // Catch:{ all -> 0x0275 }
            r3 = 0
            java.lang.Runnable r4 = r8.f4177b     // Catch:{ all -> 0x0275 }
            boolean r4 = com.ss.android.ugc.aweme.thread.q.b(r4)     // Catch:{ all -> 0x0275 }
            if (r4 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.thread.c r4 = com.ss.android.ugc.aweme.thread.h.b()     // Catch:{ all -> 0x0275 }
            boolean r4 = r4.b()     // Catch:{ all -> 0x0275 }
            if (r4 != 0) goto L_0x0050
            com.ss.android.ugc.aweme.thread.c r4 = com.ss.android.ugc.aweme.thread.h.b()     // Catch:{ all -> 0x0275 }
            boolean r4 = r4.c()     // Catch:{ all -> 0x0275 }
            if (r4 == 0) goto L_0x0058
        L_0x0050:
            java.lang.Runnable r3 = r8.f4177b     // Catch:{ all -> 0x0275 }
            java.lang.Object r3 = com.ss.android.ugc.aweme.thread.q.c(r3)     // Catch:{ all -> 0x0275 }
            java.util.concurrent.Callable r3 = (java.util.concurrent.Callable) r3     // Catch:{ all -> 0x0275 }
        L_0x0058:
            com.ss.android.ugc.aweme.thread.g r4 = com.ss.android.ugc.aweme.thread.g.a()     // Catch:{ all -> 0x0275 }
            r5 = 1
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0275 }
            r9[r0] = r8     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r12 = 0
            r13 = 86883(0x15363, float:1.21749E-40)
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0275 }
            java.lang.Class<com.ss.android.ugc.aweme.thread.b> r6 = com.ss.android.ugc.aweme.thread.b.class
            r14[r0] = r6     // Catch:{ all -> 0x0275 }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r10 = r4
            boolean r6 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            if (r6 == 0) goto L_0x008d
            java.lang.Object[] r9 = new java.lang.Object[r5]     // Catch:{ all -> 0x0275 }
            r9[r0] = r8     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r12 = 0
            r13 = 86883(0x15363, float:1.21749E-40)
            java.lang.Class[] r14 = new java.lang.Class[r5]     // Catch:{ all -> 0x0275 }
            java.lang.Class<com.ss.android.ugc.aweme.thread.b> r6 = com.ss.android.ugc.aweme.thread.b.class
            r14[r0] = r6     // Catch:{ all -> 0x0275 }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r10 = r4
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            goto L_0x00b0
        L_0x008d:
            com.ss.android.ugc.aweme.thread.c r6 = com.ss.android.ugc.aweme.thread.h.b()     // Catch:{ all -> 0x0275 }
            boolean r6 = r6.d()     // Catch:{ all -> 0x0275 }
            if (r6 == 0) goto L_0x00b0
            java.util.concurrent.locks.ReentrantLock r6 = r4.f4201e     // Catch:{ all -> 0x0275 }
            r6.lock()     // Catch:{ all -> 0x0275 }
            java.util.Map<com.ss.android.ugc.aweme.thread.b, java.lang.Object> r6 = r4.f4200d     // Catch:{ all -> 0x00a9 }
            java.lang.Object r7 = r4.f4199c     // Catch:{ all -> 0x00a9 }
            r6.put(r8, r7)     // Catch:{ all -> 0x00a9 }
            java.util.concurrent.locks.ReentrantLock r4 = r4.f4201e     // Catch:{ all -> 0x0275 }
            r4.unlock()     // Catch:{ all -> 0x0275 }
            goto L_0x00b0
        L_0x00a9:
            r0 = move-exception
            java.util.concurrent.locks.ReentrantLock r1 = r4.f4201e     // Catch:{ all -> 0x0275 }
            r1.unlock()     // Catch:{ all -> 0x0275 }
            throw r0     // Catch:{ all -> 0x0275 }
        L_0x00b0:
            long r6 = r8.f4179d     // Catch:{ all -> 0x0275 }
            r4 = 0
            long r6 = r1 - r6
            com.ss.android.ugc.aweme.thread.i r4 = com.ss.android.ugc.aweme.thread.h.a()     // Catch:{ all -> 0x0275 }
            long r9 = r4.f4232e     // Catch:{ all -> 0x0275 }
            r4 = 4
            r17 = 3
            r18 = 2
            r15 = 5
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 < 0) goto L_0x0193
            com.ss.android.ugc.aweme.thread.c r9 = com.ss.android.ugc.aweme.thread.h.b()     // Catch:{ all -> 0x0275 }
            boolean r9 = r9.b()     // Catch:{ all -> 0x0275 }
            if (r9 == 0) goto L_0x0193
            com.ss.android.ugc.aweme.thread.g r10 = com.ss.android.ugc.aweme.thread.g.a()     // Catch:{ all -> 0x0275 }
            if (r3 == 0) goto L_0x00d7
            r9 = r3
            goto L_0x00d9
        L_0x00d7:
            java.lang.Runnable r9 = r8.f4177b     // Catch:{ all -> 0x0275 }
        L_0x00d9:
            com.ss.android.ugc.aweme.thread.a r11 = r8.f4178c     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.p r11 = r11.f4175b     // Catch:{ all -> 0x0275 }
            java.lang.String r12 = r11.name()     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.a r11 = r8.f4178c     // Catch:{ all -> 0x0275 }
            int r13 = r11.getPoolSize()     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.a r11 = r8.f4178c     // Catch:{ all -> 0x0275 }
            java.util.concurrent.BlockingQueue r11 = r11.getQueue()     // Catch:{ all -> 0x0275 }
            int r14 = r11.size()     // Catch:{ all -> 0x0275 }
            java.lang.Object[] r11 = new java.lang.Object[r15]     // Catch:{ all -> 0x0275 }
            r11[r0] = r9     // Catch:{ all -> 0x0275 }
            r11[r5] = r12     // Catch:{ all -> 0x0275 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0275 }
            r11[r18] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Integer r16 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0275 }
            r11[r17] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Long r5 = new java.lang.Long     // Catch:{ all -> 0x0275 }
            r5.<init>(r6)     // Catch:{ all -> 0x0275 }
            r11[r4] = r5     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r22 = 0
            r23 = 86879(0x1535f, float:1.21743E-40)
            java.lang.Class[] r5 = new java.lang.Class[r15]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Object> r16 = java.lang.Object.class
            r5[r0] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.String> r16 = java.lang.String.class
            r19 = 1
            r5[r19] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r5[r18] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Class r16 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r5[r17] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Class r16 = java.lang.Long.TYPE     // Catch:{ all -> 0x0275 }
            r5[r4] = r16     // Catch:{ all -> 0x0275 }
            java.lang.Class r25 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r19 = r11
            r20 = r10
            r24 = r5
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0275 }
            if (r5 == 0) goto L_0x017b
            java.lang.Object[] r5 = new java.lang.Object[r15]     // Catch:{ all -> 0x0275 }
            r5[r0] = r9     // Catch:{ all -> 0x0275 }
            r9 = 1
            r5[r9] = r12     // Catch:{ all -> 0x0275 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)     // Catch:{ all -> 0x0275 }
            r5[r18] = r9     // Catch:{ all -> 0x0275 }
            java.lang.Integer r9 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x0275 }
            r5[r17] = r9     // Catch:{ all -> 0x0275 }
            java.lang.Long r9 = new java.lang.Long     // Catch:{ all -> 0x0275 }
            r9.<init>(r6)     // Catch:{ all -> 0x0275 }
            r5[r4] = r9     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r21 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r22 = 0
            r23 = 86879(0x1535f, float:1.21743E-40)
            java.lang.Class[] r6 = new java.lang.Class[r15]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Object> r7 = java.lang.Object.class
            r6[r0] = r7     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.String> r7 = java.lang.String.class
            r9 = 1
            r6[r9] = r7     // Catch:{ all -> 0x0275 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r6[r18] = r7     // Catch:{ all -> 0x0275 }
            java.lang.Class r7 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r6[r17] = r7     // Catch:{ all -> 0x0275 }
            java.lang.Class r7 = java.lang.Long.TYPE     // Catch:{ all -> 0x0275 }
            r6[r4] = r7     // Catch:{ all -> 0x0275 }
            java.lang.Class r25 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r19 = r5
            r20 = r10
            r24 = r6
            com.meituan.robust.PatchProxy.accessDispatch(r19, r20, r21, r22, r23, r24, r25)     // Catch:{ all -> 0x0275 }
            goto L_0x0193
        L_0x017b:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0275 }
            r11.<init>(r9)     // Catch:{ all -> 0x0275 }
            java.util.concurrent.ExecutorService r5 = com.ss.android.ugc.aweme.thread.g.f4198b     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.g$1 r9 = new com.ss.android.ugc.aweme.thread.g$1     // Catch:{ all -> 0x0275 }
            r26 = r9
            r9 = r26
            r4 = 5
            r15 = r6
            r9.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            r6 = r26
            r5.execute(r6)     // Catch:{ all -> 0x0275 }
            goto L_0x0194
        L_0x0193:
            r4 = 5
        L_0x0194:
            java.lang.Runnable r5 = r8.f4177b     // Catch:{ all -> 0x0275 }
            r5.run()     // Catch:{ all -> 0x0275 }
            long r5 = android.os.SystemClock.uptimeMillis()     // Catch:{ all -> 0x0275 }
            r7 = 0
            long r1 = r5 - r1
            com.ss.android.ugc.aweme.thread.i r5 = com.ss.android.ugc.aweme.thread.h.a()     // Catch:{ all -> 0x0275 }
            long r5 = r5.f4233f     // Catch:{ all -> 0x0275 }
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 < 0) goto L_0x026d
            com.ss.android.ugc.aweme.thread.c r5 = com.ss.android.ugc.aweme.thread.h.b()     // Catch:{ all -> 0x0275 }
            boolean r5 = r5.c()     // Catch:{ all -> 0x0275 }
            if (r5 == 0) goto L_0x026d
            com.ss.android.ugc.aweme.thread.g r5 = com.ss.android.ugc.aweme.thread.g.a()     // Catch:{ all -> 0x0275 }
            if (r3 == 0) goto L_0x01bb
            goto L_0x01bd
        L_0x01bb:
            java.lang.Runnable r3 = r8.f4177b     // Catch:{ all -> 0x0275 }
        L_0x01bd:
            com.ss.android.ugc.aweme.thread.a r6 = r8.f4178c     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.p r6 = r6.f4175b     // Catch:{ all -> 0x0275 }
            java.lang.String r6 = r6.name()     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.a r7 = r8.f4178c     // Catch:{ all -> 0x0275 }
            int r7 = r7.getPoolSize()     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.a r9 = r8.f4178c     // Catch:{ all -> 0x0275 }
            java.util.concurrent.BlockingQueue r9 = r9.getQueue()     // Catch:{ all -> 0x0275 }
            int r16 = r9.size()     // Catch:{ all -> 0x0275 }
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0275 }
            r9[r0] = r3     // Catch:{ all -> 0x0275 }
            r10 = 1
            r9[r10] = r6     // Catch:{ all -> 0x0275 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0275 }
            r9[r18] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0275 }
            r9[r17] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Long r10 = new java.lang.Long     // Catch:{ all -> 0x0275 }
            r10.<init>(r1)     // Catch:{ all -> 0x0275 }
            r11 = 4
            r9[r11] = r10     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r12 = 0
            r13 = 86880(0x15360, float:1.21745E-40)
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Object> r10 = java.lang.Object.class
            r14[r0] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r15 = 1
            r14[r15] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r14[r18] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Class r10 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r14[r17] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Class r10 = java.lang.Long.TYPE     // Catch:{ all -> 0x0275 }
            r15 = 4
            r14[r15] = r10     // Catch:{ all -> 0x0275 }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r10 = r5
            boolean r9 = com.meituan.robust.PatchProxy.isSupport(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            if (r9 == 0) goto L_0x0257
            java.lang.Object[] r9 = new java.lang.Object[r4]     // Catch:{ all -> 0x0275 }
            r9[r0] = r3     // Catch:{ all -> 0x0275 }
            r3 = 1
            r9[r3] = r6     // Catch:{ all -> 0x0275 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r7)     // Catch:{ all -> 0x0275 }
            r9[r18] = r3     // Catch:{ all -> 0x0275 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)     // Catch:{ all -> 0x0275 }
            r9[r17] = r3     // Catch:{ all -> 0x0275 }
            java.lang.Long r3 = new java.lang.Long     // Catch:{ all -> 0x0275 }
            r3.<init>(r1)     // Catch:{ all -> 0x0275 }
            r1 = 4
            r9[r1] = r3     // Catch:{ all -> 0x0275 }
            com.meituan.robust.ChangeQuickRedirect r11 = com.ss.android.ugc.aweme.thread.g.f4197a     // Catch:{ all -> 0x0275 }
            r12 = 0
            r13 = 86880(0x15360, float:1.21745E-40)
            java.lang.Class[] r14 = new java.lang.Class[r4]     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.Object> r1 = java.lang.Object.class
            r14[r0] = r1     // Catch:{ all -> 0x0275 }
            java.lang.Class<java.lang.String> r0 = java.lang.String.class
            r1 = 1
            r14[r1] = r0     // Catch:{ all -> 0x0275 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r14[r18] = r0     // Catch:{ all -> 0x0275 }
            java.lang.Class r0 = java.lang.Integer.TYPE     // Catch:{ all -> 0x0275 }
            r14[r17] = r0     // Catch:{ all -> 0x0275 }
            java.lang.Class r0 = java.lang.Long.TYPE     // Catch:{ all -> 0x0275 }
            r1 = 4
            r14[r1] = r0     // Catch:{ all -> 0x0275 }
            java.lang.Class r15 = java.lang.Void.TYPE     // Catch:{ all -> 0x0275 }
            r10 = r5
            com.meituan.robust.PatchProxy.accessDispatch(r9, r10, r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            goto L_0x026d
        L_0x0257:
            java.lang.ref.WeakReference r11 = new java.lang.ref.WeakReference     // Catch:{ all -> 0x0275 }
            r11.<init>(r3)     // Catch:{ all -> 0x0275 }
            java.util.concurrent.ExecutorService r0 = com.ss.android.ugc.aweme.thread.g.f4198b     // Catch:{ all -> 0x0275 }
            com.ss.android.ugc.aweme.thread.g$2 r3 = new com.ss.android.ugc.aweme.thread.g$2     // Catch:{ all -> 0x0275 }
            r9 = r3
            r10 = r5
            r12 = r6
            r13 = r7
            r14 = r16
            r15 = r1
            r9.<init>(r11, r12, r13, r14, r15)     // Catch:{ all -> 0x0275 }
            r0.execute(r3)     // Catch:{ all -> 0x0275 }
        L_0x026d:
            com.ss.android.ugc.aweme.thread.g r0 = com.ss.android.ugc.aweme.thread.g.a()
            r0.a(r8)
            return
        L_0x0275:
            r0 = move-exception
            com.ss.android.ugc.aweme.thread.g r1 = com.ss.android.ugc.aweme.thread.g.a()
            r1.a(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.thread.b.run():void");
    }

    public int compareTo(Object obj) {
        if (PatchProxy.isSupport(new Object[]{obj}, this, f4176a, false, 86862, new Class[]{Object.class}, Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[]{obj}, this, f4176a, false, 86862, new Class[]{Object.class}, Integer.TYPE)).intValue();
        } else if (!(this.f4177b instanceof Comparable) || !(obj instanceof b)) {
            return 0;
        } else {
            return ((Comparable) this.f4177b).compareTo(((b) obj).f4177b);
        }
    }

    public boolean equals(Object obj) {
        Object obj2 = obj;
        if (PatchProxy.isSupport(new Object[]{obj2}, this, f4176a, false, 86864, new Class[]{Object.class}, Boolean.TYPE)) {
            return ((Boolean) PatchProxy.accessDispatch(new Object[]{obj2}, this, f4176a, false, 86864, new Class[]{Object.class}, Boolean.TYPE)).booleanValue();
        }
        if (obj2 instanceof b) {
            if (this.f4177b.equals(((b) obj2).f4177b)) {
                return true;
            }
        }
        return false;
    }

    b(Runnable runnable, a aVar) {
        this.f4177b = runnable;
        this.f4178c = aVar;
    }
}
