package com.ss.android.ugc.aweme.app;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.ss.android.ugc.aweme.framework.a.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadPoolExecutor;

public final class y extends ThreadPoolExecutor.AbortPolicy {

    /* renamed from: a  reason: collision with root package name */
    public static ChangeQuickRedirect f2704a;

    public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        if (PatchProxy.isSupport(new Object[]{runnable, threadPoolExecutor}, this, f2704a, false, 22466, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE)) {
            PatchProxy.accessDispatch(new Object[]{runnable, threadPoolExecutor}, this, f2704a, false, 22466, new Class[]{Runnable.class, ThreadPoolExecutor.class}, Void.TYPE);
            return;
        }
        try {
            super.rejectedExecution(runnable, threadPoolExecutor);
        } catch (RejectedExecutionException e2) {
            RejectedExecutionException rejectedExecutionException = e2;
            BlockingQueue<Runnable> queue = threadPoolExecutor.getQueue();
            a.a(rejectedExecutionException.getMessage() + " Pending tasks: " + queue);
        }
    }
}
