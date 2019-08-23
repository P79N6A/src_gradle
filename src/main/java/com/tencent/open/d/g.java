package com.tencent.open.d;

import android.os.Handler;
import android.os.HandlerThread;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.Executor;

public final class g {

    /* renamed from: a  reason: collision with root package name */
    public static final Executor f79745a = b();

    /* renamed from: b  reason: collision with root package name */
    private static Object f79746b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private static Handler f79747c;

    /* renamed from: d  reason: collision with root package name */
    private static HandlerThread f79748d;

    static class a implements Executor {

        /* renamed from: a  reason: collision with root package name */
        final Queue<Runnable> f79749a;

        /* renamed from: b  reason: collision with root package name */
        Runnable f79750b;

        private a() {
            this.f79749a = new LinkedList();
        }

        /* access modifiers changed from: protected */
        public final synchronized void a() {
            Runnable poll = this.f79749a.poll();
            this.f79750b = poll;
            if (poll != null) {
                g.f79745a.execute(this.f79750b);
            }
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final synchronized void execute(final Runnable runnable) {
            this.f79749a.offer(new Runnable() {
                public final void run() {
                    try {
                        runnable.run();
                    } finally {
                        a.this.a();
                    }
                }
            });
            if (this.f79750b == null) {
                a();
            }
        }
    }

    public static Executor a() {
        return new a((byte) 0);
    }

    private static Handler c() {
        if (f79747c == null) {
            synchronized (g.class) {
                HandlerThread handlerThread = new HandlerThread("SDK_SUB");
                f79748d = handlerThread;
                handlerThread.start();
                f79747c = new Handler(f79748d.getLooper());
            }
        }
        return f79747c;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.concurrent.Executor] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.concurrent.Executor b() {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 11
            if (r0 < r1) goto L_0x0018
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 1
            r4 = 1
            r5 = 0
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r8 = new java.util.concurrent.LinkedBlockingQueue
            r8.<init>()
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8)
            goto L_0x003d
        L_0x0018:
            java.lang.Class<android.os.AsyncTask> r0 = android.os.AsyncTask.class
            java.lang.String r1 = "sExecutor"
            java.lang.reflect.Field r0 = r0.getDeclaredField(r1)     // Catch:{ Exception -> 0x002c }
            r1 = 1
            r0.setAccessible(r1)     // Catch:{ Exception -> 0x002c }
            r1 = 0
            java.lang.Object r0 = r0.get(r1)     // Catch:{ Exception -> 0x002c }
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0     // Catch:{ Exception -> 0x002c }
            goto L_0x003d
        L_0x002c:
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r2 = 1
            r3 = 1
            r4 = 0
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.LinkedBlockingQueue r7 = new java.util.concurrent.LinkedBlockingQueue
            r7.<init>()
            r1 = r0
            r1.<init>(r2, r3, r4, r6, r7)
        L_0x003d:
            boolean r1 = r0 instanceof java.util.concurrent.ThreadPoolExecutor
            if (r1 == 0) goto L_0x0048
            r1 = r0
            java.util.concurrent.ThreadPoolExecutor r1 = (java.util.concurrent.ThreadPoolExecutor) r1
            r2 = 3
            r1.setCorePoolSize(r2)
        L_0x0048:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.open.d.g.b():java.util.concurrent.Executor");
    }

    public static void a(Runnable runnable) {
        c().post(runnable);
    }
}
