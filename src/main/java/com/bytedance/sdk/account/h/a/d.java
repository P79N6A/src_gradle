package com.bytedance.sdk.account.h.a;

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
        this.f22415c.removeMessages(1);
    }

    public final void c() {
        d();
        this.f22415c.sendEmptyMessageDelayed(1, 2000);
    }

    public final void a(c cVar) {
        if (cVar != null) {
            cVar.h();
        }
    }

    public final void handleMsg(Message message) {
        if (message != null) {
            try {
                if (message.what == 1) {
                    f22413a.e();
                }
            } catch (Throwable unused) {
            }
        }
    }

    public d(BlockingQueue<e> blockingQueue, String str, String str2) {
        super(blockingQueue, str, str2);
    }
}
