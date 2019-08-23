package a;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    static final b f1030a = new b();

    /* renamed from: c  reason: collision with root package name */
    static final int f1031c;

    /* renamed from: d  reason: collision with root package name */
    static final int f1032d = ((f1033e * 2) + 1);

    /* renamed from: e  reason: collision with root package name */
    private static final int f1033e;

    /* renamed from: b  reason: collision with root package name */
    final Executor f1034b = new a((byte) 0);

    static class a implements Executor {
        private a() {
        }

        /* synthetic */ a(byte b2) {
            this();
        }

        public final void execute(Runnable runnable) {
            new Handler(Looper.getMainLooper()).post(runnable);
        }
    }

    private b() {
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f1033e = availableProcessors;
        f1031c = availableProcessors + 1;
    }
}
