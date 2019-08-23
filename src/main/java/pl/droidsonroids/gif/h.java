package pl.droidsonroids.gif;

import java.lang.Thread;

public abstract class h implements Runnable {

    /* renamed from: c  reason: collision with root package name */
    final a f84212c;

    /* access modifiers changed from: package-private */
    public abstract void a();

    public final void run() {
        try {
            if (!this.f84212c.f84203f.k()) {
                a();
            }
        } catch (Throwable th) {
            Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
            if (defaultUncaughtExceptionHandler != null) {
                defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
            }
            throw th;
        }
    }

    h(a aVar) {
        this.f84212c = aVar;
    }
}
