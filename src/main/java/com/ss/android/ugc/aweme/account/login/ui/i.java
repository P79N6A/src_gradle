package com.ss.android.ugc.aweme.account.login.ui;

import android.os.Handler;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f32622a;

    /* renamed from: b  reason: collision with root package name */
    private final long f32623b;

    /* renamed from: c  reason: collision with root package name */
    private final long f32624c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private long f32625d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f32626e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f32627f;
    private boolean g;
    private Handler h = new WeakHandler(this);
    private a i;

    public interface a {
        void a();

        void a(long j);
    }

    public static class b implements a {
        public void a() {
        }

        public void a(long j) {
        }
    }

    public final synchronized boolean b() {
        return this.g;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0045, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.ugc.aweme.account.login.ui.i a() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            com.meituan.robust.ChangeQuickRedirect r3 = f32622a     // Catch:{ all -> 0x005d }
            r4 = 0
            r5 = 20544(0x5040, float:2.8788E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x005d }
            java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.i> r7 = com.ss.android.ugc.aweme.account.login.ui.i.class
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005d }
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x005d }
            com.meituan.robust.ChangeQuickRedirect r4 = f32622a     // Catch:{ all -> 0x005d }
            r5 = 0
            r6 = 20544(0x5040, float:2.8788E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x005d }
            java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.i> r8 = com.ss.android.ugc.aweme.account.login.ui.i.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005d }
            com.ss.android.ugc.aweme.account.login.ui.i r0 = (com.ss.android.ugc.aweme.account.login.ui.i) r0     // Catch:{ all -> 0x005d }
            monitor-exit(r9)
            return r0
        L_0x0028:
            r9.f32626e = r0     // Catch:{ all -> 0x005d }
            r9.f32627f = r0     // Catch:{ all -> 0x005d }
            r1 = 1
            r9.g = r1     // Catch:{ all -> 0x005d }
            long r2 = r9.f32623b     // Catch:{ all -> 0x005d }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0046
            r9.f32627f = r1     // Catch:{ all -> 0x005d }
            r9.g = r0     // Catch:{ all -> 0x005d }
            com.ss.android.ugc.aweme.account.login.ui.i$a r0 = r9.i     // Catch:{ all -> 0x005d }
            if (r0 == 0) goto L_0x0044
            com.ss.android.ugc.aweme.account.login.ui.i$a r0 = r9.i     // Catch:{ all -> 0x005d }
            r0.a()     // Catch:{ all -> 0x005d }
        L_0x0044:
            monitor-exit(r9)
            return r9
        L_0x0046:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005d }
            long r4 = r9.f32623b     // Catch:{ all -> 0x005d }
            r0 = 0
            long r2 = r2 + r4
            r9.f32625d = r2     // Catch:{ all -> 0x005d }
            android.os.Handler r0 = r9.h     // Catch:{ all -> 0x005d }
            android.os.Handler r2 = r9.h     // Catch:{ all -> 0x005d }
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x005d }
            r0.sendMessage(r1)     // Catch:{ all -> 0x005d }
            monitor-exit(r9)
            return r9
        L_0x005d:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.i.a():com.ss.android.ugc.aweme.account.login.ui.i");
    }

    public final void a(a aVar) {
        if (PatchProxy.isSupport(new Object[]{aVar}, this, f32622a, false, 20545, new Class[]{a.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{aVar}, this, f32622a, false, 20545, new Class[]{a.class}, Void.TYPE);
            return;
        }
        this.i = aVar;
        if (this.f32627f && this.i != null) {
            this.i.a();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r11) {
        /*
            r10 = this;
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r9 = 0
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f32622a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r2 = android.os.Message.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 20546(0x5042, float:2.8791E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f32622a
            r4 = 0
            r5 = 20546(0x5042, float:2.8791E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            monitor-enter(r10)
            boolean r0 = r10.f32626e     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x0037
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x0037:
            long r0 = r10.f32625d     // Catch:{ all -> 0x008d }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            r4 = 0
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0053
            r10.f32627f = r8     // Catch:{ all -> 0x008d }
            r10.g = r9     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.account.login.ui.i$a r0 = r10.i     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x008b
            com.ss.android.ugc.aweme.account.login.ui.i$a r0 = r10.i     // Catch:{ all -> 0x008d }
            r0.a()     // Catch:{ all -> 0x008d }
            goto L_0x008b
        L_0x0053:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.account.login.ui.i$a r6 = r10.i     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x0060
            com.ss.android.ugc.aweme.account.login.ui.i$a r6 = r10.i     // Catch:{ all -> 0x008d }
            r6.a(r0)     // Catch:{ all -> 0x008d }
        L_0x0060:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            r9 = 0
            long r6 = r6 - r4
            long r4 = r10.f32624c     // Catch:{ all -> 0x008d }
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0073
            long r0 = r0 - r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            r0 = r2
            goto L_0x0080
        L_0x0073:
            long r0 = r10.f32624c     // Catch:{ all -> 0x008d }
            r4 = 0
            long r0 = r0 - r6
        L_0x0077:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0080
            long r4 = r10.f32624c     // Catch:{ all -> 0x008d }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x0077
        L_0x0080:
            android.os.Handler r2 = r10.h     // Catch:{ all -> 0x008d }
            android.os.Handler r3 = r10.h     // Catch:{ all -> 0x008d }
            android.os.Message r3 = r3.obtainMessage(r8)     // Catch:{ all -> 0x008d }
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x008d }
        L_0x008b:
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.account.login.ui.i.handleMsg(android.os.Message):void");
    }

    public i(long j, long j2, a aVar) {
        this.f32623b = j;
        this.i = aVar;
    }
}
