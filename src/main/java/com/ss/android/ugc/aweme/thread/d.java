package com.ss.android.ugc.aweme.thread;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.discover.jedi.adapter.SearchJediMixFeedAdapter;
import com.ss.android.ugc.aweme.thread.n;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public final class d implements n.a {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f4181a;

    /* renamed from: b  reason: collision with root package name */
    static AtomicInteger f4182b = new AtomicInteger(0);

    /* renamed from: c  reason: collision with root package name */
    public static ExecutorService f4183c = a(j, p.IO, "thread-pool-io-reject");

    /* renamed from: d  reason: collision with root package name */
    public static ExecutorService f4184d = a(i, p.DEFAULT, "thread-pool-default-reject");

    /* renamed from: e  reason: collision with root package name */
    public static long f4185e;

    /* renamed from: f  reason: collision with root package name */
    public static long f4186f;
    public static final long g = TimeUnit.SECONDS.toMillis(3);
    private static final int h = Runtime.getRuntime().availableProcessors();
    private static final int i = (h + 1);
    private static final int j = (Math.max(2, Math.min(h - 1, 6)) * 2);
    private static final int k;
    private static final int l;
    private static RejectedExecutionHandler m = new RejectedExecutionHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4187a;

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Runnable runnable2 = runnable;
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
            if (PatchProxy.isSupport(new Object[]{runnable2, threadPoolExecutor2}, this, f4187a, false, 86877, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2, threadPoolExecutor2}, this, f4187a, false, 86877, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE);
                return;
            }
            d.f4183c.execute(runnable2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.f4185e >= d.g) {
                d.f4185e = elapsedRealtime;
                g.a().a(runnable2, threadPoolExecutor2);
                return;
            }
            d.f4185e = elapsedRealtime;
        }
    };
    private static RejectedExecutionHandler n = new RejectedExecutionHandler() {

        /* renamed from: a  reason: collision with root package name */
        public static ChangeQuickRedirect f4188a;

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Runnable runnable2 = runnable;
            ThreadPoolExecutor threadPoolExecutor2 = threadPoolExecutor;
            if (PatchProxy.isSupport(new Object[]{runnable2, threadPoolExecutor2}, this, f4188a, false, 86878, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE)) {
                PatchProxy.accessDispatch(new Object[]{runnable2, threadPoolExecutor2}, this, f4188a, false, 86878, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE);
                return;
            }
            d.f4184d.execute(runnable2);
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (elapsedRealtime - d.f4186f >= d.g || h.a().f4229b) {
                d.f4186f = elapsedRealtime;
                g.a().a(runnable2, threadPoolExecutor2);
                return;
            }
            d.f4186f = elapsedRealtime;
        }
    };

    d() {
    }

    static {
        int max = Math.max(2, Math.min(h - 1, 4));
        k = max;
        l = (max * 2) + 1;
    }

    private ExecutorService a() {
        if (PatchProxy.isSupport(new Object[0], this, f4181a, false, 86866, new Class[0], ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f4181a, false, 86866, new Class[0], ExecutorService.class);
        }
        a aVar = new a(p.IO, 0, SearchJediMixFeedAdapter.f42517f, 30, TimeUnit.SECONDS, new SynchronousQueue(), a("thread-pool-io", false, 0), m);
        return aVar;
    }

    public final ExecutorService a(m mVar) {
        String str;
        long j2;
        String str2;
        BlockingQueue linkedBlockingQueue;
        RejectedExecutionHandler abortPolicy;
        String str3;
        BlockingQueue linkedBlockingQueue2;
        RejectedExecutionHandler abortPolicy2;
        m mVar2 = mVar;
        if (PatchProxy.isSupport(new Object[]{mVar2}, this, f4181a, false, 86865, new Class[]{m.class}, ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar2}, this, f4181a, false, 86865, new Class[]{m.class}, ExecutorService.class);
        }
        long j3 = 30;
        switch (mVar2.f4246b) {
            case IO:
                return a();
            case DEFAULT:
                if (PatchProxy.isSupport(new Object[0], this, f4181a, false, 86868, new Class[0], ExecutorService.class)) {
                    return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f4181a, false, 86868, new Class[0], ExecutorService.class);
                }
                a aVar = new a(p.DEFAULT, k, l, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f), a("thread-pool-default", false, 0), n);
                aVar.allowCoreThreadTimeOut(true);
                return aVar;
            case BACKGROUND:
                if (PatchProxy.isSupport(new Object[0], this, f4181a, false, 86869, new Class[0], ExecutorService.class)) {
                    return (ExecutorService) PatchProxy.accessDispatch(new Object[0], this, f4181a, false, 86869, new Class[0], ExecutorService.class);
                }
                a aVar2 = new a(p.BACKGROUND, 0, 3, 15, TimeUnit.SECONDS, new LinkedBlockingQueue(SearchJediMixFeedAdapter.f42517f), a("thread-pool-background", true, 10), n);
                return aVar2;
            case SCHEDULED:
                if (PatchProxy.isSupport(new Object[]{mVar2}, this, f4181a, false, 86870, new Class[]{m.class}, ExecutorService.class)) {
                    return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar2}, this, f4181a, false, 86870, new Class[]{m.class}, ExecutorService.class);
                }
                if (mVar2.f4247c != null) {
                    str = mVar2.f4247c;
                } else {
                    str = "thread-pool-scheduled";
                }
                ThreadFactory a2 = a(str, false, 0);
                int i2 = mVar2.f4248d;
                if (mVar2.h != null) {
                    a2 = mVar2.h;
                }
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(i2, a2);
                if (mVar2.g >= 0) {
                    j2 = mVar2.g;
                } else {
                    j2 = 15;
                }
                scheduledThreadPoolExecutor.setKeepAliveTime(j2, TimeUnit.SECONDS);
                scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
                return scheduledThreadPoolExecutor;
            case SERIAL:
                if (PatchProxy.isSupport(new Object[]{mVar2}, this, f4181a, false, 86871, new Class[]{m.class}, ExecutorService.class)) {
                    return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar2}, this, f4181a, false, 86871, new Class[]{m.class}, ExecutorService.class);
                }
                if (mVar2.f4247c != null) {
                    str2 = mVar2.f4247c;
                } else {
                    str2 = "thread-pool-serial";
                }
                ThreadFactory a3 = a(str2, false, 0);
                p pVar = p.SERIAL;
                if (mVar2.g >= 0) {
                    j3 = mVar2.g;
                }
                long j4 = j3;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (mVar2.f4249e != null) {
                    linkedBlockingQueue = mVar2.f4249e;
                } else {
                    linkedBlockingQueue = new LinkedBlockingQueue();
                }
                BlockingQueue blockingQueue = linkedBlockingQueue;
                if (mVar2.h != null) {
                    a3 = mVar2.h;
                }
                ThreadFactory threadFactory = a3;
                if (mVar2.f4250f != null) {
                    abortPolicy = mVar2.f4250f;
                } else {
                    abortPolicy = new ThreadPoolExecutor.AbortPolicy();
                }
                a aVar3 = new a(pVar, 1, 1, j4, timeUnit, blockingQueue, threadFactory, abortPolicy);
                aVar3.allowCoreThreadTimeOut(true);
                return aVar3;
            case FIXED:
                if (PatchProxy.isSupport(new Object[]{mVar2}, this, f4181a, false, 86872, new Class[]{m.class}, ExecutorService.class)) {
                    return (ExecutorService) PatchProxy.accessDispatch(new Object[]{mVar2}, this, f4181a, false, 86872, new Class[]{m.class}, ExecutorService.class);
                }
                if (mVar2.f4247c != null) {
                    str3 = mVar2.f4247c;
                } else {
                    str3 = "thread-pool-fixed";
                }
                ThreadFactory a4 = a(str3, false, 0);
                p pVar2 = p.FIXED;
                int i3 = mVar2.f4248d;
                int i4 = mVar2.f4248d;
                if (mVar2.g >= 0) {
                    j3 = mVar2.g;
                }
                long j5 = j3;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                if (mVar2.f4249e != null) {
                    linkedBlockingQueue2 = mVar2.f4249e;
                } else {
                    linkedBlockingQueue2 = new LinkedBlockingQueue();
                }
                BlockingQueue blockingQueue2 = linkedBlockingQueue2;
                if (mVar2.h != null) {
                    a4 = mVar2.h;
                }
                ThreadFactory threadFactory2 = a4;
                if (mVar2.f4250f != null) {
                    abortPolicy2 = mVar2.f4250f;
                } else {
                    abortPolicy2 = new ThreadPoolExecutor.AbortPolicy();
                }
                a aVar4 = new a(pVar2, i3, i4, j5, timeUnit2, blockingQueue2, threadFactory2, abortPolicy2);
                aVar4.allowCoreThreadTimeOut(true);
                return aVar4;
            default:
                return a();
        }
    }

    private static ExecutorService a(int i2, p pVar, String str) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{Integer.valueOf(i2), pVar, str2}, null, f4181a, true, 86867, new Class[]{Integer.TYPE, p.class, String.class}, ExecutorService.class)) {
            return (ExecutorService) PatchProxy.accessDispatch(new Object[]{Integer.valueOf(i2), pVar, str2}, null, f4181a, true, 86867, new Class[]{Integer.TYPE, p.class, String.class}, ExecutorService.class);
        }
        a aVar = new a(pVar, i2, i2, 30, TimeUnit.SECONDS, new LinkedBlockingQueue(), a(str2, false, 0));
        aVar.allowCoreThreadTimeOut(true);
        return aVar;
    }

    private static ThreadFactory a(String str, boolean z, int i2) {
        String str2 = str;
        if (PatchProxy.isSupport(new Object[]{str2, Byte.valueOf(z ? (byte) 1 : 0), Integer.valueOf(i2)}, null, f4181a, true, 86873, new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, ThreadFactory.class)) {
            return (ThreadFactory) PatchProxy.accessDispatch(new Object[]{str2, Byte.valueOf(z), Integer.valueOf(i2)}, null, f4181a, true, 86873, new Class[]{String.class, Boolean.TYPE, Integer.TYPE}, ThreadFactory.class);
        }
        return new e(i2, str2, z);
    }
}
