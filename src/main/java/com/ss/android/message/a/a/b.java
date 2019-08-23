package com.ss.android.message.a.a;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import java.text.SimpleDateFormat;
import java.util.concurrent.ExecutorService;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f29848a = null;

    /* renamed from: b  reason: collision with root package name */
    public static String f29849b = "notify.log";
    @SuppressLint({"SimpleDateFormat"})

    /* renamed from: c  reason: collision with root package name */
    public static SimpleDateFormat f29850c = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    /* renamed from: d  reason: collision with root package name */
    private static ExecutorService f29851d;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x004e, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r20, java.lang.String r21) {
        /*
            java.lang.Class<com.ss.android.message.a.a.b> r2 = com.ss.android.message.a.a.b.class
            monitor-enter(r2)
            r3 = 2
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch:{ all -> 0x0051 }
            r11 = 0
            r4[r11] = r20     // Catch:{ all -> 0x0051 }
            r12 = 1
            r4[r12] = r21     // Catch:{ all -> 0x0051 }
            r5 = 0
            com.meituan.robust.ChangeQuickRedirect r6 = f29848a     // Catch:{ all -> 0x0051 }
            r7 = 1
            r8 = 17969(0x4631, float:2.518E-41)
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x0051 }
            java.lang.Class<android.content.Context> r10 = android.content.Context.class
            r9[r11] = r10     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r9[r12] = r10     // Catch:{ all -> 0x0051 }
            java.lang.Class r10 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            boolean r4 = com.meituan.robust.PatchProxy.isSupport(r4, r5, r6, r7, r8, r9, r10)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0044
            java.lang.Object[] r13 = new java.lang.Object[r3]     // Catch:{ all -> 0x0051 }
            r13[r11] = r20     // Catch:{ all -> 0x0051 }
            r13[r12] = r21     // Catch:{ all -> 0x0051 }
            r14 = 0
            com.meituan.robust.ChangeQuickRedirect r15 = f29848a     // Catch:{ all -> 0x0051 }
            r16 = 1
            r17 = 17969(0x4631, float:2.518E-41)
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x0051 }
            java.lang.Class<android.content.Context> r1 = android.content.Context.class
            r0[r11] = r1     // Catch:{ all -> 0x0051 }
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            r0[r12] = r1     // Catch:{ all -> 0x0051 }
            java.lang.Class r19 = java.lang.Void.TYPE     // Catch:{ all -> 0x0051 }
            r18 = r0
            com.meituan.robust.PatchProxy.accessDispatch(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0051 }
            monitor-exit(r2)
            return
        L_0x0044:
            java.util.concurrent.ExecutorService r0 = f29851d     // Catch:{ Exception -> 0x004f }
            if (r0 == 0) goto L_0x004d
            java.util.concurrent.ExecutorService r0 = f29851d     // Catch:{ Exception -> 0x004f }
            r0.shutdown()     // Catch:{ Exception -> 0x004f }
        L_0x004d:
            monitor-exit(r2)
            return
        L_0x004f:
            monitor-exit(r2)
            return
        L_0x0051:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.message.a.a.b.a(android.content.Context, java.lang.String):void");
    }
}
