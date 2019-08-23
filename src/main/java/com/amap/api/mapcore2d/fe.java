package com.amap.api.mapcore2d;

import com.amap.api.mapcore2d.ff;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class fe {

    /* renamed from: a  reason: collision with root package name */
    private static fe f6122a;

    /* renamed from: b  reason: collision with root package name */
    private ExecutorService f6123b;

    /* renamed from: c  reason: collision with root package name */
    private ConcurrentHashMap<ff, Future<?>> f6124c = new ConcurrentHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private ff.a f6125d = new ff.a() {
        public void a(ff ffVar) {
        }

        public void b(ff ffVar) {
            fe.this.a(ffVar, false);
        }
    };

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i) {
            return h.a(m.a(p.FIXED).a(i).a());
        }
    }

    public static synchronized fe a(int i) {
        fe feVar;
        synchronized (fe.class) {
            if (f6122a == null) {
                f6122a = new fe(i);
            }
            feVar = f6122a;
        }
        return feVar;
    }

    private fe(int i) {
        try {
            this.f6123b = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(i);
        } catch (Throwable th) {
            dg.b(th, "TPool", "ThreadPool");
        }
    }

    /* access modifiers changed from: private */
    public synchronized void a(ff ffVar, boolean z) {
        try {
            Future remove = this.f6124c.remove(ffVar);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            dg.b(th, "TPool", "removeQueue");
        }
    }
}
