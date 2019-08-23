package anetwork.channel.entity;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static final ExecutorService[] f1528a = new ExecutorService[2];
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static AtomicInteger f1529b = new AtomicInteger(0);

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(ThreadFactory threadFactory) {
            return h.a(m.a(p.FIXED).a(1).a(threadFactory).a());
        }
    }

    static {
        for (int i = 0; i < 2; i++) {
            f1528a[i] = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor(new b());
        }
    }

    public static void a(int i, Runnable runnable) {
        f1528a[Math.abs(i % 2)].submit(runnable);
    }
}
