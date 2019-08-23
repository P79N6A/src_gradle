package com.ss.android.ugc.aweme.net;

import com.bytedance.frameworks.baselib.network.dispatcher.RequestQueue;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class ag extends RequestQueue {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f56907a;

    /* renamed from: b  reason: collision with root package name */
    private static volatile RequestQueue f56908b;

    private ag() {
        super(0, 0);
    }

    public synchronized void handleExpandDelayDownloadRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60819, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60819, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleExpandDelayRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60818, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60818, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleExpandDownloadRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60817, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60817, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleExpandRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60816, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60816, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleShrinkDelayDownloadRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60823, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60823, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleShrinkDelayRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60822, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60822, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleShrinkDownloadRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60821, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60821, new Class[0], Void.TYPE);
        }
    }

    public synchronized void handleShrinkRequestQueueSize() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60820, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60820, new Class[0], Void.TYPE);
        }
    }

    public synchronized void start() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60814, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60814, new Class[0], Void.TYPE);
        }
    }

    public synchronized void stop() {
        if (PatchProxy.isSupport(new Object[0], this, f56907a, false, 60815, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f56907a, false, 60815, new Class[0], Void.TYPE);
        }
    }

    public static RequestQueue a() {
        if (PatchProxy.isSupport(new Object[0], null, f56907a, true, 60811, new Class[0], RequestQueue.class)) {
            return (RequestQueue) PatchProxy.accessDispatch(new Object[0], null, f56907a, true, 60811, new Class[0], RequestQueue.class);
        }
        if (f56908b == null) {
            synchronized (ag.class) {
                if (f56908b == null) {
                    f56908b = new ag();
                }
            }
        }
        return f56908b;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void add(com.bytedance.frameworks.baselib.network.dispatcher.ApiThread r18) {
        /*
            r17 = this;
            r0 = r18
            monitor-enter(r17)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r9 = 0
            r1[r9] = r0     // Catch:{ all -> 0x00e9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56907a     // Catch:{ all -> 0x00e9 }
            r4 = 0
            r5 = 60813(0xed8d, float:8.5217E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e9 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r2 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r6[r9] = r2     // Catch:{ all -> 0x00e9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e9 }
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e9 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r1[r9] = r0     // Catch:{ all -> 0x00e9 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56907a     // Catch:{ all -> 0x00e9 }
            r4 = 0
            r5 = 60813(0xed8d, float:8.5217E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e9 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r0 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r6[r9] = r0     // Catch:{ all -> 0x00e9 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e9 }
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x0038:
            if (r0 != 0) goto L_0x003c
            monitor-exit(r17)
            return
        L_0x003c:
            com.ss.android.ugc.aweme.net.u r1 = com.ss.android.ugc.aweme.net.u.a()     // Catch:{ all -> 0x00e9 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r10[r9] = r0     // Catch:{ all -> 0x00e9 }
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.net.u.f57016a     // Catch:{ all -> 0x00e9 }
            r13 = 0
            r14 = 60764(0xed5c, float:8.5148E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e9 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r3 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r2[r9] = r3     // Catch:{ all -> 0x00e9 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e9 }
            r11 = r1
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x0073
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x00e9 }
            r2[r9] = r0     // Catch:{ all -> 0x00e9 }
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.net.u.f57016a     // Catch:{ all -> 0x00e9 }
            r11 = 0
            r12 = 60764(0xed5c, float:8.5148E-41)
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch:{ all -> 0x00e9 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r0 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r13[r9] = r0     // Catch:{ all -> 0x00e9 }
            java.lang.Class r14 = java.lang.Void.TYPE     // Catch:{ all -> 0x00e9 }
            r8 = r2
            r9 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x0073:
            if (r0 == 0) goto L_0x00e7
            boolean r2 = r18.isCanceled()     // Catch:{ all -> 0x00e9 }
            if (r2 != 0) goto L_0x00e7
            int r2 = com.ss.android.ugc.aweme.net.u.b()     // Catch:{ all -> 0x00e9 }
            r0.setSequence(r2)     // Catch:{ all -> 0x00e9 }
            boolean r2 = r18.needTryLocal()     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00a8
            boolean r2 = r18.run4Local()     // Catch:{ all -> 0x00e9 }
            if (r2 != 0) goto L_0x00e7
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r2 = r18.getPriority()     // Catch:{ all -> 0x00e9 }
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r3 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.IMMEDIATE     // Catch:{ all -> 0x00e9 }
            if (r2 != r3) goto L_0x009f
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch:{ all -> 0x00e9 }
            r1.execute(r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x009f:
            java.util.concurrent.ExecutorService r1 = r1.d()     // Catch:{ all -> 0x00e9 }
            r1.execute(r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x00a8:
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r2 = r18.getPriority()     // Catch:{ all -> 0x00e9 }
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r3 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.IMMEDIATE     // Catch:{ all -> 0x00e9 }
            if (r2 != r3) goto L_0x00b9
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch:{ all -> 0x00e9 }
            r1.execute(r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x00b9:
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.net.a     // Catch:{ all -> 0x00e9 }
            if (r2 == 0) goto L_0x00e0
            r2 = r0
            com.ss.android.ugc.aweme.net.a r2 = (com.ss.android.ugc.aweme.net.a) r2     // Catch:{ all -> 0x00e9 }
            int r2 = r2.f19729a     // Catch:{ all -> 0x00e9 }
            long r2 = (long) r2     // Catch:{ all -> 0x00e9 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00d7
            android.os.Message r4 = android.os.Message.obtain()     // Catch:{ all -> 0x00e9 }
            r4.what = r9     // Catch:{ all -> 0x00e9 }
            r4.obj = r0     // Catch:{ all -> 0x00e9 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r1.f57018b     // Catch:{ all -> 0x00e9 }
            r0.sendMessageDelayed(r4, r2)     // Catch:{ all -> 0x00e9 }
            goto L_0x00e7
        L_0x00d7:
            java.util.concurrent.ExecutorService r1 = r1.d()     // Catch:{ all -> 0x00e9 }
            r1.execute(r0)     // Catch:{ all -> 0x00e9 }
            monitor-exit(r17)
            return
        L_0x00e0:
            java.util.concurrent.ExecutorService r1 = r1.d()     // Catch:{ all -> 0x00e9 }
            r1.execute(r0)     // Catch:{ all -> 0x00e9 }
        L_0x00e7:
            monitor-exit(r17)
            return
        L_0x00e9:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ag.add(com.bytedance.frameworks.baselib.network.dispatcher.ApiThread):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c2, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void addDownload(com.bytedance.frameworks.baselib.network.dispatcher.ApiThread r18) {
        /*
            r17 = this;
            r0 = r18
            monitor-enter(r17)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c3 }
            r9 = 0
            r1[r9] = r0     // Catch:{ all -> 0x00c3 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56907a     // Catch:{ all -> 0x00c3 }
            r4 = 0
            r5 = 60812(0xed8c, float:8.5216E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c3 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r2 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r6[r9] = r2     // Catch:{ all -> 0x00c3 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c3 }
            r2 = r17
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c3 }
            if (r1 == 0) goto L_0x0038
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c3 }
            r1[r9] = r0     // Catch:{ all -> 0x00c3 }
            com.meituan.robust.ChangeQuickRedirect r3 = f56907a     // Catch:{ all -> 0x00c3 }
            r4 = 0
            r5 = 60812(0xed8c, float:8.5216E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c3 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r0 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r6[r9] = r0     // Catch:{ all -> 0x00c3 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c3 }
            r2 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r17)
            return
        L_0x0038:
            if (r0 != 0) goto L_0x003c
            monitor-exit(r17)
            return
        L_0x003c:
            com.ss.android.ugc.aweme.net.u r1 = com.ss.android.ugc.aweme.net.u.a()     // Catch:{ all -> 0x00c3 }
            java.lang.Object[] r10 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c3 }
            r10[r9] = r0     // Catch:{ all -> 0x00c3 }
            com.meituan.robust.ChangeQuickRedirect r12 = com.ss.android.ugc.aweme.net.u.f57016a     // Catch:{ all -> 0x00c3 }
            r13 = 0
            r14 = 60763(0xed5b, float:8.5147E-41)
            java.lang.Class[] r2 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c3 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r3 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r2[r9] = r3     // Catch:{ all -> 0x00c3 }
            java.lang.Class r16 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c3 }
            r11 = r1
            r15 = r2
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x0073
            java.lang.Object[] r2 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c3 }
            r2[r9] = r0     // Catch:{ all -> 0x00c3 }
            com.meituan.robust.ChangeQuickRedirect r10 = com.ss.android.ugc.aweme.net.u.f57016a     // Catch:{ all -> 0x00c3 }
            r11 = 0
            r12 = 60763(0xed5b, float:8.5147E-41)
            java.lang.Class[] r13 = new java.lang.Class[r8]     // Catch:{ all -> 0x00c3 }
            java.lang.Class<com.bytedance.frameworks.baselib.network.dispatcher.ApiThread> r0 = com.bytedance.frameworks.baselib.network.dispatcher.ApiThread.class
            r13[r9] = r0     // Catch:{ all -> 0x00c3 }
            java.lang.Class r14 = java.lang.Void.TYPE     // Catch:{ all -> 0x00c3 }
            r8 = r2
            r9 = r1
            com.meituan.robust.PatchProxy.accessDispatch(r8, r9, r10, r11, r12, r13, r14)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r17)
            return
        L_0x0073:
            if (r0 == 0) goto L_0x00c1
            boolean r2 = r18.isCanceled()     // Catch:{ all -> 0x00c3 }
            if (r2 != 0) goto L_0x00c1
            int r2 = com.ss.android.ugc.aweme.net.u.b()     // Catch:{ all -> 0x00c3 }
            r0.setSequence(r2)     // Catch:{ all -> 0x00c3 }
            boolean r2 = r0 instanceof com.ss.android.ugc.aweme.net.a     // Catch:{ all -> 0x00c3 }
            if (r2 == 0) goto L_0x00ba
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r2 = r18.getPriority()     // Catch:{ all -> 0x00c3 }
            com.bytedance.frameworks.baselib.network.dispatcher.IRequest$Priority r3 = com.bytedance.frameworks.baselib.network.dispatcher.IRequest.Priority.IMMEDIATE     // Catch:{ all -> 0x00c3 }
            if (r2 != r3) goto L_0x0097
            java.util.concurrent.ExecutorService r1 = r1.c()     // Catch:{ all -> 0x00c3 }
            r1.execute(r0)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r17)
            return
        L_0x0097:
            r2 = r0
            com.ss.android.ugc.aweme.net.a r2 = (com.ss.android.ugc.aweme.net.a) r2     // Catch:{ all -> 0x00c3 }
            int r2 = r2.f19729a     // Catch:{ all -> 0x00c3 }
            long r2 = (long) r2     // Catch:{ all -> 0x00c3 }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00b1
            android.os.Message r4 = android.os.Message.obtain()     // Catch:{ all -> 0x00c3 }
            r4.what = r8     // Catch:{ all -> 0x00c3 }
            r4.obj = r0     // Catch:{ all -> 0x00c3 }
            com.bytedance.common.utility.collection.WeakHandler r0 = r1.f57018b     // Catch:{ all -> 0x00c3 }
            r0.sendMessageDelayed(r4, r2)     // Catch:{ all -> 0x00c3 }
            goto L_0x00c1
        L_0x00b1:
            java.util.concurrent.ExecutorService r1 = r1.e()     // Catch:{ all -> 0x00c3 }
            r1.execute(r0)     // Catch:{ all -> 0x00c3 }
            monitor-exit(r17)
            return
        L_0x00ba:
            java.util.concurrent.ExecutorService r1 = r1.e()     // Catch:{ all -> 0x00c3 }
            r1.execute(r0)     // Catch:{ all -> 0x00c3 }
        L_0x00c1:
            monitor-exit(r17)
            return
        L_0x00c3:
            r0 = move-exception
            monitor-exit(r17)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.ag.addDownload(com.bytedance.frameworks.baselib.network.dispatcher.ApiThread):void");
    }
}
