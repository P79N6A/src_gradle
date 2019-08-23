package com.bytedance.ies.d.a.a;

import android.os.Process;
import com.bytedance.common.utility.StringUtils;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public final class a extends Thread {

    /* renamed from: a  reason: collision with root package name */
    protected static final AtomicInteger f20235a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    volatile boolean f20236b;

    /* renamed from: c  reason: collision with root package name */
    private final BlockingQueue<com.bytedance.ies.d.a.a> f20237c;

    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                com.bytedance.ies.d.a.a take = this.f20237c.take();
                String name = Thread.currentThread().getName();
                String str = take.f20233c;
                try {
                    if (!take.a()) {
                        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                            Thread.currentThread().setName(str);
                        }
                        take.run();
                        if (!StringUtils.isEmpty(str) && !StringUtils.isEmpty(name)) {
                            Thread.currentThread().setName(name);
                        }
                    }
                } catch (Throwable unused) {
                }
            } catch (InterruptedException unused2) {
                if (this.f20236b) {
                    return;
                }
            }
        }
    }

    public a(BlockingQueue<com.bytedance.ies.d.a.a> blockingQueue) {
        super("ApiDispatcher-Thread");
        this.f20237c = blockingQueue;
    }
}
