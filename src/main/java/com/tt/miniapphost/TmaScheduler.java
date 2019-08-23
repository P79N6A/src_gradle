package com.tt.miniapphost;

import android.support.annotation.NonNull;
import com.storage.async.Scheduler;
import com.tt.miniapphost.process.annotation.AnyProcess;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

@AnyProcess
public class TmaScheduler implements Scheduler {
    public AtomicInteger mCount;
    private ThreadPoolExecutor mExecutor;

    static class Holder {
        public static TmaScheduler sInstance = new TmaScheduler();

        private Holder() {
        }
    }

    @AnyProcess
    public static TmaScheduler getInst() {
        return Holder.sInstance;
    }

    @AnyProcess
    private TmaScheduler() {
        this.mCount = new AtomicInteger();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(true), new ThreadFactory() {
            public Thread newThread(@NonNull Runnable runnable) {
                return new Thread(runnable, "TmaThread-" + TmaScheduler.this.mCount.getAndIncrement());
            }
        });
        this.mExecutor = threadPoolExecutor;
    }

    @AnyProcess
    public void execute(Runnable runnable) {
        this.mExecutor.execute(runnable);
    }
}
