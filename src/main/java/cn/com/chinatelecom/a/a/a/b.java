package cn.com.chinatelecom.a.a.a;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.ugc.aweme.thread.h;
import com.ss.android.ugc.aweme.thread.m;
import com.ss.android.ugc.aweme.thread.p;
import java.util.concurrent.Executor;

public class b {

    /* renamed from: a  reason: collision with root package name */
    private static Executor f1653a = h.a(m.a(p.FIXED).a(3).a());

    /* renamed from: b  reason: collision with root package name */
    public Handler f1654b = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f1653a.execute(runnable);
    }
}
