package com.bytedance.frameworks.baselib.network.a;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.common.utility.Logger;
import java.util.concurrent.atomic.AtomicInteger;

public class e {
    private static long g = -1;

    /* renamed from: a  reason: collision with root package name */
    private final c f19708a;

    /* renamed from: b  reason: collision with root package name */
    private AtomicInteger f19709b;

    /* renamed from: c  reason: collision with root package name */
    private b f19710c;

    /* renamed from: d  reason: collision with root package name */
    private HandlerThread f19711d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f19712e;

    /* renamed from: f  reason: collision with root package name */
    private long f19713f;

    static class a {

        /* renamed from: a  reason: collision with root package name */
        public static final e f19714a = new e(c.b());
    }

    class b extends Handler {
        public final void handleMessage(Message message) {
            try {
                if (message.what == 1) {
                    e.this.e();
                    sendEmptyMessageDelayed(1, 1000);
                }
            } catch (Throwable unused) {
            }
        }

        public b(Looper looper) {
            super(looper);
        }
    }

    public static e b() {
        return a.f19714a;
    }

    public final void c() {
        try {
            if (!this.f19712e && this.f19709b.getAndIncrement() == 0) {
                Logger.debug();
                this.f19710c.sendEmptyMessage(1);
                this.f19713f = SystemClock.elapsedRealtime();
            }
        } catch (Throwable unused) {
        }
    }

    public final void d() {
        try {
            if (!this.f19712e && this.f19709b.decrementAndGet() == 0) {
                Logger.debug();
                this.f19710c.removeMessages(1);
                e();
                g = -1;
            }
        } catch (Throwable unused) {
        }
    }

    /* access modifiers changed from: protected */
    public final void e() {
        try {
            long totalRxBytes = TrafficStats.getTotalRxBytes();
            long j = totalRxBytes - g;
            if (g >= 0) {
                synchronized (this) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    this.f19708a.a(j, elapsedRealtime - this.f19713f);
                    this.f19713f = elapsedRealtime;
                }
            }
            g = totalRxBytes;
        } catch (Throwable unused) {
        }
    }

    protected e(c cVar) {
        this.f19708a = cVar;
        try {
            this.f19709b = new AtomicInteger();
            this.f19711d = new HandlerThread("ParseThread");
            this.f19711d.start();
            this.f19710c = new b(this.f19711d.getLooper());
        } catch (Throwable unused) {
            this.f19712e = true;
        }
    }
}
