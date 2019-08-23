package kotlinx.coroutines;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J\r\u0010\u001c\u001a\u00020\u001aH\u0000¢\u0006\u0002\b\u001dJ\u001c\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\b2\n\u0010!\u001a\u00060\u0002j\u0002`\u0003H\u0016J\b\u0010\"\u001a\u00020\u0014H\u0002J\b\u0010#\u001a\u00020\u001aH\u0016J\u000e\u0010$\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXT¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eXT¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u000e\u0010\u0012\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108TX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006&"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "_thread$annotations", "debugStatus", "isShutdownRequested", "", "()Z", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "notifyStartup", "run", "shutdown", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 1, 13})
public final class aj extends az implements Runnable {
    private static volatile Thread _thread;

    /* renamed from: a  reason: collision with root package name */
    public static final aj f83797a;

    /* renamed from: c  reason: collision with root package name */
    private static final long f83798c;
    private static volatile int debugStatus;

    private aj() {
    }

    private static boolean i() {
        int i = debugStatus;
        if (i == 2 || i == 3) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    @NotNull
    public final Thread a() {
        Thread thread = _thread;
        if (thread == null) {
            return j();
        }
        return thread;
    }

    private final synchronized Thread j() {
        Thread thread;
        thread = _thread;
        if (thread == null) {
            thread = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread;
            thread.setDaemon(true);
            thread.start();
        }
        return thread;
    }

    private final synchronized boolean k() {
        if (i()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final synchronized void l() {
        if (i()) {
            debugStatus = 3;
            this._queue = null;
            this._delayed = null;
            notifyAll();
        }
    }

    static {
        Long l;
        aj ajVar = new aj();
        f83797a = ajVar;
        ajVar.a(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        Intrinsics.checkExpressionValueIsNotNull(l, "try {\n            java.l…AULT_KEEP_ALIVE\n        }");
        f83798c = timeUnit.toNanos(l.longValue());
    }

    public final void run() {
        ay ayVar = this;
        Intrinsics.checkParameterIsNotNull(ayVar, "eventLoop");
        cd.f83905a.set(ayVar);
        try {
            if (k()) {
                long j = Long.MAX_VALUE;
                while (true) {
                    Thread.interrupted();
                    long b2 = b();
                    if (b2 == Long.MAX_VALUE) {
                        if (j == Long.MAX_VALUE) {
                            long a2 = ch.a().a();
                            if (j == Long.MAX_VALUE) {
                                j = f83798c + a2;
                            }
                            long j2 = j - a2;
                            if (j2 <= 0) {
                                _thread = null;
                                l();
                                if (!c()) {
                                    a();
                                }
                                return;
                            }
                            b2 = RangesKt.coerceAtMost(b2, j2);
                        } else {
                            b2 = RangesKt.coerceAtMost(b2, f83798c);
                        }
                    }
                    if (b2 > 0) {
                        if (i()) {
                            _thread = null;
                            l();
                            if (!c()) {
                                a();
                            }
                            return;
                        }
                        ch.a().a(this, b2);
                    }
                }
            }
        } finally {
            _thread = null;
            l();
            if (!c()) {
                a();
            }
        }
    }
}
