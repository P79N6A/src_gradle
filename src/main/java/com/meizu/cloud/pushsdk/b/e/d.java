package com.meizu.cloud.pushsdk.b.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.meizu.cloud.pushsdk.b.d.a;
import java.lang.ref.WeakReference;

public class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f26993a;

    public d(a aVar) {
        super(Looper.getMainLooper());
        this.f26993a = new WeakReference<>(aVar);
    }

    public void handleMessage(Message message) {
        a aVar = (a) this.f26993a.get();
        if (message.what != 1) {
            super.handleMessage(message);
        } else if (aVar != null) {
            com.meizu.cloud.pushsdk.b.f.a aVar2 = (com.meizu.cloud.pushsdk.b.f.a) message.obj;
            aVar.a(aVar2.f26994a, aVar2.f26995b);
        }
    }
}
