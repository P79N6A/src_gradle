package com.amap.api.services.a;

import com.amap.api.services.a.ef;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class ee {

    /* renamed from: a  reason: collision with root package name */
    private static ee f6866a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f6867b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<ef, Future<?>> f6868c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private ef.a f6869d = new ef.a() {
        public void a(ef efVar) {
        }

        public void b(ef efVar) {
            ee.this.a(efVar, false);
        }
    };

    public static synchronized ee a(int i) {
        ee eeVar;
        synchronized (ee.class) {
            if (f6866a == null) {
                f6866a = new ee(i);
            }
            eeVar = f6866a;
        }
        return eeVar;
    }

    private ee(int i) {
        try {
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256));
            this.f6867b = threadPoolExecutor;
        } catch (Throwable th) {
            ca.c(th, "TPool", "ThreadPool");
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(ef efVar, boolean z) {
        try {
            Future remove = this.f6868c.remove(efVar);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            ca.c(th, "TPool", "removeQueue");
        }
    }
}
