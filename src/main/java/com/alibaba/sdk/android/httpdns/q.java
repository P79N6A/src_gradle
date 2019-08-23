package com.alibaba.sdk.android.httpdns;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class q {

    /* renamed from: a  reason: collision with root package name */
    private static q f5123a;

    /* renamed from: b  reason: collision with root package name */
    private String f5124b;

    /* renamed from: d  reason: collision with root package name */
    private boolean f5125d = true;

    /* renamed from: f  reason: collision with root package name */
    private long f5126f;
    private ExecutorService pool = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    private q() {
    }

    public static q a() {
        if (f5123a == null) {
            synchronized (q.class) {
                if (f5123a == null) {
                    f5123a = new q();
                }
            }
        }
        return f5123a;
    }

    private boolean c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (this.f5126f != 0 && currentTimeMillis - this.f5126f < 30000) {
            return false;
        }
        this.f5126f = currentTimeMillis;
        return true;
    }

    public synchronized void a(boolean z) {
        this.f5125d = z;
    }

    public synchronized void e() {
        this.f5126f = 0;
    }

    public synchronized void g(String str) {
        if (str != null) {
            try {
                this.f5124b = str;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!this.f5125d || !c() || this.f5124b == null) {
            g.e("hostname is null or sniff too often or sniffer is turned off");
            return;
        }
        g.e("launch a sniff task");
        l lVar = new l(this.f5124b, n.SNIFF_HOST);
        lVar.a(0);
        this.pool.submit(lVar);
        this.f5124b = null;
    }
}
