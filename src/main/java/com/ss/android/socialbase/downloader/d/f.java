package com.ss.android.socialbase.downloader.d;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class f extends Handler {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<a> f30875a;

    public interface a {
        void a(Message message);
    }

    public final void handleMessage(Message message) {
        a aVar = (a) this.f30875a.get();
        if (aVar != null && message != null) {
            aVar.a(message);
        }
    }

    public f(Looper looper, a aVar) {
        super(looper);
        this.f30875a = new WeakReference<>(aVar);
    }
}
