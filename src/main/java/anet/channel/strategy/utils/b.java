package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    b() {
    }

    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "AMDC" + a.f1419a.incrementAndGet());
        ALog.i("awcn.AmdcThreadPoolExecutor", "thread created!", null, "name", thread.getName());
        thread.setPriority(5);
        return thread;
    }
}
