package com.bytedance.frameworks.baselib.network.dispatcher;

import android.os.Message;
import java.util.concurrent.BlockingQueue;

public final class d extends a {
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    public final /* bridge */ /* synthetic */ void run() {
        super.run();
    }

    public final /* bridge */ /* synthetic */ boolean b() {
        return super.b();
    }

    public final void d() {
        this.f19722c.removeMessages(1);
    }

    public final void f() {
        this.f19722c.removeMessages(3);
    }

    public final void c() {
        d();
        this.f19722c.sendEmptyMessageDelayed(1, 2000);
    }

    public final void e() {
        f();
        this.f19722c.sendEmptyMessageDelayed(3, 2000);
    }

    public final void a(ApiThread apiThread) {
        if (apiThread != null) {
            apiThread.cancelEnDownloadQueueExpireMsg();
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                int i = message.what;
                if (i != 1) {
                    if (i == 3) {
                        f19720a.handleShrinkDelayDownloadRequestQueueSize();
                    }
                    return;
                }
                f19720a.handleShrinkDownloadRequestQueueSize();
            } catch (Throwable unused) {
            }
        }
    }

    public d(BlockingQueue<IRequest> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
