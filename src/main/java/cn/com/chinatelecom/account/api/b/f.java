package cn.com.chinatelecom.account.api.b;

import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import me.ele.lancet.base.annotations.Proxy;
import me.ele.lancet.base.annotations.TargetClass;

public class f {

    /* renamed from: a  reason: collision with root package name */
    private static ExecutorService f1784a = _lancet.com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(3);

    public class _lancet {
        private _lancet() {
        }

        @TargetClass
        @Proxy
        static ExecutorService com_ss_android_ugc_aweme_lancet_ThreadPoolLancet_newFixedThreadPool(int i) {
            return h.a(m.a(p.FIXED).a(i).a());
        }
    }

    public static abstract class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private boolean f1785a;

        public void a(boolean z) {
            this.f1785a = z;
        }

        public boolean a() {
            return this.f1785a;
        }
    }

    public static void a(Runnable runnable) {
        f1784a.execute(runnable);
    }

    public static Future b(Runnable runnable) {
        return f1784a.submit(runnable);
    }
}
