package com.bytedance.crash.f;

import com.bytedance.crash.d;
import com.bytedance.crash.g;
import com.bytedance.crash.h;
import com.bytedance.crash.i.m;
import com.bytedance.crash.j;
import java.lang.Thread;
import java.util.List;

public final class a implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    public static a f19439a;

    /* renamed from: b  reason: collision with root package name */
    public b f19440b;

    /* renamed from: c  reason: collision with root package name */
    public b f19441c;

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f19442d = Thread.getDefaultUncaughtExceptionHandler();

    public a() {
        if (this.f19442d != this) {
            Thread.setDefaultUncaughtExceptionHandler(this);
        } else {
            this.f19442d = null;
        }
    }

    public static boolean a() {
        if (System.currentTimeMillis() - j.f() <= j.e().f19538f) {
            return true;
        }
        return false;
    }

    private void b(Thread thread, Throwable th) {
        if (this.f19442d != null && this.f19442d != this) {
            this.f19442d.uncaughtException(thread, th);
        }
    }

    private static boolean a(Thread thread, Throwable th) {
        h hVar = j.b().g;
        if (hVar != null) {
            try {
                if (!hVar.a()) {
                    return false;
                }
            } catch (Throwable unused) {
                return true;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a1 A[SYNTHETIC, Splitter:B:32:0x00a1] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r8, java.lang.Throwable r9) {
        /*
            r7 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            boolean r3 = a()     // Catch:{ Throwable -> 0x009d }
            if (r3 == 0) goto L_0x000e
            com.bytedance.crash.d r4 = com.bytedance.crash.d.LAUNCH     // Catch:{ Throwable -> 0x009d }
            goto L_0x0010
        L_0x000e:
            com.bytedance.crash.d r4 = com.bytedance.crash.d.JAVA     // Catch:{ Throwable -> 0x009d }
        L_0x0010:
            java.lang.String r5 = com.bytedance.crash.c.a.f19378b     // Catch:{ Throwable -> 0x009d }
            com.bytedance.crash.event.a r4 = com.bytedance.crash.event.b.a(r4, r5, r0, r9)     // Catch:{ Throwable -> 0x009d }
            com.bytedance.crash.event.c.b(r4)     // Catch:{ Throwable -> 0x009d }
            boolean r5 = com.bytedance.crash.f.d.f19449b     // Catch:{ Throwable -> 0x009d }
            if (r5 != 0) goto L_0x0030
            com.bytedance.crash.event.a r5 = r4.clone()     // Catch:{ Throwable -> 0x009d }
            java.lang.String r6 = com.bytedance.crash.c.a.f19377a     // Catch:{ Throwable -> 0x009d }
            com.bytedance.crash.event.a r5 = r5.eventType(r6)     // Catch:{ Throwable -> 0x009d }
            java.lang.String r6 = "Trap"
            com.bytedance.crash.event.a r5 = r5.errorInfo((java.lang.String) r6)     // Catch:{ Throwable -> 0x009d }
            com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r5)     // Catch:{ Throwable -> 0x009d }
        L_0x0030:
            com.bytedance.crash.event.a r4 = r4.clone()     // Catch:{ Throwable -> 0x009d }
            java.lang.String r5 = com.bytedance.crash.c.a.f19379c     // Catch:{ Throwable -> 0x009d }
            com.bytedance.crash.event.a r4 = r4.eventType(r5)     // Catch:{ Throwable -> 0x009d }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r5 = "[uncaughtException] isLaunchCrash="
            r2.<init>(r5)     // Catch:{ Throwable -> 0x0099 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0099 }
            a(r8, r9, r3)     // Catch:{ Throwable -> 0x0099 }
            boolean r2 = a(r8, r9)     // Catch:{ Throwable -> 0x0099 }
            if (r2 == 0) goto L_0x006a
            com.bytedance.crash.f.b r5 = r7.f19440b     // Catch:{ Throwable -> 0x0099 }
            if (r5 == 0) goto L_0x006a
            if (r3 == 0) goto L_0x006a
            com.bytedance.crash.event.c.b(r4)     // Catch:{ Throwable -> 0x0099 }
            com.bytedance.crash.f.b r2 = r7.f19440b     // Catch:{ Throwable -> 0x0099 }
            r2.a(r0, r8, r9)     // Catch:{ Throwable -> 0x0099 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r3 = "[uncaughtException] mLaunchCrashDisposer "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r3 = r9.toString()     // Catch:{ Throwable -> 0x0099 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0099 }
            goto L_0x0095
        L_0x006a:
            if (r2 == 0) goto L_0x0087
            com.bytedance.crash.f.b r3 = r7.f19441c     // Catch:{ Throwable -> 0x0099 }
            if (r3 == 0) goto L_0x0087
            com.bytedance.crash.event.c.b(r4)     // Catch:{ Throwable -> 0x0099 }
            com.bytedance.crash.f.b r2 = r7.f19441c     // Catch:{ Throwable -> 0x0099 }
            r2.a(r0, r8, r9)     // Catch:{ Throwable -> 0x0099 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r3 = "[uncaughtException] mLaunchCrashDisposer "
            r2.<init>(r3)     // Catch:{ Throwable -> 0x0099 }
            java.lang.String r3 = r9.toString()     // Catch:{ Throwable -> 0x0099 }
            r2.append(r3)     // Catch:{ Throwable -> 0x0099 }
            goto L_0x0095
        L_0x0087:
            if (r2 != 0) goto L_0x008c
            r2 = 100
            goto L_0x008e
        L_0x008c:
            r2 = 101(0x65, float:1.42E-43)
        L_0x008e:
            com.bytedance.crash.event.a r2 = r4.state(r2)     // Catch:{ Throwable -> 0x0099 }
            com.bytedance.crash.event.c.b(r2)     // Catch:{ Throwable -> 0x0099 }
        L_0x0095:
            r7.b(r8, r9)
            return
        L_0x0099:
            r3 = move-exception
            goto L_0x009f
        L_0x009b:
            r0 = move-exception
            goto L_0x00ba
        L_0x009d:
            r3 = move-exception
            r4 = r2
        L_0x009f:
            if (r4 != 0) goto L_0x00a9
            com.bytedance.crash.d r2 = com.bytedance.crash.d.JAVA     // Catch:{ all -> 0x009b }
            java.lang.String r4 = com.bytedance.crash.c.a.f19378b     // Catch:{ all -> 0x009b }
            com.bytedance.crash.event.a r4 = com.bytedance.crash.event.b.a(r2, r4, r0, r9)     // Catch:{ all -> 0x009b }
        L_0x00a9:
            r0 = 103(0x67, float:1.44E-43)
            com.bytedance.crash.event.a r0 = r4.state(r0)     // Catch:{ all -> 0x009b }
            com.bytedance.crash.event.a r0 = r0.errorInfo((java.lang.Throwable) r3)     // Catch:{ all -> 0x009b }
            com.bytedance.crash.event.c.b(r0)     // Catch:{ all -> 0x009b }
            r7.b(r8, r9)
            return
        L_0x00ba:
            r7.b(r8, r9)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.f.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }

    private static void a(Thread thread, Throwable th, boolean z) {
        List<g> list;
        d dVar;
        if (z) {
            list = j.b().f19342c;
            dVar = d.LAUNCH;
        } else {
            list = j.b().f19343d;
            dVar = d.JAVA;
        }
        for (g a2 : list) {
            try {
                a2.a(dVar, m.a(th), thread);
            } catch (Throwable unused) {
            }
        }
    }
}
