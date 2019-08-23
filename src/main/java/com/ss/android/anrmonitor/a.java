package com.ss.android.anrmonitor;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;

public final class a extends Thread {

    /* renamed from: c  reason: collision with root package name */
    public static final C0327a f27930c = new C0327a() {
        public final void a(ANRError aNRError) {
            throw aNRError;
        }
    };
    private static final b h = new b() {
    };

    /* renamed from: a  reason: collision with root package name */
    public C0327a f27931a;

    /* renamed from: b  reason: collision with root package name */
    public volatile int f27932b;

    /* renamed from: d  reason: collision with root package name */
    private b f27933d;

    /* renamed from: e  reason: collision with root package name */
    private final Handler f27934e;

    /* renamed from: f  reason: collision with root package name */
    private final int f27935f;
    private final Runnable g;

    /* renamed from: com.ss.android.anrmonitor.a$a  reason: collision with other inner class name */
    public interface C0327a {
        void a(ANRError aNRError);
    }

    public interface b {
    }

    public a() {
        this(5000);
    }

    public final void run() {
        setName("|ANR-Monitor|");
        while (!isInterrupted()) {
            int i = this.f27932b;
            this.f27934e.post(this.g);
            try {
                Thread.sleep((long) this.f27935f);
                if (!Debug.isDebuggerConnected()) {
                    if (this.f27932b == i) {
                        this.f27931a.a(ANRError.NewMainOnly());
                        return;
                    }
                } else {
                    return;
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    public a(int i) {
        this.f27931a = f27930c;
        this.f27933d = h;
        this.f27934e = new Handler(Looper.getMainLooper());
        this.f27932b = 0;
        this.g = new Runnable() {
            public final void run() {
                a.this.f27932b = (a.this.f27932b + 1) % 10;
            }
        };
        this.f27935f = i;
    }
}
