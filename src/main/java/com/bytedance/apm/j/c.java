package com.bytedance.apm.j;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.apm.k.i;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class c {

    /* renamed from: f  reason: collision with root package name */
    static final i.a<C0007c, Runnable> f2046f = new i.a<C0007c, Runnable>() {
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            C0007c cVar = (C0007c) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (cVar != null && cVar.f2054a != null && cVar.f2054a.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (cVar == null || cVar.f2054a == null || !runnable.equals(cVar.f2054a.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };
    static final i.a<Message, Runnable> g = new i.a<Message, Runnable>() {
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            Message message = (Message) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (message != null && message.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (message == null || !runnable.equals(message.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };

    /* renamed from: a  reason: collision with root package name */
    final HandlerThread f2047a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<C0007c> f2048b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Message> f2049c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f2050d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f2051e = new Object();

    class a implements Runnable {
        public final void run() {
            while (!c.this.f2049c.isEmpty()) {
                if (c.this.f2050d != null) {
                    c.this.f2050d.sendMessageAtFrontOfQueue(c.this.f2049c.poll());
                }
            }
            while (!c.this.f2048b.isEmpty()) {
                C0007c poll = c.this.f2048b.poll();
                if (c.this.f2050d != null) {
                    c.this.f2050d.sendMessageAtTime(poll.f2054a, poll.f2055b);
                }
            }
        }

        a() {
        }
    }

    class b extends HandlerThread {
        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (c.this.f2051e) {
                c.this.f2050d = new Handler();
            }
            c.this.f2050d.post(new a());
        }

        b(String str) {
            super(str);
        }
    }

    /* renamed from: com.bytedance.apm.j.c$c  reason: collision with other inner class name */
    static class C0007c {

        /* renamed from: a  reason: collision with root package name */
        Message f2054a;

        /* renamed from: b  reason: collision with root package name */
        long f2055b;

        C0007c(Message message, long j) {
            this.f2054a = message;
            this.f2055b = j;
        }
    }

    private Message c(Runnable runnable) {
        return Message.obtain(this.f2050d, runnable);
    }

    public final boolean a(Runnable runnable) {
        return a(c(runnable), 0);
    }

    public c(String str) {
        this.f2047a = new b(str);
    }

    public final void b(Runnable runnable) {
        if (!this.f2048b.isEmpty() || !this.f2049c.isEmpty()) {
            i.a(this.f2048b, runnable, f2046f);
            i.a(this.f2049c, runnable, g);
        }
        if (this.f2050d != null) {
            this.f2050d.removeCallbacks(runnable);
        }
    }

    private boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }

    private boolean b(Message message, long j) {
        if (this.f2050d == null) {
            synchronized (this.f2051e) {
                if (this.f2050d == null) {
                    this.f2048b.add(new C0007c(message, j));
                    return true;
                }
            }
        }
        return this.f2050d.sendMessageAtTime(message, j);
    }

    public final boolean a(Runnable runnable, long j) {
        return a(c(runnable), j);
    }
}
