package com.ss.android.socialbase.downloader.network;

import android.net.TrafficStats;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.ss.android.socialbase.downloader.downloader.b;
import com.ss.android.socialbase.downloader.e.d;
import java.util.concurrent.atomic.AtomicInteger;

public class a {

    /* renamed from: d  reason: collision with root package name */
    private static final String f31068d = "a";

    /* renamed from: f  reason: collision with root package name */
    private static long f31069f = -1;
    private static volatile a g;

    /* renamed from: a  reason: collision with root package name */
    public final AtomicInteger f31070a = new AtomicInteger();

    /* renamed from: b  reason: collision with root package name */
    public final C0391a f31071b;

    /* renamed from: c  reason: collision with root package name */
    public long f31072c;

    /* renamed from: e  reason: collision with root package name */
    private final e f31073e = e.a();

    /* renamed from: com.ss.android.socialbase.downloader.network.a$a  reason: collision with other inner class name */
    public class C0391a extends Handler {
        public final void handleMessage(Message message) {
            if (message.what == 1) {
                a.this.c();
                sendEmptyMessageDelayed(1, 1000);
            }
        }

        public C0391a(Looper looper) {
            super(looper);
        }
    }

    public static a a() {
        if (g == null) {
            synchronized (a.class) {
                if (g == null) {
                    g = new a();
                }
            }
        }
        return g;
    }

    public final void b() {
        try {
            if (this.f31070a.decrementAndGet() == 0) {
                this.f31071b.removeMessages(1);
                c();
                f31069f = -1;
            }
        } catch (Throwable unused) {
        }
    }

    private a() {
        HandlerThread handlerThread = new HandlerThread("ParseThread");
        handlerThread.start();
        this.f31071b = new C0391a(handlerThread.getLooper());
    }

    /* access modifiers changed from: protected */
    public final void c() {
        long j;
        try {
            if (d.a(b.q())) {
                j = TrafficStats.getTotalRxBytes() - TrafficStats.getMobileRxBytes();
            } else {
                j = TrafficStats.getMobileRxBytes();
            }
            long j2 = j - f31069f;
            if (f31069f >= 0) {
                synchronized (this) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    this.f31073e.a(j2, uptimeMillis - this.f31072c);
                    this.f31072c = uptimeMillis;
                }
            }
            f31069f = j;
        } catch (Exception unused) {
        }
    }
}
