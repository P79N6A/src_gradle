package cn.com.chinatelecom.account.api.b;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class a {

    /* renamed from: b  reason: collision with root package name */
    private static Executor f1767b = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor();

    /* renamed from: a  reason: collision with root package name */
    public Handler f1768a = new Handler(Looper.getMainLooper());

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newSingleThreadExecutor() {
            return h.a(m.a(p.FIXED).a(1).a());
        }
    }

    public static void a(Runnable runnable) {
        f1767b.execute(runnable);
    }
}
