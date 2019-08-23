package com.facebook.common.executors;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;

public final class b extends a implements f {
    public b(Executor executor) {
        super("SerialExecutor", 1, executor, new LinkedBlockingQueue());
    }

    public final synchronized void execute(Runnable runnable) {
        super.execute(runnable);
    }
}
