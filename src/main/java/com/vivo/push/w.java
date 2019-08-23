package com.vivo.push;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.ss.android.ugc.aweme.shortvideo.ea;
import com.vivo.push.util.o;

public final class w {

    /* renamed from: a  reason: collision with root package name */
    private static final Handler f81708a = new Handler(Looper.getMainLooper());

    /* renamed from: b  reason: collision with root package name */
    private static final HandlerThread f81709b;

    /* renamed from: c  reason: collision with root package name */
    private static final Handler f81710c = new x(f81709b.getLooper());

    static {
        HandlerThread handlerThread = new HandlerThread("push_client_thread");
        f81709b = handlerThread;
        handlerThread.start();
    }

    public static void b(Runnable runnable) {
        f81708a.post(runnable);
    }

    public static void a(Runnable runnable) {
        f81710c.removeCallbacks(runnable);
        f81710c.postDelayed(runnable, ea.f66827f);
    }

    public static void a(v vVar) {
        if (vVar == null) {
            o.a("PushClientThread", "client thread error, task is null!");
            return;
        }
        int a2 = vVar.a();
        Message message = new Message();
        message.what = a2;
        message.obj = vVar;
        f81710c.sendMessageDelayed(message, 0);
    }
}
