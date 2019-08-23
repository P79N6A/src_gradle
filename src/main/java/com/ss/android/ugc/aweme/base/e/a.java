package com.ss.android.ugc.aweme.base.e;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.ArrayList;

public class a<T> {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f34732a;

    /* renamed from: b  reason: collision with root package name */
    protected final ArrayList<b<T>> f34733b = new ArrayList<>();

    /* renamed from: c  reason: collision with root package name */
    private boolean f34734c;

    public final synchronized boolean c() {
        return this.f34734c;
    }

    public final synchronized void a() {
        this.f34734c = true;
    }

    public final synchronized void b() {
        this.f34734c = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0040, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ss.android.ugc.aweme.base.e.b r11) {
        /*
            r10 = this;
            monitor-enter(r10)
            r8 = 1
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
            r9 = 0
            r1[r9] = r11     // Catch:{ all -> 0x0041 }
            com.meituan.robust.ChangeQuickRedirect r3 = f34732a     // Catch:{ all -> 0x0041 }
            r4 = 0
            r5 = 25164(0x624c, float:3.5262E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.ugc.aweme.base.e.b> r2 = com.ss.android.ugc.aweme.base.e.b.class
            r6[r9] = r2     // Catch:{ all -> 0x0041 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            r2 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            if (r1 == 0) goto L_0x0032
            java.lang.Object[] r1 = new java.lang.Object[r8]     // Catch:{ all -> 0x0041 }
            r1[r9] = r11     // Catch:{ all -> 0x0041 }
            com.meituan.robust.ChangeQuickRedirect r3 = f34732a     // Catch:{ all -> 0x0041 }
            r4 = 0
            r5 = 25164(0x624c, float:3.5262E-41)
            java.lang.Class[] r6 = new java.lang.Class[r8]     // Catch:{ all -> 0x0041 }
            java.lang.Class<com.ss.android.ugc.aweme.base.e.b> r0 = com.ss.android.ugc.aweme.base.e.b.class
            r6[r9] = r0     // Catch:{ all -> 0x0041 }
            java.lang.Class r7 = java.lang.Void.TYPE     // Catch:{ all -> 0x0041 }
            r2 = r10
            com.meituan.robust.PatchProxy.accessDispatch(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ all -> 0x0041 }
            monitor-exit(r10)
            return
        L_0x0032:
            java.util.ArrayList<com.ss.android.ugc.aweme.base.e.b<T>> r1 = r10.f34733b     // Catch:{ all -> 0x0041 }
            boolean r1 = r1.contains(r11)     // Catch:{ all -> 0x0041 }
            if (r1 != 0) goto L_0x003f
            java.util.ArrayList<com.ss.android.ugc.aweme.base.e.b<T>> r1 = r10.f34733b     // Catch:{ all -> 0x0041 }
            r1.add(r11)     // Catch:{ all -> 0x0041 }
        L_0x003f:
            monitor-exit(r10)
            return
        L_0x0041:
            r0 = move-exception
            monitor-exit(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.base.e.a.a(com.ss.android.ugc.aweme.base.e.b):void");
    }
}
