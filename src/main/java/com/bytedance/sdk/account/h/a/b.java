package com.bytedance.sdk.account.h.a;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.sdk.account.h.a.e;
import java.util.concurrent.BlockingQueue;

public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f22419a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<e> f22420b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<e> f22421c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                e take = this.f22420b.take();
                c cVar = null;
                if (take instanceof c) {
                    cVar = (c) take;
                }
                if (cVar != null) {
                    String name = Thread.currentThread().getName();
                    String str = cVar.f22426d;
                    try {
                        if (!cVar.a()) {
                            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                                Thread currentThread = Thread.currentThread();
                                currentThread.setName("ApiLocalDispatcher-" + str);
                            }
                            if (Logger.debug()) {
                                this.f22420b.size();
                                this.f22421c.size();
                            }
                            if (cVar.d() == e.a.IMMEDIATE) {
                                ThreadPlus.submitRunnable(cVar);
                            } else {
                                cVar.f();
                                this.f22421c.add(cVar);
                            }
                            if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                                Thread.currentThread().setName(name);
                            }
                        }
                    } catch (Throwable unused) {
                    }
                }
            } catch (InterruptedException unused2) {
                if (this.f22419a) {
                    return;
                }
            }
        }
    }

    public b(BlockingQueue<e> blockingQueue, BlockingQueue<e> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f22420b = blockingQueue;
        this.f22421c = blockingQueue2;
    }
}
