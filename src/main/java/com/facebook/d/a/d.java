package com.facebook.d.a;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;
import javax.annotation.Nonnull;

public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final b f23568a;

    /* renamed from: b  reason: collision with root package name */
    public long f23569b;

    /* renamed from: c  reason: collision with root package name */
    private AtomicInteger f23570c;

    /* renamed from: d  reason: collision with root package name */
    private Handler f23571d;

    /* renamed from: e  reason: collision with root package name */
    private HandlerThread f23572e;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final d f23573a = new d(b.a(), (byte) 0);
    }

    class b extends Handler {
        private void a() {
            long a2 = g.a().a(Process.myUid());
            synchronized (this) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                if (a2 != -1) {
                    d.this.f23568a.a(a2, elapsedRealtime - d.this.f23569b);
                }
                d.this.f23569b = elapsedRealtime;
            }
        }

        public final void handleMessage(Message message) {
            switch (message.what) {
                case 1:
                    a();
                    sendEmptyMessageDelayed(1, 1000);
                    return;
                case 2:
                    a();
                    removeMessages(1);
                    return;
                default:
                    throw new IllegalArgumentException("Unknown what=" + message.what);
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    @Nonnull
    public static d a() {
        return a.f23573a;
    }

    public final void c() {
        if (this.f23570c.decrementAndGet() == 0) {
            this.f23571d.sendEmptyMessage(2);
        }
    }

    public final void b() {
        if (this.f23570c.getAndIncrement() == 0) {
            this.f23571d.sendEmptyMessage(1);
            this.f23569b = SystemClock.elapsedRealtime();
        }
    }

    private d(b bVar) {
        this.f23568a = bVar;
        this.f23570c = new AtomicInteger();
        this.f23572e = new HandlerThread("ParseThread");
        this.f23572e.start();
        this.f23571d = new b(this.f23572e.getLooper());
    }

    /* synthetic */ d(b bVar, byte b2) {
        this(bVar);
    }
}
