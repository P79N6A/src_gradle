package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.SparseArray;
import com.ss.android.ugc.aweme.q.c;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class aj {

    /* renamed from: a  reason: collision with root package name */
    private static volatile aj f81826a;

    /* renamed from: a  reason: collision with other field name */
    private SharedPreferences f147a;

    /* renamed from: a  reason: collision with other field name */
    private SparseArray<ScheduledFuture> f148a = new SparseArray<>();

    /* renamed from: a  reason: collision with other field name */
    private Object f149a = new Object();

    /* renamed from: a  reason: collision with other field name */
    private ScheduledThreadPoolExecutor f150a = new ScheduledThreadPoolExecutor(1);

    public static abstract class a implements Runnable {
        public abstract int a();
    }

    static class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        a f81827a;

        public b(a aVar) {
            this.f81827a = aVar;
        }

        /* access modifiers changed from: package-private */
        public void a() {
        }

        /* access modifiers changed from: package-private */
        public void b() {
        }

        public void run() {
            a();
            this.f81827a.run();
            b();
        }
    }

    private aj(Context context) {
        this.f147a = c.a(context, "mipush_extra", 0);
    }

    public static aj a(Context context) {
        if (f81826a == null) {
            synchronized (aj.class) {
                try {
                    if (f81826a == null) {
                        f81826a = new aj(context);
                    }
                } catch (Throwable th) {
                    Class<aj> cls = aj.class;
                    throw th;
                }
            }
        }
        return f81826a;
    }

    private static String a(int i) {
        return "last_job_time" + i;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f149a) {
            scheduledFuture = this.f148a.get(aVar.a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i) {
        this.f150a.schedule(runnable, (long) i, TimeUnit.SECONDS);
    }

    /* renamed from: a  reason: collision with other method in class */
    public boolean m83a(int i) {
        synchronized (this.f149a) {
            ScheduledFuture scheduledFuture = this.f148a.get(i);
            if (scheduledFuture == null) {
                return false;
            }
            this.f148a.remove(i);
            return scheduledFuture.cancel(false);
        }
    }

    public boolean a(a aVar, int i) {
        return a(aVar, i, 0);
    }

    public boolean a(a aVar, int i, int i2) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String a2 = a(aVar.a());
        ak akVar = new ak(this, aVar, a2);
        long abs = Math.abs(System.currentTimeMillis() - this.f147a.getLong(a2, 0)) / 1000;
        if (abs < ((long) (i - i2))) {
            i2 = (int) (((long) i) - abs);
        }
        ScheduledFuture<?> scheduleAtFixedRate = this.f150a.scheduleAtFixedRate(akVar, (long) i2, (long) i, TimeUnit.SECONDS);
        synchronized (this.f149a) {
            this.f148a.put(aVar.a(), scheduleAtFixedRate);
        }
        return true;
    }

    public boolean b(a aVar, int i) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> schedule = this.f150a.schedule(new al(this, aVar), (long) i, TimeUnit.SECONDS);
        synchronized (this.f149a) {
            this.f148a.put(aVar.a(), schedule);
        }
        return true;
    }
}
