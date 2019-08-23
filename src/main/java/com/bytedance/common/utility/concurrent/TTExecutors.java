package com.bytedance.common.utility.concurrent;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class TTExecutors {
    public static final int AVAILABLEPROCESSORS;
    public static final int CORE_POOL_SIZE_CPU = Math.max(2, Math.min(CPU_COUNT - 1, 3));
    public static final int CORE_POOL_SIZE_NORMAL;
    public static final int CPU_COUNT;
    public static final int MAXIMUM_POOL_SIZE_CPU = ((CPU_COUNT * 2) + 1);
    public static final int MAXIMUM_POOL_SIZE_NORMAL;
    private static ExecutorService sCPUThreadPool;
    private static final DefaultThreadFactory sCpuThreadFactory = new DefaultThreadFactory("TTCpuExecutors");
    private static final DefaultThreadFactory sDefaultThreadFactory = new DefaultThreadFactory("TTDefaultExecutors");
    private static final DefaultThreadFactory sDownLoadThreadFactory = new DefaultThreadFactory("TTDownLoadExecutors");
    private static ExecutorService sDownLoadThreadPool;
    private static final RejectedExecutionHandler sHandler = new RejectedExecutionHandler() {
        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            Executors.newCachedThreadPool().execute(runnable);
        }
    };
    private static ExecutorService sNormalThreadPool;
    private static final BlockingQueue<Runnable> sPoolWorkQueue = new LinkedBlockingQueue();
    private static final BlockingQueue<Runnable> sPoolWorkQueue_Cpu = new LinkedBlockingQueue();
    private static final BlockingQueue<Runnable> sPoolWorkQueue_Download = new LinkedBlockingQueue();
    private static final DefaultThreadFactory sScheduledThreadFactory = new DefaultThreadFactory("TTScheduledExecutors");
    private static ScheduledExecutorService sScheduledThreadPool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(3, sScheduledThreadFactory);

    static class DefaultThreadFactory implements ThreadFactory {
        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final ThreadGroup group;
        private final String namePrefix;
        private final AtomicInteger threadNumber = new AtomicInteger(1);

        public Thread newThread(Runnable runnable) {
            ThreadGroup threadGroup = this.group;
            Thread thread = new Thread(threadGroup, runnable, this.namePrefix + this.threadNumber.getAndIncrement(), 0);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }

        DefaultThreadFactory(String str) {
            ThreadGroup threadGroup;
            SecurityManager securityManager = System.getSecurityManager();
            if (securityManager != null) {
                threadGroup = securityManager.getThreadGroup();
            } else {
                threadGroup = Thread.currentThread().getThreadGroup();
            }
            this.group = threadGroup;
            this.namePrefix = str + "-" + poolNumber.getAndIncrement() + "-Thread-";
        }
    }

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(int i, ThreadFactory threadFactory) {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(i).a(threadFactory).a());
        }
    }

    public static ExecutorService getCPUThreadPool() {
        return sCPUThreadPool;
    }

    public static ExecutorService getDownLoadThreadPool() {
        return sDownLoadThreadPool;
    }

    public static ExecutorService getNormalExecutor() {
        return sNormalThreadPool;
    }

    public static ScheduledExecutorService getScheduledThreadPool() {
        return sScheduledThreadPool;
    }

    static {
        int i;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        AVAILABLEPROCESSORS = availableProcessors;
        if (availableProcessors > 0) {
            i = AVAILABLEPROCESSORS;
        } else {
            i = 1;
        }
        CPU_COUNT = i;
        int max = Math.max(2, Math.min(CPU_COUNT - 1, 6)) * 2;
        CORE_POOL_SIZE_NORMAL = max;
        MAXIMUM_POOL_SIZE_NORMAL = (max * 2) + 1;
        TTThreadPoolExecutor tTThreadPoolExecutor = new TTThreadPoolExecutor(CORE_POOL_SIZE_NORMAL, MAXIMUM_POOL_SIZE_NORMAL, 30, TimeUnit.SECONDS, sPoolWorkQueue, sDefaultThreadFactory, sHandler);
        sNormalThreadPool = tTThreadPoolExecutor;
        tTThreadPoolExecutor.allowCoreThreadTimeOut(true);
        TTThreadPoolExecutor tTThreadPoolExecutor2 = new TTThreadPoolExecutor(CORE_POOL_SIZE_CPU, MAXIMUM_POOL_SIZE_CPU, 30, TimeUnit.SECONDS, sPoolWorkQueue_Cpu, sCpuThreadFactory, sHandler);
        sCPUThreadPool = tTThreadPoolExecutor2;
        tTThreadPoolExecutor2.allowCoreThreadTimeOut(true);
        TTThreadPoolExecutor tTThreadPoolExecutor3 = new TTThreadPoolExecutor(2, 2, 30, TimeUnit.SECONDS, sPoolWorkQueue_Download, sDownLoadThreadFactory, sHandler);
        sDownLoadThreadPool = tTThreadPoolExecutor3;
        tTThreadPoolExecutor3.allowCoreThreadTimeOut(true);
    }

    public static void setNormalThreadPool(ExecutorService executorService) {
        sNormalThreadPool = executorService;
    }
}
