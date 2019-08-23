package com.meizu.cloud.pushsdk.c.e.a;

import com.meizu.cloud.pushsdk.c.b.a.b;
import com.meizu.cloud.pushsdk.c.e.c;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ScheduledExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a extends c {
    private static final String n = "a";
    private static ScheduledExecutorService o;

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor() {
            return (ScheduledExecutorService) h.a(m.a(p.SCHEDULED).a(1).a());
        }
    }

    public a(c.a aVar) {
        super(aVar);
        b.a(this.k);
        c();
    }

    public void a(final com.meizu.cloud.pushsdk.c.c.b bVar, final boolean z) {
        b.a((Runnable) new Runnable() {
            public void run() {
                a.super.a(bVar, z);
            }
        });
    }

    public void c() {
        if (o == null && this.i) {
            com.meizu.cloud.pushsdk.c.f.c.b(n, "Session checking has been resumed.", new Object[0]);
            final com.meizu.cloud.pushsdk.c.e.a aVar = this.f27174d;
            ScheduledExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor();
            o = com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor;
            com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadScheduledExecutor.scheduleAtFixedRate(new Runnable() {
                public void run() {
                    aVar.b();
                }
            }, this.j, this.j, this.l);
        }
    }
}
