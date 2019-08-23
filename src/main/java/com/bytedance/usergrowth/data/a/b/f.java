package com.bytedance.usergrowth.data.a.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f2327a;

    public interface a {
        void a(Message message);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f2327a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public f(Looper looper, a aVar) {
        super(looper);
        this.f2327a = new WeakReference<>(aVar);
    }
}
