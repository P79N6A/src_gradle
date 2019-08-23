package com.bytedance.crash.f;

import java.lang.Thread;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile boolean f19448a;

    /* renamed from: b  reason: collision with root package name */
    public static volatile boolean f19449b;

    public static class a implements Runnable, Thread.UncaughtExceptionHandler {

        /* renamed from: a  reason: collision with root package name */
        private volatile Thread.UncaughtExceptionHandler f19450a;

        private a() {
        }

        public final void run() {
            this.f19450a = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f19450a != this) {
                Thread.setDefaultUncaughtExceptionHandler(this);
            }
        }

        public /* synthetic */ a(byte b2) {
            this();
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0023, code lost:
            r4.f19450a.uncaughtException(r5, r6);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0028, code lost:
            return;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x003f, code lost:
            if (r4.f19450a != r4) goto L_0x0023;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
            if (r4.f19450a != r4) goto L_0x0023;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void uncaughtException(java.lang.Thread r5, java.lang.Throwable r6) {
            /*
                r4 = this;
                boolean r0 = com.bytedance.crash.f.a.a()     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                if (r0 == 0) goto L_0x0009
                com.bytedance.crash.d r0 = com.bytedance.crash.d.LAUNCH     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                goto L_0x000b
            L_0x0009:
                com.bytedance.crash.d r0 = com.bytedance.crash.d.JAVA     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
            L_0x000b:
                java.lang.String r1 = com.bytedance.crash.c.a.f19377a     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                long r2 = java.lang.System.currentTimeMillis()     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                com.bytedance.crash.event.a r0 = com.bytedance.crash.event.b.a(r0, r1, r2, r6)     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                com.bytedance.crash.event.c.a((com.bytedance.crash.event.a) r0)     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                r0 = 1
                com.bytedance.crash.f.d.f19449b = r0     // Catch:{ Throwable -> 0x0038, all -> 0x0029 }
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f19450a
                if (r0 == 0) goto L_0x0042
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f19450a
                if (r0 == r4) goto L_0x0042
            L_0x0023:
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f19450a
                r0.uncaughtException(r5, r6)
                return
            L_0x0029:
                r0 = move-exception
                java.lang.Thread$UncaughtExceptionHandler r1 = r4.f19450a
                if (r1 == 0) goto L_0x0037
                java.lang.Thread$UncaughtExceptionHandler r1 = r4.f19450a
                if (r1 == r4) goto L_0x0037
                java.lang.Thread$UncaughtExceptionHandler r1 = r4.f19450a
                r1.uncaughtException(r5, r6)
            L_0x0037:
                throw r0
            L_0x0038:
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f19450a
                if (r0 == 0) goto L_0x0042
                java.lang.Thread$UncaughtExceptionHandler r0 = r4.f19450a
                if (r0 == r4) goto L_0x0042
                goto L_0x0023
            L_0x0042:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.f.d.a.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
        }
    }
}
