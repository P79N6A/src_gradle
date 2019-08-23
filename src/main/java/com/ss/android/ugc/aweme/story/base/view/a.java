package com.ss.android.ugc.aweme.story.base.view;

import android.os.Handler;
import android.os.SystemClock;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

public class a implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f72008a;

    /* renamed from: b  reason: collision with root package name */
    private final long f72009b;

    /* renamed from: c  reason: collision with root package name */
    private final long f72010c = 1000;

    /* renamed from: d  reason: collision with root package name */
    private long f72011d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f72012e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f72013f;
    private boolean g;
    private boolean h;
    private Handler i = new WeakHandler(this);
    private C0752a j;

    /* renamed from: com.ss.android.ugc.aweme.story.base.view.a$a  reason: collision with other inner class name */
    public interface C0752a {
        void a(long j);
    }

    public static class b implements C0752a {
        public void a(long j) {
        }
    }

    public final synchronized void a() {
        if (PatchProxy.isSupport(new Object[0], this, f72008a, false, 82358, new Class[0], Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[0], this, f72008a, false, 82358, new Class[0], Void.TYPE);
            return;
        }
        this.f72012e = true;
        this.g = false;
        this.h = false;
        this.i.removeMessages(1);
    }

    public final synchronized a b() {
        if (PatchProxy.isSupport(new Object[0], this, f72008a, false, 82359, new Class[0], a.class)) {
            return (a) PatchProxy.accessDispatch(new Object[0], this, f72008a, false, 82359, new Class[0], a.class);
        }
        this.h = false;
        this.f72012e = false;
        this.f72013f = false;
        this.g = true;
        if (this.f72009b <= 0) {
            this.f72013f = true;
            this.g = false;
            return this;
        }
        this.f72011d = SystemClock.elapsedRealtime() + this.f72009b;
        this.i.sendMessage(this.i.obtainMessage(1));
        return this;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x008a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x008c, code lost:
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
            com.meituan.robust.ChangeQuickRedirect r3 = f72008a
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r2 = android.os.Message.class
            r6[r9] = r2
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 82363(0x141bb, float:1.15415E-40)
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]
            r1[r9] = r11
            com.meituan.robust.ChangeQuickRedirect r3 = f72008a
            r4 = 0
            r5 = 82363(0x141bb, float:1.15415E-40)
            java.lang.Class[] r6 = new java.lang.Class[r8]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r6[r9] = r0
            java.lang.Class r7 = java.lang.Void.TYPE
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)
            return
        L_0x0032:
            monitor-enter(r10)
            boolean r0 = r10.f72012e     // Catch:{ all -> 0x008d }
            if (r0 != 0) goto L_0x008b
            boolean r0 = r10.h     // Catch:{ all -> 0x008d }
            if (r0 == 0) goto L_0x003c
            goto L_0x008b
        L_0x003c:
            long r0 = r10.f72011d     // Catch:{ all -> 0x008d }
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            r4 = 0
            long r0 = r0 - r2
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 > 0) goto L_0x0051
            r10.f72013f = r8     // Catch:{ all -> 0x008d }
            r10.g = r9     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.story.base.view.a$a r0 = r10.j     // Catch:{ all -> 0x008d }
            goto L_0x0089
        L_0x0051:
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            com.ss.android.ugc.aweme.story.base.view.a$a r6 = r10.j     // Catch:{ all -> 0x008d }
            if (r6 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.story.base.view.a$a r6 = r10.j     // Catch:{ all -> 0x008d }
            r6.a(r0)     // Catch:{ all -> 0x008d }
        L_0x005e:
            long r6 = android.os.SystemClock.elapsedRealtime()     // Catch:{ all -> 0x008d }
            r9 = 0
            long r6 = r6 - r4
            long r4 = r10.f72010c     // Catch:{ all -> 0x008d }
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 >= 0) goto L_0x0071
            long r0 = r0 - r6
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007e
            r0 = r2
            goto L_0x007e
        L_0x0071:
            long r0 = r10.f72010c     // Catch:{ all -> 0x008d }
            r4 = 0
            long r0 = r0 - r6
        L_0x0075:
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L_0x007e
            long r4 = r10.f72010c     // Catch:{ all -> 0x008d }
            r6 = 0
            long r0 = r0 + r4
            goto L_0x0075
        L_0x007e:
            android.os.Handler r2 = r10.i     // Catch:{ all -> 0x008d }
            android.os.Handler r3 = r10.i     // Catch:{ all -> 0x008d }
            android.os.Message r3 = r3.obtainMessage(r8)     // Catch:{ all -> 0x008d }
            r2.sendMessageDelayed(r3, r0)     // Catch:{ all -> 0x008d }
        L_0x0089:
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x008b:
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            return
        L_0x008d:
            r0 = move-exception
            monitor-exit(r10)     // Catch:{ all -> 0x008d }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.base.view.a.handleMsg(android.os.Message):void");
    }

    public a(long j2, long j3, C0752a aVar) {
        this.f72009b = j2;
        this.j = aVar;
    }
}
