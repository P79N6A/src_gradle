package com.bytedance.crash.runtime;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Printer;
import android.util.SparseArray;
import java.lang.reflect.Field;
import java.util.LinkedList;
import java.util.List;

public class f implements Handler.Callback {

    /* renamed from: a  reason: collision with root package name */
    public static Printer f19545a;
    public static final Printer g = new Printer() {
        public final void println(String str) {
            if (str != null) {
                if (str.startsWith(">>>>> Dispatching")) {
                    f a2 = f.a();
                    if (!a2.i) {
                        g.a(32);
                        a2.i = true;
                    }
                    a2.f19547c = SystemClock.uptimeMillis();
                    try {
                        a2.a(a2.f19549e, str);
                        a2.f19546b.sendEmptyMessage(0);
                    } catch (Exception unused) {
                    }
                } else if (str.startsWith("<<<<< Finished")) {
                    f a3 = f.a();
                    a3.f19548d = SystemClock.uptimeMillis();
                    a3.f19546b.removeMessages(2);
                    a3.a(a3.f19550f, str);
                    a3.f19546b.sendEmptyMessage(1);
                }
                if (!(f.f19545a == null || f.f19545a == f.g)) {
                    f.f19545a.println(str);
                }
            }
        }
    };
    private static f j;

    /* renamed from: b  reason: collision with root package name */
    Handler f19546b = new Handler(h.a().getLooper(), this);

    /* renamed from: c  reason: collision with root package name */
    long f19547c;

    /* renamed from: d  reason: collision with root package name */
    long f19548d;

    /* renamed from: e  reason: collision with root package name */
    final List<Printer> f19549e = new LinkedList();

    /* renamed from: f  reason: collision with root package name */
    final List<Printer> f19550f = new LinkedList();
    public boolean h = false;
    boolean i;
    private int k;
    private final SparseArray<List<Runnable>> l = new SparseArray<>();

    public static f a() {
        if (j == null) {
            synchronized (f.class) {
                if (j == null) {
                    j = new f();
                }
            }
        }
        return j;
    }

    private static Printer c() {
        try {
            Field declaredField = Class.forName("android.os.Looper").getDeclaredField("mLogging");
            declaredField.setAccessible(true);
            return (Printer) declaredField.get(Looper.getMainLooper());
        } catch (Exception unused) {
            return null;
        }
    }

    public final void b() {
        if (!this.h) {
            this.h = true;
            Printer c2 = c();
            f19545a = c2;
            if (c2 == g) {
                f19545a = null;
            }
            Looper.getMainLooper().setMessageLogging(g);
        }
    }

    private f() {
        b();
    }

    public final void a(Printer printer) {
        this.f19550f.add(printer);
    }

    public final synchronized void b(Printer printer) {
        this.f19549e.add(printer);
    }

    private static void a(List<? extends Runnable> list) {
        if (list != null && !list.isEmpty()) {
            try {
                for (Runnable run : list) {
                    run.run();
                }
            } catch (Exception unused) {
            }
        }
    }

    public boolean handleMessage(Message message) {
        if (this.f19546b.hasMessages(0)) {
            return true;
        }
        switch (message.what) {
            case 0:
                this.k = 0;
                if (this.l.size() != 0 && this.l.keyAt(0) == 0) {
                    a(this.l.valueAt(0));
                    this.k++;
                    break;
                }
            case 1:
                this.f19546b.removeMessages(2);
                if (this.l.size() != 0 && this.l.keyAt(this.l.size() - 1) == 0) {
                    a(this.l.get(Integer.MAX_VALUE));
                }
                return true;
            case 2:
                a(this.l.valueAt(this.k));
                this.k++;
                break;
        }
        if (this.k >= this.l.size()) {
            return true;
        }
        long keyAt = (long) this.l.keyAt(this.k);
        if (keyAt != 2147483647L) {
            this.f19546b.sendEmptyMessageAtTime(2, this.f19547c + keyAt);
        }
        return true;
    }

    public final void a(long j2, Runnable runnable) {
        a(j2, runnable, 1, 0);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0026, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void a(java.util.List<? extends android.util.Printer> r2, java.lang.String r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            if (r2 == 0) goto L_0x0025
            boolean r0 = r2.isEmpty()     // Catch:{ all -> 0x0022 }
            if (r0 == 0) goto L_0x000a
            goto L_0x0025
        L_0x000a:
            java.util.Iterator r2 = r2.iterator()     // Catch:{ Exception -> 0x0020 }
        L_0x000e:
            boolean r0 = r2.hasNext()     // Catch:{ Exception -> 0x0020 }
            if (r0 == 0) goto L_0x001e
            java.lang.Object r0 = r2.next()     // Catch:{ Exception -> 0x0020 }
            android.util.Printer r0 = (android.util.Printer) r0     // Catch:{ Exception -> 0x0020 }
            r0.println(r3)     // Catch:{ Exception -> 0x0020 }
            goto L_0x000e
        L_0x001e:
            monitor-exit(r1)
            return
        L_0x0020:
            monitor-exit(r1)
            return
        L_0x0022:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        L_0x0025:
            monitor-exit(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.crash.runtime.f.a(java.util.List, java.lang.String):void");
    }

    public final void a(long j2, Runnable runnable, int i2, long j3) {
        if (j2 >= 0) {
            for (int i3 = 0; i3 < i2; i3++) {
                int i4 = (int) j2;
                List list = this.l.get(i4);
                if (list == null) {
                    synchronized (this.l) {
                        list = this.l.get(i4);
                        if (list == null) {
                            list = new LinkedList();
                            this.l.put(i4, list);
                        }
                    }
                }
                list.add(runnable);
                j2 += j3;
            }
        }
    }
}
