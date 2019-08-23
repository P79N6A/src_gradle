package com.bytedance.framwork.core.a.d;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.framwork.core.a.e.b;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class b {

    /* renamed from: f  reason: collision with root package name */
    static final b.a<c, Runnable> f20126f = new b.a<c, Runnable>() {
        public final /* synthetic */ boolean a(Object obj, Object obj2) {
            c cVar = (c) obj;
            Runnable runnable = (Runnable) obj2;
            boolean z = false;
            if (runnable == null) {
                if (cVar != null && cVar.f20134a != null && cVar.f20134a.getCallback() != null) {
                    return false;
                }
                z = true;
            } else if (cVar == null || cVar.f20134a == null || !runnable.equals(cVar.f20134a.getCallback())) {
                return z;
            } else {
                return true;
            }
            return z;
        }
    };
    static final b.a<Message, Runnable> g = new b.a<Message, Runnable>() {
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
    final HandlerThread f20127a;

    /* renamed from: b  reason: collision with root package name */
    public final Queue<c> f20128b = new ConcurrentLinkedQueue();

    /* renamed from: c  reason: collision with root package name */
    public final Queue<Message> f20129c = new ConcurrentLinkedQueue();

    /* renamed from: d  reason: collision with root package name */
    public volatile Handler f20130d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f20131e = new Object();

    class a implements Runnable {
        public final void run() {
            while (!b.this.f20129c.isEmpty()) {
                if (b.this.f20130d != null) {
                    b.this.f20130d.sendMessageAtFrontOfQueue(b.this.f20129c.poll());
                }
            }
            while (!b.this.f20128b.isEmpty()) {
                c poll = b.this.f20128b.poll();
                if (b.this.f20130d != null) {
                    b.this.f20130d.sendMessageAtTime(poll.f20134a, poll.f20135b);
                }
            }
        }

        a() {
        }
    }

    /* renamed from: com.bytedance.framwork.core.a.d.b$b  reason: collision with other inner class name */
    class C0175b extends HandlerThread {
        /* access modifiers changed from: protected */
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (b.this.f20131e) {
                b.this.f20130d = new Handler();
            }
            b.this.f20130d.post(new a());
        }

        C0175b(String str) {
            super(str);
        }
    }

    static class c {

        /* renamed from: a  reason: collision with root package name */
        Message f20134a;

        /* renamed from: b  reason: collision with root package name */
        long f20135b;

        c(Message message, long j) {
            this.f20134a = message;
            this.f20135b = j;
        }
    }

    /* access modifiers changed from: package-private */
    public Message a(Runnable runnable) {
        return Message.obtain(this.f20130d, runnable);
    }

    public b(String str) {
        this.f20127a = new C0175b(str);
    }

    public final void b(Runnable runnable) {
        if (!this.f20128b.isEmpty() || !this.f20129c.isEmpty()) {
            com.bytedance.framwork.core.a.e.b.a(this.f20128b, runnable, f20126f);
            com.bytedance.framwork.core.a.e.b.a(this.f20129c, runnable, g);
        }
        if (this.f20130d != null) {
            this.f20130d.removeCallbacks(runnable);
        }
    }

    public final boolean a(Runnable runnable, long j) {
        return a(a(runnable), j);
    }

    public final boolean a(Message message, long j) {
        if (j < 0) {
            j = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j);
    }

    private boolean b(Message message, long j) {
        if (this.f20130d == null) {
            synchronized (this.f20131e) {
                if (this.f20130d == null) {
                    this.f20128b.add(new c(message, j));
                    return true;
                }
            }
        }
        return this.f20130d.sendMessageAtTime(message, j);
    }
}
