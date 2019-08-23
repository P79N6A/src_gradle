package com.ss.android.ad.splash.d;

import android.os.Handler;
import android.os.Looper;
import com.ss.android.ad.splash.core.e;
import com.ss.android.ad.splash.o;
import com.ss.android.ad.splash.utils.f;
import com.ss.android.ad.splash.utils.g;
import java.util.concurrent.Callable;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private static volatile a f27830a;

    private a() {
    }

    public static a a() {
        if (f27830a == null) {
            synchronized (a.class) {
                if (f27830a == null) {
                    f27830a = new a();
                }
            }
        }
        return f27830a;
    }

    public final void a(final boolean z) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            public final void run() {
                e.s().submit(new Callable<o>() {
                    public final /* synthetic */ Object call() throws Exception {
                        if (e.t() != null) {
                            String a2 = f.a(z);
                            if (!g.a(a2)) {
                                return e.t().b(a2);
                            }
                        }
                        return null;
                    }
                });
            }
        }, 2000);
    }
}
