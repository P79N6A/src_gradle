package com.bytedance.im.core.b.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class l extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f21244a;

    public interface a {
        void a(Message message);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f21244a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public l(a aVar) {
        this.f21244a = new WeakReference<>(aVar);
    }

    public l(Looper looper, a aVar) {
        super(looper);
        this.f21244a = new WeakReference<>(aVar);
    }
}
