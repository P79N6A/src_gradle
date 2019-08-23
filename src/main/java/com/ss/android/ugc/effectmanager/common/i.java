package com.ss.android.ugc.effectmanager.common;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class i extends Handler {

    /* renamed from: a  reason: collision with root package name */
    WeakReference<a> f77337a;

    public interface a {
        void a(Message message);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f77337a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public i(a aVar) {
        super(Looper.getMainLooper());
        this.f77337a = new WeakReference<>(aVar);
    }

    public i(Looper looper, a aVar) {
        super(looper);
        this.f77337a = new WeakReference<>(aVar);
    }
}
