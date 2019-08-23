package com.bytedance.ies.d.a.a;

import android.os.Process;
import com.bytedance.common.utility.Logger;
import com.bytedance.common.utility.StringUtils;
import com.bytedance.common.utility.concurrent.ThreadPlus;
import com.bytedance.ies.d.a.a;
import java.util.concurrent.BlockingQueue;

public final class b extends Thread {

    /* renamed from: a  reason: collision with root package name */
    volatile boolean f20238a;

    /* renamed from: b  reason: collision with root package name */
    private final BlockingQueue<a> f20239b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<a> f20240c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a take = this.f20239b.take();
                String name = Thread.currentThread().getName();
                String str = take.f20233c;
                try {
                    if (!take.a()) {
                        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                            Thread currentThread = Thread.currentThread();
                            currentThread.setName("ApiLocalDispatcher-" + str);
                        }
                        if (Logger.debug()) {
                            this.f20239b.size();
                            this.f20240c.size();
                        }
                        if (take.f20234d == a.C0182a.IMMEDIATE) {
                            ThreadPlus.submitRunnable(take);
                        } else {
                            this.f20240c.add(take);
                        }
                        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f20238a) {
                    return;
                }
            }
        }
    }

    public b(BlockingQueue<a> blockingQueue, BlockingQueue<a> blockingQueue2) {
        super("ApiLocalDispatcher-Thread");
        this.f20239b = blockingQueue;
        this.f20240c = blockingQueue2;
    }
}
