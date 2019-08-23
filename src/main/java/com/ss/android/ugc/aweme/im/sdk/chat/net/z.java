package com.ss.android.ugc.aweme.im.sdk.chat.net;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.Map;
import java.util.Queue;

public final class z extends Thread {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f51015a;

    /* renamed from: b  reason: collision with root package name */
    private final Queue<aa> f51016b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, aa> f51017c;

    /* JADX WARNING: Can't wrap try/catch for region: R(6:9|10|11|12|13|23) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r3 = f51015a
            java.lang.Class[] r6 = new java.lang.Class[r0]
            java.lang.Class r7 = java.lang.Void.TYPE
            r4 = 0
            r5 = 51323(0xc87b, float:7.1919E-41)
            r2 = r9
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6, r7)
            if (r1 == 0) goto L_0x0025
            java.lang.Object[] r2 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r4 = f51015a
            r5 = 0
            r6 = 51323(0xc87b, float:7.1919E-41)
            java.lang.Class[] r7 = new java.lang.Class[r0]
            java.lang.Class r8 = java.lang.Void.TYPE
            r3 = r9
            com.meituan.robust.PatchProxy.accessDispatch(r2, r3, r4, r5, r6, r7, r8)
            return
        L_0x0025:
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r0 = r9.f51016b
            monitor-enter(r0)
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r1 = r9.f51016b     // Catch:{ all -> 0x0052 }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x0052 }
            if (r1 == 0) goto L_0x0038
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r1 = r9.f51016b     // Catch:{ InterruptedException -> 0x0036 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0036 }
            goto L_0x0038
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            goto L_0x0025
        L_0x0038:
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            java.util.Queue<com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r0 = r9.f51016b
            java.lang.Object r0 = r0.poll()
            com.ss.android.ugc.aweme.im.sdk.chat.net.aa r0 = (com.ss.android.ugc.aweme.im.sdk.chat.net.aa) r0
            if (r0 == 0) goto L_0x0025
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r1 = r9.f51017c
            java.lang.String r2 = r0.i
            r1.put(r2, r0)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.im.sdk.chat.net.aa> r1 = r9.f51017c
            r0.j = r1
            r0.run()
            goto L_0x0025
        L_0x0052:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0052 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.im.sdk.chat.net.z.run():void");
    }

    public z(String str, Queue<aa> queue, Map<String, aa> map) {
        super(str);
        setDaemon(true);
        this.f51016b = queue;
        this.f51017c = map;
    }
}
