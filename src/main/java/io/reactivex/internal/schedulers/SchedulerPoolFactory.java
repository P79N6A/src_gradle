package io.reactivex.internal.schedulers;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class SchedulerPoolFactory {
    static final Map<ScheduledThreadPoolExecutor, Object> POOLS = new ConcurrentHashMap();
    public static final boolean PURGE_ENABLED;
    public static final int PURGE_PERIOD_SECONDS;
    static final AtomicReference<ScheduledExecutorService> PURGE_THREAD = new AtomicReference<>();

    static final class PurgeProperties {
        boolean purgeEnable;
        int purgePeriod;

        PurgeProperties() {
        }

        /* access modifiers changed from: package-private */
        public final void load(Properties properties) {
            if (properties.containsKey("rx2.purge-enabled")) {
                this.purgeEnable = Boolean.parseBoolean(properties.getProperty("rx2.purge-enabled"));
            } else {
                this.purgeEnable = true;
            }
            if (this.purgeEnable && properties.containsKey("rx2.purge-period-seconds")) {
                try {
                    this.purgePeriod = Integer.parseInt(properties.getProperty("rx2.purge-period-seconds"));
                    return;
                } catch (NumberFormatException unused) {
                }
            }
            this.purgePeriod = 1;
        }
    }

    static final class ScheduledTask implements Runnable {
        ScheduledTask() {
        }

        public final void run() {
            Iterator it2 = new ArrayList(SchedulerPoolFactory.POOLS.keySet()).iterator();
            while (it2.hasNext()) {
                ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = (ScheduledThreadPoolExecutor) it2.next();
                if (scheduledThreadPoolExecutor.isShutdown()) {
                    SchedulerPoolFactory.POOLS.remove(scheduledThreadPoolExecutor);
                } else {
                    scheduledThreadPoolExecutor.purge();
                }
            }
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

    public static void start() {
        tryStart(PURGE_ENABLED);
    }

    private SchedulerPoolFactory() {
        throw new IllegalStateException("No instances!");
    }

    public static void shutdown() {
        ScheduledExecutorService andSet = PURGE_THREAD.getAndSet(null);
        if (andSet != null) {
            andSet.shutdownNow();
        }
        POOLS.clear();
    }

    static {
        Properties properties = System.getProperties();
        PurgeProperties purgeProperties = new PurgeProperties();
        purgeProperties.load(properties);
        PURGE_ENABLED = purgeProperties.purgeEnable;
        PURGE_PERIOD_SECONDS = purgeProperties.purgePeriod;
        start();
    }

    public static ScheduledExecutorService create(ThreadFactory threadFactory) {
        ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1, threadFactory);
        tryPutIntoPool(PURGE_ENABLED, com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool);
        return com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool;
    }

    static void tryStart(boolean z) {
        if (z) {
            while (true) {
                ScheduledExecutorService scheduledExecutorService = PURGE_THREAD.get();
                if (scheduledExecutorService == null) {
                    ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool(1, new RxThreadFactory("RxSchedulerPurge"));
                    if (PURGE_THREAD.compareAndSet(scheduledExecutorService, com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool)) {
                        com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool.scheduleAtFixedRate(new ScheduledTask(), (long) PURGE_PERIOD_SECONDS, (long) PURGE_PERIOD_SECONDS, TimeUnit.SECONDS);
                        return;
                    }
                    com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newScheduledThreadPool.shutdownNow();
                } else {
                    return;
                }
            }
        }
    }

    static void tryPutIntoPool(boolean z, ScheduledExecutorService scheduledExecutorService) {
        if (z && (scheduledExecutorService instanceof ScheduledThreadPoolExecutor)) {
            POOLS.put((ScheduledThreadPoolExecutor) scheduledExecutorService, scheduledExecutorService);
        }
    }
}
