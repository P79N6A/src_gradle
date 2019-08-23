package com.google.android.gms.internal;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public final class zzbcz {
    private static final ExecutorService zzaEb = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(2, new zzbgv("GAC_Executor"));

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i, ThreadFactory threadFactory) {
            return h.a(m.a(p.FIXED).a(i).a(threadFactory).a());
        }
    }

    public static ExecutorService zzqj() {
        return zzaEb;
    }
}
