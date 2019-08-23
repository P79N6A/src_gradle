package anetwork.channel.entity;

import java.util.concurrent.ThreadFactory;

public final class b implements ThreadFactory {
    b() {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format("RepeaterThread:%d", new Object[]{Integer.valueOf(a.f1529b.getAndIncrement())}));
    }
}
