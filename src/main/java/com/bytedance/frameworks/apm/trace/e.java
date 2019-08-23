package com.bytedance.frameworks.apm.trace;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.support.annotation.MainThread;
import com.bytedance.services.apm.api.c;
import java.util.LinkedList;
import java.util.List;

public final class e implements c {

    /* renamed from: a  reason: collision with root package name */
    static int f19654a = 0;

    /* renamed from: b  reason: collision with root package name */
    static boolean f19655b = false;

    /* renamed from: c  reason: collision with root package name */
    public static boolean f19656c = false;

    /* renamed from: d  reason: collision with root package name */
    static volatile long f19657d;

    /* renamed from: e  reason: collision with root package name */
    static volatile long f19658e;

    /* renamed from: f  reason: collision with root package name */
    static long[] f19659f;
    static List<c> g = new LinkedList();
    public static Handler h = new Handler(m.getLooper(), new Handler.Callback() {
        public final boolean handleMessage(Message message) {
            if (message.what == 1) {
                e.f19657d = (System.nanoTime() / 1000000) - e.f19658e;
                if (!e.f19656c) {
                    e.h.sendEmptyMessageDelayed(1, 5);
                } else {
                    d.b("MethodCollector", "stop time update!", new Object[0]);
                }
            }
            return true;
        }
    });
    private static e i = new e();
    private static boolean j = false;
    private static boolean k = false;
    private static Thread l = Looper.getMainLooper().getThread();
    private static HandlerThread m;

    @MainThread
    public static void b() {
        f19654a = 0;
    }

    public static e a() {
        return i;
    }

    static {
        HandlerThread handlerThread = new HandlerThread("trace_time_update_thread");
        handlerThread.start();
        m = handlerThread;
        long nanoTime = System.nanoTime() / 1000000;
        f19658e = nanoTime;
        f19657d = nanoTime;
    }

    public static void a(boolean z) {
        k = z;
    }

    public final void a(Activity activity) {
        h.removeMessages(1);
        f19656c = true;
    }

    public final void b(Activity activity) {
        f19656c = false;
        if (!h.hasMessages(1)) {
            h.sendEmptyMessage(1);
        }
    }

    public final void c(Activity activity) {
        if (f19656c && !h.hasMessages(1)) {
            h.sendEmptyMessage(1);
        }
    }

    public final void d(Activity activity) {
        if (f19656c && !h.hasMessages(1)) {
            h.sendEmptyMessage(1);
        }
    }

    public static void b(int i2) {
        if (Thread.currentThread() == l && f19655b && k && !f19656c) {
            if (j) {
                d.a("MethodCollector", "ERROR!!! MethodCollector.b(int method) Recursive calls!!!", new Object[0]);
                return;
            }
            j = true;
            if (f19654a < 1000000) {
                a(i2, f19654a, true);
            } else {
                for (c pushFullBuffer : g) {
                    pushFullBuffer.pushFullBuffer(0, 999999, f19659f);
                }
                f19654a = 0;
            }
            f19654a++;
            j = false;
        }
    }

    public static void e(int i2) {
        if (Thread.currentThread() == l && f19655b && k && !f19656c) {
            if (f19654a < 1000000) {
                a(i2, f19654a, false);
            } else {
                for (c pushFullBuffer : g) {
                    pushFullBuffer.pushFullBuffer(0, 999999, f19659f);
                }
                f19654a = 0;
            }
            f19654a++;
        }
    }

    private static void a(int i2, int i3, boolean z) {
        long j2;
        if (z) {
            j2 = Long.MIN_VALUE;
        } else {
            j2 = 0;
        }
        f19659f[i3] = j2 | (((long) i2) << 43) | (f19657d & 8796093022207L);
    }
}
