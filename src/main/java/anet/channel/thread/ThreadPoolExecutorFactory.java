package anet.channel.thread;

import anet.channel.util.ALog;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class ThreadPoolExecutorFactory {

    /* renamed from: a  reason: collision with root package name */
    private static ScheduledThreadPoolExecutor f1421a = new ScheduledThreadPoolExecutor(1, new b("AWCN Scheduler"));

    /* renamed from: b  reason: collision with root package name */
    private static ThreadPoolExecutor f1422b;

    /* renamed from: c  reason: collision with root package name */
    private static ThreadPoolExecutor f1423c;

    /* renamed from: d  reason: collision with root package name */
    private static ThreadPoolExecutor f1424d;

    /* renamed from: e  reason: collision with root package name */
    private static ThreadPoolExecutor f1425e;

    public static class Priority {
        public static int HIGH = 0;
        public static int LOW = 9;
        public static int NORMAL = 1;
    }

    static class a implements Comparable<a>, Runnable {

        /* renamed from: a  reason: collision with root package name */
        Runnable f1426a;

        /* renamed from: b  reason: collision with root package name */
        int f1427b;

        /* renamed from: c  reason: collision with root package name */
        long f1428c = System.currentTimeMillis();

        public void run() {
            this.f1426a.run();
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            if (this.f1427b != aVar.f1427b) {
                return this.f1427b - aVar.f1427b;
            }
            return (int) (aVar.f1428c - this.f1428c);
        }

        public a(Runnable runnable, int i) {
            this.f1426a = runnable;
            this.f1427b = i;
            this.f1428c = System.currentTimeMillis();
        }
    }

    static class b implements ThreadFactory {

        /* renamed from: a  reason: collision with root package name */
        AtomicInteger f1429a = new AtomicInteger(0);

        /* renamed from: b  reason: collision with root package name */
        String f1430b;

        b(String str) {
            this.f1430b = str;
        }

        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, this.f1430b + this.f1429a.incrementAndGet());
            ALog.i("awcn.ThreadPoolExecutorFactory", "thread created!", null, "name", thread.getName());
            thread.setPriority(5);
            return thread;
        }
    }

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new b("AWCN Worker(H)"));
        f1422b = threadPoolExecutor;
        a aVar = new a(16, 16, 60, TimeUnit.SECONDS, new PriorityBlockingQueue(), new b("AWCN Worker(M)"));
        f1423c = aVar;
        ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(2, 2, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new b("AWCN Worker(L)"));
        f1424d = threadPoolExecutor2;
        ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(32, 32, 60, TimeUnit.SECONDS, new LinkedBlockingDeque(), new b("AWCN Worker(Backup)"));
        f1425e = threadPoolExecutor3;
        f1422b.allowCoreThreadTimeOut(true);
        f1423c.allowCoreThreadTimeOut(true);
        f1424d.allowCoreThreadTimeOut(true);
        f1425e.allowCoreThreadTimeOut(true);
    }

    public static void removeScheduleTask(Runnable runnable) {
        f1421a.remove(runnable);
    }

    public static Future<?> submitBackupTask(Runnable runnable) {
        return f1425e.submit(runnable);
    }

    public static Future<?> submitScheduledTask(Runnable runnable) {
        return f1421a.submit(runnable);
    }

    public static synchronized void setNormalExecutorPoolSize(int i) {
        synchronized (ThreadPoolExecutorFactory.class) {
            if (i < 6) {
                i = 6;
            }
            f1423c.setCorePoolSize(i);
            f1423c.setMaximumPoolSize(i);
        }
    }

    public static Future<?> submitPriorityTask(Runnable runnable, int i) {
        if (ALog.isPrintLog(1)) {
            ALog.d("awcn.ThreadPoolExecutorFactory", "submit priority task", null, "priority", Integer.valueOf(i));
        }
        if (i < Priority.HIGH || i > Priority.LOW) {
            i = Priority.LOW;
        }
        if (i == Priority.HIGH) {
            return f1422b.submit(runnable);
        }
        if (i == Priority.LOW) {
            return f1424d.submit(runnable);
        }
        return f1423c.submit(new a(runnable, i));
    }

    public static Future<?> submitScheduledTask(Runnable runnable, long j, TimeUnit timeUnit) {
        return f1421a.schedule(runnable, j, timeUnit);
    }
}
