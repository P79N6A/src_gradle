package com.bytedance.crash;

import android.content.Context;
import android.support.annotation.NonNull;
import com.bytedance.crash.b;
import com.bytedance.crash.runtime.b;

public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f19463a;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f19464b;

    /* renamed from: c  reason: collision with root package name */
    private static boolean f19465c;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f19466d;

    public static boolean a() {
        return f19463a;
    }

    public static b b() {
        return j.e();
    }

    public static synchronized void a(@NonNull Context context, @NonNull f fVar) {
        synchronized (i.class) {
            j.f19485d = true;
            a(context, fVar, true, false, true, true);
        }
    }

    @Deprecated
    public static void a(a aVar, d dVar) {
        b b2 = j.b();
        if (dVar == d.ALL) {
            b2.a(d.LAUNCH, aVar);
            b2.a(d.JAVA, aVar);
            b2.a(d.CUSTOM_JAVA, aVar);
            b2.a(d.NATIVE, aVar);
            b2.a(d.ANR, aVar);
            b2.a(d.DART, aVar);
            return;
        }
        b2.a(dVar, aVar);
    }

    public static void a(g gVar, d dVar) {
        b b2 = j.b();
        switch (b.AnonymousClass1.f19346a[dVar.ordinal()]) {
            case 1:
                b2.f19342c.add(gVar);
                b2.f19343d.add(gVar);
                b2.f19344e.add(gVar);
                b2.f19345f.add(gVar);
                return;
            case 2:
                b2.f19345f.add(gVar);
                return;
            case 3:
                b2.f19343d.add(gVar);
                return;
            case 4:
                b2.f19342c.add(gVar);
                return;
            case 5:
                b2.f19344e.add(gVar);
                break;
        }
    }

    public static synchronized void a(@NonNull Context context, @NonNull f fVar, boolean z, boolean z2, boolean z3) {
        synchronized (i.class) {
            a(context, fVar, true, true, true, z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00ce, code lost:
        if (r4.isDirectory() != false) goto L_0x00d0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static synchronized void a(@android.support.annotation.NonNull android.content.Context r10, @android.support.annotation.NonNull com.bytedance.crash.f r11, boolean r12, boolean r13, boolean r14, boolean r15) {
        /*
            java.lang.Class<com.bytedance.crash.i> r0 = com.bytedance.crash.i.class
            monitor-enter(r0)
            boolean r1 = f19463a     // Catch:{ all -> 0x027b }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            if (r10 == 0) goto L_0x0273
            if (r11 == 0) goto L_0x026b
            boolean r1 = r10 instanceof android.app.Application     // Catch:{ all -> 0x027b }
            if (r1 != 0) goto L_0x0015
            android.content.Context r10 = r10.getApplicationContext()     // Catch:{ all -> 0x027b }
        L_0x0015:
            boolean r1 = com.bytedance.crash.i.a.c(r10)     // Catch:{ all -> 0x027b }
            if (r1 == 0) goto L_0x001d
            monitor-exit(r0)
            return
        L_0x001d:
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x027b }
            com.bytedance.crash.j.f19483b = r1     // Catch:{ all -> 0x027b }
            com.bytedance.crash.j.f19482a = r10     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.a r1 = new com.bytedance.crash.runtime.a     // Catch:{ all -> 0x027b }
            android.content.Context r2 = com.bytedance.crash.j.f19482a     // Catch:{ all -> 0x027b }
            r1.<init>(r2, r11)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.j.f19486e = r1     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.assembly.e r11 = com.bytedance.crash.runtime.assembly.e.f19527a     // Catch:{ all -> 0x027b }
            if (r11 != 0) goto L_0x0039
            com.bytedance.crash.runtime.assembly.e r11 = new com.bytedance.crash.runtime.assembly.e     // Catch:{ all -> 0x027b }
            r11.<init>(r10)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.assembly.e.f19527a = r11     // Catch:{ all -> 0x027b }
        L_0x0039:
            com.bytedance.crash.EnsureImpl r11 = com.bytedance.crash.e.f19416a     // Catch:{ all -> 0x027b }
            com.bytedance.services.apm.api.a.f22528a = r11     // Catch:{ all -> 0x027b }
            com.bytedance.crash.db.a r11 = com.bytedance.crash.db.a.a()     // Catch:{ all -> 0x027b }
            r11.a((android.content.Context) r10)     // Catch:{ all -> 0x027b }
            r11 = 0
            com.bytedance.crash.upload.e.a(r10, r11)     // Catch:{ all -> 0x027b }
            r1 = 1
            if (r12 != 0) goto L_0x004d
            if (r13 == 0) goto L_0x006e
        L_0x004d:
            com.bytedance.crash.f.a r2 = com.bytedance.crash.f.a.f19439a     // Catch:{ all -> 0x027b }
            if (r2 != 0) goto L_0x0058
            com.bytedance.crash.f.a r2 = new com.bytedance.crash.f.a     // Catch:{ all -> 0x027b }
            r2.<init>()     // Catch:{ all -> 0x027b }
            com.bytedance.crash.f.a.f19439a = r2     // Catch:{ all -> 0x027b }
        L_0x0058:
            com.bytedance.crash.f.a r2 = com.bytedance.crash.f.a.f19439a     // Catch:{ all -> 0x027b }
            if (r13 == 0) goto L_0x0063
            com.bytedance.crash.g.b r13 = new com.bytedance.crash.g.b     // Catch:{ all -> 0x027b }
            r13.<init>(r10)     // Catch:{ all -> 0x027b }
            r2.f19440b = r13     // Catch:{ all -> 0x027b }
        L_0x0063:
            if (r12 == 0) goto L_0x006c
            com.bytedance.crash.f.c r12 = new com.bytedance.crash.f.c     // Catch:{ all -> 0x027b }
            r12.<init>(r10)     // Catch:{ all -> 0x027b }
            r2.f19441c = r12     // Catch:{ all -> 0x027b }
        L_0x006c:
            f19464b = r1     // Catch:{ all -> 0x027b }
        L_0x006e:
            f19466d = r14     // Catch:{ all -> 0x027b }
            if (r14 == 0) goto L_0x019f
            com.bytedance.crash.nativecrash.b r12 = com.bytedance.crash.nativecrash.b.a((android.content.Context) r10)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.b r13 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x027b }
            boolean r9 = r13.i     // Catch:{ all -> 0x027b }
            android.content.Context r13 = com.bytedance.crash.j.d()     // Catch:{ all -> 0x027b }
            java.lang.String r14 = "npth"
            boolean r13 = com.bytedance.crash.nativecrash.f.a(r13, r14)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a = r13     // Catch:{ all -> 0x027b }
            if (r13 == 0) goto L_0x019d
            boolean r14 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a     // Catch:{ all -> 0x027b }
            if (r14 == 0) goto L_0x0091
            com.bytedance.crash.nativecrash.NativeCrashMonitor.doSetFlogEnabled(r1)     // Catch:{ all -> 0x027b }
        L_0x0091:
            android.content.Context r14 = r12.f19494a     // Catch:{ all -> 0x027b }
            android.content.Context r2 = r12.f19494a     // Catch:{ all -> 0x027b }
            java.lang.String r2 = com.bytedance.crash.i.a.d(r2)     // Catch:{ all -> 0x027b }
            android.content.Context r3 = r12.f19494a     // Catch:{ all -> 0x027b }
            java.io.File r3 = com.bytedance.crash.i.h.b(r3)     // Catch:{ all -> 0x027b }
            java.lang.String r3 = r3.getAbsolutePath()     // Catch:{ all -> 0x027b }
            java.lang.String r12 = r12.f19495b     // Catch:{ all -> 0x027b }
            boolean r4 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a     // Catch:{ all -> 0x027b }
            if (r4 == 0) goto L_0x019d
            java.util.concurrent.atomic.AtomicBoolean r4 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19489b     // Catch:{ all -> 0x027b }
            boolean r4 = r4.compareAndSet(r11, r1)     // Catch:{ all -> 0x027b }
            if (r4 == 0) goto L_0x019d
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x027b }
            r4.<init>(r3)     // Catch:{ all -> 0x027b }
            boolean r5 = r4.exists()     // Catch:{ all -> 0x027b }
            if (r5 != 0) goto L_0x00ca
            boolean r5 = r4.mkdirs()     // Catch:{ all -> 0x027b }
            if (r5 != 0) goto L_0x00d0
            boolean r4 = r4.isDirectory()     // Catch:{ all -> 0x027b }
            if (r4 != 0) goto L_0x00d0
            goto L_0x019d
        L_0x00ca:
            boolean r4 = r4.isDirectory()     // Catch:{ all -> 0x027b }
            if (r4 == 0) goto L_0x019d
        L_0x00d0:
            java.io.File r4 = new java.io.File     // Catch:{ all -> 0x027b }
            r4.<init>(r3, r12)     // Catch:{ all -> 0x027b }
            boolean r3 = r4.mkdir()     // Catch:{ all -> 0x027b }
            if (r3 != 0) goto L_0x00e1
            boolean r3 = r4.isDirectory()     // Catch:{ all -> 0x027b }
            if (r3 == 0) goto L_0x019d
        L_0x00e1:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r3.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r4 = r4.getAbsolutePath()     // Catch:{ all -> 0x027b }
            r3.append(r4)     // Catch:{ all -> 0x027b }
            java.lang.String r4 = "/"
            r3.append(r4)     // Catch:{ all -> 0x027b }
            r3.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r12 = r3.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r3.<init>()     // Catch:{ all -> 0x027b }
            r3.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r4 = ".ind"
            r3.append(r4)     // Catch:{ all -> 0x027b }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r4.<init>()     // Catch:{ all -> 0x027b }
            r4.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r5 = ".dmp"
            r4.append(r5)     // Catch:{ all -> 0x027b }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r5.<init>()     // Catch:{ all -> 0x027b }
            r5.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r6 = ".info"
            r5.append(r6)     // Catch:{ all -> 0x027b }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r6.<init>()     // Catch:{ all -> 0x027b }
            r6.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r7 = ".log"
            r6.append(r7)     // Catch:{ all -> 0x027b }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r7.<init>()     // Catch:{ all -> 0x027b }
            r7.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r8 = ".rst"
            r7.append(r8)     // Catch:{ all -> 0x027b }
            java.lang.String r7 = r7.toString()     // Catch:{ all -> 0x027b }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x027b }
            r8.<init>()     // Catch:{ all -> 0x027b }
            r8.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r12 = ".logcat"
            r8.append(r12)     // Catch:{ all -> 0x027b }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x027b }
            int r12 = com.bytedance.crash.nativecrash.NativeCrashMonitor.doStart(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.b r2 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x027b }
            int r2 = r2.g     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.b r3 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x027b }
            int r3 = r3.h     // Catch:{ all -> 0x027b }
            boolean r4 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a     // Catch:{ all -> 0x027b }
            if (r4 == 0) goto L_0x0176
            com.bytedance.crash.nativecrash.NativeCrashMonitor.doConfigureNativeGeneratedLogcat(r2, r3)     // Catch:{ all -> 0x027b }
        L_0x0176:
            com.bytedance.crash.nativecrash.NativeCrashMonitor$1 r2 = new com.bytedance.crash.nativecrash.NativeCrashMonitor$1     // Catch:{ all -> 0x027b }
            r2.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r3 = "NPTH-CrashTimer"
            com.bytedance.crash.i.o.a(r2, r3)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.nativecrash.NativeCrashMonitor$2 r2 = new com.bytedance.crash.nativecrash.NativeCrashMonitor$2     // Catch:{ all -> 0x027b }
            r2.<init>()     // Catch:{ all -> 0x027b }
            java.lang.String r3 = "NPTH-JavaCallback"
            com.bytedance.crash.i.o.a(r2, r3)     // Catch:{ all -> 0x027b }
            boolean r2 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a     // Catch:{ all -> 0x027b }
            r3 = 4500(0x1194, float:6.306E-42)
            if (r2 == 0) goto L_0x0193
            com.bytedance.crash.nativecrash.NativeCrashMonitor.doSetMaxTimeTotal(r3)     // Catch:{ all -> 0x027b }
        L_0x0193:
            boolean r2 = com.bytedance.crash.nativecrash.NativeCrashMonitor.f19488a     // Catch:{ all -> 0x027b }
            if (r2 == 0) goto L_0x019a
            com.bytedance.crash.nativecrash.NativeCrashMonitor.doSetMaxTimeInJava(r3)     // Catch:{ all -> 0x027b }
        L_0x019a:
            com.bytedance.crash.nativecrash.d.a(r14, r12)     // Catch:{ all -> 0x027b }
        L_0x019d:
            f19466d = r13     // Catch:{ all -> 0x027b }
        L_0x019f:
            r12 = 21
            if (r15 == 0) goto L_0x01cb
            com.bytedance.crash.b.d r13 = com.bytedance.crash.b.d.a(r10)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.b.b r13 = r13.f19364a     // Catch:{ all -> 0x027b }
            boolean r14 = r13.f19355c     // Catch:{ all -> 0x027b }
            if (r14 != 0) goto L_0x01cb
            int r14 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x027b }
            if (r14 >= r12) goto L_0x01c2
            com.bytedance.crash.b.a r14 = new com.bytedance.crash.b.a     // Catch:{ all -> 0x027b }
            java.lang.String r2 = "/data/anr/"
            r3 = 8
            r14.<init>(r13, r2, r3)     // Catch:{ all -> 0x027b }
            r13.f19353a = r14     // Catch:{ all -> 0x027b }
            com.bytedance.crash.b.a r14 = r13.f19353a     // Catch:{ all -> 0x027b }
            r14.startWatching()     // Catch:{ all -> 0x027b }
            goto L_0x01c9
        L_0x01c2:
            com.bytedance.crash.b.c r14 = new com.bytedance.crash.b.c     // Catch:{ all -> 0x027b }
            r14.<init>(r13)     // Catch:{ all -> 0x027b }
            r13.f19354b = r14     // Catch:{ all -> 0x027b }
        L_0x01c9:
            r13.f19355c = r1     // Catch:{ all -> 0x027b }
        L_0x01cb:
            com.bytedance.crash.upload.c r13 = com.bytedance.crash.upload.c.a()     // Catch:{ all -> 0x027b }
            java.util.concurrent.ConcurrentLinkedQueue<com.bytedance.crash.e.b> r14 = com.bytedance.crash.upload.c.f19563a     // Catch:{ all -> 0x027b }
            boolean r14 = r14.isEmpty()     // Catch:{ all -> 0x027b }
            if (r14 == 0) goto L_0x01e1
            android.os.Handler r14 = r13.f19566b     // Catch:{ all -> 0x027b }
            java.lang.Runnable r13 = r13.f19567c     // Catch:{ all -> 0x027b }
            r2 = 30000(0x7530, double:1.4822E-319)
            r14.postDelayed(r13, r2)     // Catch:{ all -> 0x027b }
            goto L_0x01e8
        L_0x01e1:
            android.os.Handler r14 = r13.f19566b     // Catch:{ all -> 0x027b }
            java.lang.Runnable r13 = r13.f19567c     // Catch:{ all -> 0x027b }
            r14.post(r13)     // Catch:{ all -> 0x027b }
        L_0x01e8:
            com.bytedance.crash.runtime.b r13 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x027b }
            boolean r13 = r13.l     // Catch:{ all -> 0x027b }
            if (r13 == 0) goto L_0x024b
            boolean r10 = com.bytedance.crash.i.a.b(r10)     // Catch:{ all -> 0x027b }
            if (r10 == 0) goto L_0x024b
            com.bytedance.crash.c.a r10 = com.bytedance.crash.c.a.a()     // Catch:{ all -> 0x027b }
            int r13 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x027b }
            if (r13 < r12) goto L_0x024b
            boolean r12 = r10.f19383a     // Catch:{ all -> 0x027b }
            if (r12 != 0) goto L_0x024b
            r10.f19383a = r1     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.b r12 = com.bytedance.crash.j.e()     // Catch:{ all -> 0x027b }
            com.bytedance.services.slardar.config.IConfigManager r13 = com.bytedance.crash.runtime.b.b()     // Catch:{ all -> 0x027b }
            if (r13 == 0) goto L_0x0223
            com.bytedance.services.slardar.config.IConfigManager r13 = com.bytedance.crash.runtime.b.b()     // Catch:{ all -> 0x027b }
            java.lang.String r14 = "caton_interval"
            long r2 = r12.k     // Catch:{ all -> 0x027b }
            int r2 = (int) r2     // Catch:{ all -> 0x027b }
            int r13 = r13.getConfigInt(r14, r2)     // Catch:{ all -> 0x027b }
            long r13 = (long) r13     // Catch:{ all -> 0x027b }
            r2 = 10
            int r4 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0223
            goto L_0x0225
        L_0x0223:
            long r13 = r12.k     // Catch:{ all -> 0x027b }
        L_0x0225:
            com.bytedance.crash.runtime.f r12 = com.bytedance.crash.runtime.f.a()     // Catch:{ all -> 0x027b }
            android.util.Printer r2 = r10.f19386d     // Catch:{ all -> 0x027b }
            r12.b(r2)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.f r12 = com.bytedance.crash.runtime.f.a()     // Catch:{ all -> 0x027b }
            java.lang.Runnable r2 = r10.f19387e     // Catch:{ all -> 0x027b }
            r12.a((long) r13, (java.lang.Runnable) r2)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.f r12 = com.bytedance.crash.runtime.f.a()     // Catch:{ all -> 0x027b }
            r13 = 4900(0x1324, double:2.421E-320)
            java.lang.Runnable r2 = r10.f19388f     // Catch:{ all -> 0x027b }
            r12.a((long) r13, (java.lang.Runnable) r2)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.runtime.f r12 = com.bytedance.crash.runtime.f.a()     // Catch:{ all -> 0x027b }
            android.util.Printer r10 = r10.g     // Catch:{ all -> 0x027b }
            r12.a((android.util.Printer) r10)     // Catch:{ all -> 0x027b }
        L_0x024b:
            boolean r10 = com.bytedance.crash.f.d.f19448a     // Catch:{ all -> 0x027b }
            if (r10 != 0) goto L_0x0265
            com.bytedance.crash.f.d.f19448a = r1     // Catch:{ all -> 0x027b }
            android.os.Handler r10 = new android.os.Handler     // Catch:{ all -> 0x027b }
            android.os.Looper r12 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x027b }
            r10.<init>(r12)     // Catch:{ all -> 0x027b }
            com.bytedance.crash.f.d$a r12 = new com.bytedance.crash.f.d$a     // Catch:{ all -> 0x027b }
            r12.<init>(r11)     // Catch:{ all -> 0x027b }
            r13 = 60000(0xea60, double:2.9644E-319)
            r10.postDelayed(r12, r13)     // Catch:{ all -> 0x027b }
        L_0x0265:
            f19463a = r1     // Catch:{ all -> 0x027b }
            f19465c = r15     // Catch:{ all -> 0x027b }
            monitor-exit(r0)
            return
        L_0x026b:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x027b }
            java.lang.String r11 = "params must be not null."
            r10.<init>(r11)     // Catch:{ all -> 0x027b }
            throw r10     // Catch:{ all -> 0x027b }
        L_0x0273:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x027b }
            java.lang.String r11 = "context must be not null."
            r10.<init>(r11)     // Catch:{ all -> 0x027b }
            throw r10     // Catch:{ all -> 0x027b }
        L_0x027b:
            r10 = move-exception
            monitor-exit(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.i.a(android.content.Context, com.bytedance.crash.f, boolean, boolean, boolean, boolean):void");
    }
}
