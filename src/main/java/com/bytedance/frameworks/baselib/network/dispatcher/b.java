package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.frameworks.baselib.network.dispatcher.IRequest;
import java.util.concurrent.BlockingQueue;

public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f19726a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<IRequest> f19727b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<IRequest> f19728c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                IRequest take = this.f19727b.take();
                ApiThread apiThread = null;
                if (take instanceof ApiThread) {
                    apiThread = (ApiThread) take;
                }
                if (apiThread != null) {
                    String name = Thread.currentThread().getName();
                    String name2 = apiThread.getName();
                    try {
                        if (!apiThread.isCanceled()) {
                            if (!StringUtils.isEmpty(name2) && !StringUtils.isEmpty(name)) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.setName("ApiLocalDispatcher-" + name2);
                            }
                            if (Logger.debug()) {
                                this.f19727b.size();
                                this.f19728c.size();
                            }
                            if (!apiThread.run4Local()) {
                                if (apiThread.getPriority() == IRequest.Priority.IMMEDIATE) {
                                    ThreadPlus.submitRunnable(apiThread);
                                } else {
                                    apiThread.sendEnQueueExpireMsg();
                                    this.f19728c.add(apiThread);
                                }
                            }
                            if (!StringUtils.isEmpty(name2) && !StringUtils.isEmpty(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f19726a) {
                    return;
                }
            }
        }
    }

    public b(BlockingQueue<IRequest> blockingQueue, BlockingQueue<IRequest> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f19727b = blockingQueue;
        this.f19728c = blockingQueue2;
    }
}
