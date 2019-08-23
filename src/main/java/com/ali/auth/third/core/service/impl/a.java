package com.ali.auth.third.core.service.impl;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.ali.auth.third.core.service.MemberExecutorService;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public final class a implements MemberExecutorService {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f4951a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private ThreadPoolExecutor f4952b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<Runnable> f4953c = new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f);

    /* renamed from: d  reason: collision with root package name */
    private final HandlerThread f4954d = new HandlerThread("SDK Looper Thread");

    /* renamed from: e  reason: collision with root package name */
    private final Handler f4955e;

    /* renamed from: com.ali.auth.third.core.service.impl.a$a  reason: collision with other inner class name */
    public static class C0035a implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        private BlockingQueue<Runnable> f4956a;

        public C0035a(BlockingQueue<Runnable> blockingQueue) {
            this.f4956a = blockingQueue;
        }

        private Object a(Object obj) {
            try {
                Field declaredField = obj.getClass().getDeclaredField("this$0");
                declaredField.setAccessible(true);
                return declaredField.get(obj);
            } catch (Exception unused) {
                return obj;
            }
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Object[] array = this.f4956a.toArray();
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            for (Object obj : array) {
                sb.append(obj.getClass().isAnonymousClass() ? a(obj) : obj.getClass());
                sb.append(',');
                sb.append(' ');
            }
            sb.append(']');
            throw new RejectedExecutionException("Task " + runnable.toString() + " rejected from " + threadPoolExecutor.toString() + " in " + sb.toString());
        }
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:2:0x0028 */
    /* JADX WARNING: Removed duplicated region for block: B:2:0x0028 A[LOOP:0: B:2:0x0028->B:15:0x0028, LOOP_START, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a() {
        /*
            r11 = this;
            r11.<init>()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r0.<init>(r1)
            r11.f4951a = r0
            java.util.concurrent.LinkedBlockingQueue r0 = new java.util.concurrent.LinkedBlockingQueue
            r1 = 128(0x80, float:1.794E-43)
            r0.<init>(r1)
            r11.f4953c = r0
            android.os.HandlerThread r0 = new android.os.HandlerThread
            java.lang.String r1 = "SDK Looper Thread"
            r0.<init>(r1)
            r11.f4954d = r0
            android.os.HandlerThread r0 = r11.f4954d
            r0.start()
            android.os.HandlerThread r0 = r11.f4954d
            monitor-enter(r0)
        L_0x0028:
            android.os.HandlerThread r1 = r11.f4954d     // Catch:{ all -> 0x0063 }
            android.os.Looper r1 = r1.getLooper()     // Catch:{ all -> 0x0063 }
            if (r1 != 0) goto L_0x0036
            android.os.HandlerThread r1 = r11.f4954d     // Catch:{ InterruptedException -> 0x0028 }
            r1.wait()     // Catch:{ InterruptedException -> 0x0028 }
            goto L_0x0028
        L_0x0036:
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            android.os.Handler r0 = new android.os.Handler
            android.os.HandlerThread r1 = r11.f4954d
            android.os.Looper r1 = r1.getLooper()
            r0.<init>(r1)
            r11.f4955e = r0
            com.ali.auth.third.core.service.impl.b r9 = new com.ali.auth.third.core.service.impl.b
            r9.<init>(r11)
            java.util.concurrent.ThreadPoolExecutor r0 = new java.util.concurrent.ThreadPoolExecutor
            r3 = 8
            r4 = 16
            r5 = 1
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.SECONDS
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r8 = r11.f4953c
            com.ali.auth.third.core.service.impl.a$a r10 = new com.ali.auth.third.core.service.impl.a$a
            java.util.concurrent.BlockingQueue<java.lang.Runnable> r1 = r11.f4953c
            r10.<init>(r1)
            r2 = r0
            r2.<init>(r3, r4, r5, r7, r8, r9, r10)
            r11.f4952b = r0
            return
        L_0x0063:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0063 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ali.auth.third.core.service.impl.a.<init>():void");
    }

    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f4952b.awaitTermination(j, timeUnit);
    }

    public final void execute(Runnable runnable) {
        this.f4952b.execute(runnable);
    }

    public final Looper getDefaultLooper() {
        return this.f4954d.getLooper();
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f4952b.invokeAll(collection);
    }

    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.f4952b.invokeAll(collection, j, timeUnit);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return this.f4952b.invokeAny(collection);
    }

    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return this.f4952b.invokeAny(collection, j, timeUnit);
    }

    public final boolean isShutdown() {
        return this.f4952b.isShutdown();
    }

    public final boolean isTerminated() {
        return this.f4952b.isTerminated();
    }

    public final void postHandlerTask(Runnable runnable) {
        this.f4955e.post(runnable);
    }

    public final void postTask(Runnable runnable) {
        this.f4952b.execute(runnable);
    }

    public final void postUITask(Runnable runnable) {
        this.f4951a.post(new c(this, runnable));
    }

    public final void shutdown() {
        this.f4952b.shutdown();
    }

    public final List<Runnable> shutdownNow() {
        return this.f4952b.shutdownNow();
    }

    public final Future<?> submit(Runnable runnable) {
        return this.f4952b.submit(runnable);
    }

    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.f4952b.submit(runnable, t);
    }

    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f4952b.submit(callable);
    }
}
