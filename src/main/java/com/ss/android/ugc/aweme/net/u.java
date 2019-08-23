package com.ss.android.ugc.aweme.net;

import android.os.Looper;
import android.os.Process;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.WeakHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class u implements WeakHandler.IHandler {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f57016a;

    /* renamed from: f  reason: collision with root package name */
    private static AtomicInteger f57017f = new AtomicInteger();
    private static volatile u g;

    /* renamed from: b  reason: collision with root package name */
    WeakHandler f57018b = new WeakHandler(Looper.getMainLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    private ThreadPoolExecutor f57019c;

    /* renamed from: d  reason: collision with root package name */
    private ThreadPoolExecutor f57020d;

    /* renamed from: e  reason: collision with root package name */
    private ThreadPoolExecutor f57021e;

    class a implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f57022a;

        /* renamed from: c  reason: collision with root package name */
        private final AtomicInteger f57024c = new AtomicInteger(1);

        /* renamed from: d  reason: collision with root package name */
        private String f57025d = "ApiExecutor";

        public final Thread newThread(@NonNull Runnable runnable) {
            if (PatchProxy.isSupport(new Object[]{runnable}, this, f57022a, false, 60766, new Class[]{Runnable.class}, Thread.class)) {
                return (Thread) PatchProxy.accessDispatch(new Object[]{runnable}, this, f57022a, false, 60766, new Class[]{Runnable.class}, Thread.class);
            }
            final String str = this.f57025d + "#" + this.f57024c.getAndIncrement();
            AnonymousClass1 r1 = new Thread(runnable, str) {

                /* renamed from: a  reason: collision with root package name */
                public static ChangeQuickRedirect f57026a;

                public final void run() {
                    if (PatchProxy.isSupport(new Object[0], this, f57026a, false, 60767, new Class[0], Void.TYPE)) {
                        PatchProxy.accessDispatch(new Object[0], this, f57026a, false, 60767, new Class[0], Void.TYPE);
                        return;
                    }
                    Process.setThreadPriority(10);
                    new StringBuilder("newThread:").append(str);
                    super.run();
                }
            };
            r1.setDaemon(false);
            return r1;
        }

        a(String str) {
            if (!TextUtils.isEmpty(str)) {
                this.f57025d = str;
            }
        }
    }

    private u() {
    }

    static int b() {
        if (PatchProxy.isSupport(new Object[0], null, f57016a, true, 60759, new Class[0], Integer.TYPE)) {
            return ((Integer) PatchProxy.accessDispatch(new Object[0], null, f57016a, true, 60759, new Class[0], Integer.TYPE)).intValue();
        }
        return f57017f.incrementAndGet();
    }

    public static u a() {
        if (PatchProxy.isSupport(new Object[0], null, f57016a, true, 60758, new Class[0], u.class)) {
            return (u) PatchProxy.accessDispatch(new Object[0], null, f57016a, true, 60758, new Class[0], u.class);
        }
        if (g == null) {
            synchronized (u.class) {
                if (g == null) {
                    g = new u();
                }
            }
        }
        return g;
    }

    /* access modifiers changed from: package-private */
    public synchronized ExecutorService c() {
        if (PatchProxy.isSupport(new Object[0], this, f57016a, false, 60760, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f57016a, false, 60760, new Class[0], ExecutorService.class);
        }
        if (this.f57019c == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 10, TimeUnit.SECONDS, new SynchronousQueue(), new a("NetImmediate"));
            this.f57019c = threadPoolExecutor;
        }
        return this.f57019c;
    }

    /* access modifiers changed from: package-private */
    public synchronized ExecutorService d() {
        if (PatchProxy.isSupport(new Object[0], this, f57016a, false, 60761, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f57016a, false, 60761, new Class[0], ExecutorService.class);
        }
        if (this.f57020d == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8, 30, TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetNormal"));
            this.f57020d = threadPoolExecutor;
            this.f57020d.allowCoreThreadTimeOut(true);
        }
        return this.f57020d;
    }

    /* access modifiers changed from: package-private */
    public synchronized ExecutorService e() {
        if (PatchProxy.isSupport(new Object[0], this, f57016a, false, 60762, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f57016a, false, 60762, new Class[0], ExecutorService.class);
        }
        if (this.f57021e == null) {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(8, 8, 10, TimeUnit.SECONDS, new PriorityBlockingQueue(), new a("NetDownload"));
            this.f57021e = threadPoolExecutor;
            this.f57021e.allowCoreThreadTimeOut(true);
        }
        return this.f57021e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x005d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void handleMsg(android.os.Message r18) {
        /*
            r17 = this;
            r0 = r18
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r9 = 0
            r2[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r4 = f57016a
            java.lang.Class[] r7 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r3 = android.os.Message.class
            r7[r9] = r3
            java.lang.Class r8 = java.lang.Void.TYPE
            r5 = 0
            r6 = 60765(0xed5d, float:8.515E-41)
            r3 = r17
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7, r8)
            if (r2 == 0) goto L_0x0036
            java.lang.Object[] r10 = new java.lang.Object[r1]
            r10[r9] = r0
            com.meituan.robust.ChangeQuickRedirect r12 = f57016a
            r13 = 0
            r14 = 60765(0xed5d, float:8.515E-41)
            java.lang.Class[] r15 = new java.lang.Class[r1]
            java.lang.Class<android.os.Message> r0 = android.os.Message.class
            r15[r9] = r0
            java.lang.Class r16 = java.lang.Void.TYPE
            r11 = r17
            com.meituan.robust.PatchProxy.accessDispatch(r10, r11, r12, r13, r14, r15, r16)
            return
        L_0x0036:
            if (r0 == 0) goto L_0x005f
            java.lang.Object r1 = r0.obj
            boolean r1 = r1 instanceof java.lang.Runnable
            if (r1 != 0) goto L_0x003f
            goto L_0x005f
        L_0x003f:
            int r1 = r0.what     // Catch:{ Throwable -> 0x005e }
            switch(r1) {
                case 0: goto L_0x0051;
                case 1: goto L_0x0045;
                default: goto L_0x0044;
            }     // Catch:{ Throwable -> 0x005e }
        L_0x0044:
            goto L_0x005d
        L_0x0045:
            java.util.concurrent.ExecutorService r1 = r17.c()     // Catch:{ Throwable -> 0x005e }
            java.lang.Object r0 = r0.obj     // Catch:{ Throwable -> 0x005e }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ Throwable -> 0x005e }
            r1.execute(r0)     // Catch:{ Throwable -> 0x005e }
            goto L_0x005d
        L_0x0051:
            java.util.concurrent.ExecutorService r1 = r17.d()     // Catch:{ Throwable -> 0x005e }
            java.lang.Object r0 = r0.obj     // Catch:{ Throwable -> 0x005e }
            java.lang.Runnable r0 = (java.lang.Runnable) r0     // Catch:{ Throwable -> 0x005e }
            r1.execute(r0)     // Catch:{ Throwable -> 0x005e }
            goto L_0x005e
        L_0x005d:
            return
        L_0x005e:
            return
        L_0x005f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.net.u.handleMsg(android.os.Message):void");
    }
}
