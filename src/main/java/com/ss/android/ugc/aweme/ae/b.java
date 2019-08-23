package com.ss.android.ugc.aweme.ae;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0006\u0010\f\u001a\u00020\u0007J\u0006\u0010\r\u001a\u00020\u0007J\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/ss/android/ugc/aweme/push/PushAliveMonitor;", "", "()V", "mDelayFinish", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mNotInBootState", "init", "", "isMainProcess", "", "context", "Landroid/content/Context;", "requestSendData", "requestSendDataInternal", "updateSettings", "data", "Lorg/json/JSONObject;", "main_douyinCnRelease"}, k = 1, mv = {1, 1, 15})
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f33211a;

    /* renamed from: b  reason: collision with root package name */
    public static final AtomicBoolean f33212b = new AtomicBoolean(false);

    /* renamed from: c  reason: collision with root package name */
    public static final b f33213c = new b();

    /* renamed from: d  reason: collision with root package name */
    private static final AtomicBoolean f33214d = new AtomicBoolean(false);

    private b() {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r3 = f33211a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = 70329(0x112b9, float:9.8552E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0048 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0027
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r4 = f33211a     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 70329(0x112b9, float:9.8552E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0048 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            return
        L_0x0027:
            java.util.concurrent.atomic.AtomicBoolean r0 = f33214d     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
            java.util.concurrent.atomic.AtomicBoolean r0 = f33212b     // Catch:{ all -> 0x0048 }
            boolean r0 = r0.get()     // Catch:{ all -> 0x0048 }
            if (r0 == 0) goto L_0x0046
            android.app.Application r0 = com.ss.android.ugc.aweme.framework.e.a.a()     // Catch:{ all -> 0x0048 }
            android.content.Context r0 = (android.content.Context) r0     // Catch:{ all -> 0x0048 }
            com.ss.alive.monitor.b r0 = com.ss.alive.monitor.b.a((android.content.Context) r0)     // Catch:{ all -> 0x0048 }
            r1 = 0
            r0.a((long) r1)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r9)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.ae.b.a():void");
    }
}
