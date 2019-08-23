package com.huawei.android.pushselfshow.richpush.html.api;

import com.huawei.android.pushagent.utils.a.e;
import com.huawei.android.pushselfshow.richpush.html.api.NativeToJsMessageQueue;

public class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ NativeToJsMessageQueue.OnlineEventsBridgeMode f25325a;

    a(NativeToJsMessageQueue.OnlineEventsBridgeMode onlineEventsBridgeMode) {
        this.f25325a = onlineEventsBridgeMode;
    }

    public void run() {
        boolean a2 = NativeToJsMessageQueue.this.d();
        e.a("PushSelfShowLog", "bEmptyMsg is " + a2);
        if (!a2) {
            this.f25325a.f25320a = !this.f25325a.f25320a;
            NativeToJsMessageQueue.this.f25315a.setNetworkAvailable(this.f25325a.f25320a);
            e.a("PushSelfShowLog", "setNetworkAvailable ： " + this.f25325a.f25320a);
        }
    }
}
