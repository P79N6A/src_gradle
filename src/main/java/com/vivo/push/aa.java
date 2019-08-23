package com.vivo.push;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.vivo.push.util.o;

public abstract class aa {

    /* renamed from: a  reason: collision with root package name */
    protected Context f81480a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f81481b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private Handler f81482c;

    class a extends Handler {
        public final void handleMessage(Message message) {
            aa.this.b(message);
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public abstract void b(Message message);

    public aa() {
        HandlerThread handlerThread = new HandlerThread(getClass().getSimpleName(), 1);
        handlerThread.start();
        this.f81482c = new a(handlerThread.getLooper());
    }

    public final void a(Context context) {
        this.f81480a = context;
    }

    public final void a(Message message) {
        synchronized (this.f81481b) {
            if (this.f81482c == null) {
                String str = "Dead worker dropping a message: " + message.what;
                o.e(getClass().getSimpleName(), str + " (Thread " + Thread.currentThread().getId() + ")");
            } else {
                this.f81482c.sendMessage(message);
            }
        }
    }
}
