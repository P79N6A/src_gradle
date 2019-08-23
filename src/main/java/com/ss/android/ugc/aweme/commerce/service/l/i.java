package com.ss.android.ugc.aweme.commerce.service.l;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class i implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f38024a;

    /* renamed from: b  reason: collision with root package name */
    private final long f38025b;

    /* renamed from: c  reason: collision with root package name */
    private final long f38026c;

    /* renamed from: d  reason: collision with root package name */
    private long f38027d;

    /* renamed from: e  reason: collision with root package name */
    private long f38028e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f38029f;
    private boolean g;
    private boolean h;
    private boolean i;
    private Handler j = new WeakHandler(Looper.getMainLooper(), this);
    private a k;

    public interface a {
        void a();

        void a(long j);
    }

    public final synchronized void a() {
        if (PatchProxy.isSupport(new Object[0], this, f38024a, false, 30009, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f38024a, false, 30009, new Class[0], Void.TYPE);
            return;
        }
        this.f38029f = true;
        this.h = false;
        this.i = false;
        this.j.removeMessages(1);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0038, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void c() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0039 }
            com.meituan.robust.ChangeQuickRedirect r3 = f38024a     // Catch:{ all -> 0x0039 }
            r4 = 0
            r5 = 30011(0x753b, float:4.2054E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0039 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0039 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0039 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0039 }
            com.meituan.robust.ChangeQuickRedirect r4 = f38024a     // Catch:{ all -> 0x0039 }
            r5 = 0
            r6 = 30011(0x753b, float:4.2054E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0039 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0039 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0039 }
            monitor-exit(r9)
            return
        L_0x0025:
            boolean r0 = r9.h     // Catch:{ all -> 0x0039 }
            if (r0 == 0) goto L_0x0037
            r0 = 1
            r9.i = r0     // Catch:{ all -> 0x0039 }
            android.os.Handler r1 = r9.j     // Catch:{ all -> 0x0039 }
            r1.removeMessages(r0)     // Catch:{ all -> 0x0039 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0039 }
            r9.f38028e = r0     // Catch:{ all -> 0x0039 }
        L_0x0037:
            monitor-exit(r9)
            return
        L_0x0039:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.i.c():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0047, code lost:
        return r9;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized com.ss.android.ugc.aweme.commerce.service.l.i b() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r3 = f38024a     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 30010(0x753a, float:4.2053E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x005f }
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.l.i> r7 = com.ss.android.ugc.aweme.commerce.service.l.i.class
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x005f }
            if (r1 == 0) goto L_0x0028
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x005f }
            com.meituan.robust.ChangeQuickRedirect r4 = f38024a     // Catch:{ all -> 0x005f }
            r5 = 0
            r6 = 30010(0x753a, float:4.2053E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x005f }
            java.lang.Class<com.ss.android.ugc.aweme.commerce.service.l.i> r8 = com.ss.android.ugc.aweme.commerce.service.l.i.class
            r3 = r9
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x005f }
            com.ss.android.ugc.aweme.commerce.service.l.i r0 = (com.ss.android.ugc.aweme.commerce.service.l.i) r0     // Catch:{ all -> 0x005f }
            monitor-exit(r9)
            return r0
        L_0x0028:
            r9.i = r0     // Catch:{ all -> 0x005f }
            r9.f38029f = r0     // Catch:{ all -> 0x005f }
            r9.g = r0     // Catch:{ all -> 0x005f }
            r1 = 1
            r9.h = r1     // Catch:{ all -> 0x005f }
            long r2 = r9.f38025b     // Catch:{ all -> 0x005f }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 > 0) goto L_0x0048
            r9.g = r1     // Catch:{ all -> 0x005f }
            r9.h = r0     // Catch:{ all -> 0x005f }
            com.ss.android.ugc.aweme.commerce.service.l.i$a r0 = r9.k     // Catch:{ all -> 0x005f }
            if (r0 == 0) goto L_0x0046
            com.ss.android.ugc.aweme.commerce.service.l.i$a r0 = r9.k     // Catch:{ all -> 0x005f }
            r0.a()     // Catch:{ all -> 0x005f }
        L_0x0046:
            monitor-exit(r9)
            return r9
        L_0x0048:
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x005f }
            long r4 = r9.f38025b     // Catch:{ all -> 0x005f }
            r0 = 0
            long r2 = r2 + r4
            r9.f38027d = r2     // Catch:{ all -> 0x005f }
            android.os.Handler r0 = r9.j     // Catch:{ all -> 0x005f }
            android.os.Handler r2 = r9.j     // Catch:{ all -> 0x005f }
            android.os.Message r1 = r2.obtainMessage(r1)     // Catch:{ all -> 0x005f }
            r0.sendMessage(r1)     // Catch:{ all -> 0x005f }
            monitor-exit(r9)
            return r9
        L_0x005f:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.i.b():com.ss.android.ugc.aweme.commerce.service.l.i");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0047, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void d() {
        /*
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r3 = f38024a     // Catch:{ all -> 0x0048 }
            r4 = 0
            r5 = 30012(0x753c, float:4.2056E-41)
            java.lang.Class[] r6 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0048 }
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ all -> 0x0048 }
            com.meituan.robust.ChangeQuickRedirect r4 = f38024a     // Catch:{ all -> 0x0048 }
            r5 = 0
            r6 = 30012(0x753c, float:4.2056E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch:{ all -> 0x0048 }
            java.lang.Class r8 = java.lang.Void.TYPE     // Catch:{ all -> 0x0048 }
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)     // Catch:{ all -> 0x0048 }
            monitor-exit(r9)
            return
        L_0x0025:
            boolean r1 = r9.i     // Catch:{ all -> 0x0048 }
            if (r1 == 0) goto L_0x0046
            r9.i = r0     // Catch:{ all -> 0x0048 }
            long r0 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0048 }
            long r2 = r9.f38028e     // Catch:{ all -> 0x0048 }
            r4 = 0
            long r0 = r0 - r2
            long r2 = r9.f38026c     // Catch:{ all -> 0x0048 }
            long r4 = r9.f38026c     // Catch:{ all -> 0x0048 }
            long r0 = r0 % r4
            r4 = 0
            long r2 = r2 - r0
            android.os.Handler r0 = r9.j     // Catch:{ all -> 0x0048 }
            android.os.Handler r1 = r9.j     // Catch:{ all -> 0x0048 }
            r4 = 1
            android.os.Message r1 = r1.obtainMessage(r4)     // Catch:{ all -> 0x0048 }
            r0.sendMessageDelayed(r1, r2)     // Catch:{ all -> 0x0048 }
        L_0x0046:
            monitor-exit(r9)
            return
        L_0x0048:
            r0 = move-exception
            monitor-exit(r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.i.d():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0091, code lost:
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
            com.meituan.robust.ChangeQuickRedirect r3 = f38024a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r2 = android.os.Message.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 30013(0x753d, float:4.2057E-41)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0030
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f38024a
            r4 = 0
            r5 = 30013(0x753d, float:4.2057E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0030:
            monitor-enter(r10)
            boolean r0 = r10.f38029f     // Catch:{ all -> 0x0092 }
            if (r0 != 0) goto L_0x0090
            boolean r0 = r10.i     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x003a
            goto L_0x0090
        L_0x003a:
            long r0 = r10.f38027d     // Catch:{ all -> 0x0092 }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0092 }
            r4 = 0
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0056
            r10.g = r8     // Catch:{ all -> 0x0092 }
            r10.h = r9     // Catch:{ all -> 0x0092 }
            com.ss.android.ugc.aweme.commerce.service.l.i$a r0 = r10.k     // Catch:{ all -> 0x0092 }
            if (r0 == 0) goto L_0x008e
            com.ss.android.ugc.aweme.commerce.service.l.i$a r0 = r10.k     // Catch:{ all -> 0x0092 }
            r0.a()     // Catch:{ all -> 0x0092 }
            goto L_0x008e
        L_0x0056:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0092 }
            com.ss.android.ugc.aweme.commerce.service.l.i$a r6 = r10.k     // Catch:{ all -> 0x0092 }
            if (r6 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.commerce.service.l.i$a r6 = r10.k     // Catch:{ all -> 0x0092 }
            r6.a(r0)     // Catch:{ all -> 0x0092 }
        L_0x0063:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x0092 }
            r9 = 0
            long r6 = r6 - r4
            long r4 = r10.f38026c     // Catch:{ all -> 0x0092 }
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0076
            long r0 = r0 - r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0083
            r0 = r2
            goto L_0x0083
        L_0x0076:
            long r0 = r10.f38026c     // Catch:{ all -> 0x0092 }
            r4 = 0
            long r0 = r0 - r6
        L_0x007a:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x0083
            long r4 = r10.f38026c     // Catch:{ all -> 0x0092 }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x007a
        L_0x0083:
            android.os.Handler r2 = r10.j     // Catch:{ all -> 0x0092 }
            android.os.Handler r3 = r10.j     // Catch:{ all -> 0x0092 }
            android.os.Message r3 = r3.obtainMessage(r8)     // Catch:{ all -> 0x0092 }
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x0092 }
        L_0x008e:
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return
        L_0x0090:
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            return
        L_0x0092:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x0092 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.commerce.service.l.i.handleMsg(android.os.Message):void");
    }

    public i(long j2, long j3, a aVar) {
        this.f38025b = j2;
        this.f38026c = j3;
        this.k = aVar;
    }
}
